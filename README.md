# SOAP-SERVER
Service Web SOAP pour gérer les réservations. Permet l’ajout, la consultation, la recherche et l’annulation de réservations. Implémenté en Java 17 avec JAX-WS, testé via SoapUI.

# SOAP-SERVER

## 🧾 Description
Développement d’un service Web SOAP pour la gestion des réservations.

## 🎯 Objectif
Développer un service SOAP permettant :
- d’ajouter une réservation
- de consulter la liste des réservations
- de rechercher une réservation par nom et prénom
- d’annuler une réservation

## 🛠️ Technologies utilisées
- Java 17
- JAX-WS (Java API for XML Web Services)
- IntelliJ IDEA
- SoapUI (pour les tests)


## ⚙️ Étapes de réalisation

### 1. Configuration du projet
- Création d’un projet Maven avec IntelliJ IDEA
- Ajout des dépendances JAX-WS dans le `pom.xml` (car supprimées du JDK depuis Java 9)

### 2. Création des classes
- `Reservation.java` : classe représentant une réservation
- `ReservationService.java` : logique métier exposée via le Web Service

### 3. Création du Web Service SOAP
Utilisation des annotations suivantes :
- `@WebService` : déclare une classe comme service SOAP
- `@WebMethod` : expose une méthode publique du service
- `@WebParam` : précise les paramètres d’une méthode SOAP

### 4. Déploiement & test avec SoapUI
- Lancer l’application (méthode `main`)
- Accéder au WSDL : `http://localhost:8080/ReservationService?wsdl`
- Créer un projet SOAP dans SoapUI avec cette URL
- Tester les opérations :
  - `ajouterReservation`
  - `consulterReservations`
  - `rechercherReservation`
  - `annulerReservation`

### 5. Manipulation XML (exemple d’ajout de réservation)
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:rest="http://soap.restau.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <rest:ajouterReservation>
         <reservation>
            <nom>GHARBI</nom>
            <prenom>ABDELHAFIDH</prenom>
            <dateReservation>2025-05-25</dateReservation>
            <nombrePersonnes>5</nombrePersonnes>
         </reservation>
      </rest:ajouterReservation>
   </soapenv:Body>
</soapenv:Envelope>

