package org.example.service.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import org.example.service.model.HelloWorldResponse;


/**
 * HelloWorldController.
 */
@Validated
@Controller("/")
@Slf4j
public class HelloWorldController {

    private static final String GREETING = "Hello, World!";

    @Get("/hello-world")
    public Single<HelloWorldResponse> greeting() {

        final HelloWorldResponse response = new HelloWorldResponse(GREETING);

        log.info("Happy greetings!");

        return Single.just(response);
    }
}
