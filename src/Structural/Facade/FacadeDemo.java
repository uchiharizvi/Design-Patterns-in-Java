package Structural.Facade;

import java.io.File;

public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtube.ogg", "mp4");
    }
}
