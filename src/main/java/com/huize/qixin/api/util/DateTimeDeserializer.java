package com.huize.qixin.api.util;

import java.util.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import com.fasterxml.jackson.core.*;
import java.text.*;

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
