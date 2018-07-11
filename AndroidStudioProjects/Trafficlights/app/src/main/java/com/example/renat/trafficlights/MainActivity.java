package com.example.renat.trafficlights;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.constaintLayout);
        mInfoTextView = findViewById(R.id.textView);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
    }
}
