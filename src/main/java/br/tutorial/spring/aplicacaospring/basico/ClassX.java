package br.tutorial.spring.aplicacaospring.basico;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClassX implements InterfaceB {

    @Override
    public void metodoInterfaceB() {
        System.out.println("Metodo da class X");
    }

}
