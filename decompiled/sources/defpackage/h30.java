package defpackage;

/* renamed from: h30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h30 {
    public final rv4 a;
    public final v45 b;

    /* JADX WARNING: type inference failed for: r2v0, types: [v45] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public h30(rv4 rv4, v45 r2) {
        this.a = rv4;
        this.b = r2;
        if ((rv4 == null ? r2 : rv4) == null) {
            h.q("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
            throw null;
        }
    }

    public final void a(f1 f1Var) {
        rv4 rv4 = this.a;
        if (rv4 != null) {
            rv4.a(rv4, (f30) f1Var.b);
            return;
        }
        v45 v45 = this.b;
        if (v45 != null) {
            g30 g30 = (g30) f1Var.a;
            g30.getClass();
            q45 q45 = new q45(g30, new r45(g30, (t54) null));
            g30.a.add(q45);
            rv4.a(v45.b().c, q45);
            return;
        }
        h.s("Unreachable");
    }

    public final void b(f1 f1Var) {
        if (this.a != null) {
            ((f30) f1Var.b).h();
        } else if (this.b != null) {
            ((g30) f1Var.a).d();
        } else {
            h.s("Unreachable");
        }
    }
}
