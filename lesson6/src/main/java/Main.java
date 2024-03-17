public class Main {
    public static void main(String[] args) {
        User boss = new User("Ivan", Profession.DIRECTOR, 20);
        User kadr = new User("Maria", Profession.HR, 10);
        User rab1 = new User("Gena", Profession.WORKER, 1);
        User rab2 = new User("Sasha", Profession.WORKER, 7);
        rab1.userSalary();
        rab2.userSalary();
        kadr.userSalary();
        boss.userSalary();
        boss.userBonus(1500);
        kadr.userBonus(500);
    }
}
