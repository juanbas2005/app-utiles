package defpackage;

import com.google.zxing.FormatException;

/* renamed from: lk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lk1 extends xl0 {
    public final int b;
    public final int c;

    public lk1(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.a();
        }
        this.b = i2;
        this.c = i3;
    }
}
