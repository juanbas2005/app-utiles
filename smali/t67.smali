.class public final synthetic Lt67;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lt67;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt67;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt67;->a:Lt67;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "dev.whyoleg.cryptography.serialization.asn1.modules.SubjectPublicKeyInfo"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "algorithm"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "subjectPublicKey"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lt67;->descriptor:Lll6;

    .line 28
    .line 29
    return-void
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


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 2

    .line 1
    invoke-static {}, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [Lzr3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object p0, p0, v1

    .line 10
    .line 11
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    sget-object v1, Lg90;->a:Lg90;

    .line 19
    .line 20
    aput-object v1, v0, p0

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

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, Lt67;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;->access$get$childSerializers$cp()[Lnz3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v1

    .line 15
    move v5, v2

    .line 16
    move-object v6, v3

    .line 17
    move-object v7, v6

    .line 18
    :goto_0
    if-eqz v4, :cond_3

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, -0x1

    .line 25
    if-eq v8, v9, :cond_2

    .line 26
    .line 27
    if-eqz v8, :cond_1

    .line 28
    .line 29
    if-ne v8, v1, :cond_0

    .line 30
    .line 31
    sget-object v8, Lg90;->a:Lg90;

    .line 32
    .line 33
    invoke-interface {p1, p0, v1, v8, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;

    .line 38
    .line 39
    or-int/lit8 v5, v5, 0x2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v8}, Lh;->e(I)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    aget-object v8, v0, v2

    .line 47
    .line 48
    invoke-interface {v8}, Lnz3;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, Lzr3;

    .line 53
    .line 54
    invoke-interface {p1, p0, v2, v8, v6}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;

    .line 59
    .line 60
    or-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v4, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;

    .line 69
    .line 70
    invoke-direct {p0, v5, v6, v7, v3}, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;-><init>(ILdev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;)V

    .line 71
    .line 72
    .line 73
    return-object p0
    .line 74
    .line 75
    .line 76
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lt67;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
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

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lt67;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;->write$Self$cryptography_serialization_asn1_modules(Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;Lhy0;Lll6;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method
