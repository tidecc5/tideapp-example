package com.tidecc.mybatis.cloud.titleDic;

import com.tidecc.mybatis.repository.IdEntity;

/**
 * 抬头实体
 * 
 * @author tidecc
 *
 */
public class TitleEntity extends IdEntity {
	
	String titleName;
	String titleCode;
	int decimalPlace;
	int offsetPlace;
	String currencyID;
	
	
	
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTitleCode() {
		return titleCode;
	}
	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}
	public int getDecimalPlace() {
		return decimalPlace;
	}
	public void setDecimalPlace(int decimalPlace) {
		this.decimalPlace = decimalPlace;
	}
	public int getOffsetPlace() {
		return offsetPlace;
	}
	public void setOffsetPlace(int offsetPlace) {
		this.offsetPlace = offsetPlace;
	}
	public String getCurrencyID() {
		return currencyID;
	}
	public void setCurrencyID(String currencyID) {
		this.currencyID = currencyID;
	}
	
	
	

}
