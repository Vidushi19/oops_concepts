/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Vidushi
 */
public class DiseaseDirectory {
    private ArrayList<Disease> directory;

    public DiseaseDirectory(ArrayList<Disease> directory) {
        this.directory = directory;
    }

    public ArrayList<Disease> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Disease> directory) {
        this.directory = directory;
    }
}
