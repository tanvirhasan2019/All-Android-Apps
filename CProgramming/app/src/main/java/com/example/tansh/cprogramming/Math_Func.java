package com.example.tansh.cprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Math_Func extends AppCompatActivity {
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math__func);
        text1=(TextView)findViewById(R.id.text_id);
        String text = "";
        try {
            InputStream inputStream = getAssets().open("func_function_main.txt");
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
