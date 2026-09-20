package defpackage;

/* renamed from: ok2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ok2 {
    public static final ok2 b = new ok2();
    public static final ok2 c = new ok2();
    public static final ok2 d = new ok2();
    public final eq4 a = new eq4(new qk2[16]);

    public static boolean a(ok2 ok2) {
        ok2.getClass();
        if (ok2 == b) {
            h.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        } else if (ok2 != c) {
            eq4 eq4 = ok2.a;
            int i = eq4.y;
            if (i == 0) {
                System.out.println("FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                return false;
            }
            Object[] objArr = eq4.w;
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                qk2 qk2 = (qk2) objArr[i2];
                if (!((ll4) qk2).w.J) {
                    yb3.b("visitChildren called on an unattached node");
                }
                eq4 eq42 = new eq4(new ll4[16]);
                ll4 ll4 = ((ll4) qk2).w;
                ll4 ll42 = ll4.B;
                if (ll42 == null) {
                    rc9.h(eq42, ll4);
                } else {
                    eq42.b(ll42);
                }
                while (true) {
                    int i3 = eq42.y;
                    if (i3 == 0) {
                        break;
                    }
                    ll4 ll43 = (ll4) eq42.l(i3 - 1);
                    if ((ll43.z & 1024) == 0) {
                        rc9.h(eq42, ll43);
                    } else {
                        while (true) {
                            if (ll43 == null) {
                                continue;
                                break;
                            } else if ((ll43.y & 1024) != 0) {
                                eq4 eq43 = null;
                                while (ll43 != null) {
                                    if (ll43 instanceof vk2) {
                                        if (((vk2) ll43).c1(7)) {
                                            z = true;
                                            break;
                                        }
                                    } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                        int i4 = 0;
                                        for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                            if ((ll44.y & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    ll43 = ll44;
                                                } else {
                                                    if (eq43 == null) {
                                                        eq43 = new eq4(new ll4[16]);
                                                    }
                                                    if (ll43 != null) {
                                                        eq43.b(ll43);
                                                        ll43 = null;
                                                    }
                                                    eq43.b(ll44);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    ll43 = rc9.j(eq43);
                                }
                                continue;
                            } else {
                                ll43 = ll43.B;
                            }
                        }
                    }
                }
            }
            return z;
        } else {
            h.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
    }
}
