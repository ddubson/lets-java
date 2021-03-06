package com.ddubson.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by ddubson on 2/21/16.
 */
public class Json {
    private final static ObjectMapper serializer;

    static {
        serializer = new ObjectMapper();
        serializer.writerWithDefaultPrettyPrinter();
        SimpleModule module = new SimpleModule();
        serializer.registerModule(module);
    }

    public static String toJsonString(Object raw) throws JsonProcessingException {
        return serializer.writeValueAsString(raw);
    }
}
