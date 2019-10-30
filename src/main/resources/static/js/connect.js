//function request(){
//    console.log("helloo");
//    const Http = new XMLHttpRequest();
//    const url='http://localhost:8080/CarAdvert/showCarAdvertDetails';
//    Http.open("GET", url);
//    Http.onreadystatechange = function(e){
//        data=JSON.parse(Http.responseText);
//        data.forEach(function(item){
////            var text = document.getElementById("test");
////            text.append(item.firstname);	
////            text.append(" ");
//        	var price = document.getElementById("p3");
//        	var make = document.getElementById("p1");
//        	var model = document.getElementById("p2");
//        	
//        	price.append(item.price);
//        	make.append(item.make);
//        	model.append(item.model);
//        });
//    }
//    Http.send();
//    }

//function request(){
//        console.log("helloo");
//        const Http = new XMLHttpRequest();
//        const url='http://localhost:8080/CarAdvert/showCarAdvertDetails';
//        Http.open("GET", url);
//        Http.onreadystatechange = function(e){
//        console.log("status"+Http.readyState);
//        if (Http.readyState==4){
//            data=JSON.parse(Http.responseText);
//            var A=0;
//            console.log("length:"+data.length);
//            data.forEach(function(item){
//                var box3 = document.getElementById("p3");
//                var box1 = document.getElementById("p1");
//                var box2 = document.getElementById("p2");
//                
//                var price=document.createElement("span");
//                var make=document.createElement("span");
//                var model=document.createElement("span");
//
//                price.innerHTML= "Price:£" + item.price;	
//		        make.innerHTML="Make: " + item.make;
//	        	model.innerHTML="Model: " + item.model;
//	        	
//	        	box3.append(price);
//                box2.append(make);
//                box1.append(model);
//                // price.append(item.price);
//                // make.append(item.make);
//                // model.append(item.model);
//                A=A+1;
//                console.log(A);
//            });
//        }
//        }
//        Http.send();
//        }

function registrationRequest() {
    var username = document.getElementById("username").value;
    var email = document.getElementById('email').value;
    var firstName = document.getElementById('firstName').value;
    var lastName = document.getElementById('lastName').value;
    var password = document.getElementById('pass').value;
    var phoneNumber = document.getElementById('phoneNumber').value;

    var register = new Object();
    register.username = username;
    register.emailaddress = email;
    register.firstname = firstName;
    register.lastname = lastName;
    register.pswd = password;
    register.phonenumber = phoneNumber;

    var registerJSON = JSON.stringify(register);
    
    alert("Your account has been created");
    window.location = window.location;
    $.ajax({
        type : "POST",
        url : "http://localhost:8080/CarSeller/saveCarSellerDetails",
        contentType : "application/json",
        data : registerJSON,
        success : function(data) {
            console.log(data);
        },
        error : function(data) {
            console.log(data);
        },
        dataType : 'json'
    });
 
}

function deleteAdvert(advertId){
	console.log(advertId);
    alert("Advert has been deleted");
    window.location = window.location;
    $.ajax({
        url: "http://localhost:8080/CarAdvert/deleteCarAdvert/" + advertId,
        type: 'DELETE',
        success: function(result) {
          // can do something with the result 
        }
    });
  }

var rAdvertID = "test";

function setAdvertid(advertId){
	
	rAdvertID = advertId;
	console.log(rAdvertID + "test");
}
console.log(rAdvertID);

function updateAdvert() {
    var image = document.getElementById("updateImage").value;
    var advertTitle = document.getElementById('updateAdvertTitle').value;
    var price = document.getElementById("updatePrice").value;
    var make = document.getElementById('updateMake').value;
    var model = document.getElementById('updateModel').value;
    var modelVariant = document.getElementById('updateModelVariant').value;
    var modelYear = document.getElementById('updateModelYear').value;
    var mileage = document.getElementById('updateMileage').value;
    var colour = document.getElementById('updateColour').value;
    var engineSize = document.getElementById('updateEngineSize').value;
    var gearbox = document.getElementById('updateGearbox').value;
    var doors = document.getElementById('updateDoors').value;
    var advertDescription = document.getElementById('updateImageDetails').value;

    //var advertId = document.getElementById("updateDiv");
    console.log(rAdvertID + "new");

//    var carAdvert = new Object();
//    carAdvert.advertid = advertId;
//    carAdvert.username = "dwdwd";
//    carAdvert.image = image;
//    carAdvert.advertdescription = advertDescription;
//    carAdvert.price = price;
//    carAdvert.make = make;
//    carAdvert.model = model;
//    carAdvert.modelvariant = modelVariant;
//    carAdvert.modelyear = modelYear;
//    carAdvert.mileage = mileage;
//    carAdvert.colour = colour;
//    carAdvert.engineSize = engineSize;
//    carAdvert.gearbox = gearbox;
//    carAdvert.doors = doors;
//    carAdvert.adverttitle = advertTitle;
//
//    var carAdvertJSON = JSON.stringify(carAdvert);
//    
//   // alert("Your advert has been updated");
//   // window.location = window.location;
//    $.ajax({
//        type : "PUT",
//        url : "http://localhost:8080/CarAdvert/updateCarAdvert",
//        contentType : "application/json",
//        data : carAdvertJSON,
//        success : function(data) {
//            console.log(data);
//        },
//        error : function(data) {
//            console.log(data);
//        },
//        dataType : 'json'
//    });
 
}


