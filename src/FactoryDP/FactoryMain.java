package FactoryDP;

public class FactoryMain {
    public static void main(String[] args) {
        PhoneFactory phoneFactoryObj = new PhoneFactory();

        Phone myPhone = phoneFactoryObj.getPhone("Middle range price");
        myPhone.showSpec();
    }
}
