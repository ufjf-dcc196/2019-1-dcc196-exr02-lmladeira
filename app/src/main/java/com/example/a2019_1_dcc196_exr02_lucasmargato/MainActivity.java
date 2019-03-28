package com.example.a2019_1_dcc196_exr02_lucasmargato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    Button s;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        s = (Button) findViewById(R.id.soma);
        r = (TextView) findViewById(R.id.resultado);

        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                r.setText("Resultado: " + (Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString())));
            }
        });
    }
}
