package defpackage;

import java.util.Iterator;

/* renamed from: k07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k07 implements Iterator {
    public final boolean A;
    public int B = 0;
    public int C;
    public final /* synthetic */ uy5 D;
    public int w = 2;
    public String x;
    public final String y;
    public final do0 z;

    public k07(uy5 uy5, za0 za0, String str) {
        this.D = uy5;
        this.z = (do0) za0.d;
        this.A = za0.c;
        this.C = za0.b;
        this.y = str;
    }

    public final boolean hasNext() {
        int i;
        String str;
        String str2;
        do0 do0;
        boolean z2;
        int i2 = this.w;
        if (i2 != 4) {
            int B2 = b81.B(i2);
            if (B2 == 0) {
                return true;
            }
            if (B2 != 2) {
                this.w = 4;
                int i3 = this.B;
                while (true) {
                    i = this.B;
                    if (i == -1) {
                        this.w = 3;
                        str = null;
                        break;
                    }
                    co0 co0 = (co0) this.D.x;
                    str2 = this.y;
                    int length = str2.length();
                    g75.m(i, length);
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (str2.charAt(i) == co0.N0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                        i++;
                    }
                    if (i == -1) {
                        i = str2.length();
                        this.B = -1;
                    } else {
                        this.B = i + 1;
                    }
                    int i4 = this.B;
                    if (i4 == i3) {
                        int i5 = i4 + 1;
                        this.B = i5;
                        if (i5 > str2.length()) {
                            this.B = -1;
                        }
                    } else {
                        do0 = this.z;
                        if (i3 < i) {
                            str2.charAt(i3);
                            do0.getClass();
                        }
                        if (i > i3) {
                            str2.charAt(i - 1);
                            do0.getClass();
                        }
                        if (!this.A || i3 != i) {
                            int i6 = this.C;
                        } else {
                            i3 = this.B;
                        }
                    }
                }
                int i62 = this.C;
                if (i62 == 1) {
                    i = str2.length();
                    this.B = -1;
                    if (i > i3) {
                        str2.charAt(i - 1);
                        do0.getClass();
                    }
                } else {
                    this.C = i62 - 1;
                }
                str = str2.subSequence(i3, i).toString();
                this.x = str;
                if (this.w != 3) {
                    this.w = 1;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.w = 2;
            String str = this.x;
            this.x = null;
            return str;
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
