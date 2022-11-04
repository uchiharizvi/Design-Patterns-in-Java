package Structural.Proxy.Example01.Proxy;

import Structural.Proxy.Example01.MediaLibrary.ThirdPartyYouTubeClass;
import Structural.Proxy.Example01.MediaLibrary.ThirdPartyYouTubeLib;
import Structural.Proxy.Example01.MediaLibrary.Video;

import java.util.HashMap;

/**
 * Caching proxy
 **/
public class YoutubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
