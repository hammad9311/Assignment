package com.example.dell.assignment;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Hammad on 3/22/2017.
 */

public class ContactDetails extends Activity{
    GradientDrawable backgroundGradient;
    TextView nameView,phoneNumber,twoCharacter;
    Person student;
    String singleName,twoLetter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);
        findAllViews();



        Bundle data = getIntent().getExtras();
        student = (Person) data.getParcelable("Haamad");
        TextView listImage=(TextView) findViewById(R.id.resultImage);
        backgroundGradient = (GradientDrawable)listImage.getBackground();

        setAllViews();
        //Sets colors according to alphabet
        setColor();
    }
    //Find the first two initial letter
    private  String splitName(){
        String[] words=student.getName().split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){
            twchar+=w.charAt(0);
        }
        return twchar;
    }


    private  void findAllViews(){
        nameView=(TextView)findViewById(R.id.nameView) ;
        twoCharacter=(TextView) findViewById(R.id.twoCharacter);
        phoneNumber=(TextView)findViewById(R.id.mobileNumber);
    }

    //input all the values
    private  void setAllViews(){
        nameView.setText(student.getName());

        twoLetter=splitName();
        twoCharacter.setText(twoLetter);
        phoneNumber.setText(student.getContactNo());
    }
    //Set the color accordingly
    private  void setColor(){
        if(twoLetter.charAt(0)>='A' && twoLetter.charAt(0)<='D') {
            backgroundGradient.setColor(Color.RED);

        }
        else if(twoLetter.charAt(0)>='E' && twoLetter.charAt(0)<='H') {
            backgroundGradient.setColor(Color.YELLOW);

        }else if(twoLetter.charAt(0)>='I' && twoLetter.charAt(0)<='L') {
            backgroundGradient.setColor(Color.BLUE);

        }
        else if(twoLetter.charAt(0)>='M' && twoLetter.charAt(0)<='P') {
            backgroundGradient.setColor(Color.GRAY);

        }
        else if(twoLetter.charAt(0)>='Q' && twoLetter.charAt(0)<='T') {
            backgroundGradient.setColor(Color.MAGENTA);

        }
        else if(twoLetter.charAt(0)>='U' && twoLetter.charAt(0)<='X') {
            backgroundGradient.setColor(Color.CYAN);
        }
        else
            backgroundGradient.setColor(Color.GREEN);
    }
}
