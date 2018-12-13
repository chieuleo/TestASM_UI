package com.example.chieu.testasm_ui;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChiFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_fragment);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tab1 = findViewById(R.id.tab1);
        TabItem tab2 = findViewById(R.id.tab2);


        final ViewPager vp = findViewById(R.id.viewPager);
        //truot giua cac tab
        ViewPagerAdapterChi adapter = new ViewPagerAdapterChi(getSupportFragmentManager(), tabLayout.getTabCount());
        vp.setAdapter(adapter);
        //chon cac tab
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //dong bo fragment khi vuot va khi chon tab
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
