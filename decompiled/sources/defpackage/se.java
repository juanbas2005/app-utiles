package defpackage;

import android.content.ClipData;
import android.telephony.TelephonyCallback;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* renamed from: se  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class se {
    public static /* bridge */ /* synthetic */ TelephonyCallback d(Object obj) {
        return (TelephonyCallback) obj;
    }

    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
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
    public static /* synthetic */ void q() {
        /*
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.q():void");
    }
}
