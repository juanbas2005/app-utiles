package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.InputEvent;
import cu.lestebang.utiletecsa.data.repository.account.EmailNotVerifiedException;
import cu.lestebang.utiletecsa.widget.ResumenWidgetProvider;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;

/* renamed from: ii3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ii3 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public /* synthetic */ Object D;
    public Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii3(int i, Set set, q26 q26, aq4 aq4, f61 f61) {
        super(2, f61);
        this.A = 17;
        this.B = i;
        this.C = set;
        this.D = q26;
        this.E = aq4;
    }

    private final Object A(Object obj) {
        Object obj2;
        e17 e17;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        d37 d37 = (d37) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            do {
                value4 = d37.getValue();
            } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
            e17 e172 = (e17) ((is7) d37.getValue()).a;
            d17 d17 = ((t17) this.D).b;
            this.E = e172;
            this.B = 1;
            Object e = d17.e(this);
            p81 p81 = p81.w;
            if (e == p81) {
                return p81;
            }
            e17 = e172;
            obj2 = e;
        } else if (i == 1) {
            o85.q(obj);
            obj2 = ((o66) obj).w;
            e17 = (e17) this.E;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(obj2 instanceof m66)) {
            obj2 = e17.a(e17, (List) obj2, (r11) null, (String) null, (String) null, false, (hv2) null, 62);
        }
        boolean z = obj2 instanceof m66;
        if (!z) {
            if (z) {
                obj2 = null;
            }
            if (obj2 != null) {
                do {
                    value3 = d37.getValue();
                } while (!d37.i(value3, is7.a((is7) value3, obj2, false, (hv2) null, 4)));
            } else {
                do {
                    value2 = d37.getValue();
                } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
            }
        } else {
            do {
                value = d37.getValue();
            } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
        }
        return vs7.a;
    }

    private final Object B(Object obj) {
        int i = this.B;
        vs7 vs7 = vs7.a;
        if (i == 0) {
            o85.q(obj);
            pe7 pe7 = (pe7) this.C;
            long j = ((qk5) this.E).c;
            this.B = 1;
            pe7 pe72 = new pe7(pe7.D, pe7.E, pe7.F, this);
            pe72.B = (co5) this.D;
            pe72.C = j;
            Object s = pe72.s(vs7);
            p81 p81 = p81.w;
            if (s == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7;
    }

    private final Object v(Object obj) {
        Object value;
        Object k;
        Object value2;
        Object value3;
        d37 d37 = (d37) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            do {
                value = d37.getValue();
            } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
            zn6 zn6 = (zn6) ((is7) d37.getValue()).a;
            this.B = 1;
            k = ((fq6) this.D).b.k((ae1) this.E, this);
            p81 p81 = p81.w;
            if (k == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
            k = ((o66) obj).w;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Object obj2 = k;
        if (!(obj2 instanceof m66)) {
            do {
                value3 = d37.getValue();
            } while (!d37.i(value3, is7.a((is7) value3, (Object) null, false, (hv2) null, 5)));
        } else {
            do {
                value2 = d37.getValue();
            } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
        }
        return vs7.a;
    }

    private final Object x(Object obj) {
        Object value;
        Object y;
        Object value2;
        Object value3;
        d37 d37 = (d37) this.C;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            do {
                value = d37.getValue();
            } while (!d37.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
            zn6 zn6 = (zn6) ((is7) d37.getValue()).a;
            this.B = 1;
            y = ((fq6) this.D).b.y((jy7) this.E, this);
            p81 p81 = p81.w;
            if (y == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
            y = ((o66) obj).w;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Object obj2 = y;
        if (!(obj2 instanceof m66)) {
            do {
                value3 = d37.getValue();
            } while (!d37.i(value3, is7.a((is7) value3, (Object) null, false, (hv2) null, 5)));
        } else {
            do {
                value2 = d37.getValue();
            } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r0.a(r1, r7) == r6) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (defpackage.ar7.e0(r1, r2, r7) == r6) goto L_0x004a;
     */
    private final Object z(Object obj) {
        di2 di2 = (di2) this.E;
        e81 e81 = (e81) this.D;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            np5 np5 = (np5) this.C;
            boolean e = sg3.e(e81, x32.w);
            p81 p81 = p81.w;
            if (e) {
                ii2 ii2 = new ii2(np5, 2);
                this.B = 1;
            } else {
                ji2 ji2 = new ji2(di2, np5, (f61) null, 1);
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

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((ii3) o((f61) obj2, (op5) obj)).s(vs7);
            case 5:
                return ((ii3) o((f61) obj2, (ff8) obj)).s(vs7);
            case 6:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((ii3) o((f61) obj2, (op5) obj)).s(vs7);
            case 10:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 18:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 19:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((ii3) o((f61) obj2, (xh6) obj)).s(vs7);
            case 22:
                return ((ii3) o((f61) obj2, (eh6) obj)).s(vs7);
            case 23:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 25:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((ii3) o((f61) obj2, (np5) obj)).s(vs7);
            case 27:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((ii3) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new ii3((Object) (ji3) this.C, (Object) (in5) this.D, (Object) (Long) this.E, f61, 0);
            case 1:
                return new ii3((Object) (qw6) this.C, (Object) (String) this.D, (Object) (aq4) this.E, f61, 1);
            case 2:
                ii3 ii3 = new ii3((Object) (gs2) this.D, (Object) (yi0) this.E, f61, 2);
                ii3.C = obj;
                return ii3;
            case 3:
                return new ii3((Object) (uh4) this.C, (Object) (Uri) this.D, (Object) (InputEvent) this.E, f61, 3);
            case 4:
                ii3 ii32 = new ii3((File) this.E, f61);
                ii32.D = obj;
                return ii32;
            case 5:
                ii3 ii33 = new ii3((Object) (cg0) this.D, (Object) (y81) this.E, f61, 5);
                ii33.C = obj;
                return ii33;
            case 6:
                return new ii3((Object) (gs4) this.C, (Object) (String) this.D, (Object) (String) this.E, f61, 6);
            case 7:
                return new ii3((Object) (mm7) this.C, (Object) (ay6) this.D, (Object) (gp4) this.E, f61, 7);
            case 8:
                return new ii3((Object) (oi6) this.C, (Object) (aq4) this.D, (Object) (ad5) this.E, f61, 8);
            case 9:
                ii3 ii34 = new ii3((Object) (j31) this.D, (Object) (oy4) this.E, f61, 9);
                ii34.C = obj;
                return ii34;
            case 10:
                return new ii3((d37) this.C, f61, (r58) (ic5) this.D, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ii3((Object) (h06) this.D, (Object) (cl5) this.E, f61, 11);
            case 12:
                return new ii3((d37) this.C, f61, (r58) (lq5) this.D, (Object) (String) this.E, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new ii3((d37) this.C, f61, (r58) (lq5) this.D, 13);
            case 14:
                return new ii3((d37) this.C, f61, (r58) (lq5) this.D, (Object) (Activity) this.E, 14);
            case h75.g:
                return new ii3((d37) this.C, f61, (r58) (lq5) this.D, (Object) (byte[]) this.E, 15);
            case 16:
                ii3 ii35 = new ii3((Object) (fy5) this.D, (Object) (gj) this.E, f61, 16);
                ii35.C = obj;
                return ii35;
            case 17:
                return new ii3(this.B, (Set) this.C, (q26) this.D, (aq4) this.E, f61);
            case 18:
                return new ii3((Object) (c56) this.C, (Object) (String) this.D, (Object) (Throwable) this.E, f61, 18);
            case 19:
                return new ii3((Object) (ResumenWidgetProvider) this.C, (Object) (Context) this.D, (Object) (BroadcastReceiver.PendingResult) this.E, f61, 19);
            case 20:
                ii3 ii36 = new ii3((Object) (xu0) this.D, (Object) (gs2) this.E, f61, 20);
                ii36.C = obj;
                return ii36;
            case 21:
                ii3 ii37 = new ii3((Object) (sy1) this.D, (Object) (zh6) this.E, f61, 21);
                ii37.C = obj;
                return ii37;
            case 22:
                ii3 ii38 = new ii3((Object) (zh6) this.D, (Object) (gs2) this.E, f61, 22);
                ii38.C = obj;
                return ii38;
            case 23:
                ii3 ii39 = new ii3((Object) (a37) this.D, (Object) (uj) this.E, f61, 23);
                ii39.C = obj;
                return ii39;
            case 24:
                return new ii3((d37) this.C, f61, (r58) (fq6) this.D, (Object) (ae1) this.E, 24);
            case 25:
                return new ii3((d37) this.C, f61, (r58) (fq6) this.D, (Object) (jy7) this.E, 25);
            case 26:
                ii3 ii310 = new ii3((Object) (e81) this.D, (Object) (di2) this.E, f61, 26);
                ii310.C = obj;
                return ii310;
            case 27:
                return new ii3((d37) this.C, f61, (r58) (t17) this.D, 27);
            case 28:
                return new ii3((Object) (pe7) this.C, (Object) (co5) this.D, (Object) (qk5) this.E, f61, 28);
            default:
                ii3 ii311 = new ii3((Object) (el3) this.D, (Object) (gs2) this.E, f61, 29);
                ii311.C = obj;
                return ii311;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: op5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: xu0} */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.Object, d06] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0205, code lost:
        if (r0.p == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020d, code lost:
        if (r0.o == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (((defpackage.el3) r1.D).j0(r1) == r0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (((defpackage.gs2) r1.E).H(r2, r1) == r0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d9, code lost:
        if (r13 == r11) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f5, code lost:
        if (r13.j(r12, r1) == r11) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08f6, code lost:
        if (new defpackage.ef0(r12, (defpackage.cg0) r1.D, r14, 8193).d(true, r1) == r2) goto L_0x0905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0903, code lost:
        if (r0.f(r1) == r2) goto L_0x0905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x09a2, code lost:
        if (defpackage.w95.c(r3, r4, r1) == r0) goto L_0x09a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:?, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x043f A[LOOP:8: B:193:0x043f->B:194:0x044e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0451 A[LOOP:9: B:195:0x0451->B:196:0x0469, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0160  */
    public final Object s(Object obj) {
        Object obj2;
        op5 op5;
        fy2 fy2;
        sr2 sr2;
        Object obj3;
        Object obj4;
        fc5 fc5;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object obj5;
        h06 h06;
        Object obj6;
        Object obj7;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object obj8;
        Object value9;
        Object value10;
        Object value11;
        wp5 wp5;
        Object value12;
        Object value13;
        Object o;
        Object value14;
        Object value15;
        Object value16;
        Object q;
        Object value17;
        Object value18;
        String[] strArr;
        Object obj9;
        xu0 xu0;
        Object obj10;
        Throwable a;
        xu0 xu02;
        o81 o81;
        boolean z = false;
        String[] strArr2 = null;
        switch (this.A) {
            case b85.b:
                Object obj11 = p81.w;
                int i = this.B;
                if (i == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((ji3) this.C).c;
                    gv gvVar = new gv((in5) this.D, (Long) this.E, (f61) null, 3);
                    this.B = 1;
                    Object a2 = qe1.a(new fn5(gvVar, (f61) null, 1), this);
                    if (a2 == obj11) {
                        return obj11;
                    }
                    return a2;
                } else if (i == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                p81 p81 = p81.w;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    o96 o96 = pk3.a;
                    if (((Boolean) ((aq4) this.E).getValue()).booleanValue()) {
                        this.B = 1;
                        if (qw6.b((qw6) this.C, (String) this.D, (String) null, this, 6) == p81) {
                            return p81;
                        }
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 2:
                yi0 yi0 = (yi0) this.E;
                Object obj12 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    o81 o812 = (o81) this.C;
                    this.B = 1;
                    obj2 = ((gs2) this.D).H(o812, this);
                    if (obj2 == obj12) {
                        return obj12;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                        obj2 = obj;
                    } catch (CancellationException unused) {
                        yi0.d = true;
                        bj0 bj0 = yi0.b;
                        if (bj0 != null && bj0.x.cancel(true)) {
                            yi0.a = null;
                            yi0.b = null;
                            yi0.c = null;
                        }
                    } catch (Throwable th) {
                        yi0.b(th);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yi0.a(obj2);
                return vs7.a;
            case 3:
                p81 p812 = p81.w;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((uh4) this.C).a.f((Uri) this.D, (InputEvent) this.E, this) == p812) {
                        return p812;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 4:
                Object obj13 = p81.w;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    op5 = this.D;
                    File file = (File) this.E;
                    w34 w34 = new w34(3, file, op5);
                    Object obj14 = fo4.b;
                    File parentFile = file.getParentFile();
                    parentFile.getClass();
                    String path = parentFile.getCanonicalFile().getPath();
                    synchronized (fo4.b) {
                        try {
                            LinkedHashMap linkedHashMap = fo4.c;
                            Object obj15 = linkedHashMap.get(path);
                            if (obj15 == null) {
                                path.getClass();
                                obj15 = new fo4(path);
                                linkedHashMap.put(path, obj15);
                            }
                            fo4 fo4 = (fo4) obj15;
                            fo4.a.add(w34);
                            if (fo4.a.size() == 1) {
                                fo4.startWatching();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fy2 fy22 = new fy2(1, path, w34);
                    vs7 vs7 = vs7.a;
                    this.D = op5;
                    this.C = fy22;
                    this.B = 1;
                    if (op5.B.b(this, vs7) != obj13) {
                        fy2 = fy22;
                    }
                    return obj13;
                } else if (i5 == 1) {
                    fy2 = (fy2) this.C;
                    op5 = (op5) this.D;
                    o85.q(obj);
                } else if (i5 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zh zhVar = new zh(26, (Object) fy2);
                this.D = null;
                this.C = null;
                this.B = 2;
                break;
            case 5:
                ff8 ff8 = (ff8) this.C;
                Object obj16 = p81.w;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    y81 y81 = (y81) this.E;
                    fg0 fg0 = ff8.w;
                    this.C = ff8;
                    this.B = 1;
                    cg0 cg0 = lo4.a;
                    break;
                } else if (i6 == 1) {
                    o85.q(obj);
                } else if (i6 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg0 fg02 = ff8.w;
                this.C = null;
                this.B = 2;
                break;
            case 6:
                vs7 vs72 = vs7.a;
                Object obj17 = p81.w;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    hr4 hr4 = ((gs4) this.C).b;
                    String str = (String) this.E;
                    str.getClass();
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(1, su0.t());
                    byte[] iv = instance.getIV();
                    byte[] bytes = str.getBytes(mo0.a);
                    bytes.getClass();
                    String l = pb4.l(Base64.encodeToString(iv, 2), ":", Base64.encodeToString(instance.doFinal(bytes), 2));
                    this.B = 1;
                    fr4 fr4 = hr4.a;
                    Object P = sg3.P(this, fr4.a, false, true, new w34(4, fr4, new gr4(System.currentTimeMillis(), (String) this.D, l)));
                    if (P != obj17) {
                        P = vs72;
                    }
                    if (P == obj17) {
                        return obj17;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs72;
            case 7:
                vs7 vs73 = vs7.a;
                mm7 mm7 = (mm7) this.C;
                Object obj18 = p81.w;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    ze1 w = u55.w(new au4(mm7, 0));
                    qc qcVar = new qc(mm7, (ay6) this.D, (gp4) this.E, 4);
                    this.B = 1;
                    Object a3 = w.a(new b6(qcVar, 17), this);
                    if (a3 != obj18) {
                        a3 = vs73;
                    }
                    if (a3 == obj18) {
                        return obj18;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs73;
            case 8:
                aq4 aq4 = (aq4) this.D;
                p81 p813 = p81.w;
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    if (((List) aq4.getValue()).size() > 1) {
                        oi6 oi6 = (oi6) this.C;
                        float d = ((ad5) this.E).d();
                        this.B = 1;
                        if (oi6.l1(d, (zs4) ((List) aq4.getValue()).get(((List) aq4.getValue()).size() - 2), this) == p813) {
                            return p813;
                        }
                    }
                } else if (i9 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 9:
                p81 p814 = p81.w;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    op5 op52 = (op5) this.C;
                    NetworkRequest a4 = ((j31) this.D).a();
                    if (a4 == null) {
                        yy4 yy4 = ((j31) this.D).a;
                        yy4.getClass();
                        if (yy4 == yy4.w) {
                            a4 = null;
                        } else {
                            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT < 30 || yy4 != yy4.B) {
                                int ordinal = yy4.ordinal();
                                if (ordinal == 2) {
                                    removeCapability = removeCapability.addCapability(11);
                                } else if (ordinal == 3) {
                                    removeCapability = removeCapability.addCapability(18);
                                } else if (ordinal == 4) {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                                a4 = removeCapability.build();
                            } else {
                                a4 = removeCapability.addCapability(25).build();
                            }
                        }
                    }
                    if (a4 == null) {
                        op52.getClass();
                        op52.y0((Throwable) null);
                        return vs7.a;
                    }
                    w34 w342 = new w34(10, ar7.H(op52, (e81) null, (r81) null, new ju1((oy4) this.E, op52, (f61) null, 27), 3), op52);
                    if (Build.VERSION.SDK_INT >= 30) {
                        ur6 ur6 = ur6.a;
                        ConnectivityManager connectivityManager = ((oy4) this.E).a;
                        ur6.getClass();
                        synchronized (ur6.b) {
                            try {
                                LinkedHashMap linkedHashMap2 = ur6.c;
                                boolean isEmpty = linkedHashMap2.isEmpty();
                                linkedHashMap2.put(w342, a4);
                                if (isEmpty) {
                                    bc4.k().e(bd8.a, "NetworkRequestConstraintController register shared callback");
                                    connectivityManager.registerDefaultNetworkCallback(ur6);
                                } else if (ur6.e && ur6.f != null) {
                                    bc4.k().e(bd8.a, "NetworkRequestConstraintController send initial capabilities");
                                    NetworkCapabilities networkCapabilities = ur6.d;
                                    Boolean bool = ur6.f;
                                    bool.getClass();
                                    if (!bool.booleanValue() && a4.canBeSatisfiedBy(networkCapabilities)) {
                                        z = true;
                                    }
                                    if (z) {
                                        obj3 = p31.a;
                                    } else {
                                        obj3 = new q31(7);
                                    }
                                    w342.y(obj3);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        sr2 = new qm3(23, (Object) w342, (Object) connectivityManager);
                    } else {
                        int i11 = db3.c;
                        ConnectivityManager connectivityManager2 = ((oy4) this.E).a;
                        db3 db3 = new db3(w342);
                        ? obj19 = new Object();
                        try {
                            bc4.k().e(bd8.a, "NetworkRequestConstraintController register callback");
                            connectivityManager2.registerNetworkCallback(a4, db3);
                            obj19.w = true;
                        } catch (RuntimeException e) {
                            if (k57.m0(e.getClass().getName(), "TooManyRequestsException", false)) {
                                bc4.k().g(bd8.a, "NetworkRequestConstraintController couldn't register callback", e);
                                w342.y(new q31(7));
                            } else {
                                throw e;
                            }
                        }
                        sr2 = new g20(obj19, connectivityManager2, db3, 10);
                    }
                    gi0 gi0 = new gi0(7, sr2);
                    this.B = 1;
                    if (w95.c(op52, gi0, this) == p814) {
                        return p814;
                    }
                } else if (i10 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 10:
                d37 d37 = (d37) this.C;
                Object obj20 = p81.w;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    fc5 fc52 = (fc5) ((is7) d37.getValue()).a;
                    dc5 dc5 = ((ic5) this.D).b;
                    String obj21 = d57.k1(fc52.a).toString();
                    String obj22 = d57.k1(fc52.b).toString();
                    this.E = fc52;
                    this.B = 1;
                    Object c = dc5.c(obj21, obj22, this);
                    if (c == obj20) {
                        return obj20;
                    }
                    obj4 = c;
                    fc5 = fc52;
                } else if (i12 == 1) {
                    fc5 = (fc5) this.E;
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    obj4 = fc5.a(fc5, (String) null, (String) null, (List) obj4, 3);
                }
                Object obj23 = obj4;
                boolean z2 = obj23 instanceof m66;
                if (!z2) {
                    if (z2) {
                        obj23 = null;
                    }
                    if (obj23 != null) {
                        do {
                            value3 = d37.getValue();
                        } while (!d37.i(value3, is7.a((is7) value3, obj23, false, (hv2) null, 4)));
                    } else {
                        do {
                            value2 = d37.getValue();
                        } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                    }
                } else {
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj23)), 1)));
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Object obj24 = p81.w;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    h06 h062 = (h06) this.D;
                    this.C = h062;
                    this.B = 1;
                    obj5 = ((cl5) this.E).a(this);
                    if (obj5 == obj24) {
                        return obj24;
                    }
                    h06 = h062;
                } else if (i13 == 1) {
                    h06 = (h06) this.C;
                    o85.q(obj);
                    obj5 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h06.w = obj5;
                return vs7.a;
            case 12:
                Object obj25 = vs7.a;
                lq5 lq5 = (lq5) this.D;
                d37 d372 = (d37) this.C;
                Object obj26 = p81.w;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    do {
                        value8 = d372.getValue();
                    } while (!d372.i(value8, b81.h((Object) null, (is7) value8, (Object) null, true, 1)));
                    wp5 wp52 = (wp5) ((is7) d372.getValue()).a;
                    this.B = 1;
                    obj6 = lq5.b.e((String) this.E, this);
                    if (obj6 == obj26) {
                        return obj26;
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                    obj6 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj6 instanceof m66)) {
                    vs7 vs74 = (vs7) obj6;
                    d37 d373 = lq5.c;
                    do {
                        value7 = d373.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value7).a, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, new if7(new String(), (String) null), false, (Integer) null, 14335), 6, d373, value7));
                    obj7 = obj25;
                } else {
                    obj7 = obj6;
                }
                if (!(obj7 instanceof m66)) {
                    do {
                        value6 = d372.getValue();
                    } while (!d372.i(value6, is7.a((is7) value6, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value5 = d372.getValue();
                    } while (!d372.i(value5, is7.a((is7) value5, (Object) null, false, new hv2(25, (Object) o66.a(obj7)), 1)));
                }
                return obj25;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Object obj27 = vs7.a;
                lq5 lq52 = (lq5) this.D;
                d37 d374 = (d37) this.C;
                Object obj28 = p81.w;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    do {
                        value12 = d374.getValue();
                    } while (!d374.i(value12, b81.h((Object) null, (is7) value12, (Object) null, true, 1)));
                    wp5 = (wp5) ((is7) d374.getValue()).a;
                    p7 p7Var = lq52.b;
                    String str2 = wp5.f.a;
                    String str3 = wp5.g.a;
                    this.E = wp5;
                    this.B = 1;
                    obj8 = p7Var.n(str2, str3, this);
                    break;
                } else if (i15 == 1) {
                    wp5 = (wp5) this.E;
                    o85.q(obj);
                    obj8 = ((o66) obj).w;
                } else if (i15 == 2) {
                    try {
                        o85.q(obj);
                        ((o66) obj).getClass();
                        d37 d375 = lq52.c;
                        do {
                            value11 = d375.getValue();
                        } while (!d375.i(value11, new is7(6, wp5.a((wp5) ((is7) value11).a, (u5) null, (a54) null, (b54) null, rv.y, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16375))));
                        obj8 = obj27;
                    } catch (Throwable th4) {
                        obj8 = new m66(th4);
                    }
                    if (obj8 instanceof m66) {
                        do {
                            value10 = d374.getValue();
                        } while (!d374.i(value10, is7.a((is7) value10, (Object) null, false, (hv2) null, 5)));
                    } else {
                        do {
                            value9 = d374.getValue();
                        } while (!d374.i(value9, is7.a((is7) value9, (Object) null, false, new hv2(25, (Object) o66.a(obj8)), 1)));
                    }
                    return obj27;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable a5 = o66.a(obj8);
                if (a5 != null) {
                    if (a5 instanceof EmailNotVerifiedException) {
                        p7 p7Var2 = lq52.b;
                        String str4 = wp5.f.a;
                        this.E = null;
                        this.B = 2;
                        break;
                    } else {
                        throw a5;
                    }
                }
                if (obj8 instanceof m66) {
                }
                return obj27;
            case 14:
                d37 d376 = (d37) this.C;
                Object obj29 = p81.w;
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    do {
                        value13 = d376.getValue();
                    } while (!d376.i(value13, b81.h((Object) null, (is7) value13, (Object) null, true, 1)));
                    wp5 wp53 = (wp5) ((is7) d376.getValue()).a;
                    p7 p7Var3 = ((lq5) this.D).b;
                    Activity activity = (Activity) this.E;
                    String str5 = wp53.i.a;
                    if (wp53.d != rv.x) {
                        str5 = null;
                    }
                    this.B = 1;
                    o = p7Var3.o(activity, str5, this);
                    if (o == obj29) {
                        return obj29;
                    }
                } else if (i16 == 1) {
                    o85.q(obj);
                    o = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj30 = o;
                if (!(obj30 instanceof m66)) {
                    do {
                        value15 = d376.getValue();
                    } while (!d376.i(value15, is7.a((is7) value15, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value14 = d376.getValue();
                    } while (!d376.i(value14, is7.a((is7) value14, (Object) null, false, new hv2(25, (Object) o66.a(obj30)), 1)));
                }
                return vs7.a;
            case h75.g:
                d37 d377 = (d37) this.C;
                Object obj31 = p81.w;
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    do {
                        value16 = d377.getValue();
                    } while (!d377.i(value16, b81.h((Object) null, (is7) value16, (Object) null, true, 1)));
                    this.B = 1;
                    q = ((lq5) this.D).b.q(((wp5) ((is7) d377.getValue()).a).k.a, (byte[]) this.E, this);
                    if (q == obj31) {
                        return obj31;
                    }
                } else if (i17 == 1) {
                    o85.q(obj);
                    q = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj32 = q;
                if (!(obj32 instanceof m66)) {
                    do {
                        value18 = d377.getValue();
                    } while (!d377.i(value18, is7.a((is7) value18, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value17 = d377.getValue();
                    } while (!d377.i(value17, is7.a((is7) value17, (Object) null, false, new hv2(25, (Object) o66.a(obj32)), 1)));
                }
                return vs7.a;
            case 16:
                p81 p815 = p81.w;
                int i18 = this.B;
                if (i18 == 0) {
                    o85.q(obj);
                    fy5 fy5 = (fy5) this.D;
                    this.B = 1;
                    fy5.u((o81) this.C, (gj) this.E, this);
                    return p815;
                } else if (i18 == 1) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 17:
                q26 q26 = (q26) this.D;
                o85.q(obj);
                int i19 = this.B;
                if (i19 == 0) {
                    strArr = d36.a;
                    break;
                } else {
                    if (i19 == 1 || i19 == 3) {
                        strArr = d36.b;
                        break;
                    }
                    if (strArr2 != null && ((Set) this.C).add(new Integer(i19))) {
                        String[] strArr3 = d36.a;
                        ((vr2) ((aq4) this.E).getValue()).y(strArr2);
                    }
                    return vs7.a;
                }
                strArr2 = strArr;
                String[] strArr32 = d36.a;
                ((vr2) ((aq4) this.E).getValue()).y(strArr2);
                return vs7.a;
            case 18:
                c56 c56 = (c56) this.C;
                Object obj33 = p81.w;
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj9 = c56.b.b(b56.w, (String) this.D, (Throwable) this.E, this);
                    if (obj9 == obj33) {
                        return obj33;
                    }
                } else if (i20 == 1) {
                    o85.q(obj);
                    obj9 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f91 f91 = c56.c;
                if (o66.a(obj9) != null) {
                    f91.getClass();
                    yh7.a.getClass();
                    hr2.o();
                }
                return vs7.a;
            case 19:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.E;
                p81 p816 = p81.w;
                int i21 = this.B;
                if (i21 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (ResumenWidgetProvider.a((ResumenWidgetProvider) this.C, (Context) this.D, this) == p816) {
                        return p816;
                    }
                } else if (i21 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th5) {
                        pendingResult.finish();
                        throw th5;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pendingResult.finish();
                return vs7.a;
            case 20:
                Object obj34 = p81.w;
                int i22 = this.B;
                if (i22 == 0) {
                    o85.q(obj);
                    o81 o813 = (o81) this.C;
                    xu0 = (xu0) this.D;
                    gs2 gs2 = (gs2) this.E;
                    try {
                        this.C = xu0;
                        this.B = 1;
                        obj10 = gs2.H(o813, this);
                        if (obj10 == obj34) {
                            return obj34;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        xu02 = xu0;
                        xu0 = xu02;
                        obj10 = new m66(th);
                        a = o66.a(obj10);
                        if (a == null) {
                        }
                        return vs7.a;
                    }
                } else if (i22 == 1) {
                    xu02 = this.C;
                    try {
                        o85.q(obj);
                        xu0 = xu02;
                        obj10 = obj;
                    } catch (Throwable th7) {
                        th = th7;
                        xu0 = xu02;
                        obj10 = new m66(th);
                        a = o66.a(obj10);
                        if (a == null) {
                        }
                        return vs7.a;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = o66.a(obj10);
                if (a == null) {
                    xu0.c0(obj10);
                } else {
                    xu0.getClass();
                    xu0.c0(new av0(a, false));
                }
                return vs7.a;
            case 21:
                p81 p817 = p81.w;
                int i23 = this.B;
                if (i23 == 0) {
                    o85.q(obj);
                    w34 w343 = new w34(24, (xh6) this.C, (zh6) this.E);
                    this.B = 1;
                    if (((sy1) this.D).H(w343, this) == p817) {
                        return p817;
                    }
                } else if (i23 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 22:
                p81 p818 = p81.w;
                int i24 = this.B;
                if (i24 == 0) {
                    o85.q(obj);
                    zh6 zh6 = (zh6) this.D;
                    zh6.k = (eh6) this.C;
                    xh6 xh6 = zh6.l;
                    this.B = 1;
                    if (((gs2) this.E).H(xh6, this) == p818) {
                        return p818;
                    }
                } else if (i24 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 23:
                p81 p819 = p81.w;
                int i25 = this.B;
                if (i25 == 0) {
                    o85.q(obj);
                    ze1 w2 = u55.w(new mu4(9, (a37) this.D));
                    n40 n40 = new n40(8, (uj) this.E, (o81) this.C);
                    this.B = 1;
                    if (w2.a(n40, this) == p819) {
                        return p819;
                    }
                } else if (i25 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 24:
                return v(obj);
            case 25:
                return x(obj);
            case 26:
                return z(obj);
            case 27:
                return A(obj);
            case 28:
                return B(obj);
            default:
                Object obj35 = p81.w;
                int i26 = this.B;
                if (i26 == 0) {
                    o85.q(obj);
                    o81 = (o81) this.C;
                    this.C = o81;
                    this.B = 1;
                    break;
                } else if (i26 == 1) {
                    o81 = (o81) this.C;
                    o85.q(obj);
                } else if (i26 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.C = null;
                this.B = 2;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(d37 d37, f61 f61, r58 r58, int i) {
        super(2, f61);
        this.A = i;
        this.C = d37;
        this.D = r58;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(d37 d37, f61 f61, r58 r58, Object obj, int i) {
        super(2, f61);
        this.A = i;
        this.C = d37;
        this.D = r58;
        this.E = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii3(File file, f61 f61) {
        super(2, f61);
        this.A = 4;
        this.E = file;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }
}
