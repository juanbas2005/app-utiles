package defpackage;

import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* renamed from: jg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class jg {
    public static /* bridge */ /* synthetic */ Class A() {
        return SelectRangeGesture.class;
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
    public static /* synthetic */ void C() {
        /*
            android.credentials.GetCredentialRequest$Builder r0 = new android.credentials.GetCredentialRequest$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.C():void");
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
    public static /* synthetic */ void D() {
        /*
            android.credentials.CredentialOption$Builder r0 = new android.credentials.CredentialOption$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.D():void");
    }

    public static /* bridge */ /* synthetic */ CredentialManager c(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder f(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException h(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* synthetic */ GetCredentialRequest.Builder i(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse k(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder n(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder o(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return SelectGesture.class;
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
            android.text.GraphemeClusterSegmentFinder r0 = new android.text.GraphemeClusterSegmentFinder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.t():void");
    }
}
