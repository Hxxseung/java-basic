package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method();  //Child 클래스에서 method가 오버라이딩 되어있어 항상 우선권을 갖게 되므로 Parent의 method가 아닌 Child의 method가 호출된다.
    }
}
