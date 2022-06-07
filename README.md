# Quarkus Native Jackson Record Deserialization

To replicate issue:

1. Build 
   ```
   mvn package -Pnative
   ```

NOTE: test pass when running under the JVM.

2. Execute runner
   ```
   ./target/jacksonrecords-0.0.1-SNAPSHOT-runner
   ```

Output:

```
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2022-06-07 10:48:55,970 INFO  [io.quarkus] (main) jacksonrecords 0.0.1-SNAPSHOT native (powered by Quarkus 2.9.2.Final) started in 0.003s. 
2022-06-07 10:48:55,972 INFO  [io.quarkus] (main) Profile prod activated. 
2022-06-07 10:48:55,972 INFO  [io.quarkus] (main) Installed features: [cdi]
2022-06-07 10:48:55,972 ERROR [io.qua.run.Application] (main) Failed to start application (with profile prod): com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Failed to access RecordComponents of type `io.acme.jacksonrecords.SomeRecord`
 at [Source: (String)"{
  "name": "John",
  "surname": "Smith"
}
"; line: 1, column: 1]
	at com.fasterxml.jackson.databind.DeserializationContext.reportBadDefinition(DeserializationContext.java:1904)
	at com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:268)
	at com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:244)
	at com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
	at com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:642)
	at com.fasterxml.jackson.databind.ObjectMapper._findRootDeserializer(ObjectMapper.java:4805)
	at com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:4675)
	at com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3629)
	at com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3597)
	at io.acme.jacksonrecords.Main.run(Main.java:20)
	at io.acme.jacksonrecords.Main_ClientProxy.run(Unknown Source)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:124)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:67)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:41)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)

2022-06-07 10:48:55,973 INFO  [io.quarkus] (main) jacksonrecords stopped in 0.000s
```
