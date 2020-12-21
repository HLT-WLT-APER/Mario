package base;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

public class Keys 
{
    private static Set<Integer>keySet = new HashSet<Integer>();
    public boolean have(int keyValue) 
    {
        return keySet.contains(keyValue);
    }
    public static void add(int keyCode) 
    {
        keySet.add(keyCode);
    }
    public static void remove(int keyCode)
    {
        keySet.remove(keyCode);
    }
}