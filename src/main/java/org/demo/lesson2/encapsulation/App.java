package org.demo.lesson2.encapsulation;

import org.demo.lesson2.encapsulation.colleagues.HumanBeingChild;
import org.demo.lesson2.encapsulation.colleagues.HumanBeingColleague;
import org.demo.lesson2.encapsulation.friends_and_family.HumanBeing;
import org.demo.lesson2.encapsulation.friends_and_family.HumanBeingFriend;

/*
 Shortly to say, encapsulation is all about wrapping variables and methods in one single unit
 with the sole purpose of data hiding from external classes.
 */
public class App {

    public static void main(String[] args) {
        HumanBeing harry = new HumanBeing();

        harry.tellPublicInformation();

        HumanBeingChild harryJR = new HumanBeingChild();

        harryJR.getOldFamilySecretKnowledge();

        HumanBeingFriend susy = new HumanBeingFriend();

        //Uncomment generates error because private
        //susy.getFriendCircleSecretKnowledge();

        HumanBeingColleague mara = new HumanBeingColleague();

        //Uncomment generates error because private
        //mara.getFriendCircleSecretKnowledge();

    }
}
