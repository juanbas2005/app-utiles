package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class EmojiCompatInitializer implements sb3 {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ml2, t22] */
    public final Object b(Context context) {
        Object obj;
        ? t22 = new t22((v22) new tb1(context, 1));
        t22.a = 1;
        if (w22.k == null) {
            synchronized (w22.j) {
                try {
                    if (w22.k == null) {
                        w22.k = new w22(t22);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        wr0 I = wr0.I(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        I.getClass();
        synchronized (wr0.B) {
            try {
                obj = ((HashMap) I.x).get(cls);
                if (obj == null) {
                    obj = I.A(cls, new HashSet());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        in8 k = ((t54) obj).k();
        k.x0(new x22(this, k));
        return Boolean.TRUE;
    }
}
