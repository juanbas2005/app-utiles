package dev.whyoleg.cryptography.serialization.asn1.modules;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b@\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0001\u0003\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPoint;", "", "", "bytes", "constructor-impl", "([B)[B", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "[B", "getBytes", "()[B", "Companion", "n12", "o12", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class EcPoint {
    public static final o12 Companion = new Object();
    private final byte[] bytes;

    private /* synthetic */ EcPoint(byte[] bArr) {
        this.bytes = bArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ EcPoint m35boximpl(byte[] bArr) {
        return new EcPoint(bArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static byte[] m36constructorimpl(byte[] bArr) {
        bArr.getClass();
        return bArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37equalsimpl(byte[] bArr, Object obj) {
        if ((obj instanceof EcPoint) && sg3.e(bArr, ((EcPoint) obj).m41unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38equalsimpl0(byte[] bArr, byte[] bArr2) {
        return sg3.e(bArr, bArr2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m39hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m40toStringimpl(byte[] bArr) {
        return "EcPoint(bytes=" + Arrays.toString(bArr) + ')';
    }

    public boolean equals(Object obj) {
        return m37equalsimpl(this.bytes, obj);
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public int hashCode() {
        return m39hashCodeimpl(this.bytes);
    }

    public String toString() {
        return m40toStringimpl(this.bytes);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ byte[] m41unboximpl() {
        return this.bytes;
    }
}
