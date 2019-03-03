package sandbox;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.util.Arrays;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Message message = new Message("Hello");
        String serialized = null;
        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
//        mapper.setDateFormat(df);

        Person randomPerson = new Person("John", "Smith", 30, Arrays.asList(1, 2, 3));

        randomPerson.addPurchase(new Purchase("Laptop", 5234.99));

        mapper.registerModule(new JavaTimeModule());
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        try {
            serialized = mapper.writeValueAsString(randomPerson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(serialized);

        Person deserializedPerson = mapper.readValue(serialized,Person.class);
        System.out.println(deserializedPerson.getPurchases().get(0).getProductName());
    }
}
