package com.example.a009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ans();
    }
    public void back(View v){
        finish();
    }
    private void ans(){
        int n;

        Random num = new Random();
        int ans = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null)
        {

            n = Integer.parseInt(bundle.getString("NUM"));
            TextView TFR = (TextView)findViewById(R.id.textView);
            TextView bigsmall = (TextView)findViewById(R.id.textView2);

            if (n == ans)
            {
                bigsmall.setText("正確");
                TFR.setText("○");

            }
            else if (n > ans)
            {
                bigsmall.setText("猜小點");
                TFR.setText("X");

            }
            else if (n < ans)
            {
                bigsmall.setText("猜大點");
                TFR.setText("X");
            }
        }
    }
}