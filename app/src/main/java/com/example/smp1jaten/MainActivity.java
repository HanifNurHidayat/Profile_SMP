package com.example.smp1jaten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profileclick(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void galericlick(View view) {
        Intent intent = new Intent(this, GaleriActivity.class);
        startActivity(intent);
    }
    public void fasilitasclick(View view) {
        Intent intent = new Intent(this, FasilitasActivity.class);
        startActivity(intent);
    }
    public void organisasiclick(View view) {
        Intent intent = new Intent(this, OrganisasiActivity.class);
        startActivity(intent);
    }
    public void guruclick(View view) {
        Intent intent = new Intent(this, GuruActivity.class);
        startActivity(intent);
    }
}