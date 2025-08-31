// Create an Interface TVRemote and use it to inherit
//another Interface Smart Tv Remote.

interface TV_Remote{
    void start();
    void change();
    void sound();

}

interface Smart_TV_Remote extends TV_Remote{
    void voice();
    void youtube();
    void netflix();
}

/*
Create a Class Tv which implements TvRemote interface
from Q6
 */







public class Q6 {
    public static void main(String[] args) {

    }
}
