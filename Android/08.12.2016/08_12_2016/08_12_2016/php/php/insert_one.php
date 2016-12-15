<?php
 
$response = array();
 
if (isset($_POST["fname"]) && isset($_POST["sname"]) && isset($_POST["age"]) && isset($_POST["salary"])) {
    $fn = $_POST["fname"];
	$sn = $_POST["sname"];
	$ag = $_POST["age"];
	$sl = $_POST["salary"];
 
    require 'db_connect.php';
 
    $db = new DB_CONNECT();
 
    $result = mysql_query("INSERT INTO PERSON VALUES($fn,$sn,$ag,$sl)");
    if ($result) {
        $response["success"] = 1;
        $response["message"] = "Person successfully inserted";
 
        echo json_encode($response);
    } else {
        $response["success"] = 0;
        $response["message"] = "Not inserted";
 
        echo json_encode($response);
    }
} else {
    $response["success"] = 0;
    $response["message"] = "Required field is missing";
 
    echo json_encode($response);
}
?>