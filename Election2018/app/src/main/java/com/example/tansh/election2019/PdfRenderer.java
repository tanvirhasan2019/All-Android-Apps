package com.example.tansh.election2019;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PdfRenderer {
    File file = new File(filePath);
    // FileDescriptor for file, it allows you to close file when you are
// done with it
    ParcelFileDescriptor mFileDescriptor = null;
try {
        mFileDescriptor = ParcelFileDescriptor.open(file,
                ParcelFileDescriptor.MODE_READ_ONLY);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    // PdfRenderer enables rendering a PDF document
    PdfRenderer mPdfRenderer = null;
try {
        mPdfRenderer = new PdfRenderer(mFileDescriptor);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Open page with specified index
    PdfRenderer.Page mCurrentPage = mPdfRenderer.openPage(index);
    Bitmap bitmap = Bitmap.createBitmap(mCurrentPage.getWidth(),
            mCurrentPage.getHeight(), Bitmap.Config.ARGB_8888);

// Pdf page is rendered on Bitmap
mCurrentPage.render(bitmap, null, null,
    PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
// Set rendered bitmap to ImageView (pdfView in my case)
pdfView.setImageBitmap(bitmap);

mCurrentPage.close();
mPdfRenderer.close();
try {
        mFileDescriptor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
