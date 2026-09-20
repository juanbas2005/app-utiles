package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto;
import cu.lestebang.utiletecsa.data.repository.account.RedeemCouponDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumCommentInsertDto;
import cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker;
import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: p0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(d37 d37, f61 f61, az7 az7, c23 c23) {
        super(2, f61);
        this.A = 27;
        this.C = d37;
        this.D = az7;
        this.E = c23;
    }

    private final Object A(Object obj) {
        yl1 yl1 = (yl1) this.E;
        ff8 ff8 = (ff8) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            fg0 fg0 = ff8.w;
            this.C = null;
            this.B = 1;
            obj = rc9.A((hf0) this.D, fg0, Long.MAX_VALUE, this);
            p81 p81 = p81.w;
            if (obj == p81) {
                return p81;
            }
        } else if (i == 1) {
            try {
                o85.q(obj);
            } catch (CancellationException e) {
                gl0.J(yl1, e);
                throw e;
            } catch (Throwable th) {
                gl0.J(yl1, rc9.b("Receive failed", th));
                throw th;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ((Number) obj).longValue();
        return vs7.a;
    }

    private final Object B(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            ArrayList arrayList = new ArrayList();
            di2 a = ((ef3) this.D).a();
            qc qcVar = new qc(arrayList, (o81) this.C, (vh2) this.E, 2);
            this.B = 1;
            Object a2 = a.a(qcVar, this);
            p81 p81 = p81.w;
            if (a2 == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r1.a(r9, r8) == r7) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (defpackage.ar7.e0(r2, r9, r8) == r7) goto L_0x004b;
     */
    private final Object G(Object obj) {
        np5 np5 = (np5) this.E;
        di2 di2 = (di2) this.D;
        e81 e81 = (e81) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            boolean e = sg3.e(e81, x32.w);
            p81 p81 = p81.w;
            if (e) {
                ii2 ii2 = new ii2(np5, 0);
                this.B = 1;
            } else {
                ji2 ji2 = new ji2(di2, np5, (f61) null, 0);
                this.B = 2;
            }
            return p81;
        } else if (i == 1 || i == 2) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    private final Object I(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            this.B = 1;
            Object b = ((ap4) this.C).b((df3) this.D, this);
            p81 p81 = p81.w;
            if (b == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mw1 mw1 = (mw1) this.E;
        if (mw1 != null) {
            mw1.b();
        }
        return vs7.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: np5} */
    /* JADX WARNING: Multi-variable type inference failed */
    private final Object L(Object obj) {
        np5 np5 = (np5) this.D;
        int i = this.B;
        vs7 vs7 = vs7.a;
        if (i == 0) {
            o85.q(obj);
            String str = (String) this.E;
            if (str == null) {
                return vs7;
            }
            dn1 dn1 = aw1.a;
            bn2 bn2 = new bn2(0, (f61) null, str);
            this.D = null;
            this.C = np5;
            this.B = 1;
            obj = ar7.e0(dn1, bn2, this);
            p81 p81 = p81.w;
            if (obj == p81) {
                return p81;
            }
        } else if (i == 1) {
            np5 = this.C;
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        np5.setValue(obj);
        return vs7;
    }

    private final Object M(Object obj) {
        Object obj2;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            lo2 lo2 = (lo2) this.C;
            j77 j77 = lo2.a;
            String str = (String) this.D;
            String str2 = (String) this.E;
            UserInfo j = rg3.t(j77).j();
            if (j == null) {
                throw new IllegalStateException("Debes iniciar sesión para comentar.");
            } else if (!d57.I0(str)) {
                hm5 i2 = f55.i(j77, "forum_comments");
                gm5 gm5 = i2.a;
                List D2 = sg3.D(new ForumCommentInsertDto(str2, j.getId(), lo2.c(lo2, j), d57.i1(200, d57.k1(str).toString())));
                t77 t77 = gm5.d;
                ol3 ol3 = pl3.d;
                gs3 gs3 = gs3.c;
                String t = ((f96) t77).t(b26.c(List.class, x91.C(b26.b(ForumCommentInsertDto.class))), D2);
                ol3.getClass();
                JsonArray<JsonElement> d = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
                yc3 yc3 = new yc3(i2.c, gm5.c.v);
                yc3.e = d;
                ArrayList arrayList = new ArrayList();
                for (JsonElement e : d) {
                    it0.h0(arrayList, em3.e(e).keySet());
                }
                List b1 = dt0.b1(dt0.f1(arrayList));
                if (!b1.isEmpty()) {
                    yc3.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
                }
                h66 h66 = h66.a;
                String str3 = i2.b;
                this.B = 1;
                Object a = h66.a(gm5, str3, yc3, this);
                p81 p81 = p81.w;
                if (a == p81) {
                    return p81;
                }
            } else {
                throw new IllegalStateException("El comentario no puede estar vacío");
            }
        } else if (i == 1) {
            try {
                o85.q(obj);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                obj2 = new m66(e3);
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = vs7.a;
        return new o66(obj2);
    }

    private final Object O(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        String str = (String) this.D;
        np2 np2 = (np2) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            sn2 sn2 = np2.b;
            this.B = 1;
            obj2 = ((lo2) sn2).l(str, (String) this.E, this);
            p81 p81 = p81.w;
            if (obj2 == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
            obj2 = ((o66) obj).w;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(obj2 instanceof m66)) {
            vs7 vs7 = (vs7) obj2;
            np2.h(new cb(str, 13));
            d37 d37 = np2.e;
            do {
                value2 = d37.getValue();
            } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
        }
        Throwable a = o66.a(obj2);
        if (a != null) {
            d37 d372 = np2.e;
            do {
                value = d372.getValue();
            } while (!d372.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) a), 1)));
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        if (r2 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        r2 = defpackage.rc9.b("Channel was consumed, consumer had failed", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        r4.o(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041 A[Catch:{ all -> 0x006e }] */
    private final Object P(Object obj) {
        ad0 ad0;
        wc0 wc0;
        ad0 ad02;
        ad0 ad03;
        p81 p81 = p81.w;
        int i = this.B;
        CancellationException cancellationException = null;
        if (i == 0) {
            o85.q(obj);
            ad0 ad04 = (ad0) this.E;
            ad03 = ad04;
            wc0 = new wc0(ad04);
            ad02 = ad04;
        } else if (i == 1) {
            wc0 = (wc0) this.D;
            en0 en0 = (en0) this.C;
            ad03 = en0;
            o85.q(obj);
            ad03 = en0;
            ad0 = en0;
            if (!((Boolean) obj).booleanValue()) {
                vs7 vs7 = (vs7) wc0.c();
                boolean z = false;
                fw2.b.set(false);
                synchronized (nx6.c) {
                    ad03 = ad0;
                    up4 up4 = nx6.j.h;
                    if (up4 != null && up4.h()) {
                        z = true;
                    }
                    ad03 = ad0;
                }
                if (z) {
                    nx6.a();
                    ad02 = ad0;
                }
            }
            ad0.o((CancellationException) null);
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this.C = ad02;
        this.D = wc0;
        this.B = 1;
        obj = wc0.a(this);
        ad0 = ad02;
        if (obj == p81) {
            return p81;
        }
        if (!((Boolean) obj).booleanValue()) {
            ad0.o((CancellationException) null);
        }
        ad0.o((CancellationException) null);
        return vs7.a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b6, code lost:
        if (r10 == r7) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cc, code lost:
        if (defpackage.t49.G(1000, r9) == r7) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d0, code lost:
        r9.C = r2;
        r9.B = 3;
        r10 = ((defpackage.c50) r0).f(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dc, code lost:
        if (r10 != r7) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        r10 = defpackage.o66.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        if (r10 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        r2.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        r9.C = r2;
        r9.B = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f2, code lost:
        if (defpackage.t49.G(1000, r9) != r7) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        r9.C = r2;
        r9.B = 5;
        r10 = ((defpackage.c50) r0).h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0102, code lost:
        if (r10 != r7) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        r10 = defpackage.o66.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010a, code lost:
        if (r10 == null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        r2.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        r9.C = r2;
        r9.B = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0118, code lost:
        if (defpackage.t49.G(1000, r9) != r7) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
        r9.C = r2;
        r9.B = 7;
        r10 = ((defpackage.c50) r0).g(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0127, code lost:
        if (r10 != r7) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012a, code lost:
        r10 = defpackage.o66.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        if (r10 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0130, code lost:
        r2.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0133, code lost:
        r9.C = r2;
        r9.B = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013d, code lost:
        if (defpackage.t49.G(1000, r9) != r7) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0140, code lost:
        r9.C = r2;
        r9.B = 9;
        r10 = ((defpackage.c50) r0).j(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014d, code lost:
        if (r10 != r7) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0150, code lost:
        r10 = defpackage.o66.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        if (r10 == null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0156, code lost:
        r2.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0159, code lost:
        r9.C = r2;
        r9.B = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0163, code lost:
        if (defpackage.t49.G(1000, r9) != r7) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0166, code lost:
        r9.C = r2;
        r9.B = 11;
        r10 = ((defpackage.c50) r0).m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0172, code lost:
        if (r10 != r7) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0174, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
        r10 = defpackage.o66.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        if (r10 == null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017b, code lost:
        r2.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017e, code lost:
        r10 = r2.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0182, code lost:
        r0 = r1.getValue();
        r5 = (defpackage.is7) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018d, code lost:
        if (r10 == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        r7 = new defpackage.hv2(25, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
        r7 = new defpackage.hv2(25, defpackage.dt0.w0(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a3, code lost:
        if (r1.i(r0, defpackage.is7.a(r5, (java.lang.Object) null, false, r7, 1)) == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a5, code lost:
        ((defpackage.qj) r9.E).y(java.lang.Boolean.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b2, code lost:
        return defpackage.vs7.a;
     */
    private final Object Q(Object obj) {
        List list;
        Object obj2;
        Object value;
        c23 c23 = (c23) this.D;
        d37 d37 = c23.j;
        k40 k40 = c23.c;
        int i = this.B;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                o85.q(obj);
                do {
                    value = d37.getValue();
                } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                list = new ArrayList();
                this.C = list;
                this.B = 1;
                obj2 = ((c50) k40).i(this);
                break;
            case 1:
                list = (List) this.C;
                o85.q(obj);
                obj2 = ((o66) obj).w;
                Throwable a = o66.a(obj2);
                if (a != null) {
                    list.add(a);
                }
                this.C = list;
                this.B = 2;
                break;
            case 2:
                list = (List) this.C;
                o85.q(obj);
                break;
            case 3:
                list = (List) this.C;
                o85.q(obj);
                Object obj3 = ((o66) obj).w;
                break;
            case 4:
                list = (List) this.C;
                o85.q(obj);
                break;
            case 5:
                list = (List) this.C;
                o85.q(obj);
                Object obj4 = ((o66) obj).w;
                break;
            case 6:
                list = (List) this.C;
                o85.q(obj);
                break;
            case 7:
                list = (List) this.C;
                o85.q(obj);
                Object obj5 = ((o66) obj).w;
                break;
            case 8:
                list = (List) this.C;
                o85.q(obj);
                break;
            case 9:
                list = (List) this.C;
                o85.q(obj);
                Object obj6 = ((o66) obj).w;
                break;
            case 10:
                list = (List) this.C;
                o85.q(obj);
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                o85.q(obj);
                Object obj7 = ((o66) obj).w;
                list = (List) this.C;
                break;
            default:
                h.s("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r13 == r12) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r13 == r12) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r13 == r12) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r13 == r12) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb A[LOOP:1: B:50:0x00eb->B:51:0x00fa, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd A[LOOP:2: B:52:0x00fd->B:53:0x0117, LOOP_START] */
    private final Object R(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object obj3;
        String str;
        Object value3;
        az7 az7 = (az7) this.D;
        d37 d37 = (d37) this.C;
        c23 c23 = (c23) this.E;
        k40 k40 = c23.c;
        int i = this.B;
        vs7 vs7 = vs7.a;
        if (i == 0) {
            o85.q(obj);
            do {
                value3 = d37.getValue();
            } while (!d37.i(value3, b81.h((Object) null, (is7) value3, (Object) null, true, 1)));
            o03 o03 = (o03) ((is7) d37.getValue()).a;
            int ordinal = az7.ordinal();
            p81 p81 = p81.w;
            if (ordinal == 7) {
                this.B = 1;
                obj3 = ((c50) k40).g(this);
            } else if (ordinal == 9) {
                this.B = 3;
                obj3 = ((c50) k40).j(this);
            } else if (ordinal == 11) {
                this.B = 2;
                obj3 = ((c50) k40).m(this);
            } else if (ordinal != 17) {
                c6 b = c23.b.b(az7);
                this.B = 5;
                obj = gr8.H(b, this);
                if (obj == p81) {
                }
            } else {
                this.B = 4;
                obj3 = ((c50) k40).e(this);
            }
            return p81;
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            o85.q(obj);
            obj3 = ((o66) obj).w;
            obj2 = obj3;
            if (obj2 instanceof m66) {
                do {
                    value2 = d37.getValue();
                } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
            } else {
                do {
                    value = d37.getValue();
                } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
            }
            return vs7;
        } else if (i == 5) {
            try {
                o85.q(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vy7 vy7 = (vy7) obj;
        if (vy7 == null || (str = vy7.c) == null) {
            String str2 = az7.w;
            throw new IllegalStateException(("No USSD code for " + str2).toString());
        }
        rg5 rg5 = c23.g;
        Context context = c23.h;
        int i2 = c23.q;
        rg5.getClass();
        rg5.b(context, str, i2);
        obj2 = vs7;
        if (obj2 instanceof m66) {
        }
        return vs7;
    }

    private final Object S(Object obj) {
        Object obj2;
        Long l;
        y53 y53 = (y53) this.D;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            long longValue = ((Long) this.C).longValue();
            this.B = 1;
            Object G = t49.G(longValue, this);
            p81 p81 = p81.w;
            if (G == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y53.getClass();
        yr7 yr7 = y53.a;
        String c = yr7.c();
        Map map = (Map) y53.f.d(u43.a);
        if (map != null) {
            obj2 = map.get(x63.a);
        } else {
            obj2 = null;
        }
        y63 y63 = (y63) obj2;
        if (y63 != null) {
            l = y63.a;
        } else {
            l = null;
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(c, l, (Throwable) null);
        cc4 cc4 = a73.a;
        cc4.getClass();
        if (cc4.e()) {
            cc4.h("Request timeout: " + yr7);
        }
        String message = httpRequestTimeoutException.getMessage();
        message.getClass();
        ((el3) this.E).o(rc9.b(message, httpRequestTimeoutException));
        return vs7.a;
    }

    private final Object v(Object obj) {
        jf1 jf1 = (jf1) this.D;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            o81 o81 = (o81) this.C;
            xu0 b = ag8.b();
            y27 w = jf1.h.w();
            if (w instanceof de1) {
                w = new y27(((de1) w).a);
            }
            vj4 vj4 = new vj4((gs2) this.E, b, w, o81.k());
            am6 am6 = jf1.l;
            Object c = ((ad0) am6.z).c(vj4);
            if (c instanceof pn0) {
                Throwable th = ((pn0) c).a;
                if (th == null) {
                    th = new IllegalStateException("Channel was closed normally");
                }
                throw th;
            } else if (!(c instanceof qn0)) {
                if (((AtomicInteger) ((wv2) am6.A).x).getAndIncrement() == 0) {
                    ar7.H((o81) am6.x, (e81) null, (r81) null, new k05((Object) am6, (f61) null, 18), 3);
                }
                this.B = 1;
                Object h = b.h(this);
                p81 p81 = p81.w;
                if (h == p81) {
                    return p81;
                }
                return h;
            } else {
                h.s("Check failed.");
                return null;
            }
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    private final Object x(Object obj) {
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            hn1 hn1 = (hn1) this.C;
            mq4 mq4 = hn1.c;
            gn1 gn1 = hn1.b;
            p0 p0Var = new p0((Object) hn1, (Object) (gs2) this.E, (f61) null, 16);
            this.B = 1;
            mq4.getClass();
            Object L = gl0.L(new lq4((hq4) this.D, mq4, p0Var, gn1, (f61) null), this);
            p81 p81 = p81.w;
            if (L == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }

    private final Object z(Object obj) {
        ed5 ed5 = ((hn1) this.D).d;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            eh6 eh6 = (eh6) this.C;
            ed5.setValue(Boolean.TRUE);
            this.B = 1;
            Object H = ((gs2) this.E).H(eh6, this);
            p81 p81 = p81.w;
            if (H == p81) {
                return p81;
            }
        } else if (i == 1) {
            try {
                o85.q(obj);
            } catch (Throwable th) {
                ed5.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ed5.setValue(Boolean.FALSE);
        return vs7.a;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((p0) o((f61) obj2, (ll1) obj)).s(vs7);
            case 6:
                return ((p0) o((f61) obj2, (yb5) obj)).s(vs7);
            case 7:
                return ((p0) o((f61) obj2, (np5) obj)).s(vs7);
            case 8:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((p0) o((f61) obj2, (UserSession) obj)).s(vs7);
            case 10:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((p0) o((f61) obj2, (fi2) obj)).s(vs7);
            case h75.g:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                return ((p0) o((f61) obj2, (eh6) obj)).s(vs7);
            case 17:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((p0) o((f61) obj2, (ff8) obj)).s(vs7);
            case 19:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                return ((p0) o((f61) obj2, (np5) obj)).s(vs7);
            case 23:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 25:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 27:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((p0) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new p0((ap4) this.C, (do5) this.D, (mw1) this.E, f61, 0);
            case 1:
                return new p0((Object) (String) this.D, (Object) (p7) this.E, f61, 1);
            case 2:
                p0 p0Var = new p0((Object) (p7) this.E, f61, 2);
                p0Var.D = obj;
                return p0Var;
            case 3:
                return new p0((gs2) this.C, this.D, (o81) this.E, f61, 3);
            case 4:
                p0 p0Var2 = new p0((Object) (sr2) this.D, (Object) (gs2) this.E, f61, 4);
                p0Var2.C = obj;
                return p0Var2;
            case 5:
                p0 p0Var3 = new p0((Object) (hs2) this.D, (Object) (bd) this.E, f61, 5);
                p0Var3.C = obj;
                return p0Var3;
            case 6:
                p0 p0Var4 = new p0((Object) (is2) this.D, (Object) (bd) this.E, f61, 6);
                p0Var4.C = obj;
                return p0Var4;
            case 7:
                p0 p0Var5 = new p0((Object) (mm7) this.D, (Object) (aq4) this.E, f61, 7);
                p0Var5.C = obj;
                return p0Var5;
            case 8:
                p0 p0Var6 = new p0((Object) (AppUpdateWorker) this.E, f61, 8);
                p0Var6.D = obj;
                return p0Var6;
            case 9:
                p0 p0Var7 = new p0((Object) (a) this.D, (Object) (fl1) this.E, f61, 9);
                p0Var7.C = obj;
                return p0Var7;
            case 10:
                return new p0((Object) (d37) this.D, (Object) (ek7) this.E, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new p0((sk2) this.C, (aq4) this.D, (ek7) this.E, f61, 11);
            case 12:
                return new p0((cc0) this.C, (xz4) this.D, (ae) this.E, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                p0 p0Var8 = new p0((Object) (fi2) this.D, (Object) (gn0) this.E, f61, 13);
                p0Var8.C = obj;
                return p0Var8;
            case 14:
                p0 p0Var9 = new p0((Object) (jf1) this.E, f61, 14);
                p0Var9.D = obj;
                return p0Var9;
            case h75.g:
                p0 p0Var10 = new p0((Object) (jf1) this.D, (Object) (gs2) this.E, f61, 15);
                p0Var10.C = obj;
                return p0Var10;
            case 16:
                p0 p0Var11 = new p0((Object) (hn1) this.D, (Object) (gs2) this.E, f61, 16);
                p0Var11.C = obj;
                return p0Var11;
            case 17:
                return new p0((hn1) this.C, (hq4) this.D, (gs2) this.E, f61, 17);
            case 18:
                p0 p0Var12 = new p0(this.D, (Object) (yl1) this.E, f61, 18);
                p0Var12.C = obj;
                return p0Var12;
            case 19:
                p0 p0Var13 = new p0((Object) (ef3) this.D, (Object) (vh2) this.E, f61, 19);
                p0Var13.C = obj;
                return p0Var13;
            case 20:
                return new p0((e81) this.C, (di2) this.D, (np5) this.E, f61, 20);
            case 21:
                return new p0((ap4) this.C, (df3) this.D, (mw1) this.E, f61, 21);
            case 22:
                p0 p0Var14 = new p0((Object) (String) this.E, f61, 22);
                p0Var14.D = obj;
                return p0Var14;
            case 23:
                return new p0((lo2) this.C, (String) this.D, (String) this.E, f61, 23);
            case 24:
                return new p0((np2) this.C, (String) this.D, (String) this.E, f61, 24);
            case 25:
                return new p0((Object) (ad0) this.E, f61, 25);
            case 26:
                return new p0((Object) (c23) this.D, (Object) (qj) this.E, f61, 26);
            case 27:
                return new p0((d37) this.C, f61, (az7) this.D, (c23) this.E);
            case 28:
                return new p0((Long) this.C, (y53) this.D, (el3) this.E, f61, 28);
            default:
                return new p0((d37) this.C, f61, (rh3) this.D);
        }
    }

    /* JADX WARNING: type inference failed for: r7v39, types: [m66] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:304|(1:(2:307|(6:309|310|311|312|326|453)(2:313|454))(3:314|315|316))(4:317|318|319|(1:455))|321|322|(1:456)|326|453) */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f5, code lost:
        if (r0 == r8) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038d, code lost:
        if (r12.c(r1, r6) == r8) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b7, code lost:
        if (defpackage.gr8.A(r11, r1, r6) == r8) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015c, code lost:
        if (r7 == r8) goto L_0x01c3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:321:0x07a0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c5  */
    public final Object s(Object obj) {
        Object obj2;
        p7 p7Var;
        Object obj3;
        Object obj4;
        p7 p7Var2;
        zq zqVar;
        Object obj5;
        String str;
        zq zqVar2;
        Object r84;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        fi2 fi2;
        y27 y27;
        Object obj10;
        fi2 fi22;
        Object value;
        nh3 nh3;
        Object value2;
        Object value3;
        int i = this.A;
        hq4 hq4 = hq4.y;
        Object obj11 = vs7.a;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((ap4) this.C).b((do5) this.D, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mw1 mw1 = (mw1) this.E;
                if (mw1 == null) {
                    return obj11;
                }
                mw1.b();
                return obj11;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    String str2 = (String) this.D;
                    p7Var = (p7) this.E;
                    if (!d57.I0(str2)) {
                        gm5 n = f55.n(p7Var.a);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        JsonPrimitive b = em3.b(d57.k1(str2).toString());
                        b.getClass();
                        JsonElement jsonElement = (JsonElement) linkedHashMap.put("p_code", b);
                        JsonObject jsonObject = new JsonObject(linkedHashMap);
                        this.C = p7Var;
                        this.B = 1;
                        bm5 bm5 = n.c;
                        mp1 mp1 = new mp1(bm5.u, bm5.v, 1);
                        ia6[] ia6Arr = ia6.w;
                        mp1.e(i53.c);
                        mp1.e = jsonObject;
                        obj3 = h66.a.a(n, "rpc/".concat("redeem_discount_code"), mp1, this);
                        if (obj3 == p81) {
                            return p81;
                        }
                    } else {
                        throw new IllegalStateException("Escribe el código del cupón.");
                    }
                } else if (i3 == 1) {
                    p7 p7Var3 = (p7) this.C;
                    o85.q(obj);
                    p7Var = p7Var3;
                    obj3 = obj;
                } else if (i3 == 2) {
                    f61 f61 = (f61) ((p7) this.C);
                    try {
                        o85.q(obj);
                        obj2 = obj;
                        obj11 = obj2;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj11 = new m66(e2);
                    }
                    return new o66(obj11);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj3;
                RedeemCouponDto redeemCouponDto = (RedeemCouponDto) ((f96) jm5.b.d).s(b26.b(RedeemCouponDto.class), jm5.a);
                if (!redeemCouponDto.getOk()) {
                    String error = redeemCouponDto.getError();
                    if (error == null) {
                        error = "Cupón no válido o vencido.";
                    }
                    throw new IllegalStateException(error.toString());
                }
                if (redeemCouponDto.getPricing() != null) {
                    LicensePricingDto pricing = redeemCouponDto.getPricing();
                    this.C = null;
                    this.B = 2;
                    obj2 = ((dy7) p7Var.c).i(pricing.getTransferAmount(), pricing.getSaldoAmount(), pricing.getDiscountPercent(), pricing.getDiscountSource(), pricing.getCouponCode(), this);
                    if (obj2 == p81) {
                        return p81;
                    }
                    obj11 = obj2;
                }
                return new o66(obj11);
            case 2:
                o81 o81 = (o81) this.D;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    p7Var2 = (p7) this.E;
                    uu t = rg3.t(p7Var2.a);
                    this.D = null;
                    this.C = p7Var2;
                    this.B = 1;
                    if (((a) t).v(kt6.w, this) == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    p7Var2 = (p7) this.C;
                    o85.q(obj);
                } else if (i4 == 2) {
                    f61 f612 = (f61) ((p7) this.C);
                    try {
                        o85.q(obj);
                        obj4 = obj;
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        obj4 = new m66(e4);
                    }
                    return new o66(obj4);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv7 dv7 = p7Var2.c;
                this.D = null;
                this.C = null;
                this.B = 2;
                obj4 = ((dy7) dv7).b(this);
                if (obj4 == p81) {
                    return p81;
                }
                return new o66(obj4);
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    Object obj12 = this.D;
                    this.B = 1;
                    if (((gs2) this.C).H(obj12, this) == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gl0.J((o81) this.E, new AnchoredDragFinishedSignal());
                return obj11;
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    Object obj13 = new Object();
                    ze1 w = u55.w((sr2) this.D);
                    qc qcVar = new qc(obj13, (o81) this.C, (gs2) this.E, 0);
                    this.B = 1;
                    if (w.a(qcVar, this) == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    hs2 hs2 = (hs2) this.D;
                    ad adVar = ((bd) this.E).n;
                    this.B = 1;
                    if (hs2.u(adVar, (ll1) this.C, this) == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 6:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    yb5 yb5 = (yb5) this.C;
                    Object obj14 = yb5.x;
                    is2 is2 = (is2) this.D;
                    ad adVar2 = ((bd) this.E).n;
                    this.B = 1;
                    if (is2.C(adVar2, (ll1) yb5.w, obj14, this) == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 7:
                mm7 mm7 = (mm7) this.D;
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    ze1 w2 = u55.w(new kh(2, mm7));
                    qc qcVar2 = new qc((np5) this.C, mm7, (aq4) this.E, 1);
                    this.B = 1;
                    if (w2.a(qcVar2, this) == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i9 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 8:
                AppUpdateWorker appUpdateWorker = (AppUpdateWorker) this.E;
                dv7 dv72 = appUpdateWorker.i;
                Context context = appUpdateWorker.g;
                o81 o812 = (o81) this.D;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    try {
                        zqVar2 = AppUpdateWorker.f(appUpdateWorker);
                    } catch (Throwable th) {
                        zqVar2 = new m66(th);
                    }
                    if (o66.a(zqVar2) == null) {
                        zqVar = zqVar2;
                        try {
                            obj6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        } catch (Throwable th2) {
                            obj6 = new m66(th2);
                        }
                        if (obj6 instanceof m66) {
                            obj6 = null;
                        }
                        String str3 = (String) obj6;
                        if (str3 == null) {
                            return new r84();
                        }
                        List W0 = d57.W0(zqVar.a, new String[]{"."}, 6);
                        ArrayList arrayList = new ArrayList(et0.e0(W0, 10));
                        Iterator it = W0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Integer v0 = k57.v0(d57.k1((String) it.next()).toString());
                                if (v0 != null) {
                                    arrayList.add(v0);
                                }
                            } else {
                                List W02 = d57.W0(d57.g1(str3, "-"), new String[]{"."}, 6);
                                ArrayList arrayList2 = new ArrayList(et0.e0(W02, 10));
                                Iterator it2 = W02.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Integer v02 = k57.v0(d57.k1((String) it2.next()).toString());
                                        if (v02 != null) {
                                            arrayList2.add(v02);
                                        }
                                    } else if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                                        int max = Math.max(arrayList.size(), arrayList2.size());
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < max) {
                                                if (i11 < 0 || i11 >= arrayList.size()) {
                                                    obj7 = 0;
                                                } else {
                                                    obj7 = arrayList.get(i11);
                                                }
                                                int intValue = ((Number) obj7).intValue();
                                                if (i11 < 0 || i11 >= arrayList2.size()) {
                                                    obj8 = 0;
                                                } else {
                                                    obj8 = arrayList2.get(i11);
                                                }
                                                int intValue2 = ((Number) obj8).intValue();
                                                if (intValue == intValue2) {
                                                    i11++;
                                                } else if (intValue > intValue2) {
                                                    dy7 dy7 = (dy7) dv72;
                                                    di2 L = gr8.L(new c6(dy7.a.b(), 15), dy7.b);
                                                    this.D = null;
                                                    this.C = zqVar;
                                                    this.B = 1;
                                                    obj5 = gr8.H(L, this);
                                                    if (obj5 == p81) {
                                                        return p81;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return new r84();
                    }
                    yh7.a.getClass();
                    hr2.A(new Object[0]);
                    if (appUpdateWorker.b.c < 3) {
                        r84 = new Object();
                    } else {
                        r84 = new r84();
                    }
                    return r84;
                } else if (i10 == 1) {
                    o85.q(obj);
                    zqVar = (zq) this.C;
                    obj5 = obj;
                } else if (i10 == 2) {
                    o85.q(obj);
                    return new r84();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = zqVar.a;
                String str5 = zqVar.b;
                if (sg3.e(str4, (String) obj5)) {
                    return new r84();
                }
                if (!new l15(context).a.areNotificationsEnabled()) {
                    yh7.a.getClass();
                    hr2.z(str4);
                    return new r84();
                }
                sg3.p(context, "AppUpdateChannel", R.string.app_update_channel_name, R.string.app_update_channel_description, 3);
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://apputiles.com/")).addFlags(268435456), 201326592);
                activity.getClass();
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, new Intent("cu.lestebang.utiletecsa.sync.action.DOWNLOAD_APK").setPackage(context.getPackageName()), 201326592);
                if (str5.length() > 0) {
                    str = context.getString(R.string.app_update_content_with_size, new Object[]{str4, str5});
                } else {
                    str = context.getString(R.string.app_update_content, new Object[]{str4});
                }
                str.getClass();
                d15 d15 = new d15(context, "AppUpdateChannel");
                d15.y.icon = context.getApplicationInfo().icon;
                d15.e = d15.b(context.getString(R.string.app_update_notification_title));
                d15.f = d15.b(str);
                d15.k = 0;
                d15.c(8, true);
                d15.c(16, true);
                d15.g = activity;
                z05 z05 = new z05(0, context.getString(R.string.app_update_action_visit), activity);
                ArrayList arrayList3 = d15.b;
                arrayList3.add(z05);
                arrayList3.add(new z05(0, context.getString(R.string.app_update_action_download), broadcast));
                Notification a = d15.a();
                a.getClass();
                sg3.W(context, 202610, a);
                this.D = null;
                this.C = null;
                this.B = 2;
                if (((dy7) dv72).l(str4, this) == p81) {
                    return p81;
                }
                return new r84();
            case 9:
                UserSession userSession = (UserSession) this.C;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    dn6 dn6 = new dn6((fl1) this.E);
                    this.C = null;
                    this.B = 1;
                    if (uu.c((a) this.D, userSession, dn6, this) == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i12 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 10:
                d37 d37 = (d37) this.D;
                ek7 ek7 = (ek7) this.E;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 == 1) {
                        try {
                            o85.q(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            if (ek7.b()) {
                                h70 h70 = new h70(ek7, (f61) null, 0);
                                this.C = th;
                                this.B = 3;
                                break;
                            }
                        }
                    } else if (i13 == 2) {
                        o85.q(obj);
                        return obj11;
                    } else if (i13 != 3) {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    } else {
                        th = (Throwable) this.C;
                        o85.q(obj);
                        throw th;
                    }
                } else {
                    o85.q(obj);
                    Boolean bool = Boolean.TRUE;
                    d37.getClass();
                    d37.l((Object) null, bool);
                    this.B = 1;
                    break;
                }
                if (!ek7.b()) {
                    return obj11;
                }
                h70 h702 = new h70(ek7, (f61) null, 0);
                this.B = 2;
                if (gr8.A(d37, h702, this) != p81) {
                    return obj11;
                }
                return p81;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                sk2 sk2 = (sk2) this.C;
                ek7 ek72 = (ek7) this.E;
                aq4 aq4 = (aq4) this.D;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    if (sk2.a()) {
                        aq4.setValue(Boolean.TRUE);
                        this.B = 1;
                        if (ek72.c(hq4, this) == p81) {
                            return p81;
                        }
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) aq4.getValue()).booleanValue() || !ek72.b() || sk2.a()) {
                    return obj11;
                }
                aq4.setValue(Boolean.FALSE);
                ek72.a();
                return obj11;
            case 12:
                cc0 cc0 = (cc0) this.C;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    s41 s41 = cc0.K;
                    ac0 ac0 = new ac0(cc0, (xz4) this.D, (ae) this.E);
                    this.B = 1;
                    s41.getClass();
                    ly5 ly5 = (ly5) ac0.b();
                    if (ly5 != null && !s41.X0(s41, ly5, 0, 0, 3)) {
                        kk0 kk0 = new kk0(1, rc9.a0(this));
                        kk0.v();
                        q41 q41 = new q41(ac0, kk0);
                        f96 f96 = s41.P;
                        eq4 eq4 = (eq4) f96.x;
                        ly5 ly52 = (ly5) ac0.b();
                        if (ly52 == null) {
                            kk0.f(obj11);
                        } else {
                            kk0.x(new m0(12, f96, q41));
                            re3 V = z65.V(0, eq4.y);
                            int i16 = V.w;
                            int i17 = V.x;
                            if (i16 <= i17) {
                                while (true) {
                                    ly5 ly53 = (ly5) ((q41) eq4.w[i17]).a.b();
                                    if (ly53 != null) {
                                        ly5 e5 = ly52.e(ly53);
                                        if (e5.equals(ly52)) {
                                            eq4.a(i17 + 1, q41);
                                        } else if (!e5.equals(ly53)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i18 = eq4.y - 1;
                                            if (i18 <= i17) {
                                                while (true) {
                                                    ((q41) eq4.w[i17]).b.a(cancellationException);
                                                    if (i18 != i17) {
                                                        i18++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i17 != i16) {
                                        i17--;
                                    }
                                }
                                if (!s41.S) {
                                    s41.Y0(0);
                                }
                            }
                            eq4.a(0, q41);
                            if (!s41.S) {
                            }
                        }
                        obj9 = kk0.t();
                        break;
                    }
                    obj9 = obj11;
                    if (obj9 == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i15 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                o81 o813 = (o81) this.C;
                int i19 = this.B;
                if (i19 == 0) {
                    o85.q(obj);
                    en0 h = ((gn0) this.E).h(o813);
                    this.C = null;
                    this.B = 1;
                    Object o = tf4.o((fi2) this.D, h, true, this);
                    if (o != p81) {
                        o = obj11;
                    }
                    if (o == p81) {
                        return p81;
                    }
                    return obj11;
                } else if (i19 == 1) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 14:
                jf1 jf1 = (jf1) this.E;
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    fi22 = (fi2) this.D;
                    this.D = fi22;
                    this.B = 1;
                    obj10 = ar7.e0(jf1.c.k(), new we1(jf1, (f61) null, 2), this);
                    break;
                } else if (i20 == 1) {
                    fi22 = (fi2) this.D;
                    o85.q(obj);
                    obj10 = obj;
                    y27 y272 = (y27) obj10;
                    if (y272 instanceof de1) {
                        de1 de1 = (de1) y272;
                        Object obj15 = de1.b;
                        this.D = fi22;
                        this.C = de1;
                        this.B = 2;
                        if (fi22.k(obj15, this) != p81) {
                            y27 y273 = y272;
                            fi2 = fi22;
                            y27 = y273;
                            oi2 oi2 = new oi2(new ze1(0, new qi2(new o40(2, new qi2(new we1(jf1, (f61) null, 0), (d37) jf1.h.x), new da0(2, (f61) null, 1)), new tc1(y27, (f61) null, 1), 1)), new xe1(jf1, (f61) null), 0);
                            this.D = null;
                            this.C = null;
                            this.B = 3;
                            if (fi2 instanceof th7) {
                            }
                        }
                        return p81;
                    } else if (y272 instanceof ks7) {
                        h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else if (y272 instanceof lw5) {
                        throw ((lw5) y272).b;
                    } else if (y272 instanceof be2) {
                        return obj11;
                    } else {
                        if (y272 instanceof qz4) {
                            h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            h.c();
                        }
                    }
                } else if (i20 == 2) {
                    y27 = (de1) this.C;
                    fi2 = (fi2) this.D;
                    o85.q(obj);
                    oi2 oi22 = new oi2(new ze1(0, new qi2(new o40(2, new qi2(new we1(jf1, (f61) null, 0), (d37) jf1.h.x), new da0(2, (f61) null, 1)), new tc1(y27, (f61) null, 1), 1)), new xe1(jf1, (f61) null), 0);
                    this.D = null;
                    this.C = null;
                    this.B = 3;
                    if (fi2 instanceof th7) {
                        Object a2 = oi22.a(fi2, this);
                        if (a2 != p81) {
                            a2 = obj11;
                        }
                        if (a2 != p81) {
                            return obj11;
                        }
                        return p81;
                    }
                    throw ((th7) fi2).w;
                } else if (i20 == 3) {
                    o85.q(obj);
                    return obj11;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case h75.g:
                return v(obj);
            case 16:
                return z(obj);
            case 17:
                return x(obj);
            case 18:
                return A(obj);
            case 19:
                return B(obj);
            case 20:
                return G(obj);
            case 21:
                return I(obj);
            case 22:
                return L(obj);
            case 23:
                return M(obj);
            case 24:
                return O(obj);
            case 25:
                return P(obj);
            case 26:
                return Q(obj);
            case 27:
                return R(obj);
            case 28:
                return S(obj);
            default:
                d37 d372 = (d37) this.C;
                int i21 = this.B;
                if (i21 == 0) {
                    o85.q(obj);
                    do {
                        value = d372.getValue();
                    } while (!d372.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                    nh3 = (nh3) ((is7) d372.getValue()).a;
                    String str6 = nh3.a;
                    String obj16 = d57.k1(nh3.b).toString();
                    double d = nh3.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    gk3 gk3 = new gk3(str6, obj16, d, currentTimeMillis, 0, true, rc9.q(currentTimeMillis));
                    i03 i03 = ((rh3) this.D).b;
                    this.E = nh3;
                    this.B = 1;
                    if (((n03) i03).a(gk3, this) == p81) {
                        return p81;
                    }
                } else if (i21 == 1) {
                    nh3 = (nh3) this.E;
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nh3 a3 = nh3.a(nh3, (String) null, (String) null, 0.0d, new hv2(25, (Object) Boolean.TRUE), 7);
                if (a3 != null) {
                    do {
                        value3 = d372.getValue();
                    } while (!d372.i(value3, is7.a((is7) value3, a3, false, (hv2) null, 4)));
                    return obj11;
                }
                do {
                    value2 = d372.getValue();
                } while (!d372.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                return obj11;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(d37 d37, f61 f61, rh3 rh3) {
        super(2, f61);
        this.A = 29;
        this.C = d37;
        this.D = rh3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }
}
