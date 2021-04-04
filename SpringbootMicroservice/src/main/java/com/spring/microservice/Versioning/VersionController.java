package com.spring.microservice.Versioning;

import com.spring.microservice.models.PersonName;
import com.spring.microservice.models.PersonV1;
import com.spring.microservice.models.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    //URI
    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Suresh URI");
    }

    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new PersonName("Suresh Kansujiya", "URI"));
    }

    //URI Path variable
    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Suresh URI Param");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new PersonName("Suresh Kansujiya", "URI Param"));
    }

    //Header
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Suresh HEADER");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new PersonName("Suresh Kansujiya", "HEADER"));
    }

    //Content-Negotiations
    @GetMapping(value = "/person/produce", produces = "application/com.spring.microservice.company.app-v1+json")
    public PersonV1 produceV1() {
        return new PersonV1("Suresh Content-Negotiations");
    }

    @GetMapping(value = "/person/produce", produces = "application/com.spring.microservice.company.app-v2+json")
    public PersonV2 produceV2() {
        return new PersonV2(new PersonName("Suresh Kansujiya", "Content-Negotiations"));
    }

}
