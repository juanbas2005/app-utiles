package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* renamed from: w52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w52 extends h2 implements u52, RandomAccess, Serializable {
    public final Enum[] w;

    public w52(Enum[] enumArr) {
        enumArr.getClass();
        this.w = enumArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum enumR = (Enum) obj;
        if (((Enum) qs.b1(enumR.ordinal(), this.w)) == enumR) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.w.length;
    }

    public final Object get(int i) {
        Enum[] enumArr = this.w;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        h.l(b81.l(i, length, "index: ", ", size: "));
        return null;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        int ordinal = enumR.ordinal();
        if (((Enum) qs.b1(ordinal, this.w)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        int ordinal = enumR.ordinal();
        if (((Enum) qs.b1(ordinal, this.w)) == enumR) {
            return ordinal;
        }
        return -1;
    }
}
