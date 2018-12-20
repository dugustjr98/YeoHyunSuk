package BusinessExam;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class BusinessCardDAO {
    BusinessCardData businessCardData;


    public BusinessCardDAO(){
        businessCardData = new BusinessCardData();
    }


    public boolean addCard(BusinessCard bc) {

        bc.setId(businessCardData.getMaxNum());
        businessCardData.add(bc);
        return true;
    }

    public boolean deleteCard(int id){
        boolean flag = businessCardData.delete(id);
        return flag;
    }
    public List<BusinessCard> findnameCard(String name){
        BusinessCard result = new BusinessCard();
        List<BusinessCard> list = new ArrayList<>();
        for(BusinessCard businessCard:businessCardData.getBusinessCardList())
        {
            if(businessCard.getName().equals(name))
            {
                list.add(businessCard);
            }
        }
        return list;
    }
    public List<BusinessCard> findphoneCard(String phone){
        BusinessCard result = new BusinessCard();
        List<BusinessCard> list = new ArrayList<>();
        for(BusinessCard businessCard:businessCardData.getBusinessCardList())
        {
            if(businessCard.getPhone().equals(phone))
            {
                list.add(businessCard);
            }
        }
        return list;
    }
    public List<BusinessCard> findCorCard(String corporation){
        BusinessCard result = new BusinessCard();
        List<BusinessCard> list = new ArrayList<>();
        for(BusinessCard businessCard:businessCardData.getBusinessCardList())
        {
            if(businessCard.getCorporationName().equals(corporation))
            {
                list.add(businessCard);
            }
        }
        return list;
    }

    public void saveCard(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("/tmp/businesscard.json");
            objectMapper.writeValue(file, businessCardData);
        } catch (Exception ex) {
            System.out.println("저장 오류");
        }
    }
    public void loadCard(){

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("/tmp/businesscard.json");
            businessCardData = objectMapper.readValue(file, BusinessCardData.class);
        } catch (Exception ex) {
            System.out.println("읽기오류");
        }

    }
}
