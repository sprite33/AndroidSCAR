package com.hanmiglobal.customtab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import android.net.Uri;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openChromeCustomTabs("https://www.hgmscar.com");
    }

    private void openChromeCustomTabs(String url){
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor( Color.parseColor("#2573a7"));
        builder.setNavigationBarColor( Color.parseColor("#2980b9"));
        builder.enableUrlBarHiding();

        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));


    }
}