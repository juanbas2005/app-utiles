package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: s3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s3 extends sg3 {
    public static final s3 w = new s3(0);
    public static final s3 x = new s3(1);
    public final /* synthetic */ int v;

    public /* synthetic */ s3(int i) {
        this.v = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: du7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: gg3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: du7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: gg3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: gg3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: du7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: gg3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: du7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: du7} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public static fu6 f0(fu6 fu6) {
        xp7 xp7;
        du7 du7;
        vw3 b;
        wo7 L = fu6.L();
        du7 du72 = null;
        if (L instanceof kl0) {
            kl0 kl0 = (kl0) L;
            xp7 xp72 = kl0.w;
            if (xp72.a() == k28.z) {
                xp7 = xp72;
            } else {
                xp7 = null;
            }
            if (xp7 == null || (b = xp7.b()) == null) {
                du7 = null;
            } else {
                du7 = b.n0();
            }
            if (kl0.x == null) {
                Iterable<vw3> e = kl0.e();
                ArrayList arrayList = new ArrayList(et0.e0(e, 10));
                for (vw3 n0 : e) {
                    arrayList.add(n0.n0());
                }
                kl0.x = new cz4(xp72, new bt1(1, arrayList), (qp7) null, 8);
            }
            cz4 cz4 = kl0.x;
            cz4.getClass();
            return new bz4(cl0.w, cz4, du7, fu6.J(), fu6.Q(), 32);
        } else if (!(L instanceof gg3) || !fu6.Q()) {
            return fu6;
        } else {
            gg3 gg3 = (gg3) L;
            LinkedHashSet<vw3> linkedHashSet = gg3.x;
            ArrayList arrayList2 = new ArrayList(et0.e0(linkedHashSet, 10));
            boolean z = false;
            for (vw3 z2 : linkedHashSet) {
                arrayList2.add(jb5.z(z2));
                z = true;
            }
            if (z) {
                vw3 vw3 = gg3.w;
                if (vw3 != null) {
                    du72 = jb5.z(vw3);
                }
                arrayList2.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                linkedHashSet2.hashCode();
                gg3 gg32 = new gg3(linkedHashSet2);
                gg32.w = du72;
                du72 = gg32;
            }
            if (du72 != null) {
                gg3 = du72;
            }
            return gg3.a();
        }
    }

    public final zw3 Q(zw3 zw3) {
        switch (this.v) {
            case b85.b:
                zw3.getClass();
                return zw3;
            default:
                return e0(zw3);
        }
    }

    public du7 e0(zw3 zw3) {
        du7 du7;
        zw3.getClass();
        du7 du72 = null;
        if (zw3 instanceof vw3) {
            du7 n0 = ((vw3) zw3).n0();
            if (n0 instanceof fu6) {
                du7 = f0((fu6) n0);
            } else if (n0 instanceof zg2) {
                zg2 zg2 = (zg2) n0;
                fu6 fu6 = zg2.y;
                fu6 fu62 = zg2.x;
                fu6 f0 = f0(fu62);
                fu6 f02 = f0(fu6);
                if (f0 == fu62 && f02 == fu6) {
                    du7 = n0;
                } else {
                    du7 = kl8.n(f0, f02);
                }
            } else {
                h.c();
                return null;
            }
            vw3 k = ub5.k(n0);
            if (k != null) {
                du72 = e0(k);
            }
            return ub5.t(du7, du72);
        }
        h.q("Failed requirement.");
        return null;
    }
}
