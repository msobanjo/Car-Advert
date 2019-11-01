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
        url : "http://"+location.host+":9001/CarSeller/saveCarSellerDetails",
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
        url: "http://"+location.host+":9001/CarAdvert/deleteCarAdvert/" + advertId,
        type: 'DELETE',
        success: function(result) {
          // can do something with the result 
        }
    });
  }





