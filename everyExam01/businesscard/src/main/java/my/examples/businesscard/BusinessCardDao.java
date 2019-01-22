package my.examples.businesscard;

import my.examples.businesscard.dto.BusinessCard;

import java.util.List;

public interface BusinessCardDao {
    public int addBusinessCard(BusinessCard bc);
    public boolean deleteBusinessCard(int id);
    public List<BusinessCard> getAllCards();
    public BusinessCard getBusinessCard(int id);
    public List<BusinessCard> getAllCards(String searchType, String searhStr);
    public boolean updateBusinessCard(BusinessCard bc);
    public void save(String fileName);
    public void load(String fileName);
}
