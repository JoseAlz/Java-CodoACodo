var car = {type:"Fiat", model:"500", color:"white"};

document.getElementById("demo").innerHTML = "The car type is " + car.type;


var person = {
    firstName: "John",
    lastName : "Doe",
    id     : 5566,
    fullName : function() {
      return this.firstName + " " + this.lastName;
    }
};

document.getElementById("demo2").innerHTML = person.fullName();

document.getElementById("demo3").innerHTML = person.id;


function changeText(id) {
    id.innerHTML = "Ooops!";
}


function displayDate() {
    document.getElementById("demo4").innerHTML = Date();
}


function checkCookies() {
    var text = "";
    if (navigator.cookieEnabled == true) {
      text = "Cookies are enabled.";
    } else {
      text = "Cookies are not enabled.";
    }
    document.getElementById("demo5").innerHTML = text;
}

function myFunction() {
    var x = document.getElementById("fname");
    x.value = x.value.toUpperCase();
}

function mOver(obj) {
    obj.innerHTML = "Thank You"
}
  
  function mOut(obj) {
    obj.innerHTML = "Mouse Over Me"
}


function mDown(obj) {
    obj.style.backgroundColor = "green";
    obj.innerHTML = "Release Me";
}
  
function mUp(obj) {
    obj.style.backgroundColor="orange";
    obj.innerHTML="Thank You";
}

function myFunction() {
    var person = {fname:"John", lname:"Doe", age:25}; 
    
    var text = "";
    var x;
    for (x in person) {
      text += person[x] + "<br>";
    }
    document.getElementById("demo6").innerHTML = text;
}








