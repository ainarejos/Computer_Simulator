public class Prueba {
    public static void main(String[] args) {
        //CREACIÓN DE EL PC.
        Computer pc1=new Computer("pc1", 7, 100);
        System.out.println("- Especificaciones del pc sin nada instalado: " + pc1.getName() + " " + pc1.getRamMemory() + "Gb de ram y " + pc1.getHardDisk() + " GB de almacenamiento.");
        //CREACIÓN DEL SISTEMA OPERATIVO.
        OperatingSystem os1=new OperatingSystem("os1", "10", "Pacal", false, 20, 4);
        System.out.println("- Los requisitos del sistema os1 son: " + os1.getOsMemmoryRequerement() + "GB de Ram y " + os1.getOsSpaceRequeriment() + "GB de almacenamiento.");
        //CREACIÓN DE S1 Y S2.
        Software s1=new Software("S1", "1.0", 5, 1);
        System.out.println("- Se crea s1 y sus especificaciones son: " + s1.getSoftwareRamMemmoryRequierement() + "GB de Ram y " + s1.getSoftwareRequierement() + "GB de almacenamiento.");
        Software s2=new Software("S2", "1.0", 10, 2);
        System.out.println("- Se crea s2 y sus especificaciones son: " + s2.getSoftwareRamMemmoryRequierement() + "GB de Ram y " + s2.getSoftwareRequierement() + "GB de almacenamiento.");
        //INSTALACIÓN DE 0S1.
        pc1.installOS(os1);
        System.out.println("- Se instala os1 en pc1, la memoria y la ram de pc1 se quedan en: " + pc1.getRamMemory() +"GB de Ram y " + pc1.getHardDisk() + "GB de almacenamiento.");
        //INSTALACIÓN DE SO1 Y SO2.
        pc1.getOs().installSoftware(s1, pc1);
        pc1.getOs().installSoftware(s2, pc1);
        System.out.print("- Se han instalado los siguientes programas: ");
        for (Software app : pc1.getOs().getOsSoftware()){
            System.out.print(app.getSoftwareName() + " ");
        }
        System.out.println(" y el espacio de pc despues de instalar los dos programas es: " + pc1.getRamMemory() + "Gb de Ram y " + pc1.getHardDisk() + "GB de almacenamiento.");
        //SE DESINSTALA S2.
        pc1.getOs().unInstallSoftware(s2, pc1);
        System.out.println("- Se ha desintalado S2 y la memoria se queda en: " + pc1.getRamMemory() + "GB de Ram y " + pc1.getHardDisk() + "Gb de almacenamiento");
        //FORMATEO DE PC1.
        pc1.formataOs(os1, s1);
        System.out.println("- Se realiza un formateo y el pc se queda con: : " + pc1.getRamMemory() + "Gb de ram y  " + pc1.getHardDisk() + "Gb de almacenamiento");
    }
}
