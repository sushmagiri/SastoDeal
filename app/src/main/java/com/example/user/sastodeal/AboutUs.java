package com.example.user.sastodeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {
    private ArrayList<Products> entityArrayList = new ArrayList<>();
    CustomAdapter adapter;
    Products products;
    TextView newstitle,date,details;
    ImageView iv;

    Button btn_cart,btn_wish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#ffffff'>Sasto Deal</font>"));
        newstitle=(TextView)findViewById(R.id.title);
        date=(TextView)findViewById(R.id.price);
        details=(TextView)findViewById(R.id.details);
        iv=(ImageView)findViewById(R.id.imageView);
        btn_cart=(Button)findViewById(R.id.bt_cart);
        btn_wish=(Button)findViewById(R.id.btn_wish);
        Intent intent=getIntent();
        products= (Products) intent.getSerializableExtra("data");
        newstitle.setText(products.getNews_title());
        date.setText(products.getDate());
        details.setText(products.getNews_body());
        iv.setImageResource(products.getImage());
//        adapter = new CustomAdapter(entityArrayList, new CustomAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(Products item) {
//                Intent intent = new Intent(MainActivity.this, AboutUs.class);
//                intent.putExtra("data", (Serializable) item);
//                startActivity(intent);
//            }
//        });
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(AboutUs.this,Wishlist.class);
                startActivity(intent1);

            }
        });
        btn_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(AboutUs.this,Wishlist.class);
                startActivity(intent2);
            }
        });




    }
}
