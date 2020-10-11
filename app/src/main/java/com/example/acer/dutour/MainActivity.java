package com.example.acer.dutour;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mtoggle;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.isbt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is= new Intent(MainActivity.this,MapISBT.class);
                startActivity(is);
            }
        });
        button =(Button) findViewById(R.id.rs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rs= new Intent(MainActivity.this,MapRailway.class);
                startActivity(rs);
            }
        });
        button =(Button) findViewById(R.id.ct);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ct= new Intent(MainActivity.this,MapCTower.class);
                startActivity(ct);
            }
        });
        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer);
        mtoggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.Open,R.string.Close);
        mDrawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        NavigationView nvdrawer = (NavigationView) findViewById(R.id.nv);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(nvdrawer);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (mtoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


public  void selectItemDrawer (MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.id_home:
                Intent hm = new Intent(MainActivity.this,MainActivity.class);
                startActivity(hm);
                break;
        }

    android.support.v4.app.Fragment myFragment = null;
    Class fragmentClass;
    switch (menuItem.getItemId()) {

        /*case R.id.id_home:
            Intent hm=new Intent(MainActivity.this,MainActivity.class);
            startActivity(hm);
            break;*/

        case R.id.id_location:
            fragmentClass = Locations.class;
            break;
        case R.id.id_directions:
            fragmentClass = GetDirections.class;
            break;
        case R.id.id_about:
            fragmentClass = About.class;
            break;
        case R.id.id_feedback:
            fragmentClass = Feedback.class;
            break;
        default:
            fragmentClass = Locations.class;
    }
    try {
        myFragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();
    } catch (Exception e) {
        e.printStackTrace();
    }
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.f1content,myFragment).commit();
    menuItem.setChecked(true);
    setTitle(menuItem.getTitle());
    mDrawerLayout.closeDrawers();

}



    private void setupDrawerContent(NavigationView navigationView){
    navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            selectItemDrawer(item);
            return true;
        }
    });
   }








}
