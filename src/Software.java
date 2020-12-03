public class Software {
   private String softwareName;
   private String softwareVersion;
   private int softwareRequierement;
   private int softwareRamMemmoryRequierement;

   //Constructor.
   public Software(String softwareName, String softwareVersion, int softwareRequierement, int softwareRamMemmoryRequierement){
       this.softwareName=softwareName;
       this.softwareVersion=softwareVersion;
       this.softwareRequierement=softwareRequierement;
       this.softwareRamMemmoryRequierement=softwareRamMemmoryRequierement;
   }

   //Setters y getters.
    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }
    public String getSoftwareName() {
        return softwareName;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
    public String getSoftwareVersion() {
        return softwareVersion;
    }
    public void setSoftwareRequierement(int softwareRequierement) {
        this.softwareRequierement = softwareRequierement;
    }
    public int getSoftwareRequierement() {
        return softwareRequierement;
    }
    public void setSoftwareRamMemmoryRequierement(int softwareRamMemmoryRequierement) {this.softwareRamMemmoryRequierement = softwareRamMemmoryRequierement; }
    public int getSoftwareRamMemmoryRequierement() { return softwareRamMemmoryRequierement;}

}
