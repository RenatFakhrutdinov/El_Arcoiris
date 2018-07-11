package com.example.renat.elarcoiris;

import android.os.Bundle;
import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;

public class Second_Activity extends Activity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mConstraintLayout = findViewById(R.id.constraintLayout);
        mInfoTextView = findViewById(R.id.textViewColor);
    }

    public void onClickNaranja(View view) {
        mInfoTextView.setText(R.string.naranja);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.naranja));
    }

    public void onClickRojo(View view) {
        mInfoTextView.setText(R.string.rojo);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.rojo));
    }

    public void onClickAmarillo(View view) {
        mInfoTextView.setText(R.string.amarillo);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.amarillo));
    }

    public void Verde(View view) {
        mInfoTextView.setText(R.string.verde);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.verde));
    }

    public void onClickCian(View view) {
        mInfoTextView.setText(R.string.cian);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.cian));
    }

    public void onClickVioleta(View view) {
        mInfoTextView.setText(R.string.vialeta);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.violeta));
    }

    public void onClickAzul(View view) {
        mInfoTextView.setText(R.string.azul);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.azul));
    }
}
