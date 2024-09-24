package static1;

public class Data3 {
    public String name;
    public static int count;    //정적변수 or class변수 => 정적 변수는 인스턴스 영역에 생성되지 않고 메서드 영역에서 변수를 관리한다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}


/*
인스턴스 변수 : static이 붙지 않은 멤버 변수
            static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 변수라 한다.
            인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.

클래스 변수 : static이 붙은 멤버 변수
            클래스 변수, 정적 변수 static 변수 등으로 부른다.
            static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어있다. 따라서 클래스 변수라 한다.
            클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
*/