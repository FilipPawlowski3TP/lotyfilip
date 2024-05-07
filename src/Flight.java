public class Flight {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private int czasTrwaniaLotu;
    private int liczbaDostepnychMiejsc;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, int czasTrwaniaLotu, int liczbaDostepnychMiejsc) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTrwaniaLotu = czasTrwaniaLotu;
        this.liczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        this.miejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        this.miejsceWylotu = miejsceWylotu;
    }

    public String getDataWylotu() {
        return dataWylotu;
    }

    public void setDataWylotu(String dataWylotu) {
        this.dataWylotu = dataWylotu;
    }

    public int getCzasTrwaniaLotu() {
        return czasTrwaniaLotu;
    }

    public void setCzasTrwaniaLotu(int czasTrwaniaLotu) {
        this.czasTrwaniaLotu = czasTrwaniaLotu;
    }

    public int getLiczbaDostepnychMiejsc() {
        return liczbaDostepnychMiejsc;
    }

    public void setLiczbaDostepnychMiejsc(int liczbaDostepnychMiejsc) {
        this.liczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }
}
