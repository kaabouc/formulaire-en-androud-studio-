package com.example.sience3et1deservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxOption1;
    private EditText text ;
    private EditText date ;
    private CheckBox checkBoxOption2;
    private CheckBox checkBoxOption3;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn ;

        checkBoxOption1 = findViewById(R.id.btn_swim);
        checkBoxOption2 = findViewById(R.id.btn_read);
        checkBoxOption3 = findViewById(R.id.btn_travel);
        radioGroup = findViewById(R.id.radioGroup);
        RadioButton radio1 = findViewById(R.id.btn_man);
        RadioButton radio2 = findViewById(R.id.btn_women);

        text= findViewById(R.id.name);
        date= findViewById(R.id.date);


        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent serviceIntent = new Intent(MainActivity.this, MyService.class);
//                startService(serviceIntent);
//
//                  // Pour arrêter le service :
//                stopService(serviceIntent);
                String selectRadio=  radio1.isChecked() ?  radio1.getText().toString() : radio2.getText().toString();
                String check1 = checkBoxOption1.isChecked() ? checkBoxOption1.getText().toString() : "";
                String check2 = checkBoxOption2.isChecked() ? checkBoxOption2.getText().toString() : "";
                String check3 = checkBoxOption3.isChecked() ? checkBoxOption3.getText().toString() : "";
                Toast.makeText(MainActivity.this, "le nom :"+text.getText().toString()+"\n la date " +
                        ":"+ date.getText().toString() +"\n le genre est "+selectRadio+"\n what de you like  :"+check1+""+check2+" "+check3, Toast.LENGTH_SHORT).show();





            }
        });


    }
}