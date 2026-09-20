package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: mm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mm4 implements lm4 {
    public final Context w;
    public ig0 x;
    public final ad5 y = new ad5(1.0f);
    public h27 z;

    public mm4(Context context) {
        this.w = context;
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public final e81 L(d81 d81) {
        return rc9.A0(this, d81);
    }

    public final float M() {
        b37 b37;
        if (this.z == null) {
            Context context = this.w;
            tp4 tp4 = ac8.a;
            synchronized (tp4) {
                try {
                    Object g = tp4.g(context);
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        ad0 c = rj1.c(-1, 6, (vc0) null);
                        ze1 ze1 = new ze1(3, new p6(contentResolver, uriFor, new sy7(c, x91.u(Looper.getMainLooper())), c, context, (f61) null));
                        w77 d = b85.d();
                        dn1 dn1 = aw1.a;
                        g = gr8.W(ze1, new ig0(rc9.D0(d, pe4.a)), new x27(0, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        tp4.m(context, g);
                    }
                    b37 = (b37) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.y.e(((Number) b37.getValue()).floatValue());
            ig0 ig0 = this.x;
            if (ig0 != null) {
                this.z = ar7.H(ig0, (e81) null, (r81) null, new ju1(b37, this, (f61) null, 22), 3);
            } else {
                h.s("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
        }
        return this.y.d();
    }

    public final e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    public final c81 a0(d81 d81) {
        return rc9.J(this, d81);
    }
}
