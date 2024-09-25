package final1;

//final 필드 - 필드 초기화
public class FieldInit {
    static final int CONST_VALUE = 10;
    /*자바 상수 특징
    static final 키워드를 사용한다.
    대문자를 사용하고 구분은 _(언더스코어)로 한다.(관례)
        일반적인 변수와 상수를 구분하기 위해
    필드를 직접 접근해서 사용한다.
        상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
        상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.
    */
    final int value = 10;
}

/*
final 필드를 필드에서 초기화하면 이미 값이 설정되었기 떄문에 생성자를 통해서도 초기화 할 수 없다.
코드와 같이 static 변수에도 final을 선언 할 수 있다.
final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적임.
 */