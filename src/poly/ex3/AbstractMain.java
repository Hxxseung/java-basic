package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {

        //추상클래스 생성 불가
        //AbstractAnimal animal = new Abstractanimal();
        //추상이기 때문에 인스턴스 생성이 불가능하다.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
