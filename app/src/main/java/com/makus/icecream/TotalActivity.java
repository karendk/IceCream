package com.makus.icecream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TotalActivity extends AppCompatActivity {
    ImageView gGambar;
    TextView pNama,pTotal;
    Bungkus t=new Bungkus();
    int[] gambar={R.drawable.vanilachip,R.drawable.vanilaoreo,R.drawable.vanilaori,R.drawable.vanilastroberi,
            R.drawable.coklatchip,R.drawable.coklatoreo,R.drawable.coklatori,R.drawable.coklatstroberi,
            R.drawable.stroberichip,R.drawable.stroberioreo,R.drawable.stroberiori,R.drawable.stroberistroberi,
            R.drawable.matchachip,R.drawable.matchaoreo,R.drawable.matchaori,R.drawable.matchastroberi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        gGambar= (ImageView) findViewById(R.id.g_gambar);
        pNama= (TextView) findViewById(R.id.teks_nama);
        pTotal= (TextView) findViewById(R.id.p_total);


        String dataBungkus,namaBungkus;
        String dataRasa,namaRasa;
        String dataTopping,namaTopping;

        //mendapatkan data dari layout sebelumnya
        Intent getData=getIntent();
        dataBungkus=getData.getStringExtra("bungkus");
        dataRasa=getData.getStringExtra("rasa");
        namaBungkus=getData.getStringExtra("nbungkus");
        namaRasa=getData.getStringExtra("nrasa");
        namaTopping=getData.getStringExtra("topping");
        if (getData.getStringExtra("topping").equals("Chocochip")){
            dataTopping="4000";
        }
        else if (getData.getStringExtra("topping").equals("Strawberry")){
            dataTopping="7000";
        }
        else if (getData.getStringExtra("topping").equals("Oreo")){
            dataTopping="5000";
        }
        else{
            dataTopping="0";
        }

        //konversi ke int
        final Integer iBungkus=Integer.parseInt(dataBungkus);
        final Integer iRasa=Integer.parseInt(dataRasa);
        final Integer iTopping=Integer.parseInt(dataTopping);

        //memasukan ke subclass Bungkus
        t.setRasa(iRasa);
        t.setTopping(iTopping);
        t.setBungkus(iBungkus);

        //gGambar.setImageResource(gambar[0]);
        switch (namaRasa+namaTopping){
            case "VanilaChocochip":gGambar.setImageResource(gambar[0]); break;
            case "VanilaOreo":gGambar.setImageResource(gambar[1]); break;
            case "VanilaOriginal":gGambar.setImageResource(gambar[2]); break;
            case "VanilaStrawberry":gGambar.setImageResource(gambar[3]); break;
            case "ChocolateChocochip":gGambar.setImageResource(gambar[4]); break;
            case "ChocolateOreo":gGambar.setImageResource(gambar[5]); break;
            case "ChocolateOriginal":gGambar.setImageResource(gambar[6]); break;
            case "ChocolateStrawberry":gGambar.setImageResource(gambar[7]); break;
            case "StrawberryChocochip":gGambar.setImageResource(gambar[8]); break;
            case "StrawberryOreo":gGambar.setImageResource(gambar[9]); break;
            case "StrawberryOriginal":gGambar.setImageResource(gambar[10]); break;
            case "StrawberryStrawberry":gGambar.setImageResource(gambar[11]); break;
            case "MatchaChocochip":gGambar.setImageResource(gambar[12]); break;
            case "MatchaOreo":gGambar.setImageResource(gambar[13]); break;
            case "MatchaOriginal":gGambar.setImageResource(gambar[14]); break;
            case "MatchaStrawberry":gGambar.setImageResource(gambar[15]); break;

        }
        pNama.setText(namaRasa+" "+namaTopping+" ("+namaBungkus+")");
        pTotal.setText("Rp. "+Integer.toString(t.bayarIceCream()));

    }
}
