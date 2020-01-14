package id.ac.poliban.dts.ade.android_lat02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        EditText etNim=findViewById(R.id.etNim);
        EditText etNama=findViewById(R.id.etNama);
        Button btSubmit=findViewById(R.id.btSubmit);
        Button btClear=findViewById(R.id.btClear);

        btClear.setOnClickListener(v -> {
            etNim.setText("");
            etNama.setText("");
            etNim.requestFocus();
        });

        btSubmit.setOnClickListener(v -> {
            Toast.makeText(this, "data telah di submit", Toast.LENGTH_SHORT).show();
            etNim.setText("");
            etNama.setText("");
            etNim.requestFocus();
        });
    }
}
