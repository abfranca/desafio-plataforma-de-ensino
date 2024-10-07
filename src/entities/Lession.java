package entities;

public abstract class Lession {

    public Lession() {
    }

    public Lession(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract int duration();

    private String title;

}
