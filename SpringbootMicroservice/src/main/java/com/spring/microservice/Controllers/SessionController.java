package com.spring.microservice.Controllers;

import com.spring.microservice.filter.ApiFilter;
import com.spring.microservice.models.Session;
import com.spring.microservice.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/sessions")

public class SessionController {
    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private ApiFilter filter;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public MappingJacksonValue get(@PathVariable Long id)  {
        Session session = sessionRepository.findById(id).get();
        Set<String> excludeField = new HashSet<>(Arrays.asList("session_id"));
        Set<Session> modelList = new HashSet<Session>(Arrays.asList(session));
        return filter.applyingFilter(excludeField, modelList);
    }

    @PostMapping
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        sessionRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }
}
