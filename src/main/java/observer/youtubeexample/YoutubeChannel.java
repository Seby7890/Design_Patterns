package observer.youtubeexample;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private final List<Observer> subscribers;

    public YoutubeChannel() {
        subscribers = new ArrayList<>();
    }

    public void releaseNewVideo(String videoName) {
        System.out.println("Release new video " + videoName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }
}