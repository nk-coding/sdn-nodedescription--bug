# Demo to showcase bug with `Neo4jMappingContext.getChildNodeDescriptionsInHierarchy()`

Shows inconsistent behavior of `Neo4jMappingContext.getChildNodeDescriptionsInHierarchy()` for deeper class hierarchies.

Run:
```sh
./gradlew bootRun
```

Noteworthy files:
- [Model.kt](src/main/kotlin/com/example/demo/Model.kt): contains model classes
- [Monitor.kt](src/main/kotlin/com/example/demo/Monitor.kt): logs getChildNodeDescriptionsInHierarchy for each `NodeDescription`