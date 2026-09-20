package defpackage;

import java.util.List;

/* renamed from: ir1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ir1 extends t16 {
    public static final /* synthetic */ yr3[] A;
    public final vq1 w;
    public final int x;
    public final qr3 y;
    public final y16 z;

    static {
        Class<ir1> cls = ir1.class;
        A = new yr3[]{new gr5(cls, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new gr5(cls, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    }

    public ir1(vq1 vq1, int i, qr3 qr3, sr2 sr2) {
        this.w = vq1;
        this.x = i;
        this.y = qr3;
        this.z = p25.u((ri0) null, sr2);
        p25.u((ri0) null, new gr1(this, 0));
    }

    public final boolean C() {
        h28 h28;
        pc5 F = F();
        if (F instanceof h28) {
            h28 = (h28) F;
        } else {
            h28 = null;
        }
        if (h28 != null) {
            return ts1.a(h28);
        }
        return false;
    }

    public final boolean D() {
        pc5 F = F();
        if (!(F instanceof h28) || ((h28) F).F == null) {
            return false;
        }
        return true;
    }

    public final pc5 F() {
        yr3 yr3 = A[0];
        Object b = this.z.b();
        b.getClass();
        return (pc5) b;
    }

    public final p16 b() {
        return this.w;
    }

    public final boolean g() {
        h28 h28;
        pc5 F = F();
        if (F instanceof h28) {
            h28 = (h28) F;
        } else {
            h28 = null;
        }
        if (h28 == null || !h28.g1()) {
            return false;
        }
        return true;
    }

    public final List getAnnotations() {
        throw null;
    }

    public final String getName() {
        h28 h28;
        pc5 F = F();
        if (F instanceof h28) {
            h28 = (h28) F;
        } else {
            h28 = null;
        }
        if (h28 != null && !h28.r().E()) {
            uq4 name = h28.getName();
            name.getClass();
            if (!name.x) {
                return name.b();
            }
        }
        return null;
    }

    public final int s() {
        return this.x;
    }

    public final qr3 u() {
        return this.y;
    }

    public final as3 y() {
        vw3 b = F().b();
        b.getClass();
        ds1 ds1 = new ds1(b, new gr1(this, 1), false);
        if (hr1.a[this.y.ordinal()] == 1) {
            return ds1;
        }
        vq1 vq1 = this.w;
        as3 as3 = vq1.w.b(vq1.getName(), vq1.getTypeParameters()).b(ds1, ks3.w).b;
        if (as3 != null) {
            return as3;
        }
        mb2.f(vq1.getName());
        throw null;
    }
}
