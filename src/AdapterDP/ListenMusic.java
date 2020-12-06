package AdapterDP;

public class ListenMusic {
    private AndroidHeadSet headSet;

    public ListenMusic(AndroidHeadSet headSet){
        this.headSet = headSet;
    }

    public void ListenSong(String str){
        headSet.giveSound(str);
    }
}
