import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    public JsonObject data;
    /* TODO 
Declare a member variable that can 
be EASILY set from the constructor. */

    public Database(JsonObject data){
        this.data=data;
        /* TODO 
set the memebr variable declared above.*/
    }

    public JsonObject getRestaurant(String name){
        JsonArray restaurants = (JsonArray)this.data.get("restaurants");
        int i = 0;
        JsonObject result = (JsonObject) restaurants.get(i);
        while(!result.get("name").equals(name) && i<restaurants.size())
            result = (JsonObject) restaurants.get(i++);
        if(i >=restaurants.size())
            result =null;
        /* TODO 
Complete this method as specified. */
        return result;
    }

    public double getAvgReviews(String name){
        JsonObject result = getRestaurant(name);
        JsonArray reviews = (JsonArray) result.get("reviews");
        double sum = 0;
        for (Object review : reviews) sum += Double.parseDouble(((JsonObject) review).get("rating").toString());
        return sum/reviews.size();
        /* TODO 
Complete this method as specified.
 The previous method may be of help. 
*/
    }
}
