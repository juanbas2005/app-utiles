package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\b\u0001\u0003\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;", "", "Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;", "namedCurve", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNamedCurve-STa95mE", "Companion", "l12", "m12", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class EcParameters {
    public static final m12 Companion = new Object();
    private final String namedCurve;

    private /* synthetic */ EcParameters(String str) {
        this.namedCurve = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ EcParameters m27boximpl(String str) {
        return new EcParameters(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m28constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m29equalsimpl(String str, Object obj) {
        if ((obj instanceof EcParameters) && ObjectIdentifier.m22equalsimpl0(str, ((EcParameters) obj).m34unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m30equalsimpl0(String str, String str2) {
        return ObjectIdentifier.m22equalsimpl0(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m31hashCodeimpl(String str) {
        return ObjectIdentifier.m23hashCodeimpl(str);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32toStringimpl(String str) {
        return "EcParameters(namedCurve=" + ObjectIdentifier.m24toStringimpl(str) + ')';
    }

    public boolean equals(Object obj) {
        return m29equalsimpl(this.namedCurve, obj);
    }

    /* renamed from: getNamedCurve-STa95mE  reason: not valid java name */
    public final String m33getNamedCurveSTa95mE() {
        return this.namedCurve;
    }

    public int hashCode() {
        return m31hashCodeimpl(this.namedCurve);
    }

    public String toString() {
        return m32toStringimpl(this.namedCurve);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m34unboximpl() {
        return this.namedCurve;
    }
}
