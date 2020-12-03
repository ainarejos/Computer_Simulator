public class Prueba {
    public static void main(String[] args) {
        System.out.println("Introduce las datos del ordenador: ");
        Computer pc1=new Computer("pc1", 2, 500);
        System.out.println(pc1.getName() + " " + pc1.getRamMemory() + " " + pc1.getHardDisk());
        System.out.println("Introduzca el sistema que quiere instalar:");
        OperatingSystem os1=new OperatingSystem("os1", "10", "Pacal", false, 20, 2);
        pc1.installOS(os1);
        System.out.println(pc1.getHardDisk() + " " +  pc1.getRamMemory());
        Software s1=new Software("Winrar", "1.0", 5, 1);
        //if (s1.getSoftwareRequierement()>=pc1.getHardDisk()&&s1.getSoftwareRamMemmoryRequierement()>=pc1.getRamMemory()){
            os1.installSoftware(s1);
        //}
        System.out.println(os1.getOsSoftware());
    }
}
