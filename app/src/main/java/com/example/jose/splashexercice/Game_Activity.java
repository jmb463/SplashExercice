package com.example.jose.splashexercice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Game_Activity extends Quiz_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.gameoptions, menu);
        menu.findItem(R.id.help_menu_item).setIntent(
                new Intent(this, Help_Activity.class));
        menu.findItem(R.id.settings_menu_item).setIntent(
                new Intent(this, Settings_Activity.class));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        startActivity(item.getIntent());
        return true;
    }
}
