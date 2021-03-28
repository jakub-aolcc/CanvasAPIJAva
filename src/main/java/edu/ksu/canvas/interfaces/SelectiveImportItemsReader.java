package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.SelectiveImport;
import edu.ksu.canvas.model.SubItems;
import edu.ksu.canvas.requestOptions.SelectiveImportItemsOptions;
import edu.ksu.canvas.requestOptions.SubItemsOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface SelectiveImportItemsReader extends CanvasReader<SelectiveImport,SelectiveImportItemsReader> {

    List<SelectiveImport> getSelectiveImportItems(SelectiveImportItemsOptions options) throws IOException;
    List<SelectiveImport> getSubItems(SubItemsOptions options) throws IOException;

}
