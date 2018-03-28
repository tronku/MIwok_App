package com.example.tronku.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by tronku on 26/3/18.
 */

public class wordAdapter extends ArrayAdapter<word_class> {
    public wordAdapter(Activity context, ArrayAdapter<word_class> words)
    {
        super(context,0,words);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        return listItemView;
    }
}
