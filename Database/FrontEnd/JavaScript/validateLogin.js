function validateLoginForm(event) {
    event.preventDefault();

    const email = document.getElementById('username');
    const password = document.getElementById('password');
    const errorMessages = document.getElementById('errorMessages');

    errorMessages.innerHTML = '';

    // Validate email
    if (!validateEmail(username.value)) {
        errorMessages.innerHTML += '<p>Please enter a valid username.</p>';
        return;
    }

    // Validate password
    if (!validatePassword(password.value)) {
        errorMessages.innerHTML += '<p>Please enter a valid password.</p>';
        return;
    }

    // If all validations pass, submit the form
    alert('Login successful!');
}

