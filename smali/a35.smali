.class public abstract La35;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic a:I

.field public static b:Lx83;

.field public static final synthetic c:I

.field public static final synthetic d:I

.field public static final synthetic e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
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
.end method

.method public static final a(JLtg7;Lgs2;Lyt2;I)V
    .locals 7

    .line 1
    const v0, -0x28d355e8

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Lyt2;->g0(I)Lyt2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p4, p0, p1}, Lyt2;->f(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p5

    .line 23
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p4, p2}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p4, p3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 56
    .line 57
    const/16 v2, 0x92

    .line 58
    .line 59
    if-eq v1, v2, :cond_6

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    goto :goto_4

    .line 63
    :cond_6
    const/4 v1, 0x0

    .line 64
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 65
    .line 66
    invoke-virtual {p4, v2, v1}, Lyt2;->V(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    sget-object v1, Lyf7;->a:Lyy0;

    .line 73
    .line 74
    invoke-virtual {p4, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ltg7;

    .line 79
    .line 80
    invoke-virtual {v2, p2}, Ltg7;->d(Ltg7;)Ltg7;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v3, Lj41;->a:Lyy0;

    .line 85
    .line 86
    invoke-static {p0, p1, v3}, Lb81;->g(JLyy0;)Lju5;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v2}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    filled-new-array {v3, v1}, [Lju5;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    shr-int/lit8 v0, v0, 0x3

    .line 99
    .line 100
    and-int/lit8 v0, v0, 0x70

    .line 101
    .line 102
    const/16 v2, 0x8

    .line 103
    .line 104
    or-int/2addr v0, v2

    .line 105
    invoke-static {v1, p3, p4, v0}, Lt49;->d([Lju5;Lgs2;Lyt2;I)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_7
    invoke-virtual {p4}, Lyt2;->Y()V

    .line 110
    .line 111
    .line 112
    :goto_5
    invoke-virtual {p4}, Lyt2;->v()Lyx5;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    if-eqz p4, :cond_8

    .line 117
    .line 118
    new-instance v0, Liu5;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    move-wide v1, p0

    .line 122
    move-object v3, p2

    .line 123
    move-object v4, p3

    .line 124
    move v5, p5

    .line 125
    invoke-direct/range {v0 .. v6}, Liu5;-><init>(JLtg7;Lgs2;II)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p4, Lyx5;->d:Lgs2;

    .line 129
    .line 130
    :cond_8
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
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
.end method

.method public static final b([FLy71;Ljava/util/AbstractList;FF)Ls96;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v4, v0

    .line 15
    const/4 v5, 0x6

    .line 16
    const/4 v6, 0x0

    .line 17
    if-lt v4, v5, :cond_18

    .line 18
    .line 19
    array-length v4, v0

    .line 20
    const/4 v5, 0x2

    .line 21
    rem-int/2addr v4, v5

    .line 22
    const/4 v7, 0x1

    .line 23
    if-eq v4, v7, :cond_17

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    mul-int/2addr v4, v5

    .line 32
    array-length v8, v0

    .line 33
    if-ne v4, v8, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v0, "perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)"

    .line 37
    .line 38
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v6

    .line 42
    :cond_1
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    array-length v8, v0

    .line 48
    div-int/2addr v8, v5

    .line 49
    new-instance v9, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    move v11, v10

    .line 56
    :goto_1
    if-ge v11, v8, :cond_4

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    check-cast v12, Ly71;

    .line 65
    .line 66
    if-nez v12, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move-object/from16 v20, v12

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    :goto_2
    move-object/from16 v20, p1

    .line 73
    .line 74
    :goto_3
    add-int v12, v11, v8

    .line 75
    .line 76
    sub-int/2addr v12, v7

    .line 77
    rem-int/2addr v12, v8

    .line 78
    mul-int/2addr v12, v5

    .line 79
    add-int/lit8 v21, v11, 0x1

    .line 80
    .line 81
    rem-int v13, v21, v8

    .line 82
    .line 83
    mul-int/2addr v13, v5

    .line 84
    move v14, v13

    .line 85
    new-instance v13, Lm96;

    .line 86
    .line 87
    aget v15, v0, v12

    .line 88
    .line 89
    add-int/2addr v12, v7

    .line 90
    aget v12, v0, v12

    .line 91
    .line 92
    invoke-static {v15, v12}, Lmh2;->a(FF)J

    .line 93
    .line 94
    .line 95
    move-result-wide v15

    .line 96
    mul-int/lit8 v11, v11, 0x2

    .line 97
    .line 98
    aget v12, v0, v11

    .line 99
    .line 100
    add-int/2addr v11, v7

    .line 101
    aget v11, v0, v11

    .line 102
    .line 103
    invoke-static {v12, v11}, Lmh2;->a(FF)J

    .line 104
    .line 105
    .line 106
    move-result-wide v11

    .line 107
    move/from16 v22, v2

    .line 108
    .line 109
    aget v2, v0, v14

    .line 110
    .line 111
    add-int/2addr v14, v7

    .line 112
    aget v14, v0, v14

    .line 113
    .line 114
    invoke-static {v2, v14}, Lmh2;->a(FF)J

    .line 115
    .line 116
    .line 117
    move-result-wide v18

    .line 118
    move-wide v14, v15

    .line 119
    move-wide/from16 v16, v11

    .line 120
    .line 121
    invoke-direct/range {v13 .. v20}, Lm96;-><init>(JJJLy71;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move/from16 v11, v21

    .line 128
    .line 129
    move/from16 v2, v22

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move/from16 v22, v2

    .line 133
    .line 134
    invoke-static {v10, v8}, Lz65;->V(II)Lre3;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v2, Ljava/util/ArrayList;

    .line 139
    .line 140
    const/16 v11, 0xa

    .line 141
    .line 142
    invoke-static {v1, v11}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lpe3;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    :goto_4
    move-object v11, v1

    .line 154
    check-cast v11, Lqe3;

    .line 155
    .line 156
    iget-boolean v11, v11, Lqe3;->y:Z

    .line 157
    .line 158
    const/4 v12, 0x0

    .line 159
    if-eqz v11, :cond_7

    .line 160
    .line 161
    move-object v11, v1

    .line 162
    check-cast v11, Lje3;

    .line 163
    .line 164
    invoke-virtual {v11}, Lje3;->nextInt()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    check-cast v13, Lm96;

    .line 173
    .line 174
    iget v13, v13, Lm96;->h:F

    .line 175
    .line 176
    add-int/lit8 v14, v11, 0x1

    .line 177
    .line 178
    rem-int/2addr v14, v8

    .line 179
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    check-cast v15, Lm96;

    .line 184
    .line 185
    iget v15, v15, Lm96;->h:F

    .line 186
    .line 187
    add-float/2addr v13, v15

    .line 188
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    check-cast v15, Lm96;

    .line 193
    .line 194
    invoke-virtual {v15}, Lm96;->c()F

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v16

    .line 202
    check-cast v16, Lm96;

    .line 203
    .line 204
    invoke-virtual/range {v16 .. v16}, Lm96;->c()F

    .line 205
    .line 206
    .line 207
    move-result v16

    .line 208
    add-float v16, v16, v15

    .line 209
    .line 210
    mul-int/2addr v11, v5

    .line 211
    aget v15, v0, v11

    .line 212
    .line 213
    add-int/2addr v11, v7

    .line 214
    aget v11, v0, v11

    .line 215
    .line 216
    mul-int/2addr v14, v5

    .line 217
    aget v17, v0, v14

    .line 218
    .line 219
    add-int/2addr v14, v7

    .line 220
    aget v14, v0, v14

    .line 221
    .line 222
    sub-float v15, v15, v17

    .line 223
    .line 224
    sub-float/2addr v11, v14

    .line 225
    sget v14, Lj18;->b:F

    .line 226
    .line 227
    mul-float/2addr v15, v15

    .line 228
    mul-float/2addr v11, v11

    .line 229
    add-float/2addr v11, v15

    .line 230
    float-to-double v14, v11

    .line 231
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 232
    .line 233
    .line 234
    move-result-wide v14

    .line 235
    double-to-float v11, v14

    .line 236
    cmpl-float v14, v13, v11

    .line 237
    .line 238
    if-lez v14, :cond_5

    .line 239
    .line 240
    div-float/2addr v11, v13

    .line 241
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    new-instance v13, Lyb5;

    .line 250
    .line 251
    invoke-direct {v13, v11, v12}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_5
    cmpl-float v12, v16, v11

    .line 256
    .line 257
    if-lez v12, :cond_6

    .line 258
    .line 259
    sub-float/2addr v11, v13

    .line 260
    sub-float v16, v16, v13

    .line 261
    .line 262
    div-float v11, v11, v16

    .line 263
    .line 264
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    new-instance v13, Lyb5;

    .line 269
    .line 270
    invoke-direct {v13, v3, v11}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_6
    new-instance v13, Lyb5;

    .line 275
    .line 276
    invoke-direct {v13, v3, v3}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_5
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto/16 :goto_4

    .line 283
    .line 284
    :cond_7
    move v1, v10

    .line 285
    :goto_6
    if-ge v1, v8, :cond_11

    .line 286
    .line 287
    new-array v14, v5, [F

    .line 288
    .line 289
    move-object/from16 v16, v6

    .line 290
    .line 291
    move v6, v10

    .line 292
    move v15, v6

    .line 293
    :goto_7
    const/16 v17, 0x3

    .line 294
    .line 295
    if-ge v15, v5, :cond_9

    .line 296
    .line 297
    add-int v18, v1, v8

    .line 298
    .line 299
    add-int/lit8 v18, v18, -0x1

    .line 300
    .line 301
    add-int v18, v18, v15

    .line 302
    .line 303
    move/from16 v19, v5

    .line 304
    .line 305
    rem-int v5, v18, v8

    .line 306
    .line 307
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    check-cast v5, Lyb5;

    .line 312
    .line 313
    move/from16 v18, v10

    .line 314
    .line 315
    iget-object v10, v5, Lyb5;->w:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v10, Ljava/lang/Number;

    .line 318
    .line 319
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    iget-object v5, v5, Lyb5;->x:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v5, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v20

    .line 335
    move/from16 p1, v12

    .line 336
    .line 337
    move-object/from16 v12, v20

    .line 338
    .line 339
    check-cast v12, Lm96;

    .line 340
    .line 341
    iget v12, v12, Lm96;->h:F

    .line 342
    .line 343
    mul-float/2addr v12, v10

    .line 344
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    check-cast v10, Lm96;

    .line 349
    .line 350
    invoke-virtual {v10}, Lm96;->c()F

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v20

    .line 358
    move-object/from16 v13, v20

    .line 359
    .line 360
    check-cast v13, Lm96;

    .line 361
    .line 362
    iget v13, v13, Lm96;->h:F

    .line 363
    .line 364
    invoke-static {v10, v13, v5, v12}, Lb81;->d(FFFF)F

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    add-int/lit8 v10, v6, 0x1

    .line 369
    .line 370
    array-length v12, v14

    .line 371
    if-ge v12, v10, :cond_8

    .line 372
    .line 373
    array-length v12, v14

    .line 374
    mul-int/lit8 v12, v12, 0x3

    .line 375
    .line 376
    div-int/lit8 v12, v12, 0x2

    .line 377
    .line 378
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    move-object v14, v12

    .line 387
    :cond_8
    aput v5, v14, v6

    .line 388
    .line 389
    add-int/lit8 v15, v15, 0x1

    .line 390
    .line 391
    move/from16 v12, p1

    .line 392
    .line 393
    move v6, v10

    .line 394
    move/from16 v10, v18

    .line 395
    .line 396
    move/from16 v5, v19

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_9
    move/from16 v19, v5

    .line 400
    .line 401
    move/from16 v18, v10

    .line 402
    .line 403
    move/from16 p1, v12

    .line 404
    .line 405
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    check-cast v5, Lm96;

    .line 410
    .line 411
    const-string v10, "Index must be between 0 and size"

    .line 412
    .line 413
    if-lez v6, :cond_10

    .line 414
    .line 415
    aget v12, v14, v18

    .line 416
    .line 417
    if-ge v7, v6, :cond_f

    .line 418
    .line 419
    aget v6, v14, v7

    .line 420
    .line 421
    iget-wide v13, v5, Lm96;->e:J

    .line 422
    .line 423
    move v15, v7

    .line 424
    move/from16 v20, v8

    .line 425
    .line 426
    iget-wide v7, v5, Lm96;->d:J

    .line 427
    .line 428
    iget v10, v5, Lm96;->f:F

    .line 429
    .line 430
    move-object/from16 v21, v4

    .line 431
    .line 432
    iget-wide v3, v5, Lm96;->b:J

    .line 433
    .line 434
    move/from16 v24, v15

    .line 435
    .line 436
    invoke-static {v12, v6}, Ljava/lang/Math;->min(FF)F

    .line 437
    .line 438
    .line 439
    move-result v15

    .line 440
    iget v11, v5, Lm96;->h:F

    .line 441
    .line 442
    const v25, 0x38d1b717    # 1.0E-4f

    .line 443
    .line 444
    .line 445
    cmpg-float v26, v11, v25

    .line 446
    .line 447
    if-ltz v26, :cond_a

    .line 448
    .line 449
    cmpg-float v26, v15, v25

    .line 450
    .line 451
    if-ltz v26, :cond_a

    .line 452
    .line 453
    cmpg-float v25, v10, v25

    .line 454
    .line 455
    if-gez v25, :cond_b

    .line 456
    .line 457
    :cond_a
    move/from16 v25, v1

    .line 458
    .line 459
    move-object/from16 v34, v2

    .line 460
    .line 461
    goto/16 :goto_c

    .line 462
    .line 463
    :cond_b
    invoke-static {v15, v11}, Ljava/lang/Math;->min(FF)F

    .line 464
    .line 465
    .line 466
    move-result v15

    .line 467
    invoke-virtual {v5, v12}, Lm96;->a(F)F

    .line 468
    .line 469
    .line 470
    move-result v27

    .line 471
    invoke-virtual {v5, v6}, Lm96;->a(F)F

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    mul-float/2addr v10, v15

    .line 476
    div-float v38, v10, v11

    .line 477
    .line 478
    sget v10, Lj18;->b:F

    .line 479
    .line 480
    mul-float v10, v38, v38

    .line 481
    .line 482
    mul-float v11, v15, v15

    .line 483
    .line 484
    add-float/2addr v11, v10

    .line 485
    float-to-double v10, v11

    .line 486
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 487
    .line 488
    .line 489
    move-result-wide v10

    .line 490
    double-to-float v10, v10

    .line 491
    invoke-static {v7, v8, v13, v14}, Ljb5;->D(JJ)J

    .line 492
    .line 493
    .line 494
    move-result-wide v11

    .line 495
    move/from16 v25, v1

    .line 496
    .line 497
    const/high16 v1, 0x40000000    # 2.0f

    .line 498
    .line 499
    invoke-static {v1, v11, v12}, Ljb5;->g(FJ)J

    .line 500
    .line 501
    .line 502
    move-result-wide v11

    .line 503
    invoke-static {v11, v12}, Ljb5;->m(J)J

    .line 504
    .line 505
    .line 506
    move-result-wide v11

    .line 507
    invoke-static {v10, v11, v12}, Ljb5;->H(FJ)J

    .line 508
    .line 509
    .line 510
    move-result-wide v10

    .line 511
    invoke-static {v3, v4, v10, v11}, Ljb5;->D(JJ)J

    .line 512
    .line 513
    .line 514
    move-result-wide v10

    .line 515
    iput-wide v10, v5, Lm96;->i:J

    .line 516
    .line 517
    invoke-static {v15, v7, v8}, Ljb5;->H(FJ)J

    .line 518
    .line 519
    .line 520
    move-result-wide v7

    .line 521
    invoke-static {v3, v4, v7, v8}, Ljb5;->D(JJ)J

    .line 522
    .line 523
    .line 524
    move-result-wide v32

    .line 525
    invoke-static {v15, v13, v14}, Ljb5;->H(FJ)J

    .line 526
    .line 527
    .line 528
    move-result-wide v7

    .line 529
    invoke-static {v3, v4, v7, v8}, Ljb5;->D(JJ)J

    .line 530
    .line 531
    .line 532
    move-result-wide v34

    .line 533
    iget-wide v3, v5, Lm96;->b:J

    .line 534
    .line 535
    iget-wide v7, v5, Lm96;->a:J

    .line 536
    .line 537
    iget-wide v10, v5, Lm96;->i:J

    .line 538
    .line 539
    move-wide/from16 v28, v3

    .line 540
    .line 541
    move-wide/from16 v30, v7

    .line 542
    .line 543
    move-wide/from16 v36, v10

    .line 544
    .line 545
    move/from16 v26, v15

    .line 546
    .line 547
    invoke-static/range {v26 .. v38}, Lm96;->b(FFJJJJJF)Lqc1;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    iget-wide v3, v5, Lm96;->b:J

    .line 552
    .line 553
    iget-wide v7, v5, Lm96;->c:J

    .line 554
    .line 555
    iget-wide v10, v5, Lm96;->i:J

    .line 556
    .line 557
    move-wide/from16 v27, v34

    .line 558
    .line 559
    move-wide/from16 v34, v32

    .line 560
    .line 561
    move-wide/from16 v32, v27

    .line 562
    .line 563
    move-wide/from16 v28, v3

    .line 564
    .line 565
    move/from16 v27, v6

    .line 566
    .line 567
    move-wide/from16 v30, v7

    .line 568
    .line 569
    move-wide/from16 v36, v10

    .line 570
    .line 571
    invoke-static/range {v26 .. v38}, Lm96;->b(FFJJJJJF)Lqc1;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    invoke-virtual {v3}, Lqc1;->a()F

    .line 576
    .line 577
    .line 578
    move-result v26

    .line 579
    invoke-virtual {v3}, Lqc1;->b()F

    .line 580
    .line 581
    .line 582
    move-result v27

    .line 583
    iget-object v3, v3, Lqc1;->a:[F

    .line 584
    .line 585
    const/4 v4, 0x4

    .line 586
    aget v28, v3, v4

    .line 587
    .line 588
    const/4 v4, 0x5

    .line 589
    aget v29, v3, v4

    .line 590
    .line 591
    aget v30, v3, v19

    .line 592
    .line 593
    aget v31, v3, v17

    .line 594
    .line 595
    aget v32, v3, v18

    .line 596
    .line 597
    aget v33, v3, v24

    .line 598
    .line 599
    invoke-static/range {v26 .. v33}, Lh03;->b(FFFFFFFF)Lqc1;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    iget-wide v6, v5, Lm96;->i:J

    .line 604
    .line 605
    invoke-static {v6, v7}, Ljb5;->r(J)F

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    iget-wide v5, v5, Lm96;->i:J

    .line 610
    .line 611
    invoke-static {v5, v6}, Ljb5;->s(J)F

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    invoke-virtual {v1}, Lqc1;->a()F

    .line 616
    .line 617
    .line 618
    move-result v6

    .line 619
    invoke-virtual {v1}, Lqc1;->b()F

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    iget-object v8, v3, Lqc1;->a:[F

    .line 624
    .line 625
    aget v10, v8, v18

    .line 626
    .line 627
    aget v8, v8, v24

    .line 628
    .line 629
    sub-float v11, v6, v4

    .line 630
    .line 631
    sub-float v12, v7, v5

    .line 632
    .line 633
    invoke-static {v11, v12}, Lj18;->b(FF)J

    .line 634
    .line 635
    .line 636
    move-result-wide v13

    .line 637
    sub-float v4, v10, v4

    .line 638
    .line 639
    sub-float v5, v8, v5

    .line 640
    .line 641
    move v15, v11

    .line 642
    move/from16 v17, v12

    .line 643
    .line 644
    invoke-static {v4, v5}, Lj18;->b(FF)J

    .line 645
    .line 646
    .line 647
    move-result-wide v11

    .line 648
    move-object/from16 v34, v2

    .line 649
    .line 650
    invoke-static {v13, v14}, Ljb5;->s(J)F

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    neg-float v2, v2

    .line 655
    move/from16 v26, v4

    .line 656
    .line 657
    invoke-static {v13, v14}, Ljb5;->r(J)F

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    invoke-static {v2, v4}, Lmh2;->a(FF)J

    .line 662
    .line 663
    .line 664
    move-result-wide v27

    .line 665
    invoke-static {v11, v12}, Ljb5;->s(J)F

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    neg-float v2, v2

    .line 670
    invoke-static {v11, v12}, Ljb5;->r(J)F

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    invoke-static {v2, v4}, Lmh2;->a(FF)J

    .line 675
    .line 676
    .line 677
    move-result-wide v29

    .line 678
    invoke-static/range {v27 .. v28}, Ljb5;->r(J)F

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    mul-float v2, v2, v26

    .line 683
    .line 684
    invoke-static/range {v27 .. v28}, Ljb5;->s(J)F

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    mul-float/2addr v4, v5

    .line 689
    add-float/2addr v4, v2

    .line 690
    cmpl-float v2, v4, p1

    .line 691
    .line 692
    if-ltz v2, :cond_c

    .line 693
    .line 694
    move/from16 v2, v24

    .line 695
    .line 696
    goto :goto_8

    .line 697
    :cond_c
    move/from16 v2, v18

    .line 698
    .line 699
    :goto_8
    invoke-static {v13, v14, v11, v12}, Ljb5;->h(JJ)F

    .line 700
    .line 701
    .line 702
    move-result v4

    .line 703
    const v5, 0x3f7fbe77    # 0.999f

    .line 704
    .line 705
    .line 706
    cmpl-float v5, v4, v5

    .line 707
    .line 708
    if-lez v5, :cond_d

    .line 709
    .line 710
    const v5, 0x3eaaaaab

    .line 711
    .line 712
    .line 713
    invoke-static {v6, v10, v5}, Lj18;->c(FFF)F

    .line 714
    .line 715
    .line 716
    move-result v28

    .line 717
    invoke-static {v7, v8, v5}, Lj18;->c(FFF)F

    .line 718
    .line 719
    .line 720
    move-result v29

    .line 721
    const v2, 0x3f2aaaab

    .line 722
    .line 723
    .line 724
    invoke-static {v6, v10, v2}, Lj18;->c(FFF)F

    .line 725
    .line 726
    .line 727
    move-result v30

    .line 728
    invoke-static {v7, v8, v2}, Lj18;->c(FFF)F

    .line 729
    .line 730
    .line 731
    move-result v31

    .line 732
    move/from16 v26, v6

    .line 733
    .line 734
    move/from16 v27, v7

    .line 735
    .line 736
    move/from16 v33, v8

    .line 737
    .line 738
    move/from16 v32, v10

    .line 739
    .line 740
    invoke-static/range {v26 .. v33}, Lh03;->b(FFFFFFFF)Lqc1;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    goto :goto_a

    .line 745
    :cond_d
    move/from16 v26, v6

    .line 746
    .line 747
    move/from16 v33, v8

    .line 748
    .line 749
    move/from16 v32, v10

    .line 750
    .line 751
    move-wide/from16 v5, v27

    .line 752
    .line 753
    move/from16 v27, v7

    .line 754
    .line 755
    mul-float v11, v15, v15

    .line 756
    .line 757
    mul-float v12, v17, v17

    .line 758
    .line 759
    add-float/2addr v12, v11

    .line 760
    float-to-double v7, v12

    .line 761
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 762
    .line 763
    .line 764
    move-result-wide v7

    .line 765
    double-to-float v7, v7

    .line 766
    const/high16 v8, 0x40800000    # 4.0f

    .line 767
    .line 768
    mul-float/2addr v7, v8

    .line 769
    const/high16 v8, 0x40400000    # 3.0f

    .line 770
    .line 771
    div-float/2addr v7, v8

    .line 772
    sub-float v8, v22, v4

    .line 773
    .line 774
    const/high16 v23, 0x40000000    # 2.0f

    .line 775
    .line 776
    mul-float v10, v23, v8

    .line 777
    .line 778
    float-to-double v10, v10

    .line 779
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 780
    .line 781
    .line 782
    move-result-wide v10

    .line 783
    double-to-float v10, v10

    .line 784
    mul-float/2addr v4, v4

    .line 785
    sub-float v4, v22, v4

    .line 786
    .line 787
    float-to-double v11, v4

    .line 788
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 789
    .line 790
    .line 791
    move-result-wide v11

    .line 792
    double-to-float v4, v11

    .line 793
    sub-float/2addr v10, v4

    .line 794
    mul-float/2addr v10, v7

    .line 795
    div-float/2addr v10, v8

    .line 796
    if-eqz v2, :cond_e

    .line 797
    .line 798
    move/from16 v2, v22

    .line 799
    .line 800
    goto :goto_9

    .line 801
    :cond_e
    const/high16 v2, -0x40800000    # -1.0f

    .line 802
    .line 803
    :goto_9
    mul-float/2addr v10, v2

    .line 804
    invoke-static {v5, v6}, Ljb5;->r(J)F

    .line 805
    .line 806
    .line 807
    move-result v2

    .line 808
    mul-float/2addr v2, v10

    .line 809
    add-float v28, v2, v26

    .line 810
    .line 811
    invoke-static {v5, v6}, Ljb5;->s(J)F

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    mul-float/2addr v2, v10

    .line 816
    add-float v2, v2, v27

    .line 817
    .line 818
    invoke-static/range {v29 .. v30}, Ljb5;->r(J)F

    .line 819
    .line 820
    .line 821
    move-result v4

    .line 822
    mul-float/2addr v4, v10

    .line 823
    sub-float v4, v32, v4

    .line 824
    .line 825
    invoke-static/range {v29 .. v30}, Ljb5;->s(J)F

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    mul-float/2addr v5, v10

    .line 830
    sub-float v31, v33, v5

    .line 831
    .line 832
    move/from16 v29, v2

    .line 833
    .line 834
    move/from16 v30, v4

    .line 835
    .line 836
    invoke-static/range {v26 .. v33}, Lh03;->b(FFFFFFFF)Lqc1;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    :goto_a
    filled-new-array {v1, v2, v3}, [Lqc1;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    :goto_b
    move-object/from16 v2, v21

    .line 849
    .line 850
    goto :goto_d

    .line 851
    :goto_c
    iput-wide v3, v5, Lm96;->i:J

    .line 852
    .line 853
    invoke-static {v3, v4}, Ljb5;->r(J)F

    .line 854
    .line 855
    .line 856
    move-result v1

    .line 857
    invoke-static {v3, v4}, Ljb5;->s(J)F

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    invoke-static {v3, v4}, Ljb5;->r(J)F

    .line 862
    .line 863
    .line 864
    move-result v5

    .line 865
    invoke-static {v3, v4}, Ljb5;->s(J)F

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    const v4, 0x3eaaaaab

    .line 870
    .line 871
    .line 872
    invoke-static {v1, v5, v4}, Lj18;->c(FFF)F

    .line 873
    .line 874
    .line 875
    move-result v28

    .line 876
    invoke-static {v2, v3, v4}, Lj18;->c(FFF)F

    .line 877
    .line 878
    .line 879
    move-result v29

    .line 880
    const v4, 0x3f2aaaab

    .line 881
    .line 882
    .line 883
    invoke-static {v1, v5, v4}, Lj18;->c(FFF)F

    .line 884
    .line 885
    .line 886
    move-result v30

    .line 887
    invoke-static {v2, v3, v4}, Lj18;->c(FFF)F

    .line 888
    .line 889
    .line 890
    move-result v31

    .line 891
    move/from16 v26, v1

    .line 892
    .line 893
    move/from16 v27, v2

    .line 894
    .line 895
    move/from16 v33, v3

    .line 896
    .line 897
    move/from16 v32, v5

    .line 898
    .line 899
    invoke-static/range {v26 .. v33}, Lh03;->b(FFFFFFFF)Lqc1;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    goto :goto_b

    .line 908
    :goto_d
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    add-int/lit8 v1, v25, 0x1

    .line 912
    .line 913
    move/from16 v12, p1

    .line 914
    .line 915
    move-object v4, v2

    .line 916
    move-object/from16 v6, v16

    .line 917
    .line 918
    move/from16 v10, v18

    .line 919
    .line 920
    move/from16 v5, v19

    .line 921
    .line 922
    move/from16 v8, v20

    .line 923
    .line 924
    move/from16 v7, v24

    .line 925
    .line 926
    move-object/from16 v2, v34

    .line 927
    .line 928
    goto/16 :goto_6

    .line 929
    .line 930
    :cond_f
    invoke-static {v10}, Lh;->l(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    return-object v16

    .line 934
    :cond_10
    invoke-static {v10}, Lh;->l(Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    return-object v16

    .line 938
    :cond_11
    move-object v2, v4

    .line 939
    move/from16 v19, v5

    .line 940
    .line 941
    move/from16 v24, v7

    .line 942
    .line 943
    move/from16 v20, v8

    .line 944
    .line 945
    move/from16 v18, v10

    .line 946
    .line 947
    move/from16 p1, v12

    .line 948
    .line 949
    new-instance v1, Ljava/util/ArrayList;

    .line 950
    .line 951
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 952
    .line 953
    .line 954
    move/from16 v3, v18

    .line 955
    .line 956
    :goto_e
    if-ge v3, v8, :cond_13

    .line 957
    .line 958
    add-int v4, v3, v8

    .line 959
    .line 960
    add-int/lit8 v4, v4, -0x1

    .line 961
    .line 962
    rem-int/2addr v4, v8

    .line 963
    add-int/lit8 v5, v3, 0x1

    .line 964
    .line 965
    rem-int v6, v5, v8

    .line 966
    .line 967
    mul-int/lit8 v7, v3, 0x2

    .line 968
    .line 969
    aget v10, v0, v7

    .line 970
    .line 971
    add-int/lit8 v7, v7, 0x1

    .line 972
    .line 973
    aget v7, v0, v7

    .line 974
    .line 975
    invoke-static {v10, v7}, Lmh2;->a(FF)J

    .line 976
    .line 977
    .line 978
    move-result-wide v13

    .line 979
    mul-int/lit8 v4, v4, 0x2

    .line 980
    .line 981
    aget v7, v0, v4

    .line 982
    .line 983
    add-int/lit8 v4, v4, 0x1

    .line 984
    .line 985
    aget v4, v0, v4

    .line 986
    .line 987
    invoke-static {v7, v4}, Lmh2;->a(FF)J

    .line 988
    .line 989
    .line 990
    move-result-wide v10

    .line 991
    mul-int/lit8 v4, v6, 0x2

    .line 992
    .line 993
    aget v7, v0, v4

    .line 994
    .line 995
    add-int/lit8 v4, v4, 0x1

    .line 996
    .line 997
    aget v4, v0, v4

    .line 998
    .line 999
    move/from16 v20, v5

    .line 1000
    .line 1001
    invoke-static {v7, v4}, Lmh2;->a(FF)J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v4

    .line 1005
    invoke-static {v13, v14, v10, v11}, Ljb5;->A(JJ)J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v10

    .line 1009
    invoke-static {v4, v5, v13, v14}, Ljb5;->A(JJ)J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v4

    .line 1013
    invoke-static {v10, v11}, Ljb5;->r(J)F

    .line 1014
    .line 1015
    .line 1016
    move-result v7

    .line 1017
    invoke-static {v4, v5}, Ljb5;->s(J)F

    .line 1018
    .line 1019
    .line 1020
    move-result v12

    .line 1021
    mul-float/2addr v12, v7

    .line 1022
    invoke-static {v10, v11}, Ljb5;->s(J)F

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    invoke-static {v4, v5}, Ljb5;->r(J)F

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    mul-float/2addr v4, v7

    .line 1031
    sub-float/2addr v12, v4

    .line 1032
    cmpl-float v4, v12, p1

    .line 1033
    .line 1034
    if-lez v4, :cond_12

    .line 1035
    .line 1036
    move/from16 v17, v24

    .line 1037
    .line 1038
    goto :goto_f

    .line 1039
    :cond_12
    move/from16 v17, v18

    .line 1040
    .line 1041
    :goto_f
    new-instance v11, Lac2;

    .line 1042
    .line 1043
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    move-object v12, v4

    .line 1048
    check-cast v12, Ljava/util/List;

    .line 1049
    .line 1050
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v4

    .line 1054
    check-cast v4, Lm96;

    .line 1055
    .line 1056
    iget-wide v4, v4, Lm96;->i:J

    .line 1057
    .line 1058
    move-wide v15, v4

    .line 1059
    invoke-direct/range {v11 .. v17}, Lac2;-><init>(Ljava/util/List;JJZ)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    new-instance v4, Lbc2;

    .line 1066
    .line 1067
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    check-cast v5, Ljava/util/List;

    .line 1072
    .line 1073
    invoke-static {v5}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    check-cast v5, Lqc1;

    .line 1078
    .line 1079
    invoke-virtual {v5}, Lqc1;->a()F

    .line 1080
    .line 1081
    .line 1082
    move-result v10

    .line 1083
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    check-cast v3, Ljava/util/List;

    .line 1088
    .line 1089
    invoke-static {v3}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    check-cast v3, Lqc1;

    .line 1094
    .line 1095
    invoke-virtual {v3}, Lqc1;->b()F

    .line 1096
    .line 1097
    .line 1098
    move-result v11

    .line 1099
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v3

    .line 1103
    check-cast v3, Ljava/util/List;

    .line 1104
    .line 1105
    invoke-static {v3}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v3

    .line 1109
    check-cast v3, Lqc1;

    .line 1110
    .line 1111
    iget-object v3, v3, Lqc1;->a:[F

    .line 1112
    .line 1113
    aget v3, v3, v18

    .line 1114
    .line 1115
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v5

    .line 1119
    check-cast v5, Ljava/util/List;

    .line 1120
    .line 1121
    invoke-static {v5}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v5

    .line 1125
    check-cast v5, Lqc1;

    .line 1126
    .line 1127
    iget-object v5, v5, Lqc1;->a:[F

    .line 1128
    .line 1129
    aget v5, v5, v24

    .line 1130
    .line 1131
    const v6, 0x3eaaaaab

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v10, v3, v6}, Lj18;->c(FFF)F

    .line 1135
    .line 1136
    .line 1137
    move-result v12

    .line 1138
    invoke-static {v11, v5, v6}, Lj18;->c(FFF)F

    .line 1139
    .line 1140
    .line 1141
    move-result v13

    .line 1142
    const v7, 0x3f2aaaab

    .line 1143
    .line 1144
    .line 1145
    invoke-static {v10, v3, v7}, Lj18;->c(FFF)F

    .line 1146
    .line 1147
    .line 1148
    move-result v14

    .line 1149
    invoke-static {v11, v5, v7}, Lj18;->c(FFF)F

    .line 1150
    .line 1151
    .line 1152
    move-result v15

    .line 1153
    move/from16 v16, v3

    .line 1154
    .line 1155
    move/from16 v17, v5

    .line 1156
    .line 1157
    invoke-static/range {v10 .. v17}, Lh03;->b(FFFFFFFF)Lqc1;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    invoke-static {v3}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    invoke-direct {v4, v3}, Ldc2;-><init>(Ljava/util/List;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move/from16 v3, v20

    .line 1172
    .line 1173
    goto/16 :goto_e

    .line 1174
    .line 1175
    :cond_13
    const/4 v2, 0x1

    .line 1176
    cmpg-float v3, p3, v2

    .line 1177
    .line 1178
    if-nez v3, :cond_14

    .line 1179
    .line 1180
    goto :goto_10

    .line 1181
    :cond_14
    cmpg-float v2, p4, v2

    .line 1182
    .line 1183
    if-nez v2, :cond_16

    .line 1184
    .line 1185
    :goto_10
    move/from16 v2, p1

    .line 1186
    .line 1187
    move v12, v2

    .line 1188
    move/from16 v10, v18

    .line 1189
    .line 1190
    :goto_11
    array-length v3, v0

    .line 1191
    if-ge v10, v3, :cond_15

    .line 1192
    .line 1193
    add-int/lit8 v3, v10, 0x1

    .line 1194
    .line 1195
    aget v4, v0, v10

    .line 1196
    .line 1197
    add-float/2addr v12, v4

    .line 1198
    add-int/lit8 v10, v10, 0x2

    .line 1199
    .line 1200
    aget v3, v0, v3

    .line 1201
    .line 1202
    add-float/2addr v2, v3

    .line 1203
    goto :goto_11

    .line 1204
    :cond_15
    array-length v3, v0

    .line 1205
    int-to-float v3, v3

    .line 1206
    div-float/2addr v12, v3

    .line 1207
    const/high16 v23, 0x40000000    # 2.0f

    .line 1208
    .line 1209
    div-float v12, v12, v23

    .line 1210
    .line 1211
    array-length v0, v0

    .line 1212
    int-to-float v0, v0

    .line 1213
    div-float/2addr v2, v0

    .line 1214
    div-float v2, v2, v23

    .line 1215
    .line 1216
    invoke-static {v12, v2}, Lmh2;->a(FF)J

    .line 1217
    .line 1218
    .line 1219
    move-result-wide v2

    .line 1220
    goto :goto_12

    .line 1221
    :cond_16
    invoke-static/range {p3 .. p4}, Lmh2;->a(FF)J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v2

    .line 1225
    :goto_12
    const/16 v0, 0x20

    .line 1226
    .line 1227
    shr-long v4, v2, v0

    .line 1228
    .line 1229
    long-to-int v0, v4

    .line 1230
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1231
    .line 1232
    .line 1233
    move-result v0

    .line 1234
    const-wide v4, 0xffffffffL

    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    and-long/2addr v2, v4

    .line 1240
    long-to-int v2, v2

    .line 1241
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1242
    .line 1243
    .line 1244
    move-result v2

    .line 1245
    new-instance v3, Ls96;

    .line 1246
    .line 1247
    invoke-direct {v3, v1, v0, v2}, Ls96;-><init>(Ljava/util/AbstractList;FF)V

    .line 1248
    .line 1249
    .line 1250
    return-object v3

    .line 1251
    :cond_17
    move-object/from16 v16, v6

    .line 1252
    .line 1253
    const-string v0, "The vertices array should have even size"

    .line 1254
    .line 1255
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    return-object v16

    .line 1259
    :cond_18
    move-object/from16 v16, v6

    .line 1260
    .line 1261
    const-string v0, "Polygons must have at least 3 vertices"

    .line 1262
    .line 1263
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    return-object v16
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
.end method

.method public static final c(Ljava/lang/Long;JLi53;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-ltz v0, :cond_2

    .line 15
    .line 16
    sget-object v0, Li53;->g:Li53;

    .line 17
    .line 18
    invoke-virtual {p3, v0}, Li53;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    cmp-long p3, v0, p1

    .line 30
    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    new-instance p0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string p3, "Content-Length mismatch: expected "

    .line 41
    .line 42
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p3, " bytes, but received "

    .line 49
    .line 50
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, " bytes"

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    :goto_0
    return-void
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
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
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

.method public static final i(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public static j([Ldm2;I)Ldm2;
    .locals 10

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x190

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x2bc

    .line 9
    .line 10
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move p1, v1

    .line 19
    :goto_1
    array-length v3, p0

    .line 20
    const/4 v4, 0x0

    .line 21
    const v5, 0x7fffffff

    .line 22
    .line 23
    .line 24
    move v6, v1

    .line 25
    :goto_2
    if-ge v6, v3, :cond_5

    .line 26
    .line 27
    aget-object v7, p0, v6

    .line 28
    .line 29
    iget v8, v7, Ldm2;->c:I

    .line 30
    .line 31
    sub-int/2addr v8, v0

    .line 32
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    mul-int/lit8 v8, v8, 0x2

    .line 37
    .line 38
    iget-boolean v9, v7, Ldm2;->d:Z

    .line 39
    .line 40
    if-ne v9, p1, :cond_2

    .line 41
    .line 42
    move v9, v1

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    move v9, v2

    .line 45
    :goto_3
    add-int/2addr v8, v9

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    if-le v5, v8, :cond_4

    .line 49
    .line 50
    :cond_3
    move-object v4, v7

    .line 51
    move v5, v8

    .line 52
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    return-object v4
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
.end method

.method public static final k(Lj77;)Lh47;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lm77;

    .line 5
    .line 6
    iget-object p0, p0, Lm77;->i:Lbe1;

    .line 7
    .line 8
    iget-object p0, p0, Lbe1;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    const-string v0, "storage"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of v0, p0, Lh47;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :cond_0
    check-cast p0, Lh47;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Lb26;->a:Lc26;

    .line 28
    .line 29
    const-class v0, Lh47;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Lgq3;->A()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Lgq3;->A()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, " within your SupabaseClientBuilder"

    .line 48
    .line 49
    const-string v3, "Plugin storage not installed or not of type "

    .line 50
    .line 51
    const-string v4, ". Consider installing "

    .line 52
    .line 53
    invoke-static {v3, v2, v4, p0, v0}, Lkj6;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static m(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lxb7;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lxb7;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p2, p1}, Lxb7;->a(Ljava/lang/Exception;)V

    .line 27
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
.end method

.method public static n(J)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "PointerId(value="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    invoke-static {p0, p1, v0, v1}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static final o(Lsr2;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "ReflectionGuard"

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :cond_0
    return p0

    .line 19
    :catch_0
    const-string p0, "NoSuchField: "

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_1
    const-string p0, "NoSuchMethod: "

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_2
    const-string p0, "ClassNotFound: "

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
.end method

.method public static p([B)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p0

    .line 9
    if-ge v1, v2, :cond_4

    .line 10
    .line 11
    aget-byte v2, p0, v1

    .line 12
    .line 13
    const/16 v3, 0x22

    .line 14
    .line 15
    if-eq v2, v3, :cond_3

    .line 16
    .line 17
    const/16 v3, 0x27

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x5c

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    if-lt v2, v4, :cond_0

    .line 31
    .line 32
    const/16 v4, 0x7e

    .line 33
    .line 34
    if-gt v2, v4, :cond_0

    .line 35
    .line 36
    int-to-char v2, v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    ushr-int/lit8 v3, v2, 0x6

    .line 45
    .line 46
    and-int/lit8 v3, v3, 0x3

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    int-to-char v3, v3

    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    ushr-int/lit8 v3, v2, 0x3

    .line 55
    .line 56
    and-int/lit8 v3, v3, 0x7

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x30

    .line 59
    .line 60
    int-to-char v3, v3

    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    and-int/lit8 v2, v2, 0x7

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x30

    .line 67
    .line 68
    int-to-char v2, v2

    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_0
    const-string v2, "\\r"

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_1
    const-string v2, "\\f"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_2
    const-string v2, "\\v"

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_3
    const-string v2, "\\n"

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_4
    const-string v2, "\\t"

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_5
    const-string v2, "\\b"

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_6
    const-string v2, "\\a"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    const-string v2, "\\\\"

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    const-string v2, "\\\'"

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    const-string v2, "\\\""

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x7
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

.method public static q(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, p1, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    return v0
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


# virtual methods
.method public abstract d(Landroid/content/Context;Lsl2;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract e(Landroid/content/Context;[Ldm2;I)Landroid/graphics/Typeface;
.end method

.method public f(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "createFromFontInfoWithFallback must only be called on API 29+"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
.end method

.method public g(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p1}, Lb35;->s(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0, p2, p3}, Lb35;->h(Ljava/io/File;Landroid/content/res/Resources;I)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :catch_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object p1
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
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
.end method

.method public abstract l()J
.end method
