package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: gc6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gc6 extends ic6 implements hc6, fc6 {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    public final List a() {
        return this.i;
    }

    public final Set b() {
        return null;
    }

    public final String c() {
        return this.k;
    }

    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    public void f(lc6 lc6) {
        this.i.add(lc6);
    }

    public final Set g() {
        return this.j;
    }

    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    public final void i(String str) {
        this.k = str;
    }

    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    public final Set m() {
        return this.l;
    }

    public final Set n() {
        return this.m;
    }

    public final void k(HashSet hashSet) {
    }
}
