package main.java.com.india.facade;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import main.java.com.india.common.Urlprop;
import main.java.com.india.to.rail.Railway;
import main.java.com.india.to.rail.RailwayRec;
import main.java.com.india.utils.FormUrl;
import main.java.com.india.utils.RailwayUrl;

public class ReadData {

	public static void main(String[] args) throws MalformedURLException, IOException {
		//read data from railway
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FormUrl urlCreator = new RailwayUrl();
		String urlData = urlCreator.readData(Urlprop.MAP.getString("DEFAULT_API_KEY"), "JSON", "100");
		Railway railwayData = gson.fromJson(urlData, Railway.class);
		List<RailwayRec> records = railwayData.getRecords();
		System.out.println(records.size());
	}

}
