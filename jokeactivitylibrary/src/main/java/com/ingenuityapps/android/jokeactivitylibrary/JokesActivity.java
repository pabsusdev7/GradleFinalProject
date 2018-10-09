package com.ingenuityapps.android.jokeactivitylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        jokeTextView = (TextView) findViewById(R.id.tv_joke);

        Intent intentThatStartedThisActivity = getIntent();

        if(intentThatStartedThisActivity!=null && intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT))
        {
            jokeTextView.setText(intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
