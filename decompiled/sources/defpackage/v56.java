package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: v56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v56 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public v56(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i;
        this.a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            i = 0;
        } else {
            i = theme.hashCode();
        }
        this.c = i;
    }
}
