package br.tutorial.spring.aplicacaospring.basico;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    @Autowired
    // @Qualifier()
    private InterfaceB interfaceB;

    public void execute() {
        interfaceB.metodoInterfaceB();
    }
}
