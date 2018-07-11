package com.example.renat.switchscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    public void onClickSend(View view) {
        EditText userEditText = findViewById(R.id.editTextName);
        EditText giftEditText = findViewById(R.id.editTextGift);

        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);
    }
}
