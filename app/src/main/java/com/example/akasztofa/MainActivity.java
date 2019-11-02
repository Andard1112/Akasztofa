package com.example.akasztofa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button le,fel,tipp;
    TextView betu, betuk;
    ImageView kep;
    int eletero,betuallas;
    String[] szavak = new String[10],hossz = new String[10];
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        char[] b =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int szo = rand.nextInt(10);
        betuk.setText(hossz[szo]);

        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] b =  {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

                if (betuallas <= 0){
                    betuallas = 26;
                }else{
                    betuallas--;
                }
                betu.setText(b,betuallas,1);
            }
        });
        fel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] b =  {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

                if(betuallas > 26){
                    betuallas = 0;
                }else{
                    betuallas++;
                }

                betu.setText(b,betuallas,1);
            }
        });

        switch (eletero){
            case 0 : kep.setImageResource(R.drawable.akasztofa00);break;
            case 1 : kep.setImageResource(R.drawable.akasztofa01);break;
            case 2 : kep.setImageResource(R.drawable.akasztofa02);break;
            case 3 : kep.setImageResource(R.drawable.akasztofa03);break;
            case 4 : kep.setImageResource(R.drawable.akasztofa04);break;
            case 5 : kep.setImageResource(R.drawable.akasztofa05);break;
            case 6 : kep.setImageResource(R.drawable.akasztofa06);break;
            case 7 : kep.setImageResource(R.drawable.akasztofa07);break;
            case 8 : kep.setImageResource(R.drawable.akasztofa08);break;
            case 9 : kep.setImageResource(R.drawable.akasztofa09);break;
            case 10 : kep.setImageResource(R.drawable.akasztofa10);break;
            case 11 : kep.setImageResource(R.drawable.akasztofa11);break;
            case 12 : kep.setImageResource(R.drawable.akasztofa12);break;
            case 13 : kep.setImageResource(R.drawable.akasztofa13);break;
            default: break;


        }

    }

    private void init() {
        le = findViewById(R.id.le);
        fel = findViewById(R.id.fel);
        tipp = findViewById(R.id.tipp);
        betu = findViewById(R.id.betu);
        kep = findViewById(R.id.kep);
        betuk = findViewById(R.id.betuk);
        eletero = 0;
        betuallas = 0;
        szavak[0]="alma";
        hossz[0]="____";
        szavak[1]="falap";
        hossz[1]="_____";
        szavak[2]="epe";
        hossz[2]="___";
        szavak[3]="anonimusz";
        hossz[3]="_________";
        szavak[4]="hepehupa";
        hossz[4]="________";
        szavak[5]="arany";
        hossz[5]="_____";
        szavak[6]="kebab";
        hossz[6]="_____";
        szavak[7]="szentsegtelen";
        hossz[7]="_____________";
        szavak[8]="elveszett";
        hossz[8]="_________";
        szavak[9]="kapufa";
        hossz[9]="______";
        rand = new Random();
    }
}
