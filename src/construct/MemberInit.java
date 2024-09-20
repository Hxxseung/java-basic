package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;       //가까운 인스턴스부터 호출하기 때문에 this를 통해 클래스의  변수를 호출한다.
        this.age = age;
        this.grade = grade;
    }
}
