package com.hendisantika.springbootcustomserializerdeserializer.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.hendisantika.springbootcustomserializerdeserializer.model.PersonRequest;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.36
 */
public class PersonRequestCustomDeserializer {

    public PersonRequest deserialize(JsonParser jsonParser) throws IOException {

        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        String fullName = jsonNode.get("full_name").textValue();

        return PersonRequest.builder().fullName(fullName).build();
    }
}
