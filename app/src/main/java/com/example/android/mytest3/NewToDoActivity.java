package com.example.android.mytest3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class NewToDoActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText editText;
    private Button button;
    public static final String EXTRA_MESSAGE = "com.example.mytest3.MESSAGE";
    public ArrayList<ToDoItem> toDoItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_to_do);


        toolbar = (Toolbar) findViewById(R.id.new_toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        editText = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.saveButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNewToDoItem();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void sendNewToDoItem() {
        Intent intent = new Intent();
        String toDoContent = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, toDoContent);
        setResult(RESULT_OK, intent);
        finish();
    }


}
