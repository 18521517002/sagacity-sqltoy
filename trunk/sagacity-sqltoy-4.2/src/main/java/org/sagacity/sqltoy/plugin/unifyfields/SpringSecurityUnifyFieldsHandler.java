/**
 * 
 */
package org.sagacity.sqltoy.plugin.unifyfields;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.sagacity.sqltoy.plugin.IUnifyFieldsHandler;
import org.sagacity.sqltoy.utils.DateUtil;

/**
 * @project sagacity-sqltoy4.0
 * @description 基于spring security获取当前用户的机制进行统一字段赋值
 * @author chenrenfei <a href="mailto:zhongxuchen@gmail.com">联系作者</a>
 * @version id:SpringSecurityUnifyFieldsHandler.java,Revision:v1.0,Date:2018年1月17日
 */
public class SpringSecurityUnifyFieldsHandler implements IUnifyFieldsHandler {
	// 注:sqltoy会自动判断是否有相关属性,属性不存在则不会进行操作
	// 针对saveOrUpdate操作,sqltoy则分别调用创建和修改的赋值,同时避免修改时冲掉创建人和创建时间信息
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sagacity.sqltoy.plugin.IUnifyFieldsHandler#createUnifyFields()
	 */
	@Override
	public Map<String, Object> createUnifyFields() {
		HashMap<String, Object> keyValueMap = new HashMap<String, Object>();
		Date nowDate = DateUtil.getNowTime();
		Timestamp nowTime = DateUtil.getTimestamp(null);
		String userId = "";
		keyValueMap.put("createBy", userId);
		keyValueMap.put("createDate", nowDate);
		keyValueMap.put("createTime", nowTime);
		keyValueMap.put("updateBy", userId);
		keyValueMap.put("updateDate", nowDate);
		keyValueMap.put("updateTime", nowTime);
		return keyValueMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sagacity.sqltoy.plugin.IUnifyFieldsHandler#updateUnifyFields()
	 */
	@Override
	public Map<String, Object> updateUnifyFields() {
		HashMap<String, Object> keyValueMap = new HashMap<String, Object>();
		Date nowDate = DateUtil.getNowTime();
		Timestamp nowTime = DateUtil.getTimestamp(null);
		String userId = "";
		keyValueMap.put("updateBy", userId);
		keyValueMap.put("updateDate", nowDate);
		keyValueMap.put("updateTime", nowTime);
		return keyValueMap;
	}

}
