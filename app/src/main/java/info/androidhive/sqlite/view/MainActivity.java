package info.androidhive.sqlite.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import info.androidhive.sqlite.R;
import info.androidhive.sqlite.database.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    private static DatabaseHelper db=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO verificar contexto e acionar activy
        boolean logged = true;
        Intent intent = null;
        if(logged){
            intent = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intent);
        }else{
            intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }

    protected static DatabaseHelper getDB(DatabaseHelper dbParamater){
        if(db == null){
            db = dbParamater;
        }
        return db;
    }
}
