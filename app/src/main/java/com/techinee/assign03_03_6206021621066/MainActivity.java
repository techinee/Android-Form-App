/*
 6206021621066
 เตชินี ภุมมะกาญจนะ
 */
package com.techinee.assign03_03_6206021621066;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText Prefix , Name , Age , Happybirthday;
    private RadioButton radioMale , radioFemale;
    private CheckBox checkBoxMusic , checkBoxBas, checkBoxFlim , checkBoxArt;
    private Button btnSubmit;
    private TextView Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Prefix = (EditText) findViewById(R.id.Prefix);
        Name = (EditText) findViewById(R.id.Name);
        Age = (EditText) findViewById(R.id.Age);
        Happybirthday = (EditText) findViewById(R.id.Happybirthday);

        radioMale = (RadioButton) findViewById(R.id.radioMale);
        radioFemale = (RadioButton) findViewById(R.id.radioFemale);

        checkBoxMusic = (CheckBox) findViewById(R.id.checkBoxMusic);
        checkBoxBas = (CheckBox) findViewById(R.id.checkBoxBas);
        checkBoxFlim = (CheckBox) findViewById(R.id.checkBoxFlim);
        checkBoxArt = (CheckBox) findViewById(R.id.checkBoxArt);

        Show = (TextView) findViewById(R.id.Show);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        String message = "";
        message += Prefix.getText().toString() + Name.getText().toString();
        message += "\nเพศ : " + (radioMale.isChecked() ? "ชาย" : "") + (radioFemale.isChecked() ? "หญิง" : "");
        message += "  อายุ : " + Age.getText().toString() ;
        message += " วันเกิด : " + Happybirthday.getText().toString();
        message += "\nงานอดิเรก : " + (checkBoxMusic.isChecked() ? "ฟังเพลง " : "") + (checkBoxBas.isChecked() ? "เล่นบาส " : "") + (checkBoxFlim.isChecked() ? "ดูหนัง " : "") + (checkBoxArt.isChecked() ? "วาดรูป " : "");



        Show.setText(message);

    }
}