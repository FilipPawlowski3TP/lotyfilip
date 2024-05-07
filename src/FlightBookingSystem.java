import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem implements FlightReservationSystem {
    List<Flight> dostepneLoty;
    List<Reservation> rezerwacje;

    public FlightBookingSystem() {
        dostepneLoty = new ArrayList<>();
        rezerwacje = new ArrayList<>();
    }

    @Override
    public void zarezerwujLot(Flight lot, String posiadacz, double cenaBiletu) {
        Reservation nowaRezerwacja = new Reservation(lot, posiadacz, cenaBiletu);
        rezerwacje.add(nowaRezerwacja);
    }

    @Override
    public void anulujRezerwacje(Reservation rezerwacja) {
        rezerwacje.remove(rezerwacja);
        rezerwacja.getLot().setLiczbaDostepnychMiejsc(rezerwacja.getLot().getLiczbaDostepnychMiejsc() + 1);
    }

    @Override
    public List<Flight> wyszukajLoty(String miejsceDocelowe, String dataWylotu) {
        List<Flight> znalezioneLoty = new ArrayList<>();
        for (Flight lot : dostepneLoty) {
            if (lot.getMiejsceDocelowe().equals(miejsceDocelowe) && lot.getDataWylotu().equals(dataWylotu)) {
                znalezioneLoty.add(lot);
            }
        }
        return znalezioneLoty;
    }

    @Override
    public void wyswietlDostepneLoty() {
        for (Flight lot : dostepneLoty) {
            System.out.println("Lot do: " + lot.getMiejsceDocelowe() + ", Data wylotu: " + lot.getDataWylotu() +
                    ", Dostępne miejsca: " + lot.getLiczbaDostepnychMiejsc());
        }
    }
}
