public class User {
    private String name;
    private Profession profession;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public User(String name, Profession profession, int experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    public double userSalary() {
        int kfProf = 0;
        double kfStag = 0;
        if (profession == Profession.DIRECTOR) {
            kfProf = 3;
        } else if (profession == Profession.HR) {
            kfProf = 2;
        } else if (profession == Profession.WORKER) {
            kfProf = 1;
        }
        if (experience < 5) {
            kfStag = 1;
        } else if (experience < 10) {
            kfStag = 1.2;
        } else if (experience < 20) {
            kfStag = 1.5;
        } else if (experience < 30) {
            kfStag = 1.8;
        }
        double Salary = 1000 * kfProf * kfStag;
        System.out.println("зп " + name + " = " + Salary);
        return Salary;
    }

    public void userBonus(double bonus) {
        double Salary = userSalary() + bonus;
        System.out.println("зп " + name + " с премией = " + Salary);
    }
}
