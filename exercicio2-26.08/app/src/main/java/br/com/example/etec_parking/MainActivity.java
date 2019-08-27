package br.com.example.etec_parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtQtdeHora;
    EditText txtValorHora;
    EditText txtHoraAdicional;

    TextView lblResulTot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQtdeHora = findViewById(R.id.txtQtdeHora);
        txtValorHora = findViewById(R.id.txtValorHora);
        txtHoraAdicional = findViewById(R.id.txtHoraAdicional);

        lblResulTot = findViewById(R.id.lblResulTot);
    }

    public void onCalcular(View v) {
        if (txtQtdeHora.getText().toString().isEmpty() || txtValorHora.getText().toString().isEmpty() || txtHoraAdicional.getText().toString().isEmpty()) {
            Toast.makeText(this, "Digite o valor", Toast.LENGTH_SHORT).show();
        }
        else {
            double qtdeHora = Double.parseDouble(txtQtdeHora.getText().toString());
            double valorHora = Double.parseDouble(txtValorHora.getText().toString());
            double HoraAdicional = Double.parseDouble(txtHoraAdicional.getText().toString());

            double total = valorHora + HoraAdicional * (qtdeHora - 1);

            lblResulTot.setText(String.valueOf(total));
        }
    }
}
