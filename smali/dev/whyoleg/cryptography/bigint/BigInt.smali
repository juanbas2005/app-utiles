.class public final Ldev/whyoleg/cryptography/bigint/BigInt;
.super Ljava/lang/Number;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Number;",
        "Ljava/lang/Comparable<",
        "Ldev/whyoleg/cryptography/bigint/BigInt;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0007\u0018\u0000 32\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u00014B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0012H\u0086\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0014J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0015H\u0086\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u001a\u0010,\u001a\u00020+2\u0008\u0010\u000e\u001a\u0004\u0018\u00010*H\u0096\u0002\u00a2\u0006\u0004\u0008,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010.R\u0011\u00100\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u001dR\u0011\u00102\u001a\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u000b\u00a8\u00065"
    }
    d2 = {
        "Ldev/whyoleg/cryptography/bigint/BigInt;",
        "",
        "",
        "Ljava/math/BigInteger;",
        "javaBigInteger",
        "<init>",
        "(Ljava/math/BigInteger;)V",
        "",
        "magnitudeToByteArray",
        "()[B",
        "unaryPlus",
        "()Ldev/whyoleg/cryptography/bigint/BigInt;",
        "unaryMinus",
        "",
        "other",
        "",
        "compareTo",
        "(B)I",
        "",
        "(S)I",
        "(I)I",
        "",
        "(J)I",
        "(Ldev/whyoleg/cryptography/bigint/BigInt;)I",
        "toByte",
        "()B",
        "toShort",
        "()S",
        "toInt",
        "()I",
        "toLong",
        "()J",
        "",
        "toFloat",
        "()F",
        "",
        "toDouble",
        "()D",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/math/BigInteger;",
        "getSign",
        "sign",
        "getAbsoluteValue",
        "absoluteValue",
        "Companion",
        "l80",
        "cryptography-bigint"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Lm80;
.end annotation


# static fields
.field public static final Companion:Ll80;

.field private static final ZERO:Ldev/whyoleg/cryptography/bigint/BigInt;


# instance fields
.field public final javaBigInteger:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldev/whyoleg/cryptography/bigint/BigInt;->Companion:Ll80;

    .line 7
    .line 8
    new-instance v0, Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 9
    .line 10
    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ldev/whyoleg/cryptography/bigint/BigInt;-><init>(Ljava/math/BigInteger;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ldev/whyoleg/cryptography/bigint/BigInt;->ZERO:Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final synthetic access$getZERO$cp()Ldev/whyoleg/cryptography/bigint/BigInt;
    .locals 1

    .line 1
    sget-object v0, Ldev/whyoleg/cryptography/bigint/BigInt;->ZERO:Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final bridge byteValue()B
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toByte()B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final compareTo(B)I
    .locals 2

    int-to-long v0, p1

    .line 15
    invoke-static {v0, v1}, Lgl0;->c0(J)Ldev/whyoleg/cryptography/bigint/BigInt;

    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ldev/whyoleg/cryptography/bigint/BigInt;->compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I

    move-result p0

    return p0
.end method

.method public final compareTo(I)I
    .locals 2

    int-to-long v0, p1

    .line 19
    invoke-static {v0, v1}, Lgl0;->c0(J)Ldev/whyoleg/cryptography/bigint/BigInt;

    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ldev/whyoleg/cryptography/bigint/BigInt;->compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I

    move-result p0

    return p0
.end method

.method public final compareTo(J)I
    .locals 0

    .line 13
    invoke-static {p1, p2}, Lgl0;->c0(J)Ldev/whyoleg/cryptography/bigint/BigInt;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldev/whyoleg/cryptography/bigint/BigInt;->compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I

    move-result p0

    return p0
.end method

.method public compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 5
    .line 6
    iget-object p1, p1, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 14
    check-cast p1, Ldev/whyoleg/cryptography/bigint/BigInt;

    invoke-virtual {p0, p1}, Ldev/whyoleg/cryptography/bigint/BigInt;->compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I

    move-result p0

    return p0
.end method

.method public final compareTo(S)I
    .locals 2

    int-to-long v0, p1

    .line 17
    invoke-static {v0, v1}, Lgl0;->c0(J)Ldev/whyoleg/cryptography/bigint/BigInt;

    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Ldev/whyoleg/cryptography/bigint/BigInt;->compareTo(Ldev/whyoleg/cryptography/bigint/BigInt;)I

    move-result p0

    return p0
.end method

.method public final bridge doubleValue()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toDouble()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 8
    .line 9
    check-cast p1, Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 10
    .line 11
    iget-object p1, p1, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 12
    .line 13
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final bridge floatValue()F
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toFloat()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getAbsoluteValue()Ldev/whyoleg/cryptography/bigint/BigInt;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->getSign()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 9
    .line 10
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Ldev/whyoleg/cryptography/bigint/BigInt;-><init>(Ljava/math/BigInteger;)V

    .line 20
    .line 21
    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final getSign()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge intValue()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toInt()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge longValue()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toLong()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final magnitudeToByteArray()[B
    .locals 4

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    const/4 v2, -0x1

    .line 17
    if-ge v1, v0, :cond_1

    .line 18
    .line 19
    aget-byte v3, p0, v1

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v2

    .line 28
    :goto_1
    if-ne v1, v2, :cond_2

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    array-length v0, p0

    .line 32
    invoke-static {p0, v1, v0}, Lqs;->P0([BII)[B

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final bridge shortValue()S
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/bigint/BigInt;->toShort()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toByte()B
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toDouble()D
    .locals 2

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toFloat()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toInt()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toLong()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toShort()S
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final unaryMinus()Ldev/whyoleg/cryptography/bigint/BigInt;
    .locals 1

    .line 1
    new-instance v0, Ldev/whyoleg/cryptography/bigint/BigInt;

    .line 2
    .line 3
    iget-object p0, p0, Ldev/whyoleg/cryptography/bigint/BigInt;->javaBigInteger:Ljava/math/BigInteger;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Ldev/whyoleg/cryptography/bigint/BigInt;-><init>(Ljava/math/BigInteger;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final unaryPlus()Ldev/whyoleg/cryptography/bigint/BigInt;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
