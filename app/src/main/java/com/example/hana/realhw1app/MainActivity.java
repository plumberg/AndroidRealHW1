package com.example.hana.realhw1app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick(View v) {
        String r = null;

        if (R.id.button == v.getId()){
            // Проверяем поля на пустоту
            if (TextUtils.isEmpty(input.getText().toString()))
            {
                Toast.makeText(MainActivity.this, "Empty input", Toast.LENGTH_LONG);
                return;
            }
            else {
                r = input.getText().toString();
            }
        }

        // формируем строку вывода
        result.setText(r);
    }
}
