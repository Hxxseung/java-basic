package pack;

import pack.a.User;
//import pack.a.*; => pack.a 전체 클래스를 사용

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지명 생략 가능
        pack.b.User userB= new pack.b.User();
    }
}


//클래스명이 동일하면 하나만 import가 가능하다.