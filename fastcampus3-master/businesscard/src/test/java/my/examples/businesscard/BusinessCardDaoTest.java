package my.examples.businesscard;

import my.examples.businesscard.dto.BusinessCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BusinessCardDaoTest {
    private BusinessCardDao businessCardDao; // 테스트할 interface

    @Before
    public void init(){
        businessCardDao = new BusinessCardDaoImpl();
    }

    @Test
    public void 명함추가(){
        BusinessCard businessCard = new BusinessCard();
        int id = businessCardDao.addBusinessCard(businessCard);
        Assert.assertNotEquals(id, 0);
    }
}
