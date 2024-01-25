package org.example;

public class StructureManagerFactory {
    public static IStructureManager getManager(int index){
        if (index == 1){
            return new LinkedListManager();
        }
        return new NullManager();
    }
}
