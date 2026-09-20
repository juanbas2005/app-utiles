.class public final synthetic Lj84;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lj84;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lj84;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj84;->a:Lj84;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.storage.vectors.data.ListVectorsOptions"

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "vectorBucketName"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "indexName"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "maxResults"

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "nextToken"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "returnData"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "returnMetadata"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "segmentCount"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "segmentIndex"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lj84;->descriptor:Lll6;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 8

    .line 1
    sget-object p0, Lt47;->a:Lt47;

    .line 2
    .line 3
    sget-object v0, Lue3;->a:Lue3;

    .line 4
    .line 5
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lja0;->a:Lja0;

    .line 14
    .line 15
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/16 v6, 0x8

    .line 32
    .line 33
    new-array v6, v6, [Lzr3;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    aput-object p0, v6, v7

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    aput-object p0, v6, v7

    .line 40
    .line 41
    const/4 p0, 0x2

    .line 42
    aput-object v1, v6, p0

    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    aput-object v2, v6, p0

    .line 46
    .line 47
    const/4 p0, 0x4

    .line 48
    aput-object v4, v6, p0

    .line 49
    .line 50
    const/4 p0, 0x5

    .line 51
    aput-object v3, v6, p0

    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    aput-object v5, v6, p0

    .line 55
    .line 56
    const/4 p0, 0x7

    .line 57
    aput-object v0, v6, p0

    .line 58
    .line 59
    return-object v6
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, Lj84;->descriptor:Lll6;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v2

    .line 13
    move v7, v3

    .line 14
    move-object v8, v4

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    move-object v11, v10

    .line 18
    move-object v12, v11

    .line 19
    move-object v13, v12

    .line 20
    move-object v14, v13

    .line 21
    move-object v15, v14

    .line 22
    :goto_0
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    packed-switch v6, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, Lh;->e(I)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    const/4 v6, 0x7

    .line 36
    sget-object v4, Lue3;->a:Lue3;

    .line 37
    .line 38
    invoke-interface {v1, v0, v6, v4, v15}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v15, v4

    .line 43
    check-cast v15, Ljava/lang/Integer;

    .line 44
    .line 45
    or-int/lit16 v7, v7, 0x80

    .line 46
    .line 47
    :goto_1
    const/4 v4, 0x0

    .line 48
    goto :goto_0

    .line 49
    :pswitch_1
    const/4 v4, 0x6

    .line 50
    sget-object v6, Lue3;->a:Lue3;

    .line 51
    .line 52
    invoke-interface {v1, v0, v4, v6, v14}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    move-object v14, v4

    .line 57
    check-cast v14, Ljava/lang/Integer;

    .line 58
    .line 59
    or-int/lit8 v7, v7, 0x40

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_2
    const/4 v4, 0x5

    .line 63
    sget-object v6, Lja0;->a:Lja0;

    .line 64
    .line 65
    invoke-interface {v1, v0, v4, v6, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move-object v13, v4

    .line 70
    check-cast v13, Ljava/lang/Boolean;

    .line 71
    .line 72
    or-int/lit8 v7, v7, 0x20

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_3
    sget-object v4, Lja0;->a:Lja0;

    .line 76
    .line 77
    const/4 v6, 0x4

    .line 78
    invoke-interface {v1, v0, v6, v4, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v12, v4

    .line 83
    check-cast v12, Ljava/lang/Boolean;

    .line 84
    .line 85
    or-int/lit8 v7, v7, 0x10

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_4
    const/4 v4, 0x3

    .line 89
    sget-object v6, Lt47;->a:Lt47;

    .line 90
    .line 91
    invoke-interface {v1, v0, v4, v6, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    move-object v11, v4

    .line 96
    check-cast v11, Ljava/lang/String;

    .line 97
    .line 98
    or-int/lit8 v7, v7, 0x8

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :pswitch_5
    sget-object v4, Lue3;->a:Lue3;

    .line 102
    .line 103
    const/4 v6, 0x2

    .line 104
    invoke-interface {v1, v0, v6, v4, v10}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    move-object v10, v4

    .line 109
    check-cast v10, Ljava/lang/Integer;

    .line 110
    .line 111
    or-int/lit8 v7, v7, 0x4

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_6
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    or-int/lit8 v7, v7, 0x2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_7
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    or-int/lit8 v7, v7, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_8
    move v5, v3

    .line 129
    goto :goto_0

    .line 130
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 131
    .line 132
    .line 133
    new-instance v6, Lio/github/jan/supabase/storage/vectors/data/ListVectorsOptions;

    .line 134
    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    invoke-direct/range {v6 .. v16}, Lio/github/jan/supabase/storage/vectors/data/ListVectorsOptions;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lrl6;)V

    .line 138
    .line 139
    .line 140
    return-object v6

    .line 141
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    sget-object p0, Lj84;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/storage/vectors/data/ListVectorsOptions;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lj84;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/storage/vectors/data/ListVectorsOptions;->write$Self$storage_kt(Lio/github/jan/supabase/storage/vectors/data/ListVectorsOptions;Lhy0;Lll6;)V

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
