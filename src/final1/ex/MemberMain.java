package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId","kim");
        member.print();
        member.changeData("myId2","seo");
        member.print();
    }
}


//결과 값에서 final을 이용한 id의 경우 Data가 변경되지 않는다.