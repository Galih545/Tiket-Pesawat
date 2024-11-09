class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int price;

    public Flight(String flightNumber, String origin, String destination, int price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }
}
