package com.example.valerieatuti.signup.YouTube;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.valerieatuti.signup.Book.ExpandbleListAdapter;
import com.example.valerieatuti.signup.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewEatFragment extends Fragment {

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    //prayers listview stuff
    ExpandbleListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    Context c;
View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.book_fragment, null);
        view = inflater.inflate(R.layout.book_fragment, container, false);
        mFragmentManager = getFragmentManager();

        //set up expandable list for prayers

        // get the listview

        expListView = (ExpandableListView) view.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandbleListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        /**
         * Ends here
         */

        // Handle click items za child items kwa hio expandable list
        expListView.setOnChildClickListener(new
                                                    ExpandableListView.OnChildClickListener() {

                                                        @Override
                                                        public boolean onChildClick(ExpandableListView parent, View v,
                                                                                    int groupPosition, int childPosition, long id) {


                                                            FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();

                                                            Bundle bundle = new Bundle();
                                                            String prayer = listDataChild.get(
                                                                    listDataHeader.get(groupPosition)).get(
                                                                    childPosition);
                                                            bundle.putString("prayer", prayer);
                                                            com.example.valerieatuti.signup.Book.BookFragment prayerFragment = new com.example.valerieatuti.signup.Book.BookFragment();
                                                            prayerFragment.setArguments(bundle);

                                                            xfragmentTransaction.replace(R.id.containerView, prayerFragment).addToBackStack( "tag" ).commit();
                                                            return false;
                                                        }
                                                    }

        );


        return view;
    }

    /*
     * Preparing the list data for Prayers Fragment
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data

        listDataHeader.add("Villae Rosa");
        listDataHeader.add("Savannah");
        listDataHeader.add("Fire and Grill Restaurant");
        listDataHeader.add("Habesha");

        // Adding child data
        List<String> daily_prayers = new ArrayList<String>();
        daily_prayers.add("Chef's Menu");


        List<String> rosary = new ArrayList<String>();
        rosary.add("Menu");

        List<String>missal = new ArrayList<String>();
        missal.add("Grilled Meat");


        List<String>cross = new ArrayList<String>();
        cross.add("Today's delight");



        listDataChild.put(listDataHeader.get(0), daily_prayers); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rosary);
        listDataChild.put(listDataHeader.get(2),cross);
        listDataChild.put(listDataHeader.get(3),missal);
    }

}