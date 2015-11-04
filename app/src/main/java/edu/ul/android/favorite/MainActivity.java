package edu.ul.android.favorite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ip_input;
    private EditText prime_input;
    private EditText byte_input;
    
    private Button ip_button;
    private Button prime_button;
    private Button byte_button;

    private CheckBox ip_check;
    private CheckBox prime_check;
    private CheckBox byte_check;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip_input = (EditText) findViewById(R.id.ip_input);
        prime_input = (EditText) findViewById(R.id.prime_input);
        byte_input = (EditText) findViewById(R.id.byte_input);

        ip_button = (Button) findViewById(R.id.ip_button);
        prime_button = (Button) findViewById(R.id.prime_button);
        byte_button = (Button) findViewById(R.id.byte_button);

        ip_check = (CheckBox) findViewById(R.id.ip_check);
        prime_check = (CheckBox) findViewById(R.id.prime_check);
        byte_check = (CheckBox) findViewById(R.id.byte_check);

        ip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Clicking on IP Button");
                ip_check();
            }
        });

        prime_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Clicking on PRIME Button");
                prime_check();
            }
        });

        byte_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Clicking on BYTE Button");
                byte_check();
            }
        });
    }

    private void ip_check() {
        String s = ip_input.getText().toString();
        Log.i(TAG, "Checking IP: " + s);

        Validators v = new Validators();
        ip_check.setChecked(v.isIp(s));
    }

    private void prime_check() {
        String s = prime_input.getText().toString();
        Log.i(TAG, "Checking IP: " + s);

        Validators v = new Validators();
        prime_check.setChecked(v.isPrime(s));
    }

    private void byte_check() {
        String s = byte_input.getText().toString();
        Log.i(TAG, "Checking IP: " + s);

        Validators v = new Validators();
        byte_check.setChecked(v.isByte(s));
    }
}
