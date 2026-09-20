package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class yc3 extends im5 {
    public final boolean i = true;

    public yc3(String str, ku4 ku4) {
        super(str, ku4);
        e(i53.c);
    }

    public List a() {
        return g(false);
    }

    public final ArrayList g(boolean z) {
        n74 m = sg3.m();
        if (z) {
            m.add("resolution=" + "merge" + "-duplicates");
        }
        if (!this.i) {
            m.add("missing=default");
        }
        return dt0.M0(sg3.i(m), f());
    }
}
