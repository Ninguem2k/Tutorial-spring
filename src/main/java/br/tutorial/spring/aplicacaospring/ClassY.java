package br.tutorial.spring.aplicacaospring;

import org.springframework.stereotype.Component;

@Component
public class ClassY implements InterfaceB {

    @Override
    public void metodoInterfaceB() {
        System.out.println("Metodo da class Y");
    }

}
