package com.example.mjcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    boolean isOpt = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button doublezero = findViewById(R.id.doublezero);
        Button ac = findViewById(R.id.ac);
        Button equal = findViewById(R.id.equl);

        TextView num1 = findViewById(R.id.num1);
        TextView num2 = findViewById(R.id.num2);
        TextView opt = findViewById(R.id.opt);
        TextView res = findViewById(R.id.res);






        StringBuffer num1val = new StringBuffer("");
        StringBuffer num2val = new StringBuffer("");

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("1");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("1");
                    num2.setText(num2val);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("2");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("2");
                    num2.setText(num2val);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("3");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("3");
                    num2.setText(num2val);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("4");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("4");
                    num2.setText(num2val);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("5");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("5");
                    num2.setText(num2val);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("6");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("6");
                    num2.setText(num2val);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("7");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("7");
                    num2.setText(num2val);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("8");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("8");
                    num2.setText(num2val);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("9");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("9");
                    num2.setText(num2val);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("0");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("0");
                    num2.setText(num2val);
                }
            }
        });

        doublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOpt == false) {
                    num1val.append("00");
                    num1.setText(num1val);
                }
                else
                {
                    num2val.append("00");
                    num2.setText(num2val);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt.setText("+");
                isOpt = true;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt.setText("-");
                isOpt = true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt.setText("*");
                isOpt = true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt.setText("/");
                isOpt = true;
            }
        });



        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2.setText("");
                num1.setText("");
                num1val.setLength(0);
                num2val.setLength(0);
                opt.setText("");
                res.setText("");
                isOpt = false;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String optval = (String) opt.getText();
                int num1 = Integer.parseInt(num1val.toString());
                int num2 = Integer.parseInt(num2val.toString());


                switch (optval)
                {
                    case "+":
                    {
                        res.setText(String.valueOf(num1 + num2));
                        break;
                    }
                    case "-":
                    {
                        res.setText(String.valueOf(num1 - num2));
                        break;
                    }
                    case "*":
                    {
                        res.setText(String.valueOf(num1 * num2));
                        break;
                    }
                    case "/":
                    {
                        try {
                            res.setText(String.valueOf(num1 / num2));
                        } catch (Exception e) {
                            res.setText("Infinite");
                        }
                        break;
                    }


                }
            }
        });








    }


}