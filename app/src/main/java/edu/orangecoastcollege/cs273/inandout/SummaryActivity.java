package edu.orangecoastcollege.cs273.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private TextView orderTotalTextView;
    private TextView orderSummaryTextView;


    public void returnToDataEntry(View view)
    {
        this.finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        orderTotalTextView = (TextView) findViewById(R.id.orderTotalTextView);
        orderSummaryTextView = (TextView) findViewById(R.id.orderSummaryTextView);

        Intent intentFromOrderActivity = getIntent();

        String orderTotalText = intentFromOrderActivity.getStringExtra("orderTotal");
        orderTotalTextView.setText(orderTotalText);

        String orderSummaryText = intentFromOrderActivity.getStringExtra("orderSummary");
        orderSummaryTextView.setText(orderSummaryText);


    }
}
