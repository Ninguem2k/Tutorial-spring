package br.tutorial.spring.aplicacaospring;

public class ClassA {
    private InterfaceB interfaceB;

    public ClassA(InterfaceB interfaceB) {
        this.interfaceB = interfaceB;
    }

    public void execute() {
        interfaceB.metodoInterfaceB();
    }
}
