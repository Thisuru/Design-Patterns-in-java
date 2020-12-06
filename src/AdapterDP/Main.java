package AdapterDP;

public class Main {
    public static void main(String[] args) {

        AndroidHeadSet androidHeadSetObj = new HeadSetAdapter();
        ListenMusic musicObj = new ListenMusic(androidHeadSetObj);
        musicObj.ListenSong("Girls Like You");
    }
}
