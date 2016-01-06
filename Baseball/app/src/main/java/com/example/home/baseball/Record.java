package com.example.home.baseball;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.MessageDigest;
import java.text.DecimalFormat;

public class Record extends AppCompatActivity {

    private Button btn,back;
    public TextView t_ab,t_h,t_walk,t_sh,t_err,t_outs,t_tc,result,result1;
    public Bundle data;
    double ab,h,w,sh,e,avg,outs,tc,out;
    public DecimalFormat nf,nf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        nf = new DecimalFormat("0.00");
        ////設定
        t_ab=(EditText)findViewById(R.id.ab);
        t_h=(EditText)findViewById(R.id.h);
        t_walk=(EditText)findViewById(R.id.w);
        t_sh=(EditText)findViewById(R.id.sh);
        t_err=(EditText)findViewById(R.id.e);
         t_outs=(EditText)findViewById(R.id.outs);
         t_tc=(EditText)findViewById(R.id.tc);
        /////

         result =(TextView)findViewById(R.id.tv_avg_show);
         result1 =(TextView)findViewById(R.id.tv_da_show);

        data = getIntent().getExtras();
        switch (data.getInt("id")){
            case 1:
                t_ab.setText(String.valueOf(data.getDouble("ab1")));
                t_h.setText(String.valueOf(data.getDouble("h1")));
                t_walk.setText(String.valueOf(data.getDouble("walk1")));
                t_sh.setText(String.valueOf(data.getDouble("sh1")));
                t_err.setText(String.valueOf(data.getDouble("err1")));
                t_outs.setText(String.valueOf(data.getDouble("outs1")));
                t_tc.setText(String.valueOf(data.getDouble("tc1")));

                break;
            case 2:
                t_ab.setText(String.valueOf(data.getDouble("ab2")));
                t_h.setText(String.valueOf(data.getDouble("h2")));
                t_walk.setText(String.valueOf(data.getDouble("walk2")));
                t_sh.setText(String.valueOf(data.getDouble("sh2")));
                t_err.setText(String.valueOf(data.getDouble("err2")));
                t_outs.setText(String.valueOf(data.getDouble("outs2")));
                t_tc.setText(String.valueOf(data.getDouble("tc2")));
                break;
            case 3:
                t_ab.setText(String.valueOf(data.getDouble("ab3")));
                t_h.setText(String.valueOf(data.getDouble("h3")));
                t_walk.setText(String.valueOf(data.getDouble("walk3")));
                t_sh.setText(String.valueOf(data.getDouble("sh3")));
                t_err.setText(String.valueOf(data.getDouble("err3")));
                t_outs.setText(String.valueOf(data.getDouble("outs3")));
                t_tc.setText(String.valueOf(data.getDouble("tc3")));
                break;
            case 4:
                t_ab.setText(String.valueOf(data.getDouble("ab4")));
                t_h.setText(String.valueOf(data.getDouble("h4")));
                t_walk.setText(String.valueOf(data.getDouble("walk4")));
                t_sh.setText(String.valueOf(data.getDouble("sh4")));
                t_err.setText(String.valueOf(data.getDouble("err4")));
                t_outs.setText(String.valueOf(data.getDouble("outs4")));
                t_tc.setText(String.valueOf(data.getDouble("tc4")));
                break;
            case 5:
                t_ab.setText(String.valueOf(data.getDouble("ab5")));
                t_h.setText(String.valueOf(data.getDouble("h5")));
                t_walk.setText(String.valueOf(data.getDouble("walk5")));
                t_sh.setText(String.valueOf(data.getDouble("sh5")));
                t_err.setText(String.valueOf(data.getDouble("err5")));
                t_outs.setText(String.valueOf(data.getDouble("outs5")));
                t_tc.setText(String.valueOf(data.getDouble("tc5")));
                break;
            case 6:
                t_ab.setText(String.valueOf(data.getDouble("ab6")));
                t_h.setText(String.valueOf(data.getDouble("h6")));
                t_walk.setText(String.valueOf(data.getDouble("walk6")));
                t_sh.setText(String.valueOf(data.getDouble("sh6")));
                t_err.setText(String.valueOf(data.getDouble("err6")));
                t_outs.setText(String.valueOf(data.getDouble("outs6")));
                t_tc.setText(String.valueOf(data.getDouble("tc6")));
                break;
            case 7:
                t_ab.setText(String.valueOf(data.getDouble("ab7")));
                t_h.setText(String.valueOf(data.getDouble("h7")));
                t_walk.setText(String.valueOf(data.getDouble("walk7")));
                t_sh.setText(String.valueOf(data.getDouble("sh7")));
                t_err.setText(String.valueOf(data.getDouble("err7")));
                t_outs.setText(String.valueOf(data.getDouble("outs7")));
                t_tc.setText(String.valueOf(data.getDouble("tc7")));
                break;
            case 8:
                t_ab.setText(String.valueOf(data.getDouble("ab8")));
                t_h.setText(String.valueOf(data.getDouble("h8")));
                t_walk.setText(String.valueOf(data.getDouble("walk8")));
                t_sh.setText(String.valueOf(data.getDouble("sh8")));
                t_err.setText(String.valueOf(data.getDouble("err8")));
                t_outs.setText(String.valueOf(data.getDouble("outs8")));
                t_tc.setText(String.valueOf(data.getDouble("tc8")));
                break;
            case 9:
                t_ab.setText(String.valueOf(data.getDouble("ab9")));
                t_h.setText(String.valueOf(data.getDouble("h9")));
                t_walk.setText(String.valueOf(data.getDouble("walk9")));
                t_sh.setText(String.valueOf(data.getDouble("sh9")));
                t_err.setText(String.valueOf(data.getDouble("err9")));
                t_outs.setText(String.valueOf(data.getDouble("outs9")));
                t_tc.setText(String.valueOf(data.getDouble("tc9")));
                break;

            default:
                break;
        }

        ////////按鈕偵測&執行
        btn=(Button)findViewById(R.id.btok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /////////抓資料&轉型態
                 ab=Double.parseDouble(t_ab.getText().toString());
                 h=Double.parseDouble(t_h.getText().toString());
                w=Double.parseDouble(t_walk.getText().toString());
                sh=Double.parseDouble(t_sh.getText().toString());
                e=Double.parseDouble(t_err.getText().toString());
                outs=Double.parseDouble(t_outs.getText().toString());
                tc=Double.parseDouble(t_tc.getText().toString());
                ///////////////////

                avg= h/ab;

                result.setText(nf.format(avg));


                nf1 = new DecimalFormat("0.00");


                 out= outs/tc;


                result1.setText(nf1.format(out));

                Log.d("data", "two:" + String.valueOf(data.getDouble("out1")));

                ////////////////////

            }
        });



    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            switch (data.getInt("id")){
                case 1:
                    data.putDouble("ab1", ab);
                    data.putDouble("h1", h);
                    data.putDouble("walk1", w);
                    data.putDouble("sh1", sh);
                    data.putDouble("err1", e);
                    data.putDouble("outs1", outs);
                    data.putDouble("tc1", tc);

                    break;
                case 2:
                    data.putDouble("ab2", ab);
                    data.putDouble("h2", h);
                    data.putDouble("walk2", w);
                    data.putDouble("sh2", sh);
                    data.putDouble("err2", e);
                    data.putDouble("outs2", outs);
                    data.putDouble("tc2", tc);
                    break;
                case 3:
                    data.putDouble("ab3", ab);
                    data.putDouble("h3", h);
                    data.putDouble("walk3", w);
                    data.putDouble("sh3", sh);
                    data.putDouble("err3", e);
                    data.putDouble("outs3", outs);
                    data.putDouble("tc3", tc);

                    break;
                case 4:
                    data.putDouble("ab4", ab);
                    data.putDouble("h4", h);
                    data.putDouble("walk4", w);
                    data.putDouble("sh4", sh);
                    data.putDouble("err4", e);
                    data.putDouble("outs4", outs);
                    data.putDouble("tc4", tc);
                    break;
                case 5:
                    data.putDouble("ab5", ab);
                    data.putDouble("h5", h);
                    data.putDouble("walk5", w);
                    data.putDouble("sh5", sh);
                    data.putDouble("err5", e);
                    data.putDouble("outs5", outs);
                    data.putDouble("tc5", tc);

                    break;
                case 6:
                    data.putDouble("ab6", ab);
                    data.putDouble("h6", h);
                    data.putDouble("walk6", w);
                    data.putDouble("sh6", sh);
                    data.putDouble("err6", e);
                    data.putDouble("outs6", outs);
                    data.putDouble("tc6", tc);
                    break;
                case 7:
                    data.putDouble("ab7", ab);
                    data.putDouble("h7", h);
                    data.putDouble("walk7", w);
                    data.putDouble("sh7", sh);
                    data.putDouble("err7", e);
                    data.putDouble("outs7", outs);
                    data.putDouble("tc7", tc);

                    break;
                case 8:
                    data.putDouble("ab8", ab);
                    data.putDouble("h8", h);
                    data.putDouble("walk8", w);
                    data.putDouble("sh8", sh);
                    data.putDouble("err8", e);
                    data.putDouble("outs8", outs);
                    data.putDouble("tc8", tc);
                    break;
                case 9:
                    data.putDouble("ab9", ab);
                    data.putDouble("h9", h);
                    data.putDouble("walk9", w);
                    data.putDouble("sh9", sh);
                    data.putDouble("err9", e);
                    data.putDouble("outs9", outs);
                    data.putDouble("tc9", tc);
                    break;
                default:
                    break;
            }


            Intent i = new Intent();
            i.putExtras(data);
            setResult(001,i);
            finish();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


}
