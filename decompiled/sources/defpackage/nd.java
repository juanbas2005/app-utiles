package defpackage;

import android.app.role.RoleManager;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;

/* renamed from: nd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class nd {
    public static /* bridge */ /* synthetic */ RoleManager c(Object obj) {
        return (RoleManager) obj;
    }

    public static /* synthetic */ BlendModeColorFilter e(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return RoleManager.class;
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
    public static /* synthetic */ void h() {
        /*
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.h():void");
    }
}
