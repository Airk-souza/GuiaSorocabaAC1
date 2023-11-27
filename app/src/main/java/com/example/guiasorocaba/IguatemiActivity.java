package com.example.guiasorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class IguatemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi);
    }
    public void btnTelefone(View view) {
        Uri uri = Uri.parse("tel: 153219-9900");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    android.Manifest.permission.CALL_PHONE}, 1);
        } else {
            startActivity(intent);
        }
    }
    public void btnNavegacao(View view){
        Uri uri = Uri.parse("google.navigation:q=AV+IZORAIDA+MARQUES+PERES,+401");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.INTERNET);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.INTERNET}, 1);
        } else {
            startActivity(intent);
        }
        //startActivity(intent);
    }

    public void btnSite(View view){
        Uri webpage = Uri.parse("https://iguatemi.com.br/esplanada/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

}