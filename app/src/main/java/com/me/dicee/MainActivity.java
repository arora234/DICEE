package com.me.dicee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton=(Button) findViewById(R.id.rollbutton);
        final ImageView dice_left=(ImageView) findViewById(R.id.dice_left);
        final ImageView dice_right=(ImageView) findViewById(R.id.dice_right);

        final int[] dicearray ={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenration=new Random();
                int number=randomnumbergenration.nextInt(6);
                dice_left.setImageResource(dicearray[number]);
                int number2=randomnumbergenration.nextInt(6);
                dice_right.setImageResource(dicearray[number2]);
            }
        });








    }
}
