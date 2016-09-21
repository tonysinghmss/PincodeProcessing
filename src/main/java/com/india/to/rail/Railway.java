package main.java.com.india.to.rail;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import main.java.com.india.to.common.FieldRec;

public class Railway {
	private String help;
	private boolean success;
	@SerializedName("total_records")
	private long totalRecords;
	private long count;
	private Map<String, FieldRec> fields;
	private List<RailwayRec> records;
	
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public Map<String, FieldRec> getFields() {
		return fields;
	}
	public void setFields(Map<String, FieldRec> fields) {
		this.fields = fields;
	}
	public List<RailwayRec> getRecords() {
		return records;
	}
	public void setRecords(List<RailwayRec> records) {
		this.records = records;
	}
	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("Railway [help=");
		builder.append(help);
		builder.append(", success=");
		builder.append(success);
		builder.append(", totalRecords=");
		builder.append(totalRecords);
		builder.append(", count=");
		builder.append(count);
		builder.append(", fields=");
		builder.append(fields);
		builder.append(", records=");
		builder.append(records);
		builder.append("]");
		return builder.toString();
	}
	
	
}
