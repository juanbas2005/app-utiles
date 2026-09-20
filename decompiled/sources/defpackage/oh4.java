package defpackage;

import java.util.Map;

/* renamed from: oh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface oh4 extends kg3 {
    mh4 E(int i, int i2, pb pbVar, z0 z0Var, Map map, wd wdVar) {
        if (!((i & -16777216) == 0 && (-16777216 & i2) == 0)) {
            yb3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new nh4(i, i2, map, pbVar, z0Var, this, wdVar);
    }

    mh4 d0(int i, int i2, Map map, vr2 vr2) {
        return u(i, i2, map, (vr2) null, vr2);
    }

    mh4 u(int i, int i2, Map map, vr2 vr2, vr2 vr22);
}
