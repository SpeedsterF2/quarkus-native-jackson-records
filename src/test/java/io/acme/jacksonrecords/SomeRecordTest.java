package io.acme.jacksonrecords;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeRecordTest {

    @Test
    void testDeserializationWorks() throws JsonProcessingException {
        var mapper = new ObjectMapper();
        var record = mapper.readValue("""
                        {
                          "name": "John",
                          "surname": "Smith"
                        }
                        """,
                SomeRecord.class);
        assertEquals(new SomeRecord("John", "Smith"), record);
    }
}