package com.drolls.example;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
public class PozarTest {
    public static void main(String[] args) throws DroolsParserException,
            IOException {
        PozarTest pozarTest = new PozarTest();
        pozarTest.execute();
    }
    public void execute() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Pomiar.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        //session.insert(new Pomiar(10,true));
        session.fireAllRules();
        session.insert(new Straz());
        session.fireAllRules();
    }
}