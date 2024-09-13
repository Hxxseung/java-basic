package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);   //초기값이 0으로 초기화 되서 들어감
        System.out.println("bigData.data=" + bigData.data); //초기값이 null로 들어감
        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value); //bigData.null.value로 인식해서 발생
    }
}
