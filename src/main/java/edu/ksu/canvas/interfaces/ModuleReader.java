package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.module.Module;

import java.io.IOException;
import java.util.List;

public interface ModuleReader extends CanvasReader<Module,ModuleReader>{


    public List<Module> getModules(String courseId) throws IOException;

}
