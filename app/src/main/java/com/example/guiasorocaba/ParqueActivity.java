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

public class ParqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque);
    }
    public void btnTelefonePq(View view) {
        Uri uri = Uri.parse("tel: 153228-1256 ");
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
    public void btnMapaPq(View view){
        Uri uri = Uri.parse("google.navigation:q=Avenida+03+de+março,+nº+1025+–+Alto+da+Boa+Vista");
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

    public void btnSitePq(View view){
        Uri webpage = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

}