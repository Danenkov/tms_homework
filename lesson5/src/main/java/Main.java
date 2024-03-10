public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 2, "siam");
        Cat cat2 = new Cat("Lapulia", 5);
        cat1.catInfo();
        cat2.catInfo();
        cat1.catRename("Murzik");
        cat2.catRename("Businka");
    }
}
