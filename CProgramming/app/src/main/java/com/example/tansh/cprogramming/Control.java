package com.example.tansh.cprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Control extends AppCompatActivity {

    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        listview=(ListView)findViewById(R.id.simpleListView);

        String []condition_name=getResources().getStringArray(R.array.condition);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(Control.this, R.layout.control_layout, R.id.textview_id, condition_name);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(Control.this, Condition_theory.class);
                intent.putExtra("key", position);
                startActivity(intent);

            }
        });

    }
}
