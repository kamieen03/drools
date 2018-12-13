package music;

public class Question {
    public enum Answer {YES, NO, NONE}
    public String q;
    public Answer a;
    public String advice;
    public int id;

    public Question(String q, int id){
        this.q = q;
        this.a = Answer.NONE;
        this.advice = null;
        this.id = id;
    }

    public Question(String q, String advice, int id){
        this.q = q;
        this.a = Answer.NONE;
        this.advice = advice;
        this.id = id;
    }

    public Question(){
    }
}
