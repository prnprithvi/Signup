package com.example.valerieatuti.signup.Eat;

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
 * Created by valerieatuti on 6/29/16.
 */
public class EatFragment extends Fragment {

    Toolbar toolbar;
    WebView webView;
    String url;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        url = "file:///android_asset/eat.html";

        View rootView = inflater.inflate(R.layout.launch, container, false);


        webView = (WebView) rootView.findViewById(R.id.webViewShowLaunch);
        webView.getSettings().setJavaScriptEnabled(true);



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