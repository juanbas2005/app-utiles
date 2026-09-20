.class public final Lxh6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:Lzh6;


# direct methods
.method public constructor <init>(Lzh6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh6;->a:Lzh6;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(JI)J
    .locals 21

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    iget-object v2, v2, Lxh6;->a:Lzh6;

    .line 8
    .line 9
    iput v3, v2, Lzh6;->j:I

    .line 10
    .line 11
    iget-object v4, v2, Lzh6;->b:Lxf;

    .line 12
    .line 13
    if-eqz v4, :cond_35

    .line 14
    .line 15
    invoke-virtual {v2}, Lzh6;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_35

    .line 20
    .line 21
    iget v3, v2, Lzh6;->j:I

    .line 22
    .line 23
    iget-object v2, v2, Lzh6;->m:Lay5;

    .line 24
    .line 25
    iget-object v5, v4, Lxf;->c:Lw12;

    .line 26
    .line 27
    iget-wide v6, v4, Lxf;->g:J

    .line 28
    .line 29
    invoke-static {v6, v7}, Lwu6;->e(J)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    new-instance v3, Ll35;

    .line 36
    .line 37
    invoke-direct {v3, v0, v1}, Ll35;-><init>(J)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v3}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ll35;

    .line 45
    .line 46
    iget-wide v0, v0, Ll35;->a:J

    .line 47
    .line 48
    goto/16 :goto_17

    .line 49
    .line 50
    :cond_0
    iget-boolean v6, v4, Lxf;->f:Z

    .line 51
    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    iget-object v6, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 58
    .line 59
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    invoke-virtual {v4, v7, v8}, Lxf;->g(J)F

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v6, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 69
    .line 70
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v4, v7, v8}, Lxf;->h(J)F

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v6, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 80
    .line 81
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_3

    .line 86
    .line 87
    invoke-virtual {v4, v7, v8}, Lxf;->i(J)F

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-object v6, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 91
    .line 92
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    invoke-virtual {v4, v7, v8}, Lxf;->f(J)F

    .line 99
    .line 100
    .line 101
    :cond_4
    iput-boolean v9, v4, Lxf;->f:Z

    .line 102
    .line 103
    :cond_5
    sget v6, Lwg;->a:I

    .line 104
    .line 105
    const/4 v6, 0x2

    .line 106
    if-ne v3, v6, :cond_6

    .line 107
    .line 108
    const/high16 v6, 0x40800000    # 4.0f

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_6
    const/high16 v6, 0x3f800000    # 1.0f

    .line 112
    .line 113
    :goto_0
    invoke-static {v6, v0, v1}, Ll35;->f(FJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v10

    .line 117
    const-wide v12, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long v14, v0, v12

    .line 123
    .line 124
    long-to-int v14, v14

    .line 125
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    cmpg-float v15, v15, v16

    .line 132
    .line 133
    if-nez v15, :cond_8

    .line 134
    .line 135
    move-wide/from16 v17, v12

    .line 136
    .line 137
    :cond_7
    move/from16 v12, v16

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_8
    iget-object v15, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 142
    .line 143
    invoke-static {v15}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-eqz v15, :cond_b

    .line 148
    .line 149
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    cmpg-float v15, v15, v16

    .line 154
    .line 155
    if-gez v15, :cond_b

    .line 156
    .line 157
    invoke-virtual {v4, v10, v11}, Lxf;->i(J)F

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    move-wide/from16 v17, v12

    .line 162
    .line 163
    iget-object v12, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 164
    .line 165
    invoke-static {v12}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-nez v12, :cond_9

    .line 170
    .line 171
    invoke-virtual {v5}, Lw12;->e()Landroid/widget/EdgeEffect;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v12}, Landroid/widget/EdgeEffect;->finish()V

    .line 176
    .line 177
    .line 178
    :cond_9
    and-long v12, v10, v17

    .line 179
    .line 180
    long-to-int v12, v12

    .line 181
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    cmpg-float v12, v15, v12

    .line 186
    .line 187
    if-nez v12, :cond_a

    .line 188
    .line 189
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    goto :goto_1

    .line 194
    :cond_a
    div-float v12, v15, v6

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_b
    move-wide/from16 v17, v12

    .line 198
    .line 199
    iget-object v12, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 200
    .line 201
    invoke-static {v12}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-eqz v12, :cond_7

    .line 206
    .line 207
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    cmpl-float v12, v12, v16

    .line 212
    .line 213
    if-lez v12, :cond_7

    .line 214
    .line 215
    invoke-virtual {v4, v10, v11}, Lxf;->f(J)F

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    iget-object v13, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 220
    .line 221
    invoke-static {v13}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    if-nez v13, :cond_c

    .line 226
    .line 227
    invoke-virtual {v5}, Lw12;->b()Landroid/widget/EdgeEffect;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 232
    .line 233
    .line 234
    :cond_c
    and-long v7, v10, v17

    .line 235
    .line 236
    long-to-int v7, v7

    .line 237
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    cmpg-float v7, v12, v7

    .line 242
    .line 243
    if-nez v7, :cond_d

    .line 244
    .line 245
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    goto :goto_1

    .line 250
    :cond_d
    div-float/2addr v12, v6

    .line 251
    :goto_1
    const/16 p0, 0x20

    .line 252
    .line 253
    shr-long v7, v0, p0

    .line 254
    .line 255
    long-to-int v7, v7

    .line 256
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    cmpg-float v8, v8, v16

    .line 261
    .line 262
    if-nez v8, :cond_f

    .line 263
    .line 264
    :cond_e
    move/from16 v6, v16

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_f
    iget-object v8, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 268
    .line 269
    invoke-static {v8}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    if-eqz v8, :cond_12

    .line 274
    .line 275
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    cmpg-float v8, v8, v16

    .line 280
    .line 281
    if-gez v8, :cond_12

    .line 282
    .line 283
    invoke-virtual {v4, v10, v11}, Lxf;->g(J)F

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    iget-object v13, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 288
    .line 289
    invoke-static {v13}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-nez v13, :cond_10

    .line 294
    .line 295
    invoke-virtual {v5}, Lw12;->c()Landroid/widget/EdgeEffect;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 300
    .line 301
    .line 302
    :cond_10
    shr-long v10, v10, p0

    .line 303
    .line 304
    long-to-int v10, v10

    .line 305
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    cmpg-float v10, v8, v10

    .line 310
    .line 311
    if-nez v10, :cond_11

    .line 312
    .line 313
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    goto :goto_2

    .line 318
    :cond_11
    div-float v6, v8, v6

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_12
    iget-object v8, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 322
    .line 323
    invoke-static {v8}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-eqz v8, :cond_e

    .line 328
    .line 329
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    cmpl-float v8, v8, v16

    .line 334
    .line 335
    if-lez v8, :cond_e

    .line 336
    .line 337
    invoke-virtual {v4, v10, v11}, Lxf;->h(J)F

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    iget-object v13, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 342
    .line 343
    invoke-static {v13}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    if-nez v13, :cond_13

    .line 348
    .line 349
    invoke-virtual {v5}, Lw12;->d()Landroid/widget/EdgeEffect;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 354
    .line 355
    .line 356
    :cond_13
    shr-long v10, v10, p0

    .line 357
    .line 358
    long-to-int v10, v10

    .line 359
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    cmpg-float v10, v8, v10

    .line 364
    .line 365
    if-nez v10, :cond_11

    .line 366
    .line 367
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    :goto_2
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    int-to-long v10, v6

    .line 376
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    int-to-long v12, v6

    .line 381
    shl-long v10, v10, p0

    .line 382
    .line 383
    and-long v12, v12, v17

    .line 384
    .line 385
    or-long/2addr v10, v12

    .line 386
    const-wide/16 v12, 0x0

    .line 387
    .line 388
    invoke-static {v10, v11, v12, v13}, Ll35;->b(JJ)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-nez v6, :cond_14

    .line 393
    .line 394
    invoke-virtual {v4}, Lxf;->d()V

    .line 395
    .line 396
    .line 397
    :cond_14
    invoke-static {v0, v1, v10, v11}, Ll35;->d(JJ)J

    .line 398
    .line 399
    .line 400
    move-result-wide v0

    .line 401
    new-instance v6, Ll35;

    .line 402
    .line 403
    invoke-direct {v6, v0, v1}, Ll35;-><init>(J)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v2, v6}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    check-cast v2, Ll35;

    .line 411
    .line 412
    iget-wide v12, v2, Ll35;->a:J

    .line 413
    .line 414
    move-wide/from16 v19, v10

    .line 415
    .line 416
    invoke-static {v0, v1, v12, v13}, Ll35;->d(JJ)J

    .line 417
    .line 418
    .line 419
    move-result-wide v9

    .line 420
    move v2, v7

    .line 421
    shr-long v6, v0, p0

    .line 422
    .line 423
    long-to-int v6, v6

    .line 424
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    cmpg-float v6, v6, v16

    .line 429
    .line 430
    if-nez v6, :cond_15

    .line 431
    .line 432
    and-long v6, v0, v17

    .line 433
    .line 434
    long-to-int v6, v6

    .line 435
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    cmpg-float v6, v6, v16

    .line 440
    .line 441
    if-nez v6, :cond_15

    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_15
    shr-long v6, v12, p0

    .line 445
    .line 446
    long-to-int v6, v6

    .line 447
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    cmpg-float v6, v6, v16

    .line 452
    .line 453
    if-nez v6, :cond_16

    .line 454
    .line 455
    and-long v6, v12, v17

    .line 456
    .line 457
    long-to-int v6, v6

    .line 458
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    cmpg-float v6, v6, v16

    .line 463
    .line 464
    if-nez v6, :cond_16

    .line 465
    .line 466
    goto :goto_3

    .line 467
    :cond_16
    iget-object v6, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 468
    .line 469
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-nez v6, :cond_17

    .line 474
    .line 475
    iget-object v6, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 476
    .line 477
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-nez v6, :cond_17

    .line 482
    .line 483
    iget-object v6, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 484
    .line 485
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-nez v6, :cond_17

    .line 490
    .line 491
    iget-object v6, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 492
    .line 493
    invoke-static {v6}, Lw12;->g(Landroid/widget/EdgeEffect;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-eqz v6, :cond_18

    .line 498
    .line 499
    :cond_17
    invoke-virtual {v4}, Lxf;->a()V

    .line 500
    .line 501
    .line 502
    :cond_18
    :goto_3
    const/4 v7, 0x1

    .line 503
    if-ne v3, v7, :cond_1e

    .line 504
    .line 505
    shr-long v6, v9, p0

    .line 506
    .line 507
    long-to-int v3, v6

    .line 508
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    const/high16 v7, 0x3f000000    # 0.5f

    .line 513
    .line 514
    cmpl-float v6, v6, v7

    .line 515
    .line 516
    const/high16 v8, -0x41000000    # -0.5f

    .line 517
    .line 518
    if-lez v6, :cond_19

    .line 519
    .line 520
    invoke-virtual {v4, v9, v10}, Lxf;->g(J)F

    .line 521
    .line 522
    .line 523
    :goto_4
    move/from16 p0, v7

    .line 524
    .line 525
    move/from16 p2, v8

    .line 526
    .line 527
    const/4 v3, 0x1

    .line 528
    goto :goto_5

    .line 529
    :cond_19
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    cmpg-float v3, v3, v8

    .line 534
    .line 535
    if-gez v3, :cond_1a

    .line 536
    .line 537
    invoke-virtual {v4, v9, v10}, Lxf;->h(J)F

    .line 538
    .line 539
    .line 540
    goto :goto_4

    .line 541
    :cond_1a
    move/from16 p0, v7

    .line 542
    .line 543
    move/from16 p2, v8

    .line 544
    .line 545
    const/4 v3, 0x0

    .line 546
    :goto_5
    and-long v7, v9, v17

    .line 547
    .line 548
    long-to-int v6, v7

    .line 549
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    cmpl-float v7, v7, p0

    .line 554
    .line 555
    if-lez v7, :cond_1b

    .line 556
    .line 557
    invoke-virtual {v4, v9, v10}, Lxf;->i(J)F

    .line 558
    .line 559
    .line 560
    :goto_6
    const/4 v6, 0x1

    .line 561
    goto :goto_7

    .line 562
    :cond_1b
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    cmpg-float v6, v6, p2

    .line 567
    .line 568
    if-gez v6, :cond_1c

    .line 569
    .line 570
    invoke-virtual {v4, v9, v10}, Lxf;->f(J)F

    .line 571
    .line 572
    .line 573
    goto :goto_6

    .line 574
    :cond_1c
    const/4 v6, 0x0

    .line 575
    :goto_7
    if-nez v3, :cond_1d

    .line 576
    .line 577
    if-eqz v6, :cond_1e

    .line 578
    .line 579
    :cond_1d
    const/4 v3, 0x1

    .line 580
    :goto_8
    const-wide/16 v6, 0x0

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :cond_1e
    const/4 v3, 0x0

    .line 584
    goto :goto_8

    .line 585
    :goto_9
    invoke-static {v0, v1, v6, v7}, Ll35;->b(JJ)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-nez v0, :cond_33

    .line 590
    .line 591
    iget-object v0, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 592
    .line 593
    invoke-static {v0}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_21

    .line 598
    .line 599
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    cmpg-float v0, v0, v16

    .line 604
    .line 605
    if-gez v0, :cond_21

    .line 606
    .line 607
    invoke-virtual {v5}, Lw12;->c()Landroid/widget/EdgeEffect;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    instance-of v6, v0, Lgw2;

    .line 616
    .line 617
    if-eqz v6, :cond_1f

    .line 618
    .line 619
    check-cast v0, Lgw2;

    .line 620
    .line 621
    iget v6, v0, Lgw2;->b:F

    .line 622
    .line 623
    add-float/2addr v6, v1

    .line 624
    iput v6, v0, Lgw2;->b:F

    .line 625
    .line 626
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    iget v6, v0, Lgw2;->a:F

    .line 631
    .line 632
    cmpl-float v1, v1, v6

    .line 633
    .line 634
    if-lez v1, :cond_20

    .line 635
    .line 636
    invoke-virtual {v0}, Lgw2;->onRelease()V

    .line 637
    .line 638
    .line 639
    goto :goto_a

    .line 640
    :cond_1f
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 641
    .line 642
    .line 643
    :cond_20
    :goto_a
    iget-object v0, v5, Lw12;->f:Landroid/widget/EdgeEffect;

    .line 644
    .line 645
    invoke-static {v0}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    goto :goto_b

    .line 650
    :cond_21
    const/4 v0, 0x0

    .line 651
    :goto_b
    iget-object v1, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 652
    .line 653
    invoke-static {v1}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_26

    .line 658
    .line 659
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    cmpl-float v1, v1, v16

    .line 664
    .line 665
    if-lez v1, :cond_26

    .line 666
    .line 667
    invoke-virtual {v5}, Lw12;->d()Landroid/widget/EdgeEffect;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    instance-of v6, v1, Lgw2;

    .line 676
    .line 677
    if-eqz v6, :cond_22

    .line 678
    .line 679
    check-cast v1, Lgw2;

    .line 680
    .line 681
    iget v6, v1, Lgw2;->b:F

    .line 682
    .line 683
    add-float/2addr v6, v2

    .line 684
    iput v6, v1, Lgw2;->b:F

    .line 685
    .line 686
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    iget v6, v1, Lgw2;->a:F

    .line 691
    .line 692
    cmpl-float v2, v2, v6

    .line 693
    .line 694
    if-lez v2, :cond_23

    .line 695
    .line 696
    invoke-virtual {v1}, Lgw2;->onRelease()V

    .line 697
    .line 698
    .line 699
    goto :goto_c

    .line 700
    :cond_22
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 701
    .line 702
    .line 703
    :cond_23
    :goto_c
    if-nez v0, :cond_25

    .line 704
    .line 705
    iget-object v0, v5, Lw12;->g:Landroid/widget/EdgeEffect;

    .line 706
    .line 707
    invoke-static {v0}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-eqz v0, :cond_24

    .line 712
    .line 713
    goto :goto_d

    .line 714
    :cond_24
    const/4 v0, 0x0

    .line 715
    goto :goto_e

    .line 716
    :cond_25
    :goto_d
    const/4 v0, 0x1

    .line 717
    :cond_26
    :goto_e
    iget-object v1, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 718
    .line 719
    invoke-static {v1}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    if-eqz v1, :cond_2b

    .line 724
    .line 725
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    cmpg-float v1, v1, v16

    .line 730
    .line 731
    if-gez v1, :cond_2b

    .line 732
    .line 733
    invoke-virtual {v5}, Lw12;->e()Landroid/widget/EdgeEffect;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    instance-of v6, v1, Lgw2;

    .line 742
    .line 743
    if-eqz v6, :cond_27

    .line 744
    .line 745
    check-cast v1, Lgw2;

    .line 746
    .line 747
    iget v6, v1, Lgw2;->b:F

    .line 748
    .line 749
    add-float/2addr v6, v2

    .line 750
    iput v6, v1, Lgw2;->b:F

    .line 751
    .line 752
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    iget v6, v1, Lgw2;->a:F

    .line 757
    .line 758
    cmpl-float v2, v2, v6

    .line 759
    .line 760
    if-lez v2, :cond_28

    .line 761
    .line 762
    invoke-virtual {v1}, Lgw2;->onRelease()V

    .line 763
    .line 764
    .line 765
    goto :goto_f

    .line 766
    :cond_27
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 767
    .line 768
    .line 769
    :cond_28
    :goto_f
    if-nez v0, :cond_2a

    .line 770
    .line 771
    iget-object v0, v5, Lw12;->d:Landroid/widget/EdgeEffect;

    .line 772
    .line 773
    invoke-static {v0}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    if-eqz v0, :cond_29

    .line 778
    .line 779
    goto :goto_10

    .line 780
    :cond_29
    const/4 v0, 0x0

    .line 781
    goto :goto_11

    .line 782
    :cond_2a
    :goto_10
    const/4 v0, 0x1

    .line 783
    :cond_2b
    :goto_11
    iget-object v1, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 784
    .line 785
    invoke-static {v1}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    if-eqz v1, :cond_30

    .line 790
    .line 791
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    cmpl-float v1, v1, v16

    .line 796
    .line 797
    if-lez v1, :cond_30

    .line 798
    .line 799
    invoke-virtual {v5}, Lw12;->b()Landroid/widget/EdgeEffect;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    instance-of v6, v1, Lgw2;

    .line 808
    .line 809
    if-eqz v6, :cond_2c

    .line 810
    .line 811
    check-cast v1, Lgw2;

    .line 812
    .line 813
    iget v6, v1, Lgw2;->b:F

    .line 814
    .line 815
    add-float/2addr v6, v2

    .line 816
    iput v6, v1, Lgw2;->b:F

    .line 817
    .line 818
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    iget v6, v1, Lgw2;->a:F

    .line 823
    .line 824
    cmpl-float v2, v2, v6

    .line 825
    .line 826
    if-lez v2, :cond_2d

    .line 827
    .line 828
    invoke-virtual {v1}, Lgw2;->onRelease()V

    .line 829
    .line 830
    .line 831
    goto :goto_12

    .line 832
    :cond_2c
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 833
    .line 834
    .line 835
    :cond_2d
    :goto_12
    if-nez v0, :cond_2f

    .line 836
    .line 837
    iget-object v0, v5, Lw12;->e:Landroid/widget/EdgeEffect;

    .line 838
    .line 839
    invoke-static {v0}, Lw12;->f(Landroid/widget/EdgeEffect;)Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_2e

    .line 844
    .line 845
    goto :goto_13

    .line 846
    :cond_2e
    const/4 v0, 0x0

    .line 847
    goto :goto_14

    .line 848
    :cond_2f
    :goto_13
    const/4 v0, 0x1

    .line 849
    :cond_30
    :goto_14
    if-nez v0, :cond_32

    .line 850
    .line 851
    if-eqz v3, :cond_31

    .line 852
    .line 853
    goto :goto_15

    .line 854
    :cond_31
    const/4 v9, 0x0

    .line 855
    goto :goto_16

    .line 856
    :cond_32
    :goto_15
    const/4 v9, 0x1

    .line 857
    :goto_16
    move v3, v9

    .line 858
    :cond_33
    if-eqz v3, :cond_34

    .line 859
    .line 860
    invoke-virtual {v4}, Lxf;->d()V

    .line 861
    .line 862
    .line 863
    :cond_34
    move-wide/from16 v0, v19

    .line 864
    .line 865
    invoke-static {v0, v1, v12, v13}, Ll35;->e(JJ)J

    .line 866
    .line 867
    .line 868
    move-result-wide v0

    .line 869
    :goto_17
    return-wide v0

    .line 870
    :cond_35
    iget-object v4, v2, Lzh6;->k:Leh6;

    .line 871
    .line 872
    invoke-virtual {v2, v4, v0, v1, v3}, Lzh6;->d(Leh6;JI)J

    .line 873
    .line 874
    .line 875
    move-result-wide v0

    .line 876
    return-wide v0
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
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
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
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method
