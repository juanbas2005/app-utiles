package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lb6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lb6 extends ic6 implements nb6, fc6 {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    public final Set b() {
        return this.k;
    }

    public final String c() {
        return this.j;
    }

    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    public final Set g() {
        return this.i;
    }

    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    public final void i(String str) {
        this.j = str;
    }

    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    public final void k(HashSet hashSet) {
        this.k = hashSet;
    }

    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    public final Set m() {
        return this.l;
    }

    public final Set n() {
        return this.m;
    }
}
