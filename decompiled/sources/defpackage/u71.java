package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu71;", "Lpl4;", "Lx71;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: u71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u71 extends pl4 {
    public final boolean A;
    public final boolean B;
    public final v35 C;
    public final ze7 D;
    public final c93 E;
    public final ok2 F;
    public final tl7 w;
    public final hf7 x;
    public final u44 y;
    public final boolean z;

    public u71(tl7 tl7, hf7 hf7, u44 u44, boolean z2, boolean z3, boolean z4, v35 v35, ze7 ze7, c93 c93, ok2 ok2) {
        this.w = tl7;
        this.x = hf7;
        this.y = u44;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = v35;
        this.D = ze7;
        this.E = c93;
        this.F = ok2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u71) {
            u71 u71 = (u71) obj;
            if (this.w.equals(u71.w) && sg3.e(this.x, u71.x) && this.y == u71.y && this.z == u71.z && this.A == u71.A && this.B == u71.B && sg3.e(this.C, u71.C) && this.D == u71.D && sg3.e(this.E, u71.E) && sg3.e(this.F, u71.F)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x71, ll4, wo1] */
    public final ll4 g() {
        ? wo1 = new wo1();
        wo1.M = this.w;
        wo1.N = this.x;
        wo1.O = this.y;
        wo1.P = this.z;
        wo1.Q = this.A;
        wo1.R = this.B;
        wo1.S = this.C;
        ze7 ze7 = this.D;
        wo1.T = ze7;
        wo1.U = this.E;
        wo1.V = this.F;
        ze7.g = new v71(wo1, 4);
        return wo1;
    }

    public final void h(ll4 ll4) {
        boolean z2;
        x71 x71 = (x71) ll4;
        boolean z3 = x71.Q;
        boolean z4 = true;
        if (!z3 || x71.P) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = x71.R;
        c93 c93 = x71.U;
        ze7 ze7 = x71.T;
        boolean z6 = this.z;
        boolean z7 = this.A;
        if (!z7 || z6) {
            z4 = false;
        }
        x71.M = this.w;
        hf7 hf7 = this.x;
        x71.N = hf7;
        x71.O = this.y;
        x71.P = z6;
        x71.Q = z7;
        x71.S = this.C;
        ze7 ze72 = this.D;
        x71.T = ze72;
        c93 c932 = this.E;
        x71.U = c932;
        x71.V = this.F;
        if (!(z7 == z3 && z4 == z2 && sg3.e(c932, c93) && this.B == z5 && lg7.c(hf7.b))) {
            g75.D(x71);
        }
        if (ze72 != ze7) {
            ze72.g = new v71(x71, 0);
        }
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        int i = hl6.i(hl6.i(hl6.i((this.y.hashCode() + ((hashCode + (this.w.hashCode() * 31)) * 31)) * 31, 31, this.z), 31, this.A), 31, this.B);
        int hashCode2 = this.D.hashCode();
        int hashCode3 = this.E.hashCode();
        return this.F.hashCode() + ((hashCode3 + ((hashCode2 + ((this.C.hashCode() + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.w);
        sb.append(", value=");
        sb.append(this.x);
        sb.append(", state=");
        sb.append(this.y);
        sb.append(", readOnly=");
        sb.append(this.z);
        sb.append(", enabled=");
        pb4.s(sb, this.A, ", isPassword=", this.B, ", offsetMapping=");
        sb.append(this.C);
        sb.append(", manager=");
        sb.append(this.D);
        sb.append(", imeOptions=");
        sb.append(this.E);
        sb.append(", focusRequester=");
        sb.append(this.F);
        sb.append(")");
        return sb.toString();
    }
}
