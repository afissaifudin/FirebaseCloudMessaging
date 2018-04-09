package com.work.afis.firebasecloudmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        token = (TextView) findViewById(R.id.tvToken);
        token.setText(SharedPrefManager.getmInstance(this).geToken());

    }
}
