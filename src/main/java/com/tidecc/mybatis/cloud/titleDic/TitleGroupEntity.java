package com.tidecc.mybatis.cloud.titleDic;

import java.sql.Timestamp;

/**
 * 抬头组实体
 * 
 * @author tidecc
 *
 */
public class TitleGroupEntity {
	String oid;
	String titleGroupName;
	String titleGroupCode;
	String belongDataType;
	String belongTimeType;
	String belongSortType;
	int isNative;
	Timestamp updateTime;
	
	
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getTitleGroupName() {
		return titleGroupName;
	}
	public void setTitleGroupName(String titleGroupName) {
		this.titleGroupName = titleGroupName;
	}
	public String getTitleGroupCode() {
		return titleGroupCode;
	}
	public void setTitleGroupCode(String titleGroupCode) {
		this.titleGroupCode = titleGroupCode;
	}
	public String getBelongDataType() {
		return belongDataType;
	}
	public void setBelongDataType(String belongDataType) {
		this.belongDataType = belongDataType;
	}
	public String getBelongTimeType() {
		return belongTimeType;
	}
	public void setBelongTimeType(String belongTimeType) {
		this.belongTimeType = belongTimeType;
	}
	public String getBelongSortType() {
		return belongSortType;
	}
	public void setBelongSortType(String belongSortType) {
		this.belongSortType = belongSortType;
	}
	public int getIsNative() {
		return isNative;
	}
	public void setIsNative(int isNative) {
		this.isNative = isNative;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
