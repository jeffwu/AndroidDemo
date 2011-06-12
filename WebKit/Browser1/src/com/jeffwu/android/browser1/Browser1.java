package com.jeffwu.android.browser1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Browser1 extends Activity {
	WebView browser;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        browser = (WebView)findViewById(R.id.webkit);

        // javascript 默认不被启动，这里进行启用
        browser.getSettings().setJavaScriptEnabled(true);
   
        // 直接调用 URL 网址，是方式之一
        //browser.loadUrl("http://www.fresh3g.net/blog/");
        
        // 加载数据，是方式之二
        browser.loadData("<html><head><title>html show</title></head><body>html show</body></html>", "text/html", "utf-8");
    }
}