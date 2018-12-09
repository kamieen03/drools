package drools.rodzina;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;


public class RodzinaTest {
    public static void main(String[] args) throws DroolsParserException,
            IOException {
        RodzinaTest rodzinaTest = new RodzinaTest();
        rodzinaTest.execute();
    }
    public void execute() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Osoba.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rodzina");
        session.fireAllRules();


        QueryResults results = session.getQueryResults( "Wujowie", "Beata");
        System.out.println( "we have " + results.size() + " wujas" );
        for ( QueryResultsRow row : results ) {
            Relacja rela = ( Relacja ) row.get( "rela" );
            System.out.println( rela.osoby[0].toString());
        }
    }
}

//w xmlu: name to nazwa pliku .drl, package to folder z tym plikiem, ksession name musi sie zgadzac z
//plikiem .java
