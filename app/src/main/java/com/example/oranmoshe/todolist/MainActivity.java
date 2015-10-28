package com.example.oranmoshe.todolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] tasks = {"Pay bills", "Wash car", "Buy milk","Pick up my love"};
        CustomAdapter customAdapter = new CustomAdapter(this, tasks);
        ListView listViewTasks = (ListView)findViewById(R.id.listViewTasks);
        listViewTasks.setAdapter(customAdapter);

        Button btn = (Button)findViewById(R.id.buttonAddTask);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CreateTaskActivity.class));
            }
        });

    }
}
