package defpackage;

import java.util.Iterator;

/* renamed from: ot8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ot8 extends os8 {
    public final transient Object B;

    public ot8(Object obj) {
        super(1);
        this.B = obj;
    }

    public final boolean contains(Object obj) {
        return this.B.equals(obj);
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new ps8(this.B);
    }

    public final int o(Object[] objArr) {
        objArr[0] = this.B;
        return 1;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.B.toString();
        return f21.m(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
    }

    public final at7 v() {
        return new ps8(this.B);
    }
}
