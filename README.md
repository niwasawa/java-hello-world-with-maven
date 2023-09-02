# java-hello-world-with-maven
Hello World sample with Java with Maven
Changing the README.md file . Adding a new line.

## Compile

```
$ mvn compile
```

## Test

```
$ mvn test
```

## Run

```
$ mvn exec:java
```

## Package

```
$ mvn package
```

## Creating this project by Maven

```
$ mvn archetype:generate \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false \
  -DgroupId=info.maigo.lab.hello \
  -DartifactId=maigolab_hello
```

