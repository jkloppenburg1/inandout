package edu.orangecoastcollege.cs273.inandout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    private TextView doubleDoubleTextView;
    private TextView cheeseburgerTextView;
    private TextView frenchFriesTextView;
    private TextView shakesTextView;
    private TextView smallDrinkTextView;
    private TextView mediumDrinkTextView;
    private TextView largeDrinkTextView;

    private EditText doubleDoubleEditText;
    private EditText cheeseburgerEditText;
    private EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallDrinkEditText;
    private EditText mediumDrinkEditText;
    private EditText largeDrinkEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        doubleDoubleTextView = (TextView) findViewById(R.id.doubleDoubleTextView);
        cheeseburgerTextView = (TextView) findViewById(R.id.cheeseburgerTextView);
        frenchFriesTextView = (TextView) findViewById(R.id.frenchFriesTextView);
        shakesTextView = (TextView) findViewById(R.id.shakesTextView);
        smallDrinkTextView = (TextView) findViewById(R.id.smallDrinkTextView);
        mediumDrinkTextView = (TextView) findViewById(R.id.mediumDrinkTextView);
        largeDrinkTextView = (TextView) findViewById(R.id.largeDrinkTextView);

        doubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText = (EditText) findViewById(R.id.cheeseburgerEditText);
        frenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        shakesEditText = (EditText) findViewById(R.id.shakesEditText);
        smallDrinkEditText = (EditText) findViewById(R.id.smallDrinkEditText);
        mediumDrinkEditText = (EditText) findViewById(R.id.mediumDrinkEditText);
        largeDrinkEditText = (EditText) findViewById(R.id.largeDrinkEditText);
    }
}
