package digi.coders.apiapplication;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
   @GET("/photos")
   Call<String> fetchData();

}
