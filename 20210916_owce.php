<?php
$owoce=array("d"=>"mango","a"=>"papaja","b"=>"banan","c"=>"aronia");
asort($owoce);
while(list($klucz,$wartosc) = each($owoce)){
    echo"$klucz=$wartosc"." ";
}
echo"<br>";
arsort($owoce);
while(list($klucz,$wartosc) = each($owoce)){
    echo"$klucz=$wartosc"." ";
}