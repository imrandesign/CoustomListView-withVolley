package com.bangloss.app.testcheck;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Imran Hossain on 7/23/2017.
 */

public class CoustmData extends ArrayAdapter {

    Activity context;
    String[] ids;
    String[] name;


    public CoustmData(Activity context, String[] ids, String[] name) {
        super(context, R.layout.item,ids);

        this.context=context;
        this.ids=ids;
        this.name=name;



    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater Inflater=context.getLayoutInflater();

        View listViewItem=Inflater.inflate(R.layout.item,null,false);

        TextView TextName=(TextView)listViewItem.findViewById(R.id.textView);
        CheckBox checkBox=(CheckBox)listViewItem.findViewById(R.id.checkBox);


        TextName.setText(name[position]);
        return listViewItem;

    }
}
