package com.example.tansh.hospital01;
import android.app.AlertDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Appointment extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String number;
    private Button sendBtn;
    String item;
    String Message;
    private int position;
    private EditText name, address, city, contact, department;
    private RadioButton male, female;
    String patient_name, patient_address, patient_city, patient_contact, patient_gender, patient_department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        name=(EditText)findViewById(R.id.patient_name_id);
        address=(EditText)findViewById(R.id.patient_address_id);
        city=(EditText)findViewById(R.id.patient_city_id);
        contact=(EditText)findViewById(R.id.patient_phone_id);

        male=(RadioButton)findViewById(R.id.MaleID);
        female=(RadioButton)findViewById(R.id.FemaleID);

        if (male.isChecked())
        {
            patient_gender = male.getText().toString();
        } else if (female.isChecked())
        {
            patient_gender = female.getText().toString();
        }

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        sendBtn = (Button) findViewById(R.id.send);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        final List<String> categories = new ArrayList<String>();
        categories.add("Neurology");
        categories.add("Maternity");
        categories.add("General Surgery");
        categories.add("Cardiology");
        categories.add("Anesthetics ");
        categories.add("Burn Center");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               // sendSMSMessage();
                patient_name=name.getText().toString().trim();
                patient_address=address.getText().toString().trim();
                patient_city=city.getText().toString().trim();
                patient_contact=contact.getText().toString().trim();
               // patient_gender=gender.getText().toString().trim();
              //  patient_department=categories.get(position).toString();
                patient_department=item;

                Message=patient_name+"\n"+patient_address+"\n"+patient_city+"\n"+patient_contact+"\n"+patient_gender+"\n"+patient_department;

                try
                {
                    if( !patient_name.isEmpty() && !patient_contact.isEmpty()) {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(number, null, Message, null, null);

                  /*  SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, Message, null, null);*/

                        AlertDialog alertDialog = new AlertDialog.Builder(
                                Appointment.this).create();

                        // Setting Dialog Title
                        alertDialog.setTitle("SMS Sent Successfully");

                        // Setting Dialog Message
                        alertDialog.setMessage("Thanks For Appointment");

                        // Setting Icon to Dialog
                        alertDialog.setIcon(R.drawable.ic_message_black_24dp);

                        // Setting OK Button
                        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog closed
                                Appointment.super.onDestroy();
                            }
                        });

                        // Showing Alert Message
                        alertDialog.show();
                    }
                    else
                    {
                        Toast.makeText(Appointment.this, "Fill the form", Toast.LENGTH_SHORT).show();

                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Appointment.this, "Message not Send", Toast.LENGTH_SHORT).show();

                }


            }
        });




    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(position).toString().trim();
        if (position == 0) {
            number="+8801913302173";

        }

        if (position == 1) {
            number="+8801928918085";

        }

        if (position == 2) {
            number="+8801911141482";

        }

        if (position == 3) {
            number="+8801911141482";

        }

        if (position == 4) {
            number="+8801911141482";

        }

        if (position == 5) {
            number="+8801911141482";

        }


        // Showing selected spinner item
      //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}

