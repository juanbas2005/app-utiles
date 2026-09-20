package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gc5 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ gc5(int i, Object obj, Object obj2) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        int i;
        is2 is2 = (is2) this.y;
        np2 np2 = (np2) this.x;
        mo2 mo2 = (mo2) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        mo2.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(mo2)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        boolean V = yt2.V(i2 & 1, z);
        vs7 vs7 = vs7.a;
        if (V) {
            String u = l55.u(R.string.forum_published, yt2);
            String u2 = l55.u(R.string.forum_updated, yt2);
            aq4 v = u55.v(is2, yt2);
            Boolean bool = (Boolean) mo2.g.K0();
            Object obj5 = ay0.a;
            if (bool == null) {
                yt2.e0(-21525453);
                yt2.r(false);
            } else {
                yt2.e0(-21525452);
                boolean booleanValue = bool.booleanValue();
                boolean g = yt2.g(v) | yt2.h(booleanValue) | yt2.g(u) | yt2.g(u2);
                Object Q = yt2.Q();
                if (g || Q == obj5) {
                    hv hvVar = new hv(booleanValue, u, u2, v, (f61) null, 1);
                    yt2.o0(hvVar);
                    Q = hvVar;
                }
                t49.h((gs2) Q, yt2, vs7);
                yt2.r(false);
            }
            boolean i3 = yt2.i(np2);
            Object Q2 = yt2.Q();
            if (i3 || Q2 == obj5) {
                obj4 = obj5;
                o0 o0Var = new o0(1, np2, np2.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0, 0, 8);
                yt2.o0(o0Var);
                Q2 = o0Var;
            } else {
                obj4 = obj5;
            }
            vr2 vr2 = (vr2) ((zq3) Q2);
            boolean i4 = yt2.i(np2);
            Object Q3 = yt2.Q();
            if (i4 || Q3 == obj4) {
                o0 o0Var2 = new o0(1, np2, np2.class, "setCategoryFilter", "setCategoryFilter(Ljava/lang/String;)V", 0, 0, 9);
                yt2.o0(o0Var2);
                Q3 = o0Var2;
            }
            vr2 vr22 = (vr2) ((zq3) Q3);
            boolean i5 = yt2.i(np2);
            Object Q4 = yt2.Q();
            if (i5 || Q4 == obj4) {
                yd ydVar = new yd(0, np2, np2.class, "loadMore", "loadMore()V", 0, 0, 13);
                yt2.o0(ydVar);
                Q4 = ydVar;
            }
            sr2 sr2 = (sr2) ((zq3) Q4);
            boolean i6 = yt2.i(np2);
            Object Q5 = yt2.Q();
            if (i6 || Q5 == obj4) {
                Q5 = new gg0(27, (Object) np2);
                yt2.o0(Q5);
            }
            vr2 vr23 = (vr2) Q5;
            boolean i7 = yt2.i(np2);
            Object Q6 = yt2.Q();
            if (i7 || Q6 == obj4) {
                o0 o0Var3 = new o0(1, np2, np2.class, "createPost", "createPost(Lcu/lestebang/utiletecsa/data/model/forum/NewForumPost;)V", 0, 0, 10);
                yt2.o0(o0Var3);
                Q6 = o0Var3;
            }
            vr2 vr24 = (vr2) ((zq3) Q6);
            boolean i8 = yt2.i(np2);
            Object Q7 = yt2.Q();
            if (i8 || Q7 == obj4) {
                yv yvVar = new yv(2, np2, np2.class, "updatePost", "updatePost(Ljava/lang/String;Lcu/lestebang/utiletecsa/data/model/forum/NewForumPost;)V", 0, 0, 5);
                yt2.o0(yvVar);
                Q7 = yvVar;
            }
            gs2 gs2 = (gs2) ((zq3) Q7);
            boolean i9 = yt2.i(np2);
            Object Q8 = yt2.Q();
            if (i9 || Q8 == obj4) {
                o0 o0Var4 = new o0(1, np2, np2.class, "deletePost", "deletePost(Ljava/lang/String;)V", 0, 0, 11);
                yt2.o0(o0Var4);
                Q8 = o0Var4;
            }
            vr2 vr25 = (vr2) ((zq3) Q8);
            boolean i10 = yt2.i(np2);
            Object Q9 = yt2.Q();
            if (i10 || Q9 == obj4) {
                yv yvVar2 = new yv(2, np2, np2.class, "votePost", "votePost(Ljava/lang/String;Z)V", 0, 0, 6);
                yt2.o0(yvVar2);
                Q9 = yvVar2;
            }
            gs2 gs22 = (gs2) ((zq3) Q9);
            boolean i11 = yt2.i(np2);
            Object Q10 = yt2.Q();
            if (i11 || Q10 == obj4) {
                o0 o0Var5 = new o0(1, np2, np2.class, "openComments", "openComments(Ljava/lang/String;)V", 0, 0, 6);
                yt2.o0(o0Var5);
                Q10 = o0Var5;
            }
            vr2 vr26 = (vr2) ((zq3) Q10);
            boolean i12 = yt2.i(np2);
            Object Q11 = yt2.Q();
            if (i12 || Q11 == obj4) {
                yd ydVar2 = new yd(0, np2, np2.class, "closeComments", "closeComments()V", 0, 0, 11);
                yt2.o0(ydVar2);
                Q11 = ydVar2;
            }
            sr2 sr22 = (sr2) ((zq3) Q11);
            boolean i13 = yt2.i(np2);
            Object Q12 = yt2.Q();
            if (i13 || Q12 == obj4) {
                yv yvVar3 = new yv(2, np2, np2.class, "addComment", "addComment(Ljava/lang/String;Ljava/lang/String;)V", 0, 0, 3);
                yt2.o0(yvVar3);
                Q12 = yvVar3;
            }
            gs2 gs23 = (gs2) ((zq3) Q12);
            boolean i14 = yt2.i(np2);
            Object Q13 = yt2.Q();
            if (i14 || Q13 == obj4) {
                o0 o0Var6 = new o0(1, np2, np2.class, "deleteComment", "deleteComment(Ljava/lang/String;)V", 0, 0, 7);
                yt2.o0(o0Var6);
                Q13 = o0Var6;
            }
            vr2 vr27 = (vr2) ((zq3) Q13);
            boolean i15 = yt2.i(np2);
            Object Q14 = yt2.Q();
            if (i15 || Q14 == obj4) {
                yv yvVar4 = new yv(2, np2, np2.class, "voteComment", "voteComment(Ljava/lang/String;Z)V", 0, 0, 4);
                yt2.o0(yvVar4);
                Q14 = yvVar4;
            }
            gs2 gs24 = (gs2) ((zq3) Q14);
            boolean i16 = yt2.i(np2);
            Object Q15 = yt2.Q();
            if (i16 || Q15 == obj4) {
                yd ydVar3 = new yd(0, np2, np2.class, "acceptForumTerms", "acceptForumTerms()V", 0, 0, 12);
                yt2.o0(ydVar3);
                Q15 = ydVar3;
            }
            sr2 sr23 = (sr2) ((zq3) Q15);
            yt2 yt22 = yt2;
            mo2 mo22 = mo2;
            vs7 vs72 = vs7;
            gs2 gs25 = gs23;
            r16.h(mo22, vr2, vr22, sr2, vr23, vr24, gs2, vr25, gs22, vr26, sr22, gs25, vr27, gs24, sr23, is2, yt22, i2 & 14);
            return vs72;
        }
        vs7 vs73 = vs7;
        yt2.Y();
        return vs73;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ru4 ru4 = (ru4) this.y;
        rh3 rh3 = (rh3) this.x;
        nh3 nh3 = (nh3) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        nh3.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(nh3)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        boolean z2 = false;
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            hv2 hv2 = nh3.d;
            if ((intValue & 14) == 4) {
                z2 = true;
            }
            boolean g = yt2.g(ru4) | z2;
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                Q = new tc1(nh3, ru4, (f61) null, 5);
                yt2.o0(Q);
            }
            t49.j(hv2, ru4, (gs2) Q, yt2);
            String str = nh3.b;
            double d = nh3.c;
            boolean i2 = yt2.i(rh3);
            Object Q2 = yt2.Q();
            if (i2 || Q2 == d63) {
                o0 o0Var = new o0(1, rh3, rh3.class, "updateName", "updateName(Ljava/lang/String;)V", 0, 0, 21);
                yt2.o0(o0Var);
                Q2 = o0Var;
            }
            vr2 vr2 = (vr2) ((zq3) Q2);
            boolean i3 = yt2.i(rh3);
            Object Q3 = yt2.Q();
            if (i3 || Q3 == d63) {
                o0 o0Var2 = new o0(1, rh3, rh3.class, "updatePrice", "updatePrice(Ljava/lang/String;)V", 0, 0, 22);
                yt2.o0(o0Var2);
                Q3 = o0Var2;
            }
            vr2 vr22 = (vr2) ((zq3) Q3);
            boolean i4 = yt2.i(rh3);
            Object Q4 = yt2.Q();
            if (i4 || Q4 == d63) {
                Q4 = new yd(0, rh3, rh3.class, "createOrUpdateJetpack", "createOrUpdateJetpack()V", 0, 0, 17);
                yt2.o0(Q4);
            }
            h49.j(str, d, vr2, vr22, (sr2) ((zq3) Q4), ru4, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        vr vrVar = (vr) this.y;
        gs2 gs2 = (gs2) this.x;
        bu0 bu0 = (bu0) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (yt2.g(bu0)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            pe2 pe2 = wr.e;
            if (sg3.e(vrVar, pe2) || sg3.e(vrVar, wr.d)) {
                yt2.e0(-1061932102);
                k75.a(yt2, bu0.a(true));
                yt2.r(false);
            } else {
                yt2.e0(-1061867715);
                yt2.r(false);
            }
            gs2.H(yt2, 0);
            if (sg3.e(vrVar, pe2)) {
                yt2.e0(-1061769414);
                k75.a(yt2, bu0.a(true));
                yt2.r(false);
            } else {
                yt2.e0(-1061705027);
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r1 != false) goto L_0x00ac;
     */
    private final Object k(Object obj, Object obj2, Object obj3) {
        float f;
        ob5 ob5 = (ob5) this.y;
        ey3 ey3 = (ey3) this.x;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        float floatValue3 = ((Float) obj3).floatValue();
        boolean w2 = jb5.w(ob5, floatValue);
        boolean z = false;
        if (!(ob5.m().e == z75.w || ey3 == ey3.w)) {
            w2 = !w2;
        }
        int i = ob5.m().b;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = jb5.i(ob5) / ((float) i);
        }
        float f2 = f - ((float) ((int) f));
        if (Math.abs(floatValue) >= ob5.n.e0(400.0f)) {
            if (floatValue > 0.0f) {
                z = true;
            } else {
                z = true;
            }
        }
        if (!z) {
            if (Math.abs(f2) <= 0.5f) {
                float abs = Math.abs(f);
                tp1 tp1 = ob5.n;
                qb5 qb5 = rb5.a;
                if (abs < Math.abs(Math.min(tp1.e0(56.0f), ((float) ob5.o()) / 2.0f) / ((float) ob5.o()))) {
                }
            }
        } else if (!z) {
            if (!z) {
                floatValue2 = 0.0f;
            }
            return Float.valueOf(floatValue2);
        }
        floatValue2 = floatValue3;
        return Float.valueOf(floatValue2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r5 == r3) goto L_0x00cc;
     */
    private final Object l(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        boolean z2;
        boolean z3;
        Object obj5;
        Integer num;
        if7 if7;
        boolean z4;
        int i;
        Object obj6;
        int i2;
        lq5 lq5 = (lq5) this.y;
        rv0 rv0 = (rv0) this.x;
        wp5 wp5 = (wp5) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        wp5.getClass();
        if7 if72 = wp5.f;
        u5 u5Var = wp5.a;
        rv rvVar = wp5.d;
        if ((intValue & 6) == 0) {
            if (yt2.g(wp5)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            intValue |= i2;
        }
        int i3 = intValue;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            boolean z5 = wp5.m;
            Object obj7 = ay0.a;
            if (z5) {
                yt2.e0(1851583003);
                boolean i4 = yt2.i(lq5);
                Object Q = yt2.Q();
                if (i4 || Q == obj7) {
                    z2 = false;
                    obj4 = obj7;
                    xi5 xi5 = new xi5(0, lq5, lq5.class, "dismissNautaEmailDialog", "dismissNautaEmailDialog()V", 0, 0, 1);
                    yt2.o0(xi5);
                    Q = xi5;
                } else {
                    z2 = false;
                    obj4 = obj7;
                }
                mp7.z((sr2) ((zq3) Q), yt2, z2 ? 1 : 0);
                yt2.r(z2);
            } else {
                z2 = false;
                obj4 = obj7;
                yt2.e0(1851674298);
                yt2.r(false);
            }
            Context context = (Context) yt2.k(ye.b);
            String u = l55.u(R.string.register_email_rate_limit, yt2);
            int i5 = i3 & 14;
            if (i5 == 4) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean i6 = yt2.i(context) | z3 | yt2.g(u);
            Object Q2 = yt2.Q();
            if (!i6) {
                obj5 = obj4;
            } else {
                obj5 = obj4;
            }
            Q2 = new gv(wp5, context, u, (f61) null, 8);
            yt2.o0(Q2);
            t49.j(rvVar, u5Var, (gs2) Q2, yt2);
            if (u5Var == null) {
                yt2.e0(1852361165);
                int ordinal = rvVar.ordinal();
                if (ordinal == 2) {
                    Object obj8 = obj5;
                    z4 = z2;
                    yt2.e0(-910077619);
                    String str = if72.a;
                    if7 if73 = wp5.j;
                    boolean i7 = yt2.i(lq5);
                    Object Q3 = yt2.Q();
                    if (i7 || Q3 == obj8) {
                        q75 q75 = new q75(1, lq5, lq5.class, "updateVerificationCode", "updateVerificationCode(Ljava/lang/String;)V", 0, 0, 22);
                        yt2.o0(q75);
                        Q3 = q75;
                    }
                    vr2 vr2 = (vr2) ((zq3) Q3);
                    boolean i8 = yt2.i(lq5);
                    Object Q4 = yt2.Q();
                    if (i8 || Q4 == obj8) {
                        xi5 xi52 = new xi5(0, lq5, lq5.class, "verifyEmail", "verifyEmail()V", 0, 0, 10);
                        yt2.o0(xi52);
                        Q4 = xi52;
                    }
                    sr2 sr2 = (sr2) ((zq3) Q4);
                    boolean i9 = yt2.i(lq5);
                    Object Q5 = yt2.Q();
                    if (i9 || Q5 == obj8) {
                        xi5 xi53 = new xi5(0, lq5, lq5.class, "resendVerificationCode", "resendVerificationCode()V", 0, 0, 11);
                        yt2.o0(xi53);
                        Q5 = xi53;
                    }
                    sr2 sr22 = (sr2) ((zq3) Q5);
                    boolean i10 = yt2.i(lq5);
                    Object Q6 = yt2.Q();
                    if (i10 || Q6 == obj8) {
                        Q6 = new bq5(lq5, z4 ? 1 : 0);
                        yt2.o0(Q6);
                    }
                    mp7.L(str, if73, vr2, sr2, sr22, (sr2) Q6, yt2, 0);
                    yt2.r(z4);
                } else if (ordinal == 3) {
                    Object obj9 = obj5;
                    z4 = z2;
                    yt2.e0(-910060786);
                    if7 if74 = wp5.f;
                    boolean i11 = yt2.i(lq5);
                    Object Q7 = yt2.Q();
                    if (i11 || Q7 == obj9) {
                        q75 q752 = new q75(1, lq5, lq5.class, "updateEmail", "updateEmail(Ljava/lang/String;)V", 0, 0, 23);
                        yt2.o0(q752);
                        Q7 = q752;
                    }
                    vr2 vr22 = (vr2) ((zq3) Q7);
                    boolean i12 = yt2.i(lq5);
                    Object Q8 = yt2.Q();
                    if (i12 || Q8 == obj9) {
                        xi5 xi54 = new xi5(0, lq5, lq5.class, "sendPasswordResetCode", "sendPasswordResetCode()V", 0, 0, 12);
                        yt2.o0(xi54);
                        Q8 = xi54;
                    }
                    sr2 sr23 = (sr2) ((zq3) Q8);
                    boolean i13 = yt2.i(lq5);
                    Object Q9 = yt2.Q();
                    if (i13 || Q9 == obj9) {
                        Q9 = new bq5(lq5, 1);
                        yt2.o0(Q9);
                    }
                    mp7.r(if74, vr22, sr23, (sr2) Q9, yt2, 0);
                    yt2.r(z4);
                } else if (ordinal != 4) {
                    yt2.e0(-910023038);
                    boolean i14 = yt2.i(lq5);
                    Object Q10 = yt2.Q();
                    if (i14 || Q10 == obj5) {
                        i = i5;
                        obj6 = obj5;
                        q75 q753 = new q75(1, lq5, lq5.class, "setAuthMode", "setAuthMode(Lcu/lestebang/utiletecsa/feature/profile/ui/AuthMode;)V", 0, 0, 13);
                        yt2.o0(q753);
                        Q10 = q753;
                    } else {
                        i = i5;
                        obj6 = obj5;
                    }
                    vr2 vr23 = (vr2) ((zq3) Q10);
                    boolean i15 = yt2.i(lq5);
                    Object Q11 = yt2.Q();
                    if (i15 || Q11 == obj6) {
                        q75 q754 = new q75(1, lq5, lq5.class, "updateName", "updateName(Ljava/lang/String;)V", 0, 0, 14);
                        yt2.o0(q754);
                        Q11 = q754;
                    }
                    vr2 vr24 = (vr2) ((zq3) Q11);
                    boolean i16 = yt2.i(lq5);
                    Object Q12 = yt2.Q();
                    if (i16 || Q12 == obj6) {
                        q75 q755 = new q75(1, lq5, lq5.class, "updateEmail", "updateEmail(Ljava/lang/String;)V", 0, 0, 15);
                        yt2.o0(q755);
                        Q12 = q755;
                    }
                    vr2 vr25 = (vr2) ((zq3) Q12);
                    boolean i17 = yt2.i(lq5);
                    Object Q13 = yt2.Q();
                    if (i17 || Q13 == obj6) {
                        q75 q756 = new q75(1, lq5, lq5.class, "updatePassword", "updatePassword(Ljava/lang/String;)V", 0, 0, 16);
                        yt2.o0(q756);
                        Q13 = q756;
                    }
                    vr2 vr26 = (vr2) ((zq3) Q13);
                    boolean i18 = yt2.i(lq5);
                    Object Q14 = yt2.Q();
                    if (i18 || Q14 == obj6) {
                        q75 q757 = new q75(1, lq5, lq5.class, "updateConfirmPassword", "updateConfirmPassword(Ljava/lang/String;)V", 0, 0, 17);
                        yt2.o0(q757);
                        Q14 = q757;
                    }
                    vr2 vr27 = (vr2) ((zq3) Q14);
                    boolean i19 = yt2.i(lq5);
                    Object Q15 = yt2.Q();
                    if (i19 || Q15 == obj6) {
                        q75 q758 = new q75(1, lq5, lq5.class, "updateInvitationCode", "updateInvitationCode(Ljava/lang/String;)V", 0, 0, 18);
                        yt2.o0(q758);
                        Q15 = q758;
                    }
                    vr2 vr28 = (vr2) ((zq3) Q15);
                    boolean i20 = yt2.i(lq5);
                    Object Q16 = yt2.Q();
                    if (i20 || Q16 == obj6) {
                        xi5 xi55 = new xi5(0, lq5, lq5.class, "signIn", "signIn()V", 0, 0, 4);
                        yt2.o0(xi55);
                        Q16 = xi55;
                    }
                    sr2 sr24 = (sr2) ((zq3) Q16);
                    boolean i21 = yt2.i(lq5);
                    Object Q17 = yt2.Q();
                    if (i21 || Q17 == obj6) {
                        xi5 xi56 = new xi5(0, lq5, lq5.class, "register", "register()V", 0, 0, 5);
                        yt2.o0(xi56);
                        Q17 = xi56;
                    }
                    sr2 sr25 = (sr2) ((zq3) Q17);
                    boolean i22 = yt2.i(rv0) | yt2.i(lq5);
                    Object Q18 = yt2.Q();
                    if (i22 || Q18 == obj6) {
                        Q18 = new qm3(18, (Object) rv0, (Object) lq5);
                        yt2.o0(Q18);
                    }
                    sr2 sr26 = (sr2) Q18;
                    boolean i23 = yt2.i(lq5);
                    Object Q19 = yt2.Q();
                    if (i23 || Q19 == obj6) {
                        xi5 xi57 = new xi5(0, lq5, lq5.class, "startPasswordRecovery", "startPasswordRecovery()V", 0, 0, 6);
                        yt2.o0(xi57);
                        Q19 = xi57;
                    }
                    boolean z6 = z2;
                    sr2 sr27 = sr26;
                    z4 = z6;
                    yt2 yt22 = yt2;
                    mp7.d(wp5, vr23, vr24, vr25, vr26, vr27, vr28, sr24, sr25, sr27, (sr2) ((zq3) Q19), yt22, i);
                    yt2 = yt22;
                    yt2.r(z4);
                } else {
                    Object obj10 = obj5;
                    z4 = z2;
                    yt2.e0(-910048473);
                    String str2 = if72.a;
                    if7 if75 = wp5.j;
                    if7 if76 = wp5.g;
                    if7 if77 = wp5.h;
                    boolean i24 = yt2.i(lq5);
                    Object Q20 = yt2.Q();
                    if (i24 || Q20 == obj10) {
                        q75 q759 = new q75(1, lq5, lq5.class, "updateVerificationCode", "updateVerificationCode(Ljava/lang/String;)V", 0, 0, 10);
                        yt2.o0(q759);
                        Q20 = q759;
                    }
                    vr2 vr29 = (vr2) ((zq3) Q20);
                    boolean i25 = yt2.i(lq5);
                    Object Q21 = yt2.Q();
                    if (i25 || Q21 == obj10) {
                        q75 q7510 = new q75(1, lq5, lq5.class, "updatePassword", "updatePassword(Ljava/lang/String;)V", 0, 0, 11);
                        yt2.o0(q7510);
                        Q21 = q7510;
                    }
                    vr2 vr210 = (vr2) ((zq3) Q21);
                    boolean i26 = yt2.i(lq5);
                    Object Q22 = yt2.Q();
                    if (i26 || Q22 == obj10) {
                        q75 q7511 = new q75(1, lq5, lq5.class, "updateConfirmPassword", "updateConfirmPassword(Ljava/lang/String;)V", 0, 0, 12);
                        yt2.o0(q7511);
                        Q22 = q7511;
                    }
                    vr2 vr211 = (vr2) ((zq3) Q22);
                    boolean i27 = yt2.i(lq5);
                    Object Q23 = yt2.Q();
                    if (i27 || Q23 == obj10) {
                        xi5 xi58 = new xi5(0, lq5, lq5.class, "resetPassword", "resetPassword()V", 0, 0, 2);
                        yt2.o0(xi58);
                        Q23 = xi58;
                    }
                    sr2 sr28 = (sr2) ((zq3) Q23);
                    boolean i28 = yt2.i(lq5);
                    Object Q24 = yt2.Q();
                    if (i28 || Q24 == obj10) {
                        xi5 xi59 = new xi5(0, lq5, lq5.class, "resendPasswordResetCode", "resendPasswordResetCode()V", 0, 0, 3);
                        yt2.o0(xi59);
                        Q24 = xi59;
                    }
                    sr2 sr29 = (sr2) ((zq3) Q24);
                    boolean i29 = yt2.i(lq5);
                    Object Q25 = yt2.Q();
                    if (i29 || Q25 == obj10) {
                        Q25 = new bq5(lq5, 2);
                        yt2.o0(Q25);
                    }
                    if7 if78 = if76;
                    sr2 sr210 = (sr2) Q25;
                    String str3 = str2;
                    mp7.H(str3, if75, if78, if77, vr29, vr210, vr211, sr28, sr29, sr210, yt2, 0);
                    yt2.r(z4);
                }
                yt2.r(z4);
            } else {
                Object obj11 = obj5;
                boolean z7 = z2;
                yt2.e0(1854904250);
                u5 u5Var2 = wp5.a;
                a54 a54 = wp5.b;
                b54 b54 = wp5.c;
                Integer num2 = wp5.n;
                if7 if79 = wp5.k;
                if7 if710 = wp5.l;
                boolean i30 = yt2.i(lq5);
                Object Q26 = yt2.Q();
                if (i30 || Q26 == obj11) {
                    if7 = if79;
                    num = num2;
                    q75 q7512 = new q75(1, lq5, lq5.class, "updateTransferId", "updateTransferId(Ljava/lang/String;)V", 0, 0, 19);
                    yt2.o0(q7512);
                    Q26 = q7512;
                } else {
                    num = num2;
                    if7 = if79;
                }
                vr2 vr212 = (vr2) ((zq3) Q26);
                boolean i31 = yt2.i(lq5);
                Object Q27 = yt2.Q();
                if (i31 || Q27 == obj11) {
                    q75 q7513 = new q75(1, lq5, lq5.class, "submitTransferId", "submitTransferId([B)V", 0, 0, 20);
                    yt2.o0(q7513);
                    Q27 = q7513;
                }
                vr2 vr213 = (vr2) ((zq3) Q27);
                boolean i32 = yt2.i(lq5);
                Object Q28 = yt2.Q();
                if (i32 || Q28 == obj11) {
                    q75 q7514 = new q75(1, lq5, lq5.class, "updateCouponCode", "updateCouponCode(Ljava/lang/String;)V", 0, 0, 21);
                    yt2.o0(q7514);
                    Q28 = q7514;
                }
                vr2 vr214 = (vr2) ((zq3) Q28);
                boolean i33 = yt2.i(lq5);
                Object Q29 = yt2.Q();
                if (i33 || Q29 == obj11) {
                    xi5 xi510 = new xi5(0, lq5, lq5.class, "applyCoupon", "applyCoupon()V", 0, 0, 7);
                    yt2.o0(xi510);
                    Q29 = xi510;
                }
                sr2 sr211 = (sr2) ((zq3) Q29);
                boolean i34 = yt2.i(lq5);
                Object Q30 = yt2.Q();
                if (i34 || Q30 == obj11) {
                    xi5 xi511 = new xi5(0, lq5, lq5.class, "refreshLicense", "refreshLicense()V", 0, 0, 8);
                    yt2.o0(xi511);
                    Q30 = xi511;
                }
                sr2 sr212 = (sr2) ((zq3) Q30);
                boolean i35 = yt2.i(lq5);
                Object Q31 = yt2.Q();
                if (i35 || Q31 == obj11) {
                    xi5 xi512 = new xi5(0, lq5, lq5.class, "signOut", "signOut()V", 0, 0, 9);
                    yt2.o0(xi512);
                    Q31 = xi512;
                }
                Integer num3 = num;
                yt2 yt23 = yt2;
                mp7.c(u5Var2, a54, b54, num3, if7, if710, vr212, vr213, vr214, sr211, sr212, (sr2) ((zq3) Q31), yt23, 0);
                yt23.r(z7);
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX WARNING: type inference failed for: r3v12, types: [m23] */
    /* JADX WARNING: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        o96 o96;
        int i2;
        cf5 cf5 = (cf5) this.y;
        vr2 vr2 = (vr2) this.x;
        lu6 lu6 = (lu6) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        lu6.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(lu6)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            intValue |= i2;
        }
        int i3 = intValue;
        int i4 = 1;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            w52 w52 = cf5.y;
            Iterator it = w52.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    cf5 cf52 = (cf5) next;
                    if (cf5 == cf52) {
                        i = i4;
                    } else {
                        i = 0;
                    }
                    boolean g = yt2.g(vr2) | yt2.e(cf52.ordinal());
                    Object Q = yt2.Q();
                    if (g || Q == ay0.a) {
                        Q = new qm3(17, (Object) vr2, (Object) cf52);
                        yt2.o0(Q);
                    }
                    sr2 sr2 = (sr2) Q;
                    xi6 xi6 = xi6.a;
                    int f = w52.f();
                    pq6 a = hr6.a(we.r, yt2);
                    a.getClass();
                    o96 o962 = (o96) a;
                    if (f != i4) {
                        if (i5 == 0) {
                            mx1 mx1 = uq6.i;
                            o96 = o96.c(o962, (a81) null, mx1, mx1, (a81) null, 9);
                        } else if (i5 == f - 1) {
                            mx1 mx12 = uq6.i;
                            o96 = o96.c(o962, mx12, (a81) null, (a81) null, mx12, 6);
                        } else {
                            o96 = gr8.h;
                        }
                        o962 = o96;
                    }
                    o96 o963 = o962;
                    t35.a(lu6, i, sr2, o963, (ml4) null, false, (vi6) null, (ua0) null, (la5) null, (gs2) null, su0.J(1542207825, new yg(24, cf52), yt2), yt2, i3 & 14);
                    i5 = i6;
                    i4 = i4;
                } else {
                    sg3.Z();
                    throw null;
                }
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str = (String) this.y;
        sr2 sr2 = (sr2) this.x;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((bu0) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 K = x91.K(jl4, 20.0f);
            au0 a = zt0.a(wr.c, xb4.L, yt2, 48);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, K);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, a);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            x83 x2 = rg3.x();
            int i = x08.b;
            d83.a(x2, (String) null, yu6.l(jl4, 36.0f), x08.f(uq3.d(4279391610L), uq3.d(4281301934L)), yt2, 432, 0);
            yt2 yt22 = yt2;
            jl4 jl42 = jl4;
            yf7.b(pb4.j(jl4, 10.0f, yt2, R.string.title_permission_required, yt2), (ml4) null, x08.e(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262058);
            yt2 yt23 = yt22;
            k75.a(yt23, yu6.d(jl42, 6.0f));
            yt2 yt24 = yt23;
            yf7.b(str, (ml4) null, x08.a(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(20), 0, false, 0, 0, (tg7) null, yt24, 24576, 48, 260074);
            k75.a(yt24, yu6.d(jl42, 14.0f));
            o96 a2 = q96.a(12.0f);
            pa5 pa5 = yd0.a;
            yt2 yt25 = yt24;
            yt2 yt26 = yt25;
            gw8.a(sr2, (ml4) null, false, a2, yd0.a(x08.f(uq3.d(4279391610L), uq3.d(4281301934L)), 0, 0, 0, yt25, 14), (ce0) null, (ua0) null, (la5) null, ag8.a, yt26, 805306368, 486);
            yt26.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        u96 u96;
        am6 am6 = (am6) this.x;
        int intValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        bv4 bv4 = (bv4) obj3;
        str.getClass();
        bv4.getClass();
        Object obj4 = ((Map) this.y).get(str);
        obj4.getClass();
        List<String> list = (List) obj4;
        if ((bv4 instanceof ct0) || ((zr3) am6.y).getDescriptor().i(intValue)) {
            u96 = u96.x;
        } else {
            u96 = u96.w;
        }
        int ordinal = u96.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                for (String k : list) {
                    am6.k(str, k);
                }
            } else {
                h.c();
                return null;
            }
        } else if (list.size() == 1) {
            am6.z = ((String) am6.z) + '/' + ((String) dt0.w0(list));
        } else {
            StringBuilder q = b81.q("Expected one value for argument ", str, ", found ");
            q.append(list.size());
            q.append("values instead.");
            throw new IllegalArgumentException(q.toString().toString());
        }
        return vs7.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        sr2 sr2 = (sr2) this.y;
        vr2 vr2 = (vr2) this.x;
        ml4 ml4 = (ml4) obj;
        yt2 yt2 = (yt2) obj2;
        ((Integer) obj3).getClass();
        yt2.e0(759876635);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = u55.i(sr2);
            yt2.o0(Q);
        }
        a37 a37 = (a37) Q;
        Object Q2 = yt2.Q();
        if (Q2 == d63) {
            Q2 = new uj(new l35(((l35) a37.getValue()).a), xj6.b, new l35(xj6.c), 8);
            yt2.o0(Q2);
        }
        uj ujVar = (uj) Q2;
        boolean i = yt2.i(ujVar);
        Object Q3 = yt2.Q();
        if (i || Q3 == d63) {
            Q3 = new ii3((Object) a37, (Object) ujVar, (f61) null, 23);
            yt2.o0(Q3);
        }
        t49.h((gs2) Q3, yt2, vs7.a);
        il ilVar = ujVar.c;
        boolean g = yt2.g(ilVar);
        Object Q4 = yt2.Q();
        if (g || Q4 == d63) {
            Q4 = new mu4(8, ilVar);
            yt2.o0(Q4);
        }
        ml4 ml42 = (ml4) vr2.y((sr2) Q4);
        yt2.r(false);
        return ml42;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        boolean z;
        vr2 vr2 = (vr2) this.x;
        aq4 aq4 = (aq4) this.y;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((bu0) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            Iterator it = jy7.A.iterator();
            while (it.hasNext()) {
                jy7 jy7 = (jy7) it.next();
                fw0 J = su0.J(-1562153918, new ph6(3, jy7), yt2);
                boolean g = yt2.g(vr2) | yt2.e(jy7.ordinal());
                Object Q = yt2.Q();
                if (g || Q == ay0.a) {
                    Q = new g20(vr2, jy7, aq4, 18);
                    yt2.o0(Q);
                }
                vg.a(J, (sr2) Q, (ml4) null, false, (wi4) null, (la5) null, yt2, 6);
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        is2 is2 = (is2) this.y;
        t17 t17 = (t17) this.x;
        e17 e17 = (e17) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        e17.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(e17)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        boolean V = yt2.V(i2 & 1, z);
        vs7 vs7 = vs7.a;
        if (V) {
            String u = l55.u(R.string.spot_published, yt2);
            aq4 v = u55.v(is2, yt2);
            Boolean bool = (Boolean) e17.f.K0();
            d63 d63 = ay0.a;
            if (bool == null) {
                yt2.e0(-1119544826);
                yt2.r(false);
            } else {
                yt2.e0(-1119544825);
                boolean g = yt2.g(v) | yt2.g(u);
                Object Q = yt2.Q();
                if (g || Q == d63) {
                    Q = new x20(u, v, (f61) null, 1);
                    yt2.o0(Q);
                }
                t49.h((gs2) Q, yt2, vs7);
                yt2.r(false);
            }
            boolean i3 = yt2.i(t17);
            Object Q2 = yt2.Q();
            if (i3 || Q2 == d63) {
                Q2 = new no6(1, t17, t17.class, "setFilter", "setFilter(Lcu/lestebang/utiletecsa/data/model/spots/ConnectionType;)V", 0, 0, 23);
                yt2.o0(Q2);
            }
            vr2 vr2 = (vr2) ((zq3) Q2);
            boolean i4 = yt2.i(t17);
            Object Q3 = yt2.Q();
            if (i4 || Q3 == d63) {
                no6 no6 = new no6(1, t17, t17.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0, 0, 24);
                yt2.o0(no6);
                Q3 = no6;
            }
            vr2 vr22 = (vr2) ((zq3) Q3);
            boolean i5 = yt2.i(t17);
            Object Q4 = yt2.Q();
            if (i5 || Q4 == d63) {
                yv yvVar = new yv(2, t17, t17.class, "vote", "vote(Ljava/lang/String;Z)V", 0, 0, 14);
                yt2.o0(yvVar);
                Q4 = yvVar;
            }
            gs2 gs2 = (gs2) ((zq3) Q4);
            boolean i6 = yt2.i(t17);
            Object Q5 = yt2.Q();
            if (i6 || Q5 == d63) {
                no6 no62 = new no6(1, t17, t17.class, "addSpot", "addSpot(Lcu/lestebang/utiletecsa/data/model/spots/NewConnectionSpot;)V", 0, 0, 25);
                yt2.o0(no62);
                Q5 = no62;
            }
            vr2 vr23 = (vr2) ((zq3) Q5);
            boolean i7 = yt2.i(t17);
            Object Q6 = yt2.Q();
            if (i7 || Q6 == d63) {
                no6 no63 = new no6(1, t17, t17.class, "deleteSpot", "deleteSpot(Ljava/lang/String;)V", 0, 0, 26);
                yt2.o0(no63);
                Q6 = no63;
            }
            q17.c(e17, vr2, vr22, gs2, vr23, (vr2) ((zq3) Q6), yt2, i2 & 14);
            return vs7;
        }
        yt2.Y();
        return vs7;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        boolean z;
        gs2 gs2 = (gs2) this.y;
        gs2 gs22 = (gs2) this.x;
        bu0 bu0 = (bu0) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            va7.c(gs2, gs22, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        yt2 yt2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        long j;
        int i;
        Typeface typeface;
        int i2 = this.w;
        sr srVar = wr.c;
        jl4 jl4 = jl4.w;
        Object obj5 = ay0.a;
        Object obj6 = null;
        vs7 vs7 = vs7.a;
        boolean z12 = true;
        Object obj7 = this.x;
        Object obj8 = this.y;
        int i3 = 0;
        switch (i2) {
            case b85.b:
                bc5 bc5 = (bc5) obj8;
                vr2 vr2 = (vr2) obj7;
                yt2 yt22 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                h80 h80 = xb4.I;
                ((bu0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue & 1, z)) {
                    ml4 K = x91.K(jl4, 16.0f);
                    au0 a = zt0.a(srVar, xb4.K, yt22, 0);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    ml4 E = gw8.E(yt22, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt22, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt22, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt22, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt22, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt22, E);
                    rr rrVar = wr.a;
                    ea6 a2 = ca6.a(rrVar, h80, yt22, 48);
                    vr2 vr22 = vr2;
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    vs7 vs72 = vs7;
                    ml4 E2 = gw8.E(yt22, jl4);
                    yt22.i0();
                    rr rrVar2 = rrVar;
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar, yt22, a2);
                    g75.Q(ckVar2, yt22, m2);
                    f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E2);
                    ml4 h = b96.h(we.f(yu6.l(jl4, 38.0f), q96.a), z08.j(), gr8.h);
                    lh4 d = mb0.d(xb4.C, false);
                    ck ckVar5 = ckVar;
                    ml4 ml4 = h;
                    int hashCode3 = Long.hashCode(yt22.T);
                    vf5 m3 = yt22.m();
                    ml4 E3 = gw8.E(yt22, ml4);
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar5, yt22, d);
                    g75.Q(ckVar2, yt22, m3);
                    f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E3);
                    x83 x83 = b35.e;
                    if (x83 == null) {
                        w83 w83 = new w83("Rounded.Storefront", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i4 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 f = pb4.f(21.9f, 7.89f, -1.05f, -3.37f);
                        f.e(-0.22f, -0.9f, -1.0f, -1.52f, -1.91f, -1.52f);
                        be5 be5 = f;
                        be5.f(5.05f);
                        f.e(-0.9f, 0.0f, -1.69f, 0.63f, -1.9f, 1.52f);
                        be5.h(2.1f, 7.89f);
                        f.d(1.64f, 9.86f, 2.95f, 11.0f, 3.0f, 11.06f);
                        be5.m(19.0f);
                        f.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        be5.g(14.0f);
                        f.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        be5.n(-7.94f);
                        f.d(22.12f, 9.94f, 22.09f, 8.65f, 21.9f, 7.89f);
                        be5.c();
                        be5.j(13.0f, 5.0f);
                        be5.g(1.96f);
                        be5.i(0.54f, 3.52f);
                        f.d(15.59f, 9.23f, 15.11f, 10.0f, 14.22f, 10.0f);
                        f.d(13.55f, 10.0f, 13.0f, 9.41f, 13.0f, 8.69f);
                        be5.m(5.0f);
                        be5.c();
                        be5.j(6.44f, 8.86f);
                        f.d(6.36f, 9.51f, 5.84f, 10.0f, 5.23f, 10.0f);
                        f.d(4.3f, 10.0f, 3.88f, 9.03f, 4.04f, 8.36f);
                        be5.h(5.05f, 5.0f);
                        be5.g(1.97f);
                        be5.h(6.44f, 8.86f);
                        be5.c();
                        be5.j(11.0f, 8.69f);
                        f.d(11.0f, 9.41f, 10.45f, 10.0f, 9.71f, 10.0f);
                        f.e(-0.75f, 0.0f, -1.3f, -0.7f, -1.22f, -1.48f);
                        be5.h(9.04f, 5.0f);
                        be5.f(11.0f);
                        be5.m(8.69f);
                        be5.c();
                        be5.j(18.77f, 10.0f);
                        f.e(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f);
                        be5.h(16.98f, 5.0f);
                        be5.i(1.93f, -0.01f);
                        be5.i(1.05f, 3.37f);
                        f.d(20.12f, 9.03f, 19.71f, 10.0f, 18.77f, 10.0f);
                        be5.c();
                        w83.a(w83, be5.a, ky6, 14336);
                        x83 = w83.b();
                        b35.e = x83;
                    }
                    yt2 yt23 = yt22;
                    d83.a(x83, (String) null, yu6.l(jl4, 22.0f), z08.i(), yt23, 432, 0);
                    yt2 yt24 = yt23;
                    yt24.r(true);
                    k75.a(yt24, yu6.p(jl4, 10.0f));
                    String str = bc5.a;
                    String str2 = bc5.b;
                    int i5 = 15;
                    yf7.b(str, (ml4) null, z08.k(), ya5.k(15), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262058);
                    yt24.r(true);
                    if (!d57.I0(str2)) {
                        yt24.e0(-2048539572);
                        k75.a(yt24, yu6.d(jl4, 8.0f));
                        yt2 yt25 = yt24;
                        yf7.b(str2, (ml4) null, z08.e(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(18), 0, false, 0, 0, (tg7) null, yt25, 24576, 48, 260074);
                        yt2 = yt25;
                        yt2.r(false);
                    } else {
                        yt2 = yt24;
                        yt2.e0(-2048278180);
                        yt2.r(false);
                    }
                    yt2.e0(-343166221);
                    for (String str3 : bc5.c) {
                        k75.a(yt2, yu6.d(jl4, 8.0f));
                        kl8.c((ml4) null, 0.0f, z08.h(), yt2, 0, 3);
                        ml4 f2 = we.f(yu6.a, q96.a(10.0f));
                        vr2 vr23 = vr22;
                        boolean g = yt2.g(vr23) | yt2.g(str3);
                        Object Q = yt2.Q();
                        if (g || Q == obj5) {
                            Q = new r20(vr23, str3, 3);
                            yt2.o0(Q);
                        }
                        ml4 L = x91.L(h49.u(f2, false, (String) null, (sr2) Q, i5), 4.0f, 8.0f);
                        rr rrVar3 = rrVar2;
                        ea6 a3 = ca6.a(rrVar3, h80, yt2, 48);
                        String str4 = str3;
                        int hashCode4 = Long.hashCode(yt2.T);
                        vf5 m4 = yt2.m();
                        ml4 E4 = gw8.E(yt2, L);
                        ux0.d.getClass();
                        vy0 vy02 = tx0.b;
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy02);
                        } else {
                            yt2.r0();
                        }
                        g75.Q(tx0.f, yt2, a3);
                        g75.Q(tx0.e, yt2, m4);
                        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode4));
                        g75.O(yt2, tx0.h);
                        g75.Q(tx0.d, yt2, E4);
                        yt2 yt26 = yt2;
                        d83.a(r16.G(), (String) null, yu6.l(jl4, 18.0f), z08.b(), yt26, 432, 0);
                        yt2 yt27 = yt26;
                        k75.a(yt27, yu6.p(jl4, 10.0f));
                        yf7.b(str4, (ml4) null, z08.b(), ya5.k(14), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 1597440, 0, 262058);
                        yt27.r(true);
                        yt2 = yt27;
                        vr22 = vr23;
                        rrVar2 = rrVar3;
                        i5 = 15;
                    }
                    yt2 yt28 = yt2;
                    yt28.r(false);
                    yt28.r(true);
                    return vs72;
                }
                vs7 vs73 = vs7;
                yt22.Y();
                return vs73;
            case 1:
                zn6 zn6 = (zn6) obj8;
                vr2 vr24 = (vr2) obj7;
                yt2 yt29 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xk) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt29.V(intValue2 & 1, z2)) {
                    sd2 sd2 = yu6.a;
                    ea6 a4 = ca6.a(wr.a, xb4.I, yt29, 48);
                    int hashCode5 = Long.hashCode(yt29.T);
                    vf5 m5 = yt29.m();
                    ml4 E5 = gw8.E(yt29, sd2);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt29.i0();
                    if (yt29.S) {
                        yt29.l(vy03);
                    } else {
                        yt29.r0();
                    }
                    g75.Q(tx0.f, yt29, a4);
                    g75.Q(tx0.e, yt29, m5);
                    g75.Q(tx0.g, yt29, Integer.valueOf(hashCode5));
                    g75.O(yt29, tx0.h);
                    g75.Q(tx0.d, yt29, E5);
                    String u = l55.u(R.string.voice_incoming_description, yt29);
                    t37 t37 = ch4.b;
                    yt2 yt210 = yt29;
                    yf7.b(u, new lz3(1.0f, true), ((zg4) yt29.k(t37)).a.s, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt29.k(t37)).b.l, yt210, 0, 0, 131064);
                    yt2 yt211 = yt210;
                    k75.a(yt211, yu6.p(jl4, 8.0f));
                    p97.a(zn6.v, vr24, (ml4) null, false, (n97) null, yt211, 0, 124);
                    yt211.r(true);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 2:
                ey3 ey3 = (ey3) obj8;
                fw0 fw0 = (fw0) obj7;
                sj2 sj2 = (sj2) obj;
                yt2 yt212 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt212.V(intValue3 & 1, z3)) {
                    t49.c(xy0.n.a(ey3), fw0, yt212, 8);
                } else {
                    yt212.Y();
                }
                return vs7;
            case 3:
                int i6 = 2;
                is2 is2 = (is2) obj8;
                c30 c30 = (c30) obj7;
                k20 k20 = (k20) obj;
                yt2 yt213 = (yt2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k20.getClass();
                if ((intValue4 & 6) == 0) {
                    if (yt213.g(k20)) {
                        i6 = 4;
                    }
                    intValue4 |= i6;
                }
                if ((intValue4 & 19) == 18) {
                    z12 = false;
                }
                if (yt213.V(intValue4 & 1, z12)) {
                    String u2 = l55.u(R.string.feedback_sent, yt213);
                    aq4 v = u55.v(is2, yt213);
                    if (((Boolean) k20.b.K0()) == null) {
                        yt213.e0(1763410134);
                        yt213.r(false);
                    } else {
                        yt213.e0(1763410135);
                        boolean g2 = yt213.g(v) | yt213.g(u2);
                        Object Q2 = yt213.Q();
                        if (g2 || Q2 == obj5) {
                            z4 = false;
                            Q2 = new x20(u2, v, (f61) null, 0);
                            yt213.o0(Q2);
                        } else {
                            z4 = false;
                        }
                        t49.h((gs2) Q2, yt213, vs7);
                        yt213.r(z4);
                    }
                    boolean i7 = yt213.i(c30);
                    Object Q3 = yt213.Q();
                    if (i7 || Q3 == obj5) {
                        Q3 = new yv(2, c30, c30.class, "sendFeedback", "sendFeedback(Lcu/lestebang/utiletecsa/data/repository/feedback/ReportType;Ljava/lang/String;)V", 0, 0, 1);
                        yt213.o0(Q3);
                    }
                    b30.a(k20, (gs2) ((zq3) Q3), yt213, intValue4 & 14);
                } else {
                    yt213.Y();
                }
                return vs7;
            case 4:
                Context context = (Context) obj8;
                aq4 aq4 = (aq4) obj7;
                yt2 yt214 = (yt2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                g80 g80 = xb4.L;
                ((bu0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt214.V(intValue5 & 1, z5)) {
                    ml4 L2 = x91.L(jl4, 20.0f, 16.0f);
                    au0 a5 = zt0.a(srVar, xb4.K, yt214, 0);
                    int hashCode6 = Long.hashCode(yt214.T);
                    vf5 m6 = yt214.m();
                    ml4 E6 = gw8.E(yt214, L2);
                    ux0.d.getClass();
                    vy0 vy04 = tx0.b;
                    yt214.i0();
                    if (yt214.S) {
                        yt214.l(vy04);
                    } else {
                        yt214.r0();
                    }
                    g75.Q(tx0.f, yt214, a5);
                    g75.Q(tx0.e, yt214, m6);
                    g75.Q(tx0.g, yt214, Integer.valueOf(hashCode6));
                    g75.O(yt214, tx0.h);
                    g75.Q(tx0.d, yt214, E6);
                    String u3 = l55.u(R.string.share_message, yt214);
                    boolean i8 = yt214.i(context) | yt214.g(u3);
                    Object Q4 = yt214.Q();
                    if (i8 || Q4 == obj5) {
                        Q4 = new m20(context, u3, 0);
                        yt214.o0(Q4);
                    }
                    b30.l((sr2) Q4, yt214, 0);
                    b30.j(0, yt214);
                    b30.k(l55.u(R.string.section_contact_us, yt214), yt214, 0);
                    x83 x832 = (x83) tb0.a.getValue();
                    long j2 = b30.c;
                    boolean i9 = yt214.i(context);
                    Object Q5 = yt214.Q();
                    if (i9 || Q5 == obj5) {
                        Q5 = new n20(context, 0);
                        yt214.o0(Q5);
                    }
                    b30.c(x832, j2, "facebook.com/UtilEsSoft", false, (sr2) Q5, yt214, 432, 8);
                    x83 J = pv8.J();
                    g80 g802 = g80;
                    long r = b30.r(uq3.d(4282795590L), uq3.d(4290364106L));
                    boolean i10 = yt214.i(context);
                    Object Q6 = yt214.Q();
                    if (i10 || Q6 == obj5) {
                        Q6 = new n20(context, 1);
                        yt214.o0(Q6);
                    }
                    b30.c(J, r, "www.apputiles.com", false, (sr2) Q6, yt214, 384, 8);
                    x83 u4 = rd3.u();
                    long j3 = b30.f;
                    boolean i11 = yt214.i(context);
                    Object Q7 = yt214.Q();
                    if (i11 || Q7 == obj5) {
                        Q7 = new n20(context, 2);
                        yt214.o0(Q7);
                    }
                    b30.c(u4, j3, "utilessoft@gmail.com", true, (sr2) Q7, yt214, 3504, 0);
                    x83 x833 = (x83) tb0.b.getValue();
                    long j4 = b30.d;
                    boolean i12 = yt214.i(context);
                    Object Q8 = yt214.Q();
                    if (i12 || Q8 == obj5) {
                        Q8 = new n20(context, 3);
                        yt214.o0(Q8);
                    }
                    b30.c(x833, j4, "t.me/UtilESCuba", false, (sr2) Q8, yt214, 432, 8);
                    x83 x834 = (x83) tb0.c.getValue();
                    long j5 = b30.e;
                    boolean i13 = yt214.i(context);
                    Object Q9 = yt214.Q();
                    if (i13 || Q9 == obj5) {
                        Q9 = new n20(context, 4);
                        yt214.o0(Q9);
                    }
                    b30.c(x834, j5, "+5359723665", false, (sr2) Q9, yt214, 432, 8);
                    x83 x835 = (x83) tb0.d.getValue();
                    long r2 = b30.r(uq3.d(4279178265L), uq3.d(4293389552L));
                    boolean i14 = yt214.i(context);
                    Object Q10 = yt214.Q();
                    if (i14 || Q10 == obj5) {
                        Q10 = new n20(context, 5);
                        yt214.o0(Q10);
                    }
                    b30.c(x835, r2, "@UtilEs_App", false, (sr2) Q10, yt214, 384, 8);
                    b30.j(0, yt214);
                    String u5 = l55.u(R.string.link_privacy_policy, yt214);
                    Object Q11 = yt214.Q();
                    if (Q11 == obj5) {
                        Q11 = new wi(aq4, 5);
                        yt214.o0(Q11);
                    }
                    b30.i(u5, (sr2) Q11, yt214, 48);
                    String u6 = l55.u(R.string.link_useful_tips, yt214);
                    Object Q12 = yt214.Q();
                    if (Q12 == obj5) {
                        Q12 = new wi(aq4, 6);
                        yt214.o0(Q12);
                    }
                    b30.i(u6, (sr2) Q12, yt214, 48);
                    String u7 = l55.u(R.string.link_credits, yt214);
                    Object Q13 = yt214.Q();
                    if (Q13 == obj5) {
                        Q13 = new wi(aq4, 7);
                        yt214.o0(Q13);
                    }
                    b30.i(u7, (sr2) Q13, yt214, 48);
                    String u8 = l55.u(R.string.link_all_ussd, yt214);
                    Object Q14 = yt214.Q();
                    if (Q14 == obj5) {
                        Q14 = new wi(aq4, 1);
                        yt214.o0(Q14);
                    }
                    b30.i(u8, (sr2) Q14, yt214, 48);
                    String u9 = l55.u(R.string.link_changelog, yt214);
                    Object Q15 = yt214.Q();
                    if (Q15 == obj5) {
                        Q15 = new wi(aq4, 2);
                        yt214.o0(Q15);
                    }
                    b30.i(u9, (sr2) Q15, yt214, 48);
                    String u10 = l55.u(R.string.link_report_feedback, yt214);
                    Object Q16 = yt214.Q();
                    if (Q16 == obj5) {
                        Q16 = new wi(aq4, 3);
                        yt214.o0(Q16);
                    }
                    b30.i(u10, (sr2) Q16, yt214, 48);
                    k75.a(yt214, yu6.d(jl4, 16.0f));
                    o96 a6 = q96.a(24.0f);
                    pa5 pa5 = yd0.a;
                    xd0 a7 = yd0.a(b30.r(uq3.d(4279658664L), uq3.d(4284131291L)), jt0.c, 0, 0, yt214, 12);
                    g80 g803 = g802;
                    ml4 d2 = yu6.d(new f23(g803), 44.0f);
                    Object Q17 = yt214.Q();
                    if (Q17 == obj5) {
                        Q17 = new wi(aq4, 4);
                        yt214.o0(Q17);
                    }
                    gw8.a((sr2) Q17, d2, false, a6, a7, (ce0) null, (ua0) null, (la5) null, bb0.b, yt214, 805306374, 484);
                    k75.a(yt214, yu6.d(jl4, 16.0f));
                    try {
                        obj4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (Throwable th) {
                        obj4 = new m66(th);
                    }
                    if (!(obj4 instanceof m66)) {
                        obj6 = obj4;
                    }
                    String str5 = (String) obj6;
                    if (str5 == null) {
                        str5 = "";
                    }
                    yf7.b(l55.v(R.string.copyright, new Object[]{str5}, yt214), new f23(g803), b30.n(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(16), 0, false, 0, 0, (tg7) null, yt214, 24576, 48, 260072);
                    k75.a(yt214, yu6.d(jl4, 8.0f));
                    yt214.r(true);
                    k75.a(yt214, yu6.d(jl4, 60.0f));
                } else {
                    yt214.Y();
                }
                return vs7;
            case 5:
                Throwable th2 = (Throwable) obj;
                l55.d((vr2) obj7, obj8, (e81) obj3);
                return vs7;
            case 6:
                fw0 fw02 = (fw0) obj8;
                gs2 gs2 = (gs2) obj7;
                yt2 yt215 = (yt2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (yt215.V(intValue6 & 1, z6)) {
                    pv8.f(fw02, gs2, yt215, 0);
                } else {
                    yt215.Y();
                }
                return vs7;
            case 7:
                vr2 vr25 = (vr2) obj7;
                x51 x51 = (x51) obj8;
                bu0 bu0 = (bu0) obj;
                yt2 yt216 = (yt2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (yt216.V(intValue7 & 1, z7)) {
                    Object Q18 = yt216.Q();
                    if (Q18 == obj5) {
                        Q18 = new y51();
                        yt216.o0(Q18);
                    }
                    y51 y51 = (y51) Q18;
                    y51.a.clear();
                    vr25.y(y51);
                    y51.a(x51, yt216, 0);
                } else {
                    yt216.Y();
                }
                return vs7;
            case 8:
                du4 du4 = (du4) obj8;
                cu4 cu4 = (cu4) obj7;
                yt2 yt217 = (yt2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (yt217.V(intValue8 & 1, z8)) {
                    du4.b.u(cu4, yt217, 0);
                } else {
                    yt217.Y();
                }
                return vs7;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                o03 o03 = (o03) obj8;
                vr2 vr26 = (vr2) obj7;
                yt2 yt218 = (yt2) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xk) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (yt218.V(intValue9 & 1, z9)) {
                    t13.r(o03, vr26, yt218, 0);
                } else {
                    yt218.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                List<ta2> list = (List) obj8;
                aq4 aq42 = (aq4) obj7;
                yt2 yt219 = (yt2) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xk) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (yt219.V(intValue10 & 1, z10)) {
                    au0 a8 = zt0.a(srVar, xb4.M, yt219, 48);
                    int hashCode7 = Long.hashCode(yt219.T);
                    vf5 m7 = yt219.m();
                    ml4 E7 = gw8.E(yt219, jl4);
                    ux0.d.getClass();
                    vy0 vy05 = tx0.b;
                    yt219.i0();
                    if (yt219.S) {
                        yt219.l(vy05);
                    } else {
                        yt219.r0();
                    }
                    g75.Q(tx0.f, yt219, a8);
                    g75.Q(tx0.e, yt219, m7);
                    g75.Q(tx0.g, yt219, Integer.valueOf(hashCode7));
                    g75.O(yt219, tx0.h);
                    g75.Q(tx0.d, yt219, E7);
                    yt219.e0(1163754329);
                    for (ta2 ta2 : list) {
                        boolean g3 = yt219.g(ta2);
                        Object Q19 = yt219.Q();
                        if (g3 || Q19 == obj5) {
                            Q19 = new f5(25, ta2, aq42);
                            yt219.o0(Q19);
                        }
                        ag8.e((sr2) Q19, (ml4) null, (pq6) null, z08.f(), z08.b(), (sh2) null, su0.J(21585242, new yg(12, ta2), yt219), yt219, 12582912);
                        k75.a(yt219, yu6.d(jl4, 6.0f));
                    }
                    yt219.r(false);
                    k75.a(yt219, yu6.d(jl4, 4.0f));
                    yt219.r(true);
                } else {
                    yt219.Y();
                }
                return vs7;
            case 12:
                String str6 = (String) obj8;
                fw0 fw03 = (fw0) obj7;
                yt2 yt220 = (yt2) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (yt220.V(intValue11 & 1, z11)) {
                    ml4 K2 = x91.K(jl4, 16.0f);
                    au0 a9 = zt0.a(srVar, xb4.K, yt220, 0);
                    int hashCode8 = Long.hashCode(yt220.T);
                    vf5 m8 = yt220.m();
                    ml4 E8 = gw8.E(yt220, K2);
                    ux0.d.getClass();
                    vy0 vy06 = tx0.b;
                    yt220.i0();
                    if (yt220.S) {
                        yt220.l(vy06);
                    } else {
                        yt220.r0();
                    }
                    g75.Q(tx0.f, yt220, a9);
                    g75.Q(tx0.e, yt220, m8);
                    g75.Q(tx0.g, yt220, Integer.valueOf(hashCode8));
                    g75.O(yt220, tx0.h);
                    g75.Q(tx0.d, yt220, E8);
                    long d3 = uq3.d(4279391610L);
                    long d4 = uq3.d(4281301934L);
                    if (d18.a()) {
                        d3 = za5.k(d4);
                    } else if (d18.b()) {
                        j = d4;
                        yt2 yt221 = yt220;
                        yf7.b(str6, (ml4) null, j, ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt221, 1597440, 0, 262058);
                        yt2 yt222 = yt221;
                        k75.a(yt222, yu6.d(jl4, 10.0f));
                        fw03.H(yt222, 0);
                        yt222.r(true);
                    }
                    j = d3;
                    yt2 yt2212 = yt220;
                    yf7.b(str6, (ml4) null, j, ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2212, 1597440, 0, 262058);
                    yt2 yt2222 = yt2212;
                    k75.a(yt2222, yu6.d(jl4, 10.0f));
                    fw03.H(yt2222, 0);
                    yt2222.r(true);
                } else {
                    yt220.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case h75.g /*15*/:
                return k(obj, obj2, obj3);
            case 16:
                return l(obj, obj2, obj3);
            case 17:
                return n(obj, obj2, obj3);
            case 18:
                return o(obj, obj2, obj3);
            case 19:
                return p(obj, obj2, obj3);
            case 20:
                return r(obj, obj2, obj3);
            case 21:
                return s(obj, obj2, obj3);
            case 22:
                Spannable spannable = (Spannable) obj8;
                ch chVar = (ch) obj7;
                yy6 yy6 = (yy6) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int intValue13 = ((Integer) obj3).intValue();
                ea7 ea7 = yy6.f;
                am2 am2 = yy6.c;
                if (am2 == null) {
                    am2 = am2.y;
                }
                yl2 yl2 = yy6.d;
                if (yl2 != null) {
                    i3 = yl2.a;
                }
                zl2 zl2 = yy6.e;
                if (zl2 != null) {
                    i = zl2.a;
                } else {
                    i = 65535;
                }
                dh dhVar = (dh) chVar.x;
                wq7 b = ((el2) dhVar.A).b(ea7, am2, i3, i);
                if (!(b instanceof wq7)) {
                    cf4 cf4 = new cf4(b, dhVar.F);
                    dhVar.F = cf4;
                    Object obj9 = cf4.z;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    Object obj10 = b.w;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new gl2(1, typeface), intValue12, intValue13, 33);
                return vs7;
            case 23:
                return t(obj, obj2, obj3);
            case 24:
                return v(obj, obj2, obj3);
            default:
                ne7 ne7 = (ne7) obj8;
                ap4 ap4 = (ap4) obj7;
                ml4 ml42 = (ml4) obj;
                yt2 yt223 = (yt2) obj2;
                ((Integer) obj3).getClass();
                yt223.e0(-102778667);
                Object Q20 = yt223.Q();
                if (Q20 == obj5) {
                    Q20 = t49.D(yt223);
                    yt223.o0(Q20);
                }
                o81 o81 = (o81) Q20;
                Object Q21 = yt223.Q();
                if (Q21 == obj5) {
                    Q21 = u55.p((Object) null);
                    yt223.o0(Q21);
                }
                aq4 aq43 = (aq4) Q21;
                aq4 v2 = u55.v(ne7, yt223);
                boolean g4 = yt223.g(ap4);
                Object Q22 = yt223.Q();
                if (g4 || Q22 == obj5) {
                    Q22 = new k77(3, (Object) aq43, (Object) ap4);
                    yt223.o0(Q22);
                }
                t49.e(ap4, (vr2) Q22, yt223);
                boolean i15 = yt223.i(o81) | yt223.g(ap4) | yt223.g(v2);
                Object Q23 = yt223.Q();
                if (i15 || Q23 == obj5) {
                    Q23 = new sr4(o81, aq43, ap4, v2);
                    yt223.o0(Q23);
                }
                ml4 a10 = d97.a(jl4, ap4, (PointerInputEventHandler) Q23);
                yt223.r(false);
                return a10;
        }
    }

    public /* synthetic */ gc5(vr2 vr2, Object obj, int i) {
        this.w = i;
        this.x = vr2;
        this.y = obj;
    }
}
