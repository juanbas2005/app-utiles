package com.google.firebase.remoteconfig;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int w;

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.w = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.w = i;
    }

    public FirebaseRemoteConfigServerException(int i, int i2, String str) {
        super(str);
        this.w = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.w = i;
    }
}
