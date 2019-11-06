package com.example.ctof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.et1);
        View bt1 = findViewById(R.id.bt1);
        View tv1 = findViewById(R.id.tv1);
        View tv2 = findViewById(R.id.tv2);
        tv3 =(TextView) findViewById(R.id.tv3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(ed1.getText().toString());

                tv3.setText("華氏溫度="+String.valueOf(a*9/5+32)+"℉");

            }
        });
    }
}
