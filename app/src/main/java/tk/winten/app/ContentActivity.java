package tk.winten.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ContentActivity extends AppCompatActivity {

    Activity activity;
    WebView webView;
    int width;
    ProgressDialog progdia_content;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
//        width = getWindowManager().getDefaultDisplay().getWidth();
        progdia_content = new ProgressDialog(this);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
//        webView.getSettings().setDefaultFontSize(50);
//        webView.getSettings().setSupportZoom(true);
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        webView.setWebViewClient(new CustomWebViewClient());
//        webView.setWebChromeClient(new WebChromeClient());
//        webView.loadData("<html><head><style>img{max-width:" + width + ";height:auto;}</style></head><body>" + getIntent().getStringExtra("KONTEN") + "</body></html>", "text/html", "utf-8");
        webView.loadUrl(getIntent().getStringExtra("URL"));
        setTitle(getIntent().getStringExtra("JUDUL"));
        setContentView(webView);
    }

    private class CustomWebViewClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView webview, String url, Bitmap favicon) {
            progdia_content.show();
            progdia_content.setMessage("loading...");
            webview.setVisibility(View.INVISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            progdia_content.dismiss();
//            view.loadUrl("javascript:document.getElementById('main-header-wrapper').style.display='none';");
            view.loadUrl("javascript:(function() { " +
                    "document.getElementById('main-header-wrapper').style.display='none';" +
                    "document.getElementById('disqus_thread').style.display='none';" +
                    "document.getElementById('search-2').style.display='none';" +
                    "document.getElementById('et_social_followers-2').style.display='none';" +
                    "document.getElementById('et_authors-2').style.display='none';" +
                    "document.getElementById('footer').style.display='none';})()");
            view.setVisibility(View.VISIBLE);
            setTitle(view.getTitle());
            super.onPageFinished(view, url);
        }
    }
}
