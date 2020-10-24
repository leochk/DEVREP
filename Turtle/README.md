# Édition du métamodèle (.ecore)


* Par rapport au métamodèle de la solution, la composition entre Farm et Turtle est bi-directionnelle, navigable donc dans les deux sens. Cependant, avec EMF, seul la direction Farm -> Turtle est modifiable (changeable = true), l'autre direction Turtle -> Farm étant positionnée par EMF (changeable = false).

* Il est de même avec la composition entre Stage et Choreography.

* La composition entre Choreography et Action est unidirectionnelle comme dans la solution.

* Pour pouvoir sérialiser un modèle instance dans un fichier XMI, il faut que tous les objets soient contenus dans une ressource. Cela veut dire dans la solution qu'un lien de containment (composition) devrait exister entre Stage et Farm, ou alors il faut ajouter Farm explicitement dans le ResourceSet à la main (methode Main#saveModel), après avoir ajouté l'objet racine Stage (puisque initialement la référence entre Stage et Farm est une simple association). Le moyen le plus simple est alors de transformer la référence entre Stage et Farm en composition.


# Édition du modèle pour la génération de code (.genmodel)

 Le modèle pour la génération de code en Java est paramétré :
 
 * au niveau du noeud modèle avec un texte de copyright (champ Copyright text)
 * au niveau du noeud package avec un espace de nom (champ Base Package)
 
 