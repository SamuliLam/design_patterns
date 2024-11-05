package visitor;

public class Main {
    public static void main(String[] args) {

        // Creating a root directory and two directories inside it
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory music = new Directory("Music");
        root.addChild(documents);
        root.addChild(music);

        // Creating files
        File file1 = new File("file1.txt", 5);
        File file2 = new File("file2.txt", 10);
        File musicFile1 = new File("musicFile1.mp3", 30);
        File musicFile2 = new File("musicFile2.mp3", 40);

        // Adding files to directories
        documents.addChild(file1);
        documents.addChild(file2);
        music.addChild(musicFile1);
        music.addChild(musicFile2);

        // Searching for files, change to between txt and mp3 to test for different files
        SearchVisitor searchVisitor = new SearchVisitor("txt");
        root.accept(searchVisitor);
        System.out.println("Search results: " + searchVisitor.getSearchResults());




        // Testing size of root directory
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size of Root directory " + sizeVisitor.getTotalSize());

    }

}
