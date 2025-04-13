package com.example.jbgjhub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class EmployeeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action Bar Shi
        if (getSupportActionBar() != null) {
            TextView titleTextView = new TextView(this);
            titleTextView.setText("Available");
            titleTextView.setGravity(Gravity.CENTER);
            titleTextView.setTextSize(24);
            titleTextView.setTypeface(null, android.graphics.Typeface.BOLD);

            getSupportActionBar().setCustomView(titleTextView);
            getSupportActionBar().setDisplayOptions(androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM);
        }
    }
}
