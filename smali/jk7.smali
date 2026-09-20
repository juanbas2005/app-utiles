.class public final Ljk7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Llh4;


# instance fields
.field public final a:Lnh2;

.field public final b:Lg80;

.field public final c:F

.field public final d:Lla5;


# direct methods
.method public constructor <init>(Lnh2;Lg80;FLla5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljk7;->a:Lnh2;

    .line 5
    .line 6
    iput-object p2, p0, Ljk7;->b:Lg80;

    .line 7
    .line 8
    iput p3, p0, Ljk7;->c:F

    .line 9
    .line 10
    iput-object p4, p0, Ljk7;->d:Lla5;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public final a(Lkg3;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    move v0, p1

    .line 7
    :goto_0
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgh4;

    .line 14
    .line 15
    invoke-interface {v1, p3}, Lgh4;->v(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v0
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

.method public final b(Loh4;Ljava/util/List;J)Lmh4;
    .locals 20

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    const-string v4, "Collection contains no element matching the predicate."

    .line 14
    .line 15
    if-ge v3, v1, :cond_b

    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lgh4;

    .line 22
    .line 23
    invoke-static {v5}, Lrc9;->P(Lgh4;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v7, "navigationIcon"

    .line 28
    .line 29
    invoke-static {v6, v7}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_a

    .line 34
    .line 35
    const/16 v18, 0x0

    .line 36
    .line 37
    const/16 v19, 0xe

    .line 38
    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    move-wide/from16 v13, p3

    .line 45
    .line 46
    invoke-static/range {v13 .. v19}, Lk31;->a(JIIIII)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    invoke-interface {v5, v6, v7}, Lgh4;->y(J)Leh5;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    move v5, v2

    .line 59
    :goto_1
    if-ge v5, v3, :cond_9

    .line 60
    .line 61
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lgh4;

    .line 66
    .line 67
    invoke-static {v6}, Lrc9;->P(Lgh4;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-string v8, "actionIcons"

    .line 72
    .line 73
    invoke-static {v7, v8}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_8

    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    const/16 v19, 0xe

    .line 82
    .line 83
    const/4 v15, 0x0

    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    const/16 v17, 0x0

    .line 87
    .line 88
    move-wide/from16 v13, p3

    .line 89
    .line 90
    invoke-static/range {v13 .. v19}, Lk31;->a(JIIIII)J

    .line 91
    .line 92
    .line 93
    move-result-wide v7

    .line 94
    invoke-interface {v6, v7, v8}, Lgh4;->y(J)Leh5;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-interface {v12}, Lkg3;->getLayoutDirection()Ley3;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    iget-object v6, v9, Ljk7;->d:Lla5;

    .line 103
    .line 104
    invoke-static {v6, v3}, Lx91;->l(Lla5;Ley3;)F

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-interface {v12}, Lkg3;->getLayoutDirection()Ley3;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v6, v7}, Lx91;->k(Lla5;Ley3;)F

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    sget v8, Lvn;->b:F

    .line 117
    .line 118
    invoke-interface {v12, v8}, Ltp1;->r0(F)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    iget v10, v1, Leh5;->w:I

    .line 123
    .line 124
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    invoke-static/range {p3 .. p4}, Lk31;->h(J)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    const v11, 0x7fffffff

    .line 133
    .line 134
    .line 135
    if-ne v10, v11, :cond_0

    .line 136
    .line 137
    invoke-static/range {p3 .. p4}, Lk31;->h(J)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    :goto_2
    move/from16 v16, v3

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_0
    invoke-static/range {p3 .. p4}, Lk31;->h(J)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    sub-int/2addr v10, v8

    .line 149
    iget v8, v5, Leh5;->w:I

    .line 150
    .line 151
    sub-int/2addr v10, v8

    .line 152
    invoke-interface {v12, v3}, Ltp1;->r0(F)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    sub-int/2addr v10, v3

    .line 157
    invoke-interface {v12, v7}, Ltp1;->r0(F)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    sub-int/2addr v10, v3

    .line 162
    if-gez v10, :cond_1

    .line 163
    .line 164
    move v3, v2

    .line 165
    goto :goto_2

    .line 166
    :cond_1
    move v3, v10

    .line 167
    goto :goto_2

    .line 168
    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    move v7, v2

    .line 173
    :goto_4
    if-ge v7, v3, :cond_7

    .line 174
    .line 175
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    check-cast v8, Lgh4;

    .line 180
    .line 181
    invoke-static {v8}, Lrc9;->P(Lgh4;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    const-string v13, "title"

    .line 186
    .line 187
    invoke-static {v10, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_6

    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    const/16 v19, 0xc

    .line 196
    .line 197
    const/4 v15, 0x0

    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    move-wide/from16 v13, p3

    .line 201
    .line 202
    invoke-static/range {v13 .. v19}, Lk31;->a(JIIIII)J

    .line 203
    .line 204
    .line 205
    move-result-wide v3

    .line 206
    invoke-interface {v8, v3, v4}, Lgh4;->y(J)Leh5;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    sget-object v0, Lnb;->b:Lh23;

    .line 211
    .line 212
    invoke-virtual {v4, v0}, Leh5;->X(Lkb;)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/high16 v7, -0x80000000

    .line 217
    .line 218
    if-eq v3, v7, :cond_2

    .line 219
    .line 220
    invoke-virtual {v4, v0}, Leh5;->X(Lkb;)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    move v10, v0

    .line 225
    goto :goto_5

    .line 226
    :cond_2
    move v10, v2

    .line 227
    :goto_5
    iget-object v0, v9, Ljk7;->a:Lnh2;

    .line 228
    .line 229
    invoke-interface {v0}, Lnh2;->b()F

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_3

    .line 238
    .line 239
    move v0, v2

    .line 240
    goto :goto_6

    .line 241
    :cond_3
    invoke-static {v0}, Ldh4;->C(F)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    :goto_6
    invoke-interface {v6}, Lla5;->d()F

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-interface {v12, v3}, Ltp1;->r0(F)I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-interface {v6}, Lla5;->a()F

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    invoke-interface {v12, v7}, Ltp1;->r0(F)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    iget v8, v9, Ljk7;->c:F

    .line 262
    .line 263
    invoke-interface {v12, v8}, Ltp1;->r0(F)I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    iget v13, v4, Leh5;->x:I

    .line 268
    .line 269
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    add-int/2addr v8, v3

    .line 274
    add-int/2addr v8, v7

    .line 275
    invoke-static/range {p3 .. p4}, Lk31;->g(J)I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-ne v3, v11, :cond_4

    .line 280
    .line 281
    move v13, v8

    .line 282
    goto :goto_8

    .line 283
    :cond_4
    add-int/2addr v0, v8

    .line 284
    if-gez v0, :cond_5

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_5
    move v2, v0

    .line 288
    :goto_7
    move v13, v2

    .line 289
    :goto_8
    invoke-interface {v6}, Lla5;->d()F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-interface {v12, v0}, Ltp1;->r0(F)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-interface {v6}, Lla5;->a()F

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-interface {v12, v2}, Ltp1;->r0(F)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-interface {v12}, Lkg3;->getLayoutDirection()Ley3;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v6, v3}, Lx91;->l(Lla5;Ley3;)F

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    invoke-interface {v12, v3}, Ltp1;->r0(F)I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    invoke-interface {v12}, Lkg3;->getLayoutDirection()Ley3;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-static {v6, v7}, Lx91;->k(Lla5;Ley3;)F

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    invoke-interface {v12, v6}, Ltp1;->r0(F)I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    add-int/2addr v0, v13

    .line 330
    sub-int/2addr v0, v2

    .line 331
    invoke-static/range {p3 .. p4}, Lk31;->h(J)I

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    move v2, v3

    .line 336
    move v3, v0

    .line 337
    new-instance v0, Lik7;

    .line 338
    .line 339
    move v11, v8

    .line 340
    move v8, v6

    .line 341
    move-wide/from16 v6, p3

    .line 342
    .line 343
    invoke-direct/range {v0 .. v11}, Lik7;-><init>(Leh5;IILeh5;Leh5;JILjk7;II)V

    .line 344
    .line 345
    .line 346
    sget-object v1, Lb42;->w:Lb42;

    .line 347
    .line 348
    invoke-interface {v12, v14, v13, v1, v0}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0

    .line 353
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 354
    .line 355
    move-object/from16 v9, p0

    .line 356
    .line 357
    goto/16 :goto_4

    .line 358
    .line 359
    :cond_7
    invoke-static {v4}, Lb81;->z(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    throw v0

    .line 364
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 365
    .line 366
    move-object/from16 v9, p0

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_9
    invoke-static {v4}, Lb81;->z(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    throw v0

    .line 375
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 376
    .line 377
    move-object/from16 v9, p0

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :cond_b
    invoke-static {v4}, Lb81;->z(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    throw v0
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

.method public final c(Lkg3;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    move v0, p1

    .line 7
    :goto_0
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgh4;

    .line 14
    .line 15
    invoke-interface {v1, p3}, Lgh4;->l(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v0
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

.method public final d(Lkg3;Ljava/util/List;I)I
    .locals 5

    .line 1
    iget p0, p0, Ljk7;->c:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ltp1;->r0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lgh4;

    .line 21
    .line 22
    invoke-interface {p1, p3}, Lgh4;->c(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    sub-int/2addr v1, v2

    .line 36
    if-gt v2, v1, :cond_2

    .line 37
    .line 38
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lgh4;

    .line 43
    .line 44
    invoke-interface {v3, p3}, Lgh4;->c(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-lez v4, :cond_1

    .line 57
    .line 58
    move-object p1, v3

    .line 59
    :cond_1
    if-eq v2, v1, :cond_2

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    :cond_3
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0
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

.method public final e(Lkg3;Ljava/util/List;I)I
    .locals 5

    .line 1
    iget p0, p0, Ljk7;->c:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ltp1;->r0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lgh4;

    .line 21
    .line 22
    invoke-interface {p1, p3}, Lgh4;->W(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    sub-int/2addr v1, v2

    .line 36
    if-gt v2, v1, :cond_2

    .line 37
    .line 38
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lgh4;

    .line 43
    .line 44
    invoke-interface {v3, p3}, Lgh4;->W(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-lez v4, :cond_1

    .line 57
    .line 58
    move-object p1, v3

    .line 59
    :cond_1
    if-eq v2, v1, :cond_2

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    :cond_3
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0
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
