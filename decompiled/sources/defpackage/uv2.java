package defpackage;

import java.util.ArrayList;

/* renamed from: uv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv2 extends t49 {
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ vv2 g;

    public uv2(ArrayList arrayList, vv2 vv2) {
        this.f = arrayList;
        this.g = vv2;
    }

    public final void o(ri0 ri0) {
        ri0.getClass();
        h95.r(ri0, (vr2) null);
        this.f.add(ri0);
    }

    public final void z(ri0 ri0, ri0 ri02) {
        ri02.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.g.b + ": " + ri0 + " vs " + ri02).toString());
    }
}
