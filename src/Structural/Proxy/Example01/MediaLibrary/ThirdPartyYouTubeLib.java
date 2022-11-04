package Structural.Proxy.Example01.MediaLibrary;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
