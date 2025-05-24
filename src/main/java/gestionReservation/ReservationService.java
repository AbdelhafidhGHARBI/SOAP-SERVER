package gestionReservation;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReservationService")
public class ReservationService {
    private static final List<Reservation> reservations = new ArrayList<>();

    @WebMethod
    public String ajouterReservation(@WebParam(name = "nom") String nom, @WebParam(name = "prenom") String prenom, @WebParam(name = "date") Date dateReservation, @WebParam(name = "nombrePersonnes") int nombrePersonnes) {
        Reservation reservation = new Reservation(nom, prenom, dateReservation, nombrePersonnes);
        reservations.add(reservation);
        return "Réservation ajoutée avec succès.";
    }

    @WebMethod
    public List<Reservation> listerReservations() {
        return reservations;
    }

    @WebMethod
    public String annulerReservation(@WebParam(name = "nom") String nom, @WebParam(name = "prenom") String prenom) {
        return reservations.removeIf(r -> r.getNom().equals(nom) && r.getPrenom().equals(prenom)) ?
                "Réservation annulée." : "Réservation non trouvée.";

    }
}
