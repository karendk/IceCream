package com.makus.icecream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RasaActivity extends AppCompatActivity {
    RadioGroup pRasa;
    RadioButton radRasa;
    Button pBeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasa);

        pRasa= (RadioGroup) findViewById(R.id.p_rasa);
        pBeli= (Button) findViewById(R.id.p_beli);

        pBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radRasa=((RadioButton) findViewById(pRasa.getCheckedRadioButtonId()));

                String dataBungkus,namaBungkus;
                String dataRasa;

                dataRasa=radRasa.getText().toString();

                Intent getData=getIntent();
                namaBungkus=getData.getStringExtra("bungkus");
                if (getData.getStringExtra("bungkus").equals("Take Home")){
                    dataBungkus="2000";
                }
                else{
                    dataBungkus="0";
                }

                Intent i=new Intent(getApplicationContext(),ToppingActivity.class);
                i.putExtra("bungkus",dataBungkus);
                i.putExtra("nbungkus",namaBungkus);
                i.putExtra("rasa",dataRasa);
                startActivity(i);


            }
        });

    }
}
