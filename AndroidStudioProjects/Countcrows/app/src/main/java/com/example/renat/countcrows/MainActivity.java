package com.example.renat.countcrows;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView helloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mCatsCounter = findViewById(R.id.button_cats);
        final int[] catscount = {0};
        mCatsCounter.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ++catscount[0];
                helloTextView.setText("У тебя теперь " + +catscount[0] + " котанов");
            }
        });

        Button mCrowsCounterButton = findViewById(R.id.buttonCrowscounter);
        final int[] mCount = {0};
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ++mCount[0];
                helloTextView.setText("Я насчитал " + +mCount[0] + " ворон");
            }
        });

        helloTextView = findViewById(R.id.textView);
    }

    public void onClick(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Здарова, бандиты!");
    }
}
