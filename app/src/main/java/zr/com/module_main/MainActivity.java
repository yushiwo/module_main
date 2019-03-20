package zr.com.module_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import zr.com.module_lib.LibTest;

public class MainActivity extends AppCompatActivity {

    private TextView mContentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mContentTextView = findViewById(R.id.tv_content);
        mContentTextView.setText(LibTest.getLibStr() + "main3");
    }
}
