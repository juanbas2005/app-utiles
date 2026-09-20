package com.google.android.gms.common.api;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final cc2 w;

    public UnsupportedApiCallException(cc2 cc2) {
        this.w = cc2;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.w));
    }
}
