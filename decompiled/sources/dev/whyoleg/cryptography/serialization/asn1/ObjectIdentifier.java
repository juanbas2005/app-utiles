package dev.whyoleg.cryptography.serialization.asn1;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007\u0001\u0003\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;", "", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Companion", "u25", "t25", "cryptography-serialization-asn1"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ObjectIdentifier {
    public static final u25 Companion = new Object();
    private final String value;

    private /* synthetic */ ObjectIdentifier(String str) {
        this.value = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ObjectIdentifier m19boximpl(String str) {
        return new ObjectIdentifier(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m20constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m21equalsimpl(String str, Object obj) {
        if ((obj instanceof ObjectIdentifier) && sg3.e(str, ((ObjectIdentifier) obj).m25unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m22equalsimpl0(String str, String str2) {
        return sg3.e(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m23hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m24toStringimpl(String str) {
        return pb4.h(')', "ObjectIdentifier(value=", str);
    }

    public boolean equals(Object obj) {
        return m21equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m23hashCodeimpl(this.value);
    }

    public String toString() {
        return m24toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m25unboximpl() {
        return this.value;
    }
}
