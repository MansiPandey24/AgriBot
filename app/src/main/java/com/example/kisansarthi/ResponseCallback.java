package com.example.kisansarthi;

public interface ResponseCallback {
    void onResponse(String response);

    void onError(Throwable throwable);
}
