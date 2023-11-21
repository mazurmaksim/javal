package threads.tasks.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    public static List<Path> files = FileListCollection.readFolderFiles("C:\\Users\\MaksymMazur\\OneDrive - conscensia.com\\Documents\\78");
    private static final Object lock = new Object();

    public int arrCount = 0;

    public void readFile() {
        synchronized (lock) {
            Path path = files.get(arrCount);
                String content = null;
                try {
                    content = getReduce(path);
                } catch (IOException  e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " Amount of words in file [" + path.getFileName() + "] is " + content.split(" ").length);
                removeFileFromList(path);
                lock.notify();

        }
    }

    private String getReduce(Path path) throws IOException {
        String result = "";
        synchronized (lock) {
            if (path != null) {
                result = Files.readString(path);
                lock.notify();
            }
        }
        return result;
    }

    public void removeFileFromList(Path pathGlobal) {
        synchronized (lock) {
                files.remove(pathGlobal);
                System.out.println(Thread.currentThread().getName() + " file read finished " +  pathGlobal.getFileName());
                lock.notifyAll();
        }
    }
}
