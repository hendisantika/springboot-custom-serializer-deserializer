package com.hendisantika.springbootcustomserializerdeserializer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.36
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {
    @NotNull
    private String fullName;
}