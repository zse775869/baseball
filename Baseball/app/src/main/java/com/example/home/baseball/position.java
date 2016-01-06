package com.example.home.baseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class position extends AppCompatActivity {
    /////定義
    Button catcher;
    Button pitcher;
    Button base1;
    Button base2;
    Button ss;
    Button base3;
    Button lf;
    Button cf;
    Button rf;

    Bundle D1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);
        D1 = new Bundle();

        catcher =(Button) findViewById(R.id.btch);
        pitcher=(Button) findViewById(R.id.btpc);
        base1=(Button) findViewById(R.id.btb1);
        base2=(Button) findViewById(R.id.btb2);
        base3=(Button) findViewById(R.id.btb3);
        ss=(Button) findViewById(R.id.btss);
        lf=(Button) findViewById(R.id.btlf);
        cf=(Button) findViewById(R.id.btcf);
        rf=(Button) findViewById(R.id.btrf);


        //////接收資料
        Bundle b = getIntent().getExtras();
        if(b != null)
        {

            ///////更改button名稱
            catcher.setText(b.getString("c_level"));
            pitcher.setText(b.getString("p_level"));
            base1.setText(b.getString("b1_level"));
            base2.setText(b.getString("b2_level"));
            base3.setText(b.getString("b3_level"));
            ss.setText(b.getString("ss_level"));
            lf.setText(b.getString("lf_level"));
            cf.setText(b.getString("cf_level"));
            rf.setText(b.getString("rf_level"));

        }

        /////////按鈕跳畫面 資料////
        catcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",1);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        pitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",2);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        base1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",3);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        base2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",4);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",5);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        base3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id", 6);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        lf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",7);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",8);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });

        rf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1.putInt("id",9);
                Intent i =new Intent();
                i.setClass(position.this,Record.class);
                i.putExtras(D1);
                startActivityForResult(i, 0);
            }
        });




    }
    protected void onActivityResult(int requstCode, int resultCode, Intent data){
        if(requstCode == 0){
            if(resultCode == 001) {
                D1 = data.getExtras();
            }
        }
    }





}


