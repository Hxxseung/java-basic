package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    public static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}


//animal.sound()를 호출 -> animal의 sound 메서드 호출 -> 객체에 맞는 클래스의 오버라이드 된 메서드가 호출됨(오버라이딩 된 메서드가 최우선순위 때문)
//장점 : 새로운 동물이 추가 될 경우 새로운 동물 클래스의 sound메서드만 추가해주면 됨.