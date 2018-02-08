package com.vailancio;

public class CardFactory {
    public static Card getCard(String type){
        Card card = null;

        switch (type){
            case "Platinum":
                card =  new PlatinumCreditCard();
                break;
            case "Elite":
                card =  new EliteCreditCard();
                break;
            default:
                throw new Error("Invalid card type.");
        }

        return card;
    }
}

