
const Bic = () => {
    return (
        <div>
        <div class="container">
        <div class=" row  ">
            <div class="col ">
            <label for="bicId" class="form-label" >BIC number</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" id="bicId" aria-describedby="bicId" placeholder="enter bic number" />
            </div>
            <div class="col ">
            <div id="bicId" class="form-text">Enter bic id.</div>
            </div>
        </div>
        </div>

    )

}

export default Bic;