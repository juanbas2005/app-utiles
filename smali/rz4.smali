.class public final Lrz4;
.super Lc05;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final c:Lll4;

.field public final d:Lqa;

.field public final e:Lvc4;

.field public f:Lxz4;

.field public g:Lkk5;

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Lll4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc05;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrz4;->c:Lll4;

    .line 5
    .line 6
    new-instance p1, Lqa;

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v0, v1}, Lqa;-><init>(IB)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v1, v0, [J

    .line 15
    .line 16
    iput-object v1, p1, Lqa;->y:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p0, Lrz4;->d:Lqa;

    .line 19
    .line 20
    new-instance p1, Lvc4;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lvc4;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lrz4;->e:Lvc4;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lrz4;->i:Z

    .line 29
    .line 30
    iput-boolean p1, p0, Lrz4;->j:Z

    .line 31
    .line 32
    return-void
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
.end method


# virtual methods
.method public final a(Lvc4;Ldy3;Lhv2;Z)Z
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, Lc05;->a(Lvc4;Ldy3;Lhv2;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, Lrz4;->c:Lll4;

    .line 14
    .line 15
    iget-boolean v6, v5, Lll4;->J:Z

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_8

    .line 23
    .line 24
    instance-of v10, v5, Ltk5;

    .line 25
    .line 26
    const/16 v11, 0x10

    .line 27
    .line 28
    if-eqz v10, :cond_1

    .line 29
    .line 30
    check-cast v5, Ltk5;

    .line 31
    .line 32
    invoke-static {v5, v11}, Lrc9;->M0(Lvo1;I)Lxz4;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iput-object v5, v0, Lrz4;->f:Lxz4;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    iget v10, v5, Lll4;->y:I

    .line 40
    .line 41
    and-int/2addr v10, v11

    .line 42
    if-eqz v10, :cond_7

    .line 43
    .line 44
    instance-of v10, v5, Lwo1;

    .line 45
    .line 46
    if-eqz v10, :cond_7

    .line 47
    .line 48
    move-object v10, v5

    .line 49
    check-cast v10, Lwo1;

    .line 50
    .line 51
    iget-object v10, v10, Lwo1;->L:Lll4;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    :goto_1
    if-eqz v10, :cond_6

    .line 55
    .line 56
    iget v12, v10, Lll4;->y:I

    .line 57
    .line 58
    and-int/2addr v12, v11

    .line 59
    if-eqz v12, :cond_5

    .line 60
    .line 61
    add-int/lit8 v9, v9, 0x1

    .line 62
    .line 63
    if-ne v9, v7, :cond_2

    .line 64
    .line 65
    move-object v5, v10

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    if-nez v8, :cond_3

    .line 68
    .line 69
    new-instance v8, Leq4;

    .line 70
    .line 71
    new-array v12, v11, [Lll4;

    .line 72
    .line 73
    invoke-direct {v8, v12}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-virtual {v8, v5}, Leq4;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    :cond_4
    invoke-virtual {v8, v10}, Leq4;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    iget-object v10, v10, Lll4;->B:Lll4;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    if-ne v9, v7, :cond_7

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_7
    :goto_3
    invoke-static {v8}, Lrc9;->j(Leq4;)Lll4;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    goto :goto_0

    .line 96
    :cond_8
    iget-object v5, v0, Lrz4;->f:Lxz4;

    .line 97
    .line 98
    if-nez v5, :cond_9

    .line 99
    .line 100
    :goto_4
    return v7

    .line 101
    :cond_9
    invoke-virtual {v1}, Lvc4;->g()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    const/4 v8, 0x0

    .line 106
    :goto_5
    iget-object v10, v0, Lrz4;->d:Lqa;

    .line 107
    .line 108
    iget-object v11, v0, Lrz4;->e:Lvc4;

    .line 109
    .line 110
    if-ge v8, v5, :cond_10

    .line 111
    .line 112
    invoke-virtual {v1, v8}, Lvc4;->d(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v1, v8}, Lvc4;->h(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, Lqk5;

    .line 121
    .line 122
    invoke-virtual {v10, v12, v13}, Lqa;->d(J)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_f

    .line 127
    .line 128
    move v15, v7

    .line 129
    iget-wide v6, v14, Lqk5;->g:J

    .line 130
    .line 131
    iget-wide v9, v14, Lqk5;->c:J

    .line 132
    .line 133
    const-wide v16, 0x7fffffff7fffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    and-long v18, v6, v16

    .line 139
    .line 140
    const-wide v20, 0x7fffff007fffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    add-long v18, v18, v20

    .line 146
    .line 147
    const-wide v22, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    and-long v18, v18, v22

    .line 153
    .line 154
    const-wide/16 v24, 0x0

    .line 155
    .line 156
    cmp-long v18, v18, v24

    .line 157
    .line 158
    if-nez v18, :cond_e

    .line 159
    .line 160
    and-long v18, v9, v16

    .line 161
    .line 162
    add-long v18, v18, v20

    .line 163
    .line 164
    and-long v18, v18, v22

    .line 165
    .line 166
    cmp-long v18, v18, v24

    .line 167
    .line 168
    if-nez v18, :cond_e

    .line 169
    .line 170
    move/from16 v18, v15

    .line 171
    .line 172
    new-instance v15, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v14}, Lqk5;->b()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v19

    .line 178
    move/from16 v49, v4

    .line 179
    .line 180
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14}, Lqk5;->b()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    move/from16 v19, v5

    .line 192
    .line 193
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    move/from16 v50, v8

    .line 198
    .line 199
    const/4 v8, 0x0

    .line 200
    :goto_6
    if-ge v8, v5, :cond_b

    .line 201
    .line 202
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v26

    .line 206
    move-object/from16 v27, v4

    .line 207
    .line 208
    move-object/from16 v4, v26

    .line 209
    .line 210
    check-cast v4, Lb03;

    .line 211
    .line 212
    move-object/from16 v51, v11

    .line 213
    .line 214
    move-wide/from16 v52, v12

    .line 215
    .line 216
    iget-wide v11, v4, Lb03;->b:J

    .line 217
    .line 218
    and-long v28, v11, v16

    .line 219
    .line 220
    add-long v28, v28, v20

    .line 221
    .line 222
    and-long v28, v28, v22

    .line 223
    .line 224
    cmp-long v13, v28, v24

    .line 225
    .line 226
    if-nez v13, :cond_a

    .line 227
    .line 228
    new-instance v28, Lb03;

    .line 229
    .line 230
    move-object/from16 v54, v14

    .line 231
    .line 232
    iget-wide v13, v4, Lb03;->a:J

    .line 233
    .line 234
    move/from16 v26, v5

    .line 235
    .line 236
    iget-object v5, v0, Lrz4;->f:Lxz4;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v2, v11, v12}, Lxz4;->O(Ldy3;J)J

    .line 242
    .line 243
    .line 244
    move-result-wide v31

    .line 245
    iget v5, v4, Lb03;->c:F

    .line 246
    .line 247
    iget-wide v11, v4, Lb03;->d:J

    .line 248
    .line 249
    move/from16 v33, v5

    .line 250
    .line 251
    iget-wide v4, v4, Lb03;->e:J

    .line 252
    .line 253
    move-wide/from16 v36, v4

    .line 254
    .line 255
    move-wide/from16 v34, v11

    .line 256
    .line 257
    move-wide/from16 v29, v13

    .line 258
    .line 259
    invoke-direct/range {v28 .. v37}, Lb03;-><init>(JJFJJ)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v4, v28

    .line 263
    .line 264
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_a
    move/from16 v26, v5

    .line 269
    .line 270
    move-object/from16 v54, v14

    .line 271
    .line 272
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 273
    .line 274
    move/from16 v5, v26

    .line 275
    .line 276
    move-object/from16 v4, v27

    .line 277
    .line 278
    move-object/from16 v11, v51

    .line 279
    .line 280
    move-wide/from16 v12, v52

    .line 281
    .line 282
    move-object/from16 v14, v54

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_b
    move-object/from16 v51, v11

    .line 286
    .line 287
    move-wide/from16 v52, v12

    .line 288
    .line 289
    move-object/from16 v54, v14

    .line 290
    .line 291
    iget-object v4, v0, Lrz4;->f:Lxz4;

    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4, v2, v6, v7}, Lxz4;->O(Ldy3;J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v37

    .line 300
    iget-object v4, v0, Lrz4;->f:Lxz4;

    .line 301
    .line 302
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v2, v9, v10}, Lxz4;->O(Ldy3;J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v31

    .line 309
    iget-wide v4, v14, Lqk5;->a:J

    .line 310
    .line 311
    iget-wide v6, v14, Lqk5;->b:J

    .line 312
    .line 313
    iget-boolean v8, v14, Lqk5;->d:Z

    .line 314
    .line 315
    iget-wide v9, v14, Lqk5;->f:J

    .line 316
    .line 317
    iget-boolean v11, v14, Lqk5;->h:Z

    .line 318
    .line 319
    iget v12, v14, Lqk5;->i:I

    .line 320
    .line 321
    move-wide/from16 v27, v4

    .line 322
    .line 323
    iget-wide v4, v14, Lqk5;->j:J

    .line 324
    .line 325
    iget v13, v14, Lqk5;->e:F

    .line 326
    .line 327
    new-instance v26, Lqk5;

    .line 328
    .line 329
    iget v2, v14, Lqk5;->k:F

    .line 330
    .line 331
    move-wide/from16 v42, v4

    .line 332
    .line 333
    iget-wide v4, v14, Lqk5;->l:J

    .line 334
    .line 335
    move-wide/from16 v45, v4

    .line 336
    .line 337
    iget-wide v4, v14, Lqk5;->n:J

    .line 338
    .line 339
    move/from16 v44, v2

    .line 340
    .line 341
    move-wide/from16 v47, v4

    .line 342
    .line 343
    move-wide/from16 v29, v6

    .line 344
    .line 345
    move/from16 v33, v8

    .line 346
    .line 347
    move-wide/from16 v35, v9

    .line 348
    .line 349
    move/from16 v39, v11

    .line 350
    .line 351
    move/from16 v40, v12

    .line 352
    .line 353
    move/from16 v34, v13

    .line 354
    .line 355
    move-object/from16 v41, v15

    .line 356
    .line 357
    invoke-direct/range {v26 .. v48}, Lqk5;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v2, v26

    .line 361
    .line 362
    iget-object v4, v14, Lqk5;->q:Lqk5;

    .line 363
    .line 364
    if-nez v4, :cond_c

    .line 365
    .line 366
    move-object v4, v14

    .line 367
    :cond_c
    iput-object v4, v2, Lqk5;->q:Lqk5;

    .line 368
    .line 369
    iget-object v4, v14, Lqk5;->q:Lqk5;

    .line 370
    .line 371
    if-nez v4, :cond_d

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_d
    move-object v14, v4

    .line 375
    :goto_8
    iput-object v14, v2, Lqk5;->q:Lqk5;

    .line 376
    .line 377
    move-object/from16 v6, v51

    .line 378
    .line 379
    move-wide/from16 v4, v52

    .line 380
    .line 381
    invoke-virtual {v6, v4, v5, v2}, Lvc4;->e(JLjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_e
    move/from16 v49, v4

    .line 386
    .line 387
    move/from16 v19, v5

    .line 388
    .line 389
    move/from16 v50, v8

    .line 390
    .line 391
    move/from16 v18, v15

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_f
    move/from16 v49, v4

    .line 395
    .line 396
    move/from16 v19, v5

    .line 397
    .line 398
    move/from16 v18, v7

    .line 399
    .line 400
    move/from16 v50, v8

    .line 401
    .line 402
    :goto_9
    add-int/lit8 v8, v50, 0x1

    .line 403
    .line 404
    move-object/from16 v2, p2

    .line 405
    .line 406
    move/from16 v7, v18

    .line 407
    .line 408
    move/from16 v5, v19

    .line 409
    .line 410
    move/from16 v4, v49

    .line 411
    .line 412
    goto/16 :goto_5

    .line 413
    .line 414
    :cond_10
    move/from16 v49, v4

    .line 415
    .line 416
    move/from16 v18, v7

    .line 417
    .line 418
    move-object v6, v11

    .line 419
    invoke-virtual {v6}, Lvc4;->g()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-nez v2, :cond_11

    .line 424
    .line 425
    const/4 v2, 0x0

    .line 426
    iput v2, v10, Lqa;->x:I

    .line 427
    .line 428
    iget-object v0, v0, Lc05;->a:Leq4;

    .line 429
    .line 430
    invoke-virtual {v0}, Leq4;->g()V

    .line 431
    .line 432
    .line 433
    return v18

    .line 434
    :cond_11
    iget v2, v10, Lqa;->x:I

    .line 435
    .line 436
    add-int/lit8 v2, v2, -0x1

    .line 437
    .line 438
    :goto_a
    const/4 v4, -0x1

    .line 439
    if-ge v4, v2, :cond_15

    .line 440
    .line 441
    iget-object v5, v10, Lqa;->y:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v5, [J

    .line 444
    .line 445
    aget-wide v7, v5, v2

    .line 446
    .line 447
    invoke-virtual {v1, v7, v8}, Lvc4;->c(J)I

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-ltz v5, :cond_12

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :cond_12
    iget v5, v10, Lqa;->x:I

    .line 455
    .line 456
    if-ge v2, v5, :cond_14

    .line 457
    .line 458
    add-int/lit8 v5, v5, -0x1

    .line 459
    .line 460
    move v7, v2

    .line 461
    :goto_b
    if-ge v7, v5, :cond_13

    .line 462
    .line 463
    iget-object v8, v10, Lqa;->y:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v8, [J

    .line 466
    .line 467
    add-int/lit8 v9, v7, 0x1

    .line 468
    .line 469
    aget-wide v11, v8, v9

    .line 470
    .line 471
    aput-wide v11, v8, v7

    .line 472
    .line 473
    move v7, v9

    .line 474
    goto :goto_b

    .line 475
    :cond_13
    iget v5, v10, Lqa;->x:I

    .line 476
    .line 477
    add-int/2addr v5, v4

    .line 478
    iput v5, v10, Lqa;->x:I

    .line 479
    .line 480
    :cond_14
    :goto_c
    add-int/lit8 v2, v2, -0x1

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-virtual {v6}, Lvc4;->g()I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v6}, Lvc4;->g()I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    const/4 v4, 0x0

    .line 497
    :goto_d
    if-ge v4, v2, :cond_16

    .line 498
    .line 499
    invoke-virtual {v6, v4}, Lvc4;->h(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    add-int/lit8 v4, v4, 0x1

    .line 507
    .line 508
    goto :goto_d

    .line 509
    :cond_16
    new-instance v2, Lkk5;

    .line 510
    .line 511
    invoke-direct {v2, v1, v3}, Lkk5;-><init>(Ljava/util/List;Lhv2;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    const/4 v5, 0x0

    .line 519
    :goto_e
    if-ge v5, v4, :cond_18

    .line 520
    .line 521
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    move-object v7, v6

    .line 526
    check-cast v7, Lqk5;

    .line 527
    .line 528
    iget-wide v7, v7, Lqk5;->a:J

    .line 529
    .line 530
    invoke-virtual {v3, v7, v8}, Lhv2;->Q(J)Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-eqz v7, :cond_17

    .line 535
    .line 536
    goto :goto_f

    .line 537
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 538
    .line 539
    goto :goto_e

    .line 540
    :cond_18
    const/4 v6, 0x0

    .line 541
    :goto_f
    check-cast v6, Lqk5;

    .line 542
    .line 543
    const/4 v1, 0x3

    .line 544
    if-eqz v6, :cond_25

    .line 545
    .line 546
    iget-boolean v3, v6, Lqk5;->d:Z

    .line 547
    .line 548
    if-nez p4, :cond_19

    .line 549
    .line 550
    const/4 v4, 0x0

    .line 551
    iput-boolean v4, v0, Lrz4;->i:Z

    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_19
    const/4 v4, 0x0

    .line 555
    iget-boolean v5, v0, Lrz4;->i:Z

    .line 556
    .line 557
    if-nez v5, :cond_1f

    .line 558
    .line 559
    if-nez v3, :cond_1a

    .line 560
    .line 561
    iget-boolean v5, v6, Lqk5;->h:Z

    .line 562
    .line 563
    if-eqz v5, :cond_1f

    .line 564
    .line 565
    :cond_1a
    iget-object v5, v0, Lrz4;->f:Lxz4;

    .line 566
    .line 567
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    iget-wide v7, v5, Leh5;->y:J

    .line 571
    .line 572
    iget-wide v5, v6, Lqk5;->c:J

    .line 573
    .line 574
    const/16 v9, 0x20

    .line 575
    .line 576
    shr-long v10, v5, v9

    .line 577
    .line 578
    long-to-int v10, v10

    .line 579
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 580
    .line 581
    .line 582
    move-result v10

    .line 583
    const-wide v11, 0xffffffffL

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    and-long/2addr v5, v11

    .line 589
    long-to-int v5, v5

    .line 590
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    shr-long v13, v7, v9

    .line 595
    .line 596
    long-to-int v6, v13

    .line 597
    and-long/2addr v7, v11

    .line 598
    long-to-int v7, v7

    .line 599
    const/4 v8, 0x0

    .line 600
    cmpg-float v9, v10, v8

    .line 601
    .line 602
    if-gez v9, :cond_1b

    .line 603
    .line 604
    move/from16 v9, v18

    .line 605
    .line 606
    goto :goto_10

    .line 607
    :cond_1b
    move v9, v4

    .line 608
    :goto_10
    int-to-float v6, v6

    .line 609
    cmpl-float v6, v10, v6

    .line 610
    .line 611
    if-lez v6, :cond_1c

    .line 612
    .line 613
    move/from16 v6, v18

    .line 614
    .line 615
    goto :goto_11

    .line 616
    :cond_1c
    move v6, v4

    .line 617
    :goto_11
    or-int/2addr v6, v9

    .line 618
    cmpg-float v8, v5, v8

    .line 619
    .line 620
    if-gez v8, :cond_1d

    .line 621
    .line 622
    move/from16 v8, v18

    .line 623
    .line 624
    goto :goto_12

    .line 625
    :cond_1d
    move v8, v4

    .line 626
    :goto_12
    or-int/2addr v6, v8

    .line 627
    int-to-float v7, v7

    .line 628
    cmpl-float v5, v5, v7

    .line 629
    .line 630
    if-lez v5, :cond_1e

    .line 631
    .line 632
    move/from16 v5, v18

    .line 633
    .line 634
    goto :goto_13

    .line 635
    :cond_1e
    move v5, v4

    .line 636
    :goto_13
    or-int/2addr v5, v6

    .line 637
    xor-int/lit8 v5, v5, 0x1

    .line 638
    .line 639
    iput-boolean v5, v0, Lrz4;->i:Z

    .line 640
    .line 641
    :cond_1f
    :goto_14
    iget-boolean v5, v0, Lrz4;->i:Z

    .line 642
    .line 643
    iget-boolean v6, v0, Lrz4;->h:Z

    .line 644
    .line 645
    const/4 v7, 0x5

    .line 646
    const/4 v8, 0x4

    .line 647
    if-eq v5, v6, :cond_23

    .line 648
    .line 649
    iget v9, v2, Lkk5;->f:I

    .line 650
    .line 651
    if-ne v9, v1, :cond_20

    .line 652
    .line 653
    goto :goto_15

    .line 654
    :cond_20
    if-ne v9, v8, :cond_21

    .line 655
    .line 656
    goto :goto_15

    .line 657
    :cond_21
    if-ne v9, v7, :cond_23

    .line 658
    .line 659
    :goto_15
    if-eqz v5, :cond_22

    .line 660
    .line 661
    move v7, v8

    .line 662
    :cond_22
    iput v7, v2, Lkk5;->f:I

    .line 663
    .line 664
    goto :goto_16

    .line 665
    :cond_23
    iget v9, v2, Lkk5;->f:I

    .line 666
    .line 667
    if-ne v9, v8, :cond_24

    .line 668
    .line 669
    if-eqz v6, :cond_24

    .line 670
    .line 671
    iget-boolean v6, v0, Lrz4;->j:Z

    .line 672
    .line 673
    if-nez v6, :cond_24

    .line 674
    .line 675
    iput v1, v2, Lkk5;->f:I

    .line 676
    .line 677
    goto :goto_16

    .line 678
    :cond_24
    if-ne v9, v7, :cond_26

    .line 679
    .line 680
    if-eqz v5, :cond_26

    .line 681
    .line 682
    if-eqz v3, :cond_26

    .line 683
    .line 684
    iput v1, v2, Lkk5;->f:I

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_25
    const/4 v4, 0x0

    .line 688
    :cond_26
    :goto_16
    if-nez v49, :cond_2a

    .line 689
    .line 690
    iget v3, v2, Lkk5;->f:I

    .line 691
    .line 692
    if-ne v3, v1, :cond_2a

    .line 693
    .line 694
    iget-object v1, v0, Lrz4;->g:Lkk5;

    .line 695
    .line 696
    if-eqz v1, :cond_2a

    .line 697
    .line 698
    iget-object v1, v1, Lkk5;->a:Ljava/util/List;

    .line 699
    .line 700
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    iget-object v5, v2, Lkk5;->a:Ljava/util/List;

    .line 705
    .line 706
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 707
    .line 708
    .line 709
    move-result v6

    .line 710
    if-eq v3, v6, :cond_27

    .line 711
    .line 712
    goto :goto_18

    .line 713
    :cond_27
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    move v6, v4

    .line 718
    :goto_17
    if-ge v6, v3, :cond_29

    .line 719
    .line 720
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v7

    .line 724
    check-cast v7, Lqk5;

    .line 725
    .line 726
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v8

    .line 730
    check-cast v8, Lqk5;

    .line 731
    .line 732
    iget-wide v9, v7, Lqk5;->c:J

    .line 733
    .line 734
    iget-wide v7, v8, Lqk5;->c:J

    .line 735
    .line 736
    invoke-static {v9, v10, v7, v8}, Ll35;->b(JJ)Z

    .line 737
    .line 738
    .line 739
    move-result v7

    .line 740
    if-nez v7, :cond_28

    .line 741
    .line 742
    goto :goto_18

    .line 743
    :cond_28
    add-int/lit8 v6, v6, 0x1

    .line 744
    .line 745
    goto :goto_17

    .line 746
    :cond_29
    move v7, v4

    .line 747
    goto :goto_19

    .line 748
    :cond_2a
    :goto_18
    move/from16 v7, v18

    .line 749
    .line 750
    :goto_19
    iput-object v2, v0, Lrz4;->g:Lkk5;

    .line 751
    .line 752
    return v7
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
.end method

.method public final b(Lhv2;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Lc05;->b(Lhv2;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrz4;->g:Lkk5;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, Lrz4;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Lrz4;->h:Z

    .line 12
    .line 13
    iget-object v1, v0, Lkk5;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_4

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Lqk5;

    .line 28
    .line 29
    iget-boolean v6, v5, Lqk5;->d:Z

    .line 30
    .line 31
    iget-wide v7, v5, Lqk5;->a:J

    .line 32
    .line 33
    invoke-virtual {p1, v7, v8}, Lhv2;->Q(J)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-boolean v9, p0, Lrz4;->i:Z

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    :cond_1
    if-nez v6, :cond_3

    .line 44
    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    :cond_2
    iget-object v5, p0, Lrz4;->d:Lqa;

    .line 48
    .line 49
    invoke-virtual {v5, v7, v8}, Lqa;->k(J)V

    .line 50
    .line 51
    .line 52
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iput-boolean v3, p0, Lrz4;->i:Z

    .line 56
    .line 57
    iget p1, v0, Lkk5;->f:I

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    :cond_5
    iput-boolean v3, p0, Lrz4;->j:Z

    .line 64
    .line 65
    return-void
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

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, Lc05;->a:Leq4;

    .line 2
    .line 3
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Leq4;->y:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, Lrz4;

    .line 14
    .line 15
    invoke-virtual {v4}, Lrz4;->c()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iget-object p0, p0, Lrz4;->c:Lll4;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    :goto_1
    if-eqz p0, :cond_8

    .line 26
    .line 27
    instance-of v3, p0, Ltk5;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast p0, Ltk5;

    .line 32
    .line 33
    invoke-interface {p0}, Ltk5;->I()V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget v3, p0, Lll4;->y:I

    .line 38
    .line 39
    const/16 v4, 0x10

    .line 40
    .line 41
    and-int/2addr v3, v4

    .line 42
    if-eqz v3, :cond_7

    .line 43
    .line 44
    instance-of v3, p0, Lwo1;

    .line 45
    .line 46
    if-eqz v3, :cond_7

    .line 47
    .line 48
    move-object v3, p0

    .line 49
    check-cast v3, Lwo1;

    .line 50
    .line 51
    iget-object v3, v3, Lwo1;->L:Lll4;

    .line 52
    .line 53
    move v5, v2

    .line 54
    :goto_2
    const/4 v6, 0x1

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    iget v7, v3, Lll4;->y:I

    .line 58
    .line 59
    and-int/2addr v7, v4

    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    if-ne v5, v6, :cond_2

    .line 65
    .line 66
    move-object p0, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-nez v1, :cond_3

    .line 69
    .line 70
    new-instance v1, Leq4;

    .line 71
    .line 72
    new-array v6, v4, [Lll4;

    .line 73
    .line 74
    invoke-direct {v1, v6}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz p0, :cond_4

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Leq4;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object p0, v0

    .line 83
    :cond_4
    invoke-virtual {v1, v3}, Leq4;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    iget-object v3, v3, Lll4;->B:Lll4;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    if-ne v5, v6, :cond_7

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_4
    invoke-static {v1}, Lrc9;->j(Leq4;)Lll4;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_1

    .line 97
    :cond_8
    return-void
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

.method public final d(Lhv2;)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lrz4;->e:Lvc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvc4;->g()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lrz4;->c:Lll4;

    .line 14
    .line 15
    iget-boolean v4, v1, Lll4;->J:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_1
    iget-object v4, v1, Lll4;->D:Lxz4;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, Lxz4;->O:Luy3;

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v4}, Luy3;->K()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :goto_0
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_3
    iget-object v4, p0, Lrz4;->g:Lkk5;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lrz4;->f:Lxz4;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-wide v5, v5, Leh5;->y:J

    .line 50
    .line 51
    move-object v7, v1

    .line 52
    move-object v8, v2

    .line 53
    :goto_1
    const/4 v9, 0x1

    .line 54
    if-eqz v7, :cond_b

    .line 55
    .line 56
    instance-of v10, v7, Ltk5;

    .line 57
    .line 58
    if-eqz v10, :cond_4

    .line 59
    .line 60
    check-cast v7, Ltk5;

    .line 61
    .line 62
    sget-object v9, Llk5;->y:Llk5;

    .line 63
    .line 64
    invoke-interface {v7, v4, v9, v5, v6}, Ltk5;->y(Lkk5;Llk5;J)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    iget v10, v7, Lll4;->y:I

    .line 69
    .line 70
    const/16 v11, 0x10

    .line 71
    .line 72
    and-int/2addr v10, v11

    .line 73
    if-eqz v10, :cond_a

    .line 74
    .line 75
    instance-of v10, v7, Lwo1;

    .line 76
    .line 77
    if-eqz v10, :cond_a

    .line 78
    .line 79
    move-object v10, v7

    .line 80
    check-cast v10, Lwo1;

    .line 81
    .line 82
    iget-object v10, v10, Lwo1;->L:Lll4;

    .line 83
    .line 84
    move v12, v3

    .line 85
    :goto_2
    if-eqz v10, :cond_9

    .line 86
    .line 87
    iget v13, v10, Lll4;->y:I

    .line 88
    .line 89
    and-int/2addr v13, v11

    .line 90
    if-eqz v13, :cond_8

    .line 91
    .line 92
    add-int/lit8 v12, v12, 0x1

    .line 93
    .line 94
    if-ne v12, v9, :cond_5

    .line 95
    .line 96
    move-object v7, v10

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    if-nez v8, :cond_6

    .line 99
    .line 100
    new-instance v8, Leq4;

    .line 101
    .line 102
    new-array v13, v11, [Lll4;

    .line 103
    .line 104
    invoke-direct {v8, v13}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    if-eqz v7, :cond_7

    .line 108
    .line 109
    invoke-virtual {v8, v7}, Leq4;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move-object v7, v2

    .line 113
    :cond_7
    invoke-virtual {v8, v10}, Leq4;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    :goto_3
    iget-object v10, v10, Lll4;->B:Lll4;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    if-ne v12, v9, :cond_a

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_a
    :goto_4
    invoke-static {v8}, Lrc9;->j(Leq4;)Lll4;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    goto :goto_1

    .line 127
    :cond_b
    iget-boolean v1, v1, Lll4;->J:Z

    .line 128
    .line 129
    if-eqz v1, :cond_c

    .line 130
    .line 131
    iget-object v1, p0, Lc05;->a:Leq4;

    .line 132
    .line 133
    iget-object v4, v1, Leq4;->w:[Ljava/lang/Object;

    .line 134
    .line 135
    iget v1, v1, Leq4;->y:I

    .line 136
    .line 137
    :goto_5
    if-ge v3, v1, :cond_c

    .line 138
    .line 139
    aget-object v5, v4, v3

    .line 140
    .line 141
    check-cast v5, Lrz4;

    .line 142
    .line 143
    invoke-virtual {v5, p1}, Lrz4;->d(Lhv2;)Z

    .line 144
    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_c
    move v3, v9

    .line 150
    :goto_6
    invoke-virtual {p0, p1}, Lrz4;->b(Lhv2;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lvc4;->a()V

    .line 154
    .line 155
    .line 156
    iput-object v2, p0, Lrz4;->f:Lxz4;

    .line 157
    .line 158
    return v3
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

.method public final e(Lhv2;Z)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lrz4;->e:Lvc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvc4;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lrz4;->c:Lll4;

    .line 12
    .line 13
    iget-boolean v2, v0, Lll4;->J:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v2, v0, Lll4;->D:Lxz4;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, v2, Lxz4;->O:Luy3;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Luy3;->K()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v2, v1

    .line 32
    :goto_0
    if-nez v2, :cond_3

    .line 33
    .line 34
    :goto_1
    return v1

    .line 35
    :cond_3
    iget-object v2, p0, Lrz4;->g:Lkk5;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lrz4;->f:Lxz4;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-wide v3, v3, Leh5;->y:J

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    move-object v6, v0

    .line 49
    move-object v7, v5

    .line 50
    :goto_2
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v6, :cond_b

    .line 54
    .line 55
    instance-of v10, v6, Ltk5;

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    check-cast v6, Ltk5;

    .line 60
    .line 61
    sget-object v8, Llk5;->w:Llk5;

    .line 62
    .line 63
    invoke-interface {v6, v2, v8, v3, v4}, Ltk5;->y(Lkk5;Llk5;J)V

    .line 64
    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_4
    iget v10, v6, Lll4;->y:I

    .line 68
    .line 69
    and-int/2addr v10, v8

    .line 70
    if-eqz v10, :cond_a

    .line 71
    .line 72
    instance-of v10, v6, Lwo1;

    .line 73
    .line 74
    if-eqz v10, :cond_a

    .line 75
    .line 76
    move-object v10, v6

    .line 77
    check-cast v10, Lwo1;

    .line 78
    .line 79
    iget-object v10, v10, Lwo1;->L:Lll4;

    .line 80
    .line 81
    move v11, v1

    .line 82
    :goto_3
    if-eqz v10, :cond_9

    .line 83
    .line 84
    iget v12, v10, Lll4;->y:I

    .line 85
    .line 86
    and-int/2addr v12, v8

    .line 87
    if-eqz v12, :cond_8

    .line 88
    .line 89
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    if-ne v11, v9, :cond_5

    .line 92
    .line 93
    move-object v6, v10

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    if-nez v7, :cond_6

    .line 96
    .line 97
    new-instance v7, Leq4;

    .line 98
    .line 99
    new-array v12, v8, [Lll4;

    .line 100
    .line 101
    invoke-direct {v7, v12}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    if-eqz v6, :cond_7

    .line 105
    .line 106
    invoke-virtual {v7, v6}, Leq4;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v6, v5

    .line 110
    :cond_7
    invoke-virtual {v7, v10}, Leq4;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_4
    iget-object v10, v10, Lll4;->B:Lll4;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_9
    if-ne v11, v9, :cond_a

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_a
    :goto_5
    invoke-static {v7}, Lrc9;->j(Leq4;)Lll4;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_2

    .line 124
    :cond_b
    iget-boolean v6, v0, Lll4;->J:Z

    .line 125
    .line 126
    if-eqz v6, :cond_c

    .line 127
    .line 128
    iget-object v6, p0, Lc05;->a:Leq4;

    .line 129
    .line 130
    iget-object v7, v6, Leq4;->w:[Ljava/lang/Object;

    .line 131
    .line 132
    iget v6, v6, Leq4;->y:I

    .line 133
    .line 134
    move v10, v1

    .line 135
    :goto_6
    if-ge v10, v6, :cond_c

    .line 136
    .line 137
    aget-object v11, v7, v10

    .line 138
    .line 139
    check-cast v11, Lrz4;

    .line 140
    .line 141
    iget-object v12, p0, Lrz4;->f:Lxz4;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11, p1, p2}, Lrz4;->e(Lhv2;Z)Z

    .line 147
    .line 148
    .line 149
    add-int/lit8 v10, v10, 0x1

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_c
    iget-boolean p0, v0, Lll4;->J:Z

    .line 153
    .line 154
    if-eqz p0, :cond_14

    .line 155
    .line 156
    move-object p0, v5

    .line 157
    :goto_7
    if-eqz v0, :cond_14

    .line 158
    .line 159
    instance-of p1, v0, Ltk5;

    .line 160
    .line 161
    if-eqz p1, :cond_d

    .line 162
    .line 163
    check-cast v0, Ltk5;

    .line 164
    .line 165
    sget-object p1, Llk5;->x:Llk5;

    .line 166
    .line 167
    invoke-interface {v0, v2, p1, v3, v4}, Ltk5;->y(Lkk5;Llk5;J)V

    .line 168
    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_d
    iget p1, v0, Lll4;->y:I

    .line 172
    .line 173
    and-int/2addr p1, v8

    .line 174
    if-eqz p1, :cond_13

    .line 175
    .line 176
    instance-of p1, v0, Lwo1;

    .line 177
    .line 178
    if-eqz p1, :cond_13

    .line 179
    .line 180
    move-object p1, v0

    .line 181
    check-cast p1, Lwo1;

    .line 182
    .line 183
    iget-object p1, p1, Lwo1;->L:Lll4;

    .line 184
    .line 185
    move p2, v1

    .line 186
    :goto_8
    if-eqz p1, :cond_12

    .line 187
    .line 188
    iget v6, p1, Lll4;->y:I

    .line 189
    .line 190
    and-int/2addr v6, v8

    .line 191
    if-eqz v6, :cond_11

    .line 192
    .line 193
    add-int/lit8 p2, p2, 0x1

    .line 194
    .line 195
    if-ne p2, v9, :cond_e

    .line 196
    .line 197
    move-object v0, p1

    .line 198
    goto :goto_9

    .line 199
    :cond_e
    if-nez p0, :cond_f

    .line 200
    .line 201
    new-instance p0, Leq4;

    .line 202
    .line 203
    new-array v6, v8, [Lll4;

    .line 204
    .line 205
    invoke-direct {p0, v6}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_f
    if-eqz v0, :cond_10

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Leq4;->b(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move-object v0, v5

    .line 214
    :cond_10
    invoke-virtual {p0, p1}, Leq4;->b(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_11
    :goto_9
    iget-object p1, p1, Lll4;->B:Lll4;

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_12
    if-ne p2, v9, :cond_13

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_13
    :goto_a
    invoke-static {p0}, Lrc9;->j(Leq4;)Lll4;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    goto :goto_7

    .line 228
    :cond_14
    return v9
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

.method public final f(JLlp4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lrz4;->d:Lqa;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lqa;->d(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3, p0}, Llp4;->g(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Lqa;->k(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lrz4;->e:Lvc4;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lvc4;->f(J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Lc05;->a:Leq4;

    .line 25
    .line 26
    iget-object v0, p0, Leq4;->w:[Ljava/lang/Object;

    .line 27
    .line 28
    iget p0, p0, Leq4;->y:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_1
    if-ge v1, p0, :cond_2

    .line 32
    .line 33
    aget-object v2, v0, v1

    .line 34
    .line 35
    check-cast v2, Lrz4;

    .line 36
    .line 37
    invoke-virtual {v2, p1, p2, p3}, Lrz4;->f(JLlp4;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(modifierNode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lrz4;->c:Lll4;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc05;->a:Leq4;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pointerIds="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lrz4;->d:Lqa;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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
