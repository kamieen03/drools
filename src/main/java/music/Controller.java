package music;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.BasicConfigurator;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class Controller {
    public static void main(String[] args) throws DroolsParserException, IOException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-music");
        session.fireAllRules();
        //Controller.loadQuestion(1);
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
