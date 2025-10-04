class DownloadTask extends Thread {

    private String fileName;

    DownloadTask(String fileName) {

        this.fileName = fileName;
    }

    public void run() {

        System.out.println("Starting download: "+fileName);

        try {

            for(int i = 1; i<=10; i++) {

                Thread.sleep(500);

                System.out.println(fileName + "downloading... " + (i* 10) + "%");
            }

            System.out.println("Download complete: "+fileName);
        }

        catch(InterruptedException e) {

            System.out.println("Download interrupted: "+fileName);
        }
    }
}


public class DownloadManager {


    public static void main(String[] args) {

        DownloadTask d1 = new DownloadTask("File1.mp4");

        DownloadTask d2 = new DownloadTask("File2.pdf");

        DownloadTask d3 = new DownloadTask("File3.zip");

        d1.start();
        d2.start();
        d3.start();

        System.out.println("all downloads started!");


    }
}