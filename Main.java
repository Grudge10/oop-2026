public class Main {
    public static void main(String[] args) {
        // For the showcase of sir
        Laptop asus = new Laptop();
        asus.brand = "Asus";
        asus.storage = 512;
        asus.memory = 8;
        asus.dimension = 14;
        asus.model = "Asus Tuff Gaming 15";
        asus.condition = "New";
        asus.price = 56000;

        Laptop mac = new Laptop();
        mac.brand = "Apple";
        mac.storage = 1000;
        mac.memory = 8;
        mac.dimension = 14;
        mac.model = "Macbook Pro mid-2014";
        mac.condition = "Old";
        mac.price = 560000;

        // The assignment that sir has given us
        GPU nvidia = new GPU();
        nvidia.name = "RTX 5060";
        nvidia.manufacturer = "NVIDIA";

        GPU amd = new GPU();
        amd.name = "RX 9070XT";
        amd.manufacturer = "AMD"
    }
}