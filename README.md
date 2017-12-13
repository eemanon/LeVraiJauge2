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
- On declare la variable avant la clause try catch et on l'initialise par null, puis on appelle son constructeur à l'interieur du block
try

## Exercice 3
Donner la classe de base de cette exception ?
- RuntimeException
Ne pas oublier d’ajouter l’appel dans la méthode run().
- Jamais.

Compiler et exécuter. Expliquer le résultat.
- Le résultat est que la méthode run echoue à cause de l'exception dans le code de la méthode qu'on vient d'ajouter.
A la lecture du code de la méthode run(), il est impossible d’avoir une information sur les
exceptions progagées par cette méthode.
- Tout à fait.
Remplacons l’exception dans le code précedent par une instance de la classe ClassNotFoundException.
La compilation provoque une erreur.

Pourquoi cette exception est-elle contrôlée et pas la précédente ?
- ClassNotFoundException hérite de ReflectiveOperationException qui fait partie des checked Exceptions.
Checked Exceptions sont vérifié par le compilateur. Elles doivent donc être déclarées dans la signature de la méthode après le mot clé throws, ces exceptions sont donc explicites.

Comment corriger les autres erreurs sans capturer l’exception ?
- puisque l'exception doit être géré, on ajoute un try catch dans run. 

Executer les tests. Expliquer le résultat.
- l'Exception lévée est desormais capturé dans run est la méthode s'execute bien sur cette partie.

Mettre en commentaire la lev´ee de cette exception dans la m´ethode testExceptionControllee().
Compiler.
Conclusion : Quel contrôle effectue le compilateur ?
- Le compilateur vérifie que si une exception de type checked est présent, qu'elle est gérée par le code;
si cette exception n'est pas présent mais la structure pour la gerer, le compilateur ne vérifie pas l'absence
de cette exception.

Est-il possible de préciser une exception non contrôlée dans une clause throws ?
- oui.
Dans l’A.P.I. y-a-t-il plus d’exception contrôlée ou non contrôlée ?

- puisqu'on utilise IllegalArgumentException dans chaque classe de Jauge, on a une majorité des exceptions
non controlées.

Dans la méthode run() comment transformer l’exception contrôlée en une exception non
contrôlée ?
-
Pourquoi la classe AssertionError peut-elle être utilisée dans une instruction throw ?
-
Peut-elle être capturée ? Est-elle contrôlée ?
-
D’après la documentation de l’A.P.I, que représente la classe Error ?
-