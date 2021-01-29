package com.example.tansh.cprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Function extends AppCompatActivity implements View.OnClickListener {

    private Button function_main, value, recursion, storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        function_main=(Button)findViewById(R.id.function_basic_id);
        value=(Button)findViewById(R.id.value_id);
        recursion=(Button)findViewById(R.id.recursion_id);
        storage=(Button)findViewById(R.id.storage_id);

        function_main.getBackground().setAlpha(225);
        value.getBackground().setAlpha(225);
        recursion.getBackground().setAlpha(225);
        storage.getBackground().setAlpha(225);

        function_main.setOnClickListener(this);
        value.setOnClickListener(this);
        recursion.setOnClickListener(this);
        storage.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==function_main.getId())
        {
            Intent intent=new Intent(Function.this, Function_theory.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }
        if(v.getId()==value.getId())
        {
            Intent intent=new Intent(Function.this, Function_theory.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }
        if(v.getId()==recursion.getId())
        {
            Intent intent=new Intent(Function.this, Function_theory.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }
        if(v.getId()==storage.getId())
        {
            Intent intent=new Intent(Function.this, Function_theory.class);
            intent.putExtra("key", 3);
            startActivity(intent);
        }



    }
}
