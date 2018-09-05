import java.io.File;
import java.io.FileWriter;

import java.util.List;
import java.util.Map;
import javax.json.*;

public class JSONLogger implements Logger {

    File output;


    public JSONLogger(File protocol){

        this.output = protocol;


    }



    @Override
    public void addInitialRound(Field[][] map, Map<Character, Integer> points) {


        JsonObject model = Json.createObjectBuilder()
            .add("firstName", "Duke")
            .add("lastName", "Java")
            .add("age", 18)
            .add("streetAddress", "100 Internet Dr")
            .add("city", "JavaTown")
            .add("state", "JA")
            .add("postalCode", "12345")
            .add("phoneNumbers", Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                    .add("type", "mobile")
                    .add("number", "111-111-1111"))
                .add(Json.createObjectBuilder()
                    .add("type", "home")
                    .add("number", "222-222-2222")))
            .build();



    }



    @Override
    public void addRoundInfo(List<Field> changes,Map<Character, Integer> points) {




    }


    private JSONObject createFieldsArray (Field[][] fields){


    }

    @Override
    public void writeToFile() {


    }



}
