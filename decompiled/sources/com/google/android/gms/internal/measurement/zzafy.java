package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zzafy extends RuntimeException {
    public zzafy() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzaeh, java.io.IOException] */
    public final zzaeh a() {
        return new IOException(getMessage());
    }
}
