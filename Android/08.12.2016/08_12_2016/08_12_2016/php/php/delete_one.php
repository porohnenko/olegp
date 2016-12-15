<?php
 
$response = array();
 
if (isset($_POST["sname"])) {
    $sn = $_POST["sname"];
 
    require 'db_connect.php';
 
    $db = new DB_CONNECT();
 
    $result = mysql_query("DELETE FROM PERSON WHERE SNAME = $sn");
    if (mysql_affected_rows() > 0) {
        $response["success"] = 1;
        $response["message"] = "Person successfully deleted";
 
        echo json_encode($response);
    } else {
        $response["success"] = 0;
        $response["message"] = "No person found";
 
        echo json_encode($response);
    }
} else {
    $response["success"] = 0;
    $response["message"] = "Required field is missing";
 
    echo json_encode($response);
}
?>