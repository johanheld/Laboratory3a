package com.example.johan.laboratory3a;

import android.graphics.Color;

/**
 * Created by johan on 2017-10-02.
 */

public class Controller
{
    private ColorFragment fragment;

    public Controller(ColorFragment fragment)
    {
        this.fragment = fragment;
    }

    public void listItemClicked(int item)
    {
        switch (item)
        {
            case 0:
                fragment.setButtonText("RED");
                break;

            case 1:
                fragment.setButtonText("BLUE");
                break;

            case 2:
                fragment.setButtonText("YELLOW");
                break;

            case 3:
                fragment.setButtonText("GREEN");
                break;
        }
    }



    public void btnColorClicked(String color)
    {
        switch(color)
        {
            case "RED":
                fragment.setTextViewColor(Color.RED);
                break;

            case "BLUE":
                fragment.setTextViewColor(Color.BLUE);
                break;

            case "YELLOW":
                fragment.setTextViewColor(Color.YELLOW);
                break;

            case "GREEN":
                fragment.setTextViewColor(Color.GREEN);
                break;
        }
    }


}
