package com.example.android_clicker_game;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int health=10, money=0, power=1, killed=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text_power=findViewById(R.id.text_power);
        final TextView text_heatlh=findViewById(R.id.text_health);
        final TextView text_money=findViewById(R.id.text_money);
        final TextView text_killed=findViewById(R.id.text_killed);

        Button btn_powerup=findViewById(R.id.btn_powerup);

        ImageView img_monster=findViewById(R.id.img_monster);

        text_heatlh.setText(Integer.toString(health));
        text_money.setText(Integer.toString(money));
        text_power.setText(Integer.toString(power));
        text_killed.setText(Integer.toString(killed));

        img_monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                health-=power;
                text_heatlh.setText(Integer.toString(health));
                if (health<=0) {
                    health=25;
                    money+=500;
                    text_money.setText(Integer.toString(money));
                    killed++;
                    text_killed.setText(Integer.toString(killed));

                }
            }
        });

    }
}

