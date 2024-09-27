package poly.ex2;

public class AnimlaPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Animal(), new Animal(), new Animal()};
        for(Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
