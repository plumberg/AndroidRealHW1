package com.example.hana.realhw1app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {
    EditText input;
    Button okB;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) this.findViewById(R.id.editText);
        okB = (Button) this.findViewById(R.id.button);
        result = findViewById(R.id.textView);


        okB.setOnClickListener (new View.OnClickListener ()
        {
            @Override
            public void onClick (View view)
            {
                Toast.makeText(MainActivity.this, "Test button clicked", Toast.LENGTH_LONG);
                String r = "";

                if (R.id.button == view.getId()){
                    // Проверяем поля на пустоту
                    //Check if input is empty
                    if (TextUtils.isEmpty(input.getText().toString()))

                    {
                        Toast.makeText(MainActivity.this, "Empty input", Toast.LENGTH_LONG).show();
                        return;
                    }
                    else {
                        r = input.getText().toString();
                    }
                }

                // формируем строку вывода
                //Assigning output text
                result.setText(r);
            }
        });
    }



}
