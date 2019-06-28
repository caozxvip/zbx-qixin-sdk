package com.huize.qixin.api.util;

import java.text.ParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Date;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class DateTimeDeserializer extends JsonDeserializer<Date>
{
    public Date deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return this.dateTimeParse(jp.getText());
    }
    
    private Date dateTimeParse(final String value) {
        Date date = null;
        try {
            date = DateUtil.dateTimeParse(value);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
