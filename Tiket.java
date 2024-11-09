class Ticket {
    private String passengerName;
    private Flight flight;

    public Ticket(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public String getTicketDetails() {
        return "Nama Penumpang: " + passengerName + "\n" +
               "Nomor Penerbangan: " + flight.getFlightNumber() + "\n" +
               "Asal: " + flight.getOrigin() + "\n" +
               "Tujuan: " + flight.getDestination() + "\n" +
               "Harga: Rp" + flight.getPrice();
    }
}
