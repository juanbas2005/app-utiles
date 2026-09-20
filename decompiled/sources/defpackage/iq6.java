package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: iq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iq6 extends kc0 {
    public rg4 a;
    public long b = 9205357640488583168L;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.Shader} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void a(float f, long j, kb9 kb9) {
        Shader shader;
        rg4 rg4 = this.a;
        Shader shader2 = null;
        if (rg4 == null || !wu6.a(this.b, j)) {
            if (wu6.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                rg4 = null;
            } else {
                rg4 = this.a;
                if (rg4 == null) {
                    rg4 = new rg4(11, false);
                    this.a = rg4;
                }
                rg4.x = c(j);
                this.a = rg4;
                this.b = j;
            }
        }
        long d = kb9.d();
        long j2 = jt0.b;
        if (!jt0.c(d, j2)) {
            kb9.k(j2);
        }
        Shader shader3 = (Shader) kb9.z;
        if (rg4 != null) {
            shader = (Shader) rg4.x;
        } else {
            shader = null;
        }
        if (!sg3.e(shader3, shader)) {
            if (rg4 != null) {
                shader2 = rg4.x;
            }
            kb9.n(shader2);
        }
        if (((float) ((Paint) kb9.y).getAlpha()) / 255.0f != f) {
            kb9.i(f);
        }
    }

    public abstract Shader c(long j);
}
