package com.huize.qixin.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Date;
import com.fasterxml.jackson.databind.JsonSerializer;

public class DateTimeSerializer extends JsonSerializer<Date>
{
    public void serialize(final Date value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeString(this.dateTimeFormat(value));
    }
    
    private String dateTimeFormat(final Date value) {
        return DateUtil.dateTimeFormat(value);
    }
}
