package id.ac.poliban.mi.wenny.latihan01;

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

        EditText etNama = findViewById(R.id.etNama);
        EditText etNim = findViewById(R.id.etNim);
        EditText etProdi = findViewById(R.id.etProdi);
        EditText etAlamat = findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(V-> {
            //mengkosongkan EditText
            etNama.setText("");
            etNim.setText("");
            etProdi.setText("");
            etAlamat.setText("");
            //meletakkan kursor di etUserName
        });

        btSubmit.setOnClickListener(V->{
            //mengosongkan EditText
            etNama.setText("");
            etNim.setText("");
            etProdi.setText("");
            etAlamat.setText("");
            etNama.requestFocus();
            Toast.makeText(this, "Selamat Wenny Berhasil", Toast.LENGTH_SHORT).show();
        });
    }
}
