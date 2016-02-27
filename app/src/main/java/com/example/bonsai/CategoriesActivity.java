package com.example.bonsai;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CategoriesActivity extends Activity {

    ArrayList<Map<String, String>> categoriesList;
    SimpleAdapter simpleAdpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        initList();

        ListView lv = (ListView) findViewById(R.id.listView);

        simpleAdpt = new SimpleAdapter(this, categoriesList, android.R.layout.simple_list_item_1,
                new String[]{"category"}, new int[]{android.R.id.text1});

        lv.setAdapter(simpleAdpt);

        // Sets listeners
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parentAdapter, View view, int position, long id) {
                TextView clickedView = (TextView) view;

                // Gets the id. Position corresponds to the category.
                Intent intent = new Intent(CategoriesActivity.this, CategoryPageActivity.class);
                intent.putExtra("CATEGORY NUMBER", position);
                startActivity(intent);

            }
        });
    }

    private void initList() {
        categoriesList = new ArrayList<Map<String, String>>();

        categoriesList.add(createCategory("category", "Fitness and Sports"));
        categoriesList.add(createCategory("category", "Education"));
        categoriesList.add(createCategory("category", "Arts"));
        categoriesList.add(createCategory("category", "Life Skills"));
        categoriesList.add(createCategory("category", "Fashion"));
        categoriesList.add(createCategory("category", "Media"));
        categoriesList.add(createCategory("category", "Video Games"));
        categoriesList.add(createCategory("category", "Coding"));
        categoriesList.add(createCategory("category", "Hobbies"));

    }

    private HashMap<String, String> createCategory(String key, String name) {
        HashMap<String, String> category = new HashMap<String, String>();
        category.put(key, name);

        return category;
    }

}
