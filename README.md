# LeVraiJauge2
Partie 2 des tests

## Exercice 1
Expliquer pourquoi une seule exception est levée et non les deux.
Le premier de cas provoque déjà une exception qui n'est pas catched. Elle remonte donc jusqu'au premier niveau du test et le fait planter (sans finir l'execution du code restant).
