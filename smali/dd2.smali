.class public final synthetic Ldd2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Ldd2;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldd2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldd2;->a:Ldd2;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.storage.FileObjectV2"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "name"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "id"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "version"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "bucket_id"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "updated_at"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "created_at"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "last_accessed_at"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "metadata"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "size"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "content_type"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "etag"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "last_modified"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "cache_control"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Ldd2;->descriptor:Lll6;

    .line 85
    .line 86
    return-void
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
    .locals 11

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
    sget-object v2, Lwd3;->a:Lwd3;

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
    move-result-object v4

    .line 21
    sget-object v5, Lxm3;->a:Lxm3;

    .line 22
    .line 23
    invoke-static {v5}, Lhj8;->x(Lzr3;)Lzr3;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    const/16 v9, 0xd

    .line 40
    .line 41
    new-array v9, v9, [Lzr3;

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    aput-object p0, v9, v10

    .line 45
    .line 46
    const/4 v10, 0x1

    .line 47
    aput-object v0, v9, v10

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    aput-object p0, v9, v0

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    aput-object v1, v9, v0

    .line 54
    .line 55
    const/4 v0, 0x4

    .line 56
    aput-object v3, v9, v0

    .line 57
    .line 58
    const/4 v0, 0x5

    .line 59
    aput-object v2, v9, v0

    .line 60
    .line 61
    const/4 v0, 0x6

    .line 62
    aput-object v4, v9, v0

    .line 63
    .line 64
    const/4 v0, 0x7

    .line 65
    aput-object v5, v9, v0

    .line 66
    .line 67
    sget-object v0, Ltc4;->a:Ltc4;

    .line 68
    .line 69
    const/16 v1, 0x8

    .line 70
    .line 71
    aput-object v0, v9, v1

    .line 72
    .line 73
    const/16 v0, 0x9

    .line 74
    .line 75
    aput-object p0, v9, v0

    .line 76
    .line 77
    const/16 p0, 0xa

    .line 78
    .line 79
    aput-object v6, v9, p0

    .line 80
    .line 81
    const/16 p0, 0xb

    .line 82
    .line 83
    aput-object v7, v9, p0

    .line 84
    .line 85
    const/16 p0, 0xc

    .line 86
    .line 87
    aput-object v8, v9, p0

    .line 88
    .line 89
    return-object v9
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

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 24

    .line 1
    sget-object v0, Ldd2;->descriptor:Lll6;

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
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    move-wide/from16 v17, v5

    .line 12
    .line 13
    const/16 p0, 0x0

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v19, 0x0

    .line 29
    .line 30
    :goto_0
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 33
    .line 34
    .line 35
    move-result v16

    .line 36
    packed-switch v16, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v16 .. v16}, Lh;->e(I)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    const/16 v2, 0xc

    .line 44
    .line 45
    move/from16 v20, v5

    .line 46
    .line 47
    sget-object v5, Lt47;->a:Lt47;

    .line 48
    .line 49
    invoke-interface {v1, v0, v2, v5, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v3, v2

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    or-int/lit16 v8, v8, 0x1000

    .line 57
    .line 58
    :goto_1
    move/from16 v5, v20

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_1
    move/from16 v20, v5

    .line 62
    .line 63
    const/16 v2, 0xb

    .line 64
    .line 65
    sget-object v5, Lwd3;->a:Lwd3;

    .line 66
    .line 67
    invoke-interface {v1, v0, v2, v5, v4}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v4, v2

    .line 72
    check-cast v4, Lqd3;

    .line 73
    .line 74
    or-int/lit16 v8, v8, 0x800

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_2
    move/from16 v20, v5

    .line 78
    .line 79
    const/16 v2, 0xa

    .line 80
    .line 81
    sget-object v5, Lt47;->a:Lt47;

    .line 82
    .line 83
    invoke-interface {v1, v0, v2, v5, v7}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move-object v7, v2

    .line 88
    check-cast v7, Ljava/lang/String;

    .line 89
    .line 90
    or-int/lit16 v8, v8, 0x400

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_3
    move/from16 v20, v5

    .line 94
    .line 95
    const/16 v2, 0x9

    .line 96
    .line 97
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v19

    .line 101
    or-int/lit16 v8, v8, 0x200

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_4
    move/from16 v20, v5

    .line 105
    .line 106
    const/16 v2, 0x8

    .line 107
    .line 108
    invoke-interface {v1, v0, v2}, Lgy0;->D(Lll6;I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v17

    .line 112
    or-int/lit16 v8, v8, 0x100

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_5
    move/from16 v20, v5

    .line 116
    .line 117
    const/4 v2, 0x7

    .line 118
    sget-object v5, Lxm3;->a:Lxm3;

    .line 119
    .line 120
    invoke-interface {v1, v0, v2, v5, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v6, v2

    .line 125
    check-cast v6, Lkotlinx/serialization/json/JsonObject;

    .line 126
    .line 127
    or-int/lit16 v8, v8, 0x80

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_6
    move/from16 v20, v5

    .line 131
    .line 132
    const/4 v2, 0x6

    .line 133
    sget-object v5, Lwd3;->a:Lwd3;

    .line 134
    .line 135
    invoke-interface {v1, v0, v2, v5, v15}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v15, v2

    .line 140
    check-cast v15, Lqd3;

    .line 141
    .line 142
    or-int/lit8 v8, v8, 0x40

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_7
    move/from16 v20, v5

    .line 146
    .line 147
    const/4 v2, 0x5

    .line 148
    sget-object v5, Lwd3;->a:Lwd3;

    .line 149
    .line 150
    invoke-interface {v1, v0, v2, v5, v14}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    move-object v14, v2

    .line 155
    check-cast v14, Lqd3;

    .line 156
    .line 157
    or-int/lit8 v8, v8, 0x20

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_8
    move/from16 v20, v5

    .line 161
    .line 162
    sget-object v2, Lwd3;->a:Lwd3;

    .line 163
    .line 164
    const/4 v5, 0x4

    .line 165
    invoke-interface {v1, v0, v5, v2, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    move-object v13, v2

    .line 170
    check-cast v13, Lqd3;

    .line 171
    .line 172
    or-int/lit8 v8, v8, 0x10

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_9
    move/from16 v20, v5

    .line 176
    .line 177
    const/4 v2, 0x3

    .line 178
    sget-object v5, Lt47;->a:Lt47;

    .line 179
    .line 180
    invoke-interface {v1, v0, v2, v5, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    move-object v12, v2

    .line 185
    check-cast v12, Ljava/lang/String;

    .line 186
    .line 187
    or-int/lit8 v8, v8, 0x8

    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :pswitch_a
    move/from16 v20, v5

    .line 192
    .line 193
    const/4 v2, 0x2

    .line 194
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    or-int/lit8 v8, v8, 0x4

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :pswitch_b
    move/from16 v20, v5

    .line 203
    .line 204
    sget-object v2, Lt47;->a:Lt47;

    .line 205
    .line 206
    const/4 v5, 0x1

    .line 207
    invoke-interface {v1, v0, v5, v2, v10}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    move-object v10, v2

    .line 212
    check-cast v10, Ljava/lang/String;

    .line 213
    .line 214
    or-int/lit8 v8, v8, 0x2

    .line 215
    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :pswitch_c
    move/from16 v20, v5

    .line 219
    .line 220
    const/4 v2, 0x0

    .line 221
    const/4 v5, 0x1

    .line 222
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    or-int/lit8 v8, v8, 0x1

    .line 227
    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :pswitch_d
    const/4 v2, 0x0

    .line 231
    const/4 v5, 0x1

    .line 232
    move v5, v2

    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v7

    .line 239
    .line 240
    new-instance v7, Lio/github/jan/supabase/storage/FileObjectV2;

    .line 241
    .line 242
    const/16 v23, 0x0

    .line 243
    .line 244
    move-object/from16 v22, v3

    .line 245
    .line 246
    move-object/from16 v21, v4

    .line 247
    .line 248
    move-object/from16 v16, v6

    .line 249
    .line 250
    invoke-direct/range {v7 .. v23}, Lio/github/jan/supabase/storage/FileObjectV2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lqd3;Ljava/lang/String;Lrl6;)V

    .line 251
    .line 252
    .line 253
    return-object v7

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Ldd2;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/storage/FileObjectV2;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ldd2;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/storage/FileObjectV2;->write$Self$storage_kt(Lio/github/jan/supabase/storage/FileObjectV2;Lhy0;Lll6;)V

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
