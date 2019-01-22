package my.examples.businesscard.dto;

import java.util.ArrayList;
import java.util.List;

public class BusinessCardData {
    private int maxNum;
    private List<BusinessCard> businessCardList;

    // 필드를 초기화한다.
    public BusinessCardData(){
        this.maxNum = 1;
        businessCardList = new ArrayList<>();
    }

    public int getMaxNum() {
        int v = maxNum;
        maxNum++;
        return v;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public List<BusinessCard> getBusinessCardList() {
        return businessCardList;
    }

    public void setBusinessCardList(List<BusinessCard> businessCardList) {
        this.businessCardList = businessCardList;
    }

    @Override
    public String toString() {
        return "BusinessCardData{" +
                "maxNum=" + maxNum +
                ", businessCardList=" + businessCardList +
                '}';
    }

    public void add(BusinessCard bc) {
        businessCardList.add(bc);
    }

    public boolean delete(int id) {
        boolean find = false;
        for(BusinessCard businessCard : businessCardList){
            if(businessCard.getId() == id) {
                find = true;
                businessCardList.remove(businessCard);
                break;
            }
        }
        return find;
    }

    public BusinessCard get(int id) {
        BusinessCard businessCard = null;
        for(BusinessCard bc : businessCardList){
            if(bc.getId() == id) {
                businessCard = bc;
                break;
            }
        }
        return businessCard;
    }
}
