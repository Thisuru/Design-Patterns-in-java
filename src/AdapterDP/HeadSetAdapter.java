package AdapterDP;

public class HeadSetAdapter implements AndroidHeadSet{

    IPhoneHeadSet ihs = new IPhoneHeadSet();

    @Override
    public void giveSound(String str) {
        ihs.giveQualitySound(str);
    }
}
