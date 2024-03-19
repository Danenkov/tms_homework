public class Terapevt extends Doctor {
    @Override
    public void treat() {
        System.out.println("терапевт лечит");
    }

    public void appointDoctor(Pacient pacient) {
        Doctor doctor;
        if (pacient.getPlan() == 1) {
            doctor = new Hirurg();
        } else if (pacient.getPlan() == 2) {
            doctor = new Dantist();
        } else {
            doctor = new Terapevt();
        }
        doctor.treat();
    }
}