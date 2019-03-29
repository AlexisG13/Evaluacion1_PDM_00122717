package com.alexisg13.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alexisg13.evaluacion1.utils.AppConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout box1,box2,box3,box4,box5,box6,box7,box8,box9;
    TextView cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9;
    EditText user,email;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1=findViewById(R.id.box1);
        box2=findViewById(R.id.box2);
        box3=findViewById(R.id.box3);
        box4=findViewById(R.id.box4);
        box5=findViewById(R.id.box5);
        box6=findViewById(R.id.box6);
        box7=findViewById(R.id.box7);
        box8=findViewById(R.id.box8);
        box9=findViewById(R.id.box9);

        cont1=findViewById(R.id.cont1);
        cont2=findViewById(R.id.cont2);
        cont3=findViewById(R.id.cont3);
        cont4=findViewById(R.id.cont4);
        cont5=findViewById(R.id.cont5);
        cont6=findViewById(R.id.cont6);
        cont7=findViewById(R.id.cont7);
        cont8=findViewById(R.id.cont8);
        cont9=findViewById(R.id.cont9);

        box1.setOnClickListener(this);
        box2.setOnClickListener(this);
        box3.setOnClickListener(this);
        box4.setOnClickListener(this);
        box5.setOnClickListener(this);
        box6.setOnClickListener(this);
        box7.setOnClickListener(this);
        box8.setOnClickListener(this);
        box9.setOnClickListener(this);

        mButton=findViewById(R.id.send_button);
        user=findViewById(R.id.user_edit);
        email=findViewById(R.id.email_edit);

        mButton.setOnClickListener(v->{
                String p1 = cont1.getText().toString();
            String p2 = cont2.getText().toString();
            String p3 = cont3.getText().toString();
            String p4 = cont4.getText().toString();
            String p5 = cont5.getText().toString();
            String p6 = cont6.getText().toString();
            String p7 = cont7.getText().toString();
            String p8 = cont8.getText().toString();
            String p9 = cont9.getText().toString();
            String tuser = user.getText().toString();
            String temail = email.getText().toString();

            Intent mIntent = new Intent(this,SecondActivity.class);
            mIntent.putExtra(AppConstants.BOX1,p1);
            mIntent.putExtra(AppConstants.BOX2,p2);
            mIntent.putExtra(AppConstants.BOX3,p3);
            mIntent.putExtra(AppConstants.BOX4,p4);
            mIntent.putExtra(AppConstants.BOX5,p5);
            mIntent.putExtra(AppConstants.BOX6,p6);
            mIntent.putExtra(AppConstants.BOX7,p7);
            mIntent.putExtra(AppConstants.BOX8,p8);
            mIntent.putExtra(AppConstants.BOX9,p9);
            mIntent.putExtra(AppConstants.NAME_KEY,tuser);
            mIntent.putExtra(AppConstants.EMAIL_KEY,temail);
            startActivity(mIntent);

        });


    }

    @Override
    public void onClick(View v) {
        TextView cont;
        int n;
        String str_salida;
        switch(v.getId()){
            case R.id.box1:
                cont=findViewById(R.id.cont1);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box2:
                cont=findViewById(R.id.cont2);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box3:
                cont=findViewById(R.id.cont3);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box4:
                cont=findViewById(R.id.cont4);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box5:
                cont=findViewById(R.id.cont5);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box6:
                cont=findViewById(R.id.cont6);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box7:
                cont=findViewById(R.id.cont7);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box8:
                cont=findViewById(R.id.cont8);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;

            case R.id.box9:
                cont=findViewById(R.id.cont9);
                n= Integer.parseInt(cont.getText().toString());
                n+=1;
                str_salida=Integer.toString(n);
                cont.setText(str_salida);
                break;
        }
    }
}
