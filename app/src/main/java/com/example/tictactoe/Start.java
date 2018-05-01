package com.example.tictactoe;
/*
DEVELOPED BY -
SWAGAT PANDA
ANURAG DHENUKA
CSE,ITER,SOA
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Start extends AppCompatActivity {
    EditText player1,player2;
    Button go;
    MediaPlayer mp;
    String p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mp=MediaPlayer.create(getApplicationContext(),R.raw.backmusic);
        mp.start();
        player1=(EditText)findViewById(R.id.editText);
        player2=(EditText)findViewById(R.id.editText2);
        go=(Button)findViewById(R.id.button);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1=player1.getText().toString();
                p2=player2.getText().toString();
                mp.stop();
                if(p1.equals("") || p2.equals(""))
                {

                    Toast.makeText(getApplicationContext(),"PLEASE ENTER THE NAMES",Toast.LENGTH_LONG).show();
                }
                else {
                    mp.stop();
                    Intent intent=new Intent(getApplication(),MainActivity.class);
                    intent.putExtra("p1",p1);
                    intent.putExtra("p2",p2);
                    startActivity(intent);
                }

            }
        });

    }
}
