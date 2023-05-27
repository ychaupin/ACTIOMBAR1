package com.example.actiombar1;

import static com.example.actiombar1.R.id.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.uno1:
            Toast.makeText(MainActivity.this,"llamando",Toast.LENGTH_SHORT).show();
            return true;

            case R.id.dos2:
                Toast.makeText(MainActivity.this,"Video llamada",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.tres3:
                Toast.makeText(MainActivity.this,"Ajustes",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.cuatro4:
                Toast.makeText(MainActivity.this,"Perfil",Toast.LENGTH_SHORT).show();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
}