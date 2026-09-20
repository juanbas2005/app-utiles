package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.List;

/* renamed from: q89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q89 extends bq2 implements g94 {
    public ListView t0;
    public l79 u0;
    public s47 v0;
    public String w0;
    public k68 x0;
    public Context y0;

    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        s47 s47 = this.v0;
        return layoutInflater.inflate(s47.a.getIdentifier("license_menu_fragment", "layout", s47.b), viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r2 = r5.y;
     */
    public final void B() {
        Object[] objArr;
        Object obj;
        this.a0 = true;
        eq2 l = l();
        if (l != null) {
            i94 i94 = (i94) hv2.N0(l).x;
            boolean z = i94.c;
            cz6 cz6 = i94.b;
            if (z) {
                h.s("Called while creating a loader");
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                h94 h94 = (h94) cz6.c(54321);
                if (h94 != null) {
                    h94.j();
                    int q = ie1.q(cz6.z, 54321, cz6.x);
                    if (q >= 0 && objArr[q] != (obj = rg3.j)) {
                        objArr[q] = obj;
                        cz6.w = true;
                    }
                }
            } else {
                h.s("destroyLoader must be called on the main thread");
            }
        }
    }

    public final void I(View view) {
        eq2 l = l();
        z65.k(l);
        hv2.N0(l).Q0(54321, this);
        s47 s47 = this.v0;
        this.t0 = (ListView) view.findViewById(s47.a.getIdentifier("license_list", "id", s47.b));
        l79 l79 = new l79(this, l);
        this.u0 = l79;
        this.t0.setAdapter(l79);
        this.t0.setOnItemClickListener(new qp(2, this));
    }

    public final void e() {
        this.u0.clear();
        this.u0.notifyDataSetChanged();
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        this.u0.clear();
        this.u0.addAll((List) obj);
        this.u0.notifyDataSetChanged();
    }

    public final ai8 i() {
        return new ai8(this.y0, this.x0);
    }

    public final void y(Context context) {
        super.y(context);
        this.y0 = context;
        this.x0 = k68.m(context);
    }

    public final void z(Bundle bundle) {
        Bundle bundle2;
        super.z(bundle);
        if (bundle == null && (bundle2 = this.B) != null) {
            this.w0 = bundle2.getString("license_activity_package_name");
        }
        if (this.w0 == null) {
            this.w0 = this.y0.getPackageName();
        }
        this.v0 = k68.q(this.y0, this.w0);
    }
}
