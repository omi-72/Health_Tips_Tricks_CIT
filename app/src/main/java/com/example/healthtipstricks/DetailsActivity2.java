package com.example.healthtipstricks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity2 extends AppCompatActivity {

    ImageView img;
    TextView title, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        img= findViewById(R.id.img);
        title= findViewById(R.id.title);
        title= findViewById(R.id.desc);
    }
}