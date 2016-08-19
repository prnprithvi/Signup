package com.example.valerieatuti.signup;

/**
 * Created by valerieatuti on 7/28/16.
 */

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Spinner;

import com.example.valerieatuti.signup.Amenities.AmmenitiesFragment;
import com.example.valerieatuti.signup.ContactUs.ContactUsFragment;
import com.example.valerieatuti.signup.Eat.EatFragment;
import com.example.valerieatuti.signup.Register.RegisterFragment;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.youtube.YouTube;

public class Home extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar toolbar;
    private static final String YOUTUBE_PLAYLIST = "PLwHV_QFJijrxibV2k5SyrEYan0I42MaCi";
    private YouTube mYoutubeDataApi;
    private final GsonFactory mJsonFactory = new GsonFactory();
    private final HttpTransport mTransport = AndroidHttp.newCompatibleTransport();
    Spinner spinner_nav;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle(R.string.app_name);

        //youtube stuff

        //Check for any issues kama the official youtube app is installed

      /*  final YouTubeInitializationResult result = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this);

        if (result != YouTubeInitializationResult.SUCCESS) {
            //If there are any issues we can show an error dialog.
            result.getErrorDialog(this, 0).show();
        }

        mYoutubeDataApi = new YouTube.Builder(mTransport, mJsonFactory, null)
                .setApplicationName(getResources().getString(R.string.app_name))
                .build();*/

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.menu);

        mDrawerLayout.openDrawer(Gravity.LEFT);

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the LaunchFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();

        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new LaunchFragment()
        ).commit();


        /**
         * Setup click events on the Navigation View Items.
         */


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();


                if (menuItem.getItemId() == R.id.home) {

                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView, new AboutFragment()).commit();
                    toolbar.setTitle("Home");
                }
                if (menuItem.getItemId() == R.id.eat) {

                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView, new EatFragment()).commit();

                    toolbar.setTitle("Eat");
                }
                if (menuItem.getItemId() == R.id.service) {

                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView, new Services()).commit();
                    toolbar.setTitle("Service");
                }

                    if (menuItem.getItemId() == R.id.book) {

                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new ViewBookFragment()).commit();
                        toolbar.setTitle("Book");
                    }
                    if (menuItem.getItemId() == R.id.location) {

                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new LaunchFragment()).commit();
                        toolbar.setTitle("Location");
                    }
                    if (menuItem.getItemId() == R.id.register) {

                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new RegisterFragment()).commit();

                        toolbar.setTitle("Register");
                    }
                    if (menuItem.getItemId() == R.id.amenities) {


                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new AmmenitiesFragment()).commit();

                        toolbar.setTitle("Amenities");
                    }
                    if (menuItem.getItemId() == R.id.about_us) {


                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new Services()).commit();

                        toolbar.setTitle("About us");
                    }


                    if (menuItem.getItemId() == R.id.contact_us) {
                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new ContactUsFragment()).commit();

                        toolbar.setTitle("Contact Us");
                    }
                    if (menuItem.getItemId() == R.id.share) {
                        FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                        xfragmentTransaction.replace(R.id.containerView, new ContactUsFragment()).commit();

                        toolbar.setTitle("Share");
                    }


                    return false;
                }

            }

            );

            ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                    R.string.app_name);


            mDrawerLayout.setDrawerListener(mDrawerToggle);

            mDrawerToggle.syncState();

        }
    }
