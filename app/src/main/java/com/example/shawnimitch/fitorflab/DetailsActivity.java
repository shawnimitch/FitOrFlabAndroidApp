package com.example.shawnimitch.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView weightTitle = (TextView) findViewById(R.id.weightTitle);
        ImageView excerciseImage = (ImageView) findViewById((R.id.exerciseImage));
        LinearLayout mainBg = (LinearLayout) findViewById(R.id.activity_details);

        String excerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        weightTitle.setText(excerciseTitle);

        if(excerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight2x,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (excerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus2x,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            excerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart2x,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#52ad56"));
        }



    }
}
