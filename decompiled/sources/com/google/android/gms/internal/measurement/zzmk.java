package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zzmk extends RuntimeException {
    public final int w;

    /* JADX WARNING: Illegal instructions before constructor call */
    public zzmk(int i, String str, ApiException apiException) {
        super(r5, apiException);
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = String.valueOf(i);
        }
        this.w = i;
    }
}
