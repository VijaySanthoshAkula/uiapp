package com.example.avsanthoshkumar.uiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandActivity4 extends Activity {
    private static Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stand);
        onClickButtonListner();
    }

    public void onClickButtonListner(){
        Next=findViewById(R.id.Next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.avsanthoshkumar.uiapp.WalkActivity5");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
