public class Cat {
    public String name;
    public int age;
    public String type;

    public Cat(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Cat(String name, int age) {
        this(name, age, "no breed");
    }

    public void catInfo() {
        System.out.println("The cat's name is " + name + ", she is " + age + " years old, she's " + type);
    }

    public void catRename(String name) {
        this.name = name;
        System.out.println("New name cat is " + name);
    }
}

