const loginForm = document.getElementById('loginForm');
loginForm.addEventListener('submit', validateLoginForm);

function validateEmail(username) {
    // Use a regular expression to check if the email is valid
    const emailRegex = /^[0-9]+;
    return emailRegex.test(username);
}

function validatePassword(password) {
    // Customize these rules to match your password requirements
    const minLength = 8;
    const hasUpperCase = /[A-Z]/.test(password);
    const hasLowerCase = /[a-z]/.test(password);
    const hasNumber = /\d/.test(password);

    return (
        password.length >= minLength &&
        hasUpperCase &&
        hasLowerCase &&
        hasNumber
    );
}
