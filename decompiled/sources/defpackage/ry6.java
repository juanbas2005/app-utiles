package defpackage;

import android.graphics.Rect;

/* renamed from: ry6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ry6 {
    public final m90 a;
    public final int b;
    public final int c;
    public Rect d;
    public boolean e;

    public ry6(byte[] bArr, int i, int i2, int i3, int i4) {
        this.a = new m90(bArr, i, i2);
        this.c = i4;
        this.b = i3;
        if (i * i2 > bArr.length) {
            StringBuilder p = pb4.p("Image data does not match the resolution. ", i, "x", i2, " > ");
            p.append(bArr.length);
            throw new IllegalArgumentException(p.toString());
        }
    }
}
