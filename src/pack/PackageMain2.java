package pack;

import pack.a.User; //pack.a에서 User클래스만 사용
//import pack.a.*; => pack.a 전체 클래스를 사용

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지명 생략 가능
    }
}
