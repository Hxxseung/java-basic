package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        }
        System.out.println("게임에 참가합니다.");
    }
}

/*
프로그램 최대 참여자 수를 변경해야 하면 Constant.MAX_USERS의 상수값만 변경해주면 된다.
숫자 1000이 뭐를 의미하는지 직관적이다.
 */
