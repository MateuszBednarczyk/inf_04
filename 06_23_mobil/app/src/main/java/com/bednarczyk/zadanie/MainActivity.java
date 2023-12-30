package com.bednarczyk.zadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView rozmiarTextView;
    private SeekBar rozmiarSeekBar;
    private TextView cytatTextView;
    private String[] cytaty;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cytaty = new String[3];
        cytaty[0] = ("Dzien dobry");
        cytaty[1] = ("Good morning");
        cytaty[2] = ("Buenos dias");

        rozmiarTextView = findViewById(R.id.rozmiarTextView);
        rozmiarSeekBar = findViewById(R.id.rozmiarSeekBar);
        cytatTextView = findViewById(R.id.cytatTextView);
        button = findViewById(R.id.button);

        rozmiarSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                rozmiarTextView.setText(getString(R.string.rozmiarTextViewValue) + " " +
                        rozmiarSeekBar.getProgress());
                cytatTextView.setTextSize(rozmiarSeekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aktualnyCytat = Arrays.asList(cytaty).indexOf(cytatTextView.getText().toString());
                System.out.println(aktualnyCytat);
                int nowyCytat;
                if (aktualnyCytat < 2) {
                    nowyCytat = aktualnyCytat+1;
                } else {
                    nowyCytat = 0;
                }

                cytatTextView.setText(Arrays.asList(cytaty).get(nowyCytat));
            }
        });

    }
}