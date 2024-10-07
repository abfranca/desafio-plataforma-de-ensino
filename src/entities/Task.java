package entities;

public class Task extends Lession {

    public Task() {
        super();
    }

    public Task(String description, int questionCount, String title) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    public String getDescription() {
        return description;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int duration() {
        return questionCount * 5 * 60;
    }

    private String description;
    private int questionCount;

}
