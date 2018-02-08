package com.vailancio;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Card extends CardAbstract{

    Card(){
        this.setNumber(CardUtility.getNewNumber());

        //
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        this.setValidFrom(formatter.format(today));

        //
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.YEAR, 6);
        this.setValidTill(formatter.format(c.getTime()));
    }

}



