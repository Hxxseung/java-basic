package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();   //문제 없음

        Parent parent2 = new Parent();  //new Parent()로 부모 타입으로 객체를 생성 => 메모리 상에 자식 타입은 존재하지 않음.
        Child child2 = (Child) parent2;     //런타임 오류 - ClassCastException
                                            //parentr2를 Child 타입으로 다운캐스팅 -> parent2는 Parent로 생성 되어 메모리 상 Child가 존재하지 않음.
        child2.childMethod();

    }
}
