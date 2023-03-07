package com.example.class226userdefinedmethod;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if ( checkInternet() ){
                    showToast("Internet Available");

                }else {
                    showToast("No Internet");

                }


            }
        });



    }
//============================== On Create bundle finished  =================================
//============================== On Create bundle finished  =================================
//============================== On Create bundle finished  =================================



    // =================== Check Internet===================

 private boolean checkInternet(){

    ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


     if (networkInfo!=null && networkInfo.isConnected()){
         return true;

     }else {
         return false;
     }

 }
//------------------------- Show Toast================================

    private void showToast(String myString){

        Toast.makeText(MainActivity.this, ""+myString, Toast.LENGTH_LONG).show();
    }

    //=================Number Addidition==================

    private void addNum (int a, int b, int c){

        int sum = a+b+c;
        button.setText("Sum is: " + sum);

    }

    //===================   Show toast ============================
    private void salaryCount (String name, int salary){

        Toast.makeText(MainActivity.this, " Hello "+name+"\n Your salary is: "+salary, Toast.LENGTH_LONG).show();
    }

    // =============== Show toast finished =========================
    // ================== Alert Dialogue =========================

    private void alertDialogue(){


        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Are you sure to Exit")
                .setMessage("Exiting will call finish() method")

                //set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what would happen when positive button is clicked
                        finish();
                    }
                })

                //set negative button
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what should happen when negative button is clicked
                        Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                    }
                })
                .show();

    }
// ===================================== Alert dialogue ===================
}