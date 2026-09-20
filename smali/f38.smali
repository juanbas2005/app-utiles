.class public final synthetic Lf38;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lf38;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lf38;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf38;->a:Lf38;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.storage.vectors.data.VectorMatch"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "key"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "data"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "metadata"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "distance"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lf38;->descriptor:Lll6;

    .line 39
    .line 40
    return-void
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
    .locals 5

    .line 1
    sget-object p0, Ln28;->a:Ln28;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lxm3;->a:Lxm3;

    .line 8
    .line 9
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lue3;->a:Lue3;

    .line 14
    .line 15
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x4

    .line 20
    new-array v2, v2, [Lzr3;

    .line 21
    .line 22
    sget-object v3, Lt47;->a:Lt47;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    aput-object v3, v2, v4

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    aput-object p0, v2, v3

    .line 29
    .line 30
    const/4 p0, 0x2

    .line 31
    aput-object v0, v2, p0

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    aput-object v1, v2, p0

    .line 35
    .line 36
    return-object v2
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
    .locals 11

    .line 1
    sget-object p0, Lf38;->descriptor:Lll6;

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
    move-object v6, v2

    .line 13
    move-object v7, v6

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    :goto_0
    if-eqz v3, :cond_5

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
    if-eq v4, v10, :cond_4

    .line 24
    .line 25
    if-eqz v4, :cond_3

    .line 26
    .line 27
    if-eq v4, v0, :cond_2

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
    sget-object v4, Lue3;->a:Lue3;

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
    check-cast v9, Ljava/lang/Integer;

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
    sget-object v4, Lxm3;->a:Lxm3;

    .line 52
    .line 53
    invoke-interface {p1, p0, v10, v4, v8}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    move-object v8, v4

    .line 58
    check-cast v8, Lkotlinx/serialization/json/JsonObject;

    .line 59
    .line 60
    or-int/lit8 v5, v5, 0x4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    sget-object v4, Ln28;->a:Ln28;

    .line 64
    .line 65
    invoke-interface {p1, p0, v0, v4, v7}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move-object v7, v4

    .line 70
    check-cast v7, Lio/github/jan/supabase/storage/vectors/data/VectorData;

    .line 71
    .line 72
    or-int/lit8 v5, v5, 0x2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-interface {p1, p0, v1}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    or-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move v3, v1

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Lio/github/jan/supabase/storage/vectors/data/VectorMatch;

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-direct/range {v4 .. v10}, Lio/github/jan/supabase/storage/vectors/data/VectorMatch;-><init>(ILjava/lang/String;Lio/github/jan/supabase/storage/vectors/data/VectorData;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Integer;Lrl6;)V

    .line 91
    .line 92
    .line 93
    return-object v4
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

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lf38;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/storage/vectors/data/VectorMatch;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lf38;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/storage/vectors/data/VectorMatch;->write$Self$storage_kt(Lio/github/jan/supabase/storage/vectors/data/VectorMatch;Lhy0;Lll6;)V

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
