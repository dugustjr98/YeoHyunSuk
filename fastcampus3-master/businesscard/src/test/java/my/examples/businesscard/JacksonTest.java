package my.examples.businesscard;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.examples.businesscard.dto.BusinessCard;
import my.examples.businesscard.dto.BusinessCardData;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JacksonTest {
    // 테스트할 객체 선언
    private BusinessCard businessCard1;
    private BusinessCard businessCard2;
    private BusinessCard businessCard3;
    private List<BusinessCard> businessCardList;
    private BusinessCardData businessCardData;

    @Before
    public void init(){
        businessCardList = new ArrayList<>();
        businessCard1 = new BusinessCard("kim sungpark", "010-1111-2222", "sunnyvale");
        businessCard2 = new BusinessCard("kang kyungmi", "010-1111-3333", "sunnyvale");
        businessCard3 = new BusinessCard("choi sangjin", "010-1111-4444", "samsung");
        businessCardList.add(businessCard1);
        businessCardList.add(businessCard2);
        businessCardList.add(businessCard3);

        businessCardData = new BusinessCardData();
        businessCardData.setBusinessCardList(businessCardList);
        businessCardData.setMaxNum(100);
    }
    @Test
    public void convertJson() throws Exception{
        // businessCard1 의 값을 json으로 변환시켜라.
        // String str = "{ \"id:\" + businessCard1.getId() + ", \"name:\" + ....
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(businessCard1);
        System.out.println(jsonValue);
    }

    @Test
    public void convertJsonFromList() throws Exception{
        // List<BusinessCard> 를 json으로 변환하라.
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(businessCardList);
        System.out.println(jsonValue);
    }

    @Test
    public void convertJsonFromBusinessCardData() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(businessCardData);
        System.out.println(jsonValue);
    }

    @Test
    public void saveBusinessCardData() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("/tmp/businesscard.json");
        objectMapper.writeValue(file, businessCardData);
    }

    @Test
    public void readBusinessCardData() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("/tmp/businesscard.json");
        BusinessCardData businessCardData = objectMapper.readValue(file, BusinessCardData.class);

        System.out.println(businessCardData);
    }
}
