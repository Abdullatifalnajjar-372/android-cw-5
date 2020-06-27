package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Real = findViewById(R.id.real)

        Button next =findViewById(R.id.button);
        Button b2 =findViewById(R.id.button2);
      next.setOnClickListener(view) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("Real",string );
        }
        b2.setOnClickListener(
            Intent s = new Intent(MainActivity.this,Main3Activity.class);
            s.putExtra("Real",name );
    }
}
