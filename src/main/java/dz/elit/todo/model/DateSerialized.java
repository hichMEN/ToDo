package dz.elit.todo.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by mh.chebihi on 20/10/2016.
 */
public class DateSerialized extends JsonSerializer<Date> {
    private static SimpleDateFormat formatter =
            new SimpleDateFormat(new String("dd-MM-yyyy hh:mm:ss"));

    public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        gen.writeString(formatter.format(value));
    }
}
