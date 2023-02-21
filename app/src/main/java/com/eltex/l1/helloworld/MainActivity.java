package com.eltex.l1.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    enum Operation {
        opPlus,
        opMinus,
        opMul,
        opDiv,
        opUnknown
    }

    Operation op;
    Integer a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "1");
        });

        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "2");
        });

        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "3");
        });

        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "4");
        });

        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "5");
        });

        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "6");
        });

        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "7");
        });

        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "8");
        });

        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "9");
        });

        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));
            tv.setText(tv.getText() + "0");
        });

        Button btnPlus = (Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            if (op != Operation.opUnknown) {
                a += Integer.valueOf(String.valueOf(tv.getText()));
            } else {
                a = Integer.valueOf(String.valueOf(tv.getText()));
            }

            op = Operation.opPlus;
            tv.setText("");
        });

        Button btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            if (op != Operation.opUnknown) {
                a -= Integer.valueOf(String.valueOf(tv.getText()));
            } else {
                a = Integer.valueOf(String.valueOf(tv.getText()));
            }

            op = Operation.opMinus;
            tv.setText("");
        });

        Button btnMul = (Button)findViewById(R.id.btnMul);
        btnMul.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            if (op != Operation.opUnknown) {
                a *= Integer.valueOf(String.valueOf(tv.getText()));
            } else {
                a = Integer.valueOf(String.valueOf(tv.getText()));
            }

            op = Operation.opMul;
            tv.setText("");
        });

        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            if (op != Operation.opUnknown) {
                a /= Integer.valueOf(String.valueOf(tv.getText()));
            } else {
                a = Integer.valueOf(String.valueOf(tv.getText()));
            }

            op = Operation.opDiv;
            tv.setText("");
        });

        Button btnEq = (Button)findViewById(R.id.btnEq);
        btnEq.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            switch (op)
            {
                case opPlus:
                    a += Integer.valueOf(String.valueOf(tv.getText()));
                    break;
                case opMinus:
                    a -= Integer.valueOf(String.valueOf(tv.getText()));
                    break;
                case opMul:
                    a *= Integer.valueOf(String.valueOf(tv.getText()));
                    break;
                case opDiv:
                    a /= Integer.valueOf(String.valueOf(tv.getText()));
                    break;

            }
            op = Operation.opUnknown;
            tv.setText(String.valueOf(a));
        });

        Button btnCE = (Button)findViewById(R.id.btnCE);
        btnCE.setOnClickListener((view) -> {
            TextView tv = ((TextView) findViewById(R.id.output));

            op = Operation.opUnknown;
            tv.setText("");
        });
    }

}