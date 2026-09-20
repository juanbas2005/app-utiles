package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* renamed from: vh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vh4 {
    public final MeasurementManager a;

    public vh4(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.a = measurementManager;
    }

    public static Object b(vh4 vh4, pp1 pp1, f61<? super vs7> f61) {
        new kk0(1, rc9.a0(f61)).v();
        MeasurementManager measurementManager = vh4.a;
        throw null;
    }

    public static Object d(vh4 vh4, f61<? super Integer> f61) {
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        vh4.a.getMeasurementApiStatus(new or(1), new i61(kk0));
        return kk0.t();
    }

    public static Object g(vh4 vh4, wy6 wy6, f61<? super vs7> f61) {
        Object L = gl0.L(new tc1(vh4, (f61) null, 9), f61);
        if (L == p81.w) {
            return L;
        }
        return vs7.a;
    }

    public static Object h(vh4 vh4, Uri uri, InputEvent inputEvent, f61<? super vs7> f61) {
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        vh4.a.registerSource(uri, inputEvent, new or(1), new i61(kk0));
        Object t = kk0.t();
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    public static Object j(vh4 vh4, Uri uri, f61<? super vs7> f61) {
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        vh4.a.registerTrigger(uri, new or(1), new i61(kk0));
        Object t = kk0.t();
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    public static Object l(vh4 vh4, q88 q88, f61<? super vs7> f61) {
        new kk0(1, rc9.a0(f61)).v();
        MeasurementManager measurementManager = vh4.a;
        throw null;
    }

    public static Object n(vh4 vh4, r88 r88, f61<? super vs7> f61) {
        new kk0(1, rc9.a0(f61)).v();
        MeasurementManager measurementManager = vh4.a;
        throw null;
    }

    public Object a(pp1 pp1, f61<? super vs7> f61) {
        return b(this, pp1, f61);
    }

    public Object c(f61<? super Integer> f61) {
        return d(this, f61);
    }

    public Object e(wy6 wy6, f61<? super vs7> f61) {
        return g(this, wy6, f61);
    }

    public Object f(Uri uri, InputEvent inputEvent, f61<? super vs7> f61) {
        return h(this, uri, inputEvent, f61);
    }

    public Object i(Uri uri, f61<? super vs7> f61) {
        return j(this, uri, f61);
    }

    public Object k(q88 q88, f61<? super vs7> f61) {
        return l(this, q88, f61);
    }

    public Object m(r88 r88, f61<? super vs7> f61) {
        return n(this, r88, f61);
    }
}
