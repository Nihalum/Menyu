package com.team15.menyu;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.ListView;

import org.w3c.dom.Text;

public class FoodListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        FoodItem[] values = new FoodItem[6];
        for(int i = 0; i < 6; i++)  //ROHIT PUT IN THE ACTUAL SQL VALUES
        {
            values[i] = new FoodItem("Fried Chicken Cutlet", 12, 30);
//            values[i] = new FoodItem();
        }
        MenuOptionArrayAdapter adapter = new MenuOptionArrayAdapter(this, values);
        setListAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Intent intent = getIntent();
        //String restaurantTitle_I = intent.getStringExtra(LocationActivity.EXTRA_MESSAGE);
        TextView restaurant = (TextView) findViewById(R.id.restaurantTitle);
        //restaurant.setText(restaurantTitle_I);
        restaurant.setText("PLACEHOLDER TEA CAFE");

    }
}