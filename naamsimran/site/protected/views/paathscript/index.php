<script src="../../assets/booklet/jquery-1.5.min.js" type="text/javascript"></script>
<script src="../../assets/jqueryui/js/jquery-ui-1.8.14.custom.min.js" type="text/javascript"></script>
<script src="../../assets/booklet/jquery.easing.1.3.js" type="text/javascript"></script>
<script src="../../assets/booklet/jquery.booklet.1.2.0.min.js" type="text/javascript"></script>
<script src="../../assets/jplayer/jquery.jplayer.min.js" type="text/javascript"></script>
<link href="../../assets/booklet/jquery.booklet.1.2.0.css" type="text/css" rel="stylesheet" media="screen, projection, tv" />
<link href="../../assets/jplayer/skins/bluemonday/jplayer.blue.monday.css" rel="stylesheet" type="text/css" />
<?php
//load the paath model based on id.
$paath=Paath::model()->find('id=:id', array(':id'=>$_GET['id']));
$this->breadcrumbs=array(
	$paath->paathname,
);?>
<h1>
<?php 
echo $paath->paathname." (".$paath->paathnamegurmukhi.")";
?>
</h1>
<div style="width:420px; margin:0px auto;">
  <div id="jquery_jplayer_1" class="jp-jplayer"></div>
  <div class="jp-audio">
    <div class="jp-type-single">
      <div id="jp_interface_1" class="jp-interface">
        <ul class="jp-controls">
          <li><a href="#" class="jp-play" tabindex="1">play</a></li>
          <li><a href="#" class="jp-pause" tabindex="1">pause</a></li>
          <li><a href="#" class="jp-stop" tabindex="1">stop</a></li>
          <li><a href="#" class="jp-mute" tabindex="1">mute</a></li>
          <li><a href="#" class="jp-unmute" tabindex="1">unmute</a></li>
        </ul>
        <div class="jp-progress">
          <div class="jp-seek-bar">
            <div class="jp-play-bar"></div>
          </div>
        </div>
        <div class="jp-volume-bar">
          <div class="jp-volume-bar-value"></div>
        </div>
        <div class="jp-current-time"></div>
        <div class="jp-duration"></div>
      </div>
      <div id="jp_playlist_1" class="jp-playlist">
      </div>
      <input type="hidden" value="<?php echo $paath->paathaudiolink; ?>" id="paathaudiolink"></input>
      <input type="hidden" value="<?php echo $_GET['id'] ?>" id="paathid"></input>      
    </div>
  </div>
</div>
<br/>
<div id="paath" style="border:solid 1px gray;">
    <div class="b-load">
        <?php
        $pagesize = Yii::app()->config->get("pagesize");
        $pageitemscount = 0;
        $script = new PaathScript();
        $paathData = new PaathManager();
        $scriptList = $paathData->readPaath($_GET['id']);
        $scriptCounter = 0;      
        //iterate through the entire script for the paath.
        while ($scriptCounter < count($scriptList)) { 
            //print gurmukhi
            $pageitemscount = 0;
            echo "<div title=\"".Section::model()->findByPk(1/*$scriptList[$scriptCounter]->sectionid*/)->sectionname."\">";
            for ($i=$scriptCounter;$i<count($scriptList);$i++){
                $script = $scriptList[$i];    
                $pageitemscount = $pageitemscount + 1;              
                if ($pageitemscount > $pagesize) {
                    break;
                }
                
                echo "<div style=\"height:".Yii::app()->config->get("scriptcontainerheight")."px;\">";
                echo $script->gurmukhi."<br/>";
                echo $script->phonetic."<br/>";
                echo "</div>";
            }
            echo "</div>\n\n";
            
            //print translations
            $pageitemscount = 0;
            echo "<div>";
            for ($i=$scriptCounter;$i<count($scriptList);$i++){
                $script = $scriptList[$i];            
                $pageitemscount = $pageitemscount + 1;
                if ($pageitemscount > $pagesize) {
                    break;
                }
                
                echo "<div style=\"height:".Yii::app()->config->get("scriptcontainerheight")."px;\">";
                echo $script->engtranslation."<br/><br/>";
                echo "</div>";
            }
            echo "</div>";
            
            $scriptCounter = $i;
        }
        
        echo "</div> \n";
        ?>
    </div>
</div>
<script>
$(function() {   
    $("#paath").booklet({
        width:800,
        height:550,
        arrows:true
    });
});

$(document).ready(function(){
    var pageNum = 0;
    var currentPage = 0;
    
    $("#jquery_jplayer_1").jPlayer({
        ready: function () {
          $(this).jPlayer("setMedia", {
            mp3: $("#paathaudiolink").val()
          });
        },
        swfPath: "/js",
        supplied: "mp3"
    });
    
    $("#jquery_jplayer_1").bind($.jPlayer.event.timeupdate, function(event) { // Add a listener to report the time play began
        $.post("paathscriptpagenum", { id: $("#paathid").val(), time: event.jPlayer.status.currentTime }, function(data){
            pageNum = data - 1;
            if (currentPage != pageNum) {
                currentPage = pageNum;   
                $("#paath").booklet(parseInt(pageNum));
            }
        });
    });
    
    
});
</script>
