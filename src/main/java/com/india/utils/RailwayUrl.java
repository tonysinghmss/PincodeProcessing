package main.java.com.india.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import main.java.com.india.common.Urlprop;

public class RailwayUrl implements FormUrl {

	@Override
	public String form(String resrcTyp, String resrcId, String apiKey, String limit) {
		StringBuffer url = new StringBuffer(Urlprop.MAP.getString("URL_BASE"));
		url.append(Urlprop.MAP.getString(resrcTyp)).append("?");
		url.append(setResrcId(resrcId));//set resource id
		url.append("&").append(setApiKey(apiKey));//set API key
		url.append("&").append(setLimit(limit));//set record limit
		return url.toString();
	}
	
	public void readData(String apiKey, String limit) throws MalformedURLException, IOException{
		String url = form("RESOURCE_JSON","RAILWAY_RSRC_ID", apiKey, limit);
		InputStream is = new URL(url).openStream();
		//TODO: Read json from streams
		
	}
}
