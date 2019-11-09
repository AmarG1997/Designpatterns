package com.blabz.singletone;

import java.io.Serializable;

public class SerializedSingletone implements Serializable 
{
	private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingletone()
    {
    	System.out.println("Serialized Singletone0");
    }
    
    private static class SingletonHelper{
        private static final SerializedSingletone instance = new SerializedSingletone();
    }
    
    public static SerializedSingletone getInstance(){
        return SingletonHelper.instance;
    }
}
