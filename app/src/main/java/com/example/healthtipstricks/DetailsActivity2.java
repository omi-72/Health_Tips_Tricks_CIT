package com.example.healthtipstricks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity2 extends AppCompatActivity {

    ImageView img, back_btn;
    TextView title, desc;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        img= findViewById(R.id.img);
        title= findViewById(R.id.title);
        title= findViewById(R.id.desc);
        back_btn= findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity2.this,MainActivity.class));
            }
        });
    }
}