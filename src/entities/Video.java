package entities;

public class Video extends Lession {

    public Video() {
        super();
    }

    public Video(int seconds, String title, String url) {
        super(title);
        this.seconds = seconds;
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int duration() {
        return seconds;
    }

    private int seconds;
    private String url;

}
