# LeVraiJauge2
Partie 2 des tests

## Exercice 1
Expliquer pourquoi une seule exception est lev�e et non les deux.
- Le premier de cas provoque d�j� une exception qui n'est pas catched. Elle remonte donc jusqu'au premier niveau du test et le fait planter (sans finir l'execution du code restant).


## Exercice 2
Pourquoi faut-il deux blocs try/catch pour s�assurer que l�exception est bien lev�e dans
tous les cas d�instanciation invalide?
- Parce que les deux appels de fonctions vont lever chaqu'un une exception.
V�rifier le comportement du test si aucune exception n�est lev�e.

Quelle est la valeur des variables inverse, egale dans la partie catch ? V�rifiez ces valeurs
gr�ce � une assertion.
- La valeur des variables inverse est �gale aux valeurs pass� en parametres car l'exception est l�v� apr�s.
L'assertion ins�r� l'approuve.

Comment d�clarer les variables pour les utiliser � la fois dans la clause try et la clause
catch ?
On declare la variable avant la clause try catch et on appelle son constructeur � l'interieur du block
try