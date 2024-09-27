package poly.ex6;

public class Dog extends AbstractAnimal {       //인터페이스를 상속 받을 때는 implements 키워드를 사용함.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}
