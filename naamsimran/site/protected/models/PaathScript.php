<?php

/**
 * This is the model class for table "paathscript".
 *
 * The followings are the available columns in table 'paathscript':
 * @property integer $id
 * @property integer $paathid
 * @property integer $sort
 * @property string $gurmukhi
 * @property string $phonetic
 * @property string $engtranslation
 * @property integer $sectionid
 */
class PaathScript extends CActiveRecord
{
	/**
	 * Returns the static model of the specified AR class.
	 * @return PaathScript the static model class
	 */
	public static function model($className=__CLASS__)
	{
		return parent::model($className);
	}

	/**
	 * @return string the associated database table name
	 */
	public function tableName()
	{
		return 'paathscript';
	}

	/**
	 * @return array validation rules for model attributes.
	 */
	public function rules()
	{
		// NOTE: you should only define rules for those attributes that
		// will receive user inputs.
		return array(
			array('paathid, sort, gurmukhi, phonetic, engtranslation, sectionid', 'required'),
			array('paathid, sort, sectionid', 'numerical', 'integerOnly'=>true),
			array('gurmukhi, phonetic', 'length', 'max'=>1024),
			array('engtranslation', 'length', 'max'=>2048),
			// The following rule is used by search().
			// Please remove those attributes that should not be searched.
			array('id, paathid, sort, gurmukhi, phonetic, engtranslation, sectionid', 'safe', 'on'=>'search'),
		);
	}

	/**
	 * @return array relational rules.
	 */
	public function relations()
	{
		// NOTE: you may need to adjust the relation name and the related
		// class name for the relations automatically generated below.
		return array(
		);
	}

	/**
	 * @return array customized attribute labels (name=>label)
	 */
	public function attributeLabels()
	{
		return array(
			'id' => 'ID',
			'paathid' => 'Paathid',
			'sort' => 'Sort',
			'gurmukhi' => 'Gurmukhi',
			'phonetic' => 'Phonetic',
			'engtranslation' => 'Engtranslation',
			'sectionid' => 'Sectionid',
		);
	}

	/**
	 * Retrieves a list of models based on the current search/filter conditions.
	 * @return CActiveDataProvider the data provider that can return the models based on the search/filter conditions.
	 */
	public function search()
	{
		// Warning: Please modify the following code to remove attributes that
		// should not be searched.

		$criteria=new CDbCriteria;

		$criteria->compare('id',$this->id);
		$criteria->compare('paathid',$this->paathid);
		$criteria->compare('sort',$this->sort);
		$criteria->compare('gurmukhi',$this->gurmukhi,true);
		$criteria->compare('phonetic',$this->phonetic,true);
		$criteria->compare('engtranslation',$this->engtranslation,true);
		$criteria->compare('sectionid',$this->sectionid);

		return new CActiveDataProvider($this, array(
			'criteria'=>$criteria,
		));
	}
}