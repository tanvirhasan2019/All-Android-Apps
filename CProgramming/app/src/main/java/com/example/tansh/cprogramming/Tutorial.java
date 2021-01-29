package com.example.tansh.cprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class Tutorial extends AppCompatActivity implements View.OnClickListener {

private LinearLayout control, function, array, pointer, memory, strings, mathfunc, structure, file, preprocessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        control=(LinearLayout)findViewById(R.id.control_id);
        function=(LinearLayout)findViewById(R.id.function_id);
        array=(LinearLayout)findViewById(R.id.array_id);
        pointer=(LinearLayout)findViewById(R.id.pointer_id);
        memory=(LinearLayout)findViewById(R.id.memory_allocation_id);
        structure=(LinearLayout)findViewById(R.id.structure_id);
        file=(LinearLayout)findViewById(R.id.file_id);
        preprocessor=(LinearLayout)findViewById(R.id.preprocessor_id);
        strings=(LinearLayout)findViewById(R.id.string_id);
        mathfunc=(LinearLayout)findViewById(R.id.math_func_id);






        control.getBackground().setAlpha(100);
        function.getBackground().setAlpha(100);

        control.setOnClickListener(this);
        function.setOnClickListener(this);
        array.setOnClickListener(this);
        pointer.setOnClickListener(this);
        strings.setOnClickListener(this);
        structure.setOnClickListener(this);
        file.setOnClickListener(this);
        preprocessor.setOnClickListener(this);
        mathfunc.setOnClickListener(this);
        memory.setOnClickListener(this);








    }

    @Override
    public void onClick(View v) {

        if(v.getId()==control.getId())
        {
            Intent intent=new Intent(Tutorial.this, Control.class);
            startActivity(intent);
        }

        if(v.getId()==function.getId())
        {
            Intent intent=new Intent(Tutorial.this, Function.class);
            startActivity(intent);
        }

        if(v.getId()==array.getId())
        {
            Intent intent=new Intent(Tutorial.this, Array.class);
            startActivity(intent);
        }
        if(v.getId()==pointer.getId())
        {
            Intent intent=new Intent(Tutorial.this, Pointer.class);
            startActivity(intent);
        }
        if(v.getId()==memory.getId())
        {
            Intent intent=new Intent(Tutorial.this, Memory_allocation.class);
            startActivity(intent);
        }

        if(v.getId()==strings.getId())
        {
            Intent intent=new Intent(Tutorial.this, String_main.class);
            startActivity(intent);
        }

        if(v.getId()==mathfunc.getId())
        {
            Intent intent=new Intent(Tutorial.this, Math_Func.class);
            startActivity(intent);
        }
        if(v.getId()==structure.getId())
        {
            Intent intent=new Intent(Tutorial.this, Structure_main.class);
            startActivity(intent);
        }
        if(v.getId()==file.getId())
        {
            Intent intent=new Intent(Tutorial.this, File_hand_main.class);
            startActivity(intent);
        }
        if(v.getId()==preprocessor.getId())
        {
            Intent intent=new Intent(Tutorial.this, Preprocessor_main.class);
            startActivity(intent);
        }
    }
}
