.class public final synthetic Lyo5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lyo5;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyo5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyo5;->a:Lyo5;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "dev.whyoleg.cryptography.serialization.asn1.modules.PrivateKeyInfo"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "version"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "privateKeyAlgorithm"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "privateKey"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "publicKey"

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lxo5;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lik5;->l(Ljava/lang/annotation/Annotation;)V

    .line 44
    .line 45
    .line 46
    sput-object v1, Lyo5;->descriptor:Lll6;

    .line 47
    .line 48
    return-void
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
    .locals 3

    .line 1
    invoke-static {}, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x4

    .line 6
    new-array v0, v0, [Lzr3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    sget-object v2, Lue3;->a:Lue3;

    .line 10
    .line 11
    aput-object v2, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object p0, p0, v1

    .line 15
    .line 16
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    aput-object p0, v0, v1

    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    sget-object v1, Loe0;->c:Loe0;

    .line 24
    .line 25
    aput-object v1, v0, p0

    .line 26
    .line 27
    sget-object p0, Lg90;->a:Lg90;

    .line 28
    .line 29
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v1, 0x3

    .line 34
    aput-object p0, v0, v1

    .line 35
    .line 36
    return-object v0
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
    .locals 12

    .line 1
    sget-object p0, Lyo5;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;->access$get$childSerializers$cp()[Lnz3;

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
    move v6, v2

    .line 16
    move v7, v6

    .line 17
    move-object v8, v3

    .line 18
    move-object v9, v8

    .line 19
    move-object v10, v9

    .line 20
    :goto_0
    if-eqz v4, :cond_5

    .line 21
    .line 22
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v11, -0x1

    .line 27
    if-eq v5, v11, :cond_4

    .line 28
    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    if-eq v5, v1, :cond_2

    .line 32
    .line 33
    const/4 v11, 0x2

    .line 34
    if-eq v5, v11, :cond_1

    .line 35
    .line 36
    const/4 v11, 0x3

    .line 37
    if-ne v5, v11, :cond_0

    .line 38
    .line 39
    sget-object v5, Lg90;->a:Lg90;

    .line 40
    .line 41
    invoke-interface {p1, p0, v11, v5, v10}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    move-object v10, v5

    .line 46
    check-cast v10, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;

    .line 47
    .line 48
    or-int/lit8 v6, v6, 0x8

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {v5}, Lh;->e(I)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_1
    sget-object v5, Loe0;->c:Loe0;

    .line 56
    .line 57
    invoke-interface {p1, p0, v11, v5, v9}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    move-object v9, v5

    .line 62
    check-cast v9, [B

    .line 63
    .line 64
    or-int/lit8 v6, v6, 0x4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    aget-object v5, v0, v1

    .line 68
    .line 69
    invoke-interface {v5}, Lnz3;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lzr3;

    .line 74
    .line 75
    invoke-interface {p1, p0, v1, v5, v8}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v8, v5

    .line 80
    check-cast v8, Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;

    .line 81
    .line 82
    or-int/lit8 v6, v6, 0x2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-interface {p1, p0, v2}, Lgy0;->s(Lll6;I)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    or-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    move v4, v2

    .line 93
    goto :goto_0

    .line 94
    :cond_5
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 95
    .line 96
    .line 97
    new-instance v5, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;

    .line 98
    .line 99
    const/4 v11, 0x0

    .line 100
    invoke-direct/range {v5 .. v11}, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;-><init>(IILdev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;[BLdev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;)V

    .line 101
    .line 102
    .line 103
    return-object v5
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lyo5;->descriptor:Lll6;

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
    check-cast p2, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lyo5;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;->write$Self$cryptography_serialization_asn1_modules(Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;Lhy0;Lll6;)V

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
