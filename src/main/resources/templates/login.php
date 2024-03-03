<?php
// Establish connection to MySQL database
$servername = "LAPTOP-JC\JC_SQLEXPRESS, 1434";
$username = "your_username";
$password = "your_password";
$dbname = "QS_Gestao_Camas";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Get the values from the login form
$username = $_POST['username'];
$password = $_POST['password'];

// SQL query to check if the username and password exist in the database
$sql = "SELECT U_IT_id FROM User WHERE U_badge='$username' AND U_password='$password'";
$result = $conn->query($sql);

// Check if there is a row with the given username and password
if ($result->num_rows > 0) {
    // Fetch user type
    $row = $result->fetch_assoc();
    $userType = $row['U_UT_id'];

    // Redirect based on user type
    switch ($userType) {
        case "admin":
            echo "admin";
            break;
        case "manager":
            echo "gestao";
            break;
        case "support":
            echo "manutencao";
            break;
        case "base":
            echo "basico";
            break;
    }
} else {
    // No matching credentials found
    echo "invalid";
}

$conn->close();
?>
