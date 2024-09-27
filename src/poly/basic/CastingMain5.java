package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();  //Parent에 들어간게 parent
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();   //Parent에 들어간게 Child
        System.out.println("Parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child){        //Parent에 들어간게 Child가 맞을 경우 아래 코드 실행.
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;   //parent -> child로 다운캐스팅
            child.childMethod();            //child 메서드 실행
        }
    }
}
