package com.xdidian.keryhu.util;

/**
 * 
* @ClassName: Constants
* @Description: TODO(设置整个系统的常量 )
* @author keryhu  keryhu@hotmail.com
* @date 2016年5月4日 上午9:18:07
 */
public  final class Constants {
	
	private Constants(){
		//不允许实例化
	}
	
	public static final String  READ_AND_WRITE_RESOURCE_ID="ReadAndWriteResource";   //可读写的resourceID
    
    //如果email激活码过期，则前台需要返回注册页面
    public static final String EMAIL_ACTIVATE_EXPIRED="emailActivateExpired";
    
    //定义一个使用新地点平台role，排序
    public static final String ROLE_HIERARCHY="ROLE_XDIDIAN_ADMIN>ROLE_XDIDIAN_SERVICE ROLE_XDIDIAN_SERVICE>ROLE_COMPANY_ADMIN ROLE_COMPANY_ADMIN>ROLE_SOME_DEPARTMENT  ROLE_SOME_DEPARTMENT>ROLE_DEFAULT";
	

}
