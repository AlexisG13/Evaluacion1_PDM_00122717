package com.alexisg13.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.alexisg13.evaluacion1.utils.AppConstants;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView tv_user,tv_email,tv_productos,text1,text2,text3,text4,text5,text6,text7,text8,text9;
    int n=0;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_user=findViewById(R.id.tv_user);
        tv_email=findViewById(R.id.tv_email);
        tv_productos=findViewById(R.id.tv_productos);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);
        text9=findViewById(R.id.text9);

        mButton=findViewById(R.id.share_button);

        Intent mIntent = getIntent();

        n=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX1).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX2).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX3).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX4).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX5).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX6).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX7).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX8).toString());
        n+=Integer.parseInt(mIntent.getStringExtra(AppConstants.BOX9).toString());


        tv_user.setText(mIntent.getStringExtra(AppConstants.NAME_KEY));
        tv_email.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
        text1.setText(mIntent.getStringExtra(AppConstants.BOX1));
        text2.setText(mIntent.getStringExtra(AppConstants.BOX2));
        text3.setText(mIntent.getStringExtra(AppConstants.BOX3));
        text4.setText(mIntent.getStringExtra(AppConstants.BOX4));
        text5.setText(mIntent.getStringExtra(AppConstants.BOX5));
        text6.setText(mIntent.getStringExtra(AppConstants.BOX6));
        text7.setText(mIntent.getStringExtra(AppConstants.BOX7));
        text8.setText(mIntent.getStringExtra(AppConstants.BOX8));
        text9.setText(mIntent.getStringExtra(AppConstants.BOX9));
        tv_productos.setText(Integer.toString(n));

        mButton.setOnClickListener(v->{

            String p1 = text1.getText().toString();
            String p2 = text2.getText().toString();
            String p3 = text3.getText().toString();
            String p4 = text4.getText().toString();
            String p5 = text5.getText().toString();
            String p6 = text6.getText().toString();
            String p7 = text7.getText().toString();
            String p8 = text8.getText().toString();
            String p9 = text9.getText().toString();
            String tuser = tv_user.getText().toString();
            String temail = tv_email.getText().toString();
            String nproductos = tv_productos.getText().toString();

            Intent shareIntent = new Intent();
            shareIntent.setType("text/plain");
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT,tuser);
            shareIntent.putExtra(Intent.EXTRA_TEXT,temail);
            shareIntent.putExtra(Intent.EXTRA_TEXT,nproductos);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p1);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p2);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p3);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p4);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p5);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p6);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p7);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p8);
            shareIntent.putExtra(Intent.EXTRA_TEXT,p9);

            startActivity(shareIntent);
        });

    }
}
