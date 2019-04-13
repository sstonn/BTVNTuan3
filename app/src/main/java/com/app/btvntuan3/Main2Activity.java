package com.app.btvntuan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView wall_bg,one1,two2,three3,four4,five5,six6,seven7,eight8;
    Button btn_complete;
    int bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_complete=(Button)findViewById(R.id.btn_complete1);
        wall_bg=(ImageView)findViewById(R.id.wall_bg);
        one1=(ImageView)findViewById(R.id.one1);
        two2=(ImageView)findViewById(R.id.two2);
        three3=(ImageView)findViewById(R.id.three3);
        four4=(ImageView)findViewById(R.id.four4);
        five5=(ImageView)findViewById(R.id.five5);
        six6=(ImageView)findViewById(R.id.six6);
        seven7=(ImageView)findViewById(R.id.seven7);
        eight8=(ImageView)findViewById(R.id.eight8);
        one1.setOnClickListener(this);
        two2.setOnClickListener(this);
        three3.setOnClickListener(this);
        four4.setOnClickListener(this);
        five5.setOnClickListener(this);
        six6.setOnClickListener(this);
        seven7.setOnClickListener(this);
        eight8.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.one1:
                wall_bg.setImageResource(R.drawable.one);
                bg=R.drawable.one;
                break;
            case R.id.two2:
                wall_bg.setImageResource(R.drawable.two);
                bg=R.drawable.two;
                break;
            case R.id.three3:
                wall_bg.setImageResource(R.drawable.three);
                bg=R.drawable.three;
                break;
            case R.id.four4:
                wall_bg.setImageResource(R.drawable.four);
                bg=R.drawable.four;
                break;
            case R.id.five5:
                wall_bg.setImageResource(R.drawable.five);
                bg=R.drawable.five;
                break;
            case R.id.six6:
                wall_bg.setImageResource(R.drawable.six);
                bg=R.drawable.six;
                break;
            case R.id.seven7:
                wall_bg.setImageResource(R.drawable.seven);
                bg=R.drawable.seven;
                break;
            case R.id.eight8:
                wall_bg.setImageResource(R.drawable.eight);
                bg=R.drawable.eight;
                break;
        }
        btn_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(MainActivity.RESULT_CODE_SAVE2);
            }
        });
    }
    public void save(int resultCodeSave2) {
        Intent i=getIntent();
        i.putExtra("resID",bg);
        setResult(resultCodeSave2,i);
        finish();
    }
}
