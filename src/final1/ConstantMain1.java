package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if(currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        }
        System.out.println("게임에 참가합니다.");
    }
}

/*
1000이라는 숫자가 무슨 뜻인지 직관적이지 못함.
1000명 -> 2000명으로 변경해야 하면 2곳의 변경 포인트 발생. => 100곳에서 사용하는 경우 숫자 변경이 쉽지않음. (유지 보수가 어렵다.)
 */