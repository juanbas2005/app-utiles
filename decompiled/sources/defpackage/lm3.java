package defpackage;

import java.util.Iterator;

/* renamed from: lm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm3 implements Iterator, ar3 {
    public boolean A;
    public final pl3 w;
    public final sw5 x;
    public final zr3 y;
    public boolean z = true;

    public lm3(pl3 pl3, sw5 sw5, zr3 zr3) {
        pl3.getClass();
        this.w = pl3;
        this.x = sw5;
        this.y = zr3;
    }

    public final boolean hasNext() {
        int i;
        String str;
        if (this.A) {
            return false;
        }
        sw5 sw5 = this.x;
        if (sw5.z() == 9) {
            this.A = true;
            sw5.j((byte) 9);
            if (sw5.z() == 10) {
                return false;
            }
            if (sw5.z() != 8) {
                sw5.s();
                return false;
            }
            z1.u(sw5, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, (String) null, 6);
            throw null;
        } else if (sw5.z() != 10 || this.A) {
            return true;
        } else {
            String a0 = fd1.a0((byte) 9);
            int i2 = sw5.x;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            yr yrVar = sw5.E;
            if (i2 == yrVar.x || i < 0) {
                str = "EOF";
            } else {
                str = String.valueOf(yrVar.w[i]);
            }
            z1.u(sw5, pb4.m("Expected ", a0, ", but had '", str, "' instead"), i, (String) null, 4);
            throw null;
        }
    }

    public final Object next() {
        boolean z2 = this.z;
        sw5 sw5 = this.x;
        if (z2) {
            this.z = false;
        } else {
            sw5.k(',');
        }
        zr3 zr3 = this.y;
        return new l47(this.w, ef8.OBJ, sw5, zr3.getDescriptor(), (py2) null).g(zr3);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
