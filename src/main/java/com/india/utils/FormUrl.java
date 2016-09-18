package main.java.com.india.utils;

import main.java.com.india.common.Urlprop;

public interface FormUrl {
	String form(String resrcTyp, String resrcId, String apiKey, String limit);
	
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
