package com.hendisantika.springbootcustomserializerdeserializer.controller;

import com.hendisantika.springbootcustomserializerdeserializer.model.PersonRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.40
 */
@RestController
public class PersonController {

    AtomicLong counter = new AtomicLong(0);

    @PostMapping(value = "/person", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> registerPerson(@RequestBody @Validated PersonRequest personRequest) {
        return ResponseEntity.ok("OK");
    }

}