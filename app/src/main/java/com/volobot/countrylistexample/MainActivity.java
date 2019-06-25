package com.volobot.countrylistexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.volobot.countrylist.Country;
import com.volobot.countrylist.CountryList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String TAG=MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountryList countryList=new CountryList();
        List<Country> countries=countryList.getAllCountries();
        for (int i = 0; i < countries.size(); i++) {
            Log.d(TAG,countries.get(i).getName()+"-"+countries.get(i).getDial_code()+"-"+countries.get(i).getCode());
        }
    }
}
