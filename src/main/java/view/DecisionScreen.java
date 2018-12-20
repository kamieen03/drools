package view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import music.Controller;
import music.Question;
import org.kie.api.runtime.KieSession;

import java.net.URL;
import java.util.ResourceBundle;

public class DecisionScreen implements Initializable {

    @FXML
    Label question;
    @FXML
    Label advice;
    @FXML
    Label adviceText;
    @FXML
    Button yesButton;
    @FXML
    Button noButton;

    Question q;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        adviceText.setWrapText(true);
    }

    public void displayQuestion(Question q){
        this.q = q;
        Platform.runLater(()->{
            question.setText(q.getQ());

            if(q.getAdvice() != null){
                advice.setText("Advice");
                adviceText.setText(q.getAdvice());
            }
            else {
                advice.setText("");
                adviceText.setText("");
            }
        });

    }

    public void displayFinished(){
        Question q2 = Controller.loadQuestion(112);
        yesButton.setVisible(false);
        noButton.setVisible(false);
        Platform.runLater(()->{
            question.setText(q2.getQ());
        });
    }

     public void clickYes(){
        q.a = Question.Answer.YES;
        Controller.updateSession(q);
     }

     public void clickNo(){
         q.a = Question.Answer.NO;
         Controller.updateSession(q);
     }


}
