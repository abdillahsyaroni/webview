package com.onioni.aplikasiwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    // deklarasi webview
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //menghilangkan header dan statusbar
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://paketwisata.desaedelweisswonokitri.com")

        //web setting
        val webSettings = webView.settings

        //aktifkan javascript
        webSettings.javaScriptEnabled = true

        //mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        } else {
        super.onBackPressed()
    }
}}