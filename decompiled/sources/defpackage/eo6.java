package defpackage;

import android.util.Log;
import com.google.firebase.sessions.settings.SessionConfigs;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eo6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eo6 {
    public final mi7 a;
    public final qe1 b;
    public final AtomicReference c = new AtomicReference();

    public eo6(e81 e81, mi7 mi7, qe1 qe1) {
        e81.getClass();
        mi7.getClass();
        qe1.getClass();
        this.a = mi7;
        this.b = qe1;
        ar7.H(gl0.E(e81), (e81) null, (r81) null, new co6(this, (f61) null, 0), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0015 A[LOOP:0: B:3:0x0015->B:6:0x0020, LOOP_START] */
    public final SessionConfigs a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object U = ar7.U(x32.w, new co6(this, (f61) null, 1));
            while (!atomicReference.compareAndSet((Object) null, U) && atomicReference.get() == null) {
                while (!atomicReference.compareAndSet((Object) null, U) && atomicReference.get() == null) {
                }
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (SessionConfigs) obj;
    }

    public final boolean b() {
        Long cacheUpdatedTimeSeconds = a().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = a().getCacheDurationSeconds();
        if (cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null) {
            return true;
        }
        this.a.getClass();
        if (mi7.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() < ((long) cacheDurationSeconds.intValue())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object c(SessionConfigs sessionConfigs, h61 h61) {
        do6 do6;
        int i;
        if (h61 instanceof do6) {
            do6 = (do6) h61;
            int i2 = do6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                do6.B = i2 - Integer.MIN_VALUE;
                Object obj = do6.z;
                i = do6.B;
                if (i != 0) {
                    o85.q(obj);
                    qe1 qe1 = this.b;
                    f70 f70 = new f70(sessionConfigs, (f61) null, 13);
                    do6.B = 1;
                    Object a2 = qe1.a(f70, do6);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                    } catch (IOException e) {
                        Log.w("FirebaseSessions", "Failed to update config values: " + e);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        do6 = new do6(this, h61);
        Object obj2 = do6.z;
        i = do6.B;
        if (i != 0) {
        }
        return vs7.a;
    }
}
