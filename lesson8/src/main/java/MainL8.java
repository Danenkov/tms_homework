public class MainL8 {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient(1);
        Pacient pacient2 = new Pacient(2);
        Pacient pacient3 = new Pacient(3);
        Pacient pacient4 = new Pacient(4);
        Terapevt terapevt1 = new Terapevt();
        terapevt1.appointDoctor(pacient1);
        terapevt1.appointDoctor(pacient2);
        terapevt1.appointDoctor(pacient3);
        terapevt1.appointDoctor(pacient4);
    }
}
