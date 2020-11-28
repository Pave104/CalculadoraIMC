package com.example.imcpaulo;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.bottom);



         bt.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        EditText pes=findViewById(R.id.peso);
        EditText alt=findViewById(R.id.altura);
        float a=Float.parseFloat(alt.getText().toString());
        float p=Float.parseFloat(pes.getText().toString());
        TextView res=findViewById(R.id.imc);
         float f=p/(a*a);
          EditText r=findViewById(R.id.imc);
        String valor=Float.toString(f);
          r.setText(valor);
    }
}