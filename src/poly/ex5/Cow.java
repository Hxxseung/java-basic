package poly.ex5;

public class Cow implements InterfaceAnimal {       //인터페이스를 상속 받을 때는 implements 키워드를 사용함.
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
