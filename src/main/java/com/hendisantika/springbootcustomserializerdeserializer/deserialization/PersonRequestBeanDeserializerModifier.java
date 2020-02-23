package com.hendisantika.springbootcustomserializerdeserializer.deserialization;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.hendisantika.springbootcustomserializerdeserializer.model.PersonRequest;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.38
 */
public class PersonRequestBeanDeserializerModifier extends BeanDeserializerModifier {

    @Override
    public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc,
                                                  JsonDeserializer<?> deserializer) {
        if (PersonRequest.class.equals(beanDesc.getBeanClass())) {
            return new PersonDelegatingDeserializer(deserializer);
        }
        return super.modifyDeserializer(config, beanDesc, deserializer);
    }
}

