package com.example.smp1jaten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class OrganisasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organisasi);
    }
    public void osisclick(View view) {
        Intent intent = new Intent(this, PIeceOrganisasiActivity1.class);
        startActivity(intent);
    }

    public void pmrclick(View view) {
        Intent intent = new Intent(this, PIeceOrganisasi2.class);
        startActivity(intent);
    }

    public void pramukaclick(View view) {
        Intent intent = new Intent(this, PIeceOrganisasi3.class);
        startActivity(intent);
    }
}