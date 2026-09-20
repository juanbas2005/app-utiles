.class public final synthetic Lvz5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvz5;->w:I

    .line 2
    .line 3
    iput-wide p2, p0, Lvz5;->x:J

    .line 4
    .line 5
    iput-object p4, p0, Lvz5;->y:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvz5;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, Lvz5;->y:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Lsr2;

    .line 14
    .line 15
    move-object/from16 v5, p1

    .line 16
    .line 17
    check-cast v5, Lhz1;

    .line 18
    .line 19
    invoke-interface {v4}, Lsr2;->b()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v4, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {v1, v3, v4}, Lz65;->o(FFF)F

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    const/16 v13, 0x76

    .line 36
    .line 37
    iget-wide v6, v0, Lvz5;->x:J

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    invoke-static/range {v5 .. v13}, Lhz1;->f0(Lhz1;JJJFI)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_0
    check-cast v4, La37;

    .line 48
    .line 49
    move-object/from16 v5, p1

    .line 50
    .line 51
    check-cast v5, Lhz1;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/high16 v1, 0x41b00000    # 22.0f

    .line 57
    .line 58
    invoke-interface {v5, v1}, Ltp1;->e0(F)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/high16 v1, 0x41900000    # 18.0f

    .line 63
    .line 64
    invoke-interface {v5, v1}, Ltp1;->e0(F)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-float/2addr v1, v7

    .line 69
    invoke-interface {v5}, Lhz1;->e()J

    .line 70
    .line 71
    .line 72
    move-result-wide v8

    .line 73
    const/16 v15, 0x20

    .line 74
    .line 75
    shr-long/2addr v8, v15

    .line 76
    long-to-int v6, v8

    .line 77
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/high16 v8, 0x40000000    # 2.0f

    .line 82
    .line 83
    div-float/2addr v6, v8

    .line 84
    sub-float v1, v6, v1

    .line 85
    .line 86
    invoke-interface {v5}, Lhz1;->e()J

    .line 87
    .line 88
    .line 89
    move-result-wide v9

    .line 90
    shr-long/2addr v9, v15

    .line 91
    long-to-int v6, v9

    .line 92
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    div-float v16, v6, v8

    .line 97
    .line 98
    invoke-interface {v5}, Lhz1;->e()J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    const-wide v17, 0xffffffffL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    and-long v9, v9, v17

    .line 108
    .line 109
    long-to-int v6, v9

    .line 110
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v19

    .line 114
    sub-float v6, v16, v1

    .line 115
    .line 116
    sub-float v9, v19, v1

    .line 117
    .line 118
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    int-to-long v10, v6

    .line 123
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    int-to-long v12, v6

    .line 128
    shl-long v9, v10, v15

    .line 129
    .line 130
    and-long v11, v12, v17

    .line 131
    .line 132
    or-long v12, v9, v11

    .line 133
    .line 134
    mul-float/2addr v8, v1

    .line 135
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    int-to-long v9, v6

    .line 140
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    move/from16 v20, v3

    .line 145
    .line 146
    move-object/from16 v21, v4

    .line 147
    .line 148
    int-to-long v3, v6

    .line 149
    shl-long v8, v9, v15

    .line 150
    .line 151
    and-long v3, v3, v17

    .line 152
    .line 153
    or-long/2addr v3, v8

    .line 154
    const-wide v22, 0xffedf2f7L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static/range {v22 .. v23}, Luq3;->d(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    const-wide v24, 0xff22364aL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    invoke-static/range {v24 .. v25}, Luq3;->d(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v10

    .line 172
    invoke-static {v8, v9, v10, v11}, Lxz5;->x(JJ)J

    .line 173
    .line 174
    .line 175
    move-result-wide v26

    .line 176
    new-instance v14, Ll57;

    .line 177
    .line 178
    const/4 v10, 0x0

    .line 179
    const/16 v11, 0x1a

    .line 180
    .line 181
    const/4 v8, 0x0

    .line 182
    const/4 v9, 0x1

    .line 183
    move-object v6, v14

    .line 184
    invoke-direct/range {v6 .. v11}, Ll57;-><init>(FFIII)V

    .line 185
    .line 186
    .line 187
    move/from16 v28, v7

    .line 188
    .line 189
    const/high16 v8, 0x43340000    # 180.0f

    .line 190
    .line 191
    const/high16 v9, 0x43340000    # 180.0f

    .line 192
    .line 193
    move-wide v10, v12

    .line 194
    move-wide/from16 v6, v26

    .line 195
    .line 196
    move-wide v12, v3

    .line 197
    invoke-interface/range {v5 .. v14}, Lhz1;->i(JFFJJLl57;)V

    .line 198
    .line 199
    .line 200
    move-wide v3, v10

    .line 201
    invoke-static {}, Lxz5;->v()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    new-instance v8, Ljt0;

    .line 206
    .line 207
    invoke-direct {v8, v6, v7}, Ljt0;-><init>(J)V

    .line 208
    .line 209
    .line 210
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    new-instance v7, Lyb5;

    .line 215
    .line 216
    invoke-direct {v7, v8, v6}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const-wide v8, 0xff1b3a5cL

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v8, v9}, Luq3;->d(J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v8

    .line 228
    const-wide v10, 0xff9ab8d6L

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    invoke-static {v10, v11}, Luq3;->d(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v10

    .line 237
    invoke-static {v8, v9, v10, v11}, Lxz5;->x(JJ)J

    .line 238
    .line 239
    .line 240
    move-result-wide v8

    .line 241
    new-instance v6, Ljt0;

    .line 242
    .line 243
    invoke-direct {v6, v8, v9}, Ljt0;-><init>(J)V

    .line 244
    .line 245
    .line 246
    const/high16 v8, 0x42340000    # 45.0f

    .line 247
    .line 248
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    new-instance v9, Lyb5;

    .line 253
    .line 254
    invoke-direct {v9, v6, v8}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    const-wide v10, 0xff3d7a9eL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static {v10, v11}, Luq3;->d(J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v10

    .line 266
    const-wide v26, 0xff6fb1d6L

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    move/from16 p1, v1

    .line 272
    .line 273
    move-object/from16 v20, v2

    .line 274
    .line 275
    invoke-static/range {v26 .. v27}, Luq3;->d(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v1

    .line 279
    invoke-static {v10, v11, v1, v2}, Lxz5;->x(JJ)J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    new-instance v6, Ljt0;

    .line 284
    .line 285
    invoke-direct {v6, v1, v2}, Ljt0;-><init>(J)V

    .line 286
    .line 287
    .line 288
    const/high16 v1, 0x42b40000    # 90.0f

    .line 289
    .line 290
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    new-instance v2, Lyb5;

    .line 295
    .line 296
    invoke-direct {v2, v6, v1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    const-wide v10, 0xff2f6fe0L

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    invoke-static {v10, v11}, Luq3;->d(J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v10

    .line 308
    const-wide v26, 0xff7ca9f0L

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    move-wide/from16 v29, v3

    .line 314
    .line 315
    invoke-static/range {v26 .. v27}, Luq3;->d(J)J

    .line 316
    .line 317
    .line 318
    move-result-wide v3

    .line 319
    invoke-static {v10, v11, v3, v4}, Lxz5;->x(JJ)J

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    new-instance v1, Ljt0;

    .line 324
    .line 325
    invoke-direct {v1, v3, v4}, Ljt0;-><init>(J)V

    .line 326
    .line 327
    .line 328
    const/high16 v3, 0x43070000    # 135.0f

    .line 329
    .line 330
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    new-instance v4, Lyb5;

    .line 335
    .line 336
    invoke-direct {v4, v1, v3}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    filled-new-array {v7, v9, v2, v4}, [Lyb5;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    const/high16 v3, 0x43340000    # 180.0f

    .line 356
    .line 357
    if-eqz v2, :cond_0

    .line 358
    .line 359
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    check-cast v2, Lyb5;

    .line 364
    .line 365
    iget-object v4, v2, Lyb5;->w:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v4, Ljt0;

    .line 368
    .line 369
    iget-wide v6, v4, Ljt0;->a:J

    .line 370
    .line 371
    iget-object v2, v2, Lyb5;->x:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v2, Ljava/lang/Number;

    .line 374
    .line 375
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    const v4, 0x3e6147ae    # 0.22f

    .line 380
    .line 381
    .line 382
    invoke-static {v4, v6, v7}, Ljt0;->b(FJ)J

    .line 383
    .line 384
    .line 385
    move-result-wide v26

    .line 386
    add-float/2addr v2, v3

    .line 387
    new-instance v14, Ll57;

    .line 388
    .line 389
    const/4 v10, 0x0

    .line 390
    const/16 v11, 0x1a

    .line 391
    .line 392
    const/4 v8, 0x0

    .line 393
    const/4 v9, 0x0

    .line 394
    move-object v6, v14

    .line 395
    move/from16 v7, v28

    .line 396
    .line 397
    invoke-direct/range {v6 .. v11}, Ll57;-><init>(FFIII)V

    .line 398
    .line 399
    .line 400
    const/high16 v9, 0x42300000    # 44.0f

    .line 401
    .line 402
    move v8, v2

    .line 403
    move-wide/from16 v6, v26

    .line 404
    .line 405
    move-wide/from16 v10, v29

    .line 406
    .line 407
    invoke-interface/range {v5 .. v14}, Lhz1;->i(JFFJJLl57;)V

    .line 408
    .line 409
    .line 410
    goto :goto_0

    .line 411
    :cond_0
    invoke-interface/range {v21 .. v21}, La37;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Ljava/lang/Number;

    .line 416
    .line 417
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    const v2, 0x3ba3d70a    # 0.005f

    .line 422
    .line 423
    .line 424
    cmpl-float v1, v1, v2

    .line 425
    .line 426
    iget-wide v6, v0, Lvz5;->x:J

    .line 427
    .line 428
    if-lez v1, :cond_1

    .line 429
    .line 430
    invoke-interface/range {v21 .. v21}, La37;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v0, Ljava/lang/Number;

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    mul-float/2addr v0, v3

    .line 441
    new-instance v14, Ll57;

    .line 442
    .line 443
    const/4 v10, 0x0

    .line 444
    const/16 v11, 0x1a

    .line 445
    .line 446
    const/4 v8, 0x0

    .line 447
    const/4 v9, 0x1

    .line 448
    move-wide v1, v6

    .line 449
    move-object v6, v14

    .line 450
    move/from16 v7, v28

    .line 451
    .line 452
    invoke-direct/range {v6 .. v11}, Ll57;-><init>(FFIII)V

    .line 453
    .line 454
    .line 455
    const/high16 v8, 0x43340000    # 180.0f

    .line 456
    .line 457
    move v9, v0

    .line 458
    move-wide v6, v1

    .line 459
    move-wide/from16 v10, v29

    .line 460
    .line 461
    invoke-interface/range {v5 .. v14}, Lhz1;->i(JFFJJLl57;)V

    .line 462
    .line 463
    .line 464
    goto :goto_1

    .line 465
    :cond_1
    move-wide v1, v6

    .line 466
    :goto_1
    invoke-interface/range {v21 .. v21}, La37;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, Ljava/lang/Number;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    float-to-double v3, v0

    .line 477
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    mul-double/2addr v3, v6

    .line 483
    add-double/2addr v3, v6

    .line 484
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 485
    .line 486
    .line 487
    move-result-wide v3

    .line 488
    const/high16 v0, 0x40c00000    # 6.0f

    .line 489
    .line 490
    invoke-interface {v5, v0}, Ltp1;->e0(F)F

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    sub-float v0, p1, v0

    .line 495
    .line 496
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    double-to-float v6, v6

    .line 501
    mul-float/2addr v6, v0

    .line 502
    add-float v21, v6, v16

    .line 503
    .line 504
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 505
    .line 506
    .line 507
    move-result-wide v3

    .line 508
    double-to-float v3, v3

    .line 509
    mul-float/2addr v0, v3

    .line 510
    add-float v0, v0, v19

    .line 511
    .line 512
    const/high16 v3, 0x3e800000    # 0.25f

    .line 513
    .line 514
    invoke-static {v3, v1, v2}, Ljt0;->b(FJ)J

    .line 515
    .line 516
    .line 517
    move-result-wide v6

    .line 518
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    int-to-long v3, v3

    .line 523
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    int-to-long v8, v8

    .line 528
    shl-long/2addr v3, v15

    .line 529
    and-long v8, v8, v17

    .line 530
    .line 531
    or-long/2addr v8, v3

    .line 532
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    int-to-long v3, v3

    .line 537
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 538
    .line 539
    .line 540
    move-result v10

    .line 541
    int-to-long v10, v10

    .line 542
    shl-long/2addr v3, v15

    .line 543
    and-long v10, v10, v17

    .line 544
    .line 545
    or-long/2addr v10, v3

    .line 546
    const/high16 v3, 0x41000000    # 8.0f

    .line 547
    .line 548
    invoke-interface {v5, v3}, Ltp1;->e0(F)F

    .line 549
    .line 550
    .line 551
    move-result v12

    .line 552
    const/4 v13, 0x1

    .line 553
    const/16 v14, 0x1e0

    .line 554
    .line 555
    invoke-static/range {v5 .. v14}, Lhz1;->q0(Lhz1;JJJFII)V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Lxz5;->w()J

    .line 559
    .line 560
    .line 561
    move-result-wide v6

    .line 562
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    int-to-long v3, v3

    .line 567
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    int-to-long v8, v8

    .line 572
    shl-long/2addr v3, v15

    .line 573
    and-long v8, v8, v17

    .line 574
    .line 575
    or-long/2addr v8, v3

    .line 576
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    int-to-long v3, v3

    .line 581
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    int-to-long v10, v0

    .line 586
    shl-long/2addr v3, v15

    .line 587
    and-long v10, v10, v17

    .line 588
    .line 589
    or-long/2addr v10, v3

    .line 590
    const/high16 v0, 0x40200000    # 2.5f

    .line 591
    .line 592
    invoke-interface {v5, v0}, Ltp1;->e0(F)F

    .line 593
    .line 594
    .line 595
    move-result v12

    .line 596
    invoke-static/range {v5 .. v14}, Lhz1;->q0(Lhz1;JJJFII)V

    .line 597
    .line 598
    .line 599
    invoke-static/range {v22 .. v23}, Luq3;->d(J)J

    .line 600
    .line 601
    .line 602
    move-result-wide v3

    .line 603
    invoke-static/range {v24 .. v25}, Luq3;->d(J)J

    .line 604
    .line 605
    .line 606
    move-result-wide v6

    .line 607
    invoke-static {v3, v4, v6, v7}, Lxz5;->x(JJ)J

    .line 608
    .line 609
    .line 610
    move-result-wide v6

    .line 611
    const/high16 v0, 0x41200000    # 10.0f

    .line 612
    .line 613
    invoke-interface {v5, v0}, Ltp1;->e0(F)F

    .line 614
    .line 615
    .line 616
    move-result v8

    .line 617
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    int-to-long v3, v0

    .line 622
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    int-to-long v9, v0

    .line 627
    shl-long/2addr v3, v15

    .line 628
    and-long v9, v9, v17

    .line 629
    .line 630
    or-long/2addr v9, v3

    .line 631
    const/4 v11, 0x0

    .line 632
    const/16 v12, 0x78

    .line 633
    .line 634
    invoke-static/range {v5 .. v12}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x40e00000    # 7.0f

    .line 638
    .line 639
    invoke-interface {v5, v0}, Ltp1;->e0(F)F

    .line 640
    .line 641
    .line 642
    move-result v8

    .line 643
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    int-to-long v3, v0

    .line 648
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    int-to-long v6, v0

    .line 653
    shl-long/2addr v3, v15

    .line 654
    and-long v6, v6, v17

    .line 655
    .line 656
    or-long v9, v3, v6

    .line 657
    .line 658
    move-wide v6, v1

    .line 659
    invoke-static/range {v5 .. v12}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 660
    .line 661
    .line 662
    sget-wide v6, Ljt0;->c:J

    .line 663
    .line 664
    const/high16 v0, 0x40600000    # 3.5f

    .line 665
    .line 666
    invoke-interface {v5, v0}, Ltp1;->e0(F)F

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    int-to-long v0, v0

    .line 675
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    int-to-long v2, v2

    .line 680
    shl-long/2addr v0, v15

    .line 681
    and-long v2, v2, v17

    .line 682
    .line 683
    or-long v9, v0, v2

    .line 684
    .line 685
    invoke-static/range {v5 .. v12}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 686
    .line 687
    .line 688
    return-object v20

    .line 689
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
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
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method
