import java.util.List;

public interface FlightReservationSystem {
    void zarezerwujLot(Flight lot, String posiadacz, double cenaBiletu);
    void anulujRezerwacje(Reservation rezerwacja);
    List<Flight> wyszukajLoty(String miejsceDocelowe, String dataWylotu);
    void wyswietlDostepneLoty();
}
