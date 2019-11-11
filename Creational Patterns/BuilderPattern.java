class Laptop {
    private String CPU;
    private Integer Ram;
    private Integer GPU;
    private Integer HD;
    public Laptop (String cpu, Integer ram, Integer gpu, Integer HD){
        this.CPU = cpu;
        this.GPU = gpu;
        this.HD = HD;
        this.Ram = ram;
    }
    public void getSpecs(){
        System.out.println(" CPU: "+ CPU + " \n RAM: "+ Ram + "GB \n GPU: "+ GPU +"GB \n HD: "+ HD+"GB");
    }
}

class LaptopBuilder {
    private String CPU;
    private Integer Ram;
    private Integer GPU;
    private Integer HD;
    public void setCPU(String cpu){ this.CPU = cpu; }
    public void setGPU(Integer gpu){ this.GPU = gpu; }
    public void setRam(Integer ram){ this.Ram = ram; }
    public void setHD(Integer hd){ this.HD = hd; }
    public Laptop generateLaptop() {
        Laptop newLaptop = new Laptop(CPU, Ram, GPU, HD);
        return newLaptop;
    }
}
class Client {
    public static void main(String[] args){
    LaptopBuilder lb = new LaptopBuilder();
        lb.setCPU("Intel core i5");
        lb.setGPU(2);
        lb.setRam(1);
        lb.setHD(128);
        Laptop laptop = lb.generateLaptop();
        laptop.getSpecs();
    };
}