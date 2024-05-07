public class Main {
    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();

        // dodanie przykladowych lotow
        system.dostepneLoty.add(new Flight("Warszawa", "Kraków", "2024-05-10", 2, 100));
        system.dostepneLoty.add(new Flight("Kraków", "Warszawa", "2024-05-12", 2, 50));

        // dostepne loty
        system.wyswietlDostepneLoty();

        // rezerwacja
        system.zarezerwujLot(system.dostepneLoty.get(0), "Jan Kowalski", 200.0);
        system.wyswietlDostepneLoty(); // Po rezerwacji liczba dostępnych miejsc powinna się zmniejszyć

        // anulowanie rezerwacj
        Reservation rezerwacja = system.rezerwacje.get(0);
        system.anulujRezerwacje(rezerwacja);
        system.wyswietlDostepneLoty();
    }}
