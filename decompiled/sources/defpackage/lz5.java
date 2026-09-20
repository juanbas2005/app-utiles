package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: lz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lz5 {
    public static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public lz5 h = null;
    public lz5 i = null;
    public int j;
    public final ArrayList k = null;
    public final List l = null;
    public int m = 0;
    public dz5 n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;
    public RecyclerView r;
    public py5 s;

    public lz5(View view) {
        if (view != null) {
            this.a = view;
        } else {
            h.q("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i2) {
        this.j = i2 | this.j;
    }

    public final int b() {
        int i2 = this.g;
        if (i2 == -1) {
            return this.c;
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) {
            return t;
        }
        return this.l;
    }

    public final boolean d() {
        View view = this.a;
        if (view.getParent() == null || view.getParent() == this.r) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = e58.a;
        if (!this.a.hasTransientState()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void l(int i2, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i2;
        }
        this.c += i2;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((yy5) view.getLayoutParams()).c = true;
        }
    }

    public final void m() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z) {
        int i2;
        int i3 = this.m;
        if (z) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }

    public final boolean o() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (i()) {
            sb.append(" scrap ");
            if (this.o) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb.append(str2);
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
