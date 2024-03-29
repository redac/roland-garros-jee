# Développement du site Roland-Garros sur Java EE
Groupe 6 :
- Pablo B.
- Loukas D.
- Nedhir E.
- Angeline H.
- Reda K.
- Mathieu L.

## Livrables et login
Les livrables sont disponibles sous la rubrique [releases](https://github.com/redac/roland-garros-jee/releases) de Github.

La branche comportant la version la plus à jour du code est la branche `main`.

URL de débug locale par défaut : [http://localhost:8080/roland-garros-jee/](http://localhost:8080/roland-garros-jee/)

Login compte administrateur : 
```
username: fft_admin 
password: fftadmin123
```

## Liste de fonctionnalités : 


- [x] Liste des joueurs :
  - [x] une page qui affiche la liste des joueurs et joueuses participant au tournoi. Quand on clique sur un nom on affiche le détail de la fiche du joueur.  
  - [ ] une page affichant la liste des matches à venir et passés. 
  - [x] affichage des joueurs dans un tableau avec tri possible par nom, classement ou sexe.
  - [x] possibilité de créer / modifier / supprimer une fiche joueur.
  - [ ] fonctionnalité d'import d'une liste de données enregistrées dans un fichier .csv au format défini par la fédération.  


- [ ] Matches du tournoi :
  - [x] affichage de la liste des matches
  - [ ] création d'un match, caractérisé par le choix de 2 joueurs/joueuses, une date et une heure prévisionnelle, et un score (vierge au début)
  - [ ] modification d'un match / suppression à condition que le match n'ait pas été joué.
  - [ ] Saisie du temps de jeu et saisie du score d'un match. Une fois le score saisi on considère le match comme joué.  
 
- [x] Statistiques des joueurs :
  - [x] Une page qui affiche la liste des joueuses/joueurs triée par nombre de matches remportés
  - [x] Une page qui affiche la liste des joueuses/joueurs triée par durée de jeu totale
  - [x] une page qui indique par catégorie (femme/homme) qui a gagné le plus de jeux, qui a perdu le moins de sets, qui a gagné le plus de matches. [optionnel]

- [x] mettre un pied de page en bas de chaque page contenant un lien vers les CGU (reprendre les cgu actuelles).
- [x] mettre un menu sur toutes les pages pour pouvoir accéder directement aux rubriques du site.
- [x] mettre une page de Login.
- [x] mettre une page de création de compte.
