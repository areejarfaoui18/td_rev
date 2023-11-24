import java.util.*;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            System.out.println("Le médecin n'existe pas dans la liste des médecins de l'hôpital.");
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Médecin: " + medecin);
            System.out.println("Patients: ");
            patients.afficherPatients();
            System.out.println("-------------");
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            System.out.println("Patients du médecin " + m.getNom() + ":");
            medecinPatients.get(m).afficherPatients();
        } else {
            System.out.println("Le médecin n'existe pas dans la liste des médecins de l'hôpital.");
        }
    }
}
