package com.example.ecommerceapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DatabaseReference databaseReference;
   // ProgressDialog progressDialog;
    List<StudentDetails> list = new ArrayList<>();
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);


        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    //    progressDialog = new ProgressDialog(MainActivity.this);

     //   progressDialog.setMessage("Loading Data from Firebase Database");

      //  progressDialog.show();

        databaseReference = FirebaseDatabase.getInstance().getReference("Data");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    StudentDetails studentDetails = dataSnapshot.getValue(StudentDetails.class);

                    list.add(studentDetails);
                }

                adapter = new RecyclerViewAdapter(MainActivity.this, list);

                recyclerView.setAdapter(adapter);

               // progressDialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

             //   progressDialog.dismiss();

            }
        });

    }
}



