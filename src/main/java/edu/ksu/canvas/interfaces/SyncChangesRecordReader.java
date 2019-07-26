package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.ChangeRecord;

import java.util.List;

public interface SyncChangesRecordReader extends CanvasReader<ChangeRecord,SyncChangesRecordReader> {

   // List<ChangeRecord> getUnsyncedChanges(SyncChangesOptions)
}
