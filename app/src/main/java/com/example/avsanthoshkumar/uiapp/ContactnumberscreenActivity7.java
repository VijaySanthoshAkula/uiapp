package com.example.avsanthoshkumar.uiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactnumberscreenActivity7 extends AppCompatActivity {
    private static Button Save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.contactnumberscreen);
            onClickButtonListner();
        }
    public void onClickButtonListner(){
        Save=findViewById(R.id.Save);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.avsanthoshkumar.uiapp.FinalActivity8");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    }

