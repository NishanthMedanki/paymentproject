package com.dbs.payment.restapi;
 
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbs.payment.beans.Bank;
import com.dbs.payment.beans.Customer;
import com.dbs.payment.beans.Logger;
import com.dbs.payment.beans.Transaction;
import com.dbs.payment.response.BicResponse;
import com.dbs.payment.response.CustomerResponse;
import com.dbs.payment.response.ResponsePage;
import com.dbs.payment.service.BICService;
import com.dbs.payment.service.CustomerService;
import com.dbs.payment.service.LoggerService;
import com.dbs.payment.service.TransactionService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class RestController {

	@Autowired 
	private TransactionService transservice;
	@Autowired
	private CustomerService custservice;
	@Autowired
	private BICService bicservice;
	@Autowired
	private LoggerService loggerservice;
	
	@PostMapping("/transaction")
	public ResponseEntity<ResponsePage> insertTransaction(@RequestBody Transaction transaction)
	{
		try {
			this.transservice.addTransaction(transaction);
			double x = transaction.getCurrencyamount()+transaction.getTransferfees();
			Customer cust = transaction.getCustomer();
			double y = cust.getCleabalance()-x;
			cust.setCleabalance(y);
			 long millis=System.currentTimeMillis();  
		     java.sql.Date date=new java.sql.Date(millis);   
			transaction.setTransferdate(date);
			
			this.custservice.updateCustomer(cust);
			return ResponseEntity.status(HttpStatus.CREATED).body(new ResponsePage(201, "Transaction inserted"));
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponsePage(400, e.getMessage()));
		}
	}
	
//	@GetMapping("/message")
	
	
	@GetMapping("/customer/{custid}")
	public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String custid)
	{
		//try {
			Customer customer = this.custservice.findCustomer(custid);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(new CustomerResponse(customer));
			
		//}
//		catch(Exception e )
//		{
//			Customer customer;
//			return ResponseEntity.status(HttpStatus.ACCEPTED).body(new CustomerResponse(customer));
//
//			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponsePage(400, e.getMessage()));
//		}
	}

//	@GetMapping("/customer")
//	public ResponseEntity<ResponsePage> getAllCustomer()
//	{
//		try {
//			List <Customer> customer = this.custservice.findAllCustomers();
//			return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponsePage(200, customer));
//			
//		}
//		catch(Exception e )
//		{
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponsePage(400, e.getMessage()));
//		}
//	}

	@GetMapping("/bic/{bicid}")
	public ResponseEntity<BicResponse> getBIC(@PathVariable String bicid)
	{
		//try {
			Bank bic = this.bicservice.findBIC(bicid);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(new BicResponse(bic));
//		}
//		catch(Exception e )
//		{
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponsePage(400, e.getMessage()));
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponsePage(200, "Status Updated"));
	}
	
	@PostMapping("/logger")
	public ResponseEntity<ResponsePage> insertLogger(
			@RequestBody Logger logger)
	{
		try {
			this.loggerservice.addLogger(logger);
			return ResponseEntity.status(HttpStatus.CREATED).body(new ResponsePage(201, "Transaction inserted"));
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponsePage(400, e.getMessage()));
		}
	}
}
