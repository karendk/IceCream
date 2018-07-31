package com.makus.icecream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup pBungkus;
    RadioButton radBungkus;
    Button pBeli, pInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBungkus= (RadioGroup) findViewById(R.id.p_bungkus);
        pBeli= (Button) findViewById(R.id.p_beli);
        pInfo= (Button) findViewById(R.id.p_info);

        pBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radBungkus=((RadioButton) findViewById(pBungkus.getCheckedRadioButtonId()));

                String dataBungkus;

                dataBungkus=radBungkus.getText().toString();
                Intent i=new Intent(getApplicationContext(),RasaActivity.class);
                i.putExtra("bungkus",dataBungkus);
                startActivity(i);
            }
        });

        pInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),TentangActivity.class);
                startActivity(i);
            }
        });

    }
}
