package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
public class MainActivity extends AppCompatActivity {

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        listView = findViewById( R.id.list );
        
        final String[] stringList = {"Android", "Java", "XML", "API"};
        
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this
                , android.R.layout.simple_list_item_1
                , Arrays.asList( stringList ) );
        
        listView.setAdapter( arrayAdapter );
        
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( MainActivity.this, stringList[i], Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
