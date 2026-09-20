package defpackage;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpd4;", "Lpl4;", "Lrd4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pd4 extends pl4 {
    public final sn w;
    public final cf7 x;
    public final mj5 y;

    public pd4(sn snVar, cf7 cf7, mj5 mj5) {
        this.w = snVar;
        this.x = cf7;
        this.y = mj5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new rd4(this.w, this.x, this.y);
    }

    public final void h(ll4 ll4) {
        rd4 rd4 = (rd4) ll4;
        rd4.getClass();
        mj5 mj5 = rd4.M;
        View view = rd4.N;
        tp1 tp1 = rd4.O;
        rd4.K = this.w;
        rd4.L = this.x;
        mj5 mj52 = this.y;
        rd4.M = mj52;
        View K = su0.K(rd4);
        tp1 tp12 = rc9.O0(rd4).T;
        if (rd4.P != null) {
            nk6 nk6 = sd4.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !mj52.a()) || !lx1.b(Float.NaN, Float.NaN) || !lx1.b(Float.NaN, Float.NaN) || !mj52.equals(mj5) || !K.equals(view) || !sg3.e(tp12, tp1)) {
                rd4.W0();
            }
        }
        rd4.X0();
    }

    public final int hashCode() {
        int i = hl6.i(f21.d(Float.NaN, f21.d(Float.NaN, pb4.b(hl6.i(f21.d(Float.NaN, this.w.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true);
        return this.y.hashCode() + ((this.x.hashCode() + i) * 31);
    }
}
