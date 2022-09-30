package br.tutorial.spring.aplicacaospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    @Autowired
    private InterfaceB interfaceB;

    public ClassA(InterfaceB interfaceB) {
        this.interfaceB = interfaceB;
    }

    public void execute() {
        interfaceB.metodoInterfaceB();
    }
}
