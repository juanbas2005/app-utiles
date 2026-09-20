package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ij  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ij {
    public final XmlPullParser a;
    public int b = 0;
    public final xy1 c = new xy1(1);

    public ij(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (p25.r(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj;
        if (sg3.e(this.a, ijVar.a) && this.b == ijVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i = this.b;
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + i + ")";
    }
}
