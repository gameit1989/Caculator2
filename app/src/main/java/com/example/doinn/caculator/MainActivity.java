package com.example.doinn.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //khai bao so
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;
    //    khai bao phep tinh
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private Button btnBang;
    private Button btnPhay;
    //    tien ich
    private Button btnXoa;
    private Button btnAm;
    private Button btnPt;
    private TextView textKq;
    private String textEnter;
    private float kq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_01);
        textKq = (TextView) findViewById(R.id.textkq);
        textEnter = "0";
        kq = 0;
        initbuton();
        setEventClickView();
    }

    public void initbuton() {
        btnNumber0 = (Button) findViewById(R.id.btn_0);
        btnNumber1 = (Button) findViewById(R.id.btn_1);
        btnNumber2 = (Button) findViewById(R.id.btn_2);
        btnNumber3 = (Button) findViewById(R.id.btn_3);
        btnNumber4 = (Button) findViewById(R.id.btn_4);
        btnNumber5 = (Button) findViewById(R.id.btn_5);
        btnNumber6 = (Button) findViewById(R.id.btn_6);
        btnNumber7 = (Button) findViewById(R.id.btn_7);
        btnNumber8 = (Button) findViewById(R.id.btn_8);
        btnNumber9 = (Button) findViewById(R.id.btn_9);
        //
        btnCong = (Button) findViewById(R.id.btn_cong);
        btnTru = (Button) findViewById(R.id.btn_tru);
        btnNhan = (Button) findViewById(R.id.btn_nhan);
        btnChia = (Button) findViewById(R.id.btn_chia);
        btnBang = (Button) findViewById(R.id.btn_bang);
        btnPhay = (Button) findViewById(R.id.btn_phay);
        //
        btnXoa = (Button) findViewById(R.id.btn_ac);
        btnAm = (Button) findViewById(R.id.btn_am);
        btnPt = (Button) findViewById(R.id.btn_pt);
    }

    public void setEventClickView() {
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);
        //    khai bao phep tinh
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnPhay.setOnClickListener(this);
        //    tien ich
        btnXoa.setOnClickListener(this);
        btnAm.setOnClickListener(this);
        btnPt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_0:
                textEnter =textEnter + "0";
                break;

            case R.id.btn_1:
                textEnter = textEnter + "1";
                break;

            case R.id.btn_2:
                textEnter = textEnter + "2";
                break;

            case R.id.btn_3:
                textEnter = textEnter + "3";
                break;

            case R.id.btn_4:
                textEnter = textEnter + "4";
                break;

            case R.id.btn_5:
                textEnter = textEnter + "5";
                break;

            case R.id.btn_6:
                textEnter = textEnter + "6";
                break;
            case R.id.btn_7:
                textEnter = textEnter + "7";
                break;

            case R.id.btn_8:
                textEnter = textEnter + "8";
                break;

            case R.id.btn_9:
                textEnter = textEnter + "9";
                break;


            case R.id.btn_cong:
                Tinhtoan(Float.parseFloat(textEnter), "+");
//                textEnter = textEnter + "+";
                break;

            case R.id.btn_tru:
                Tinhtoan(Float.parseFloat(textEnter), "-");
//                textEnter = textEnter + "-";
                break;
            case R.id.btn_nhan:
                Tinhtoan(Float.parseFloat(textEnter), "*");
//                textEnter = textEnter + "*";
                break;
            case R.id.btn_chia:
                Tinhtoan(Float.parseFloat(textEnter), ":");
//                textEnter = textEnter + "/";
                break;
            case R.id.btn_bang:
                Tinhtoan(Float.parseFloat(textEnter), "=");
                break;
            case R.id.btn_phay:
                break;
            case R.id.btn_ac:
                textKq.setText("");
                break;
            case R.id.btn_pt:

                break;

        }
        Log.d("a=",String.valueOf(textEnter));
//        number1 =Float.parseFloat(textEnter);
            //textKq.setText(String.valueOf(textEnter));

    }

    public void Tinhtoan(float a, String b) {

        switch (b) {
            case "+":
                kq = kq + a;

                break;
            case "-":
                kq = kq - a;

                break;
            case "*":
                kq = kq * a;

                break;
            case ":":
                kq = kq /a;

                break;
            case "=":
                kq=kq;
                textKq.setText(String.valueOf(kq));
                break;
        }

        Log.d("kq",String.valueOf(kq));

        textEnter="0";
        //textKq.setText("aaa");
//        Log.d("kq",String.valueOf(kq));
//        textKq.setText(String.valueOf(kq));

    }
}
