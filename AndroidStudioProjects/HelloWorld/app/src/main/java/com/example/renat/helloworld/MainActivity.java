package com.example.renat.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloTextView = (TextView) findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);

    }

    public void onClick(View view) {
        if (mNameEditText.getText().length()==0) {
            mHelloTextView.setText("Ваще ребята!");
        }
        else {
            mHelloTextView.setText("Пацаны, " + mNameEditText.getText());
        }
    }
}
