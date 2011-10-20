package org.cloudfoundry.runtime.env;

import java.util.List;
import java.util.Map;

/**
 * 
 * Examines VCAP_CUSTOM_SERVICES environment variable to provide application dependency information. 
 * <p>
 * This class expects the value for the environment variable in the following JSON form
 * <pre>
 * [{
 * 	"name":"key",
 * 	"uris":["key.vcap.me"],
 * 	"instances":[{	
 * 		"host":"127.0.0.1",
 * 		"ports":[{
 * 			"index":0,
 * 			"name":"port",
 * 			"primary":true,
 * 			"value":35268}],
 * 		"port":35268}]}]
 *</code>
 * 
 * @author Jin Shao
 *
 */
public class AppDependencyInfo {
	private String name;
	private List<String> uris;
	private List<AppInstance> instances;	
	
	@SuppressWarnings("unchecked")
	public  AppDependencyInfo(Map<String, Object> info) {
		name = (String) info.get("name");		
		uris = (List<String>) info.get("uris");	
		instances = (List<AppInstance>) info.get("instances");
		
	}

	public String getName() {
		return name;
	}

	public List<String> getUris() {
		return uris;
	}

	public List<AppInstance> getInstances() {
		return instances;
	}
	
	
}



