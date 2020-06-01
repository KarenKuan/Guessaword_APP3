package sg.edu.rp.c346.guessaword_app3;

import java.io.Serializable;

public class Questions implements Serializable {

    private int id;
    private String questions;
    private String answers;

    public Questions(int id, String questions, String answers) {
        this.id = id;
        this.questions = questions;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getQuestions() {
        return questions;
    }

    public String getAnswers() {
        return answers;
    }
}
