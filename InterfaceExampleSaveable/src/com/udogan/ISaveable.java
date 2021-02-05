package com.udogan;

import java.util.List;

public interface ISaveable {
    public List<String> write();
    void read(List<String> savedvalues);
}
