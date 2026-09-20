package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: l09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l09 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ q09 e;

    public l09(q09 q09, String str, long j) {
        Objects.requireNonNull(q09);
        this.e = q09;
        z65.h(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.g1().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.g1().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
