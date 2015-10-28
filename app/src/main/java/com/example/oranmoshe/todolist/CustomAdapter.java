package com.example.oranmoshe.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by oranmoshe on 10/28/15.
 */

public class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String[] tasks) {
        super(context, R.layout.custom_row,tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater =  LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.custom_row, parent, false);
        String singleTask = getItem(position);
        TextView textView = (TextView)customView.findViewById(R.id.textViewTasks);
        textView.setText(singleTask);
        return  customView;
    }
}