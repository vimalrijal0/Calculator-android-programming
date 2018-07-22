package com.example.root.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class home extends AppCompatActivity{

    private Button one,two,three,four,five,six,seven,eight,nine,zero,add,div,mul,sub,equal,clear;
    private TextView info,result;
    private final String  ADDITION = "+";
    private final String SUBTRACTION = "-";
    private final String MULTIPLICATION = "*";
    private final String DIVISION = "/";
    private final String EQL = "0";
    private double var1 = Double.NaN;
    private double var2;
    private String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

         setupUIViews();

         zero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 info.setText(info.getText().toString() + "0");

             }
         });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "9");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
               action = ADDITION;
               result.setText(String.valueOf(var1) + "+");
               info.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = SUBTRACTION;
                result.setText(String.valueOf(var1) + "-");
                info.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = MULTIPLICATION;
                result.setText(String.valueOf(var1) + "*");
                info.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = DIVISION;
                result.setText(String.valueOf(var1) + "/");
                info.setText(null);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = EQL;
                result.setText(result.getText().toString() + String.valueOf(var2) + "=" + String.valueOf(var1));

                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (info.getText().length() > 0){
                        CharSequence name = info.getText().toString();
                        info.setText(name.subSequence(0,name.length()-1));

                }
                else
                {
                    var1 = Double.NaN;
                    var2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);

                }
            }
        });



    }

    //LINKING THE XML WIGITS TO JAVA FILE BY CREATING THE OBJECT..
    private void setupUIViews(){
        one            = (Button) findViewById(R.id.btn1);
        two            = (Button) findViewById(R.id.btn2);
        three          = (Button) findViewById(R.id.btn3);
        four           = (Button) findViewById(R.id.btn4);
        five           = (Button) findViewById(R.id.btn5);
        six            = (Button) findViewById(R.id.btn6);
        seven          = (Button) findViewById(R.id.btn7);
        eight          = (Button) findViewById(R.id.btn8);
        nine           = (Button) findViewById(R.id.btn9);
        zero           = (Button) findViewById(R.id.btn0);
        add            = (Button) findViewById(R.id.btnadd);
        sub            = (Button) findViewById(R.id.btnsub);
        div            = (Button) findViewById(R.id.btndivide);
        mul            = (Button) findViewById(R.id.btnmul);
        equal            = (Button) findViewById(R.id.btnequal);
        info           = (TextView) findViewById(R.id.tvControl);
        result         = (TextView) findViewById(R.id.tvResult);
        clear          = (Button) findViewById(R.id.btnclear);



    }

    //COMPUTE THE MAIN LOGIC..
    private void compute(){
        if (!Double.isNaN(var1)){
            var2 = Double.parseDouble(info.getText().toString());

            switch (action){
                case ADDITION:
                    var1 = var1 + var2;
                    break;
                case SUBTRACTION:
                    var1 = var1 - var2;
                    break;
                case MULTIPLICATION:
                    var1 = var1 * var2;
                    break;
                case DIVISION:
                    var1 = var1 / var2;
                    break;
                case EQL:

                    break;
            }
        }
        else {
            var1 = Double.parseDouble(info.getText().toString());

        }

    }
}
