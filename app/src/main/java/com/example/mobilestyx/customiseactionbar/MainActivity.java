package com.example.mobilestyx.customiseactionbar;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
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
        Intent intent=getIntent();
        if(Intent.ACTION_SEARCH.equals(intent.getAction()))
        { Log.e("log in action search","log");
            String query=intent.getStringExtra(SearchManager.QUERY);
            Toast.makeText(this,query,Toast.LENGTH_SHORT).show();
        }



        calculation();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e("on create option log","log");
         getMenuInflater().inflate(R.menu.main,menu);
        SearchManager searchManager=(SearchManager)getSystemService(Context.SEARCH_SERVICE);

        android.widget.SearchView searchView= (android.widget.SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

     /*   SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        android.widget.SearchView searchView = (android.widget.SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));*/


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e("on optionitem select","log");

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
