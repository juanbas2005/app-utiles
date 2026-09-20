.class public final synthetic Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lav2;"
    }
.end annotation

.annotation runtime Lfq1;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "cu/lestebang/utiletecsa/core/network/model/NetworkPost.$serializer",
        "Lav2;",
        "Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;",
        "<init>",
        "()V",
        "Lj42;",
        "encoder",
        "value",
        "Lvs7;",
        "serialize",
        "(Lj42;Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;)V",
        "Lok1;",
        "decoder",
        "deserialize",
        "(Lok1;)Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;",
        "",
        "Lzr3;",
        "childSerializers",
        "()[Lzr3;",
        "Lll6;",
        "descriptor",
        "Lll6;",
        "getDescriptor",
        "()Lll6;",
        "network"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->INSTANCE:Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "cu.lestebang.utiletecsa.core.network.model.NetworkPost"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "id"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "title"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "url"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "thumbnailUrl"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->descriptor:Lll6;

    .line 38
    .line 39
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
.method public final childSerializers()[Lzr3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lzr3;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x4

    .line 2
    new-array p0, p0, [Lzr3;

    .line 3
    .line 4
    sget-object v0, Lue3;->a:Lue3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    sget-object v0, Lt47;->a:Lt47;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object v0, p0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    aput-object v0, p0, v1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    aput-object v0, p0, v1

    .line 19
    .line 20
    return-object p0
    .line 21
.end method

.method public final deserialize(Lok1;)Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->descriptor:Lll6;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v0

    .line 14
    move v5, v1

    .line 15
    move v6, v5

    .line 16
    move-object v7, v2

    .line 17
    move-object v8, v7

    .line 18
    move-object v9, v8

    .line 19
    :goto_0
    if-eqz v3, :cond_5

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v10, -0x1

    .line 26
    if-eq v4, v10, :cond_4

    .line 27
    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    if-eq v4, v0, :cond_2

    .line 31
    .line 32
    const/4 v10, 0x2

    .line 33
    if-eq v4, v10, :cond_1

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    if-ne v4, v9, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, p0, v9}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    or-int/lit8 v5, v5, 0x8

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v4}, Lh;->e(I)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_1
    invoke-interface {p1, p0, v10}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    or-int/lit8 v5, v5, 0x4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {p1, p0, v0}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    or-int/lit8 v5, v5, 0x2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-interface {p1, p0, v1}, Lgy0;->s(Lll6;I)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    or-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    move v3, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_5
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-direct/range {v4 .. v10}, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V

    .line 79
    .line 80
    .line 81
    return-object v4
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
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

.method public bridge synthetic deserialize(Lok1;)Ljava/lang/Object;
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->deserialize(Lok1;)Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;

    move-result-object p0

    return-object p0
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->descriptor:Lll6;

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

.method public final serialize(Lj42;Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->descriptor:Lll6;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;->write$Self$network(Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;Lhy0;Lll6;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public bridge synthetic serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 20
    check-cast p2, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;

    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/core/network/model/NetworkPost$$serializer;->serialize(Lj42;Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lzr3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lzr3;"
        }
    .end annotation

    .line 1
    sget-object p0, Ldh4;->x:[Lzr3;

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
