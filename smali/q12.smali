.class public final synthetic Lq12;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lq12;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lq12;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq12;->a:Lq12;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "dev.whyoleg.cryptography.serialization.asn1.modules.EcPrivateKey"

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
    const-string v0, "privateKey"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "parameters"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lp12;

    .line 34
    .line 35
    invoke-direct {v0, v2}, Lp12;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lik5;->l(Ljava/lang/annotation/Annotation;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "publicKey"

    .line 42
    .line 43
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lp12;

    .line 47
    .line 48
    invoke-direct {v0, v3}, Lp12;-><init>(B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lik5;->l(Ljava/lang/annotation/Annotation;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lq12;->descriptor:Lll6;

    .line 55
    .line 56
    return-void
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
    .locals 4

    .line 1
    sget-object p0, Ll12;->a:Ll12;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lg90;->a:Lg90;

    .line 8
    .line 9
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x4

    .line 14
    new-array v1, v1, [Lzr3;

    .line 15
    .line 16
    sget-object v2, Lue3;->a:Lue3;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v2, Loe0;->c:Loe0;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object p0, v1, v2

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    aput-object v0, v1, p0

    .line 31
    .line 32
    return-object v1
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
    .locals 12

    .line 1
    sget-object p0, Lq12;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v5, v1

    .line 12
    move v6, v5

    .line 13
    move-object v7, v2

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    :goto_0
    if-eqz v3, :cond_7

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v4, v10, :cond_6

    .line 24
    .line 25
    if-eqz v4, :cond_5

    .line 26
    .line 27
    if-eq v4, v0, :cond_4

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-eq v4, v10, :cond_1

    .line 31
    .line 32
    const/4 v10, 0x3

    .line 33
    if-ne v4, v10, :cond_0

    .line 34
    .line 35
    sget-object v4, Lg90;->a:Lg90;

    .line 36
    .line 37
    invoke-interface {p1, p0, v10, v4, v9}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v9, v4

    .line 42
    check-cast v9, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;

    .line 43
    .line 44
    or-int/lit8 v5, v5, 0x8

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v4}, Lh;->e(I)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    sget-object v4, Ll12;->a:Ll12;

    .line 52
    .line 53
    if-eqz v8, :cond_2

    .line 54
    .line 55
    invoke-static {v8}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;->box-impl(Ljava/lang/String;)Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v8, v2

    .line 61
    :goto_1
    invoke-interface {p1, p0, v10, v4, v8}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    invoke-virtual {v4}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;->unbox-impl()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move-object v8, v4

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object v8, v2

    .line 76
    :goto_2
    or-int/lit8 v5, v5, 0x4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    sget-object v4, Loe0;->c:Loe0;

    .line 80
    .line 81
    invoke-interface {p1, p0, v0, v4, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move-object v7, v4

    .line 86
    check-cast v7, [B

    .line 87
    .line 88
    or-int/lit8 v5, v5, 0x2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-interface {p1, p0, v1}, Lgy0;->s(Lll6;I)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    or-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_6
    move v3, v1

    .line 99
    goto :goto_0

    .line 100
    :cond_7
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    invoke-direct/range {v4 .. v11}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;-><init>(II[BLjava/lang/String;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;Lhl1;)V

    .line 108
    .line 109
    .line 110
    return-object v4
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
    sget-object p0, Lq12;->descriptor:Lll6;

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
    check-cast p2, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lq12;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;->write$Self$cryptography_serialization_asn1_modules(Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;Lhy0;Lll6;)V

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
