public class Rendezvenyterem extends Berlemeny {
    private int oradij;
    private int takaritasyFelar;

    public Rendezvenyterem(int alapterulet, int berletiDij, int foglaltsag, int takaritasyFelar, int oradij) {
        super(alapterulet, berletiDij, foglaltsag);
        this.takaritasyFelar = takaritasyFelar;
        this.oradij = oradij;
    }

    public int getOradij() {
        return oradij;
    }

    public void setOradij(int oradij) {
        this.oradij = oradij;
    }

    public int getTakaritasyFelar() {
        return takaritasyFelar;
    }

    public void setTakaritasyFelar(int takaritasyFelar) {
        this.takaritasyFelar = takaritasyFelar;
    }

    @Override
    public String toString() {
        return "Rendezvenyterem{" +
                "alapterulet=" + this.getAlapterulet() +
                ", berletiDij=" + this.getBerletiDij() +
                ", foglaltsag=" + this.getFoglaltsag() +
                ", oradij=" + this.getOradij() +
                ", takaritasyFelar=" + this.getTakaritasyFelar() +
                '}';
    }
}
