<?php
 
$response = array();
 
if (isset($_POST["objects"])) {
  $input_array = $_POST["objects"];
	
    require 'db_connect.php';
 
    $db = new DB_CONNECT();
    
     
    $persons_array = json_decode($input_array,true);
	$i=0;
	while($i<count($persons_array)){
	$fn = $persons_array[$i]["fname"];
	$sn = $persons_array[$i]["sname"];
	$ag = $persons_array[$i]["age"];
	$sl = $persons_array[$i]["salary"];
		
	  $result = mysql_query("INSERT INTO PERSON VALUES('$fn','$sn','$ag','$sl')");
	  $i=$i+1;			
	}
	
    if ($i==count($persons_array)) {
        $response["success"] = 1;
        $response["message"] = "Persons are successfully inserted";
 
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