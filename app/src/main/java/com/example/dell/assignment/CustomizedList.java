package com.example.dell.assignment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 3/21/2017.
 */

public class CustomizedList extends ArrayAdapter<Person> {



    public CustomizedList(Context context, ArrayList<Person> resource) {

        super(context, R.layout.custom_row,resource);
    }


    private  void twoLetter(){

    }

    String singleName,twoCharacter;
    TextView twoLetter;
    TextView listName,contactNumber;
    GradientDrawable backgroundGradient;
    //Sets XML Custom_row in View
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater changeListView=LayoutInflater.from(getContext());
        View customView=changeListView.inflate(R.layout.custom_row,parent,false);

        twoLetter=(TextView)customView.findViewById(R.id.resulttext);
        listName=(TextView)customView.findViewById(R.id.textView);
        contactNumber=(TextView)customView.findViewById(R.id.contactNumberView);
        TextView listImage=(TextView) customView.findViewById(R.id.resultImage);


        singleName=getItem(position).getName();
        contactNumber.setText(""+getItem(position).getContactNo());
        twoCharacter=singleName;
        listName.setText(twoCharacter);


        twoLetter.setText(splitName());
        // listImage.setImageResource(R.drawable.circle);

        backgroundGradient = (GradientDrawable)listImage.getBackground();


        setColor();
        return  customView;
    }
    private  void setColor(){
        if(twoCharacter.charAt(0)>='A' && twoCharacter.charAt(0)<='D') {
            backgroundGradient.setColor(Color.RED);

        }
        else if(twoCharacter.charAt(0)>='E' && twoCharacter.charAt(0)<='H') {
            backgroundGradient.setColor(Color.YELLOW);

        }else if(twoCharacter.charAt(0)>='I' && twoCharacter.charAt(0)<='L') {
            backgroundGradient.setColor(Color.BLUE);

        }
        else if(twoCharacter.charAt(0)>='M' && twoCharacter.charAt(0)<='P') {
            backgroundGradient.setColor(Color.GRAY);

        }
        else if(twoCharacter.charAt(0)>='Q' && twoCharacter.charAt(0)<='T') {
            backgroundGradient.setColor(Color.MAGENTA);

        }
        else if(twoCharacter.charAt(0)>='U' && twoCharacter.charAt(0)<='X') {
            backgroundGradient.setColor(Color.CYAN);
        }
        else
            backgroundGradient.setColor(Color.GREEN);
    }

    private  String splitName(){
        String[] words=singleName.split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){
            twchar+=w.charAt(0);
        }
        return  twchar;
    }
}
