package com.example.textview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.textview.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.text1);
        EditText mssv = findViewById(R.id.mssv);
        EditText birth = findViewById(R.id.birth);
        ToggleButton gender = findViewById(R.id.gender);
        EditText address = findViewById(R.id.addrs);
        EditText phone = findViewById(R.id.phone);
        EditText email = findViewById(R.id.email);
        CheckBox film = findViewById(R.id.film);
        CheckBox book = findViewById(R.id.book);
        CheckBox music = findViewById(R.id.music);
        CheckBox game = findViewById(R.id.game);

        Button submitBTN = findViewById(R.id.submit);

        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT);
            }
        });

    }
}