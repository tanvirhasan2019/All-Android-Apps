package com.example.tansh.cprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button history, tutorial, program, exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        history=(Button)findViewById(R.id.history_id);
        tutorial=(Button)findViewById(R.id.tutorial_id);
        program=(Button)findViewById(R.id.program_id);
        exam=(Button)findViewById(R.id.exam_id);

        history.getBackground().setAlpha(220);
        tutorial.getBackground().setAlpha(220);
        program.getBackground().setAlpha(220);
        exam.getBackground().setAlpha(220);

        history.setOnClickListener(this);
        tutorial.setOnClickListener(this);
        program.setOnClickListener(this);
        exam.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==history.getId())
        {
            Intent intent=new Intent(MainActivity.this, History.class);
            startActivity(intent);
        }

        if(v.getId()==tutorial.getId())
        {
            Intent intent=new Intent(MainActivity.this, Tutorial.class);
            startActivity(intent);
        }

        if(v.getId()==program.getId())
        {
            Intent intent=new Intent(MainActivity.this, programs_problem.class);
            startActivity(intent);
        }
        if(v.getId()==exam.getId())
        {
            Intent intent=new Intent(MainActivity.this, Question.class);
            startActivity(intent);
        }
    }
}
