package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;        //성적 값이 없는 Member객체는 성적이 50으로 바뀌게 된다.
    }

    MemberConstruct(String name, int age, int grade) {      //생성자 부분
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
