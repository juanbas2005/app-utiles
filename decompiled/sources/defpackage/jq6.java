package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: jq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jq6 extends CharacterStyle implements UpdateAppearance {
    public final iq6 w;
    public final float x;
    public final ed5 y = u55.p(new wu6(9205357640488583168L));
    public final oq1 z = u55.i(new hx4(24, this));

    public jq6(iq6 iq6, float f) {
        this.w = iq6;
        this.x = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        ar7.V(textPaint, this.x);
        textPaint.setShader((Shader) this.z.getValue());
    }
}
