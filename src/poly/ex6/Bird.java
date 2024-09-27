package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{       //인터페이스를 상속 받을 때는 implements 키워드를 사용함.
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
