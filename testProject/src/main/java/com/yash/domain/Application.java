package com.yash.domain;

public class Application {
	private String appName;
    private String appVersion;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	@Override
	public String toString() {
		return "Application [appName=" + appName + ", appVersion=" + appVersion + "]";
	}
	
    

}
