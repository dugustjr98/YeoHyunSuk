package my.examples.businesscard;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.examples.businesscard.dto.BusinessCard;
import my.examples.businesscard.dto.BusinessCardData;

import java.io.File;
import java.util.List;

public class BusinessCardDaoImpl implements BusinessCardDao{
    private BusinessCardData businessCardData;

    public BusinessCardDaoImpl(){
        businessCardData = new BusinessCardData();
    }

    @Override
    public int addBusinessCard(BusinessCard bc) {
        bc.setId(businessCardData.getMaxNum());
        businessCardData.add(bc);
        return bc.getId();
    }

    @Override
    public boolean deleteBusinessCard(int id) {
        boolean flag = businessCardData.delete(id);
        return flag;
    }

    @Override
    public List<BusinessCard> getAllCards() {
        return businessCardData.getBusinessCardList();
    }

    @Override
    public BusinessCard getBusinessCard(int id) {
        return businessCardData.get(id);
    }

    @Override
    public List<BusinessCard> getAllCards(String searchType, String searhStr) {
        return null;
    }

    @Override
    public boolean updateBusinessCard(BusinessCard bc) {
        return false;
    }

    @Override
    public void save(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("/tmp/businesscard.json");
            objectMapper.writeValue(file, businessCardData);
        }catch(Exception ex){
            System.out.println("저장오류.");
        }
    }

    @Override
    public void load(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("/tmp/businesscard.json");
            businessCardData = objectMapper.readValue(file, BusinessCardData.class);
        }catch (Exception ex){
            System.out.println("읽기오류");
        }
    }
}
