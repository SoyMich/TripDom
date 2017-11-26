package edu.itla.tripdom.tripdom.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.itla.tripdom.tripdom.R;
import edu.itla.tripdom.tripdom.entity.TipoUsuario;
import edu.itla.tripdom.tripdom.entity.Usuario;

public class RegistroUsuario extends AppCompatActivity {

    private Button btnGuardar;
    private EditText txtNombre;
    private EditText txtEmail;
    private EditText txtTelefono;

    private static final String LOG_T="RegistroUsuario";

    private TextView txtVisualizarNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        btnGuardar = findViewById(R.id.btnGuardar);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefono = findViewById(R.id.txtTelefono);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Usuario usuario = new Usuario();

                usuario.setNombre(txtNombre.getText().toString());
                usuario.setTipousuario(TipoUsuario.CLIENTE);
                usuario.setEmail(txtEmail.getText().toString());
                usuario.setTelefono(txtTelefono.getText().toString());


                Log.i(LOG_T,usuario.toString());



            }
        });



    }
}
