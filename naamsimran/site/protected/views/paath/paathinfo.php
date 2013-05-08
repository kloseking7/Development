<script type="text/javascript">
    function closePopup() {
        $("#rightpane").toggle("slide", {}, 1000);   
    }
</script>
<?php
if(isset($_POST['id']) && !empty($_POST['id'])) {
    $paathid = $_POST['id'];
    $paath = Paath::model()->findByPk($paathid);
    echo "<div style='padding: 5px; text-align:right;'><a href=\"#\" onclick=\"closePopup();\"><img src='..\\..\\images\\close.png'></img></a></div>";
    echo "<b>".$paath->paathname."</b><br/><br/>";
    echo $paath->paathdesc;
}
?>
