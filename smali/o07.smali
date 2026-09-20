.class public final synthetic Lo07;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lo07;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lo07;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo07;->a:Lo07;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "cu.lestebang.utiletecsa.data.repository.spots.SpotInsertDto"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "nick"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "connection_type"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "quality"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "address"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "province"

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "note"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "latitude"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "longitude"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "user_id"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "device_id"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    sput-object v1, Lo07;->descriptor:Lll6;

    .line 70
    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 7

    .line 1
    sget-object p0, Lt47;->a:Lt47;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lix1;->a:Lix1;

    .line 12
    .line 13
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/16 v5, 0xa

    .line 26
    .line 27
    new-array v5, v5, [Lzr3;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    aput-object p0, v5, v6

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    aput-object p0, v5, v6

    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    aput-object p0, v5, v6

    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    aput-object p0, v5, v6

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    aput-object v0, v5, v6

    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    aput-object v1, v5, v0

    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    aput-object v3, v5, v0

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    aput-object v2, v5, v0

    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    aput-object v4, v5, v0

    .line 56
    .line 57
    const/16 v0, 0x9

    .line 58
    .line 59
    aput-object p0, v5, v0

    .line 60
    .line 61
    return-object v5
    .line 62
    .line 63
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 19

    .line 1
    sget-object v0, Lo07;->descriptor:Lll6;

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
    const/4 v4, 0x0

    .line 11
    move v5, v2

    .line 12
    move-object v6, v4

    .line 13
    move-object v8, v6

    .line 14
    move-object v9, v8

    .line 15
    move-object v10, v9

    .line 16
    move-object v11, v10

    .line 17
    move-object v12, v11

    .line 18
    move-object v13, v12

    .line 19
    move-object v14, v13

    .line 20
    move-object v15, v14

    .line 21
    move-object/from16 v17, v15

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 27
    .line 28
    .line 29
    move-result v16

    .line 30
    packed-switch v16, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v16 .. v16}, Lh;->e(I)V

    .line 34
    .line 35
    .line 36
    return-object v4

    .line 37
    :pswitch_0
    const/16 v4, 0x9

    .line 38
    .line 39
    invoke-interface {v1, v0, v4}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v17

    .line 43
    or-int/lit16 v7, v7, 0x200

    .line 44
    .line 45
    :goto_1
    const/4 v4, 0x0

    .line 46
    goto :goto_0

    .line 47
    :pswitch_1
    sget-object v4, Lt47;->a:Lt47;

    .line 48
    .line 49
    const/16 v3, 0x8

    .line 50
    .line 51
    invoke-interface {v1, v0, v3, v4, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move-object v6, v3

    .line 56
    check-cast v6, Ljava/lang/String;

    .line 57
    .line 58
    or-int/lit16 v7, v7, 0x100

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_2
    const/4 v3, 0x7

    .line 62
    sget-object v4, Lix1;->a:Lix1;

    .line 63
    .line 64
    invoke-interface {v1, v0, v3, v4, v15}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v15, v3

    .line 69
    check-cast v15, Ljava/lang/Double;

    .line 70
    .line 71
    or-int/lit16 v7, v7, 0x80

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :pswitch_3
    const/4 v3, 0x6

    .line 75
    sget-object v4, Lix1;->a:Lix1;

    .line 76
    .line 77
    invoke-interface {v1, v0, v3, v4, v14}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move-object v14, v3

    .line 82
    check-cast v14, Ljava/lang/Double;

    .line 83
    .line 84
    or-int/lit8 v7, v7, 0x40

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_4
    const/4 v3, 0x5

    .line 88
    sget-object v4, Lt47;->a:Lt47;

    .line 89
    .line 90
    invoke-interface {v1, v0, v3, v4, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    move-object v13, v3

    .line 95
    check-cast v13, Ljava/lang/String;

    .line 96
    .line 97
    or-int/lit8 v7, v7, 0x20

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_5
    sget-object v3, Lt47;->a:Lt47;

    .line 101
    .line 102
    const/4 v4, 0x4

    .line 103
    invoke-interface {v1, v0, v4, v3, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move-object v12, v3

    .line 108
    check-cast v12, Ljava/lang/String;

    .line 109
    .line 110
    or-int/lit8 v7, v7, 0x10

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :pswitch_6
    const/4 v3, 0x3

    .line 114
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    or-int/lit8 v7, v7, 0x8

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_7
    const/4 v3, 0x2

    .line 122
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    or-int/lit8 v7, v7, 0x4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_8
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    or-int/lit8 v7, v7, 0x2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_9
    const/4 v3, 0x0

    .line 137
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    or-int/lit8 v7, v7, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :pswitch_a
    const/4 v3, 0x0

    .line 145
    move v5, v3

    .line 146
    goto :goto_0

    .line 147
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v16, v6

    .line 151
    .line 152
    new-instance v6, Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;

    .line 153
    .line 154
    const/16 v18, 0x0

    .line 155
    .line 156
    invoke-direct/range {v6 .. v18}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lrl6;)V

    .line 157
    .line 158
    .line 159
    return-object v6

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_9
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
    sget-object p0, Lo07;->descriptor:Lll6;

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
    check-cast p2, Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lo07;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;->write$Self$data(Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;Lhy0;Lll6;)V

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
