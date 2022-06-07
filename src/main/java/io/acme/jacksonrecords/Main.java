package io.acme.jacksonrecords;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

    public static final String JSON = """
            {
              "name": "John",
              "surname": "Smith"
            }
            """;

    @Override
    public int run(String... args) throws Exception {
        var mapper = new ObjectMapper();
        var record = mapper.readValue(JSON, SomeRecord.class);
        System.out.println(record);
        return 0;
    }
}
