package defpackage;

import java.time.DateTimeException;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;

/* renamed from: q94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class q94 {
    public static /* synthetic */ DateTimeException i(String str) {
        return new DateTimeException(str);
    }

    public static /* bridge */ /* synthetic */ ChronoLocalDate r(Object obj) {
        return (ChronoLocalDate) obj;
    }

    public static /* bridge */ /* synthetic */ ChronoLocalDateTime s(Object obj) {
        return (ChronoLocalDateTime) obj;
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
    public static /* synthetic */ void t() {
        /*
            java.time.DateTimeException r0 = new java.time.DateTimeException
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q94.t():void");
    }
}
