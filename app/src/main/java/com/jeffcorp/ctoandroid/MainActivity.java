package com.jeffcorp.ctoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Button n1, n2, n3, n4, n5, n6, n7, n8,n9, n0, del;
    public TextView ops, result;

//    public native String helloWorld(String s);
//
//    public native Integer calc();
//
//    static {
//        System.loadLibrary("ctoandroid");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        del = findViewById(R.id.del);


        ops = findViewById(R.id.ops);
        result = findViewById(R.id.result);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ops_string = ops.getText().toString();
                char[] ops_list = ops_string.toCharArray();

                int last_ops_string = ops_string.lastIndexOf(ops_string);



                ops.setText((ops_list[ops_string.length() - 1]));

            }
        });



//        ops.setText(helloWorld("3"));

        buttons(n1, "1", ops);
        buttons(n2, "2", ops);
        buttons(n3, "3", ops);
        buttons(n4, "4", ops);
        buttons(n5, "5", ops);
        buttons(n6, "6", ops);
        buttons(n7, "7", ops);
        buttons(n8, "8", ops);
        buttons(n9, "9", ops);
    }

    public void buttons(Button btnName, final String btnVal, final TextView ops){

            btnName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ops.getText().toString().length() < 15) {
                        ops.setText(ops.getText() + btnVal);
                    }else{
                        Toast.makeText(MainActivity.this, "Too long for comfort", Toast.LENGTH_LONG).show();
                    }
                }
            });
    }

    public Button tie(Button btnName, int id){
        btnName = findViewById(id);

        return btnName;
    }
}
