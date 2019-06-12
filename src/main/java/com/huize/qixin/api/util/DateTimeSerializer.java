package com.huize.qixin.api.util;

import java.util.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import com.fasterxml.jackson.core.*;

public class DateTimeSerializer extends JsonSerializer<Date>
{
    public void serialize(final Date value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeString(this.dateTimeFormat(value));
    }
    
    private String dateTimeFormat(final Date value) {
        return DateUtil.dateTimeFormat(value);
    }
}
