package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: et6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class et6 implements n98 {
    public static volatile et6 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final s92 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public et6(ct6 ct6) {
        this.a = ct6;
        if (ct6 != null) {
            ct6.d(new br4(12, (Object) this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: pb8} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b A[Catch:{ all -> 0x0022 }] */
    public final void a(Context context, or orVar, l8 l8Var) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        ? r1 = 0;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        a42 a42 = a42.w;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                s92 s92 = this.a;
                if (s92 == null) {
                    l8Var.accept(new pb8(a42));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList != null) {
                    if (copyOnWriteArrayList.isEmpty()) {
                        dt6 dt6 = new dt6(activity, orVar, l8Var);
                        copyOnWriteArrayList.add(dt6);
                        if (z) {
                            ct6 ct6 = (ct6) s92;
                            Window window = activity.getWindow();
                            if (!(window == null || (attributes = window.getAttributes()) == null)) {
                                r1 = attributes.token;
                            }
                            if (r1 != 0) {
                                ct6.c(r1, activity);
                            } else {
                                activity.getWindow().getDecorView().addOnAttachStateChangeListener(new gq2(ct6, activity));
                            }
                        } else {
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (activity.equals(((dt6) obj).a)) {
                                    break;
                                }
                            }
                            dt6 dt62 = (dt6) obj;
                            if (dt62 != null) {
                                r1 = dt62.c;
                            }
                            if (r1 != 0) {
                                dt6.c = r1;
                                dt6.b.accept(r1);
                            }
                        }
                        reentrantLock.unlock();
                    }
                }
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((dt6) it2.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                dt6 dt63 = new dt6(activity, orVar, l8Var);
                copyOnWriteArrayList.add(dt63);
                if (z) {
                }
                reentrantLock.unlock();
            } finally {
                reentrantLock.unlock();
            }
        } else {
            l8Var.accept(new pb8(a42));
        }
    }

    public final void b(l8 l8Var) {
        synchronized (d) {
            try {
                if (this.a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.b.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        dt6 dt6 = (dt6) it.next();
                        if (dt6.b == l8Var) {
                            arrayList.add(dt6);
                        }
                    }
                    this.b.removeAll(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Activity activity = ((dt6) it2.next()).a;
                        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                            Iterator it3 = copyOnWriteArrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((dt6) it3.next()).a.equals(activity)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        s92 s92 = this.a;
                        if (s92 != null) {
                            ((ct6) s92).b(activity);
                        }
                    }
                }
            } finally {
            }
        }
    }
}
