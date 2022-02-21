package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity4 extends ListActivity {
    String[] attraction = {"Art Institute of Chicago" , "Magnificent Mile" , "Willis Tower", "Havy Pier" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction = {"Art Institute of Chicago" , "Magnificent Mile" , "Willis Tower", "Havy Pier" };
        setListAdapter(new ArrayAdapter<String>(this , R.layout.activity_main, R.id.travel, attraction));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW , Uri.parse("http://alfaisal.edu")));
                break;
            case 1:
                startActivity(new  Intent(MainActivity4.this , MainActivity4new.class));
                break;

        }
    }
}