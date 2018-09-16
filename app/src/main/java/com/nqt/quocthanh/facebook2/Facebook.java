package com.nqt.quocthanh.facebook2;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Facebook extends AppCompatActivity {
    private Button bienA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        bienA = findViewById(R.id.btn_login);
        bienA.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nutA = new Intent(Facebook.this, Activity2.class );
                startActivity(nutA);
            }
        });
    }
}
