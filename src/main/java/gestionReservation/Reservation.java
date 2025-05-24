package gestionReservation;

import java.util.Date;

public class Reservation {
    private String nom;
    private String prenom;
    private Date dateReservation;
    private int nombrePersonnes;

    public Reservation() {}

    public Reservation(String nom, String prenom, Date dateReservation, int nombrePersonnes) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateReservation = dateReservation;
        this.nombrePersonnes = nombrePersonnes;
    }
    // Getters et Setters...
    @Override
    public String toString() {
        return "Reservation{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateReservation=" + dateReservation +
                ", nombrePersonnes=" + nombrePersonnes +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setNombrePersonnes(int nombrePersonnes) {
        this.nombrePersonnes = nombrePersonnes;
    }
}
