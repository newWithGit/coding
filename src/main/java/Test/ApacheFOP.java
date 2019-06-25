package Test;

import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class ApacheFOP {

    public static void main(String[] args) {
        convertXmlToPdf();
    }

    private static void convertXmlToPdf() {
        File xslt = new File("C:\\Users\\sauravk\\Documents\\AIC\\Prod Support\\2019\\Apache_FOP\\Security_XML_FO.xsl");
        StreamSource xml = new StreamSource(new File("C:\\Users\\sauravk\\Documents\\AIC\\Prod Support\\2019\\Apache_FOP\\editedXmlWith1Sign.xml"));
        try (OutputStream pdf = new FileOutputStream("C:\\Users\\sauravk\\Documents\\AIC\\Prod Support\\2019\\Apache_FOP\\pdfWith1Signatures.pdf")) {

            FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
            //FOUserAgent userAgent = fopFactory.newFOUserAgent();
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, pdf);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(xslt));

            Result res = new SAXResult(fop.getDefaultHandler());

            // Start XSLT transformation and FOP processing
            // That's where the XML is first transformed to XSL-FO and then
            // PDF is created
            transformer.transform(xml, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
