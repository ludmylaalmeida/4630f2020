package com.example.investiment_portfolio.ui.portfolio;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.investiment_portfolio.R;
import com.example.investiment_portfolio.entity.Product;

import java.util.ArrayList;
import java.util.List;
import com.example.investiment_portfolio.entity.Product;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class PortfolioFragment extends Fragment {

    private PortfolioViewModel portfolioViewModel;
    private TableLayout tableLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        portfolioViewModel =
                ViewModelProviders.of(this).get(PortfolioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_portfolio, container, false);
        tableLayout = (TableLayout) root.findViewById(R.id.tableLayoutProduct);
        loadData();
        return root;
    }

    private void loadData() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("AAPL", 114.95, 15.86, 128.54));
        products.add(new Product("AMD", 28.90, 80.98, 87.35));
        products.add(new Product("BAC", 23.68, 21.21, 12.68));
        products.add(new Product("BPT", 1.325, 2.80, 353.72));
        products.add(new Product("DAL", 30.43, 86.01, 45.32));
        products.add(new Product("LYFT", 29.19, 67.49, 400.45));
        products.add(new Product("OXY", 9.81, 8.28, 303.93));
        products.add(new Product("OXY.WS", 2.64, 0.16, 18.48));
        products.add(new Product("UAL", 33.34, 14.28, 212.78));

        createColumns();

        fillData(products);

    }

    private void createColumns() {
        TableRow tableRow = new TableRow(this.getActivity());
        tableRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Id Column
        TextView textViewId = new TextView(this.getActivity());
        textViewId.setText("Id");
        textViewId.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewId.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewId);

        // last Column
        TextView textViewLast = new TextView(this.getActivity());
        textViewLast.setText("Last");
        textViewLast.setGravity(Gravity.RIGHT);
        textViewLast.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewLast.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewLast);

        // day Gain Column
        TextView textViewDayGain = new TextView(this.getActivity());
        textViewDayGain.setText("Day's Gain");
        textViewDayGain.setGravity(Gravity.RIGHT);
        textViewDayGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(textViewDayGain);

        // total  Column
        TextView textViewTotalGain = new TextView(this.getActivity());
        textViewTotalGain.setText("Total Gain");
        textViewTotalGain.setGravity(Gravity.RIGHT);
        textViewTotalGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewTotalGain.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewTotalGain);

        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Add Divider
        tableRow = new TableRow(this.getActivity());
        tableRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Id Column
        textViewId = new TextView(this.getActivity());
        textViewId.setText("__________");
        textViewId.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewId.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewId);

        // Last Column
        textViewLast = new TextView(this.getActivity());
        textViewLast.setText("____________");
        textViewLast.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewLast.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewLast);

        // Day Gain Column
        textViewDayGain = new TextView(this.getActivity());
        textViewDayGain.setText("_______________");
        textViewDayGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewDayGain.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewDayGain);

        // TotalGain Column
        textViewTotalGain = new TextView(this.getActivity());
        textViewTotalGain.setText("______________");
        textViewTotalGain.setGravity(Gravity.RIGHT);
        textViewTotalGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewTotalGain.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewTotalGain);


        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

    }

    private void fillData(List<Product> products) {
        for (Product product : products) {
            TableRow tableRow = new TableRow(this.getActivity());
            tableRow.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));

            tableRow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TableRow currentRow = (TableRow) view;
                    TextView textViewId = (TextView) currentRow.getChildAt(0);
                    String id = textViewId.getText().toString();
//                    Toast.makeText(getApplicationContext(), id, Toast.LENGTH_LONG).show();
                }
            });

            // Symbol Column
            TextView textViewId = new TextView(this.getActivity());
            textViewId.setText(product.getSymbol());
            textViewId.setTextColor(Color.parseColor("#B486FF"));
            textViewId.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewId.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewId);

            // Last Column
            TextView textViewLast = new TextView(this.getActivity());
            textViewLast.setText(getText(R.string.usd) + String.valueOf(product.getLast()));
            textViewLast.setGravity(Gravity.RIGHT);
            textViewLast.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewLast.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewLast);

            // Day's Gain Column
            TextView textViewDaysGain = new TextView(this.getActivity());
            textViewDaysGain.setText(getText(R.string.usd) + String.valueOf(product.getDaysGain()));
            textViewDaysGain.setGravity(Gravity.RIGHT);
            textViewDaysGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewDaysGain.setPadding(10 , 10, 10, 0);
            tableRow.addView(textViewDaysGain);

            // Total Gain's Column
            TextView textViewTotalGain = new TextView(this.getActivity());
            textViewTotalGain.setText(getText(R.string.usd) + String.valueOf(product.getTotalGain()));
            textViewTotalGain.setGravity(Gravity.RIGHT);
            textViewTotalGain.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewTotalGain.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewTotalGain);

            tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
        }
    }


}