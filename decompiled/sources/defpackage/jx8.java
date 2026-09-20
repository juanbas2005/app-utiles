package defpackage;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: jx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jx8 implements fs8, x77 {
    public static final /* synthetic */ jx8 A = new jx8(3);
    public static final /* synthetic */ jx8 x = new jx8(0);
    public static final /* synthetic */ jx8 y = new jx8(1);
    public static final /* synthetic */ jx8 z = new jx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ jx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                fp8 fp8 = (fp8) ep8.x.w.w;
                return (Boolean) fp8.a.get();
            case 1:
                List list2 = by8.a;
                zo8 zo8 = (zo8) yo8.x.w.w;
                return (Boolean) zo8.a.get();
            default:
                to8 to8 = (to8) qo8.x.w.w;
                return new Boolean(((Boolean) to8.a.get()).booleanValue());
        }
    }

    public Object get() {
        Object obj = x49.j;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(i56.b);
        if (newSingleThreadScheduledExecutor instanceof jm4) {
            return (jm4) newSingleThreadScheduledExecutor;
        }
        return new jm4(newSingleThreadScheduledExecutor);
    }
}
