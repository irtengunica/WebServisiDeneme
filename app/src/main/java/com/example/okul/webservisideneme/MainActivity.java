package com.example.okul.webservisideneme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;


public class MainActivity extends ActionBarActivity {
    /*
    private static String SOAP_ACTION1 = “http://www.w3schools.com/webservices/FahrenheitToCelsius”;
private static String SOAP_ACTION2 = “http://www.w3schools.com/webservices/CelsiusToFahrenheit”;
private static String NAMESPACE = “http://www.w3schools.com/webservices/”;
private static String METHOD_NAME1 = “FahrenheitToCelsius”;
private static String METHOD_NAME2 = “CelsiusToFahrenheit”;
private static String URL = “http://www.w3schools.com/webservices/tempconvert.asmx?wsdl”;
    */
    private static final String SOAP_ACTION="http://www.w3schools.com/webservices/FahrenheitToCelsius";
    private static final String METHOD_NAME="CelsiusToFahrenHeit";
    private static final String NAMESPACE="http://www.w3schools.com/webservices/";
    private static final String URL="http://www.w3schools.com/webservices/tempconvert.asmx?wsdl";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
