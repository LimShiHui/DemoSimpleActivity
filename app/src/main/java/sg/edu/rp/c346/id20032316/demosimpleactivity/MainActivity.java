package sg.edu.rp.c346.id20032316.demosimpleactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //declaration
    Button btnDisplay;
    TextView tvMag;
    EditText etData;
    ToggleButton tbEnabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking Java with UI
        btnDisplay = findViewById(R.id.btnDisplay);
        etData = findViewById(R.id.etMsg);
        tvMag = findViewById(R.id.tvResult);
        tbEnabler = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.rgGender);

        //behaviour
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                String text = etData.getText().toString();
                int radioId = rgGender.getCheckedRadioButtonId();
                if (radioId == R.id.rbMale) {
                    text = "He says " + text;
                } else if (radioId == R.id.rbFemale) {
                    text = "She says " + text;
                }
                tvMag.setText(text);

                Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();
            }
        });

        tbEnabler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbEnabler.isChecked() == true) {
                    etData.setEnabled(true);
                    etData.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etData.setEnabled(false);
                    etData.setBackgroundColor(Color.RED);
                }
            }
        });


    }
}