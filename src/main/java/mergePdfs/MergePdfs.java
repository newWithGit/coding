package mergePdfs;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.*;

public class MergePdfs {

    public static void main(String[] args) {
        mergePdfs();
    }

    private static void mergePdfs() {

        try (InputStream page1 = new FileInputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\New Doc 2019-06-26 23.28.02_1.pdf"));
             InputStream page2 = new FileInputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\New Doc 2019-06-26 23.30.10_1.pdf"));
             InputStream page3 = new FileInputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\New Doc 2019-06-26 23.31.18_1.pdf"));
             InputStream page4 = new FileInputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\New Doc 2019-06-26 23.32.47_1.pdf"));
             //InputStream page5 = new FileInputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\Page5.pdf"));
             OutputStream mergedPdf = new FileOutputStream(new File("C:\\Users\\sauravk\\Documents\\Personal\\RentAgreement\\RentAgreement.pdf"))){

            PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();
            pdfMergerUtility.addSource(page1);
            pdfMergerUtility.addSource(page2);
            pdfMergerUtility.addSource(page3);
            pdfMergerUtility.addSource(page4);
            //pdfMergerUtility.addSource(page5);

            pdfMergerUtility.setDestinationStream(mergedPdf);
            pdfMergerUtility.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
