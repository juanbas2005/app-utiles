package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Handler;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Window;
import android.widget.TextView;
import com.google.protobuf.a;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class wv2 implements qj4, k55, c55, x45, w41, lr, du6, ot0, yp0, a76, s61 {
    public static volatile wv2 y;
    public final /* synthetic */ int w;
    public Object x;

    public wv2(int i) {
        this.w = i;
        switch (i) {
            case 5:
                this.x = new AtomicInteger(0);
                return;
            case 6:
                this.x = new br4(25, (byte) 0);
                return;
            case 8:
                this.x = new CountDownLatch(1);
                return;
            case 16:
                return;
            case 20:
                this.x = new kb9(5);
                return;
            case 23:
                te4 te4 = new te4();
                this.x = te4;
                if (!te4.x) {
                    if (te4.y) {
                        wm5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    te4.a();
                    te4.y = true;
                    return;
                }
                return;
            default:
                this.x = new HashSet();
                return;
        }
    }

    public void a(ti4 ti4, boolean z) {
        boolean z2;
        int i;
        vo voVar;
        int i2 = 0;
        switch (this.w) {
            case 1:
                if (ti4 instanceof i67) {
                    ((i67) ti4).z.k().c(false);
                }
                qj4 qj4 = ((d8) this.x).A;
                if (qj4 != null) {
                    qj4.a(ti4, z);
                    return;
                }
                return;
            default:
                wo woVar = (wo) this.x;
                ti4 k = ti4.k();
                if (k != ti4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    ti4 = k;
                }
                vo[] voVarArr = woVar.h0;
                if (voVarArr != null) {
                    i = voVarArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i2 >= i) {
                        voVar = null;
                    } else {
                        voVar = voVarArr[i2];
                        if (voVar == null || voVar.h != ti4) {
                            i2++;
                        }
                    }
                }
                if (voVar == null) {
                    return;
                }
                if (z2) {
                    woVar.r(voVar.a, voVar, k);
                    woVar.u(voVar, true);
                    return;
                }
                woVar.u(voVar, z);
                return;
        }
    }

    public ClipData b() {
        return ((ContentInfo) this.x).getClip();
    }

    public long c() {
        kp1 kp1 = (kp1) this.x;
        y76 y76 = (y76) h49.w(kp1, d86.b);
        return ((zg4) h49.w(kp1, ch4.b)).a.f;
    }

    public Object d(eh6 eh6, Float f, Float f2, vr2 vr2, zw6 zw6) {
        Object d = t35.d(eh6, f.floatValue(), gr8.a(0.0f, f2.floatValue(), 28), (tj1) this.x, vr2, zw6);
        if (d == p81.w) {
            return d;
        }
        return (el) d;
    }

    public int e() {
        return ((ContentInfo) this.x).getSource();
    }

    public void f() {
        ((CountDownLatch) this.x).countDown();
    }

    public void g(Object obj) {
        ((CountDownLatch) this.x).countDown();
    }

    public int h() {
        return ((ContentInfo) this.x).getFlags();
    }

    public ContentInfo i() {
        return (ContentInfo) this.x;
    }

    public void j(Exception exc) {
        ((CountDownLatch) this.x).countDown();
    }

    public void k(g73 g73, List list) {
        g73.getClass();
        gs4 gs4 = (gs4) this.x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q61 q61 = (q61) it.next();
            gs4.e.put(q61.a, q61.b);
        }
    }

    public gx5 l() {
        pv1 l;
        l90 l90 = (l90) this.x;
        rv1 rv1 = (rv1) l90.d;
        synchronized (rv1) {
            l90.a(true);
            l = rv1.l(((ov1) l90.b).a);
        }
        if (l != null) {
            return new gx5(l);
        }
        return null;
    }

    public void lock() {
        ((ReentrantLock) this.x).lock();
    }

    public boolean m(ti4 ti4) {
        Window.Callback callback;
        switch (this.w) {
            case 1:
                d8 d8Var = (d8) this.x;
                if (ti4 != d8Var.y) {
                    ((i67) ti4).A.getClass();
                    qj4 qj4 = d8Var.A;
                    if (qj4 != null) {
                        return qj4.m(ti4);
                    }
                }
                return false;
            default:
                wo woVar = (wo) this.x;
                if (ti4 != ti4.k() || !woVar.b0 || (callback = woVar.H.getCallback()) == null || woVar.m0) {
                    return true;
                }
                callback.onMenuOpened(108, ti4);
                return true;
        }
    }

    public void n() {
        ((dq2) this.x).O.S();
    }

    public void o() {
        synchronized (((nz0) this.x).h) {
            try {
                nz0 nz0 = (nz0) this.x;
                if (nz0.a) {
                    ((Handler) nz0.d).obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(z00 z00, Thread thread, Throwable th) {
        k91 k91 = (k91) this.x;
        synchronized (k91) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, (Throwable) null);
                }
                x91.G();
                h18.a(((ya1) k91.e.x).b(new i91(k91, System.currentTimeMillis(), th, thread, z00)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", (Throwable) null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public List q(g73 g73) {
        g73.getClass();
        ConcurrentHashMap concurrentHashMap = ((gs4) this.x).e;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            if (sg3.e(d57.k1(str).toString(), str)) {
                str2.getClass();
                if (sg3.e(d57.k1(str2).toString(), str2)) {
                    String str3 = g73.d;
                    str3.getClass();
                    String b = bg8.b(str3);
                    if (b != null) {
                        arrayList.add(new q61(str, str2, 253402300799999L, b, "/", false, false, false, false, (String) null));
                    } else {
                        h.q("unexpected domain: ".concat(str3));
                        return null;
                    }
                } else {
                    h.q("value is not trimmed");
                    return null;
                }
            } else {
                h.q("name is not trimmed");
                return null;
            }
        }
        return arrayList;
    }

    public void r(Activity activity) {
        kb9 kb9 = (kb9) this.x;
        ArrayList arrayList = (ArrayList) kb9.z;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((dr2) kb9.A);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, f06] */
    public ArrayList s(int i) {
        vr2 vr2;
        d04 d04;
        ArrayList arrayList = new ArrayList();
        n04 n04 = (n04) this.x;
        ix6 h = j45.h();
        if (h != null) {
            vr2 = h.e();
        } else {
            vr2 = null;
        }
        ix6 j = j45.j(h);
        try {
            if (n04.b) {
                d04 = n04.c;
            } else {
                d04 = (d04) n04.e.getValue();
            }
            d04 d042 = d04;
            if (d042 != null) {
                ? obj = new Object();
                obj.w = 1;
                List list = (List) d042.k.y(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                f06 f06 = obj;
                while (i2 < size) {
                    yb5 yb5 = (yb5) list.get(i2);
                    t24 t24 = n04.o;
                    int intValue = ((Number) yb5.w).intValue();
                    long j2 = ((k31) yb5.x).a;
                    kg5 kg5 = n04.w;
                    f06 f062 = f06;
                    arrayList.add(t24.a(intValue, j2, false, new qj((ArrayList) null, f062, list, i, d042)));
                    i2++;
                    f06 = f062;
                }
            }
            j45.m(h, j, vr2);
            return arrayList;
        } catch (Throwable th) {
            j45.m(h, j, vr2);
            throw th;
        }
    }

    public void t(int i, Object obj, og6 og6) {
        vs0 vs0 = (vs0) this.x;
        vs0.o(i, 3);
        og6.h((a) obj, vs0.a);
        vs0.o(i, 4);
    }

    public String toString() {
        switch (this.w) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.x) + "}";
            default:
                return super.toString();
        }
    }

    public xp0 u(gq0 gq0) {
        xp0 u;
        gq0.getClass();
        up2 up2 = gq0.a;
        up2.getClass();
        ArrayList arrayList = new ArrayList();
        ((ba5) this.x).b(up2, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x95 x95 = (x95) it.next();
            if ((x95 instanceof rd0) && (u = ((rd0) x95).E.u(gq0)) != null) {
                return u;
            }
        }
        return null;
    }

    public void unlock() {
        ((ReentrantLock) this.x).unlock();
    }

    public void v(int i, Object obj, og6 og6) {
        vs0 vs0 = (vs0) this.x;
        a aVar = (a) obj;
        vs0.o(i, 2);
        vs0.p(aVar.h(og6));
        og6.h(aVar, vs0.a);
    }

    public wv2(vs0 vs0) {
        this.w = 7;
        Charset charset = rf3.a;
        if (vs0 != null) {
            this.x = vs0;
            vs0.a = this;
            return;
        }
        ku4.j("output");
        throw null;
    }

    public /* synthetic */ wv2(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r8 == 1) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[LOOP:1: B:18:0x0047->B:19:0x0049, LOOP_END] */
    public wv2(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        float[] fArr3 = fArr;
        int i3 = 4;
        this.w = 4;
        int length2 = fArr3.length - 1;
        nr[][] nrVarArr = new nr[length2][];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length2) {
            int i7 = iArr[i6];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != i3) {
                                i8 = 5;
                                if (i7 != 5) {
                                    i = i5;
                                }
                            } else {
                                i = i3;
                            }
                            float[] fArr4 = fArr2[i6];
                            int i9 = i6 + 1;
                            float[] fArr5 = fArr2[i9];
                            float f = fArr3[i6];
                            float f2 = fArr3[i9];
                            length = (fArr4.length % 2) + (fArr4.length / 2);
                            nr[] nrVarArr2 = new nr[length];
                            i2 = 0;
                            while (i2 < length) {
                                int i10 = i2 * 2;
                                int i11 = i10 + 1;
                                int i12 = i2;
                                nrVarArr2[i12] = new nr(i, f, f2, fArr4[i10], fArr4[i11], fArr5[i10], fArr5[i11]);
                                i2 = i12 + 1;
                            }
                            nrVarArr[i6] = nrVarArr2;
                            i6 = i9;
                            i5 = i;
                            i3 = 4;
                        }
                    }
                    i4 = 2;
                    i = i4;
                    float[] fArr42 = fArr2[i6];
                    int i92 = i6 + 1;
                    float[] fArr52 = fArr2[i92];
                    float f3 = fArr3[i6];
                    float f22 = fArr3[i92];
                    length = (fArr42.length % 2) + (fArr42.length / 2);
                    nr[] nrVarArr22 = new nr[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    nrVarArr[i6] = nrVarArr22;
                    i6 = i92;
                    i5 = i;
                    i3 = 4;
                }
                i4 = 1;
                i = i4;
                float[] fArr422 = fArr2[i6];
                int i922 = i6 + 1;
                float[] fArr522 = fArr2[i922];
                float f32 = fArr3[i6];
                float f222 = fArr3[i922];
                length = (fArr422.length % 2) + (fArr422.length / 2);
                nr[] nrVarArr222 = new nr[length];
                i2 = 0;
                while (i2 < length) {
                }
                nrVarArr[i6] = nrVarArr222;
                i6 = i922;
                i5 = i;
                i3 = 4;
            }
            i = i8;
            float[] fArr4222 = fArr2[i6];
            int i9222 = i6 + 1;
            float[] fArr5222 = fArr2[i9222];
            float f322 = fArr3[i6];
            float f2222 = fArr3[i9222];
            length = (fArr4222.length % 2) + (fArr4222.length / 2);
            nr[] nrVarArr2222 = new nr[length];
            i2 = 0;
            while (i2 < length) {
            }
            nrVarArr[i6] = nrVarArr2222;
            i6 = i9222;
            i5 = i;
            i3 = 4;
        }
        this.x = nrVarArr;
    }

    public wv2(TextView textView) {
        this.w = 17;
        this.x = new m32(textView);
    }

    public wv2(ContentInfo contentInfo) {
        this.w = 9;
        contentInfo.getClass();
        this.x = v41.m(contentInfo);
    }
}
