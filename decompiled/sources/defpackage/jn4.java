package defpackage;

import java.util.List;

/* renamed from: jn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jn4 implements lh4 {
    public final in4 a;

    public jn4(in4 in4) {
        this.a = in4;
    }

    public final int a(kg3 kg3, List list, int i) {
        return this.a.a(kg3, ed1.q(kg3), i);
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        return this.a.b(oh4, ed1.q(oh4), j);
    }

    public final int c(kg3 kg3, List list, int i) {
        return this.a.c(kg3, ed1.q(kg3), i);
    }

    public final int d(kg3 kg3, List list, int i) {
        return this.a.d(kg3, ed1.q(kg3), i);
    }

    public final int e(kg3 kg3, List list, int i) {
        return this.a.e(kg3, ed1.q(kg3), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jn4) && sg3.e(this.a, ((jn4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
