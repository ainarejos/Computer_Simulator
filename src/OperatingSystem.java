public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequeriment;
    private int osMemmoryRequerement;
    private Software[] osSoftware;
    // Constructor.
    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequeriment, int osMemmoryRequerement){
        this.osName=osName;
        this.osVersion=osVersion;
        this.osArchitecture=osArchitecture;
        this.osOnlyCommand=osOnlyCommand;
        this.osSpaceRequeriment=osSpaceRequeriment;
        this.osMemmoryRequerement=osMemmoryRequerement;
    }

    // Getters y setters.
    public void setOsName(String osName) {
        this.osName = osName;
    }
    public String getOsName() {
        return osName;
    }
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    public String getOsVersion() {
        return osVersion;
    }
    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }
    public String getOsArchitecture() {
        return osArchitecture;
    }
    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }
    public boolean getOsOnlyCommand() {
        return osOnlyCommand;
    }
    public void setOsMemmoryRequerement(int osMemmoryRequerement) {
        this.osMemmoryRequerement = osMemmoryRequerement;
    }
    public int getOsMemmoryRequerement() {
        return osMemmoryRequerement;
    }
    public void setOsSpaceRequeriment(int osSpaceRequeriment) {
        this.osSpaceRequeriment = osSpaceRequeriment;
    }
    public int getOsSpaceRequeriment() {
        return osSpaceRequeriment;
    }
    public Software[] getOsSoftware() { return osSoftware; }

    public void installSoftware(Software osSoftware){
        int i=0;
        this.osSoftware[i]=osSoftware;
        i++;
    }
}
