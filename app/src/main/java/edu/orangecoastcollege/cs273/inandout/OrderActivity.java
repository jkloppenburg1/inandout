package edu.orangecoastcollege.cs273.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

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

    private String orderTotalText;
    private String orderSummaryText;

    private Order currentOrder = new Order();

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void activateSummary(View view)
    {
        orderTotalText = getString(R.string.orderTotal) + currency.format(currentOrder.calculateTotal());
        orderSummaryText = getString(R.string.itemsOrdered) + currentOrder.calculateNumberOfItems()
                + getString(R.string.subtotal) + currency.format(currentOrder.calculateSubtotal())
                + getString(R.string.tax) + currency.format(currentOrder.calculateTax());


        Intent orderSummaryIntent = new Intent(this, SummaryActivity.class);
        orderSummaryIntent.putExtra("orderTotal", orderTotalText);
        orderSummaryIntent.putExtra("orderSummary", orderSummaryText);

        startActivity(orderSummaryIntent);
    }

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

        doubleDoubleTextView.setText(Double.toString(currentOrder.getPriceDoubleDouble()));
        cheeseburgerTextView.setText(Double.toString(currentOrder.getPriceCheeseburger()));
        frenchFriesTextView.setText(Double.toString(currentOrder.getPriceFrenchFries()));
        shakesTextView.setText(Double.toString(currentOrder.getPriceShakes()));
        smallDrinkTextView.setText(Double.toString(currentOrder.getPriceShakes()));
        mediumDrinkTextView.setText(Double.toString(currentOrder.getPriceMediumDrink()));
        largeDrinkTextView.setText(Double.toString(currentOrder.getPriceLargeDrink()));

        doubleDoubleEditText.addTextChangedListener(doubleDoubleChangedListener);
        cheeseburgerEditText.addTextChangedListener(cheeseburgerChangedListener);
        frenchFriesEditText.addTextChangedListener(frenchFriesChangedListener);
        shakesTextView.addTextChangedListener(shakesChangedListener);
        smallDrinkEditText.addTextChangedListener(smallDrinkChangedListener);
        mediumDrinkEditText.addTextChangedListener(mediumDrinkChangedListener);
        largeDrinkEditText.addTextChangedListener(largeDrinkChangedListener);
    }

    private TextWatcher doubleDoubleChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setDoubleDoubles(amount);

                }
                else
                {
                    int amount = 0;
                    currentOrder.setDoubleDoubles(amount);
                }

            }
            catch (NumberFormatException e)
            {
                doubleDoubleEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher cheeseburgerChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setCheeseburgers(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setCheeseburgers(amount);
                }

            }
            catch (NumberFormatException e)
            {
                cheeseburgerEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher frenchFriesChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setFrenchFries(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setFrenchFries(amount);
                }

            }
            catch (NumberFormatException e)
            {
                frenchFriesEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher shakesChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setShakes(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setShakes(amount);
                }

            }
            catch (NumberFormatException e)
            {
                shakesEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher smallDrinkChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setSmallDrinks(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setSmallDrinks(amount);
                }

            }
            catch (NumberFormatException e)
            {
               smallDrinkEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher mediumDrinkChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setMediumDrinks(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setMediumDrinks(amount);
                }

            }
            catch (NumberFormatException e)
            {
                mediumDrinkEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private TextWatcher largeDrinkChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0) {
                    int amount = Integer.parseInt(charSequence.toString());
                    currentOrder.setLargeDrinks(amount);
                }
                else
                {
                    int amount = 0;
                    currentOrder.setLargeDrinks(amount);
                }

            }
            catch (NumberFormatException e)
            {
                largeDrinkEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
