package com.example.random;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        img=findViewById(R.id.imageView);
        Drawable factim[]=new Drawable[3];
        String facts[]=new String[3];
        Resources res=getResources();
        factim[0]=res.getDrawable(R.drawable.factsix);
        factim[1]=res.getDrawable(R.drawable.factseven);
        factim[2]=res.getDrawable(R.drawable.facteight);
        facts[0]=res.getString(R.string.fact_six);
        facts[1]=res.getString(R.string.fact_seven);
        facts[2]=res.getString(R.string.fact_eight);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum=new Random();
                int rand=randomNum.nextInt(3-0)+0;
                img.setImageDrawable(factim[rand]);
                txt.setText(facts[rand]);
            }
        });
    }
}