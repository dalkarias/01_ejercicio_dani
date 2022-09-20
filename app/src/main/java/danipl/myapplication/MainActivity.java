package danipl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaracion de objetos de vista

    private TextView txtMensaje;
    private EditText txtNombre;
    private Button btnReset;
    private Button btnSaludo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializacion de variables visuales

        inicializacion();

        // metodos de boton
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMensaje.setText("VACIO");
            }
        });

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = txtNombre.getText().toString();
                nom.trim();
                if(!nom.isEmpty())
                {
                    txtMensaje.setText("Hola "+ nom + " buenos días");
                    txtNombre.setText("");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "No has escrito nada", Toast.LENGTH_SHORT).show();
                    txtNombre.setText("");
                }
            }
        });
    }

        // metodos aparte
        private void inicializacion() {
            txtMensaje = findViewById(R.id.txt_Mensaje_Main);
            txtNombre = findViewById(R.id.txt_Nombre_Main);
            btnReset = findViewById(R.id.btn_Reset_Main);
            btnSaludo = findViewById(R.id.btn_Saludo_Main);
        }


}