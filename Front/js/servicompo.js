function getOrders(seachType, searchValue) {
    searchValue = searchValue.replace("/", "");
    var url = "http://localhost:8080/api/order/" + seachType.toLowerCase() + "/" + searchValue;
    $.ajax({
        method: "GET",
        url: url,
        })
        .done(function (response) {
            $("#dados").html(getHtmlBox(response))
            console.log(response)
        })
        .fail(function (request, error) {
            console.log(error);
        })
        .always(function () {
            console.log("complete");
        });;
}


function getHtmlBox(dados){
    return `
    <div> 
      <div>N. OS</div>
      <div>${dados.numOS}</div>
    </div>
    
    <div> 
    <div>N. Registro</div>
    <div>${dados.numeroRegistro}</div>
    </div>

    <div> 
    <div>N. Série</div>
    <div>${dados.sn}</div>
    </div>
    
    
    <div> 
      <div>Marca</div>
      <div>${dados.marca}</div>
    </div>
    
    <div> 
      <div>Modelo</div>
      <div>${dados.modelo}</div>
    </div>


    <div> 
      <div>Tipo</div>
      <div>${dados.tipo}</div>
    </div>


    <div> 
      <div>Status</div>
      <div>${dados.ststr}</div>
    </div>

    
    
    ` ;
}