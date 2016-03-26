package config;


public class Config {
    private int portNumber;
    private String hostName;

    public Config(String hostName, int portNumber) {
        this.portNumber = portNumber;
        this.hostName = hostName;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public String getHostName() {
        return hostName;
    }
}
