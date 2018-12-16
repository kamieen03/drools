package music;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import view.DecisionScreen;


public class Controller extends Application {
    public static DecisionScreen view;
    public static KieSession session;

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = new File("src/main/resources/fxml/DecisionScreenController.fxml").toURI().toURL();
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = loader.load();
        view = loader.getController();

        primaryStage.setTitle("Amp diagnosis");
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();

        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        KieContainer kContainer = ks.getKieClasspathContainer();
        session = kContainer.newKieSession("ksession-music");
        session.fireAllRules();

        primaryStage.show();
    }

    public static void main(String[] args) throws DroolsParserException, IOException {
        launch(args);

    }

    public static void updateSession(Question q){
        Question q_prime = q.clone();
        Controller.session.insert(q_prime);
        Controller.session.fireAllRules();
    }

    public static Question loadQuestion(int id){
        ObjectMapper mapper = new ObjectMapper();
        Map <Integer, Question> mq = null;
        try {
            mq = mapper.readValue(new File(
                    "src\\main\\resources\\questions.json"
            ), new TypeReference<HashMap<Integer, Question>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mq.get(id);
    }

}
