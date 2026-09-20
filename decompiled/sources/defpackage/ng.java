package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.telecom.Call;
import android.telecom.CallScreeningService;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import cu.lestebang.utiletecsa.data.repository.spots.SpotFeedDto;
import cu.lestebang.utiletecsa.data.repository.spots.SpotVoteDto;
import cu.lestebang.utiletecsa.feature.settings.service.CallBlockService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: ng  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng(x27 x27, di2 di2, d37 d37, Object obj, f61 f61) {
        super(2, f61);
        this.A = 8;
        this.D = x27;
        this.E = di2;
        this.F = d37;
        this.C = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    private final Object A(Object obj) {
        o81 o81;
        cl7 cl7;
        zh6 zh6;
        o81 o812;
        cl7 cl72 = (cl7) this.F;
        int i = this.B;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            o812 = (o81) this.C;
        } else if (i == 1) {
            zh6 = (zh6) this.E;
            cl7 = (cl7) this.D;
            o81 = (o81) this.C;
            o85.q(obj);
            this.C = o81;
            this.D = null;
            this.E = null;
            this.B = 2;
            if (cl7.c(cl7, zh6, (al7) obj, this) != p81) {
                o812 = o81;
            }
            return p81;
        } else if (i == 2) {
            o81 o813 = (o81) this.C;
            try {
                o85.q(obj);
                o812 = o813;
            } catch (Throwable th) {
                cl72.g = null;
                throw th;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (r16.X(o812.k())) {
            zh6 = cl72.a;
            ad0 ad0 = cl72.f;
            this.C = o812;
            this.D = cl72;
            this.E = zh6;
            this.B = 1;
            ad0.getClass();
            Object J = ad0.J(ad0, this);
            if (J != p81) {
                o81 = o812;
                obj = J;
                cl7 = cl72;
                this.C = o81;
                this.D = null;
                this.E = null;
                this.B = 2;
                if (cl7.c(cl7, zh6, (al7) obj, this) != p81) {
                }
                return p81;
            }
            return p81;
        }
        cl72.g = null;
        return vs7.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: e81} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: e81} */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r5 == r3) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (defpackage.ar7.e0((defpackage.e81) r5, r6, r0) == r3) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd A[Catch:{ all -> 0x00ef }] */
    private final Object B(Object obj) {
        long j;
        e35 e35;
        ReentrantLock reentrantLock;
        fi2 fi2;
        Object obj2;
        boolean z;
        int[] iArr = (int[]) this.E;
        do7 do7 = (do7) this.D;
        Object obj3 = p81.w;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            fi2 = (fi2) this.C;
            e35 e352 = do7.h;
            e352.getClass();
            iArr.getClass();
            ReentrantLock reentrantLock2 = e352.a;
            reentrantLock2.lock();
            try {
                boolean z2 = false;
                for (int i2 : iArr) {
                    long[] jArr = e352.b;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 + 1;
                    if (j2 == 0) {
                        e352.d = true;
                        z2 = true;
                    }
                }
                j = 1;
                if (z2 || e352.d || e352.f) {
                    z = true;
                } else {
                    z = false;
                }
                reentrantLock2.unlock();
                if (z) {
                    a96 a96 = do7.a;
                    this.C = fi2;
                    this.B = 1;
                    obj2 = sg3.u(a96, false, this);
                }
                ? obj4 = new Object();
                br4 br4 = do7.i;
                nn0 nn0 = new nn0(obj4, fi2, (String[]) this.F, iArr);
                this.C = null;
                this.B = 3;
                br4.w(nn0, this);
                return obj3;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } else if (i == 1) {
            fi2 = (fi2) this.C;
            o85.q(obj);
            obj2 = obj;
            j = 1;
        } else if (i == 2) {
            fi2 = (fi2) this.C;
            o85.q(obj);
            j = 1;
            try {
                ? obj42 = new Object();
                br4 br42 = do7.i;
                nn0 nn02 = new nn0(obj42, fi2, (String[]) this.F, iArr);
                this.C = null;
                this.B = 3;
                br42.w(nn02, this);
                return obj3;
            } catch (Throwable th2) {
                th = th2;
                e35 = do7.h;
                e35.getClass();
                iArr.getClass();
                reentrantLock = e35.a;
                reentrantLock.lock();
                boolean z3 = false;
                while (r7 < r4) {
                }
                boolean z4 = e35.f;
                reentrantLock.unlock();
                throw th;
            }
        } else if (i != 3) {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            try {
                o85.q(obj);
                throw new RuntimeException();
            } catch (Throwable th3) {
                th = th3;
                j = 1;
                e35 = do7.h;
                e35.getClass();
                iArr.getClass();
                reentrantLock = e35.a;
                reentrantLock.lock();
                try {
                    boolean z32 = false;
                    for (int i3 : iArr) {
                        long[] jArr2 = e35.b;
                        long j3 = jArr2[i3];
                        jArr2[i3] = j3 - j;
                        if (j3 == j) {
                            e35.d = true;
                            z32 = true;
                        }
                    }
                    if (!z32 && !e35.d) {
                        boolean z42 = e35.f;
                    }
                    reentrantLock.unlock();
                    throw th;
                } catch (Throwable th4) {
                    reentrantLock.unlock();
                    throw th4;
                }
            }
        }
        gw6 gw6 = new gw6(do7, (f61) null, 9);
        this.C = fi2;
        this.B = 2;
    }

    private final Object G(Object obj) {
        Object obj2;
        w78 w78;
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
            w78 w782 = (w78) ((is7) d37.getValue()).a;
            this.F = w782;
            this.B = 1;
            Object f = ((e88) this.D).b.f((Uri) this.E, this);
            p81 p81 = p81.w;
            if (f == p81) {
                return p81;
            }
            w78 w783 = w782;
            obj2 = f;
            w78 = w783;
        } else if (i == 1) {
            w78 = (w78) this.F;
            o85.q(obj);
            obj2 = ((o66) obj).w;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(obj2 instanceof m66)) {
            obj2 = p25.b(w78, (o78) obj2);
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

    private final Object I(Object obj) {
        zb8 zb8 = (zb8) this.F;
        t54 t54 = (t54) this.E;
        gy5 gy5 = (gy5) this.D;
        int i = this.B;
        vs7 vs7 = vs7.a;
        if (i == 0) {
            o85.q(obj);
            mm4 mm4 = (mm4) ((h06) this.C).w;
            if (mm4 != null) {
                mm4.x = gl0.E(gy5.x);
            }
            this.B = 1;
            fy5 fy5 = new fy5(gy5, (f61) null);
            e81 e81 = this.x;
            e81.getClass();
            Object e0 = ar7.e0(gy5.a, new w6((Object) gy5, (Object) fy5, (Object) pd8.s(e81), (f61) null, 14), this);
            p81 p81 = p81.w;
            if (e0 != p81) {
                e0 = vs7;
            }
            if (e0 != p81) {
                e0 = vs7;
            }
            if (e0 == p81) {
                return p81;
            }
        } else if (i == 1) {
            try {
                o85.q(obj);
            } catch (Throwable th) {
                Throwable th2 = th;
                t54.k().M0(zb8);
                throw th2;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t54.k().M0(zb8);
        return vs7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r14 == r6) goto L_0x0080;
     */
    private final Object L(Object obj) {
        String str = ((be8) this.D).c;
        t84 t84 = (t84) this.C;
        int i = this.B;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            bj0 a = t84.a();
            this.B = 1;
            obj = se8.a(a, t84, this);
        } else if (i == 1) {
            o85.q(obj);
        } else if (i == 2) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm2 hm2 = (hm2) obj;
        if (hm2 != null) {
            String str2 = gd8.a;
            bc4 k = bc4.k();
            k.e(str2, "Updating notification for " + str);
            hd8 hd8 = (hd8) this.E;
            UUID uuid = t84.b.a;
            ol6 ol6 = hd8.a.a;
            mm0 mm0 = new mm0((Object) hd8, (Object) uuid, (Object) hm2, (Object) (Context) this.F, 10);
            ol6.getClass();
            bj0 v = ar7.v(new yv0(10, (Object) ol6, (Object) mm0));
            this.B = 2;
            Object h = ed1.h(v, this);
            if (h == p81) {
                return p81;
            }
            return h;
        }
        h.s(f21.h("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: d17} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: m66} */
    /* JADX WARNING: type inference failed for: r9v2, types: [im5, bj6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f0 A[Catch:{ CancellationException -> 0x0187, Exception -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0123 A[Catch:{ CancellationException -> 0x0187, Exception -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0133 A[Catch:{ CancellationException -> 0x0187, Exception -> 0x017b }, LOOP:0: B:34:0x012d->B:36:0x0133, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0159 A[Catch:{ CancellationException -> 0x0187, Exception -> 0x017b }] */
    private final Object v(Object obj) {
        m66 m66;
        d17 d17;
        String str;
        List<SpotFeedDto> list;
        int F2;
        int i;
        String str2;
        d17 d172;
        Object a;
        int i2 = this.B;
        Class<List> cls = List.class;
        Object obj2 = p81.w;
        if (i2 == 0) {
            o85.q(obj);
            d172 = this.F;
            this.C = d172;
            this.B = 1;
            obj = d17.a(d172, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i2 == 1) {
            d172 = (d17) this.C;
            o85.q(obj);
        } else if (i2 == 2) {
            bj6 bj6 = (bj6) ((List) this.E);
            String str3 = (String) this.D;
            d17 d173 = (d17) this.C;
            o85.q(obj);
            d17 d174 = d173;
            str2 = str3;
            d172 = d174;
            jm5 jm5 = (jm5) obj;
            t77 t77 = jm5.b.d;
            String str4 = jm5.a;
            gs3 gs3 = gs3.c;
            List list2 = (List) ((f96) t77).s(b26.c(cls, x91.C(b26.b(SpotFeedDto.class))), str4);
            hm5 i3 = f55.i(d172.a, "connection_spot_votes");
            gm5 gm5 = i3.a;
            String str5 = i3.c;
            ku4 ku4 = gm5.c.v;
            im5 im5 = new im5(str5, ku4);
            zc9 zc9 = new zc9(ku4, im5.f, 4);
            str2.getClass();
            zc9.a("device_id", xd2.EQ, str2);
            im5.d("*");
            h66 h66 = h66.a;
            String str6 = i3.b;
            this.C = d172;
            this.D = str2;
            this.E = list2;
            this.B = 3;
            a = h66.a(gm5, str6, im5, this);
            if (a != obj2) {
                List list3 = list2;
                obj = a;
                d17 = d172;
                list = list3;
                str = str2;
                jm5 jm52 = (jm5) obj;
                t77 t772 = jm52.b.d;
                String str7 = jm52.a;
                gs3 gs32 = gs3.c;
                List<SpotVoteDto> list4 = (List) ((f96) t772).s(b26.c(cls, x91.C(b26.b(SpotVoteDto.class))), str7);
                F2 = tf4.F(et0.e0(list4, 10));
                if (F2 < 16) {
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F2);
                while (r15.hasNext()) {
                }
                ArrayList arrayList = new ArrayList();
                while (r0.hasNext()) {
                }
                m66 = arrayList;
                return new o66(m66);
            }
            return obj2;
        } else if (i2 == 3) {
            list = (List) this.E;
            str = (String) this.D;
            d17 = (d17) this.C;
            try {
                o85.q(obj);
                jm5 jm522 = (jm5) obj;
                t77 t7722 = jm522.b.d;
                String str72 = jm522.a;
                gs3 gs322 = gs3.c;
                List<SpotVoteDto> list42 = (List) ((f96) t7722).s(b26.c(cls, x91.C(b26.b(SpotVoteDto.class))), str72);
                F2 = tf4.F(et0.e0(list42, 10));
                if (F2 < 16) {
                    F2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(F2);
                for (SpotVoteDto spotVoteDto : list42) {
                    linkedHashMap2.put(spotVoteDto.getSpotId(), new Integer(spotVoteDto.getVote()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (SpotFeedDto spotFeedDto : list) {
                    Integer num = (Integer) linkedHashMap2.get(spotFeedDto.getId());
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    o11 b = d17.b(d17, spotFeedDto, str, i);
                    if (b != null) {
                        arrayList2.add(b);
                    }
                }
                m66 = arrayList2;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                m66 = new m66(e2);
            }
            return new o66(m66);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str8 = (String) obj;
        hm5 i4 = f55.i(d172.a, "connection_spots_feed");
        gm5 gm52 = i4.a;
        ? im52 = new im5(i4.c, gm52.c.v);
        im5.b(im52, "created_at", w75.DESCENDING);
        im52.d("*");
        h66 h662 = h66.a;
        String str9 = i4.b;
        this.C = d172;
        this.D = str8;
        this.E = null;
        this.B = 2;
        Object a2 = h662.a(gm52, str9, im52, this);
        if (a2 == obj2) {
            return obj2;
        }
        Object obj3 = a2;
        str2 = str8;
        obj = obj3;
        jm5 jm53 = (jm5) obj;
        t77 t773 = jm53.b.d;
        String str42 = jm53.a;
        gs3 gs33 = gs3.c;
        List list22 = (List) ((f96) t773).s(b26.c(cls, x91.C(b26.b(SpotFeedDto.class))), str42);
        hm5 i32 = f55.i(d172.a, "connection_spot_votes");
        gm5 gm53 = i32.a;
        String str52 = i32.c;
        ku4 ku42 = gm53.c.v;
        im5 im53 = new im5(str52, ku42);
        zc9 zc92 = new zc9(ku42, im53.f, 4);
        str2.getClass();
        zc92.a("device_id", xd2.EQ, str2);
        im53.d("*");
        h66 h663 = h66.a;
        String str62 = i32.b;
        this.C = d172;
        this.D = str2;
        this.E = list22;
        this.B = 3;
        a = h663.a(gm53, str62, im53, this);
        if (a != obj2) {
        }
        return obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: e17} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r8 == r7) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0 A[LOOP:3: B:42:0x00e0->B:43:0x00f8, LOOP_START] */
    private final Object x(Object obj) {
        Object obj2;
        e17 e17;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        e17 e172;
        Object m66;
        Object obj3;
        Object value4;
        t17 t17 = (t17) this.D;
        d37 d37 = (d37) this.C;
        int i = this.B;
        Object obj4 = p81.w;
        if (i == 0) {
            o85.q(obj);
            do {
                value4 = d37.getValue();
            } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
            e17 = (e17) ((is7) d37.getValue()).a;
            this.F = e17;
            this.B = 1;
            obj2 = t17.b.d((String) this.E, this);
        } else if (i == 1) {
            e17 = (e17) this.F;
            o85.q(obj);
            obj2 = ((o66) obj).w;
        } else if (i == 2) {
            e172 = this.F;
            try {
                o85.q(obj);
                obj3 = ((o66) obj).w;
                o85.q(obj3);
                m66 = (List) obj3;
            } catch (Throwable th) {
                th = th;
            }
            e17 = e172;
            e17 e173 = e17;
            if (!(obj2 instanceof m66)) {
                obj2 = e17.a(e173, (List) obj2, (r11) null, (String) null, (String) null, false, (hv2) null, 62);
            }
            z = obj2 instanceof m66;
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
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(obj2 instanceof m66)) {
            try {
                vs7 vs7 = (vs7) obj2;
                d17 d17 = t17.b;
                this.F = e17;
                this.B = 2;
                obj3 = d17.e(this);
                if (obj3 != obj4) {
                    e172 = e17;
                    o85.q(obj3);
                    m66 = (List) obj3;
                    e17 = e172;
                }
                return obj4;
            } catch (Throwable th2) {
                th = th2;
                e172 = e17;
                m66 = new m66(th);
                e17 = e172;
                e17 e1732 = e17;
                if (!(obj2 instanceof m66)) {
                }
                z = obj2 instanceof m66;
                if (!z) {
                }
                return vs7.a;
            }
        }
        e17 e17322 = e17;
        if (!(obj2 instanceof m66)) {
        }
        z = obj2 instanceof m66;
        if (!z) {
        }
        return vs7.a;
    }

    private final Object z(Object obj) {
        uk5 uk5 = (uk5) this.E;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            nb7 nb7 = new nb7((o81) this.C, new co5(uk5), (hs2) this.F, (vr2) this.D, (f61) null);
            this.B = 1;
            Object s = fd1.s(uk5, nb7, this);
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
        return vs7.a;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((ng) o((f61) obj2, (mh) obj)).s(vs7);
                return p81;
            case 1:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((ng) o((f61) obj2, (hs6) obj)).s(vs7);
            case 8:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 10:
                ((ng) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 19:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 23:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                ((ng) o((f61) obj2, (fi2) obj)).s(vs7);
                return p81;
            case 25:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            case 27:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((ng) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                ng ngVar = new ng((Object) (vr2) this.D, (Object) (og) this.E, (Object) (o44) this.F, f61, 0);
                ngVar.C = obj;
                return ngVar;
            case 1:
                return new ng(this.C, (uj) this.D, (aq4) this.E, (aq4) this.F, f61, 1);
            case 2:
                ng ngVar2 = new ng((Object) (Call.Details) this.D, (Object) (Context) this.E, (Object) (CallBlockService) this.F, f61, 2);
                ngVar2.C = obj;
                return ngVar2;
            case 3:
                return new ng((ox0) this.C, (ScrollCaptureSession) this.D, (Rect) this.E, (Consumer) this.F, f61, 3);
            case 4:
                return new ng((zy2) this.C, (be8) this.D, (AtomicInteger) this.E, (ListenableFuture) this.F, f61, 4);
            case 5:
                return new ng((ConstraintTrackingWorker) this.C, (t84) this.D, (zy2) this.E, (be8) this.F, f61, 5);
            case 6:
                return new ng((s34) this.C, (vr2) this.D, (vh0) this.E, (re3) this.F, f61, 6);
            case 7:
                ng ngVar3 = new ng((Object) (di2) this.D, (Object) (d37) this.E, this.F, f61, 7);
                ngVar3.C = obj;
                return ngVar3;
            case 8:
                return new ng((x27) this.D, (di2) this.E, (d37) this.F, this.C, f61);
            case 9:
                return new ng((np2) this.C, (String) this.D, (ez4) this.E, (String) this.F, f61, 9);
            case 10:
                ng ngVar4 = new ng((Object) (aq4) this.E, (Object) (lb3) this.F, f61, 10);
                ngVar4.C = obj;
                return ngVar4;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ng ngVar5 = new ng((Object) (oi6) this.D, (Object) (eg6) this.E, (Object) (mm7) this.F, f61, 11);
                ngVar5.C = obj;
                return ngVar5;
            case 12:
                ng ngVar6 = new ng((Object) (oi6) this.D, (Object) (zs4) this.E, (Object) (mm7) this.F, f61, 12);
                ngVar6.C = obj;
                return ngVar6;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new ng((Object) (wj5) this.E, (Object) (gs2) this.F, f61, 13);
            case 14:
                return new ng((g46) this.C, (Map) this.D, (k05) this.E, (da0) this.F, f61, 14);
            case h75.g:
                return new ng((Object) (qq4) this.E, (Object) (gs2) this.F, f61, 15);
            case 16:
                ng ngVar7 = new ng((Object) (in8) this.D, (Object) (k54) this.E, (Object) (gs2) this.F, f61, 16);
                ngVar7.C = obj;
                return ngVar7;
            case 17:
                ng ngVar8 = new ng((Object) (a96) this.D, (Object) (kk0) this.E, (Object) (k05) this.F, f61, 17);
                ngVar8.C = obj;
                return ngVar8;
            case 18:
                ng ngVar9 = new ng((Object) (vr2) this.D, (Object) (AtomicReference) this.E, (Object) (gs2) this.F, f61, 18);
                ngVar9.C = obj;
                return ngVar9;
            case 19:
                return new ng((d17) this.F, f61, 19);
            case 20:
                return new ng((d37) this.C, f61, (r58) (t17) this.D, (Object) (dz4) this.E, 20);
            case 21:
                return new ng((d37) this.C, f61, (r58) (t17) this.D, (Object) (String) this.E, 21);
            case 22:
                ng ngVar10 = new ng((uk5) this.E, (hs2) this.F, (vr2) this.D, f61);
                ngVar10.C = obj;
                return ngVar10;
            case 23:
                ng ngVar11 = new ng((cl7) this.F, f61, 23);
                ngVar11.C = obj;
                return ngVar11;
            case 24:
                ng ngVar12 = new ng((Object) (do7) this.D, (Object) (int[]) this.E, (Object) (String[]) this.F, f61, 24);
                ngVar12.C = obj;
                return ngVar12;
            case 25:
                return new ng((d37) this.C, f61, (r58) (e88) this.D, (Object) (Uri) this.E, 25);
            case 26:
                return new ng((h06) this.C, (gy5) this.D, (t54) this.E, (zb8) this.F, f61, 26);
            case 27:
                return new ng((t84) this.C, (be8) this.D, (hd8) this.E, (Context) this.F, f61, 27);
            default:
                return new ng((Object) (jb9) this.D, (Object) (bs8) this.E, (Object) (aq4) this.F, f61, 28);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: oq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: oq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v208, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: zm6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v227, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: e17} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v118, resolved type: qq4} */
    /* JADX WARNING: type inference failed for: r3v14, types: [gs2, a97] */
    /* JADX WARNING: type inference failed for: r2v28, types: [gs2, a97] */
    /* JADX WARNING: type inference failed for: r3v28, types: [java.lang.Object, e06] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ee, code lost:
        if (defpackage.gl0.L(r2, r4) == r15) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0422, code lost:
        if (defpackage.tj5.y(r3) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0511, code lost:
        if (defpackage.oi6.i1(r8, r7, r4) == r15) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0586, code lost:
        if (defpackage.i95.e(r2, r0, r1, r3, r4, 4) == r15) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06e1, code lost:
        if (r0.a(r1, r4) == r15) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06f9, code lost:
        if (defpackage.gr8.I(r2, r3, r4) == r15) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0702, code lost:
        if (r0.a(r1, r4) == r15) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0746, code lost:
        if (defpackage.gr8.A(defpackage.gr8.F(defpackage.gr8.F(new defpackage.qi2(new defpackage.on0(r10, r11, defpackage.x32.w, -2, r14), new defpackage.da0(2, (defpackage.f61) null, 5), 1))), new defpackage.ng((java.lang.Object) r0, (java.lang.Object) r1, r4.C, (defpackage.f61) null, 7), r4) == r15) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if (r3 == r15) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x098b, code lost:
        if (defpackage.dh4.u(r1, r6) == false) goto L_0x098d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r0 == r15) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:?, code lost:
        return r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:469:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014f A[LOOP:3: B:61:0x014f->B:62:0x0167, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01df A[LOOP:4: B:87:0x01df->B:90:0x01ea, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ef A[LOOP:5: B:93:0x01ef->B:96:0x01f9, LOOP_START] */
    public final Object s(Object obj) {
        Object obj2;
        boolean z;
        CallScreeningService.CallResponse callResponse;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object value;
        Object value2;
        o81 o81;
        e06 e06;
        Object obj7;
        yb5 yb5;
        oq4 oq4;
        Object D2;
        oq4 oq42;
        Object obj8;
        oq4 oq43;
        wj5 wj5;
        oq4 oq44;
        oq4 oq45;
        gs2 gs2;
        f61 f61;
        Object obj9;
        zm6 zm6;
        Object H;
        zm6 zm62;
        Object obj10;
        e17 e17;
        boolean z2;
        Object value3;
        Object value4;
        Object value5;
        Object obj11;
        Object value6;
        aq4 aq4;
        Object obj12;
        ng ngVar = this;
        int i = ngVar.A;
        boolean z3 = false;
        Object obj13 = vs7.a;
        Object obj14 = p81.w;
        String str = null;
        switch (i) {
            case b85.b:
                int i2 = ngVar.B;
                if (i2 == 0) {
                    o85.q(obj);
                    w6 w6Var = new w6((Object) (mh) ngVar.C, (Object) (vr2) ngVar.D, (Object) (og) ngVar.E, (Object) (o44) ngVar.F, (f61) null, 1);
                    ngVar.B = 1;
                    if (gl0.L(w6Var, ngVar) == obj14) {
                        return obj14;
                    }
                    ta1.e();
                } else if (i2 != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                } else {
                    o85.q(obj);
                    ta1.e();
                }
                return null;
            case 1:
                Object obj15 = obj13;
                uj ujVar = (uj) ngVar.D;
                int i3 = ngVar.B;
                if (i3 == 0) {
                    o85.q(obj);
                    if (!sg3.e(ngVar.C, ujVar.e.getValue())) {
                        Object obj16 = ngVar.C;
                        x17 x17 = vj.a;
                        ngVar.B = 1;
                        Object c = uj.c((uj) ngVar.D, obj16, (hl) ((aq4) ngVar.E).getValue(), (Float) null, (vr2) null, this, 12);
                        ngVar = this;
                        if (c == obj14) {
                            return obj14;
                        }
                    }
                    return obj15;
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x17 x172 = vj.a;
                vr2 vr2 = (vr2) ((aq4) ngVar.F).getValue();
                if (vr2 != null) {
                    vr2.y(ujVar.d());
                }
                return obj15;
            case 2:
                Object obj17 = obj13;
                Context context = (Context) ngVar.E;
                CallBlockService callBlockService = (CallBlockService) ngVar.F;
                Call.Details details = (Call.Details) ngVar.D;
                o81 o812 = (o81) ngVar.C;
                int i4 = ngVar.B;
                if (i4 == 0) {
                    o85.q(obj);
                    vp6 vp6 = callBlockService.z;
                    if (vp6 != null) {
                        c6 a = vp6.a();
                        ngVar.C = null;
                        ngVar.B = 1;
                        obj3 = gr8.H(a, ngVar);
                        if (obj3 == obj14) {
                            return obj14;
                        }
                    } else {
                        sg3.a0("settingsRepository");
                        throw null;
                    }
                } else if (i4 == 1) {
                    try {
                        o85.q(obj);
                        obj3 = obj;
                    } catch (Throwable th) {
                        obj2 = new m66(th);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = (zn6) obj3;
                if (obj2 instanceof m66) {
                    obj2 = null;
                }
                zn6 zn6 = (zn6) obj2;
                Uri handle = details.getHandle();
                if (handle != null) {
                    str = handle.getSchemeSpecificPart();
                }
                if (str == null) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = (char) str.charAt(i5);
                    if (Character.isDigit((char) charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                if (sb2.length() != 0 && details.getHandlePresentation() == 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (k57.u0(sb2, "9953", false) && k57.m0(sb2, "99", false)) {
                    z3 = true;
                }
                String H2 = uq3.H(sb2);
                if (H2 != null) {
                    str = H2;
                }
                if (zn6 != null) {
                    if (!zn6.p && ((!zn6.l || !z) && ((!zn6.m || !z3) && (!zn6.n || !dh4.t(sb2))))) {
                        if (zn6.o && sb2.length() > 0) {
                            context.getClass();
                            if (sg3.A(context, "android.permission.READ_CONTACTS")) {
                                break;
                            }
                        }
                    }
                    callResponse = new CallScreeningService.CallResponse.Builder().setDisallowCall(true).setRejectCall(true).setSkipNotification(true).build();
                    callBlockService.respondToCall(details, callResponse);
                    return obj17;
                }
                callResponse = new CallScreeningService.CallResponse.Builder().build();
                callBlockService.respondToCall(details, callResponse);
                return obj17;
            case 3:
                Object obj18 = obj13;
                int i6 = ngVar.B;
                if (i6 == 0) {
                    o85.q(obj);
                    Rect rect = (Rect) ngVar.E;
                    se3 se3 = new se3(rect.left, rect.top, rect.right, rect.bottom);
                    ngVar.B = 1;
                    obj4 = ox0.a((ox0) ngVar.C, (ScrollCaptureSession) ngVar.D, se3, ngVar);
                    if (obj4 == obj14) {
                        return obj14;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj4 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((Consumer) ngVar.F).accept(o85.r((se3) obj4));
                return obj18;
            case 4:
                Object obj19 = obj13;
                int i7 = ngVar.B;
                if (i7 == 0) {
                    o85.q(obj);
                    ngVar.B = 1;
                    obj5 = f31.a((zy2) ngVar.C, (be8) ngVar.D, ngVar);
                    if (obj5 == obj14) {
                        return obj14;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj5 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((AtomicInteger) ngVar.E).set(((Number) obj5).intValue());
                ((ListenableFuture) ngVar.F).cancel(true);
                return obj19;
            case 5:
                int i8 = ngVar.B;
                if (i8 == 0) {
                    o85.q(obj);
                    ngVar.B = 1;
                    Object f = ConstraintTrackingWorker.f((ConstraintTrackingWorker) ngVar.C, (t84) ngVar.D, (zy2) ngVar.E, (be8) ngVar.F, ngVar);
                    if (f == obj14) {
                        return obj14;
                    }
                    return f;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 6:
                Object obj20 = obj13;
                int i9 = ngVar.B;
                if (i9 == 0) {
                    o85.q(obj);
                    s34 s34 = (s34) ngVar.C;
                    ngVar.B = 1;
                    pa5 pa5 = gi1.a;
                    Object a2 = u55.w(new rh1(s34, 0)).a(new nn0(s34, (vr2) ngVar.D, (vh0) ngVar.E, (re3) ngVar.F, 2), ngVar);
                    if (a2 != obj14) {
                        a2 = obj20;
                    }
                    if (a2 == obj14) {
                        return obj14;
                    }
                } else if (i9 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj20;
            case 7:
                Object obj21 = obj13;
                d37 d37 = (d37) ngVar.E;
                hs6 hs6 = (hs6) ngVar.C;
                int i10 = ngVar.B;
                if (i10 == 0) {
                    o85.q(obj);
                    int ordinal = hs6.ordinal();
                    if (ordinal == 0) {
                        ngVar.C = null;
                        ngVar.B = 1;
                        if (((di2) ngVar.D).a(d37, ngVar) == obj14) {
                            return obj14;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal == 2) {
                            Object obj22 = ngVar.F;
                            if (obj22 != qr6.a) {
                                d37.l((Object) null, obj22);
                            } else {
                                throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                            }
                        } else {
                            h.c();
                        }
                    }
                    return obj21;
                } else if (i10 == 1) {
                    o85.q(obj);
                    return obj21;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                Object obj23 = obj13;
                di2 di2 = (di2) ngVar.E;
                d37 d372 = (d37) ngVar.F;
                int i11 = ngVar.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            o85.q(obj);
                        } else if (!(i11 == 3 || i11 == 4)) {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    o85.q(obj);
                    return obj23;
                }
                o85.q(obj);
                x27 x27 = (x27) ngVar.D;
                if (x27 == is6.a) {
                    ngVar.B = 1;
                    break;
                } else {
                    if (x27 != is6.b) {
                        x67 h = d372.h();
                        w27 w27 = new w27(x27, (f61) null);
                        int i12 = zi2.a;
                        vc0 vc0 = vc0.w;
                        ngVar.B = 4;
                        break;
                    } else {
                        x67 h2 = d372.h();
                        ? a97 = new a97(2, (f61) null);
                        ngVar.B = 2;
                        break;
                    }
                    return obj14;
                }
                ngVar.B = 3;
                break;
            case 9:
                Object obj24 = obj13;
                ez4 ez4 = (ez4) ngVar.E;
                String str2 = (String) ngVar.D;
                np2 np2 = (np2) ngVar.C;
                int i13 = ngVar.B;
                if (i13 == 0) {
                    o85.q(obj);
                    sn2 sn2 = np2.b;
                    ngVar.B = 1;
                    obj6 = ((lo2) sn2).r(str2, ez4, (String) ngVar.F, ngVar);
                    if (obj6 == obj14) {
                        return obj14;
                    }
                } else if (i13 == 1) {
                    o85.q(obj);
                    obj6 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj6 instanceof m66)) {
                    np2.h(new qj((Object) ez4, (Object) str2, (Object) (String) obj6, (Object) np2, 4));
                    d37 d373 = np2.e;
                    do {
                        value2 = d373.getValue();
                    } while (!d373.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
                }
                Throwable a3 = o66.a(obj6);
                if (a3 != null) {
                    d37 d374 = np2.e;
                    do {
                        value = d374.getValue();
                    } while (!d374.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) a3), 1)));
                }
                return obj24;
            case 10:
                int i14 = ngVar.B;
                if (i14 == 0) {
                    o85.q(obj);
                    ? obj25 = new Object();
                    obj25.w = 1.0f;
                    o81 = (o81) ngVar.C;
                    e06 = obj25;
                    qj qjVar = new qj((Object) (aq4) ngVar.E, (Object) (lb3) ngVar.F, (Object) e06, (Object) o81, 8);
                    ngVar.C = o81;
                    ngVar.D = e06;
                    ngVar.B = 1;
                    if (ngVar.r().a0(me6.D) != null) {
                    }
                    ku4.a();
                } else if (i14 == 1) {
                    o85.q(obj);
                    e06 = (e06) ngVar.D;
                    o81 = (o81) ngVar.C;
                    if (e06.w == 0.0f) {
                    }
                    qj qjVar2 = new qj((Object) (aq4) ngVar.E, (Object) (lb3) ngVar.F, (Object) e06, (Object) o81, 8);
                    ngVar.C = o81;
                    ngVar.D = e06;
                    ngVar.B = 1;
                    if (ngVar.r().a0(me6.D) != null) {
                    }
                    ku4.a();
                } else if (i14 == 2) {
                    o85.q(obj);
                    e06 = (e06) ngVar.D;
                    o81 = (o81) ngVar.C;
                    qj qjVar22 = new qj((Object) (aq4) ngVar.E, (Object) (lb3) ngVar.F, (Object) e06, (Object) o81, 8);
                    ngVar.C = o81;
                    ngVar.D = e06;
                    ngVar.B = 1;
                    if (ngVar.r().a0(me6.D) != null) {
                        ku4.a();
                    } else {
                        if (pd8.s(ngVar.r()).a(qjVar22, ngVar) == obj14) {
                            return obj14;
                        }
                        if (e06.w == 0.0f) {
                            ze1 w = u55.w(new zh(21, (Object) o81));
                            ? a972 = new a97(2, (f61) null);
                            ngVar.C = o81;
                            ngVar.D = e06;
                            ngVar.B = 2;
                            if (gr8.I(w, a972, ngVar) == obj14) {
                                return obj14;
                            }
                        }
                        qj qjVar222 = new qj((Object) (aq4) ngVar.E, (Object) (lb3) ngVar.F, (Object) e06, (Object) o81, 8);
                        ngVar.C = o81;
                        ngVar.D = e06;
                        ngVar.B = 1;
                        if (ngVar.r().a0(me6.D) != null) {
                        }
                    }
                    ku4.a();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                mm7 mm7 = (mm7) ngVar.F;
                eg6 eg6 = (eg6) ngVar.E;
                oi6 oi6 = (oi6) ngVar.D;
                int i15 = ngVar.B;
                if (i15 == 0) {
                    o85.q(obj);
                    o81 o813 = (o81) ngVar.C;
                    ed5 ed5 = oi6.y;
                    ad5 ad5 = oi6.E;
                    if (sg3.e(ed5.getValue(), eg6)) {
                        obj7 = obj13;
                        long g = mm7.g() / 1000000;
                        if (sg3.e(mm7.d.getValue(), eg6)) {
                            yb5 = new yb5(new Float(1.0f), new Integer((int) ((1.0f - ad5.d()) * ((float) g))));
                        } else {
                            yb5 = new yb5(new Float(0.0f), new Integer((int) (ad5.d() * ((float) g))));
                        }
                        float floatValue = ((Number) yb5.w).floatValue();
                        int intValue = ((Number) yb5.x).intValue();
                        float d = ad5.d();
                        jo7 O = kl8.O(intValue, 6, (i12) null);
                        yt4 yt4 = new yt4(o813, floatValue, oi6, eg6);
                        ngVar.B = 2;
                        break;
                    } else {
                        ngVar.B = 1;
                        break;
                    }
                    return obj14;
                } else if (i15 == 1 || i15 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj7 = obj13;
                return obj7;
            case 12:
                zs4 zs4 = (zs4) ngVar.E;
                oi6 oi62 = (oi6) ngVar.D;
                int i16 = ngVar.B;
                if (i16 == 0) {
                    o85.q(obj);
                    o81 o814 = (o81) ngVar.C;
                    ed5 ed52 = oi62.y;
                    ad5 ad52 = oi62.E;
                    if (!sg3.e(ed52.getValue(), zs4)) {
                        ngVar.B = 1;
                        if (oi6.i1(oi62, zs4, ngVar) != obj14) {
                            return obj13;
                        }
                    } else {
                        float d2 = ad52.d();
                        jo7 O2 = kl8.O((int) (ad52.d() * ((float) (((mm7) ngVar.F).g() / 1000000))), 6, (i12) null);
                        ou4 ou4 = new ou4((Object) o814, (Object) oi62, (Object) zs4, 1);
                        ngVar.B = 2;
                        if (i95.e(d2, 0.0f, O2, ou4, ngVar, 4) != obj14) {
                            return obj13;
                        }
                    }
                    return obj14;
                } else if (i16 == 1 || i16 == 2) {
                    o85.q(obj);
                    return obj13;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int i17 = ngVar.B;
                y02 y02 = y02.MILLISECONDS;
                if (i17 == 0) {
                    o85.q(obj);
                    wj5 = (wj5) ngVar.E;
                    qq4 qq4 = wj5.e;
                    ngVar.C = qq4;
                    ngVar.D = wj5;
                    ngVar.B = 1;
                    Object a4 = qq4.a(ngVar);
                    oq43 = qq4;
                    if (a4 == obj14) {
                        return obj14;
                    }
                } else if (i17 == 1) {
                    wj5 = (wj5) ngVar.D;
                    o85.q(obj);
                    oq43 = (oq4) ngVar.C;
                } else if (i17 == 2) {
                    oq4 oq46 = ngVar.C;
                    try {
                        oq44 = oq46;
                        o85.q(obj);
                        oq44 = oq46;
                        obj8 = obj;
                        oq42 = oq46;
                        r3 = pa4.i(obj8);
                        oq4 = oq42;
                        oq4.k((Object) null);
                        xb4 xb4 = u02.x;
                        long f0 = gl0.f0(200, y02);
                        k05 k05 = new k05(r3, (gs2) ngVar.F, (f61) null, 5);
                        ngVar.C = null;
                        ngVar.D = null;
                        ngVar.B = 3;
                        D2 = b35.D(t49.d0(f0), k05, ngVar);
                        if (D2 != obj14) {
                            return obj14;
                        }
                        return D2;
                    } catch (Throwable th2) {
                        oq44.k((Object) null);
                        throw th2;
                    }
                } else if (i17 == 3) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oq44 = oq43;
                TextClassifier textClassifier = wj5.f;
                if (textClassifier != null) {
                    oq4 = oq43;
                    break;
                }
                xb4 xb42 = u02.x;
                long f02 = gl0.f0(300, y02);
                f70 f70 = new f70(wj5, (f61) null, 9);
                ngVar.C = oq43;
                ngVar.D = null;
                ngVar.B = 2;
                obj8 = b35.D(t49.d0(f02), f70, ngVar);
                oq42 = oq43;
                if (obj8 == obj14) {
                    return obj14;
                }
                textClassifier = pa4.i(obj8);
                oq4 = oq42;
                oq4.k((Object) null);
                xb4 xb43 = u02.x;
                long f03 = gl0.f0(200, y02);
                k05 k052 = new k05(textClassifier, (gs2) ngVar.F, (f61) null, 5);
                ngVar.C = null;
                ngVar.D = null;
                ngVar.B = 3;
                D2 = b35.D(t49.d0(f03), k052, ngVar);
                if (D2 != obj14) {
                }
            case 14:
                da0 da0 = (da0) ngVar.F;
                int i18 = ngVar.B;
                if (i18 == 0) {
                    o85.q(obj);
                    URLConnection openConnection = g46.a((g46) ngVar.C).openConnection();
                    openConnection.getClass();
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : ((Map) ngVar.D).entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb3.append(readLine);
                            } else {
                                bufferedReader.close();
                                inputStream.close();
                                JSONObject jSONObject = new JSONObject(sb3.toString());
                                ngVar.B = 1;
                                if (((k05) ngVar.E).H(jSONObject, ngVar) != obj14) {
                                    return obj13;
                                }
                            }
                        }
                    } else {
                        ngVar.B = 2;
                        da0.H("Bad response code: " + responseCode, ngVar);
                        if (obj13 != obj14) {
                            return obj13;
                        }
                    }
                    return obj14;
                } else if (i18 == 1 || i18 == 2) {
                    try {
                        o85.q(obj);
                        return obj13;
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = e.toString();
                        }
                        ngVar.B = 3;
                        da0.H(message, ngVar);
                        if (obj13 != obj14) {
                            return obj13;
                        }
                    }
                } else if (i18 == 3) {
                    o85.q(obj);
                    return obj13;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case h75.g:
                int i19 = ngVar.B;
                if (i19 == 0) {
                    o85.q(obj);
                    qq4 qq42 = (qq4) ngVar.E;
                    gs2 gs22 = (gs2) ngVar.F;
                    ngVar.C = qq42;
                    ngVar.D = (a97) gs22;
                    ngVar.B = 1;
                    if (qq42.a(ngVar) != obj14) {
                        gs2 gs23 = gs22;
                        oq45 = qq42;
                        gs2 = gs23;
                    }
                    return obj14;
                } else if (i19 == 1) {
                    gs2 = (gs2) ((a97) ngVar.D);
                    oq45 = (oq4) ngVar.C;
                    o85.q(obj);
                } else if (i19 == 2) {
                    oq45 = ngVar.C;
                    try {
                        o85.q(obj);
                        oq45.k((Object) null);
                        return obj13;
                    } catch (Throwable th3) {
                        oq45.k((Object) null);
                        throw th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn5 fn5 = new fn5(gs2, (f61) null, 2);
                ngVar.C = oq45;
                ngVar.D = null;
                ngVar.B = 2;
                break;
            case 16:
                int i20 = ngVar.B;
                if (i20 == 0) {
                    o85.q(obj);
                    dn1 dn1 = aw1.a;
                    gy2 gy2 = pe4.a.B;
                    f7 f7Var = new f7((in8) ngVar.D, (k54) ngVar.E, (o81) ngVar.C, (gs2) ngVar.F, (f61) null, 9);
                    ngVar.B = 1;
                    if (ar7.e0(gy2, f7Var, ngVar) == obj14) {
                        return obj14;
                    }
                    return obj13;
                } else if (i20 == 1) {
                    o85.q(obj);
                    return obj13;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 17:
                int i21 = ngVar.B;
                if (i21 == 0) {
                    o85.q(obj);
                    c81 a0 = ((o81) ngVar.C).k().a0(hz2.z);
                    a0.getClass();
                    h81 h81 = (h81) a0;
                    e81 D0 = rc9.D0(h81, new il7(h81));
                    e81 X = D0.X(new hh7(D0, ((a96) ngVar.D).i));
                    f61 = (kk0) ngVar.E;
                    ngVar.C = f61;
                    ngVar.B = 1;
                    obj9 = ar7.e0(X, (k05) ngVar.F, ngVar);
                    if (obj9 == obj14) {
                        return obj14;
                    }
                } else if (i21 == 1) {
                    o85.q(obj);
                    f61 = (f61) ngVar.C;
                    obj9 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f61.f(obj9);
                return obj13;
            case 18:
                AtomicReference atomicReference = (AtomicReference) ngVar.E;
                int i22 = ngVar.B;
                if (i22 == 0) {
                    o85.q(obj);
                    o81 o815 = (o81) ngVar.C;
                    zm6 = new zm6(r16.Q(o815.k()), ((vr2) ngVar.D).y(o815));
                    zm6 zm63 = (zm6) atomicReference.getAndSet(zm6);
                    if (zm63 != null) {
                        el3 el3 = zm63.a;
                        ngVar.C = zm6;
                        ngVar.B = 1;
                        el3.o((CancellationException) null);
                        Object j0 = el3.j0(ngVar);
                        if (j0 == obj14) {
                            obj13 = j0;
                        }
                        if (obj13 == obj14) {
                            return obj14;
                        }
                        zm62 = zm6;
                        zm6 = zm62;
                    }
                    Object obj26 = zm6.b;
                    ngVar.C = zm6;
                    ngVar.B = 2;
                    H = ((gs2) ngVar.F).H(obj26, ngVar);
                    if (H == obj14) {
                    }
                } else if (i22 == 1) {
                    zm62 = (zm6) ngVar.C;
                    o85.q(obj);
                    zm6 = zm62;
                    Object obj262 = zm6.b;
                    ngVar.C = zm6;
                    ngVar.B = 2;
                    H = ((gs2) ngVar.F).H(obj262, ngVar);
                    if (H == obj14) {
                        return obj14;
                    }
                } else if (i22 == 2) {
                    zm6 = ngVar.C;
                    try {
                        o85.q(obj);
                        H = obj;
                    } catch (Throwable th4) {
                        while (!atomicReference.compareAndSet(zm6, (Object) null) && atomicReference.get() == zm6) {
                            while (!atomicReference.compareAndSet(zm6, (Object) null) && atomicReference.get() == zm6) {
                            }
                        }
                        throw th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zm6 zm64 = zm6;
                while (!atomicReference.compareAndSet(zm64, (Object) null) && atomicReference.get() == zm64) {
                    while (!atomicReference.compareAndSet(zm64, (Object) null) && atomicReference.get() == zm64) {
                    }
                }
                return H;
            case 19:
                return v(obj);
            case 20:
                t17 t17 = (t17) ngVar.D;
                d37 d375 = (d37) ngVar.C;
                int i23 = ngVar.B;
                if (i23 == 0) {
                    o85.q(obj);
                    do {
                        value6 = d375.getValue();
                    } while (!d375.i(value6, b81.h((Object) null, (is7) value6, (Object) null, true, 1)));
                    e17 = (e17) ((is7) d375.getValue()).a;
                    ngVar.F = e17;
                    ngVar.B = 1;
                    obj10 = t17.b.c((dz4) ngVar.E, ngVar);
                    break;
                } else if (i23 == 1) {
                    e17 = (e17) ngVar.F;
                    o85.q(obj);
                    obj10 = ((o66) obj).w;
                } else if (i23 == 2) {
                    e17 = ngVar.F;
                    try {
                        o85.q(obj);
                        obj11 = ((o66) obj).w;
                        o85.q(obj11);
                        obj10 = (List) obj11;
                    } catch (Throwable th5) {
                        obj10 = new m66(th5);
                    }
                    e17 e172 = e17;
                    if (!(obj10 instanceof m66)) {
                        obj10 = e17.a(e172, (List) obj10, (r11) null, (String) null, (String) null, false, new hv2(25, (Object) Boolean.TRUE), 30);
                    }
                    z2 = obj10 instanceof m66;
                    if (z2) {
                        if (z2) {
                            obj10 = null;
                        }
                        if (obj10 != null) {
                            do {
                                value5 = d375.getValue();
                            } while (!d375.i(value5, is7.a((is7) value5, obj10, false, (hv2) null, 4)));
                            return obj13;
                        }
                        do {
                            value4 = d375.getValue();
                        } while (!d375.i(value4, is7.a((is7) value4, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                        return obj13;
                    }
                    do {
                        value3 = d375.getValue();
                    } while (!d375.i(value3, is7.a((is7) value3, (Object) null, false, new hv2(25, (Object) o66.a(obj10)), 1)));
                    return obj13;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj10 instanceof m66)) {
                    vs7 vs7 = (vs7) obj10;
                    d17 d17 = t17.b;
                    ngVar.F = e17;
                    ngVar.B = 2;
                    obj11 = d17.e(ngVar);
                    break;
                }
                e17 e1722 = e17;
                if (!(obj10 instanceof m66)) {
                }
                z2 = obj10 instanceof m66;
                if (z2) {
                }
            case 21:
                return x(obj);
            case 22:
                return z(obj);
            case 23:
                return A(obj);
            case 24:
                return B(obj);
            case 25:
                return G(obj);
            case 26:
                return I(obj);
            case 27:
                return L(obj);
            default:
                if (ngVar.B != 0) {
                    o85.q(obj);
                    aq4 = (aq4) ngVar.C;
                    obj12 = obj;
                } else {
                    o85.q(obj);
                    jb9 jb9 = (jb9) ngVar.D;
                    if (jb9 == null) {
                        return obj13;
                    }
                    aq4 = (aq4) ngVar.F;
                    ngVar.C = aq4;
                    ngVar.B = 1;
                    obj12 = ((bs8) ngVar.E).e(jb9, ngVar);
                    if (obj12 == obj14) {
                        return obj14;
                    }
                }
                aq4.setValue((String) obj12);
                return obj13;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng(uk5 uk5, hs2 hs2, vr2 vr2, f61 f61) {
        super(2, f61);
        this.A = 22;
        this.E = uk5;
        this.F = hs2;
        this.D = vr2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(d37 d37, f61 f61, r58 r58, Object obj, int i) {
        super(2, f61);
        this.A = i;
        this.C = d37;
        this.D = r58;
        this.E = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.F = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
        this.F = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(Object obj, Object obj2, Object obj3, Object obj4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
    }
}
