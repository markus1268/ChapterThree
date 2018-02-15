package com.linsoft.chapterthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNext = (Button) findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(v.getContext(), NextActivity.class);
                v.getContext().startActivity(i);
            }
        });

        Button buttonTab = (Button) findViewById(R.id.btnTab);
        buttonTab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(v.getContext(), TabbedActivity.class);
                v.getContext().startActivity(i);
            }
        });

    }
}
