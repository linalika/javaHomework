
package lesson7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat cat = new Cat("Мурзик","5");

        String catJson = objectMapper.writeValueAsString(cat);
        System.out.println(catJson);

        Cat catFromJson = objectMapper.readValue(catJson,Cat.class);
        System.out.println(catFromJson);

        List<Cat> cats = new ArrayList<>(Arrays.asList(cat,new Cat("Марс","9")));
        String catsList = objectMapper.writeValueAsString(cats);
        System.out.println(catsList);

        List<Cat> catsFromJson = objectMapper.readValue(catsList, new TypeReference<List<Cat>>() {});

        System.out.println(catsFromJson);

//        String jsonAfterRefactoring = "{\"name\":\"Vehpbr\",\"age\":\"12\",\"weight\":\"5\"}";
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        Cat catAfterRefactoring = objectMapper.readValue(jsonAfterRefactoring, Cat.class);
//        System.out.println(catAfterRefactoring);

        String jsonSecondAfterRefactoring = "{\"surname\":\"Vehpbr\",\"age\":\"12\",\"weight\":\"5\"}";
        Cat catSecondAfterRefactoring = objectMapper.readValue(jsonSecondAfterRefactoring, Cat.class);
        System.out.println(catSecondAfterRefactoring);

        objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE,true);
        String catsJsonRoot = objectMapper.writeValueAsString(cat);
        System.out.println(catsJsonRoot);

        Cat catWithEye = new Cat("Марс","9");
        catWithEye.setEye(new Eye("зеленые"));
        String jsonCatWithEye = objectMapper.writeValueAsString(catWithEye);
        System.out.println(jsonCatWithEye);
    }
}