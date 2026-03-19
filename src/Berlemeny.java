public class Berlemeny {
    private String teszt;

    public Berlemeny(String teszt) {
        this.teszt = teszt;
    }

    public String getTeszt() {
        return teszt;
    }

    public void setTeszt(String teszt) {
        this.teszt = teszt;
    }

    @Override
    public String toString() {
        return "Berlemeny{" +
                "teszt='" + teszt + '\'' +
                '}';
    }
}
