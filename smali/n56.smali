.class public final Ln56;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltp1;
.implements Lqy0;


# instance fields
.field public A:Lz57;

.field public B:Lz57;

.field public C:Lyo4;

.field public D:Lyo4;

.field public E:Lyo4;

.field public F:J

.field public G:I

.field public H:Lhl;

.field public I:Lhl;

.field public J:Lkg5;

.field public w:F

.field public x:Ly57;

.field public y:Lz57;

.field public z:Lz57;


# virtual methods
.method public final Y()F
    .locals 0

    .line 1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return p0
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

.method public final a(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ln56;->H:Lhl;

    .line 2
    .line 3
    iget-object v1, p0, Ln56;->I:Lhl;

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Ln56;->f(BLhl;Lhl;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ln56;->H:Lhl;

    .line 11
    .line 12
    iget-object v1, p0, Ln56;->I:Lhl;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x33

    .line 16
    .line 17
    sget-object v4, Lcu7;->a:Lcu7;

    .line 18
    .line 19
    if-ne v0, v4, :cond_2

    .line 20
    .line 21
    iget v0, p0, Ln56;->G:I

    .line 22
    .line 23
    and-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Ln56;->C:Lyo4;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lme3;->b(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lhl;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    :cond_0
    sget-object v0, Lo56;->a:Lx17;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v2

    .line 43
    :cond_2
    :goto_0
    if-ne v1, v4, :cond_5

    .line 44
    .line 45
    iget v1, p0, Ln56;->G:I

    .line 46
    .line 47
    and-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    iget-object v1, p0, Ln56;->D:Lyo4;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Lme3;->b(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lhl;

    .line 60
    .line 61
    if-nez v1, :cond_5

    .line 62
    .line 63
    :cond_3
    sget-object v1, Lo56;->a:Lx17;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    move-object v1, v2

    .line 67
    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    .line 68
    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    iget v2, p0, Ln56;->G:I

    .line 72
    .line 73
    or-int/lit8 v2, v2, 0x2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    iget v2, p0, Ln56;->G:I

    .line 77
    .line 78
    and-int/lit8 v2, v2, -0x3

    .line 79
    .line 80
    :goto_2
    iput v2, p0, Ln56;->G:I

    .line 81
    .line 82
    invoke-virtual {p0, v3, v0, v1}, Ln56;->g(ILhl;Lhl;)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Ln56;->y:Lz57;

    .line 86
    .line 87
    if-eqz p0, :cond_7

    .line 88
    .line 89
    invoke-virtual {p0, p1, p2}, Lz57;->b(J)V

    .line 90
    .line 91
    .line 92
    :cond_7
    return-void
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

.method public final b()F
    .locals 0

    .line 1
    iget p0, p0, Ln56;->w:F

    .line 2
    .line 3
    return p0
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

.method public final c()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln56;->x:Ly57;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, v0, Ln56;->x:Ly57;

    .line 10
    .line 11
    iget-object v3, v0, Ln56;->J:Lkg5;

    .line 12
    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    iget-object v8, v3, Lkg5;->x:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v8

    .line 20
    :try_start_0
    iget-object v3, v3, Lkg5;->y:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lyo4;

    .line 23
    .line 24
    iget v3, v3, Lme3;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    :goto_0
    monitor-exit v8

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    monitor-exit v8

    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_1
    iget-wide v8, v0, Ln56;->F:J

    .line 39
    .line 40
    cmp-long v3, v8, v6

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    iget v3, v0, Ln56;->G:I

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    goto/16 :goto_f

    .line 49
    .line 50
    :cond_2
    iget-object v3, v0, Ln56;->y:Lz57;

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    goto/16 :goto_f

    .line 55
    .line 56
    :cond_3
    iget-object v8, v0, Ln56;->z:Lz57;

    .line 57
    .line 58
    if-nez v8, :cond_4

    .line 59
    .line 60
    goto/16 :goto_f

    .line 61
    .line 62
    :cond_4
    iget-wide v9, v0, Ln56;->F:J

    .line 63
    .line 64
    iget v11, v0, Ln56;->G:I

    .line 65
    .line 66
    invoke-static {v9, v10, v11}, La67;->h(JI)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    iget-wide v10, v0, Ln56;->F:J

    .line 71
    .line 72
    iget v12, v0, Ln56;->G:I

    .line 73
    .line 74
    invoke-static {v10, v11, v12}, La67;->i(JI)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    invoke-virtual {v8, v9, v3}, Lz57;->h(ILz57;)I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    invoke-virtual {v8, v3, v10, v11}, Lz57;->i(Lz57;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v13

    .line 86
    cmp-long v3, v13, v6

    .line 87
    .line 88
    if-nez v3, :cond_5

    .line 89
    .line 90
    if-nez v12, :cond_5

    .line 91
    .line 92
    goto/16 :goto_f

    .line 93
    .line 94
    :cond_5
    iget-object v3, v0, Ln56;->J:Lkg5;

    .line 95
    .line 96
    if-nez v3, :cond_6

    .line 97
    .line 98
    new-instance v3, Lkg5;

    .line 99
    .line 100
    const/16 v15, 0x14

    .line 101
    .line 102
    invoke-direct {v3, v15}, Lkg5;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iput-object v3, v0, Ln56;->J:Lkg5;

    .line 106
    .line 107
    :cond_6
    const-wide v15, -0x3c00000001L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    and-long/2addr v15, v13

    .line 113
    invoke-static {v13, v14, v12}, La67;->h(JI)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    int-to-long v12, v12

    .line 118
    const/16 v14, 0x32

    .line 119
    .line 120
    shl-long/2addr v12, v14

    .line 121
    or-long/2addr v12, v15

    .line 122
    move-wide v15, v6

    .line 123
    int-to-long v6, v9

    .line 124
    shl-long/2addr v6, v14

    .line 125
    or-long/2addr v6, v10

    .line 126
    iget-object v9, v0, Ln56;->C:Lyo4;

    .line 127
    .line 128
    iget-object v10, v0, Ln56;->D:Lyo4;

    .line 129
    .line 130
    iget-object v11, v0, Ln56;->E:Lyo4;

    .line 131
    .line 132
    iget-object v4, v3, Lkg5;->x:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter v4

    .line 135
    move/from16 v17, v14

    .line 136
    .line 137
    :try_start_1
    iget-object v14, v3, Lkg5;->y:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v14, Lyo4;

    .line 140
    .line 141
    move-wide/from16 v18, v15

    .line 142
    .line 143
    iget-object v15, v14, Lme3;->b:[I

    .line 144
    .line 145
    iget-object v2, v14, Lme3;->c:[Ljava/lang/Object;

    .line 146
    .line 147
    iget-object v14, v14, Lme3;->a:[J

    .line 148
    .line 149
    array-length v5, v14

    .line 150
    move-object/from16 v20, v2

    .line 151
    .line 152
    const/4 v2, 0x2

    .line 153
    sub-int/2addr v5, v2

    .line 154
    move-wide/from16 v22, v6

    .line 155
    .line 156
    if-ltz v5, :cond_b

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    :goto_2
    aget-wide v6, v14, v2

    .line 160
    .line 161
    move-wide/from16 v24, v12

    .line 162
    .line 163
    not-long v12, v6

    .line 164
    const/16 v26, 0x7

    .line 165
    .line 166
    shl-long v12, v12, v26

    .line 167
    .line 168
    and-long/2addr v12, v6

    .line 169
    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    and-long v12, v12, v26

    .line 175
    .line 176
    cmp-long v12, v12, v26

    .line 177
    .line 178
    if-eqz v12, :cond_a

    .line 179
    .line 180
    sub-int v12, v2, v5

    .line 181
    .line 182
    not-int v12, v12

    .line 183
    ushr-int/lit8 v12, v12, 0x1f

    .line 184
    .line 185
    const/16 v13, 0x8

    .line 186
    .line 187
    rsub-int/lit8 v12, v12, 0x8

    .line 188
    .line 189
    move/from16 v26, v13

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    :goto_3
    if-ge v13, v12, :cond_9

    .line 193
    .line 194
    const-wide/16 v27, 0xff

    .line 195
    .line 196
    and-long v27, v6, v27

    .line 197
    .line 198
    const-wide/16 v29, 0x80

    .line 199
    .line 200
    cmp-long v27, v27, v29

    .line 201
    .line 202
    if-gez v27, :cond_8

    .line 203
    .line 204
    shl-int/lit8 v27, v2, 0x3

    .line 205
    .line 206
    add-int v27, v27, v13

    .line 207
    .line 208
    aget v28, v15, v27

    .line 209
    .line 210
    aget-object v27, v20, v27

    .line 211
    .line 212
    move-wide/from16 v28, v6

    .line 213
    .line 214
    move-object/from16 v6, v27

    .line 215
    .line 216
    check-cast v6, Lq57;

    .line 217
    .line 218
    iget-object v7, v6, Lq57;->c:Lr57;

    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    move/from16 v27, v13

    .line 225
    .line 226
    const/4 v13, 0x1

    .line 227
    if-eq v7, v13, :cond_7

    .line 228
    .line 229
    const/4 v13, 0x2

    .line 230
    if-eq v7, v13, :cond_7

    .line 231
    .line 232
    const/4 v13, 0x3

    .line 233
    if-eq v7, v13, :cond_7

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_7
    sget-object v7, Lr57;->w:Lr57;

    .line 237
    .line 238
    iput-object v7, v6, Lq57;->c:Lr57;

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_8
    move-wide/from16 v28, v6

    .line 242
    .line 243
    move/from16 v27, v13

    .line 244
    .line 245
    :goto_4
    shr-long v6, v28, v26

    .line 246
    .line 247
    add-int/lit8 v13, v27, 0x1

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_9
    move/from16 v6, v26

    .line 251
    .line 252
    if-ne v12, v6, :cond_c

    .line 253
    .line 254
    :cond_a
    if-eq v2, v5, :cond_c

    .line 255
    .line 256
    add-int/lit8 v2, v2, 0x1

    .line 257
    .line 258
    move-wide/from16 v12, v24

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_b
    move-wide/from16 v24, v12

    .line 262
    .line 263
    :cond_c
    cmp-long v2, v22, v18

    .line 264
    .line 265
    move-wide/from16 v12, v18

    .line 266
    .line 267
    if-eqz v2, :cond_16

    .line 268
    .line 269
    move-wide/from16 v6, v22

    .line 270
    .line 271
    :goto_5
    cmp-long v2, v6, v18

    .line 272
    .line 273
    if-eqz v2, :cond_16

    .line 274
    .line 275
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v9, :cond_d

    .line 280
    .line 281
    invoke-virtual {v9, v2}, Lme3;->b(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    check-cast v5, Lhl;

    .line 286
    .line 287
    if-nez v5, :cond_10

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :catchall_1
    move-exception v0

    .line 291
    goto/16 :goto_10

    .line 292
    .line 293
    :cond_d
    :goto_6
    if-eqz v11, :cond_e

    .line 294
    .line 295
    invoke-virtual {v11, v2}, Lme3;->b(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    check-cast v5, Lhl;

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_e
    const/4 v5, 0x0

    .line 303
    :goto_7
    if-nez v5, :cond_10

    .line 304
    .line 305
    if-eqz v10, :cond_f

    .line 306
    .line 307
    invoke-virtual {v10, v2}, Lme3;->b(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    check-cast v5, Lhl;

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_f
    const/4 v5, 0x0

    .line 315
    :goto_8
    if-nez v5, :cond_10

    .line 316
    .line 317
    sget-object v5, Lo56;->a:Lx17;

    .line 318
    .line 319
    :cond_10
    const-wide/16 v14, 0x1

    .line 320
    .line 321
    shl-long/2addr v14, v2

    .line 322
    and-long v20, v24, v14

    .line 323
    .line 324
    cmp-long v20, v20, v18

    .line 325
    .line 326
    if-eqz v20, :cond_11

    .line 327
    .line 328
    const/16 v20, 0x1

    .line 329
    .line 330
    :goto_9
    move-wide/from16 v21, v6

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_11
    const/16 v20, 0x0

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :goto_a
    iget-object v6, v3, Lkg5;->y:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v6, Lyo4;

    .line 339
    .line 340
    invoke-virtual {v6, v2}, Lme3;->b(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    check-cast v7, Lq57;

    .line 345
    .line 346
    if-eqz v7, :cond_14

    .line 347
    .line 348
    if-nez v20, :cond_13

    .line 349
    .line 350
    iget-object v2, v7, Lq57;->a:Lhl;

    .line 351
    .line 352
    invoke-static {v2, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-nez v2, :cond_12

    .line 357
    .line 358
    goto :goto_b

    .line 359
    :cond_12
    sget-object v2, Lr57;->x:Lr57;

    .line 360
    .line 361
    iput-object v2, v7, Lq57;->c:Lr57;

    .line 362
    .line 363
    goto :goto_d

    .line 364
    :cond_13
    :goto_b
    iput-object v5, v7, Lq57;->a:Lhl;

    .line 365
    .line 366
    sget-object v2, Lr57;->y:Lr57;

    .line 367
    .line 368
    iput-object v2, v7, Lq57;->c:Lr57;

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_14
    if-eqz v20, :cond_15

    .line 372
    .line 373
    new-instance v7, Lq57;

    .line 374
    .line 375
    invoke-direct {v7, v3, v5}, Lq57;-><init>(Lkg5;Lhl;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v6, v2, v7}, Lyo4;->i(ILjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_15
    :goto_c
    or-long/2addr v12, v14

    .line 382
    :goto_d
    xor-long v6, v21, v14

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_16
    invoke-virtual {v3, v1}, Lkg5;->J(Ly57;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 386
    .line 387
    .line 388
    monitor-exit v4

    .line 389
    cmp-long v1, v12, v18

    .line 390
    .line 391
    if-eqz v1, :cond_19

    .line 392
    .line 393
    iget-object v1, v0, Ln56;->B:Lz57;

    .line 394
    .line 395
    if-nez v1, :cond_17

    .line 396
    .line 397
    new-instance v1, Lz57;

    .line 398
    .line 399
    invoke-direct {v1}, Lz57;-><init>()V

    .line 400
    .line 401
    .line 402
    iput-object v1, v0, Ln56;->B:Lz57;

    .line 403
    .line 404
    :cond_17
    const-wide v4, 0x7ffffffffffffL

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    and-long/2addr v4, v12

    .line 410
    shr-long v6, v12, v17

    .line 411
    .line 412
    long-to-int v2, v6

    .line 413
    invoke-static {v4, v5, v2}, La67;->i(JI)J

    .line 414
    .line 415
    .line 416
    move-result-wide v6

    .line 417
    invoke-static {v4, v5, v2}, La67;->h(JI)I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v8, v1, v6, v7, v2}, Lz57;->g(Lz57;JI)V

    .line 422
    .line 423
    .line 424
    iget-object v4, v0, Ln56;->A:Lz57;

    .line 425
    .line 426
    if-eqz v4, :cond_18

    .line 427
    .line 428
    invoke-virtual {v4, v1, v6, v7, v2}, Lz57;->g(Lz57;JI)V

    .line 429
    .line 430
    .line 431
    :cond_18
    const/4 v1, 0x0

    .line 432
    iput-object v1, v0, Ln56;->A:Lz57;

    .line 433
    .line 434
    :cond_19
    iget-object v1, v3, Lkg5;->x:Ljava/lang/Object;

    .line 435
    .line 436
    monitor-enter v1

    .line 437
    :try_start_2
    iget-object v2, v3, Lkg5;->y:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v2, Lyo4;

    .line 440
    .line 441
    iget v2, v2, Lme3;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 442
    .line 443
    if-nez v2, :cond_1a

    .line 444
    .line 445
    const/4 v4, 0x1

    .line 446
    goto :goto_e

    .line 447
    :cond_1a
    const/4 v4, 0x0

    .line 448
    :goto_e
    monitor-exit v1

    .line 449
    if-eqz v4, :cond_1b

    .line 450
    .line 451
    const/4 v1, 0x0

    .line 452
    iput-object v1, v0, Ln56;->J:Lkg5;

    .line 453
    .line 454
    :cond_1b
    :goto_f
    return-void

    .line 455
    :catchall_2
    move-exception v0

    .line 456
    monitor-exit v1

    .line 457
    throw v0

    .line 458
    :goto_10
    monitor-exit v4

    .line 459
    throw v0
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final d()I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Ln56;->J:Lkg5;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v0, v0, Lkg5;->y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyo4;

    .line 11
    .line 12
    iget-object v2, v0, Lme3;->b:[I

    .line 13
    .line 14
    iget-object v3, v0, Lme3;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, v0, Lme3;->a:[J

    .line 17
    .line 18
    array-length v4, v0

    .line 19
    add-int/lit8 v4, v4, -0x2

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    if-ltz v4, :cond_5

    .line 24
    .line 25
    move v7, v1

    .line 26
    move v8, v7

    .line 27
    :goto_0
    aget-wide v9, v0, v7

    .line 28
    .line 29
    not-long v11, v9

    .line 30
    const/4 v13, 0x7

    .line 31
    shl-long/2addr v11, v13

    .line 32
    and-long/2addr v11, v9

    .line 33
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v11, v13

    .line 39
    cmp-long v11, v11, v13

    .line 40
    .line 41
    if-eqz v11, :cond_3

    .line 42
    .line 43
    sub-int v11, v7, v4

    .line 44
    .line 45
    not-int v11, v11

    .line 46
    ushr-int/lit8 v11, v11, 0x1f

    .line 47
    .line 48
    const/16 v12, 0x8

    .line 49
    .line 50
    rsub-int/lit8 v11, v11, 0x8

    .line 51
    .line 52
    move v13, v1

    .line 53
    :goto_1
    if-ge v13, v11, :cond_2

    .line 54
    .line 55
    const-wide/16 v14, 0xff

    .line 56
    .line 57
    and-long/2addr v14, v9

    .line 58
    const-wide/16 v16, 0x80

    .line 59
    .line 60
    cmp-long v14, v14, v16

    .line 61
    .line 62
    if-gez v14, :cond_1

    .line 63
    .line 64
    shl-int/lit8 v14, v7, 0x3

    .line 65
    .line 66
    add-int/2addr v14, v13

    .line 67
    aget v15, v2, v14

    .line 68
    .line 69
    aget-object v14, v3, v14

    .line 70
    .line 71
    check-cast v14, Lq57;

    .line 72
    .line 73
    const/16 v14, 0x32

    .line 74
    .line 75
    if-ge v15, v14, :cond_0

    .line 76
    .line 77
    int-to-byte v14, v15

    .line 78
    const-wide/16 v15, 0x1

    .line 79
    .line 80
    shl-long v14, v15, v14

    .line 81
    .line 82
    or-long/2addr v5, v14

    .line 83
    goto :goto_2

    .line 84
    :cond_0
    add-int/lit8 v15, v15, -0x32

    .line 85
    .line 86
    const/4 v14, 0x1

    .line 87
    shl-int/2addr v14, v15

    .line 88
    or-int/2addr v8, v14

    .line 89
    :cond_1
    :goto_2
    shr-long/2addr v9, v12

    .line 90
    add-int/lit8 v13, v13, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    if-ne v11, v12, :cond_6

    .line 94
    .line 95
    :cond_3
    if-eq v7, v4, :cond_4

    .line 96
    .line 97
    add-int/lit8 v7, v7, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move v1, v8

    .line 101
    :cond_5
    move v8, v1

    .line 102
    :cond_6
    invoke-static {v8}, La67;->e(I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v5, v6}, La67;->g(J)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    or-int/2addr v0, v1

    .line 111
    return v0

    .line 112
    :cond_7
    return v1
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

.method public final f(BLhl;Lhl;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    const/16 v3, 0x32

    .line 5
    .line 6
    const-wide/16 v4, 0x1

    .line 7
    .line 8
    sget-object v6, Lcu7;->a:Lcu7;

    .line 9
    .line 10
    if-ne p2, v6, :cond_2

    .line 11
    .line 12
    iget-wide v7, p0, Ln56;->F:J

    .line 13
    .line 14
    if-ge p1, v3, :cond_1

    .line 15
    .line 16
    shl-long v9, v4, p1

    .line 17
    .line 18
    and-long/2addr v7, v9

    .line 19
    cmp-long p2, v7, v1

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Ln56;->C:Lyo4;

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lme3;->b(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Lhl;

    .line 32
    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    :cond_0
    sget-object p2, Lo56;->a:Lx17;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p2, v0

    .line 39
    :cond_2
    :goto_0
    if-ne p3, v6, :cond_5

    .line 40
    .line 41
    iget-wide v6, p0, Ln56;->F:J

    .line 42
    .line 43
    if-ge p1, v3, :cond_4

    .line 44
    .line 45
    shl-long v8, v4, p1

    .line 46
    .line 47
    and-long/2addr v6, v8

    .line 48
    cmp-long p3, v6, v1

    .line 49
    .line 50
    if-eqz p3, :cond_4

    .line 51
    .line 52
    iget-object p3, p0, Ln56;->D:Lyo4;

    .line 53
    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    invoke-virtual {p3, p1}, Lme3;->b(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Lhl;

    .line 61
    .line 62
    if-nez p3, :cond_5

    .line 63
    .line 64
    :cond_3
    sget-object p3, Lo56;->a:Lx17;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    move-object p3, v0

    .line 68
    :cond_5
    :goto_1
    if-eqz p2, :cond_6

    .line 69
    .line 70
    if-eqz p3, :cond_6

    .line 71
    .line 72
    iget-wide v0, p0, Ln56;->F:J

    .line 73
    .line 74
    shl-long v2, v4, p1

    .line 75
    .line 76
    or-long/2addr v0, v2

    .line 77
    goto :goto_2

    .line 78
    :cond_6
    iget-wide v0, p0, Ln56;->F:J

    .line 79
    .line 80
    shl-long v2, v4, p1

    .line 81
    .line 82
    not-long v2, v2

    .line 83
    and-long/2addr v0, v2

    .line 84
    :goto_2
    iput-wide v0, p0, Ln56;->F:J

    .line 85
    .line 86
    invoke-virtual {p0, p1, p2, p3}, Ln56;->g(ILhl;Lhl;)V

    .line 87
    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method public final g(ILhl;Lhl;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lo56;->a:Lx17;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ln56;->C:Lyo4;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lne3;->a:Lyo4;

    .line 16
    .line 17
    new-instance v0, Lyo4;

    .line 18
    .line 19
    invoke-direct {v0}, Lyo4;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ln56;->C:Lyo4;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0, p1, p2}, Lyo4;->i(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object p2, p0, Ln56;->C:Lyo4;

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lyo4;->g(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Lhl;

    .line 37
    .line 38
    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    .line 39
    .line 40
    sget-object p2, Lo56;->a:Lx17;

    .line 41
    .line 42
    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_4

    .line 47
    .line 48
    iget-object p2, p0, Ln56;->D:Lyo4;

    .line 49
    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    sget-object p2, Lne3;->a:Lyo4;

    .line 53
    .line 54
    new-instance p2, Lyo4;

    .line 55
    .line 56
    invoke-direct {p2}, Lyo4;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p2, p0, Ln56;->D:Lyo4;

    .line 60
    .line 61
    :cond_3
    invoke-virtual {p2, p1, p3}, Lyo4;->i(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    iget-object p2, p0, Ln56;->D:Lyo4;

    .line 66
    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Lme3;->b(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, Lhl;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Lyo4;->g(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    if-eqz p3, :cond_6

    .line 79
    .line 80
    iget-object p2, p0, Ln56;->E:Lyo4;

    .line 81
    .line 82
    if-nez p2, :cond_5

    .line 83
    .line 84
    sget-object p2, Lne3;->a:Lyo4;

    .line 85
    .line 86
    new-instance p2, Lyo4;

    .line 87
    .line 88
    invoke-direct {p2}, Lyo4;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p2, p0, Ln56;->E:Lyo4;

    .line 92
    .line 93
    :cond_5
    invoke-virtual {p2, p1, p3}, Lyo4;->i(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    return-void
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
.end method

.method public final g0(Lhu5;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ln56;->x:Ly57;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final h(ILz57;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln56;->y:Lz57;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, La67;->n:Lz57;

    .line 8
    .line 9
    :cond_0
    move-object/from16 v8, p2

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    invoke-virtual {v3, v8}, Lz57;->f(Lz57;)V

    .line 13
    .line 14
    .line 15
    iget-object v4, v0, Ln56;->J:Lkg5;

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_c

    .line 20
    .line 21
    :cond_1
    iget-object v1, v0, Ln56;->B:Lz57;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    iget-object v1, v0, Ln56;->z:Lz57;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto/16 :goto_c

    .line 30
    .line 31
    :cond_2
    move-object v2, v1

    .line 32
    iget-object v1, v4, Lkg5;->x:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    iget-object v5, v4, Lkg5;->y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lyo4;

    .line 38
    .line 39
    iget v5, v5, Lme3;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    if-nez v5, :cond_3

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move v5, v6

    .line 47
    :goto_0
    monitor-exit v1

    .line 48
    if-eqz v5, :cond_4

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    iput-object v1, v0, Ln56;->B:Lz57;

    .line 52
    .line 53
    iput-object v1, v0, Ln56;->J:Lkg5;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    and-int/lit8 v0, p1, 0x1

    .line 57
    .line 58
    const-wide/16 v9, 0x0

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    sget-wide v11, La67;->b:J

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    move-wide v11, v9

    .line 66
    :goto_1
    and-int/lit8 v1, p1, 0x8

    .line 67
    .line 68
    if-eqz v1, :cond_6

    .line 69
    .line 70
    sget-wide v13, La67;->c:J

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    move-wide v13, v9

    .line 74
    :goto_2
    or-long/2addr v11, v13

    .line 75
    and-int/lit8 v5, p1, 0x2

    .line 76
    .line 77
    if-eqz v5, :cond_7

    .line 78
    .line 79
    sget-wide v13, La67;->d:J

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    move-wide v13, v9

    .line 83
    :goto_3
    or-long/2addr v11, v13

    .line 84
    and-int/lit8 v7, p1, 0x4

    .line 85
    .line 86
    if-eqz v7, :cond_8

    .line 87
    .line 88
    sget-wide v13, La67;->e:J

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_8
    move-wide v13, v9

    .line 92
    :goto_4
    or-long/2addr v11, v13

    .line 93
    and-int/lit8 v13, p1, 0x20

    .line 94
    .line 95
    if-eqz v13, :cond_9

    .line 96
    .line 97
    sget-wide v14, La67;->f:J

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_9
    move-wide v14, v9

    .line 101
    :goto_5
    or-long/2addr v11, v14

    .line 102
    and-int/lit8 v14, p1, 0x10

    .line 103
    .line 104
    if-eqz v14, :cond_a

    .line 105
    .line 106
    sget-wide v15, La67;->g:J

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_a
    move-wide v15, v9

    .line 110
    :goto_6
    or-long/2addr v11, v15

    .line 111
    if-eqz v0, :cond_b

    .line 112
    .line 113
    sget v0, La67;->h:I

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_b
    move v0, v6

    .line 117
    :goto_7
    if-eqz v1, :cond_c

    .line 118
    .line 119
    sget v1, La67;->i:I

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_c
    move v1, v6

    .line 123
    :goto_8
    or-int/2addr v0, v1

    .line 124
    if-eqz v5, :cond_d

    .line 125
    .line 126
    sget v1, La67;->j:I

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    move v1, v6

    .line 130
    :goto_9
    or-int/2addr v0, v1

    .line 131
    if-eqz v7, :cond_e

    .line 132
    .line 133
    sget v1, La67;->k:I

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_e
    move v1, v6

    .line 137
    :goto_a
    or-int/2addr v0, v1

    .line 138
    if-eqz v13, :cond_f

    .line 139
    .line 140
    sget v1, La67;->l:I

    .line 141
    .line 142
    goto :goto_b

    .line 143
    :cond_f
    move v1, v6

    .line 144
    :goto_b
    or-int/2addr v0, v1

    .line 145
    if-eqz v14, :cond_10

    .line 146
    .line 147
    sget v6, La67;->m:I

    .line 148
    .line 149
    :cond_10
    or-int/2addr v0, v6

    .line 150
    invoke-virtual {v4}, Lkg5;->y()J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    const-wide v13, 0x7ffffffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    and-long/2addr v13, v5

    .line 160
    const/16 v1, 0x32

    .line 161
    .line 162
    shr-long/2addr v5, v1

    .line 163
    long-to-int v1, v5

    .line 164
    invoke-static {v13, v14, v1}, La67;->i(JI)J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    and-long/2addr v5, v11

    .line 169
    invoke-static {v5, v6, v1}, La67;->h(JI)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    and-int v7, v1, v0

    .line 174
    .line 175
    cmp-long v0, v5, v9

    .line 176
    .line 177
    if-nez v0, :cond_11

    .line 178
    .line 179
    if-nez v7, :cond_11

    .line 180
    .line 181
    :goto_c
    return-void

    .line 182
    :cond_11
    invoke-static/range {v2 .. v8}, La67;->a(Lz57;Lz57;Lkg5;JILz57;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    monitor-exit v1

    .line 188
    throw v0
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method
