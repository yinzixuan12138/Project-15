package com.example.yinzixuan.project_15;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.btnCall);
        final EditText editText=(EditText)findViewById(R.id.editText);
        Button button1=(Button)findViewById(R.id.button);
        final EditText editText1= (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address=editText.getText().toString();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+address)));

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                String Phone_Number=editText1.getText().toString();
                    Intent a=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + Phone_Number));
                startActivity(a);}
                catch (Exception e){}
            }
        });
    }
}
