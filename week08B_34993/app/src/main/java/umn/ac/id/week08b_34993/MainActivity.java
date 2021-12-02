package umn.ac.id.week08b_34993;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity<savedInstanceState> extends AppCompatActivity {

    private Object View;
    private int mCount = 0;
    private int mWarna;
    private TextView tvCounter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        tvCounter = (TextView) findViewById(R.id.tvCounter);

        public void gantiBackground(View Notification.WearableExtender view;
        view){
            int warna = ((ColorDrawable)view.getBackground()).getColor();
            mWarna = warna;
            tvCounter.setBackgroundColor(warna);
        }
        public void tambahCounter(View view){
            mCount++;
            tvCounter.setText(String.valueOf(mCount));
        }
        public void reset(View view){
            mCount = 0;
            tvCounter.setText(String.valueOf(mCount));
            mWarna = ContextCompat.getColor(context,R.color.default_background);
            tvCounter.setBackgroundColor(mWarna);
        }

    }
    private final String COUNTER_KEY = "counter";
    private final String WARNA_KEY = "warna";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_KEY, mCount);
        outState.putInt(WARNA_KEY, mWarna);
    }
    if (savedInstanceState != null) {
        mCount = savedInstanceState.getInt(COUNTER_KEY);
        if (mCount != 0) {
            tvCounter.setText(String.valueOf(mCount));
        }
        mWarna = savedInstanceState.getInt(WARNA_KEY);
        tvCounter.setBackgroundColor(mWarna);
    }
}

