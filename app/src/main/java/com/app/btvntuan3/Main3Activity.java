package com.app.btvntuan3;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView color_bg,one,two,three,four,five;
    EditText edt_text;
    Button btn_complete;
    int color_value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn_complete=(Button)findViewById(R.id.btn_complete2);
        edt_text=(EditText)findViewById(R.id.edt_text);
        color_bg=(ImageView)findViewById(R.id.color_bg);
        one=(ImageView)findViewById(R.id.one);
        two=(ImageView)findViewById(R.id.two);
        three=(ImageView)findViewById(R.id.three);
        four=(ImageView)findViewById(R.id.four);
        five=(ImageView)findViewById(R.id.five);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        btn_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(MainActivity.RESULT_CODE_SAVE1);
            }
        });
    }

    public void save(int resultCodeSave1) {
        Intent i=getIntent();
        String newTile=edt_text.getText().toString();
        if(edt_text.getText().equals("")){
            Toast.makeText(this, "Please fill", Toast.LENGTH_SHORT).show();
        }
            i.putExtra("title",newTile);
            i.putExtra("colorValue",color_value);
            setResult(resultCodeSave1,i);
            finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one:
                color_bg.setBackgroundColor(getResources().getColor(R.color.one));
                color_value=1;
                break;
            case R.id.two:
                color_bg.setBackgroundColor(getResources().getColor(R.color.two));
                color_value=2;
                break;
            case R.id.three:
                color_bg.setBackgroundColor(getResources().getColor(R.color.three));
                color_value=3;
                break;
            case R.id.four:
                color_bg.setBackgroundColor(getResources().getColor(R.color.four));
                color_value=4;
                break;
            case R.id.five:
                color_bg.setBackgroundColor(getResources().getColor(R.color.five));
                color_value=5;
                break;
        }
    }

}
