public class SzoftverfejlesztoIroda extends Berlemeny {
    private int aramfogyasztas;
    private int dolgozokSzama;

    public SzoftverfejlesztoIroda(int alapterulet, int berletiDij, int foglaltsag, int aramfogyasztas, int dolgozokSzama) {
        super(alapterulet, berletiDij, foglaltsag);
        this.aramfogyasztas = aramfogyasztas;
        this.dolgozokSzama = dolgozokSzama;
    }

    public int getAramfogyasztas() {
        return aramfogyasztas;
    }

    public void setAramfogyasztas(int aramfogyasztas) {
        this.aramfogyasztas = aramfogyasztas;
    }

    public int getDolgozokSzama() {
        return dolgozokSzama;
    }

    public void setDolgozokSzama(int dolgozokSzama) {
        this.dolgozokSzama = dolgozokSzama;
    }

    @Override
    public String toString() {
        return "SzoftverfejlesztoIroda{" +
                "alapterulet=" + this.getAlapterulet() +
                ", berletiDij=" + this.getBerletiDij() +
                ", foglaltsag=" + this.getFoglaltsag() +
                ", aramfogyasztas=" + this.getAramfogyasztas() +
                ", dolgozokSzama=" + this.getDolgozokSzama() +
                '}';
    }
}
