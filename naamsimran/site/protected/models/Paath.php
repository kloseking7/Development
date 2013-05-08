<?php

/**
 * This is the model class for table "paath".
 *
 * The followings are the available columns in table 'paath':
 * @property integer $id
 * @property string $paathname
 * @property string $paathdesc
 * @property string $paathnamegurmukhi
 * @property string $paathaudiolink
 * @property string $paathdownloadlink
 *
 * The followings are the available model relations:
 * @property Paathpage[] $paathpages
 * @property Paathscript[] $paathscripts
 */
class Paath extends CActiveRecord
{
	/**
	 * Returns the static model of the specified AR class.
	 * @return Paath the static model class
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
		return 'paath';
	}

	/**
	 * @return array validation rules for model attributes.
	 */
	public function rules()
	{
		// NOTE: you should only define rules for those attributes that
		// will receive user inputs.
		return array(
			array('paathname', 'required'),
			array('paathname, paathnamegurmukhi', 'length', 'max'=>256),
			array('paathdesc, paathaudiolink, paathdownloadlink', 'length', 'max'=>512),
			// The following rule is used by search().
			// Please remove those attributes that should not be searched.
			array('id, paathname, paathdesc, paathnamegurmukhi, paathaudiolink, paathdownloadlink', 'safe', 'on'=>'search'),
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
			'paathpages' => array(self::HAS_MANY, 'Paathpage', 'paathid'),
			'paathscripts' => array(self::HAS_MANY, 'Paathscript', 'paathid'),
		);
	}

	/**
	 * @return array customized attribute labels (name=>label)
	 */
	public function attributeLabels()
	{
		return array(
			'id' => 'ID',
			'paathname' => 'Paathname',
			'paathdesc' => 'Paathdesc',
			'paathnamegurmukhi' => 'Paathnamegurmukhi',
			'paathaudiolink' => 'Paathaudiolink',
			'paathdownloadlink' => 'Paathdownloadlink',
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
		$criteria->compare('paathname',$this->paathname,true);
		$criteria->compare('paathdesc',$this->paathdesc,true);
		$criteria->compare('paathnamegurmukhi',$this->paathnamegurmukhi,true);
		$criteria->compare('paathaudiolink',$this->paathaudiolink,true);
		$criteria->compare('paathdownloadlink',$this->paathdownloadlink,true);

		return new CActiveDataProvider($this, array(
			'criteria'=>$criteria,
		));
	}
}