package com.example.auta;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Spinner marka;
    ListView model, wynik;
    Switch aSwitch;
    SeekBar rocznik;
    RadioGroup kolor, wlasciciel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        marka = findViewById(R.id.marka);
        model = findViewById(R.id.model);
        wynik = findViewById(R.id.wyniki);
        aSwitch = findViewById(R.id.switch1);
        rocznik = findViewById(R.id.seekBar);
        kolor = findViewById(R.id.kolor);
        wlasciciel = findViewById(R.id.wlasciciel);
        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
        model.setAdapter(adapter);
    }
}