package com.example.user.sastodeal;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment  {
    private ArrayList<Products> entityArrayList = new ArrayList<>();
    private ArrayList<Products> entityArrayListSection = new ArrayList<>();
    CustomAdapter adapter;
    CustomAdapterSection adapter1;
    View rootView;

    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);
        RecyclerView rv1 = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        rv1.setHasFixedSize(true);
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
        adapter1 = new CustomAdapterSection(entityArrayListSection);
        LinearLayoutManager verticalLayoutmanager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(verticalLayoutmanager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
//        LinearLayoutManager verticalLayoutmanager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//       rv1.setLayoutManager(verticalLayoutmanager1);
//        rv1.setItemAnimator(new DefaultItemAnimator());
        rv1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rv1.setAdapter(adapter1);
        return rootView;
    }

    private void prepareNewsData() {

            entityArrayList.add(new Products(
                    "ONE PIECE ", "• Colour: Red\n" +
                    "\n" +
                    "• Size: Length – 39” Sleeve – 21.5”\n" +
                    "\n" +
                    "• Material: Bodycon", R.drawable.onepiece, "रू 2,805/-\n"
                    ));
            entityArrayList.add(new Products("BLACK OUTER","• Color: Black\n" +
                    "\n" +
                    "• Size: Free Size\n" +
                    "\n" +
                    "• Material: Cotton" , R.drawable.outer, "रू 1,760/-\n"));
            entityArrayList.add(new Products("LADIES SHIRT", "•  Color: Black, White\n" +
                    "\n" +
                    "•  Size: 32\n" +
                    "\n" +
                    "•  Material: Cotton", R.drawable.tshirt, "रू 1,720/-\n"
                   ));
        entityArrayList.add(new Products("LADIES SHIRT", "Product Code – N6\n" +
                "\n" +
                "Color – Mehendi & Purple Contrast\n" +
                "\n" +
                "Material – Tissue & Georgette", R.drawable.saree, "रू 1,720/-\n"
        ));

        entityArrayList.add(new Products("WOOLEN SHOCKS ", "• Material: Woolen\n" +
                "\n" +
                "• Color: Green\n" +
                "\n" +
                "• Age group: New born to 3 months old\n" +
                "\n" +
                "• Handmade woolen socks and hat\n" +
                "\n" +
                "Delivery will be made within one week!", R.drawable.topi, "रू 450/-\n"
        ));
        entityArrayList.add(new Products("ALPINE HAT", "• Brand: Alpinestars\n" +
                "\n" +
                "• Color: White\n" +
                "\n" +
                "• Size: OS (Free size)\n" +
                "\n" +
                "• Snapback\n" +
                "\n" +
                "• Front panel ballistic nylon\n" +
                "\n" +
                "• Contrast faux carbon fiber underbill\n" +
                "\n" +
                "• Front logo in 3d embroidery\n" +
                "\n" +
                "• 47%nylon\n" +
                "\n" +
                "• 42%acrylic\n" +
                "\n" +
                "• 11%wool\n" +
                "\n" +
                "• Product from Alpinestars, Italy\n" +
                "\n" +
                "• Launched in 2016, New Model of the Year", R.drawable.hat, "रू 14,504/-\n"
        ));
        entityArrayList.add(new Products(
                "ONE PIECE ", "", R.drawable.onepiece, "रू 2,805/-\n"
        ));
        entityArrayList.add(new Products("BLACK OUTER", "", R.drawable.outer, "रू 1,760/-\n"));
        entityArrayList.add(new Products("LADIES SHIRT", "", R.drawable.tshirt, "रू 1,720/-\n"
        ));

        entityArrayList.add(new Products("WOOLEN SHOCKS ", "", R.drawable.topi, "रू 450/-\n"
        ));
        entityArrayList.add(new Products("ALPINE HAT", "", R.drawable.hat, "रू 14,504/-\n"
        ));
        entityArrayListSection.add(new Products(
                "ROCKPORT STRAP ", "", R.drawable.chappal, "रू 4,074/-\n" ));
        entityArrayListSection.add(new Products("GOLDSTAR SHOE", "", R.drawable.goldstar, "रू 8,425/-\n"));
        entityArrayListSection.add(new Products("BOOT", "", R.drawable.boot, "रू 7,134/-\n"));
        entityArrayListSection.add(new Products("PARTY SHOE", "", R.drawable.jutta, "रू 5,094/-\n"));
        entityArrayListSection.add(new Products("FUTSAL SHOE", "", R.drawable.futsalshoe, "रू 5,094/-\n"));
        entityArrayListSection.add(new Products("HATTI CHAAP", "", R.drawable.hati, "रू 350/-\n"));
        entityArrayListSection.add(new Products(
                "ROCKPORT STRAP ", "", R.drawable.chappal, "रू 4,074/-\n" ));
        entityArrayListSection.add(new Products("GOLDSTAR SHOE", "", R.drawable.goldstar, "रू 8,425/-\n"));
        entityArrayListSection.add(new Products("BOOT", "", R.drawable.boot, "रू 7,134/-\n"));
        entityArrayListSection.add(new Products("PARTY SHOE", "", R.drawable.jutta, "रू 5,094/-\n"));
        entityArrayListSection.add(new Products("FUTSAL SHOE", "", R.drawable.futsalshoe, "रू 5,094/-\n"));
        entityArrayListSection.add(new Products("HATTI CHAAP", "", R.drawable.hati, "रू 350/-\n"));








    }
}
