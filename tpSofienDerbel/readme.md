# Tp notee

tp 2 et tp4

travail realisé par Sofien Derbel.

### Reponses aux Questions :

Hibernate , web , jpa , h2 , devtools et Thymeleaf :

```
Hibernate , faciliter la transformation des objets java dans les bdd 
JPA , pour l'utilisation de les sql et les bdd
web , faciliter l'utilisation des api web
H2 , faciliter la synchonisation des bdd avec le langage java
devTools , un outils utilisable pour faciliter le devloppement
thymeleaf , c'est un moteur de template ecrit en java pour traiter les fichier html et aussi xml .. 
```
Question 13 : 

```
1) @GetMapping("/greeting")
2) return "greeting";
3) @RequestParam(name="nameGET", required=false, defaultValue="World") 
```

Question 17 : 

```
Creation de la table "adresse"
```
Question 18 : 

```
Hibernate cree la table apres avoir verifier qu'elle n'exsite pas, et grace aux annotations comme @id il peut savoir la cle primaire de la table, @entity pour savoir qu'il sagit d'une entitee.
```

Question 20 : 

```
On voit toutes les donnees entrees avec le fichier data.sql.
```

Question 23 : 

```
@autowired
elle fait l'injection des dependences des beans de l'application 
```

Question 30 : 

```
ajouter ces dependences dans le pom.xml:
<dependency>
    <groupId>org.webjars</groupId>
   	<artifactId>bootstrap</artifactId>
	<version>3.3.6</version>
</dependency>
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap-datepicker</artifactId>
    <version>1.0.1</version>
</dependency>
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>jquery</artifactId>
    <version>1.9.1</version>
</dependency>
```
Question 6 tp 2/2 : 

```
 Faut-il une cle API pour appeler DarkSky : 
 Oui, il faut creer un compte et generer un api Key.
 Quelle URL appeler?
 https://api.darksky.net/forecast/clé/lat,lon
 Quelle m´ethode HTTP utiliser? 
 Utiliser la methode get
 Comment passer les param`etres d’appels?
 https://api.darksky.net/forecast/clé/lat,lon?option=val
```


## Authors

* **Sofiene Derbel** - *Initial work* - [Soof](https://github.com/SofienDerbel)
