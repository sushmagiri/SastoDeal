package com.example.user.sastodeal;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
//import android.os.Listener;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment {

    private ArrayList<Products> entityArrayList = new ArrayList<>();
    CustomAdapter adapter;
    View rootView;
    private Context mContext;

    private RecyclerView.LayoutManager mLayoutManager;

    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tab3, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recycler);

        rv.setHasFixedSize(true);
        prepareNewsData();


//        adapter = new CustomAdapter(entityArrayList);
        adapter = new CustomAdapter(entityArrayList, new CustomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Products item) {
                Intent intent = new Intent(getActivity(), AboutUs.class);
                intent.putExtra("data", (Serializable) item);
                startActivity(intent);
            }
        });
        mLayoutManager = new GridLayoutManager(mContext,2);
        rv.setLayoutManager(mLayoutManager);
//        LinearLayoutManager verticalLayoutmanager = new LinearLayoutManager(getActivity());
//        rv.setLayoutManager(verticalLayoutmanager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
        return rootView;
    }
    private void prepareNewsData() {
        entityArrayList.add(new Products(
                "Mheecha Navy Blue ", "Brand: Wildcraft\n" +
                "\n" +
                "Features:\n" +
                "\n" +
                "• Colour: Green\n" +
                "\n" +
                "• Product Code: 8903338052012\n" +
                "\n" +
                "• Material: Fabric\n" +
                "\n" +
                "• Laptop Sleeve: Yes\n" +
                "\n" +
                "• Compatible Laptop Size: 16 inch\n" +
                "\n" +
                "• Capacity: 28 Litres\n" +
                "\n" +
                "• Shoulder Strap Yes, Adjustable\n" +
                "\n" +
                "• 5 Years Warranty", R.drawable.meechabag, "रू 2,805/-\n"
        ));
        entityArrayList.add(new Products(
                "Stainless Steel Bottle ", "• Sport bottle\n" +
                "\n" +
                "• Capacity: 750 ml\n" +
                "\n" +
                "• Material: stainless steel body with pp cap\n" +
                "\n" +
                "• Flute design\n" +
                "\n" +
                "• Please mention the color in remarks during processing your order", R.drawable.bottle, "रू 450/-\n"
        ));
        entityArrayList.add(new Products(
                "Sky Lantern Lamp ", "• Includes 3 sky lantern\n" +
                "\n" +
                "• Mini hot-air balloons made up of paper\n" +
                "\n" +
                "• Multi Colored\n" +
                "\n" +
                "• Fire ignition makes it glow in the dark\n" +
                "\n" +
                "• Flame Retardant\n" +
                "\n" +
                "• Fully Assembled\n" +
                "\n" +
                "• 100% Biodegradable\n" +
                "\n" +
                "• 40\" Tall Balloons\n" +
                "\n" +
                "• Fly Over A Mile High!\n" +
                "\n" +
                "• Burns for 20-30 minutes", R.drawable.lantern, "रू 750/-\n"
        ));
        entityArrayList.add(new Products(
                "Combo Tshirts Pack", "• Product Code: 4130002\n" +
                "\n" +
                "• Color: Green & White\n" +
                "\n" +
                "• Size: S, L, XL, XXL\n" +
                "\n" +
                "• Half Sleeves and polo collar Design\n" +
                "\n" +
                "• Material: Cotton", R.drawable.plain, "रू 500/-\n"
        ));
        entityArrayList.add(new Products(
                "Mason Jar Bottle ", "• Product Code: NPZ59515\n" +
                "\n" +
                "• Color: Red\n" +
                "\n" +
                "• Material: Glass\n" +
                "\n" +
                "• With red/white cap and red straw", R.drawable.jar, "रू 250/-\n"
        ));

    }

}
