package SingletonDP;

public class SingletonMain {
    public static void main(String[] args) {
        WashingMachine wmObj = WashingMachine.getInstance();
        wmObj.showMessage();
    }
}
