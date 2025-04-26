package Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String videoTitle;
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer o:observers){
            o.update(videoTitle);
        }
    }
   //wehen a new video is uploaded

    public  void uploadVideo(String videoTitle){
        this.videoTitle = videoTitle;
        System.out.println("YouTube Video Uploaded :"+videoTitle);
        notifyObservers();
    }

}
