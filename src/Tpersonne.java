public class Tpersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();
        Personne personne4 = new Personne();


        System.out.println("personne1: (nbLocal=" + personne1.nbLocal + ")");
        System.out.println("personne2: (nbLocal=" + personne2.nbLocal + ")");
        System.out.println("personne3: (nbLocal=" + personne3.nbLocal + ")");
        System.out.println("personne4: (nbLocal=" + personne4.nbLocal + ")");
        System.out.println("Total d'instances créées (nbInstances) = " + Personne.nbInstances);
    }
}


