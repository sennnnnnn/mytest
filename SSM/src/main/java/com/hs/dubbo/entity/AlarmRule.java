package com.hs.dubbo.entity;

import java.io.Serializable;

public class AlarmRule implements Serializable{
	private static final long serialVersionUID = 1L;
	 	private Integer ruleId;
	    private Integer companyId;
	    private Integer plantId;
	    private Integer departmentId;
	    private Integer checkId;
	    private Integer dischargeId;
	    private Integer factorId;
	    private String alarmType;
	    private String alarmLevel;
	    private String operateVar;
	    private String alarmValue;
	    private String alarmRule;
	    private String alarmTriggerlen;
	    private String alarmRemark;
	    private String remark;
	    private Integer isUse;
	    private Integer isDelete;
	    private String createTime;
	    private String userName;
	    private String operateTime;
	    private String operateName;
	
	
	public String getAlarmLevel() {
		return alarmLevel;
	}
	
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	
	public Integer getRuleId() {
		return ruleId;
	}
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getPlantId() {
		return plantId;
	}
	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getCheckId() {
		return checkId;
	}
	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}
	public Integer getDischargeId() {
		return dischargeId;
	}
	public void setDischargeId(Integer dischargeId) {
		this.dischargeId = dischargeId;
	}
	public Integer getFactorId() {
		return factorId;
	}
	public void setFactorId(Integer factorId) {
		this.factorId = factorId;
	}
	public String getAlarmType() {
		return alarmType;
	}
	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}
	
	public String getOperateVar() {
		return operateVar;
	}
	public void setOperateVar(String operateVar) {
		this.operateVar = operateVar;
	}
	public String getAlarmValue() {
		return alarmValue;
	}
	public void setAlarmValue(String alarmValue) {
		this.alarmValue = alarmValue;
	}
	public String getAlarmRule() {
		return alarmRule;
	}
	public void setAlarmRule(String alarmRule) {
		this.alarmRule = alarmRule;
	}
	public String getAlarmTriggerlen() {
		return alarmTriggerlen;
	}
	public void setAlarmTriggerlen(String alarmTriggerlen) {
		this.alarmTriggerlen = alarmTriggerlen;
	}
	public String getAlarmRemark() {
		return alarmRemark;
	}
	public void setAlarmRemark(String alarmRemark) {
		this.alarmRemark = alarmRemark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Integer getIsUse() {
		return isUse;
	}
	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateName() {
		return operateName;
	}
}
