package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.linkedlists.DoubleLinkedListManager;
import nzo.incremental.linkedlists.LinkedListManager;

public class StructureManagerFactory {
    public static IStructureManager getManager(String structureID){
        if (structureID.equals("A")){
            return new LinkedListManager();
        }
        if (structureID.equals("B")){
            return new DoubleLinkedListManager();
        }
        return new NullManager();
    }
}
