package com.example.zubair.databaseworking;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdapter extends ArrayAdapter<Dog> {
    private Context mContext;
    private List<Dog> DogList = new ArrayList<>();

    public AnimalAdapter(@NonNull Context context, ArrayList<Dog> list) {
        super(context, 0, list);
        mContext = context;
        DogList = list;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {       View listItem = convertView;
    //Fist check if there is a view or not scrap view concept
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.singel_item_layout,parent,false);        // attach to rooot important because we will return add will be done after
           // Here single list item is view of a single item
            // Parent will be list view
             Dog currentanimal = DogList.get(position);
             TextView Name = (TextView)listItem.findViewById(R.id.Name);
             Name.setText(currentanimal.getM_Name());

           TextView Breed = (TextView)listItem.findViewById(R.id.Breed);
           Name.setText(currentanimal.getM_breed());

             return listItem;
    }





}