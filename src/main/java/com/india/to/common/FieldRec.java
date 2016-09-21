package main.java.com.india.to.common;

import com.google.gson.annotations.SerializedName;

public class FieldRec {
	private String type;
	private String size;
	private Integer length;
	@SerializedName("not null")
	private boolean notNull;
	private String description;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public int getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isNotNull() {
		return notNull;
	}
	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("FieldRec [type=");
		builder.append(type);
		builder.append(", size=");
		builder.append(size);
		builder.append(", length=");
		builder.append(length);
		builder.append(", notNull=");
		builder.append(notNull);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
}
