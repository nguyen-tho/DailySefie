package com.example.dailyselfie;

import android.app.Activity;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class TakePhoto extends Activity {
    String currentPhotoPath;

    private File createImagefile() throws IOException {
        SimpleDateFormat timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss");
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storage_dir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(imageFileName, ".jpg", storage_dir);
        currentPhotoPath =image.getAbsolutePath();
        return image;
    }
}
