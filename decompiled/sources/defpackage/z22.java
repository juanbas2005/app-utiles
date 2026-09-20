package defpackage;

import android.os.Trace;

/* renamed from: z22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z22 implements Runnable {
    public static final /* synthetic */ z22 x = new z22(2);
    public static final /* synthetic */ z22 y = new z22(3);
    public static final /* synthetic */ z22 z = new z22(4);
    public final /* synthetic */ int w;

    public /* synthetic */ z22(int i) {
        this.w = i;
    }

    public final void run() {
        switch (this.w) {
            case b85.b:
                try {
                    int i = uk7.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (w22.d()) {
                        w22.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = uk7.a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
            case 2:
            case 3:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }
}
