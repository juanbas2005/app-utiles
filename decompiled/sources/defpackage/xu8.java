package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* renamed from: xu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xu8 implements w49 {
    public final /* synthetic */ yw8 a;

    public xu8(yw8 yw8) {
        this.a = yw8;
    }

    public final String e() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 3, false));
        return (String) xt8.e(xt8.b(500), String.class);
    }

    public final void f(String str, String str2, Bundle bundle) {
        yw8 yw8 = this.a;
        yw8.c(new mv8(yw8, str, str2, bundle, 1));
    }

    public final long i() {
        return this.a.g();
    }

    public final String j() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 4, false));
        return (String) xt8.e(xt8.b(500), String.class);
    }

    public final void k(Bundle bundle) {
        yw8 yw8 = this.a;
        yw8.c(new kv8(yw8, bundle));
    }

    public final void l(String str) {
        yw8 yw8 = this.a;
        yw8.c(new vv8(yw8, str, 1));
    }

    public final void m(String str) {
        yw8 yw8 = this.a;
        yw8.c(new vv8(yw8, str, 0));
    }

    public final void n(String str, String str2, Bundle bundle) {
        yw8 yw8 = this.a;
        yw8.c(new mv8(yw8, str, str2, bundle, 0));
    }

    public final List o(String str, String str2) {
        return this.a.f(str, str2);
    }

    public final int p(String str) {
        return this.a.b(str);
    }

    public final String q() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 1));
        return (String) xt8.e(xt8.b(50), String.class);
    }

    public final String r() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 0));
        return (String) xt8.e(xt8.b(500), String.class);
    }

    public final Map s(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }
}
