package defpackage;

import java.util.List;

/* renamed from: uj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uj8 implements eg6 {
    public final Object a;
    public final List b;
    public final cu4 c;
    public final cu4 d;
    public final List e;
    public final fw0 f = new fw0(23545953, new zi8(0, this), true);

    public uj8(Object obj, List list, cu4 cu4, cu4 cu42) {
        obj.getClass();
        this.a = obj;
        this.b = list;
        this.c = cu4;
        this.d = cu42;
        this.e = sg3.E(cu4, cu42);
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.e;
    }

    public final fw0 getContent() {
        return this.f;
    }

    public final Object getKey() {
        return this.a;
    }
}
