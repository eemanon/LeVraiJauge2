# LeVraiJauge2
Partie 2 des tests

## Exercice 1
Expliquer pourquoi une seule exception est levée et non les deux.
- Le premier de cas provoque déjà une exception qui n'est pas catched. Elle remonte donc jusqu'au premier niveau du test et le fait planter (sans finir l'execution du code restant).


## Exercice 2
Pourquoi faut-il deux blocs try/catch pour s’assurer que l’exception est bien levée dans
tous les cas d’instanciation invalide?
- Parce que les deux appels de fonctions vont lever chaqu'un une exception.
Vérifier le comportement du test si aucune exception n’est levée.

Quelle est la valeur des variables inverse, egale dans la partie catch ? Vérifiez ces valeurs
grâce à une assertion.
- La valeur des variables inverse est égale aux valeurs passé en parametres car l'exception est lévé après.
L'assertion inséré l'approuve.

Comment déclarer les variables pour les utiliser à la fois dans la clause try et la clause
catch ?
On declare la variable avant la clause try catch et on appelle son constructeur à l'interieur du block
try