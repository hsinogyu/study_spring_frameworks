package hello.proxy.pureproxy.concreteproxy.code;

public class ConcreteClient {

    private final ConcreteLogic concreteLogic; // 현재 구체 클래스에 의존중

    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }


    public void execute() {
        concreteLogic.operation();
    }
}
