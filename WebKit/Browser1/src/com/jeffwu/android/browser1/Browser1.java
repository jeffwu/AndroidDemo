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

        // javascript Ĭ�ϲ��������������������
        browser.getSettings().setJavaScriptEnabled(true);
   
        // ֱ�ӵ��� URL ��ַ���Ƿ�ʽ֮һ
        //browser.loadUrl("http://www.fresh3g.net/blog/");
        
        // �������ݣ��Ƿ�ʽ֮��
        browser.loadData("<html><head><title>html show</title></head><body>html show</body></html>", "text/html", "utf-8");
    }
}