public enum Profession {
    DIRECTOR(3),
    WORKER(1),
    HR(2);

    private int kfProf;

    Profession(int kfProf){
        this.kfProf = kfProf;
    }
    public int getKfProf () {
        return kfProf;
    }
}
