package poly.ex5;

public interface InterfaceAnimal {
    void sound();
    void move();
}
//sound , move 앞에 public abstract 생략 => 상속 받는 곳에서 모든 메서드를 오버라이딩 해야함