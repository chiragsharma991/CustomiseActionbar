package com.example.mobilestyx.customiseactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //update
        //new update

        Toolbar mytool=(Toolbar)findViewById(R.id.action);
        setSupportActionBar(mytool);
        getSupportActionBar().setTitle("New application");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      //  getSupportActionBar().setSubtitle("chari sharma");



        calculation();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.help:
                Toast.makeText(this,"Help is clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this,"setting is clicked",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"nothing is clicked",Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }

    private void calculation()
    {


    }
}
