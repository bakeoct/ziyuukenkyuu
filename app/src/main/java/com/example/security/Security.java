package com.example.security;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Security extends AppCompatActivity {
    private String pass_full = null;
    protected static String answer_pass = null;
    private int pass_one = 0;
    private StringBuilder success_pass =new StringBuilder();
    private ArrayList<Integer> pass =new ArrayList<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.security);
            Button one = findViewById(R.id.one);
            Button two = findViewById(R.id.two);
            Button three = findViewById(R.id.three);
            Button four = findViewById(R.id.four);
            Button five = findViewById(R.id.five);
            Button six = findViewById(R.id.six);
            Button seven = findViewById(R.id.seven);
            Button eight = findViewById(R.id.eight);
            Button nine = findViewById(R.id.nine);
            Button zero = findViewById(R.id.zero);
            Button delete = findViewById(R.id.delete);
            Button enter = findViewById(R.id.enter);
            TextView pass_word = findViewById(R.id.password);

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   pass_one=1;
                    setPassWord(pass_word,pass_one);
                }
            });
            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=2;
                    setPassWord(pass_word,pass_one);
                }
            });
            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=3;
                    setPassWord(pass_word,pass_one);
                }
            });
            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=4;
                    setPassWord(pass_word,pass_one);
                }
            });
            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=5;
                    setPassWord(pass_word,pass_one);
                }
            });
            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=6;
                    setPassWord(pass_word,pass_one);
                }
            });
            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=7;
                    setPassWord(pass_word,pass_one);
                }
            });
            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=8;
                    setPassWord(pass_word,pass_one);
                }
            });
            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=9;
                    setPassWord(pass_word,pass_one);
                }
            });
            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass_one=0;
                    setPassWord(pass_word,pass_one);
                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass.clear();
                    pass_one = 0;
                    pass_full = null;
                    pass_word.setText("");
                }
            });
            enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (pass_full.equals(answer_pass)){
                        pass_word.setText("ロックが解除されました");
                    }else {
                        pass_word.setText("パスワードが違います");
                    }
                }
            });
        }
    public void setPassWord(TextView pass_word,int pass_one){
        success_pass =new StringBuilder();
        if (pass.size()<6){
            pass.add(pass_one);
            for (int i=0;i<pass.size();i++) {
                success_pass.append(pass.get(i));
                pass_full = success_pass.toString();
            }
            pass_word.setText(pass_full);
        }else {
            pass_word.setText("文字数が上限を超えています");
        }
    }
}
