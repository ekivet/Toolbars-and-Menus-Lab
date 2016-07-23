package com.example.erickivet.toolbarlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Toolbar toolbarBottom = (Toolbar)findViewById(R.id.toolbar_bottom_2);

        ImageView playSong = (ImageView)toolbarBottom.findViewById(R.id.play_theme_song_2);
        ImageView playOtherSong = (ImageView)toolbarBottom.findViewById(R.id.image_bottom_2);
        TextView someText = (TextView)toolbarBottom.findViewById(R.id.textview_bottom_2);
        ImageView info = (ImageView)toolbarBottom.findViewById(R.id.display_info_2);

        playSong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Main2Activity.this,"You're",Toast.LENGTH_SHORT).show();
            }
        });

        playOtherSong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Main2Activity.this,"Clicking",Toast.LENGTH_SHORT).show();
            }
        });

        someText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Main2Activity.this,"Some",Toast.LENGTH_SHORT).show();
            }
        });

        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Main2Activity.this,"Stuff",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                onNavigateUp();
                return true;
            case R.id.action_done:
                Toast.makeText(Main2Activity.this,"Action Done",Toast.LENGTH_LONG).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
