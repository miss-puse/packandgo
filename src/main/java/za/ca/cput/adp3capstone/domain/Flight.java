package za.ca.cput.adp3capstone.domain;

public class Flight {
    private double flightId;
    private String departure_airport;
    private String arrival_airport;
    private int duration;
    private String airplane;
    private String airline;
    private String travel_class;
    private String flight_number;
    private String legroom;
    private boolean overnight;
    private double price;

    public Flight(Builder builder){
        flightId = builder.flightId;
        departure_airport = builder.departure_airport;
        arrival_airport = builder.arrival_airport;
        duration = builder.duration;
        airplane = builder.airplane;
        airline = builder.airline;
        legroom = builder.legroom;
        travel_class = builder.travel_class;
        flight_number = builder.flight_number;
        overnight = builder.overnight;
        price = builder.price;
    }

    public static class Builder{
        private double flightId;
        private String departure_airport;
        private String arrival_airport;
        private int duration;
        private String airplane;
        private String airline;
        private String travel_class;
        private String flight_number;
        private String legroom;
        private boolean overnight;
        private double price;

        public Builder setFlightId(double  flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder setDeparture_airport(String departure_airport) {
            this.departure_airport = departure_airport;
            return this;
        }

        public Builder setArrival_airport(String arrival_airport) {
            this.arrival_airport = arrival_airport;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setAirline(String airline){
            this.airline = airline;
            return this;
        }

        public Builder setAirplane(String airplane) {
            this.airplane = airplane;
            return this;
        }

        public Builder setTravel_class(String travel_class) {
            this.travel_class = travel_class;
            return this;
        }

        public Builder setFlight_number(String flight_number) {
            this.flight_number = flight_number;
            return this;
        }

        public Builder setLegroom(String legroom) {
            this.legroom = legroom;
            return this;
        }

        public Builder setOvernight(boolean overnight) {
            this.overnight = overnight;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Flight build(){
            return new Flight(this);
        }
    }
}
