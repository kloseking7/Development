<script src="../../assets/2c7a2222/jquery.min.js" type="text/javascript"></script>
<script src="../../assets/jqueryui/js/jquery-ui-1.8.14.custom.min.js" type="text/javascript"></script>
<link href="../../assets/jqueryui/css/smoothness/jquery-ui-1.8.14.custom.css" type="text/css" rel="stylesheet" media="screen, projection, tv" />
<link href="../../themes/classic/views/paath/index.css" type="text/css" rel="stylesheet" media="screen, projection, tv" />
<script>
$(function() {
    $( "input:button" ).button();
    

});

$(document).ready(function(){
    $("div.paathrowdiv").mouseover(function(){
        $(this).css("background-color","#A9E2F3");
        $(this).css("border-right","solid 1px #81BEF7");
        $(this).css("border-bottom","solid 1px #81BEF7");
        $(this).css("border-top","solid 1px #81BEF7");
    $("#" + $(this).attr("id") + "arrowdiv").css("display", "block");
    });
    $("div.paathrowdiv").mouseout(function(){
        $(this).css("background-color","");
        $(this).css("border-right","solid 1px transparent");
        $(this).css("border-bottom","solid 1px cyan");
        $(this).css("border-top","");
        $("#" + $(this).attr("id") + "arrowdiv").css("display", "none");
    });

    $("div.paathrowdiv").click(function(){
        $.post("paathinfo", { id: $(this).attr("id") }, function(data){
        $("#rightpane").html(data);
        $("#rightpane").show("slide", {}, 1000);    
        });
    });
});

</script>
<?php
$paathTxt="";
$length = Yii::app()->config->get('paathrowlength');
$paathList=Paath::model()->findAll();
$this->breadcrumbs=array(
	'Select Paath',
);?>
<h1>Waheguru ji ka Khalsa, Waheguru ji ki Fateh.</h1>
<br/>
<h2>Please select paath.</h2>
<p>
    <div id="main">
        <div style="width:600px; margin: auto 0px; float:left;">
            <?php
            foreach ($paathList as $paath) {
                $paathTxt = substr($paath->paathdesc, 0, $length);
                //recite link
                echo "<div id=\"".$paath->id."\" class=\"paathrowdiv\">\n";
                echo "<div style='float: left; height:60px;'>";
                echo "<div class=\"paathiconimagediv\"><img class=\"paathiconimage\" src='..\..\images\icon.jpg';></img></div>\n";
                echo "<div class=\"paathrowtextdiv\">\n";
                echo "<b>".$paath->paathname." [".$paath->paathnamegurmukhi."]</b><br/>";
                echo "<small><input type=\"button\" class=\"button".$paath->id."\" ";
                echo "id=\"".strval($paath->id) . "\" ";
                echo "value=\"Recite ".$paath->paathname."\" ";
                echo "onclick=\"window.location.href='../paathscript/index?id=".$paath->id."';\"></small>";
                //download link
                echo "<small><input type=\"button\" value=\"Download\"/></small>";
                
                echo "<small><input type=\"button\" value=\"Download Audio\" onclick=\"window.location.href='".$paath->paathaudiolink."';\"/></small><br/>";
                echo $paathTxt."..........";
                echo "</div>";
                echo "</div>";
                echo "<div id=\"".$paath->id."arrowdiv\" style='display: none; float:right; padding-top: 15px;'><img src='..\\..\\images\\rightarrow.png'></img></div>";
                echo "</div>";
            }
            ?>
        </div>
        <div id="rightpane">
            
        </div>
    </div>
</p>
