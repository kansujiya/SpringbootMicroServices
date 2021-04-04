package com.spring.microservice.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.spring.microservice.models.Session;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.logging.Filter;

@Component
public class ApiFilter {

    public MappingJacksonValue applyingFilter(Set<String> list, Set<Session> sessionsList) {
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept((Set<String>) list);
        FilterProvider filters = new SimpleFilterProvider().addFilter("SessionFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mapping = new MappingJacksonValue(list);
        return mapping;
    }
}

@Configuration
class JacksonConfiguration {
    public JacksonConfiguration(ObjectMapper objectMapper) {
        objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));
    }
}