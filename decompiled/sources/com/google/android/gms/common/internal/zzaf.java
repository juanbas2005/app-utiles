package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zzaf extends Exception {
    public final m11 w;

    public zzaf(m11 m11) {
        boolean z;
        if (m11.x == 0 || m11.y == null) {
            z = false;
        } else {
            z = true;
        }
        z65.e("ResolvableConnectionException can only be created with a connection result containing a resolution.", z);
        this.w = m11;
    }
}
