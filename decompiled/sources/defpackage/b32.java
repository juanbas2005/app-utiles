package defpackage;

import android.text.Editable;

/* renamed from: b32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b32 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile b32 b;
    public static Class c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new bz6(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
