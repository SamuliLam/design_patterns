package visitor;

public class Main {
    public static void main(String[] args) {

        // Creating two directories
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

        // Searching for files, change to mp3 to test for music files
        SearchVisitor textFileSearchVisitor = new SearchVisitor(".txt");
        documents.accept(textFileSearchVisitor);
        System.out.println("Text files found: " + textFileSearchVisitor.getSearchResults());

        // Testing size of files for root directory, which should be 85
        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        root.accept(sizeCalculatorVisitor);
        System.out.println("Total size of files: " + sizeCalculatorVisitor.getTotalSize());

        // Testing size of files for music directory, which should be 70
        SizeCalculatorVisitor sizeCalculatorVisitor2 = new SizeCalculatorVisitor();
        music.accept(sizeCalculatorVisitor2);
        System.out.println("Total size of files in music directory: " + sizeCalculatorVisitor2.getTotalSize());
    }

}
