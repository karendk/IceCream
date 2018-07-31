package com.makus.icecream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ToppingActivity extends AppCompatActivity {
    RadioGroup pTopping;
    RadioButton radTopping;
    Button pBeli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topping);

        pTopping= (RadioGroup) findViewById(R.id.t_topping);
        pBeli= (Button) findViewById(R.id.p_beli);

        pBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radTopping=((RadioButton) findViewById(pTopping.getCheckedRadioButtonId()));

                String dataBungkus,namaBungkus;
                String dataRasa,namaRasa;
                String dataTopping;

                dataTopping=radTopping.getText().toString();

                //String sBungkus = String.valueOf(dataBungkus).replaceAll("[\\D]", "");
                //String sRasa = String.valueOf(dataRasa).replaceAll("[\\D]", "");
                //String sTopping = String.valueOf(dataTopping).replaceAll("[\\D]", "");

                //final Integer iBungkus=Integer.parseInt(sBungkus);
                //final Integer iRasa=Integer.parseInt(sRasa);
                //final Integer iTopping=Integer.parseInt(sTopping);


                //t.setBungkus(iBungkus);
                //t.setRasa(iRasa);
                //t.setTopping(iTopping);

                Intent getData=getIntent();
                dataBungkus=getData.getStringExtra("bungkus");
                namaBungkus=getData.getStringExtra("nbungkus");
                namaRasa=getData.getStringExtra("rasa");
                if (getData.getStringExtra("rasa").equals("Vanila")){
                    dataRasa="10000";
                }
                else if (getData.getStringExtra("rasa").equals("Chocolate")){
                    dataRasa="12000";
                }
                else if (getData.getStringExtra("rasa").equals("Strawberry")){
                    dataRasa="14000";
                }
                else{
                    dataRasa="16000";
                }

                Intent i=new Intent(getApplicationContext(),TotalActivity.class);
                i.putExtra("bungkus",dataBungkus);
                i.putExtra("nbungkus",namaBungkus);
                i.putExtra("rasa",dataRasa);
                i.putExtra("nrasa",namaRasa);
                i.putExtra("topping",dataTopping);
                startActivity(i);

                //pTotal.setText(Integer.toString(t.bayarIceCream()));
            }
        });

    }
}
