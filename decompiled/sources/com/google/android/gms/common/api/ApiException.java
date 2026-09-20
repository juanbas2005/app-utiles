package com.google.android.gms.common.api;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ApiException extends Exception {
    public final Status w;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ApiException(Status status) {
        super(r4.toString());
        int i = status.w;
        String str = status.x;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.w = status;
    }
}
