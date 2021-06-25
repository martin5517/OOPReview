import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"i="+ingredients);
        Scanner scan = new Scanner(url.openStream());
        String result = "";
        while (scan.hasNext()) {
            result += scan.nextLine();
        }
            scan.close();

/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. */
        return (JsonObject) Jsoner.deserialize(result, new JsonObject())/* TODO
Remember to return a JSON object.*/;
    }

    public JsonObject getRecipesByDish(String dish) throws Exception
    {
        //Getting the things ready to connect to the web
        /* TODO 
Fill in this data type (Object) */
        URL url = new URL(baseUrl+"q="+dish);
        /* TODO
Fill in this datatype (Object) */
    Scanner scan = new Scanner(url.openStream());
    String result = "";
    while (scan.hasNext()) {
        result += scan.nextLine();
    }
        scan.close();

       /* TODO
Read the information coming from the web
 */
        return (JsonObject) Jsoner.deserialize(result, new JsonObject());/* TODO
return the appropriate result.
*/
    }


    public String formatRecipeAsString(JsonObject doc){
        String results = "";
        JsonArray recipes = (JsonArray) doc.get("results");
        for(Object r : recipes) {
            JsonObject obj =(JsonObject) r;
            results +="Title:"+(String)obj.get("title")+"\\n";
            results+="link:"+(String) obj.get("href")+"\\n";
            results+="ingredients:"+(String)obj.get("ingredients")+"\\n";
        }
        /* TODO 
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of teh recipe.*/
        return results;
    }

    public void saveRecipes(String text, String outfile){
        try(DataOutputStream out =new DataOutputStream(new FileOutputStream(outfile))) {
            out.writeBytes(text);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
    }

}
