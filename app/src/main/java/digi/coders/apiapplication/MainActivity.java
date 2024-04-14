package digi.coders.apiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String url="https://jsonplaceholder.typicode.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView getData = (TextView) findViewById(R.id.tv_get_data);
        getData.setOnClickListener( v-> {
            Network.getApiClient().fetchData().enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    Log.d("API DATa", response.body().toString());
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    Log.d("API DATa", t.getMessage());
                }
            });
        });
    }
}