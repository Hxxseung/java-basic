package poly.ex3;

public abstract class AbstractAnimal { //class 앞에 abstract를 반드시 붙여야 함.
    public abstract void sound();   //자식이 반드시 오버라이딩 해야함.
                                    //추상 method는 body를 가질 수 없다.

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
