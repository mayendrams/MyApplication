package com.unikom.mayendrams.myapplication;

//NIM 10116513
//Nama Mayendra Muhammad Shiddiq
//Kelas IF-12
//Tanggal Dibuat 6 April 2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        configuremulaibutton();
    }

    private void configuremulaibutton(){
        Button btnmulai = (Button) findViewById(R.id.mulai);
        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, login.class));
            }
        });

    }

}
