package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){   //정적 메서드이므로 static만 ㄷ사용 할 수 있음.
                                        //static이 없는 인스턴스 변수나 인스턴스 메서드에 접근하면 컴파일 오류가 발생함.
        //instanceValue++;  //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
