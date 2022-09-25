package observer.youtubeexample;

public class YoutubeSubscriber implements Observer {
    @Override
    public void update() {
        System.out.println("New video on channel");
    }
}