
public class Duree {

    int heures;
    int minutes;
    int secondes;


    Duree(int h, int m, int s) {

        int total = h * 3600 + m * 60 + s;

        heures = total / 3600;
        minutes = (total % 3600) / 60;
        secondes = total % 60;
    }


    Duree(int h, int m) {
        this(h, m, 0);
    }


    Duree() {
        this(0, 0, 0);
    }


    Duree(int totalSecondes) {
        this(0, 0, totalSecondes);
    }


    int enSecondes() {
        return heures * 3600 + minutes * 60 + secondes;
    }

    Duree ajouter(Duree autre) {
        int total = this.enSecondes() + autre.enSecondes();
        return new Duree(total);
    }

    void afficher() {
        System.out.println(heures + "h" + minutes + "m" + secondes + "s");
    }
    ublic static void main(String[] args) {

        Duree d1 = new Duree(1, 75, 130);
        Duree d2 = new Duree(3725);

        d1.afficher();
        d2.afficher();

        Duree cours = new Duree(1, 50);
        Duree pause = new Duree(0, 20);

        Duree resultat = cours.ajouter(pause);

        resultat.afficher();
    }

}