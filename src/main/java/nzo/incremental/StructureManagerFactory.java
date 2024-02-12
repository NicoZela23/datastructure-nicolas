package nzo.incremental;

import nzo.incremental.graphs.GraphManager;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.linkedlists.CircularLinkedListManager;
import nzo.incremental.linkedlists.DoubleLinkedListManager;
import nzo.incremental.linkedlists.LinkedListManager;
import nzo.incremental.queues.ArrayQueueManager;
import nzo.incremental.queues.DoubleEndedQueueManager;
import nzo.incremental.queues.LinkedListQueueManager;
import nzo.incremental.sorting.BubbleSortManager;
import nzo.incremental.sorting.MergeManager;
import nzo.incremental.stacks.ArrayStackManager;
import nzo.incremental.stacks.LinkedListStackManager;
import nzo.incremental.trees.BinaryTreeManager;

public class StructureManagerFactory {
    public static IStructureManager getManager(String structureID){
        if (structureID.equals("A")){
            return new LinkedListManager();
        }
        if (structureID.equals("B")){
            return new DoubleLinkedListManager();
        }
        if (structureID.equals("C")){
            return new CircularLinkedListManager();
        }
        if (structureID.equals("D")){
            return new ArrayStackManager();
        }
        if (structureID.equals("E")){
            return new LinkedListStackManager();
        }
        if (structureID.equals("F")){
            return new ArrayQueueManager();
        }
        if (structureID.equals("G")){
            return new LinkedListQueueManager();
        }
        if (structureID.equals("H")){
            return new DoubleEndedQueueManager();
        }
        if (structureID.equals("I")){
            return new BinaryTreeManager();
        }
        if (structureID.equals("J")){
            return new GraphManager();
        }
        if (structureID.equals("K")){
            return new MergeManager();
        }
        if (structureID.equals("L")){
            return new BubbleSortManager();
        }
        return new NullManager();
    }
}
