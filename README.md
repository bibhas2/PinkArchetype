This is an archetype to quickly create a Pink based web project.

##Build and Install Pink
```
git clone https://github.com/bibhas2/Pink.git
cd Pink/Pink
mvn clean install
```


##Install the Archetype
```
git clone https://github.com/bibhas2/PinkArchetype.git
cd PinkArchetype
mvn install
```

##Generate a New Pink Based Web Project

```
mvn -B archetype:generate -DarchetypeArtifactId=pink-archetype \
  -DarchetypeGroupId=com.mobiarch \
  -DarchetypeVersion=1.0 \
  -DgroupId=com.mycompany.app \
  -DartifactId=MyWeb
  -Dversion=1.0
```

The generated project is ready to run. Let's say that the artifact ID (or project name) is MyWeb. 
Then:

```
cd MyWeb
mvn package
```

Deploy target/MyWeb.war in TomEE or JBoss. Then test the URL:

```
curl http://localhost:8080/MyWeb/hello
```
