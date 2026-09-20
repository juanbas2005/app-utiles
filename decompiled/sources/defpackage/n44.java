package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln44;", "Lpl4;", "Lo44;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: n44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class n44 extends pl4 {
    public final og w;
    public final u44 x;
    public final ze7 y;

    public n44(og ogVar, u44 u44, ze7 ze7) {
        this.w = ogVar;
        this.x = u44;
        this.y = ze7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n44) {
            n44 n44 = (n44) obj;
            if (sg3.e(this.w, n44.w) && this.x == n44.x && this.y == n44.y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ll4 g() {
        return new o44(this.w, this.x, this.y);
    }

    public final void h(ll4 ll4) {
        o44 o44 = (o44) ll4;
        if (o44.J) {
            o44.K.c();
            o44.K.k(o44);
        }
        og ogVar = this.w;
        o44.K = ogVar;
        if (o44.J) {
            if (ogVar.a != null) {
                bc3.c("Expected textInputModifierNode to be null");
            }
            ogVar.a = o44;
        }
        o44.L = this.x;
        o44.M = this.y;
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        return this.y.hashCode() + ((hashCode + (this.w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.w + ", legacyTextFieldState=" + this.x + ", textFieldSelectionManager=" + this.y + ")";
    }
}
