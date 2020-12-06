package FactoryDP;

public class PhoneFactory {
    public Phone getPhone(String str){
        if(str==null){
            return null;
        }
        else if(str.equalsIgnoreCase("Low Price")){
            return new HuwaweiPhone();
        }
        else if(str.equalsIgnoreCase("Middle range Price")){
            return new SamsungPhone();
        }
        else if(str.equalsIgnoreCase("Expensive")){
            return new IPhone();
        }

        return null;
    }
}
