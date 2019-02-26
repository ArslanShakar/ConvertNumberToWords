package com.practice.coding.convertnumbertowords;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber;
    private TextView tvAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        tvAns = findViewById(R.id.tvResult);
    }

    public void convertNumberToWords(View view)
    {
        String inputText = etNumber.getText().toString();
        int number = Integer.parseInt(inputText);

        DecimalFormat formatter = new DecimalFormat("#,###");
        String convertedNumber = formatter.format(number);


        //OR

        //String convertedNumber = NumberFormat.getNumberInstance(Locale.US).format(number);
        tvAns.setText(convertedNumber);

    }

}
