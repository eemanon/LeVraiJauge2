# LeVraiJauge2
Partie 2 des tests

## Exercice 1
Expliquer pourquoi une seule exception est levée et non les deux.
Le premier de cas provoque déjà une exception qui n'est pas catched. Elle remonte donc jusqu'au premier niveau du test et le fait planter (sans finir l'execution du code restant).


## Exercice 2
Pourquoi faut-il deux blocs try/catch pour s’assurer que l’exception est bien levée dans
tous les cas d’instanciation invalide.

Vérifier le comportement du test si aucune exception n’est levée.
? Quelle est la valeur des variables inverse, egale dans la partie catch ? Vérifiez ces valeurs
grâce à une assertion.
? Comment déclarer les variables pour les utiliser à la fois dans la clause try et la clause
catch ?