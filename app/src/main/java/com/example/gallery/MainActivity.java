package com.example.gallery;

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

    public void onViewByDateClick(View view){
        Intent intent = new Intent(this,ViewByDateActivity.class);
        startActivity(intent);
    }

    public void onViewAllClick(View view){
        Intent intent = new Intent(this,ViewAllActivity.class);
        startActivity(intent);
    }

    public void onViewByAlbumClick(View view){
        Intent intent = new Intent(this,ViewByAlbumActivity.class);
        startActivity(intent);
    }
}