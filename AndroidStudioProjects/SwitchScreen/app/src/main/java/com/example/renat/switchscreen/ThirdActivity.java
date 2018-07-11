package com.example.renat.switchscreen;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String user = "Жывотное";
        String gift = "Дырка от бублика";

        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = findViewById(R.id.textViewInfo);
        infoTextView.setText(user + ", вам передали " + gift);
    }

}
