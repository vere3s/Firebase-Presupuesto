package com.salma.login.UI;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.salma.login.R;

public class PoliticasDeActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private TextView txtPrivacidad, txtPrivacidadDescripcion;
    private TextView txtUsoResponsable, txtUsoResponsableDescripcion;
    private TextView txtModificaciones, txtModificacionesDescripcion;
    private TextView txtResponsabilidad, txtResponsabilidadDescripcion;
    private TextView txtSeguridad, txtSeguridadDescripcion;
    private TextView txtConsentimiento, txtConsentimientoDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas_de);
        txtTitulo = findViewById(R.id.txtTitulo);
        txtPrivacidad = findViewById(R.id.txtPrivacidad);
        txtPrivacidadDescripcion = findViewById(R.id.txtPrivacidadDescripcion);
        txtUsoResponsable = findViewById(R.id.txtUsoResponsable);
        txtUsoResponsableDescripcion = findViewById(R.id.txtUsoResponsableDescripcion);
        txtModificaciones = findViewById(R.id.txtModificaciones);
        txtModificacionesDescripcion = findViewById(R.id.txtModificacionesDescripcion);
        txtResponsabilidad = findViewById(R.id.txtResponsabilidad);
        txtResponsabilidadDescripcion = findViewById(R.id.txtResponsabilidadDescripcion);
        txtSeguridad = findViewById(R.id.txtSeguridad);
        txtSeguridadDescripcion = findViewById(R.id.txtSeguridadDescripcion);
        txtConsentimiento = findViewById(R.id.txtConsentimiento);
        txtConsentimientoDescripcion = findViewById(R.id.txtConsentimientoDescripcion);

        txtTitulo.setText("Términos y Condiciones");

        txtPrivacidad.setText("1. Privacidad:");
        txtPrivacidadDescripcion.setText("Todos los datos personales proporcionados serán utilizados exclusivamente para mejorar el servicio.");

        txtUsoResponsable.setText("2. Uso Responsable:");
        txtUsoResponsableDescripcion.setText("Los usuarios se comprometen a utilizar la aplicación de manera ética y conforme a la ley.");

        txtModificaciones.setText("3. Modificaciones:");
        txtModificacionesDescripcion.setText("La empresa se reserva el derecho de modificar los términos de uso y políticas de privacidad en cualquier momento.");

        txtResponsabilidad.setText("4. Responsabilidad:");
        txtResponsabilidadDescripcion.setText("La empresa no se hace responsable por el mal uso de la aplicación por parte de los usuarios.");

        txtSeguridad.setText("5. Seguridad:");
        txtSeguridadDescripcion.setText("Se implementarán medidas de seguridad para proteger la información del usuario, aunque no se garantiza la protección absoluta.");

        txtConsentimiento.setText("6. Consentimiento:");
        txtConsentimientoDescripcion.setText("Al utilizar esta aplicación, el usuario acepta estos términos y condiciones.");

    }
}