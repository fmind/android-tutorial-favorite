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
    private EditText bin_input;
    private EditText hex_input;
    
    private Button ip_button;
    private Button bin_button;
    private Button hex_button;

    private CheckBox ip_check;
    private CheckBox bin_check;
    private CheckBox hex_check;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip_input = (EditText) findViewById(R.id.ip_input);
        bin_input = (EditText) findViewById(R.id.bin_input);
        hex_input = (EditText) findViewById(R.id.hex_input);

        ip_button = (Button) findViewById(R.id.ip_button);
        bin_button = (Button) findViewById(R.id.bin_button);
        hex_button = (Button) findViewById(R.id.hex_button);

        ip_check = (CheckBox) findViewById(R.id.ip_check);
        bin_check = (CheckBox) findViewById(R.id.bin_check);
        hex_check = (CheckBox) findViewById(R.id.hex_check);

        ip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip_check();
            }
        });

        bin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bin_check();
            }
        });

        hex_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hex_check();
            }
        });
    }

    private void ip_check() {
        String s = ip_input.getText().toString();
        Log.i(TAG, "Checking IP Address: " + s);

        Validators v = new Validators();
        ip_check.setChecked(v.isIpAddress(s));
    }

    private void bin_check() {
        String s = bin_input.getText().toString();
        Log.i(TAG, "Checking Binary Value: " + s);

        Validators v = new Validators();
        bin_check.setChecked(v.isBinaryValue(s));
    }

    private void hex_check() {
        String s = hex_input.getText().toString();
        Log.i(TAG, "Checking Hexadecimal: " + s);

        Validators v = new Validators();
        hex_check.setChecked(v.isHexadecimalValue(s));
    }
}
