package com.example.healthtipstricks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Data> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recycler);

        dataList= new ArrayList<>();

        dataList.add(new Data(R.drawable.ic_excrecises,"Exercises","You don’t need to get all your exercise at one time. Ten minutes morning, noon, and night can give much of the same benefit as 30 minutes all at once.\n Finding a workout partner can help keep you on track and motivate you to get out the door.\n Set aside a specific time in your schedule to exercise and put it in your planner."));
        dataList.add(new Data(R.drawable.ic_hamburger,"Diet","If you're like many people, you don't mind changing your eating habits and you aren't even bothered by the workouts you need to do to lose weight. But you'd like to lose weight faster.\n Waiting for weeks to see results on the scale is not fun.\n Keep vegetable and fruit portions full-sized. But cut starches (like potatoes, bread, and rice), protein (this is usually meat), and sweets in half."));
        dataList.add(new Data(R.drawable.ic_meditation_women_small,"Meditation","If you’re an overthinker, you may have come to believe meditation isn’t for you. But according to experts, successful meditation is possible, even for people with busy minds.\n As with any other good habit, practice makes perfect when it comes to calming our thoughts.\n Choosing a regular time of day is a simple step toward training your brain that it’s time to chill. "));
        dataList.add(new Data(R.drawable.ic_yoga,"Yoga","The fact that you’re interested in starting a yoga class is a step in the right direction. There are many ways that you can make your yoga practice work for you, even if you only have a few minutes each day to dedicate to it. Use these yoga beginner tips as a jumping-off point to get started. You do not need to use all of them—allow your yoga practice to naturally grow and develop over time."));

    }
}