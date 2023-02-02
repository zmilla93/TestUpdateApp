package org.example.zupdate;

public interface IUpdateProgressListener {

    // Called with a number 0-100
    void onDownloadProgress(int progressPercent);

}
