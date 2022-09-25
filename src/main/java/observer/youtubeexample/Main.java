package observer.youtubeexample;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber();
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber();

        youtubeChannel.registerObserver(subscriber1);
        youtubeChannel.registerObserver(subscriber2);
        youtubeChannel.registerObserver(subscriber3);

        youtubeChannel.releaseNewVideo("new video1");
        youtubeChannel.releaseNewVideo("new video2");
    }
}