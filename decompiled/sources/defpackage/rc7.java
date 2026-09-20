package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: rc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rc7 extends t35 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ TextPaint d;
    public final /* synthetic */ t35 e;
    public final /* synthetic */ sc7 f;

    public rc7(sc7 sc7, Context context, TextPaint textPaint, t35 t35) {
        this.f = sc7;
        this.c = context;
        this.d = textPaint;
        this.e = t35;
    }

    public final void y(int i) {
        this.e.y(i);
    }

    public final void z(Typeface typeface, boolean z) {
        this.f.f(this.c, this.d, typeface);
        this.e.z(typeface, z);
    }
}
