package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);         //메소드를 호출, 값 메소드에 전달
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    private static void changeReference(Data dataX) {   //Data dataX = dataA라고 할 수 있음
        dataX.value = 20;       //참조값을 통해 안에 있는 value값을 전부 20으로 변경 -> dataA.value = 20
    }

}
