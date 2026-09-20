package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zzacy extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public zzacy(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder q = hl6.q(j, "Pos: ", ", limit: ");
        q.append(j2);
        q.append(", len: ");
        q.append(i);
    }

    public zzacy(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
