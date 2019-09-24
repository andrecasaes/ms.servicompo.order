
function showModal(){
  $("#loadMe").modal({
    backdrop: "static", 
    keyboard: false, 
    show: true 
  });
}

function hideModal(){  
  $("#loadMe").modal("hide");
}



function getOrders(seachType, searchValue) {

    searchValue = searchValue.replace("/", "");
    var url = "http://ms-order.servicompo.com.br:8017/api/order/" + seachType.toLowerCase() + "/" + searchValue;
    showModal();
    $.ajax({
        method: "GET",
        url: url,
        cache: false,
        success: function(response){
          $("#dados").html(getHtmlBox(response))                                    
          
         
          

        },
        error: function(){
          alert("Erro ao realizar pesquisa, tente novamente...")
        },
        complete: function(){
          setTimeout(function(){
            $("#loadMe").modal("hide");
        }, 1000);
        }
      });        
}


function getHtmlBox(dados){
    return `
    <div class='row'> 
      <div class="col" >N. OS</div>
      <div class="col-10">${dados.numOS}</div>
    </div>
    
    <div class='row'>
    <div  class="col">N. Registro</div>
    <div  class="col-10">${dados.numeroRegistro}</div>
    </div>

    <div class='row'>
    <div  class="col">N. Série</div>
    <div  class="col-10">${dados.sn}</div>
    </div>
    
    
    <div class='row'>
      <div  class="col">Marca</div>
      <div  class="col-10">${dados.marca}</div>
    </div>
    
    <div class='row'>
      <div  class="col">Modelo</div>
      <div  class="col-10">${dados.modelo}</div>
    </div>


    <div class='row'>
      <div  class="col">Tipo</div>
      <div  class="col-10">${dados.tipo}</div>
    </div>


    <div class='row'>
      <div  class="col">Status</div>
      <div  class="col-10">${dados.ststr}</div>
    </div>  
    
    ` ;
}

