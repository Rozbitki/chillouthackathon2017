$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/api/disciplines"
    }).then(function(data) {
       $('.panel-body').append(data);
    });
});