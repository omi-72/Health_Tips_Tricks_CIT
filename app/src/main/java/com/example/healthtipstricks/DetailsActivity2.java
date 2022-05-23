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
    int i_img;
    String i_title, i_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        img= findViewById(R.id.img);
        title= findViewById(R.id.title);
        desc= findViewById(R.id.desc);
        back_btn= findViewById(R.id.back_btn);

        intent= getIntent();

        if (intent.hasExtra("img")){
           i_img=  intent.getIntExtra("img", 1);
           i_title=  intent.getStringExtra("title");
           i_desc= intent.getStringExtra("desc");
        }

        img.setImageResource(i_img);
        title.setText(i_title);
        desc.setText(i_desc);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity2.this,MainActivity.class));
            }
        });
    }
}