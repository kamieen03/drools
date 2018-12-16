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

    public String getQ() {
        return q;
    }

    public String getAdvice() {
        return advice;
    }

    public Answer getA() {
        return a;
    }

    public Question clone(){
        Question q = new Question();
        q.id = this.id;
        q.q = this.q;
        q.a = this.a;
        q.advice = this.advice;
        return q;
    }
}
