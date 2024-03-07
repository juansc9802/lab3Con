package co.edu.unipiloto.labolatorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, IntefazCorreo.class);
        startActivity(intent);
    }
}