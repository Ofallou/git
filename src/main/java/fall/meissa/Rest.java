package fall.meissa;

import org.apache.logging.log4j.Logger;

import static spark.Spark.get;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Rest {
    private Logger logger;

    public static void main(String[] args) {
    Gson gson=new Gson() ;
        get("/hello", (req,res)-> {
            Map<String, Object> data = new HashMap<>();
            data.put("name", "Oumar");
            data.put("Salary", "2400");
          return  data;
        }, gson::toJson);
    }



}
