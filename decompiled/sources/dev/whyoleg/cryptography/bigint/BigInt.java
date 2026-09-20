package dev.whyoleg.cryptography.bigint;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00014B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u001dJ\u001a\u0010,\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0011\u00100\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u0011\u00102\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u0010\u000b¨\u00065"}, d2 = {"Ldev/whyoleg/cryptography/bigint/BigInt;", "", "", "Ljava/math/BigInteger;", "javaBigInteger", "<init>", "(Ljava/math/BigInteger;)V", "", "magnitudeToByteArray", "()[B", "unaryPlus", "()Ldev/whyoleg/cryptography/bigint/BigInt;", "unaryMinus", "", "other", "", "compareTo", "(B)I", "", "(S)I", "(I)I", "", "(J)I", "(Ldev/whyoleg/cryptography/bigint/BigInt;)I", "toByte", "()B", "toShort", "()S", "toInt", "()I", "toLong", "()J", "", "toFloat", "()F", "", "toDouble", "()D", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigInteger;", "getSign", "sign", "getAbsoluteValue", "absoluteValue", "Companion", "l80", "cryptography-bigint"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = m80.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class BigInt extends Number implements Comparable<BigInt> {
    public static final l80 Companion = new Object();
    /* access modifiers changed from: private */
    public static final BigInt ZERO;
    public final BigInteger javaBigInteger;

    /* JADX WARNING: type inference failed for: r0v0, types: [l80, java.lang.Object] */
    static {
        BigInteger bigInteger = BigInteger.ZERO;
        bigInteger.getClass();
        ZERO = new BigInt(bigInteger);
    }

    public BigInt(BigInteger bigInteger) {
        bigInteger.getClass();
        this.javaBigInteger = bigInteger;
    }

    public final /* bridge */ byte byteValue() {
        return toByte();
    }

    public int compareTo(BigInt bigInt) {
        bigInt.getClass();
        return this.javaBigInteger.compareTo(bigInt.javaBigInteger);
    }

    public final /* bridge */ double doubleValue() {
        return toDouble();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BigInt)) {
            return false;
        }
        return sg3.e(this.javaBigInteger, ((BigInt) obj).javaBigInteger);
    }

    public final /* bridge */ float floatValue() {
        return toFloat();
    }

    public final BigInt getAbsoluteValue() {
        if (getSign() >= 0) {
            return this;
        }
        BigInteger abs = this.javaBigInteger.abs();
        abs.getClass();
        return new BigInt(abs);
    }

    public final int getSign() {
        return this.javaBigInteger.signum();
    }

    public int hashCode() {
        return this.javaBigInteger.hashCode();
    }

    public final /* bridge */ int intValue() {
        return toInt();
    }

    public final /* bridge */ long longValue() {
        return toLong();
    }

    public final byte[] magnitudeToByteArray() {
        byte[] byteArray = this.javaBigInteger.abs().toByteArray();
        byteArray.getClass();
        int length = byteArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (byteArray[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return byteArray;
        }
        return qs.P0(byteArray, i, byteArray.length);
    }

    public final /* bridge */ short shortValue() {
        return toShort();
    }

    public byte toByte() {
        return this.javaBigInteger.byteValue();
    }

    public double toDouble() {
        return this.javaBigInteger.doubleValue();
    }

    public float toFloat() {
        return this.javaBigInteger.floatValue();
    }

    public int toInt() {
        return this.javaBigInteger.intValue();
    }

    public long toLong() {
        return this.javaBigInteger.longValue();
    }

    public short toShort() {
        return this.javaBigInteger.shortValue();
    }

    public String toString() {
        String bigInteger = this.javaBigInteger.toString();
        bigInteger.getClass();
        return bigInteger;
    }

    public final BigInt unaryMinus() {
        BigInteger negate = this.javaBigInteger.negate();
        negate.getClass();
        return new BigInt(negate);
    }

    public final int compareTo(long j) {
        return compareTo(gl0.c0(j));
    }

    public final int compareTo(byte b) {
        return compareTo(gl0.c0((long) b));
    }

    public final int compareTo(short s) {
        return compareTo(gl0.c0((long) s));
    }

    public final int compareTo(int i) {
        return compareTo(gl0.c0((long) i));
    }

    public final BigInt unaryPlus() {
        return this;
    }
}
