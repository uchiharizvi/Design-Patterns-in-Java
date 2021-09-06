package Structural.Proxy.MediaLibrary;

/**
 * Video file
 **/
public class Video {
    public String id;
    public String title;
    public String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random Video";
    }
}
