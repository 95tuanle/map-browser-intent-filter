package com.humber.nguyenanhtuanle_n01414195_problemsolvingassessment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MapViewActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);
        textView = findViewById(R.id.tv_map_view_activity);
        String[] strings = getIntent().getData().toString().split("[:,?]");
        String string = "";
        if (strings.length == 3) {
            string = "latitude: " + strings[1] + "\nlongitude: " + strings[2];
        } else if (strings.length == 4) {
            string = "latitude: " + strings[1] + "\nlongitude: " + strings[2] + "\nzoom: " + strings[3].split("=")[1];
        } else {
            string = "Empty Geo Info";
        }
        textView.setText(string);
    }
}