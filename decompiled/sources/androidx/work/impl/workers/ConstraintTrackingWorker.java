package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "z21", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object f(ConstraintTrackingWorker constraintTrackingWorker, t84 t84, zy2 zy2, be8 be8, h61 h61) {
        a31 a31;
        int i;
        if (h61 instanceof a31) {
            a31 = (a31) h61;
            int i2 = a31.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a31.B = i2 - Integer.MIN_VALUE;
                Object obj = a31.z;
                i = a31.B;
                if (i != 0) {
                    o85.q(obj);
                    f7 f7Var = new f7(t84, zy2, be8, (f61) null);
                    a31.B = 1;
                    obj = gl0.L(f7Var, a31);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return obj;
            }
        }
        a31 = new a31(constraintTrackingWorker, h61);
        Object obj2 = a31.z;
        i = a31.B;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    public static final Object g(ConstraintTrackingWorker constraintTrackingWorker, h61 h61) {
        b31 b31;
        int i;
        Object obj;
        t84 t84;
        int i2;
        String str;
        ConstraintTrackingWorker constraintTrackingWorker2 = constraintTrackingWorker;
        h61 h612 = h61;
        AtomicInteger atomicInteger = constraintTrackingWorker2.c;
        WorkerParameters workerParameters = constraintTrackingWorker2.g;
        Context context = constraintTrackingWorker2.a;
        WorkerParameters workerParameters2 = constraintTrackingWorker2.b;
        if (h612 instanceof b31) {
            b31 = (b31) h612;
            int i3 = b31.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b31.C = i3 - Integer.MIN_VALUE;
                b31 b312 = b31;
                Object obj2 = b312.A;
                i = b312.C;
                Object obj3 = null;
                if (i != 0) {
                    o85.q(obj2);
                    Object obj4 = workerParameters2.b.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    if (obj4 instanceof String) {
                        str = (String) obj4;
                    } else {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        bc4.k().h(f31.a, "No worker to delegate to.");
                        return new p84();
                    }
                    nd8 c = nd8.c(context);
                    fe8 w = c.c.w();
                    String uuid = workerParameters2.a.toString();
                    uuid.getClass();
                    be8 e = w.e(uuid);
                    if (e == null) {
                        return new p84();
                    }
                    zk7 zk7 = c.j;
                    zk7.getClass();
                    zy2 zy2 = new zy2(zk7);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zy2.w.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj5 = obj3;
                        if (((j21) next).a(e)) {
                            arrayList.add(next);
                        }
                        obj3 = obj5;
                    }
                    obj = obj3;
                    if (!arrayList.isEmpty()) {
                        bc4 k = bc4.k();
                        String str2 = bd8.a;
                        StringBuilder sb = new StringBuilder("Work ");
                        sb.append(e.a);
                        sb.append(" constrained by ");
                        StringBuilder sb2 = sb;
                        sb2.append(dt0.E0(arrayList, (String) null, (String) null, (String) null, new rb8(1), 31));
                        k.e(str2, sb2.toString());
                    }
                    if (!arrayList.isEmpty()) {
                        String str3 = f31.a;
                        bc4.k().e(str3, "Constraints not met for delegate " + str + ". Requesting retry.");
                        return new Object();
                    }
                    bc4.k().e(f31.a, "Constraints met for delegate ".concat(str));
                    try {
                        td0 td0 = workerParameters2.g;
                        context.getClass();
                        t84 = td0.s(context, str, workerParameters);
                        iy2 iy2 = workerParameters.f.d;
                        iy2.getClass();
                        try {
                            h81 l = we.l(iy2);
                            t84 t842 = t84;
                            try {
                                ng ngVar = new ng(constraintTrackingWorker, t842, zy2, e, (f61) null, 5);
                                b312.z = t842;
                                b312.C = 1;
                                obj2 = ar7.e0(l, ngVar, b312);
                                p81 p81 = p81.w;
                                if (obj2 == p81) {
                                    return p81;
                                }
                                t84 = t842;
                            } catch (CancellationException e2) {
                                e = e2;
                                t84 = t842;
                                if (Build.VERSION.SDK_INT >= 31) {
                                }
                                t84.c.compareAndSet(-256, i2);
                                if (!(e instanceof z21)) {
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            t84 t843 = t84;
                            if (atomicInteger.get() != -256 || (e instanceof z21)) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    i2 = -512;
                                } else if (atomicInteger.get() != -256) {
                                    i2 = atomicInteger.get();
                                } else if (e instanceof z21) {
                                    i2 = ((z21) e).w;
                                } else {
                                    h.s("Unreachable");
                                    return obj;
                                }
                                t84.c.compareAndSet(-256, i2);
                            }
                            if (!(e instanceof z21)) {
                                return new Object();
                            }
                            throw e;
                        }
                    } catch (Throwable unused) {
                        bc4.k().e(f31.a, "No worker to delegate to.");
                        c.b.getClass();
                        return new p84();
                    }
                } else if (i == 1) {
                    t84 = b312.z;
                    try {
                        o85.q(obj2);
                        obj = null;
                    } catch (CancellationException e4) {
                        e = e4;
                        obj = null;
                        if (Build.VERSION.SDK_INT >= 31) {
                        }
                        t84.c.compareAndSet(-256, i2);
                        if (!(e instanceof z21)) {
                        }
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return (s84) obj2;
            }
        }
        b31 = new b31(constraintTrackingWorker2, h612);
        b31 b3122 = b31;
        Object obj22 = b3122.A;
        i = b3122.C;
        Object obj32 = null;
        if (i != 0) {
        }
        try {
            return (s84) obj22;
        } catch (CancellationException e5) {
            e = e5;
            if (Build.VERSION.SDK_INT >= 31) {
            }
            t84.c.compareAndSet(-256, i2);
            if (!(e instanceof z21)) {
            }
        }
    }

    public final Object c(f61 f61) {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return ar7.e0(we.l(executorService), new ot(this, (f61) null, 4), f61);
    }
}
