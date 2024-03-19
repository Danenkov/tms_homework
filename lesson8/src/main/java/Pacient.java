public class Pacient {
    private Doctor doctor;
    private int plan;

    public Pacient(int plan) {
        this.plan = plan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }
}
