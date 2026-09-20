package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: j59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j59 {
    public static final ji8 a;

    /* JADX WARNING: type inference failed for: r5v1, types: [f76, java.lang.Object, mj8] */
    static {
        qj8 qj8;
        ((ij8) dj8.a).getClass();
        AtomicReference atomicReference = mj8.f;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            oj8 oj8 = (oj8) atomicReference.get();
            qj8 = new qj8(str, oj8.a, oj8.b, oj8.c);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char charAt = str.charAt(i);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        }
                        i--;
                    } else {
                        str = str.replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            ? f76 = new f76(str);
            if (mj8.c || mj8.d) {
                f76.b = new pj8(str);
            } else if (mj8.e) {
                oj8 oj82 = qj8.h;
                f76.b = new qj8(str, Level.OFF, oj82.b, oj82.c);
            } else {
                f76.b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = kj8.a;
            concurrentLinkedQueue.offer(f76);
            qj8 = f76;
            if (atomicReference.get() != null) {
                while (true) {
                    mj8 mj8 = (mj8) concurrentLinkedQueue.poll();
                    if (mj8 == null) {
                        break;
                    }
                    oj8 oj83 = (oj8) atomicReference.get();
                    mj8.b = new qj8(mj8.a, oj83.a, oj83.b, oj83.c);
                }
                mj8.d();
                qj8 = f76;
            }
        }
        a = new ji8(2, (Object) qj8);
    }
}
