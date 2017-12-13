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
- On declare la variable avant la clause try catch et on l'initialise par null, puis on appelle son constructeur � l'interieur du block
try

## Exercice 3
Donner la classe de base de cette exception ?
- RuntimeException
Ne pas oublier d�ajouter l�appel dans la m�thode run().
- Jamais.

Compiler et ex�cuter. Expliquer le r�sultat.
- Le r�sultat est que la m�thode run echoue � cause de l'exception dans le code de la m�thode qu'on vient d'ajouter.
A la lecture du code de la m�thode run(), il est impossible d�avoir une information sur les
exceptions progag�es par cette m�thode.
- Tout � fait.
Remplacons l�exception dans le code pr�cedent par une instance de la classe ClassNotFoundException.
La compilation provoque une erreur.

Pourquoi cette exception est-elle contr�l�e et pas la pr�c�dente ?
- ClassNotFoundException h�rite de ReflectiveOperationException qui fait partie des checked Exceptions.
Checked Exceptions sont v�rifi� par le compilateur. Elles doivent donc �tre d�clar�es dans la signature de la m�thode apr�s le mot cl� throws, ces exceptions sont donc explicites.

Comment corriger les autres erreurs sans capturer l�exception ?
- puisque l'exception doit �tre g�r�, on ajoute un try catch dans run. 

Executer les tests. Expliquer le r�sultat.
- l'Exception l�v�e est desormais captur� dans run est la m�thode s'execute bien sur cette partie.

Mettre en commentaire la lev�ee de cette exception dans la m�ethode testExceptionControllee().
Compiler.
Conclusion : Quel contr�le effectue le compilateur ?
- Le compilateur v�rifie que si une exception de type checked est pr�sent, qu'elle est g�r�e par le code;
si cette exception n'est pas pr�sent mais la structure pour la gerer, le compilateur ne v�rifie pas l'absence
de cette exception.

Est-il possible de pr�ciser une exception non contr�l�e dans une clause throws ?
- oui.
Dans l�A.P.I. y-a-t-il plus d�exception contr�l�e ou non contr�l�e ?

- puisqu'on utilise IllegalArgumentException dans chaque classe de Jauge, on a une majorit� des exceptions
non control�es.

Dans la m�thode run() comment transformer l�exception contr�l�e en une exception non
contr�l�e ?
-
Pourquoi la classe AssertionError peut-elle �tre utilis�e dans une instruction throw ?
-
Peut-elle �tre captur�e ? Est-elle contr�l�e ?
-
D�apr�s la documentation de l�A.P.I, que repr�sente la classe Error ?
-