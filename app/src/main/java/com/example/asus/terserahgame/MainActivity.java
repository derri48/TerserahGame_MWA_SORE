package com.example.asus.terserahgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSuit;
    Button btntebak;
    Button btncredit;
    Button btncara;
    Button btnexit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSuit=(Button) findViewById(R.id.btnSuit);
        Button btntic=(Button) findViewById(R.id.btntic);
        Button btncredit=(Button) findViewById(R.id.btncredit);
        Button btncara=(Button) findViewById(R.id.btncara);
        Button btnexit=(Button) findViewById(R.id.btnexit);




        btnSuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Suit_main.class);
                        startActivity(intent);
            }
        });

        btntic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TicTacToe_main.class);
                        startActivity(intent);

            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });

        btncara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,cara.class);
                startActivity(intent);

            }
        });

        btncredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,credit.class);
                startActivity(intent);

            }
        });





    }
}
