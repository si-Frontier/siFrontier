package com.example.trip_for_everyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class CardNewsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_news);

        ViewPager2 pager = findViewById(R.id.viewPager);
        pager.setOffscreenPageLimit(3);
        PagerAdapter adapter = new PagerAdapter(this);
//        Fragment page1 = new Page1();
//        Fragment page2 = new Page2();
//        Fragment page3 = new Page3();

        pager.setAdapter(adapter);
    }
}