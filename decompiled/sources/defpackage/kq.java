package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: kq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kq {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) lq.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
