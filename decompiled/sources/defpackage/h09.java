package defpackage;

import android.content.SharedPreferences;

/* renamed from: h09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h09 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ q09 e;

    public h09(q09 q09, String str, boolean z) {
        this.e = q09;
        z65.h(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.g1().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.g1().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
