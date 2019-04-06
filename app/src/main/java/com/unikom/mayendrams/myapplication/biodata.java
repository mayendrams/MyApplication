package com.unikom.mayendrams.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);

        configureselanjutnyabutton();
    }

    private void configureselanjutnyabutton () {
        Button btnselanjutnya = (Button) findViewById(R.id.selanjutnya);
        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biodata.this, hei.class));
            }
        });

    }


}
