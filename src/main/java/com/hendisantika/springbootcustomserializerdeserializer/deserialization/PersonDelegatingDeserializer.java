package com.hendisantika.springbootcustomserializerdeserializer.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer;
import org.slf4j.MDC;

import java.io.IOException;

import static com.hendisantika.springbootcustomserializerdeserializer.SpringbootCustomSerializerDeserializerApplication.CUSTOM_API;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.34
 */
public class PersonDelegatingDeserializer extends DelegatingDeserializer {

    private final PersonRequestCustomDeserializer personRequestCustomDeserializer =
            new PersonRequestCustomDeserializer();

    public PersonDelegatingDeserializer(JsonDeserializer defaultJsonDeserializer) {
        super(defaultJsonDeserializer);
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (MDC.get(CUSTOM_API) == null) {
            return super.deserialize(jsonParser, deserializationContext);
        } else {
            return personRequestCustomDeserializer.deserialize(jsonParser);
        }
    }

    @Override
    protected JsonDeserializer<?> newDelegatingInstance(JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

}
