var attempt = 10;

function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var correctUsername = "admin";
    var correctPassword = "admin";

    if (username === correctUsername && password === correctPassword) {
        alert("Login successfully");
        window.location = "menu_admin.html";
        return false;
    } else {
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
    document.getElementById("submit").disabled = true;
}