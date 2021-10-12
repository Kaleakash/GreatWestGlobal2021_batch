function validate() {
    // alert("fun called...")
    // return true;
    var user = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;
    if(user.length==0){
       // alert("User Name is required")
       //document.write("User Name is required")
       document.getElementById("e1").innerHTML="UserName is required"
       document.getElementById("e2").innerHTML=""
        return false;
    }else if(pass.length==0){
        //alert("Password is required")
        document.getElementById("e1").innerHTML=""
        document.getElementById("e2").innerHTML="Password is required"
        return false;
    }else {
        return true;
    }
}