package com.ex05;

public class Captain {
    //EARLY
    private static final Captain CAPTAIN_INSTANCE = new Captain();
    //LAZY
    private static Captain captain;

    public static synchronized Captain getCaptainLazy() {
        // Lazy initialization
        if (captain == null)
            captain = new Captain();
        return captain;
    }

    // Early initialization
    public static Captain getCaptain(){
        return CAPTAIN_INSTANCE;
    }


}
