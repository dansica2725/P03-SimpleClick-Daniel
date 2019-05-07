package c346.rp.edu.sg.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView tv;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextInput);
        btn = findViewById(R.id.buttonDisplay);
        tv = findViewById(R.id.textViewDisplay);
        toggleButton = findViewById(R.id.toggleButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().equals("")) {
                    String text = editText.getText().toString();
                    tv.setText(text);
                }
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!toggleButton.isChecked()) {
                    editText.setEnabled(false);
                    btn.setEnabled(false);
                }
                else {
                    editText.setEnabled(true);
                    btn.setEnabled(true);

                }
            }
        });
    }
}
