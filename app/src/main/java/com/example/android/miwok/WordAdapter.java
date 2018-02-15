package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ghataks on 10/29/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        //Specify default constructor for WordAdapter similar to ArrayAdapter.
        super(context, 0, words);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView miwokImageView = listItemView.findViewById(R.id.miwok_image_view);

        if (currentWord.hasImage()) {
            miwokImageView.setImageResource(currentWord.getImageResourceID());
            miwokImageView.setVisibility(View.VISIBLE);
        } else {
            miwokImageView.setVisibility(View.GONE);
        }
        //Set the background color for the text view in the list_item xml layout
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
