

public class ConfigManager {
	private static ConfigManager instance;
	private String serverName;
	
	private ConfigManager(){
		
	}

	public static ConfigManager getInstance() {
		if(instance == null){
			instance = new ConfigManager();
		}
		return instance;
	}

	public static void setInstance(ConfigManager instance) {
		ConfigManager.instance = instance;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	

}
