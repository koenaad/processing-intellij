# Processing - IntelliJ

Template project to run a Processing sketch in IntelliJ IDEA. This has only been tested on macOS.

### Getting started

Processing has some quirks which require specific dependencies and JRE's. Gradle can handle this, but the IntelliJ integrated build and run tools will fail... __Always use gradle to build and run the application.__

Fetch all Processing libraries, build and run your sketch:

```
./gradlew run
```
