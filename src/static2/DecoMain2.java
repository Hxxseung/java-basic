package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);    //static을 사용해서 클래스에서 바로 불러오기 가능. 객체생성 필요x

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
