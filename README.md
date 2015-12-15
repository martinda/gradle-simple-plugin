# gradle-simple-plugin
A dead simple gradle plugin that throws a PluginApplicationException error.

The error is caused by the ```name``` property in the ```SimpleExampleTask.groovy``` file,
which hides the ```AbstractTask.getName()``` method.

Try this to see:
```
./gradlew --daemon test
```
