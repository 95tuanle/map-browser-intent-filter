package com.humber.nguyenanhtuanle_n01414195_problemsolvingassessment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HumberBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humber_browser);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_humber_browser_activity, new HumberBrowserFragment(getIntent().getData().toString())).commit();
    }
}