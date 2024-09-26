package extends1.overriding;

public class ElectricCar extends Car {   //자식 클래스(서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스

    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge()    {
        System.out.println("충전합니다.");

    }
}
