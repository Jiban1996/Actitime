package Generic;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Readfetchfrom_Hashmap {
	
	
 @Test
 public static HashMap<String, String> getdata(){
	 HashMap<String, String> data=new HashMap<>();
	 data.put("admin","admin:manager");
	
	 return data;
 } 
 public static String username(String un) {
	String user=getdata().get(un).split(":")[0];
	 return user;
 }
 public static String password(String pwd) {
	  String p=getdata().get(pwd).split(":")[1];
	return p;	 
 }
 
}
