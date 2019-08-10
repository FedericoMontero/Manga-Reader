package com.fedemcodee.federico.mangareader2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Historia manga", "Categorie Book", "Description", R.drawable.foto1));
        lstBook.add(new Book("Historia manga2", "Categorie Book", "Description", R.drawable.foto2));
        lstBook.add(new Book("Historia manga3", "Categorie Book", "Description", R.drawable.foto3));
        lstBook.add(new Book("Historia manga4", "Categorie Book", "Description", R.drawable.foto4));
        lstBook.add(new Book("Historia manga6", "Categorie Book", "Description", R.drawable.foto6));
        lstBook.add(new Book("Historia manga", "Categorie Book", "Description", R.drawable.foto1));
        lstBook.add(new Book("Historia manga2", "Categorie Book", "Description", R.drawable.foto2));
        lstBook.add(new Book("Historia manga3", "Categorie Book", "Description", R.drawable.foto3));
        lstBook.add(new Book("Historia manga4", "Categorie Book", "Description", R.drawable.foto4));
        lstBook.add(new Book("Historia manga5", "Categorie Book", "Description", R.drawable.foto5));
        lstBook.add(new Book("Historia manga6", "Categorie Book", "Description", R.drawable.foto6));
        lstBook.add(new Book("Historia manga", "Categorie Book", "Description", R.drawable.foto1));
        lstBook.add(new Book("Historia manga2", "Categorie Book", "Description", R.drawable.foto2));
        lstBook.add(new Book("Historia manga3", "Categorie Book", "Description", R.drawable.foto3));
        lstBook.add(new Book("Historia manga4", "Categorie Book", "Description", R.drawable.foto4));
        lstBook.add(new Book("Historia manga5", "Categorie Book", "Description", R.drawable.foto5));
        lstBook.add(new Book("Historia manga6", "Categorie Book", "Description", R.drawable.foto6));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
