<?php

class PaathController extends Controller
{
	public function actionIndex()
	{
		$this->render('index');
	}

	public function actionPaathInfo()
	{
		$this->renderPartial('paathinfo');
	}
        // Uncomment the following methods and override them if needed
	/*
	public function filters()
	{
		// return the filter configuration for this controller, e.g.:
		return array(
			'inlineFilterName',
			array(
				'class'=>'path.to.FilterClass',
				'propertyName'=>'propertyValue',
			),
		);
	}
         * 
         */
}