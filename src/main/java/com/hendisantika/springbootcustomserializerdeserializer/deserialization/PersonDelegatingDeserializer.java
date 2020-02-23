package com.hendisantika.springbootcustomserializerdeserializer.deserialization;

import com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer;

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

}
