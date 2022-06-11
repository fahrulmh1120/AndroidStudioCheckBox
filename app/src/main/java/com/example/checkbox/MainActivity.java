package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkCream,chkSugar;
    Button btnOrder;
    RadioGroup radCoffeeType;
    RadioButton radDecaf, radExpresso, radColombia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkCream = (CheckBox) findViewById(R.id.chkCream);
        chkSugar = (CheckBox) findViewById(R.id.chkSugar);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        radCoffeeType = (RadioGroup) findViewById(R.id.radioGrupCoffeeType);
        radDecaf = (RadioButton) findViewById(R.id.radDecaf);
        radExpresso = (RadioButton) findViewById(R.id.radExpresso);
        radColombia = (RadioButton) findViewById(R.id.radColombia);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            { String msg = "Coffee";
            if(chkCream.isChecked())
                msg += " & cream";
            if (chkSugar.isChecked())
                msg += " & Sugar";
            //get radido button ID number
                int radioId = radCoffeeType.getCheckedRadioButtonId();
                // Membandingkan id dengan id tiap pilihan
                if (radColombia.getId() == radioId)
                    msg = "Colobian"+msg;
                // atau dapat langsung menggunakan .isChecked() pada setiap RadioButton
                if (radExpresso.isChecked())
                    msg = "Expresso"+msg;
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }

        });
    }
}