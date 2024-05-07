public class Reservation {
    private Flight lot;
    private String posiadacz;
    private double cenaBiletu;

    public Reservation(Flight lot, String posiadacz, double cenaBiletu) {
        this.lot = lot;
        this.posiadacz = posiadacz;
        this.cenaBiletu = cenaBiletu;
        lot.setLiczbaDostepnychMiejsc(lot.getLiczbaDostepnychMiejsc() - 1);
    }

    public Flight getLot() {
        return lot;
    }

    public void setLot(Flight lot) {
        this.lot = lot;
    }

    public String getPosiadacz() {
        return posiadacz;
    }

    public void setPosiadacz(String posiadacz) {
        this.posiadacz = posiadacz;
    }

    public double getCenaBiletu() {
        return cenaBiletu;
    }

    public void setCenaBiletu(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }
}
