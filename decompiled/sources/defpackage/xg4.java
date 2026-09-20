package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: xg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xg4<S> extends tg5 {
    public int u0;
    public sh0 v0;

    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(n(), this.u0));
        throw null;
    }

    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.v0);
    }

    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.v0 = (sh0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            ku4.a();
        }
    }
}
