package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i91 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ z00 d;
    public final /* synthetic */ k91 e;

    public i91(k91 k91, long j, Throwable th, Thread thread, z00 z00) {
        this.e = k91;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = z00;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [qz, java.lang.Object] */
    public final Object call() {
        String str;
        Boolean bool;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean z;
        long j = this.a;
        long j2 = j / 1000;
        k91 k91 = this.e;
        NavigableSet c2 = ((wa1) k91.m.y).c();
        if (!c2.isEmpty()) {
            str = (String) c2.first();
        } else {
            str = null;
        }
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", (Throwable) null);
            return b35.l((Object) null);
        }
        k91.c.l();
        kd6 kd6 = k91.m;
        kd6.getClass();
        String concat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, (Throwable) null);
        }
        sa1 sa1 = (sa1) kd6.x;
        Context context = sa1.a;
        int i = context.getResources().getConfiguration().orientation;
        hv2 hv2 = sa1.d;
        Stack stack = new Stack();
        for (Throwable th = this.b; th != null; th = th.getCause()) {
            stack.push(th);
        }
        am6 am6 = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            am6 = new am6(th2.getLocalizedMessage(), th2.getClass().getName(), hv2.n(th2.getStackTrace()), am6, 29);
        }
        am6 am62 = am6;
        ? obj = new Object();
        obj.b = "crash";
        obj.a = j2;
        obj.g = (byte) (obj.g | 1);
        ga1 p = d63.J.p(context);
        int i2 = ((b00) p).c;
        if (i2 > 0) {
            if (i2 != 100) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        ArrayList o = d63.o(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) am62.z;
        Thread thread = this.c;
        String name = thread.getName();
        if (name != null) {
            int i3 = i;
            List d2 = sa1.d(stackTraceElementArr, 4);
            if (d2 != null) {
                qz qzVar = obj;
                arrayList.add(new xz(name, 4, d2));
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry next = it2.next();
                    Thread thread2 = (Thread) next.getKey();
                    if (!thread2.equals(thread)) {
                        StackTraceElement[] n = hv2.n((StackTraceElement[]) next.getValue());
                        String name2 = thread2.getName();
                        if (name2 != null) {
                            List d3 = sa1.d(n, 0);
                            if (d3 != null) {
                                it = it2;
                                arrayList.add(new xz(name2, 0, d3));
                            } else {
                                ku4.j("Null frames");
                                return null;
                            }
                        } else {
                            ku4.j("Null name");
                            return null;
                        }
                    } else {
                        it = it2;
                    }
                    it2 = it;
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                vz c3 = sa1.c(am62, 0);
                wz e2 = sa1.e();
                List a2 = sa1.a();
                if (a2 != null) {
                    qz qzVar2 = qzVar;
                    qzVar2.c = new sz(new tz(unmodifiableList, c3, (t91) null, e2, a2), (List) null, (List) null, bool, p, o, i3);
                    qzVar2.d = sa1.b(i3);
                    cw0 cw0 = (cw0) kd6.B;
                    ((wa1) kd6.y).d(kd6.v(kd6.u(qzVar2.a(), (qc3) kd6.A, cw0, b42.w), cw0), str, true);
                    try {
                        md2 md2 = k91.g;
                        String str2 = ".ae" + j;
                        md2.getClass();
                        if (new File((File) md2.d, str2).createNewFile()) {
                            z00 z00 = this.d;
                            k91.b(false, z00, false);
                            k91.c(new jg0().a, Boolean.FALSE);
                            if (!k91.b.a()) {
                                return b35.l((Object) null);
                            }
                            return ((xb7) ((AtomicReference) z00.i).get()).a.l((ya1) k91.e.x, new ji8(this, str));
                        }
                        throw new IOException("Create new file failed.");
                    } catch (IOException e3) {
                        Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e3);
                    }
                } else {
                    ku4.j("Null binaries");
                    return null;
                }
            } else {
                ku4.j("Null frames");
                return null;
            }
        } else {
            ku4.j("Null name");
            return null;
        }
    }
}
