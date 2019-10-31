function CarAdvertRequest() {
    var image = document.getElementById("image").value;
    var advertTitle = document.getElementById('advertTitle').value;
    var price = document.getElementById("price").value;
    var make = document.getElementById('make').value;
    var model = document.getElementById('model').value;
    var modelVariant = document.getElementById('modelVariant').value;
    var modelYear = document.getElementById('modelYear').value;
    var mileage = document.getElementById('mileage').value;
    var colour = document.getElementById('colour').value;
    var enginesize = document.getElementById('engineSize').value;
    var gearbox = document.getElementById('gearbox').value;
    var doors = document.getElementById('doors').value;
    var advertDescription = document.getElementById('advertDescription').value;

    var carAdvert = new Object();
    carAdvert.advertid = "";
    carAdvert.username = "dwdwd";
    carAdvert.image = image;
    carAdvert.advertdescription = advertDescription;
    carAdvert.price = price;
    carAdvert.make = make;
    carAdvert.model = model;
    carAdvert.modelvariant = modelVariant;
    carAdvert.modelyear = modelYear;
    carAdvert.mileage = mileage;
    carAdvert.colour = colour;
    carAdvert.enginesize = enginesize;
    carAdvert.gearbox = gearbox;
    carAdvert.doors = doors;
    carAdvert.adverttitle = advertTitle;

    var carAdvertJSON = JSON.stringify(carAdvert);
    
    alert("Your advert has been created");
    window.location = window.location;
    $.ajax({
        type : "POST",
        url : "/CarAdvert/saveCarAdvertDetails",
        contentType : "application/json",
        data : carAdvertJSON,
        success : function(data) {
            console.log(data);
        },
        error : function(data) {
            console.log(data);
        },
        dataType : 'json'
    });
 
}