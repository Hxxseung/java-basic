package extends1.overriding;

public class GasCar extends Car { //자식 클래스(서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스
    public void fillUp(){
        System.out.println("기름을 주유합니다.");
    }
}
