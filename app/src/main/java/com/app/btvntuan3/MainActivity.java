package com.app.btvntuan3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_change_bg,btn_change_text;
    TextView text_view;
    ImageView bg_image;
    private static final int BACKGROUND_ID= 1,TILTE_ID=2;
    public static final int RESULT_CODE_SAVE1=115;
    public static final int RESULT_CODE_SAVE2=116;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg_image=(ImageView)findViewById(R.id.bg_image);
        text_view=(TextView)findViewById(R.id.text_view);
        btn_change_bg=(Button)findViewById(R.id.btn_change_bg);
        btn_change_text=(Button)findViewById(R.id.btn_change_text);
        btn_change_bg.setOnClickListener(this);
        btn_change_text.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case(R.id.btn_change_bg):
                Intent i=new Intent(this,Main2Activity.class);
                startActivityForResult(i,BACKGROUND_ID);
                break;
            case (R.id.btn_change_text):
                Intent in=new Intent(this,Main3Activity.class);
                startActivityForResult(in,TILTE_ID);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==BACKGROUND_ID){
            if(resultCode==RESULT_CODE_SAVE2){
                int ValueBg=data.getIntExtra("resID",0);
                bg_image.setImageResource(ValueBg);
            }
        }
        if(requestCode==TILTE_ID ){
            if(resultCode==RESULT_CODE_SAVE1){
                int ValueColor=data.getIntExtra("colorValue",0);
                String strTitle=data.getStringExtra("title");
                text_view.setText(strTitle);
                switch (ValueColor){
                    case 1:
                        text_view.setTextColor(getResources().getColor(R.color.one));
                        break;
                    case 2:
                        text_view.setTextColor(getResources().getColor(R.color.two));
                        break;
                    case 3:
                        text_view.setTextColor(getResources().getColor(R.color.three));
                        break;
                    case 4:
                        text_view.setTextColor(getResources().getColor(R.color.four));
                        break;
                    case 5:
                        text_view.setTextColor(getResources().getColor(R.color.five));
                        break;
                }

            }


        }
        }
    }
