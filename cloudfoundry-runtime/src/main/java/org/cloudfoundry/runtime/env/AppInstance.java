package org.cloudfoundry.runtime.env;

import java.util.List;

public class AppInstance {
	private String host;
	private long port;
	private List<AppPortInfo> ports;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public long getPort() {
		return port;
	}
	public void setPort(long port) {
		this.port = port;
	}
	public List<AppPortInfo> getPorts() {
		return ports;
	}
	public void setPorts(List<AppPortInfo> ports) {
		this.ports = ports;
	}
	
	

}
