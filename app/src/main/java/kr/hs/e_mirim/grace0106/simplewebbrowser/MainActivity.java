package kr.hs.e_mirim.grace0106.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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
    }

    @Override
    public void onClick(View v) {

    }
}
