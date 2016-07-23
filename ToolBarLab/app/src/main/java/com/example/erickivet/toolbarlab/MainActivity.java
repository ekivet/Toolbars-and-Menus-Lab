package com.example.erickivet.toolbarlab;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        Toolbar toolbarBottom = (Toolbar)findViewById(R.id.toolbar_bottom);
        setSupportActionBar(toolbar);

        ImageView playSong = (ImageView)toolbarBottom.findViewById(R.id.play_theme_song);
        TextView textBottom = (TextView)toolbarBottom.findViewById(R.id.textview_bottom);
        ImageView displayInfo = (ImageView)toolbarBottom.findViewById(R.id.display_info);

        playSong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"You Clicked Play Song",Toast.LENGTH_LONG).show();
            }
        });

        textBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"You Clicked The Text",Toast.LENGTH_LONG).show();
            }
        });

        displayInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"You Clicked The Info",Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }
/**
    @Override
    public boolean onClick(MenuItem item){
        switch (item.getItemId()) {
            case R.id.play_theme_song:
                Toast.makeText(MainActivity.this, "Song Playing", Toast.LENGTH_LONG);
                return true;
            case R.id.textview_bottom:
                Toast.makeText(MainActivity.this, "You Clicked Song Name", Toast.LENGTH_LONG);
                return true;
            case R.id.display_info:
                Toast.makeText(MainActivity.this, "Info Displayed Here", Toast.LENGTH_LONG);
                return true;


        }
        return false;
    }
 */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                return true;

            case R.id.action_forward:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));

            case R.id.action_settings:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
