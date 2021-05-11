/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Strategy_Patterns;

/**
 *
 * @author Lasitha
 */
interface SavingFiles {

    public abstract void Save();
}

class SavingJPG implements SavingFiles {

    @Override
    public void Save() {
        System.out.println("Saving JPG Files");
    }
}

class SavingPDF implements SavingFiles {

    @Override
    public void Save() {
        System.out.println("Saving PDF Files");
    }
}

class context {

    SavingFiles savingFiles;

    public void setSavingFiles(SavingFiles savingFiles) {
        this.savingFiles = savingFiles;
    }

    public void start() {
        savingFiles.Save();
    }

}

class Text {

    public static void main(String[] args) {
        context JPG = new context();
        JPG.setSavingFiles(new SavingJPG());
        JPG.start();

        context PDF = new context();
        PDF.setSavingFiles(new SavingJPG());
        PDF.start();
    }

}
