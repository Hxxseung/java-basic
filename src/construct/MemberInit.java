package construct;

public class MemberInit {
    String name;    //멤버변수
    int age;
    int grade;

    void initMember(String name, int age, int grade) {//매개변수
        this.name = name;       //가까운 인스턴스부터 호출하기 때문에 매개변수가 호출되므로, this를 통해 멤버 변수를 호출한다.
        this.age = age;
        this.grade = grade;
    }
}
