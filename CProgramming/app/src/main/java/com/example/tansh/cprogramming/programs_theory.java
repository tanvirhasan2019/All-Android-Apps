package com.example.tansh.cprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class programs_theory extends AppCompatActivity {
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_theory);

        text1=(TextView)findViewById(R.id.text_id);

        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("key");

        if(data1==0)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("fibonacci.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==1)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("prime.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }


        if(data1==2)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("palindrome.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==3)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("factorial.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }

        if(data1==4)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("armstrong.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==5)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("sum_digit.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==6)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("reverse.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==7)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("swap.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==8)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("matrix_multiplication.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==9)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("decimal_binary.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==10)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("alphabet_triangle.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==11)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("number_traiangle.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }
        if(data1==12)
        {

            String text = "";
            try {
                InputStream inputStream = getAssets().open("num_char.txt");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                inputStream.read(buffer);
                inputStream.close();
                text = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            text1.setText(text);

        }

    }
}