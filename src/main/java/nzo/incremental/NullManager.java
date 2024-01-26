package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;

public class NullManager implements IStructureManager {
    @Override
    public void run() {
        System.out.println("Wrong input or manager not implemented yet");
    }
}
