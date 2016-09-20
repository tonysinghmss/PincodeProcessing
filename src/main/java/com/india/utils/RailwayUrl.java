package main.java.com.india.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import main.java.com.india.common.Urlprop;

public class RailwayUrl implements FormUrl {

	public String readData(String apiKey, String resrcType, String limit) throws MalformedURLException, IOException{		
		String url = null;	
		StringBuffer buff = new StringBuffer();
		if("JSON".equalsIgnoreCase(resrcType)){
			url =  form("RESOURCE_JSON",Urlprop.MAP.getString("RAILWAY_RSRC_ID"), apiKey, limit);
		}
		else if("XML".equalsIgnoreCase(resrcType)){
			url = form("RESOURCE_XML",Urlprop.MAP.getString("RAILWAY_RSRC_ID"), apiKey, limit);
		}
		if(url!=null){
			try(InputStream is = new URL(url).openStream(); BufferedReader buffRdr = new BufferedReader(new InputStreamReader(is));){
				int read;
				char[] chars = new char[1024];
				while((read = buffRdr.read(chars)) != -1)
					buff.append(chars,0,read);
			}
		}
		return buff.toString();
	}
}
