package org.demo.lesson2.encapsulation.friends_and_family;

public class HumanBeing {

    //Personal data. Visible only for class itself
    private void tellBigPersonalSecret() {
        System.out.println("I smoke weed each Tuesday after 6pm");
    }

    //Default data. Visible only inside a package
    void tellFriendCircleSecret() {
        System.out.println("Our friend Barry sells weed each Monday after 10pm");
    }

    //Protected data. Visible only inside a package and for child classes
    protected void tellOldFamilySecret() {
        System.out.println("Grandpa Jerry smokes weed each Tuesday after 8pm");
    }

    //Public data. Visible everywhere
    public void tellPublicInformation() {
        System.out.println("Nobody likes Mondays!");
    }


}
