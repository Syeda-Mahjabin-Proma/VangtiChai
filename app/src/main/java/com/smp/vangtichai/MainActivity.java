package com.smp.vangtichai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView reset_text_1000;
    private TextView reset_text_500;
    private TextView reset_text_200;
    private TextView reset_text_100;
    private TextView reset_text_50;
    private TextView reset_text_20;
    private TextView reset_text_10;
    private TextView reset_text_5;
    private TextView reset_text_2;
    private TextView reset_text_1;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_clear;
    private TextView reset_text_taka;
    public String total_taka = "";
    private String return_money = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total_taka = "";
        findviews();
        setUpButtonOnClickListener();

        if (savedInstanceState !=null) {
            String getBackTaka = savedInstanceState.getString("totalTaka");
            calculation(add_taka(Integer.parseInt(getBackTaka)));
        }

    }
    private void findviews() {
        reset_text_1000 = findViewById(R.id.taka_1000);
        reset_text_500 = findViewById(R.id.taka_500);
        reset_text_200 = findViewById(R.id.taka_200);
        reset_text_100 = findViewById(R.id.taka_100);
        reset_text_50 = findViewById(R.id.taka_50);
        reset_text_20 = findViewById(R.id.taka_20);
        reset_text_10 = findViewById(R.id.taka_10);
        reset_text_5 = findViewById(R.id.taka_5);
        reset_text_2 = findViewById(R.id.taka_2);
        reset_text_1 = findViewById(R.id.taka_1);
        button_0 = findViewById(R.id.button0);
        button_1 = findViewById(R.id.button1);
        button_3 = findViewById(R.id.button3);
        button_2 = findViewById(R.id.button2);
        button_4 = findViewById(R.id.button4);
        button_5 = findViewById(R.id.button5);
        button_6 = findViewById(R.id.button6);
        button_7 = findViewById(R.id.button7);
        button_8 = findViewById(R.id.button8);
        button_9 = findViewById(R.id.button9);
        button_clear = findViewById(R.id.buttonclear);
        reset_text_taka = findViewById(R.id.text_view_taka);
    }
    private void setUpButtonOnClickListener() {
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(0);
                calculation(return_money);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(1);
                calculation(return_money);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(2);
                calculation(return_money);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(3);
                calculation(return_money);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(4);
                calculation(return_money);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(5);
                calculation(return_money);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(6);
                calculation(return_money);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(7);
                calculation(return_money);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(8);
                calculation(return_money);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_money = add_taka(9);
                calculation(return_money);
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                total_taka = "";
                reset_text_taka.setText(total_taka);
                reset_text_1.setText("1 :0");
                reset_text_2.setText("2 :0");
                reset_text_5.setText("5 :0");
                reset_text_10.setText("10 :0");
                reset_text_20.setText("20 :0");
                reset_text_50.setText("50 :0");
                reset_text_100.setText("100 :0");
                reset_text_200.setText("200 :0");
                reset_text_500.setText("500 :0");
                reset_text_1000.setText("1000 :0");
            }
        });
    }
    private String add_taka(int i) {
        String s = Integer.toString(i);
        total_taka = total_taka + s;
        reset_text_taka.setText(total_taka);
        return total_taka;
    }
    private void calculation(String returnMoney) {

        int change;
        int calculate_money = Integer.parseInt(returnMoney);

        int note_1000 = Math.floorDiv(calculate_money,1000);
        change = calculate_money%1000;
        reset_text_1000.setText("1000: "+ note_1000);

        int note_500 = Math.floorDiv(change,500);
        change = change%500;
        reset_text_500.setText("500: "+ note_500);

        int note_200 = Math.floorDiv(change,200);
        change = change%200;
        reset_text_200.setText("200: "+ note_200);

        int note_100 = Math.floorDiv(change,100);
        change = change%100;
        reset_text_100.setText("100: "+note_100);

        int note_50 = Math.floorDiv(change,50);
        change = change%50;
        reset_text_50.setText("50: "+note_50);

        int note_20 = Math.floorDiv(change,20);
        change = change%20;
        reset_text_20.setText("20: "+note_20);

        int note_10 = Math.floorDiv(change,10);
        change = change%10;
        reset_text_10.setText("10: "+note_10);

        int note_5 = Math.floorDiv(change,5);
        change = change%5;
        reset_text_5.setText("5: "+note_5);

        int note_2 = Math.floorDiv(change,2);
        change = change%2;
        reset_text_2.setText("2: "+note_2);

        int note_1 = Math.floorDiv(change,1);
        reset_text_1.setText("1: "+note_1);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("totalTaka", total_taka);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("totalTaka");
        reset_text_taka.setText(total_taka);
    }



}
