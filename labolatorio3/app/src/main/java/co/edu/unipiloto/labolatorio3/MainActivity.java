package co.edu.unipiloto.labolatorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}