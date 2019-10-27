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

function request(){
        console.log("helloo");
        const Http = new XMLHttpRequest();
        const url='http://localhost:8080/CarAdvert/showCarAdvertDetails';
        Http.open("GET", url);
        Http.onreadystatechange = function(e){
        console.log("status"+Http.readyState);
        if (Http.readyState==4){
            data=JSON.parse(Http.responseText);
            var A=0;
            console.log("length:"+data.length);
            data.forEach(function(item){
                var box3 = document.getElementById("p3");
                var box1 = document.getElementById("p1");
                var box2 = document.getElementById("p2");
                
                var price=document.createElement("span");
                var make=document.createElement("span");
                var model=document.createElement("span");

                price.innerHTML= "Price:£" + item.price;	
		        make.innerHTML="Make: " + item.make;
	        	model.innerHTML="Model: " + item.model;
	        	
	        	box3.append(price);
                box2.append(make);
                box1.append(model);
                // price.append(item.price);
                // make.append(item.make);
                // model.append(item.model);
                A=A+1;
                console.log(A);
            });
        }
        }
        Http.send();
        }