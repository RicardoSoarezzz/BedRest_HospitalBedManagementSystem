var attempt = 10;

function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var adminUsername = "admin";
    var adminPassword = "admin";
    var managerUsername = "manager";
    var managerPassword = "manager";
    var supportUsername = "support";
    var supportPassword = "support";
    var baseUsername = "base";
    var basePassword = "base";


    if (username === adminUsername && password === adminPassword) {
        alert("Login successfully");
        window.location = "menu_admin.html";
        return false;
    } else if(username === managerUsername && password === managerPassword){
        alert("Login successfully");
        window.location = "gestao.html";
        return false;
    }else if(username === supportUsername && password === supportPassword){
             alert("Login successfully");
             window.location = "manutencao.html";
             return false;
    }else if(username === baseUsername && password === basePassword){
             alert("Login successfully");
             window.location = "basico.html";
             return false;
    }else {

        attempt--;
        if (attempt > 0) {
            alert("Incorrect credentials. You have " + attempt + " attempt(s) left.");
        } else {
            alert("You have exceeded the maximum number of attempts. Your account is now locked.");
            disableForm();
        }
        return false;
    }
}

function disableForm() {
    document.getElementById("username").disabled = true;
    document.getElementById("password").disabled = true;
    document.getElementById("submitButton").disabled = true;
}