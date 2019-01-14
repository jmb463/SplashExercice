package com.example.jose.splashexercice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Menu_Activity extends Quiz_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);

        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);

        String[] items = {
                getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help)
        };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    // Launch the Game Activity
                    startActivity(new Intent(Menu_Activity.this, Game_Activity.class));
                }
                else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    // Launch the Help Activity
                    startActivity(new Intent(Menu_Activity.this, Help_Activity.class));
                }
                else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    // Launch the Settings Activity
                    startActivity(new Intent(Menu_Activity.this, Settings_Activity.class));
                }
                else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                        // Launch the Scores Activity
                        startActivity(new Intent(Menu_Activity.this, Scores_Activity.class));
                }
            }
        });
    }
}
