package com.devonfw.demoquarkus.general;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.springframework.data.domain.Page;

public class PageSerializer extends JsonSerializer<Page> {

    @Override
    public void serialize(Page page, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (page != null) {
            jsonGenerator.writeStartObject();

            jsonGenerator.writeObjectField("content", page.getContent());
            jsonGenerator.writeObjectField("pageable", page.getPageable());
            jsonGenerator.writeBooleanField("last", page.isLast());
            jsonGenerator.writeNumberField("totalPages", page.getTotalPages());
            jsonGenerator.writeNumberField("totalElements", page.getTotalElements());
            jsonGenerator.writeBooleanField("first", page.isFirst());
            jsonGenerator.writeNumberField("numberOfElements", page.getNumberOfElements());
            jsonGenerator.writeObjectField("sort", page.getSort());
            jsonGenerator.writeNumberField("number", page.getNumber());
            jsonGenerator.writeNumberField("size", page.getSize());
            jsonGenerator.writeBooleanField("empty", page.isEmpty());

            jsonGenerator.writeEndObject();
        }
    }
}

