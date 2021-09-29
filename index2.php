<html>
    <head></head>
    <body> 
        <form action="" method="GET">
            <input type="text" name="liczba">
            <input type="submit" name="oblicz" value="Oblicz">
        </form>
        <?php
            function silnia($n){
                if($n==1){
                    return 1;
                }
                else{
                    return $n * silnia($n-1);
                }
            }
            if(isset($_GET['oblicz'])){
                $liczba = $_GET['liczba'];
                echo(silnia($liczba));
            }
        ?>
</body>
</html>