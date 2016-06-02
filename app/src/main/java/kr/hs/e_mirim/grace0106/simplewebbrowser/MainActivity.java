package kr.hs.e_mirim.grace0106.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editUrl;
    Button butMove, butPre;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUrl = (EditText)findViewById(R.id.edit_url);
        butMove = (Button)findViewById(R.id.but_move);
        butPre = (Button)findViewById(R.id.but_pre);
        web = (WebView)findViewById(R.id.web);
        butMove.setOnClickListener(this);
        butPre.setOnClickListener(this);
        web.setWebViewClient(new WebViewClient());
        WebSettings webset = web.getSettings();
        webset.setBuiltInZoomControls(true);
        webset.setJavaScriptEnabled(true);
        web.loadUrl("http://www.naver.com");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.but_move:
                if (editUrl.getText().toString().contains("http://")==true)
                {
                    web.loadUrl(editUrl.getText().toString());
                    break;
                } else {
                    web.loadUrl("http://" + editUrl.getText().toString());
                    break;
                }
            case R.id.but_pre:
                web.goBack();
                break;
        }
    }
}
