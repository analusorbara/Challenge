import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        OkHttpClient client = new OkHttpClient();

        for(TimeZones tz: TimeZones.values()){
            Request request = new Request.Builder()
                    .url("http://worldclockapi.com/api/json/"+tz.toString()+"/now")

                    .build(); // defaults to GET

            Response response = client.newCall(request).execute();

            ApiResponse apod = mapper.readValue(response.body().byteStream(), ApiResponse.class);

           if(apod.getCurrentDateTime() != null){
               System.out.println(tz.toString());
           }
        }

    }
}
