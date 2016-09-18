package main.java.com.india.common;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public enum Urlprop {
	MAP;
	String BUNDLE_NAME = "url";
	ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	public String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
