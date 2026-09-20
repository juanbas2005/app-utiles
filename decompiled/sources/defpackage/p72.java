package defpackage;

import java.io.Serializable;
import java.util.Queue;

/* renamed from: p72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p72 implements cc4, Serializable {
    public z67 w;
    public Queue x;

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return true;
    }

    public final void f(String str, Throwable th) {
        j(4);
    }

    public final void g(String str) {
        j(2);
    }

    public final void h(String str) {
        j(5);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b77, java.lang.Object] */
    public final void j(int i) {
        ? obj = new Object();
        System.currentTimeMillis();
        obj.a = i;
        obj.b = this.w;
        Thread.currentThread().getName();
        this.x.add(obj);
    }
}
