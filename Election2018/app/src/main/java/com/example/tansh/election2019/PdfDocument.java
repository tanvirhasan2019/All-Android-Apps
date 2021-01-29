package com.example.tansh.election2019;

import android.app.assist.AssistStructure;

public class PdfDocument {
    // crate a page info with attributes as below
// page number, height and width
// i have used height and width to that of pdf content view
    int pageNumber = 1;
    private AssistStructure.ViewNode content;
    android.graphics.pdf.PdfDocument.PageInfo pageInfo = new android.graphics.pdf.PdfDocument.PageInfo.Builder(content.getWidth(),
            content.getHeight() - 20, pageNumber).create();

    // create a new page from the PageInfo
    android.graphics.pdf.PdfDocument.Page page = document.startPage(pageInfo);

// repaint the user's text into the page
content.draw(page.getCanvas());

// do final processing of the page
document.finishPage(page);

    // saving pdf document to sdcard
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
    String pdfName = "pdfdemo"
            + sdf.format(Calendar.getInstance().getTime()) + ".pdf";

    // all created files will be saved at path /sdcard/PDFDemo_AndroidSRC/
    File outputFile = new File("/sdcard/PDFDemo_AndroidSRC/", pdfName);

try {
        outputFile.createNewFile();
        OutputStream out = new FileOutputStream(outputFile);
        document.writeTo(out);
        document.close();
        out.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
