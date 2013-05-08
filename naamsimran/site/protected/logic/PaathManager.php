<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of PaathManager
 *
 * @author msushil
 */
class PaathManager {
	public function readPaath($id)	{
            return Paathscript::model()->findAll("paathid=:pid ORDER BY sort", array(':pid'=>$id));
	}
}

?>
