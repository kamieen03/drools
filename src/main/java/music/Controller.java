package music;
import java.io.IOException;
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
    }
}
