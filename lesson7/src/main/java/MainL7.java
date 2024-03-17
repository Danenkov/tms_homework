import Task1.Cat;
import Task1.Dog;
import Task2.HP;
import Task2.Mac;

public class MainL7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.doVoice();
        cat.doVoice();

        Mac mac = new Mac();
        HP hp = new HP();

        mac.getClassName();
        hp.getClassName();
    }
}
