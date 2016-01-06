package com.example.home.baseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KeyName extends AppCompatActivity {
        ///////定義
    EditText catcher;
    EditText pitcher;
    EditText base1;
    EditText base2;
    EditText base3;
    EditText ss;
    EditText lf;
    EditText cf;
    EditText rf;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_name);

        ///////////判斷按鈕///////////
        btn =(Button) findViewById(R.id.btok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ////////////////////設定名字///////////

                catcher =(EditText) findViewById(R.id.etch);
                String tempc = catcher.getText().toString();

                pitcher =(EditText) findViewById(R.id.etpc);
                String tempp = pitcher.getText().toString();

                base1 =(EditText) findViewById(R.id.etb1);
                String tempb1 = base1.getText().toString();

                base2 =(EditText) findViewById(R.id.etb2);
                String tempb2 = base2.getText().toString();

                base3 =(EditText) findViewById(R.id.etb3);
                String tempb3 = base3.getText().toString();

                ss =(EditText) findViewById(R.id.etss);
                String tempss = ss.getText().toString();

                lf =(EditText) findViewById(R.id.etlf);
                String templf = lf.getText().toString();

                cf =(EditText) findViewById(R.id.etcf);
                String tempcf = cf.getText().toString();

                rf =(EditText) findViewById(R.id.etrf);
                String temrlf = rf.getText().toString();


                //////////////準備跳畫面//////////////

                Intent i = new Intent();
                Bundle b = new Bundle();

                b.putString("c_level",tempc);
                b.putString("p_level",tempp);
                b.putString("b1_level",tempb1);
                b.putString("b2_level",tempb2);
                b.putString("b3_level",tempb3);
                b.putString("ss_level",tempss);
                b.putString("lf_level",templf);
                b.putString("cf_level",tempcf);
                b.putString("rf_level",temrlf);

                i.putExtras(b);

                i.setClass(KeyName.this,position.class);

                startActivity(i);

            }
        });



    }

}
