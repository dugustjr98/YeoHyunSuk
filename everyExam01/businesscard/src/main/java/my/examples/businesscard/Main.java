package my.examples.businesscard;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.examples.businesscard.dto.BusinessCard;

public class Main {
    public static void main(String[] args) throws Exception{
        BusinessCard businessCard1;

        businessCard1 = new BusinessCard("kim sungpark", "010-1111-2222", "sunnyvale");

        // jackson 의 ObjectMapper를 사용.
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(businessCard1);
        System.out.println(jsonValue);
    }
}
