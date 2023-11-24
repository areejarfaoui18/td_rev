import java.util.*;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;

    public ListPatients() {
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP.sort(Comparator.comparing(Patient::getNom));
    }
}

