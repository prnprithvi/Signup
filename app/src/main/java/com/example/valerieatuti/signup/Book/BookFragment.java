package com.example.valerieatuti.signup.Book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.valerieatuti.signup.R;

/**
 * Created by valerieatuti on 11/15/15.
 */
public class BookFragment extends Fragment {

    Toolbar toolbar;
    WebView webView;
    String url;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String prayer_name = this.getArguments().getString("prayer");


        switch (prayer_name) {

            //deluxe
            case "Deluxe Details":
                url = "file:///android_asset/deluxe_details.html";
                break;

            case "Book the Deluxe suite":
                url = "file:///android_asset/deluxe_book.html";
                break;

            //ensuite
            case "Ensuite Details":
                url = "file:///android_asset/ensuite_details.html";
                break;
            case "Book the Ensuite":
                url = "file:///android_asset/ensuite_book.html";
                break;

            //executive
            case "Executive Details":
                url = "file:///android_asset/executive_details.html";
                break;
            case "Book the Executive Suite":
                url = "file:///android_asset/executive_book.html";
                break;

            //luxury
            case "Luxury Details":
                url = "file:///android_asset/luxury_details.html";
                break;
            case "Book the Luxury Suite":
                url = "file:///android_asset/luxury_book.html";
                break;
        }

        View rootView = inflater.inflate(R.layout.launch, container, false);


        webView = (WebView) rootView.findViewById(R.id.webViewShowLaunch);
        webView.getSettings().setJavaScriptEnabled(true);


        // https://twitter.com/Pontifex


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                // Handle the error
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });


        webView.loadUrl(url);


        return rootView;
    }



}

