package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: xr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xr8 {
    public static final /* synthetic */ int a = 0;

    static {
        ((qv8) lv8.a).getClass();
        AtomicReference atomicReference = uv8.e;
        String str = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt";
        if (atomicReference.get() != null) {
            ((wv8) atomicReference.get()).a(str);
            return;
        }
        int i = 57;
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
        f76 f76 = new f76(str);
        if (uv8.b || uv8.c) {
            Set set = yv8.b;
        } else if (uv8.d) {
            Set set2 = yv8.c.a;
            Level level = Level.OFF;
            if (str.length() > 23) {
                int i2 = -1;
                int length = str.length() - 1;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    char charAt2 = str.charAt(length);
                    if (charAt2 == '.' || charAt2 == '$') {
                        i2 = length;
                    } else {
                        length--;
                    }
                }
                str = str.substring(i2 + 1);
            }
            String concat = "".concat(str);
            concat.substring(0, Math.min(concat.length(), 23));
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = sv8.a;
        concurrentLinkedQueue.offer(f76);
        if (atomicReference.get() != null) {
            while (true) {
                uv8 uv8 = (uv8) concurrentLinkedQueue.poll();
                if (uv8 == null) {
                    break;
                }
                ((wv8) atomicReference.get()).a(uv8.a);
            }
            if (uv8.f.poll() != null) {
                ku4.a();
            }
        }
    }
}
