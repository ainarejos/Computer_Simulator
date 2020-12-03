public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem os;

    // Constructor.
    public Computer(String name, int ramMemory, int hardDisk){
        this.name=name;
        this.ramMemory=ramMemory;
        this.hardDisk=hardDisk;
        this.os=null;
    }

    //Setters y getters.
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
    public int getRamMemory() {
        return ramMemory;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public int getHardDisk() {
        return hardDisk;
    }

    public void installOS(OperatingSystem os){
        if (hardDisk>=os.getOsSpaceRequeriment()&&ramMemory>=os.getOsMemmoryRequerement()){
            this.os=os;
            if (os!=null){
                this.ramMemory=ramMemory-os.getOsMemmoryRequerement();
                this.hardDisk=hardDisk-os.getOsSpaceRequeriment();
                System.out.println("El sistema instalado es " + os.getOsName());
            }
        } else {
            System.out.println("No hay espacio suficiente o no hay suficiente ram");
        }
    }
}
