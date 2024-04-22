package com.test.backend.commons.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertObjectUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T converterObject(Object objet, Class<T> c) {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.convertValue(objet, c);
    }
}
