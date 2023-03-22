package com.humber.nguyenanhtuanle_n01414195_problemsolvingassessment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendGeoIntent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.6,-122.3?z=11"));
        startActivity(intent);
    }

    public void sendWebIntent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.humber.ca"));
        startActivity(intent);
    }
}