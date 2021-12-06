package com.example.two;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rone,rtwo,rthree,rfour;
    CheckBox cone,ctwo,cthree,cfour;
    String radio,checkbox = "";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        radioGroup=findViewById(R.id.rgroup);
        rone = findViewById(R.id.rone);
        rtwo=findViewById(R.id.rtwo);
        rthree=findViewById(R.id.rthree);
        rfour=findViewById(R.id.rfour);
        cone=findViewById(R.id.cone);
        ctwo=findViewById(R.id.ctwo);
        cthree=findViewById(R.id.cthree);
        cfour=findViewById(R.id.cfour);

        radio = "OKAY";
        rone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio = ((RadioButton)v).getText().toString();
                Log.d("msg", "onCreate() returned: " + radio);
            }
        });
        rtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio = ((RadioButton)v).getText().toString();
                Log.d("msg", "onCreate() returned: " + radio);
            }
        });
        rthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio = ((RadioButton)v).getText().toString();
                Log.d("msg", "onCreate() returned: " + radio);
            }
        });
        rfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio = ((RadioButton)v).getText().toString();
                Log.d("msg", "onCreate() returned: " + radio);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(cone.isChecked())
                {
                    checkbox = checkbox + cone.getText().toString()+" :YES\n";
                }
                else
                {
                    checkbox = checkbox + cone.getText().toString()+" :NO\n";
                }
                if(ctwo.isChecked())
                {
                    checkbox = checkbox + ctwo.getText().toString()+" :YES\n";
                }
                else
                {
                    checkbox = checkbox + ctwo.getText().toString()+" :NO\n";
                }
                if(cthree.isChecked())
                {
                    checkbox = checkbox + cthree.getText().toString()+" :YES\n";
                }
                else
                {
                    checkbox = checkbox + cthree.getText().toString()+" :NO\n";
                }
                if(cfour.isChecked())
                {
                    checkbox = checkbox + cfour.getText().toString()+" :YES\n";
                }
                else
                {
                    checkbox = checkbox + cfour.getText().toString()+" :NO\n";
                }
                Toast.makeText(MainActivity.this, "SELECTED RADIO BUTTON IS "+radio+"\nCheckBox Choice\n"+checkbox, Toast.LENGTH_SHORT).show();
                Log.d("msg", "onClick() returned: " +"SELECTED RADIO BUTTON IS "+radio+"\nCheckBox Choice\n"+checkbox);
            }
        });

    }
}
