

##  Objectif

Ce projet a pour but de démontrer la différence entre une **variable statique** partagée entre toutes les instances d'une classe, et une variable non static propre à chaque objet.

##  Structure du projet

- Personne.java: contient la classe `Personne` avec deux compteurs :
  - nbInstances (statique) : nombre total d'objets créés.
  - nbLocal (non statique) : compteur propre à chaque objet (toujours 1).
- TPersonne.java : classe avec la méthode `main`, qui crée plusieurs instances et affiche les valeurs des compteurs.

## Exemple d'exécution

bash
personne1: (nbLocal=1)
personne2: (nbLocal=1)
personne3: (nbLocal=1)
personne4: (nbLocal=1)
Total d'instances créées (nbInstances) = 4

## AUTEUR
KAMARA ASSETOU
