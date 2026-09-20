package defpackage;

import android.text.Editable;

/* renamed from: n42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n42 extends ah7 {
    public final /* synthetic */ p42 w;

    public n42(p42 p42) {
        this.w = p42;
    }

    public final void afterTextChanged(Editable editable) {
        this.w.b().a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.w.b().b();
    }
}
