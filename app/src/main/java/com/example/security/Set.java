package com.example.security;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.security.Security.answer_pass;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Set extends AppCompatActivity {
    //クラスが持っているインスタンス変数｛
    private String pass_full = null;
    private int pass_one = 0;
    private StringBuilder success_pass =new StringBuilder();
    private ArrayList<Integer> pass =new ArrayList<>();
    // }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set);
        //set.xmlのボタンやテキストなどのviewを一つのフィールドに変換する｛
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
        // }

        //ワンボタンを押したときに起きる入力動作
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 1;
                setPassWord(pass_word,pass_one);
            }
        });
        //ツーボタンを押したときに起きる入力動作
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 2;
                setPassWord(pass_word,pass_one);
            }
        });
        //スリーボタンを押したときに起きる入力動作
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 3;
                setPassWord(pass_word,pass_one);
            }
        });
        //フォーボタンを押したときに起きる入力動作
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 4;
                setPassWord(pass_word,pass_one);
            }
        });
        //ファイブボタンを押したときに起きる入力動作
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 5;
                setPassWord(pass_word,pass_one);
            }
        });
        //シックスボタンを押したときに起きる入力動作
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 6;
                setPassWord(pass_word,pass_one);
            }
        });
        //セブンボタンを押したときに起きる入力動作
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 7;
                setPassWord(pass_word,pass_one);
            }
        });
        //エイトボタンを押したときに起きる入力動作
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 8;
                setPassWord(pass_word,pass_one);
            }
        });
        //ナインボタンを押したときに起きる入力動作
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 9;
                setPassWord(pass_word,pass_one);
            }
        });
        //ゼロボタンを押したときに起きる入力動作
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass_one = 0;
                setPassWord(pass_word,pass_one);
            }
        });
        //デリートボタンを押したときに起きる削除動作
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.clear();
                pass_one = 0;
                pass_full = null;
                pass_word.setText("");
            }
        });
        //エンターボタンを押したときに起きるパスワードを設定の動作
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (success_pass.length()<6){
                    pass_word.setText("文字数が足りません");
                    pass.clear();
                    pass_one = 0;
                    pass_full = null;
                }else {
                    answer_pass = pass_full;
                    System.out.println("パスワードが設定されました");
                    Intent intent = new Intent(Set.this, Security.class);
                    startActivity(intent);
                }
            }
        });
    }
    //設定中のパスワードをset.xmlのpasswordに表示させるメソッド
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