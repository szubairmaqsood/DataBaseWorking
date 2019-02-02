package com.example.zubair.databaseworking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Dog> CollectionOfAnimal;
        CollectionOfAnimal=new ArrayList<Dog>();
        CollectionOfAnimal.add(new Dog("One","lutti","Male",10));
        CollectionOfAnimal.add(new Dog("Two","Otiko","Female",20));

        final ListView L1=(ListView) findViewById(R.id.MainActivityListView);
       AnimalAdapter one=new AnimalAdapter(this,CollectionOfAnimal);
       L1.setAdapter(one);

        L1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                Dog  itemValue    =(Dog) L1.getItemAtPosition(itemPosition);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue.getM_Name() , Toast.LENGTH_LONG)
                        .show();

            }

        });




    }

    public void  OtherActivity(View view)
    {
        Intent i = new Intent(getApplicationContext(), Detail.class);
        startActivity(i);
    }
}
