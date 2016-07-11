package com.example.asus.terserahgame;

/**
 * Created by ASUS on 6/13/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Suit_main extends AppCompatActivity {
    Button Bgajah, Borang, Bsemut;
    ImageView iv_cpu, iv_me;

    String pilme, pilcpu, hasil;

    Random acak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suit_main);

        iv_cpu=(ImageView) findViewById(R.id.iv_cpu);
        iv_me=(ImageView) findViewById(R.id.iv_me);

        Bgajah=(Button) findViewById(R.id.Bgajah);
        Borang=(Button) findViewById(R.id.Borang);
        Bsemut=(Button) findViewById(R.id.Bsemut);

        acak=new Random();

        Bgajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilme="gajah";
                iv_me.setImageResource(R.drawable.gajah);
                hitung();

            }
        });

        Borang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilme="orang";
                iv_me.setImageResource(R.drawable.orang);
                hitung();
            }
        });

        Bsemut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilme="semut";
                iv_me.setImageResource(R.drawable.semut);
                hitung();
            }
        });



    }

    public void hitung()
    {
        int cpu=acak.nextInt(3);
        if(cpu==0)
        {
            pilcpu="gajah";
            iv_cpu.setImageResource(R.drawable.gajah);
        }
        else if(cpu==1)
        {
            pilcpu="orang";
            iv_cpu.setImageResource(R.drawable.orang);
        }
        else if(cpu==2)
        {
            pilcpu="semut";
            iv_cpu.setImageResource(R.drawable.semut);
        }

        if(pilme.equals("gajah") && pilcpu.equals("semut")){
            hasil="Kalah";
        }
        if(pilme.equals("gajah") && pilcpu.equals("orang")){
            hasil="Menang";
        }
        if(pilme.equals("orang") && pilcpu.equals("gajah")){
            hasil="Kalah";
        }
        if(pilme.equals("orang") && pilcpu.equals("semut")){
            hasil="Menang";
        }
        if(pilme.equals("semut") && pilcpu.equals("orang")){
            hasil="Kalah";
        }
        if(pilme.equals("semut") && pilcpu.equals("gajah")){
            hasil="Menang";
        }

        if(pilme.equals("gajah") && pilcpu.equals("gajah")){
            hasil="Seri";
        }
        if(pilme.equals("orang") && pilcpu.equals("orang")){
            hasil="Seri";
        }
        if(pilme.equals("semut") && pilcpu.equals("semut")){
            hasil="Seri";
        }

        Toast.makeText(Suit_main.this, hasil, Toast.LENGTH_SHORT).show();




    }
}
