package com.velov.ehevin.velov;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        new GetStation().execute();
    }

    private class GetStation extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {

            setContentView(R.layout.activity_detail);
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            String name = getIntent().getStringExtra("name");
            TextView tv_name = findViewById(R.id.name);

            String bike_stands = getIntent().getStringExtra("bike_stands");
            TextView tv_bike_stands = findViewById(R.id.bike_stands);

            tv_bike_stands.setText(bike_stands);
            tv_name.setText(name);
        }
    }
}
