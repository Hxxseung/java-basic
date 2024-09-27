package poly.ex5;

public class Cat implements InterfaceAnimal {       //인터페이스를 상속 받을 때는 implements 키워드를 사용함.
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
