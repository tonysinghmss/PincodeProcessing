package main.java.com.india.to.rail;

import com.google.gson.annotations.SerializedName;

public class RailwayRec {
	private long id;
	private String timestamp;
	@SerializedName("Train No.")
	private String trainNo;
	@SerializedName("train Name")
	private String trainName;
	private int islno;
	@SerializedName("station Code")
	private String stationCode;
	@SerializedName("Station Name")
	private String stationName;
	@SerializedName("Arrival time")
	private String arrivalTime;
	@SerializedName("Departure time")
	private String departureTime;
	private long distance;
	@SerializedName("Source Station Code")
	private String srcStationcode;
	@SerializedName("source Station Name")
	private String srcStationName;
	@SerializedName("Destination station Code")
	private String destStationcode;
	@SerializedName("Destination Station Name")
	private String destStationName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getIslno() {
		return islno;
	}
	public void setIslno(int islno) {
		this.islno = islno;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	public String getSrcStationcode() {
		return srcStationcode;
	}
	public void setSrcStationcode(String srcStationcode) {
		this.srcStationcode = srcStationcode;
	}
	public String getSrcStationName() {
		return srcStationName;
	}
	public void setSrcStationName(String srcStationName) {
		this.srcStationName = srcStationName;
	}
	public String getDestStationcode() {
		return destStationcode;
	}
	public void setDestStationcode(String destStationcode) {
		this.destStationcode = destStationcode;
	}
	public String getDestStationName() {
		return destStationName;
	}
	public void setDestStationName(String destStationName) {
		this.destStationName = destStationName;
	}
	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("Rail record [id=");
		builder.append(id);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", trainNo=");
		builder.append(trainNo);
		builder.append(", trainName=");
		builder.append(trainName);
		builder.append(", islno=");
		builder.append(islno);
		builder.append(", stationCode=");
		builder.append(stationCode);
		builder.append(", stationName=");
		builder.append(stationName);
		builder.append(", arrivalTime=");
		builder.append(arrivalTime);
		builder.append(", departureTime=");
		builder.append(departureTime);
		builder.append(", distance=");
		builder.append(distance);
		builder.append(", srcStationcode=");
		builder.append(srcStationcode);
		builder.append(", srcStationName=");
		builder.append(srcStationName);
		builder.append(", destStationcode=");
		builder.append(destStationcode);
		builder.append(", destStationName=");
		builder.append(destStationName);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
