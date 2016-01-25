package ccu.test;

import java.io.IOException;

import org.junit.Test;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import com.alibaba.fastjson.JSONObject;

public class messageTest {
	
	@Test
	public void testCtr(){
		ClientResource clientResource = new ClientResource("http://localhost:8888/jiance/messageOfEquipSimpl");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageNum","0");
        jsonObject.put("pageSize","3");
        String jsonString = jsonObject.toJSONString();
        System.out.println(jsonString);
        Representation resource = clientResource.post(jsonString);
        try {
            System.out.println(resource.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	@Test
	public void testCtr1(){
		ClientResource clientResource = new ClientResource("http://localhost:8888/jiance/getMachineInfoSimpl");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageNum","0");
        jsonObject.put("pageSize","3");
        jsonObject.put("unitid", "81239e79-3cf8-4ba1-b53a-053ae50094df");
        String jsonString = jsonObject.toJSONString();
        System.out.println("jsonString :"+jsonString);
        Representation resource = clientResource.post(jsonString);
        try {
            System.out.println(resource.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	
	@Test
	public void testCtr2(){
		ClientResource clientResource = new ClientResource("http://localhost:8888/jiance/getEventInfoSimpl");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageNum","0");
        jsonObject.put("pageSize","3");
        jsonObject.put("unitid", "81239e79-3cf8-4ba1-b53a-053ae50094df");
        String jsonString = jsonObject.toJSONString();
        System.out.println("jsonString :"+jsonString);
        Representation resource = clientResource.post(jsonString);
        try {
            System.out.println(resource.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

	}


}
