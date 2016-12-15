<?php
 
$response = array();
 
require 'db_connect.php';
 
$db = new DB_CONNECT(); 
if (isset($_POST["sname"])) {
    $sn = $_POST["sname"];

    $result = mysql_query("SELECT * FROM PERSON WHERE SNAME=$sn");
	 if (!empty($result)) {
        if (mysql_num_rows($result) > 0) {
 
            $result = mysql_fetch_array($result);
            $psn = array();
            $psn["fname"] = $result["fname"];
			$psn["sname"] = $result["sname"];
			$psn["age"] = $result["age"];
			$psn["salary"] = $result["salary"];
            $response["success"] = 1;
 
            $response["persons"] = array();
 
            array_push($response["persons"], $psn);
 
            echo json_encode($response);
        } else {
            $response["success"] = 0;
            $response["message"] = "No person found";
 
            echo json_encode($response);
        }
    
}
else {
            $response["success"] = 0;
            $response["message"] = "No person found";
 
            echo json_encode($response);
        }
}
else {
	
	$response["success"] = 0;
    $response["message"] = "Not correct query";
 
    echo json_encode($response);
}	


?>