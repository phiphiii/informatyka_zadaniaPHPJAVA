<?php
$imiona = array("Filip","Norbert","Kacper","Mateusz","Dawid Ś","Dawid Sz","Liza","Oskar","Adam","Magda","Martyna","Seweryn","Oliwier","Rafał","Kinga");
//for($i=0;$i<15;$i++){
//    echo $imiona[$i]."<br>";
//}
//echo "<br>";
//foreach ($imiona as $value) {
//    echo $value."<br>";
//}
//asort($imiona);
//while(list($klucz,$wartosc) = each($imiona)){
//    echo"$klucz=$wartosc"."<br>";
//}
rsort($imiona);
foreach ($imiona as $value) {
    echo $value."<br>";
}
?>