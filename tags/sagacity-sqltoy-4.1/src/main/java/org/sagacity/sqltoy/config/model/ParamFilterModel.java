/**
 * 
 */
package org.sagacity.sqltoy.config.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @project sqltoy-orm
 * @description sqltoy 查询条件参数值过滤加工配制模型
 * @author zhongxuchen <a href="mailto:zhongxuchen@gmail.com">联系作者</a>
 * @version id:ParamFilterModel.java,Revision:v1.0,Date:2013-3-22
 */
public class ParamFilterModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2608369719903008282L;
	
	public ParamFilterModel() {
	}
	
	/**
	 * 
	 * @param filterType
	 * @param params
	 */
	public ParamFilterModel(String filterType,String[] params) {
		this.filterType = filterType;
		this.params = params;
	}

	/**
	 * 参数名称（exclusive和primary 两个filter使用）
	 */
	private String param;

	/**
	 * 参数名称数组
	 */
	private String[] params;

	/**
	 * 参数值
	 */
	private String[] values;

	/**
	 * 过滤加工的类型:blank、equals、any、moreThan、moreEquals、lessThan、lessEquals、between、
	 * not-any、to-date、to-number、primary、to-array、replace,exclusive(排斥性参数)
	 */
	private String filterType;

	/**
	 * 数据类型
	 */
	private String dataType;

	/**
	 * numberType
	 */
	private String numberType;

	/**
	 * 日期或数字格式
	 */
	private String format;
	
	/**
	 * replace的表达式
	 */
	private String regex;

	/**
	 * 分割符
	 */
	private String split = ",";
	
	/**
	 * 是否替换第一个参数
	 */
	private boolean isFirst=false;
	
	/**
	 * exclusive 排他性参数
	 */
	private String[] updateParams;
	
	/**
	 * 设置的值(exclusive filter)
	 */
	private String updateValue=null;
	
	/**
	 *互斥型filter 对比类型
	 */
	private String compareType="==";
	
	/**
	 * 互斥型filter 对比的值
	 */
	private String[] compareValues=null;
	
	/**
	 * 排除的参数
	 */
	private HashMap<String, String> excludesMap;

	/**
	 * 增加的天数
	 */
	private Double incrementDays = 0d;

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	/**
	 * @return the params
	 */
	public String[] getParams() {
		return params;
	}

	/**
	 * @param params
	 *            the params to set
	 */
	public void setParams(String[] params) {
		this.params = params;
	}

	/**
	 * @return the numberType
	 */
	public String getNumberType() {
		return numberType;
	}

	/**
	 * @param numberType
	 *            the numberType to set
	 */
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	/**
	 * @return the excludesMap
	 */
	public HashMap<String, String> getExcludesMap() {
		return excludesMap;
	}

	/**
	 * @param excludesMap
	 *            the excludesMap to set
	 */
	public void setExcludesMap(HashMap<String, String> excludesMap) {
		this.excludesMap = excludesMap;
	}

	/**
	 * @return the incrementDays
	 */
	public Double getIncrementDays() {
		return incrementDays;
	}

	/**
	 * @param incrementDays
	 *            the incrementDays to set
	 */
	public void setIncrementDays(Double incrementDays) {
		this.incrementDays = incrementDays;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the split
	 */
	public String getSplit() {
		return split;
	}

	/**
	 * @param split the split to set
	 */
	public void setSplit(String split) {
		this.split = split;
	}

	/**
	 * @return the regex
	 */
	public String getRegex() {
		return regex;
	}

	/**
	 * @param regex the regex to set
	 */
	public void setRegex(String regex) {
		this.regex = regex;
	}

	/**
	 * @return the isFirst
	 */
	public boolean isFirst() {
		return isFirst;
	}

	/**
	 * @param isFirst the isFirst to set
	 */
	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}

	/**
	 * @return the updateParams
	 */
	public String[] getUpdateParams() {
		return updateParams;
	}

	/**
	 * @param updateParams the updateParams to set
	 */
	public void setUpdateParams(String[] updateParams) {
		this.updateParams = updateParams;
	}

	/**
	 * @return the updateValue
	 */
	public String getUpdateValue() {
		return updateValue;
	}

	/**
	 * @param updateValue the updateValue to set
	 */
	public void setUpdateValue(String updateValue) {
		this.updateValue = updateValue;
	}

	/**
	 * @return the compareType
	 */
	public String getCompareType() {
		return compareType;
	}

	/**
	 * @param compareType the compareType to set
	 */
	public void setCompareType(String compareType) {
		this.compareType = compareType;
	}

	/**
	 * @return the compareValues
	 */
	public String[] getCompareValues() {
		return compareValues;
	}

	/**
	 * @param compareValues the compareValues to set
	 */
	public void setCompareValues(String[] compareValues) {
		this.compareValues = compareValues;
	}

	
}
