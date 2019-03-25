# Processing - IntelliJ

Template project to run a Processing sketch in IntelliJ IDEA. This has only been tested on macOS.

## Getting started

#### Java 8

You need Java 8 to run your Processing sketches. If you don't have a Java 8 runtime environment yet, easiest is to install it with brew cask:

```
brew cask install java8
```

And then make sure it is selected as the Project SDK in IntelliJ (Project Structure --> Project --> Project SDK --> Add new JDK if necessary).

#### Run it!

Run your sketch using gradle:

```
./gradlew run
```

## Reference

Visit the Processing reference: https://processing.org/reference/
