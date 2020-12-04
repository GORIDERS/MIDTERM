package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;

Button button;
String name,number,gender;
ListView listView;
ArrayList<LvItem>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fab = findViewById(R.id.flot);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.fabitems);
                final EditText etname = dialog.findViewById(R.id.etname);
                final EditText etgender = dialog.findViewById(R.id.etgender);
                final EditText etnumber = dialog.findViewById(R.id.etnumber);
                Button button = dialog.findViewById(R.id.button);


        button = findViewById(R.id.button);
        listView = findViewById(R.id.lv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etname.getText().toString();
                number = etnumber.getText().toString();
                gender = etgender.getText().toString();

                LvItem lvItem = new LvItem();
                lvItem.setName(name);
                lvItem.setNumber(number);
                lvItem.setGender(gender);
                arrayList.add(lvItem);

                ContectAdapter contectAdapter = new ContectAdapter(arrayList, MainActivity.this);
                listView.setAdapter(contectAdapter);
            });

        dialog.show();
        });
    }
}