package com.tranphunguyen.myhomemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        getSupportActionBar().setTitle("Mera Ghar");

        ListView listView=(ListView)findViewById(R.id.listview);

//create ArrayList of String
        final ArrayList<String> arrayList=new ArrayList<>();

//Add elements to arraylist
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wen");
        arrayList.add("Thurs");
        arrayList.add("Friday");
        arrayList.add("Saturday");
        arrayList.add("Sunday");


//Create Adapter
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

//assign adapter to listview
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(view.getContext(),MainActivity.class);
                    startActivity(intent);

                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Tue.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),Wen.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),Thurs.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),Fri.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),Saturday.class);
                    startActivity(intent);
                }
            }
        });
//add listener to listview

        }

    }
