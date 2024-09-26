package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능을 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // -> 부모 타입인 poly를 자식 타입으로 다운 캐스팅 해서 childMethod를 참조 할 수 있도록 함.
                                    // 다운캐스팅 과정에서 참조값이 Child타입이 되는 것이지 poly자체가 Child타입이 되는 것은 아니다.
        child.childMethod();
    }
}
