package com.fantastycznaczworka.flatapp.view.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import com.fantastycznaczworka.flatapp.R;
import com.fantastycznaczworka.flatapp.view.fragment.BrowseOffersFragment;

/**
 * Created by RobertB on 2016-04-08.
 */
public class BrowseOffersActivity extends Activity {

    private BrowseOffersFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_offers);
        FragmentManager fragmentManager = getFragmentManager();
        fragment = new BrowseOffersFragment();

        fragmentManager.beginTransaction().add(R.id.browse_offers_fragment, fragment).commit();
    }
}
