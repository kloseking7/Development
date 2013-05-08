<?php
if (isset($_POST['time']) && !empty($_POST['time']) &&
    isset($_POST['id']) && !empty($_POST['id'])) {
    $paathtime = $_POST['time'];
    $paathid = $_POST['id'];
    $paathpage = Paathpage::model()->find('paathid=:paath_id AND starttimesec <=:time AND endtimesec >=:time',
            array(
                'paath_id'=>$paathid,
                'time'=>$paathtime,
            ));
    echo $paathpage->pagenum;   
}

?>
