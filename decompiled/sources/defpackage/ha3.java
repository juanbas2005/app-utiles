package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: ha3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ha3 implements LeadingMarginSpan {
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i6)) == layout.getLineCount() - 1) {
            ThreadLocal threadLocal = dg7.a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float s = rj1.s(layout, lineForOffset, paint) + rj1.r(layout, lineForOffset, paint);
                if (s != 0.0f) {
                    canvas.getClass();
                    canvas.translate(s, 0.0f);
                }
            }
        }
    }

    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
