package com.mate.android.warrantee.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.mate.android.warrantee.R;
import com.mate.android.warrantee.adapters.ProductsAdapter;
import com.mate.android.warrantee.models.Product;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    RecyclerView rvProducts;
    RecyclerView.Adapter adapter;
    LinearLayoutManager llm;

    ArrayList<Product> products = new ArrayList<>();
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Products");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvProducts = (RecyclerView) findViewById(R.id.rvProducts);
        llm = new LinearLayoutManager(this);
        rvProducts.setLayoutManager(llm);

        products.add(new Product("1","Moto M","","Motorola","1279d98d9","2 days"));
        products.add(new Product("1","Moto M","","Motorola","1279d98d9","2 days"));
        products.add(new Product("1","Moto M","","Motorola","1279d98d9","2 days"));
        products.add(new Product("1","Moto M","","Motorola","1279d98d9","2 days"));

        adapter = new ProductsAdapter(this,products);
        rvProducts.setAdapter(adapter);

    }
}
