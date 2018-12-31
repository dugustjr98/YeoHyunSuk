package RestaurantList;

import java.util.ArrayList;
import java.util.List;

public class RestaurantData {
    private Restaurant restaurant;
    private List<Restaurant> restaurantList;

    public RestaurantData(){
        restaurant=new Restaurant();
        restaurantList = new ArrayList<>();
    }
    public void add(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public boolean delete(Restaurant restaurant)
    {
        boolean flag =false;
        for(Restaurant restaurant1:restaurantList)
        {
            if(restaurant.equals(restaurant1))
            {
                flag= true;
                restaurantList.remove(restaurant1);
                break;
            }
        }
        return flag;
    }
    public List<Restaurant> get(){
        return restaurantList;
    }

    @Override
    public String toString() {
        return "RestaurantData{" +
                "restaurant=" + restaurant +
                ", restaurantList=" + restaurantList +
                '}';
    }
}
