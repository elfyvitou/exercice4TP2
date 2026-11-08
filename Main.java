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
