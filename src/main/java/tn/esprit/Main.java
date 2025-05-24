package tn.esprit;

import gestionReservation.ReservationService;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
      Endpoint.publish("http://localhost:8888/ws/reservation", new ReservationService());
//      System.out.println("Reservation Service is ready in http://http://localhost:8888/ws/reservation?WSDL");
    }
}