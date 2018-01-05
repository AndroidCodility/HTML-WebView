package com.codility.htmlwebview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webSetting = webView.getSettings()
        webSetting.setBuiltInZoomControls(true)
        webSetting.setJavaScriptEnabled(true)

        //Call method to display text inn WebView
        showHtmlWebView()
    }

    //Method to display html text
    private fun showHtmlWebView() {
        val mimeType = "text/html"
        val encoding = "UTF-8"
        val htmlString = "<html>\n" +
                "<body>\n" +
                "<center>\n" +
                "<img src='http://www.homeworknow.com/hwnow/upload/images/tn_star300.gif' />\n" +
                "<p>Hello World </p>\n" +
                "<font color='#60c000' size='4'><strong>Android Developer</strong></font>\n" +
                "<p>Android powers hundreds of millions of mobile devices in more than 190 countries around the world. It's the largest installed base of any mobile platform and growing fast—every day another million users power up their Android devices for the first time and start looking for apps, games, and other digital content.</p>\n" +
                "<p>Android gives you everything you need to build best-in-class app experiences. It gives you a single application model that lets you deploy your apps broadly to hundreds of millions of users across a wide range of devices—from phones to tablets and beyond.</p>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>\t\t "

        webView.loadData(htmlString, mimeType, encoding)
    }
}