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
        url : "http://"+location.hostname+":9001/CarSeller/saveCarSellerDetails",
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
    alert("Advert has been deleted");
    window.location = window.location;
    $.ajax({
        url: "http://"+location.hostname+":9001/CarAdvert/deleteCarAdvert/" + advertId,
        type: 'DELETE',
        success: function(result) {
          // can do something with the result 
        }
    });
  }

  var gAdvertId;
	 
	function setAdvertid(advertId) {
		console.log(advertId );
		gAdvertId = advertId;
	}
	
	function updateAdvert(count) {
	    var image = document.getElementById("updateImage" + count).value;
	    var advertTitle = document.getElementById('updateAdvertTitle' + count).value;
	    var price = document.getElementById("updatePrice" + count).value;
	    var make = document.getElementById('updateMake' + count).value;
	    var model1 = document.getElementById('updatemodel' + count).value;
	    var modelVariant = document.getElementById('updateModelVariant' + count).value;
	    var modelYear = document.getElementById('updateModelYear' + count).value;
	    var mileage = document.getElementById('updateMileage' + count).value;
	    var colour = document.getElementById('updateColour' + count).value;
	    var engineSize = document.getElementById('updateEngineSize' + count).value;
	    var gearbox = document.getElementById('updateGearbox' + count).value;
	    var doors = document.getElementById('updateDoors' + count).value;
	    var advertDescription = document.getElementById('updateImageDetails' + count).value;
	  
        
	    var carAdvert = new Object();
	    carAdvert.advertid = gAdvertId;
	    carAdvert.username = "dwdwd";
	    carAdvert.image = image;
	    carAdvert.advertdescription = advertDescription;
	    carAdvert.price = price;
	    carAdvert.make = make;
	    carAdvert.model = model1;
	    carAdvert.modelvariant = modelVariant;
	    carAdvert.modelyear = modelYear;
	    carAdvert.mileage = mileage;
	    carAdvert.colour = colour;
	    carAdvert.enginesize = engineSize;
	    carAdvert.gearbox = gearbox;
	    carAdvert.doors = doors;
	    carAdvert.adverttitle = advertTitle;

	    var carAdvertJSON = JSON.stringify(carAdvert);
	    
	   alert("Your advert has been updated");
	    window.location = window.location;
	    $.ajax({
	        type : "PUT",
	        url : "http://"+location.hostname+":9001/CarAdvert/updateCarAdvert",
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




