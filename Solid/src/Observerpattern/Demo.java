package Observerpattern;

public class Demo {

    public static void main(String[] args) {
        YouTubeChannel youtubeChannel = new YouTubeChannel();
        Subscriber s1=new Subscriber("ravi");
        Subscriber s2=new Subscriber("shyam");
        Subscriber s3=new Subscriber("mohan");

        youtubeChannel.registerObserver(s1);
        youtubeChannel.registerObserver(s2);
        youtubeChannel.registerObserver(s3);

        youtubeChannel.uploadVideo("observer pattern tutotrial");
        youtubeChannel.uploadVideo("hld");

        youtubeChannel.removeObserver(s2);

        youtubeChannel.uploadVideo("java sprinboot");
    }
}
