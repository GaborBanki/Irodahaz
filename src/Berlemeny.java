public class Berlemeny {
    private int alapterulet;
    private int berletiDij;
    private int foglaltsag;

    public Berlemeny(int alapterulet, int berletiDij, int foglaltsag) {
        this.setAlapterulet(alapterulet);
        this.setBerletiDij(berletiDij);
        this.setFoglaltsag(foglaltsag);
    }

    public int getAlapterulet() {
        return alapterulet;
    }

    public void setAlapterulet(int alapterulet) {
        this.alapterulet = alapterulet;
    }

    public int getBerletiDij() {
        return berletiDij;
    }

    public void setBerletiDij(int berletiDij) {
        this.berletiDij = berletiDij;
    }

    public int getFoglaltsag() {
        return foglaltsag;
    }

    public void setFoglaltsag(int foglaltsag) {
        this.foglaltsag = foglaltsag;
    }

    public int havikoltseg(){
        return berletiDij * this.getAlapterulet();
    }

    @Override
    public String toString() {
        return "Berlemeny{" +
                "alapterulet=" + this.getAlapterulet() +
                ", berletiDij=" + this.getBerletiDij() +
                ", foglaltsag=" + this.getFoglaltsag() +
                '}';
    }
}
