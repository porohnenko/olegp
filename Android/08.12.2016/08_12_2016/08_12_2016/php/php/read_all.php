<?php
 
$response = array();
 
require 'db_connect.php';
 
$db = new DB_CONNECT();
 
$result = mysql_query("SELECT * FROM PERSON") or die(mysql_error());
 
if (mysql_num_rows($result) > 0) {
    $response["persons"] = array();
 
    while ($row = mysql_fetch_array($result)) {
        $psn = array();
        $psn["fname"] = $row["fname"];
		$psn["sname"] = $row["sname"];
		$psn["age"] = $row["age"];
		$psn["salary"] = $row["salary"];
 
        array_push($response["persons"], $psn);
    }
    $response["success"] = 1;
 
    echo json_encode($response);
} else {
    $response["success"] = 0;
    $response["message"] = "No persons found";
 
    echo json_encode($response);
}
?>