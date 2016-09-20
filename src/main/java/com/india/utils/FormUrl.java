package main.java.com.india.utils;

import java.io.IOException;
import java.net.MalformedURLException;

import main.java.com.india.common.Urlprop;

public interface FormUrl {
	String readData(String apiKey, String resrcType, String limit) throws MalformedURLException, IOException;
	
	default String form(String resrcTyp, String resrcId, String apiKey, String limit){
		StringBuffer url = new StringBuffer(Urlprop.MAP.getString("URL_BASE"));
		url.append(Urlprop.MAP.getString(resrcTyp)).append("?");
		url.append(setResrcId(resrcId));//set resource id
		url.append("&").append(setApiKey(apiKey));//set API key
		url.append("&").append(setLimit(limit));//set record limit
		return url.toString();
	}
	
	default String setResrcId(String resrcId){
		return "resource_id="+resrcId;
	}
	
	default String setApiKey(String apiKey){
		if(apiKey!=null)
			return "api-key="+apiKey;
		else
			return "api-key="+Urlprop.MAP.getString("DEFAULT_API_KEY");
	}
	
	default String setLimit(String limit){
		if(limit!=null && !limit.isEmpty())
			return "limit="+limit;		
		else
			return "limit=0";
	}
}
