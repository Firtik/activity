package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, AddData.class);
        startActivity(intent);
    }
    public void Exit(View view){
        Toast toast = Toast.makeText(this, "Заходите снова!",Toast.LENGTH_LONG);
        toast.show();
        this.finish();
    }
}