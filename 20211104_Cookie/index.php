<?php
    //$cookie_name = "user";
    //$cookie_value = "Filip Pietrzak";
    $cookie_wys = "Wyświetlenia";
    $cookie_value = 0;
    setcookie($cookie_wys, $cookie_value, time() + (86400), "/");
    setcookie($cookie_wys_tym, $cookie_value_tym, time() + (1), "/");
?>
<html>
    <body>

        <?php
            if(!isset($_COOKIE[$cookie_wys])) {
                echo "0 Wyświetleń";
            } 
            else {
                $cookie_value = $cookie_value_tym + 1;
                echo "Liczba wejść na strone: ".$cookie_value;
            }
?>

</body>
</html>