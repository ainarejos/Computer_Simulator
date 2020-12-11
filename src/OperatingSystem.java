import java.util.ArrayList;

public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequeriment;
    private int osMemmoryRequerement;
    private ArrayList<Software> osSoftware;
    // Constructor.
    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequeriment, int osMemmoryRequerement){
        this.osName=osName;
        this.osVersion=osVersion;
        this.osArchitecture=osArchitecture;
        this.osOnlyCommand=osOnlyCommand;
        this.osSpaceRequeriment=osSpaceRequeriment;
        this.osMemmoryRequerement=osMemmoryRequerement;
        this.osSoftware=new ArrayList<Software>();
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
    public ArrayList<Software> getOsSoftware() { return osSoftware; }

    public void installSoftware(Software osSoftware, Computer pc){
        if (osSoftware.getSoftwareRequierement() <= pc.getHardDisk() && osSoftware.getSoftwareRamMemmoryRequierement() <= pc.getRamMemory()){
            this.osSoftware.add(osSoftware);
            pc.setHardDisk(pc.getHardDisk()-osSoftware.getSoftwareRequierement());
            pc.setRamMemory(pc.getRamMemory()-osSoftware.getSoftwareRamMemmoryRequierement());
        }

    }

    public void unInstallSoftware(Software osSoftware){
        this.osSoftware.remove(osSoftware);

    }
}
