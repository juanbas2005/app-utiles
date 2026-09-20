package defpackage;

import dalvik.system.DelegateLastClassLoader;

/* renamed from: w10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class w10 {
    public static /* synthetic */ DelegateLastClassLoader a(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void b() {
        /*
            dalvik.system.DelegateLastClassLoader r0 = new dalvik.system.DelegateLastClassLoader
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w10.b():void");
    }
}
