function getOrders(seachType, searchValue) {
    searchValue = searchValue.replace("/", "");
    var url = "https://localhost:5001/api/orders/" + seachType + "/" + searchValue;
    $.ajax({
        method: "GET",
        url: url,
        })
        .done(function (response) {
            console.log(response)
        })
        .fail(function () {
            console.log("error");
        })
        .always(function () {
            console.log("complete");
        });;
}