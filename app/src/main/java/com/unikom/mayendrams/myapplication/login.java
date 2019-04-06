package com.unikom.mayendrams.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_code);

        configuremasukbutton();
    }

    private void configuremasukbutton(){
        Button btnMasuk = (Button) findViewById(R.id.masuk);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, biodata.class));
            }
        });

    }

}
