package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;

/* renamed from: vy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy0 extends wx3 implements sr2 {
    public static final vy0 A = new vy0(0, 2);
    public static final vy0 B = new vy0(0, 3);
    public static final vy0 C = new vy0(0, 4);
    public static final vy0 D = new vy0(0, 5);
    public static final vy0 E = new vy0(0, 6);
    public static final vy0 F = new vy0(0, 7);
    public static final vy0 G = new vy0(0, 8);
    public static final vy0 H = new vy0(0, 9);
    public static final vy0 I = new vy0(0, 10);
    public static final vy0 J = new vy0(0, 11);
    public static final vy0 K = new vy0(0, 12);
    public static final vy0 L = new vy0(0, 13);
    public static final vy0 M = new vy0(0, 14);
    public static final vy0 y = new vy0(0, 0);
    public static final vy0 z = new vy0(0, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy0(int i, int i2) {
        super(i);
        this.x = i2;
    }

    public final Object b() {
        switch (this.x) {
            case b85.b:
                return new Object();
            case 1:
                return null;
            case 2:
                xy0.b("LocalTextToolbar");
                throw null;
            case 3:
                xy0.b("LocalUriHandler");
                throw null;
            case 4:
                xy0.b("LocalViewConfiguration");
                throw null;
            case 5:
                xy0.b("LocalWindowInfo");
                throw null;
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return new uy3(3);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return new fh(new PathMeasure());
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return null;
            default:
                return vs7.a;
        }
    }
}
