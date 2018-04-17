package com.alperenmertyazilim.hesaplama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eT1;
    EditText eT2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         eT1=(EditText) findViewById(R.id.editText);
         eT2=(EditText) findViewById(R.id.editText2);
         sonuc=(TextView) findViewById(R.id.sonucText);

    }

    public void toplama(View v){

        int a=Integer.parseInt(eT1.getText().toString());
        int b=Integer.parseInt(eT2.getText().toString());

        int s=a+b;

        sonuc.setText("Sonuc: "+s);

       // sonuc.setText("islem yapildi.");

    }
    public void cikarma(View v){
        int a=Integer.parseInt(eT1.getText().toString());
        int b=Integer.parseInt(eT2.getText().toString());

        int s=a-b;

        sonuc.setText("Sonuc: "+s);
    }
    public void carpma(View v){
        int a=Integer.parseInt(eT1.getText().toString());
        int b=Integer.parseInt(eT2.getText().toString());

        int s=a*b;

        sonuc.setText("Sonuc: "+s);
    }
    public void bolme(View v){
        int a=Integer.parseInt(eT1.getText().toString());
        int b=Integer.parseInt(eT2.getText().toString());

        int s=a/b;

        sonuc.setText("Sonuc: "+s);
    }
}
