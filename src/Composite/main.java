package Composite;

public class main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        /* With void add()
        File f1 = new File("file1");
        File f2 = new File("file2");
        File f3 = new File("file3");
        Folder Fold1 = new Folder("folder 1");
        root.add(f2);
        root.add(f3);
        root.add(Fold1);
        Fold1.add(f1);
        */

        // With Composant add()
        File f2 = (File) root.add(new File("file2"));
        File f3 = (File) root.add(new File("file3"));
        Folder Fold1 = (Folder) root.add(new Folder("folder 1"));
        File f1 = (File) Fold1.add(new File("file1"));

        root.show();
    }
}
