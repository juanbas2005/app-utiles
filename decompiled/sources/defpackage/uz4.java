package defpackage;

/* renamed from: uz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uz4 implements vz4 {
    public final boolean b(ll4 ll4) {
        eq4 eq4 = null;
        while (true) {
            int i = 0;
            if (ll4 == null) {
                return false;
            }
            if (ll4 instanceof tk5) {
                if (((tk5) ll4).N()) {
                    return true;
                }
            } else if ((ll4.y & 16) != 0 && (ll4 instanceof wo1)) {
                for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                    if ((ll42.y & 16) != 0) {
                        i++;
                        if (i == 1) {
                            ll4 = ll42;
                        } else {
                            if (eq4 == null) {
                                eq4 = new eq4(new ll4[16]);
                            }
                            if (ll4 != null) {
                                eq4.b(ll4);
                                ll4 = null;
                            }
                            eq4.b(ll42);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            ll4 = rc9.j(eq4);
        }
    }

    public final int c() {
        return 16;
    }

    public final void e(uy3 uy3, long j, f03 f03, int i, boolean z) {
        uy3.A(j, f03, i, z);
    }

    public final boolean f(f03 f03, uy3 uy3) {
        xz4 xz4 = (xz4) uy3.a0.e;
        xz4.getClass();
        ll4 e1 = xz4.e1(yz4.g(16));
        if (e1 != null && e1.J) {
            if (!e1.w.J) {
                yb3.b("visitLocalDescendants called on an unattached node");
            }
            ll4 ll4 = e1.w;
            if ((ll4.z & 16) != 0) {
                while (ll4 != null) {
                    if ((ll4.y & 16) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (ll42 != null) {
                            if (ll42 instanceof tk5) {
                                if (((tk5) ll42).x0()) {
                                    f03.y = f03.w.b - 1;
                                    return true;
                                }
                            } else if ((ll42.y & 16) != 0 && (ll42 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq4.b(ll42);
                                                ll42 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll42 = rc9.j(eq4);
                        }
                        continue;
                    }
                    ll4 = ll4.B;
                }
            }
        }
        return false;
    }

    public final boolean g(uy3 uy3) {
        return true;
    }
}
