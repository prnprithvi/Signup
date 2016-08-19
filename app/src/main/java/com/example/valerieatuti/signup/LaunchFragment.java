package com.example.valerieatuti.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by valerieatuti on 7/27/16.
 */
public class LaunchFragment extends Fragment {

    Toolbar toolbar;
    WebView webView;
    String url;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        String prayer_name = this.getArguments().getString("prayer");
//        toolbar = (Toolbar) getView().findViewById(R.id.toolbar);

        //  toolbar.setTitle(prayer_name);


                url = "file:///android_asset/location.html";

        View rootView = inflater.inflate(R.layout.launch, container, false);


        //webView.setWebChromeClient(new MyWebChromeClient());
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

