<?php
$a = 5;
$b = "siema eniu";
$suma = 0;

echo $a."<br>".$b."<br><br>";

for($i=0;$i<100;$i++){
    $los = rand(1,100);
    if($los%2==0){
        $suma = $suma + $los;
    }
}
echo $suma;

?>