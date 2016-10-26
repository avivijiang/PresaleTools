package com.test.system;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.yonyou.iuap.utils.HttpUtil;

public class TestRole {

	@Test
	public void testQueryRoles(){
		HttpUtil http = HttpUtil.getInstance() ;
		String url ="http://localhost:8080/Pre_project_manage/rolePermissionRelation/update" ;
		try {
			http.doGet(url) ;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
