package com.example.guiasorocaba;

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

    public void infoIguatemi(View view){
        Intent intent = new Intent(this, IguatemiActivity.class);
        startActivity(intent);
    }

    public void infoParque(View view){
        Intent intent = new Intent(this, ParqueActivity.class);
        startActivity(intent);
    }

    public void infoZoo(View view){
        Intent intent = new Intent(this, ZooActivity.class);
        startActivity(intent);
    }
}