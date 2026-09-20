package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;

/* renamed from: xe  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xe extends wx3 implements sr2 {
    public static final xe A = new xe(0, 2);
    public static final xe B = new xe(0, 3);
    public static final xe C = new xe(0, 4);
    public static final xe D = new xe(0, 5);
    public static final xe E = new xe(0, 6);
    public static final xe F = new xe(0, 7);
    public static final xe G = new xe(0, 8);
    public static final xe H = new xe(0, 9);
    public static final xe I = new xe(0, 10);
    public static final xe J = new xe(0, 11);
    public static final xe K = new xe(0, 12);
    public static final xe L = new xe(0, 13);
    public static final xe M = new xe(0, 14);
    public static final xe N = new xe(0, 15);
    public static final xe O = new xe(0, 16);
    public static final xe P = new xe(0, 17);
    public static final xe Q = new xe(0, 18);
    public static final xe R = new xe(0, 19);
    public static final xe S = new xe(0, 20);
    public static final xe T = new xe(0, 21);
    public static final xe U = new xe(0, 22);
    public static final xe V = new xe(0, 23);
    public static final xe W = new xe(0, 24);
    public static final xe X = new xe(0, 25);
    public static final xe Y = new xe(0, 26);
    public static final xe Z = new xe(0, 27);
    public static final xe a0 = new xe(0, 28);
    public static final xe b0 = new xe(0, 29);
    public static final xe y = new xe(0, 0);
    public static final xe z = new xe(0, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe(int i, int i2) {
        super(i);
        this.x = i2;
    }

    public final Object b() {
        Choreographer choreographer;
        switch (this.x) {
            case b85.b:
                ye.a("LocalConfiguration");
                throw null;
            case 1:
                ye.a("LocalContext");
                throw null;
            case 2:
                ye.a("LocalImageVectorCache");
                throw null;
            case 3:
                ye.a("LocalResourceIdCache");
                throw null;
            case 4:
                ye.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    dn1 dn1 = aw1.a;
                    choreographer = (Choreographer) ar7.U(pe4.a, new bj(2, (f61) null, 0));
                }
                ej ejVar = new ej(choreographer, x91.u(Looper.getMainLooper()));
                return rc9.D0(ejVar, ejVar.H);
            case 10:
                return new uy3(2);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case 12:
                return null;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                xy0.b("LocalAutofillManager");
                throw null;
            case 14:
                xy0.b("LocalAutofillTree");
                throw null;
            case h75.g:
                xy0.b("LocalClipboard");
                throw null;
            case 16:
                xy0.b("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                xy0.b("LocalDensity");
                throw null;
            case 19:
                xy0.b("LocalFocusManager");
                throw null;
            case 20:
                xy0.b("LocalFontFamilyResolver");
                throw null;
            case 21:
                xy0.b("LocalFontLoader");
                throw null;
            case 22:
                xy0.b("LocalGraphicsContext");
                throw null;
            case 23:
                xy0.b("LocalHapticFeedback");
                throw null;
            case 24:
                xy0.b("LocalInputManager");
                throw null;
            case 25:
                xy0.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                xy0.b("LocalProvidableLocaleList");
                throw null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
