package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText etname,etnumber;
Button button;
String name,number;
ListView listView;
ArrayList<LvItem>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etname);
        etnumber = findViewById(R.id.etnumber);
        button = findViewById(R.id.button);
        listView = findViewById(R.id.lv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etname.getText().toString();
                number = etnumber.getText().toString();

                LvItem lvItem = new LvItem();
                lvItem.setName(name);
                lvItem.setNumber(number);
            }


            String[] lvItem = new String[]{"ListView Example", "ListView with FAB", "FAB with Simple List View in Android", "ListView Adapter with Floating Action Button",
                    "Android FAB and ListView Example", "List View and FAB Source Code", "FAB and List View Array", "Floating Action Button FAB", "ListView Example",
                    "ListView with FAB", "FAB with Simple List View in Android", "ListView Adapter with Floating Action Button",
                    "Android FAB and ListView Example", "List View and FAB Source Code", "FAB and List View Array"
            };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItwms);
        listView.setAdapter(adapter);
        });
    }
}