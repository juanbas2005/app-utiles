package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: ma  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ma {
    public final ContextThemeWrapper a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public vi4 f;
    public ListAdapter g;
    public DialogInterface.OnClickListener h;
    public boolean i;
    public int j = -1;

    public ma(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
