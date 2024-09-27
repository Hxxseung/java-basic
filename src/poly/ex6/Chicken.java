package poly.ex6;


public class Chicken extends AbstractAnimal implements Fly {       //인터페이스를 상속 받을 때는 implements 키워드를 사용함.
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
