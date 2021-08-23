
import './App.css';
import AccountHolder from './components/sender/AccountHolder';
import CustomerId from './components/sender/CustomerId';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <CustomerId/>
        <AccountHolder/> 
      </header>
    </div>
  );
}

export default App;
