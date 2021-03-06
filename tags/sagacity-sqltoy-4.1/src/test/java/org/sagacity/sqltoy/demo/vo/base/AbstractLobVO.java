/**
 *@Generated by QuickVO Tools 1.6
 */
package org.sagacity.sqltoy.demo.vo.base;

import java.io.Serializable;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;


/**
 * @project sqltoy-orm
 * @version 1.0.0
 * 大数据类型测试    			
 * LobVO generated by TEST_LOB
 */
@Entity(tableName="TEST_LOB")
public abstract class AbstractLobVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //id,name,comments,photo
	 
	 //not null properties
	 //id

	/**
	 * 主键
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.DefaultGenerator")
	@Column(name="ID",length=8L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer id;
	
	/**
	 * 名称
	 */
	@Column(name="NAME",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String name;
	
	/**
	 * 说明
	 */
	@Column(name="COMMENTS",length=4000L,type=java.sql.Types.CLOB,nullable=true)
	protected String comments;
	
	/**
	 * 照片
	 */
	@Column(name="PHOTO",length=4000L,type=java.sql.Types.BLOB,nullable=true)
	protected byte[] photo;
	


	/** default constructor */
	public AbstractLobVO() {
	}
	
	/** pk constructor */
	public AbstractLobVO(Integer id)
	{
		this.id=id;
	}


	/** full constructor */
	public AbstractLobVO(Integer id,String name,String comments,byte[] photo)
	{
		this.id=id;
		this.name=name;
		this.comments=comments;
		this.photo=photo;
	}
	
	/**
	 *@param id the id to set
	 */
	public void setId(Integer id) {
		this.id=id;
	}
		
	/**
	 *@return the Id
	 */
	public Integer getId() {
	    return this.id;
	}
	
	/**
	 *@param name the name to set
	 */
	public void setName(String name) {
		this.name=name;
	}
		
	/**
	 *@return the Name
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 *@param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments=comments;
	}
		
	/**
	 *@return the Comments
	 */
	public String getComments() {
	    return this.comments;
	}
	
	/**
	 *@param photo the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo=photo;
	}
		
	/**
	 *@return the Photo
	 */
	public byte[] getPhoto() {
	    return this.photo;
	}




	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuffer columnsBuffer=new StringBuffer();
		columnsBuffer.append("id=").append(getId()).append("\n");
		columnsBuffer.append("name=").append(getName()).append("\n");
		columnsBuffer.append("comments=").append(getComments()).append("\n");
		columnsBuffer.append("photo=").append(getPhoto()).append("\n");
		return columnsBuffer.toString();
	}
}
