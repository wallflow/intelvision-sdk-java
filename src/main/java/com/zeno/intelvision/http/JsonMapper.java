package com.zeno.intelvision.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/**
 * @author lan
 * @since 2015-08-12
 */
public class JsonMapper {

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    private JsonMapper() {
    }

    public static <T> T readValue(String json, Class<T> clazz) {
        T t = null;
        if (json != null && !"".equals(json)) {
            try {
                t = mapper.readValue(json, clazz);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

    public static <T> T readValue(String json, TypeReference valueTypeRef) {
        T t = null;
        if (json != null && !"".equals(json)) {
            try {
                t = mapper.readValue(json, valueTypeRef);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

}
