package com.example.avsanthoshkumar.uiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShakeActivity2 extends AppCompatActivity {
    private static Button Next;
    private static Button shake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shake);
        onClickListenershake();
       // onClickButtonListner();
    }

    public void onClickListenershake(){
        shake=findViewById(R.id.shake);
        shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableNextButton();
            }
        });
    }

    private void enableNextButton(){
        Next=findViewById(R.id.Next);
       // Next.setBackgroundResource(R.drawable.button_active);
        Next.setClickable(true);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.avsanthoshkumar.uiapp.Sit3Activity");
                startActivity(intent);
            }
        });
    }

    public void onClickButtonListner(){
       // Next=findViewById(R.id.Next);
      /*  Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.avsanthoshkumar.uiapp.Sit3Activity");
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
