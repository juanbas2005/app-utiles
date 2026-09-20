.class public final Lkm4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ls96;Ls96;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lpj;

    .line 9
    .line 10
    iget v3, v0, Ls96;->b:F

    .line 11
    .line 12
    iget v4, v0, Ls96;->c:F

    .line 13
    .line 14
    invoke-direct {v2, v3, v4}, Lpj;-><init>(FF)V

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v0}, Lfd1;->T(Lpj;Ls96;)Lrh4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v2, Lpj;

    .line 22
    .line 23
    iget v3, v1, Ls96;->b:F

    .line 24
    .line 25
    iget v4, v1, Ls96;->c:F

    .line 26
    .line 27
    invoke-direct {v2, v3, v4}, Lpj;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1}, Lfd1;->T(Lpj;Ls96;)Lrh4;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v0, Lrh4;->y:Ljava/util/List;

    .line 35
    .line 36
    iget-object v3, v1, Lrh4;->y:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lsg3;->m()Ln74;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, 0x0

    .line 53
    move v7, v6

    .line 54
    :goto_0
    if-ge v7, v5, :cond_1

    .line 55
    .line 56
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, Ltq5;

    .line 61
    .line 62
    iget-object v8, v8, Ltq5;->b:Ldc2;

    .line 63
    .line 64
    instance-of v8, v8, Lac2;

    .line 65
    .line 66
    if-eqz v8, :cond_0

    .line 67
    .line 68
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v4, v8}, Ln74;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {v4}, Lsg3;->i(Ln74;)Ln74;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {}, Lsg3;->m()Ln74;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    move v7, v6

    .line 91
    :goto_1
    if-ge v7, v5, :cond_3

    .line 92
    .line 93
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Ltq5;

    .line 98
    .line 99
    iget-object v8, v8, Ltq5;->b:Ldc2;

    .line 100
    .line 101
    instance-of v8, v8, Lac2;

    .line 102
    .line 103
    if-eqz v8, :cond_2

    .line 104
    .line 105
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v4, v8}, Ln74;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {v4}, Lsg3;->i(Ln74;)Ln74;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v2}, Ll2;->f()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v4}, Ll2;->f()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-le v5, v7, :cond_4

    .line 128
    .line 129
    invoke-static {v4, v2}, Lrd3;->o(Ln74;Ln74;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    new-instance v5, Lyb5;

    .line 134
    .line 135
    invoke-direct {v5, v2, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    invoke-static {v2, v4}, Lrd3;->o(Ln74;Ln74;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Lyb5;

    .line 144
    .line 145
    invoke-direct {v5, v2, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    iget-object v2, v5, Lyb5;->w:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Ljava/util/List;

    .line 151
    .line 152
    iget-object v4, v5, Lyb5;->x:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v4, Ljava/util/List;

    .line 155
    .line 156
    invoke-static {}, Lsg3;->m()Ln74;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    move v8, v6

    .line 165
    :goto_3
    if-ge v8, v7, :cond_5

    .line 166
    .line 167
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eq v8, v9, :cond_5

    .line 172
    .line 173
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Ltq5;

    .line 178
    .line 179
    iget v9, v9, Ltq5;->a:F

    .line 180
    .line 181
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Ltq5;

    .line 190
    .line 191
    iget v10, v10, Ltq5;->a:F

    .line 192
    .line 193
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    new-instance v11, Lyb5;

    .line 198
    .line 199
    invoke-direct {v11, v9, v10}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v11}, Ln74;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    add-int/lit8 v8, v8, 0x1

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    invoke-static {v5}, Lsg3;->i(Ln74;)Ln74;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    new-instance v4, Lfx1;

    .line 213
    .line 214
    new-array v5, v6, [Lyb5;

    .line 215
    .line 216
    invoke-virtual {v2, v5}, Ln74;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, [Lyb5;

    .line 221
    .line 222
    array-length v5, v2

    .line 223
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, [Lyb5;

    .line 228
    .line 229
    invoke-direct {v4, v2}, Lfx1;-><init>([Lyb5;)V

    .line 230
    .line 231
    .line 232
    iget-object v2, v4, Lfx1;->a:Lvo4;

    .line 233
    .line 234
    iget-object v4, v4, Lfx1;->b:Lvo4;

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    invoke-static {v2, v4, v5}, Lar7;->I(Lvo4;Lvo4;F)F

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    iget-object v8, v1, Lrh4;->x:Ljava/util/ArrayList;

    .line 242
    .line 243
    cmpg-float v9, v5, v7

    .line 244
    .line 245
    if-gtz v9, :cond_14

    .line 246
    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    cmpg-float v11, v7, v9

    .line 250
    .line 251
    if-gtz v11, :cond_14

    .line 252
    .line 253
    const v11, 0x38d1b717    # 1.0E-4f

    .line 254
    .line 255
    .line 256
    cmpg-float v11, v7, v11

    .line 257
    .line 258
    const/4 v12, 0x1

    .line 259
    if-gez v11, :cond_6

    .line 260
    .line 261
    const/16 p2, 0x0

    .line 262
    .line 263
    goto/16 :goto_a

    .line 264
    .line 265
    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    move v13, v6

    .line 270
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-eqz v14, :cond_8

    .line 275
    .line 276
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    check-cast v14, Lqh4;

    .line 281
    .line 282
    iget v15, v14, Lqh4;->c:F

    .line 283
    .line 284
    iget v14, v14, Lqh4;->d:F

    .line 285
    .line 286
    cmpg-float v14, v7, v14

    .line 287
    .line 288
    if-gtz v14, :cond_7

    .line 289
    .line 290
    cmpg-float v14, v15, v7

    .line 291
    .line 292
    if-gtz v14, :cond_7

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_8
    const/4 v13, -0x1

    .line 299
    :goto_5
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    check-cast v11, Lqh4;

    .line 304
    .line 305
    invoke-virtual {v11, v7}, Lqh4;->a(F)Lyb5;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    iget-object v14, v11, Lyb5;->w:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v14, Lqh4;

    .line 312
    .line 313
    iget-object v11, v11, Lyb5;->x:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v11, Lqh4;

    .line 316
    .line 317
    iget-object v11, v11, Lqh4;->a:Lqc1;

    .line 318
    .line 319
    filled-new-array {v11}, [Lqc1;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    invoke-static {v11}, Lsg3;->I([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    move v5, v12

    .line 332
    :goto_6
    if-ge v5, v15, :cond_9

    .line 333
    .line 334
    add-int v16, v5, v13

    .line 335
    .line 336
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 337
    .line 338
    .line 339
    move-result v17

    .line 340
    const/16 p2, 0x0

    .line 341
    .line 342
    rem-int v10, v16, v17

    .line 343
    .line 344
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    check-cast v10, Lqh4;

    .line 349
    .line 350
    iget-object v10, v10, Lqh4;->a:Lqc1;

    .line 351
    .line 352
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    add-int/lit8 v5, v5, 0x1

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_9
    const/16 p2, 0x0

    .line 359
    .line 360
    iget-object v5, v14, Lqh4;->a:Lqc1;

    .line 361
    .line 362
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    new-instance v5, Lvo4;

    .line 366
    .line 367
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    add-int/lit8 v10, v10, 0x2

    .line 372
    .line 373
    invoke-direct {v5, v10}, Lvo4;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    add-int/lit8 v10, v10, 0x2

    .line 381
    .line 382
    move v14, v6

    .line 383
    :goto_7
    if-ge v14, v10, :cond_c

    .line 384
    .line 385
    if-nez v14, :cond_a

    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    goto :goto_8

    .line 389
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 390
    .line 391
    .line 392
    move-result v15

    .line 393
    add-int/2addr v15, v12

    .line 394
    if-ne v14, v15, :cond_b

    .line 395
    .line 396
    move v15, v9

    .line 397
    goto :goto_8

    .line 398
    :cond_b
    add-int v15, v13, v14

    .line 399
    .line 400
    sub-int/2addr v15, v12

    .line 401
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 402
    .line 403
    .line 404
    move-result v16

    .line 405
    rem-int v15, v15, v16

    .line 406
    .line 407
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v15

    .line 411
    check-cast v15, Lqh4;

    .line 412
    .line 413
    iget v15, v15, Lqh4;->d:F

    .line 414
    .line 415
    sub-float/2addr v15, v7

    .line 416
    invoke-static {v15, v9}, Lj18;->d(FF)F

    .line 417
    .line 418
    .line 419
    move-result v15

    .line 420
    :goto_8
    invoke-virtual {v5, v15}, Lvo4;->a(F)V

    .line 421
    .line 422
    .line 423
    add-int/lit8 v14, v14, 0x1

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_c
    invoke-static {}, Lsg3;->m()Ln74;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    move v13, v6

    .line 435
    :goto_9
    if-ge v13, v10, :cond_d

    .line 436
    .line 437
    new-instance v14, Ltq5;

    .line 438
    .line 439
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v15

    .line 443
    check-cast v15, Ltq5;

    .line 444
    .line 445
    iget v15, v15, Ltq5;->a:F

    .line 446
    .line 447
    sub-float/2addr v15, v7

    .line 448
    invoke-static {v15, v9}, Lj18;->d(FF)F

    .line 449
    .line 450
    .line 451
    move-result v15

    .line 452
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v16

    .line 456
    move-object/from16 v12, v16

    .line 457
    .line 458
    check-cast v12, Ltq5;

    .line 459
    .line 460
    iget-object v12, v12, Ltq5;->b:Ldc2;

    .line 461
    .line 462
    invoke-direct {v14, v15, v12}, Ltq5;-><init>(FLdc2;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v8, v14}, Ln74;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    add-int/lit8 v13, v13, 0x1

    .line 469
    .line 470
    const/4 v12, 0x1

    .line 471
    goto :goto_9

    .line 472
    :cond_d
    invoke-static {v8}, Lsg3;->i(Ln74;)Ln74;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    new-instance v8, Lrh4;

    .line 477
    .line 478
    iget-object v1, v1, Lrh4;->w:Lpj;

    .line 479
    .line 480
    invoke-direct {v8, v1, v3, v11, v5}, Lrh4;-><init>(Lpj;Ln74;Ljava/util/ArrayList;Lvo4;)V

    .line 481
    .line 482
    .line 483
    move-object v1, v8

    .line 484
    :goto_a
    new-instance v3, Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 487
    .line 488
    .line 489
    invoke-static {v6, v0}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    check-cast v5, Lqh4;

    .line 494
    .line 495
    invoke-static {v6, v1}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    check-cast v6, Lqh4;

    .line 500
    .line 501
    const/4 v8, 0x1

    .line 502
    const/4 v12, 0x1

    .line 503
    :goto_b
    if-eqz v5, :cond_12

    .line 504
    .line 505
    if-eqz v6, :cond_12

    .line 506
    .line 507
    iget-object v10, v0, Lrh4;->x:Ljava/util/ArrayList;

    .line 508
    .line 509
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    if-ne v12, v10, :cond_e

    .line 514
    .line 515
    move v10, v9

    .line 516
    goto :goto_c

    .line 517
    :cond_e
    iget v10, v5, Lqh4;->d:F

    .line 518
    .line 519
    :goto_c
    iget-object v11, v1, Lrh4;->x:Ljava/util/ArrayList;

    .line 520
    .line 521
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    if-ne v8, v11, :cond_f

    .line 526
    .line 527
    move v11, v9

    .line 528
    goto :goto_d

    .line 529
    :cond_f
    iget v11, v6, Lqh4;->d:F

    .line 530
    .line 531
    add-float/2addr v11, v7

    .line 532
    invoke-static {v11, v9}, Lj18;->d(FF)F

    .line 533
    .line 534
    .line 535
    move-result v11

    .line 536
    invoke-static {v4, v2, v11}, Lar7;->I(Lvo4;Lvo4;F)F

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    :goto_d
    invoke-static {v10, v11}, Ljava/lang/Math;->min(FF)F

    .line 541
    .line 542
    .line 543
    move-result v13

    .line 544
    const v14, 0x358637bd    # 1.0E-6f

    .line 545
    .line 546
    .line 547
    add-float/2addr v14, v13

    .line 548
    cmpl-float v10, v10, v14

    .line 549
    .line 550
    if-lez v10, :cond_10

    .line 551
    .line 552
    invoke-virtual {v5, v13}, Lqh4;->a(F)Lyb5;

    .line 553
    .line 554
    .line 555
    move-result-object v5

    .line 556
    goto :goto_e

    .line 557
    :cond_10
    add-int/lit8 v10, v12, 0x1

    .line 558
    .line 559
    invoke-static {v12, v0}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v12

    .line 563
    new-instance v15, Lyb5;

    .line 564
    .line 565
    invoke-direct {v15, v5, v12}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    move v12, v10

    .line 569
    move-object v5, v15

    .line 570
    :goto_e
    iget-object v10, v5, Lyb5;->w:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v10, Lqh4;

    .line 573
    .line 574
    iget-object v5, v5, Lyb5;->x:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v5, Lqh4;

    .line 577
    .line 578
    cmpl-float v11, v11, v14

    .line 579
    .line 580
    if-lez v11, :cond_11

    .line 581
    .line 582
    invoke-static {v2, v4, v13}, Lar7;->I(Lvo4;Lvo4;F)F

    .line 583
    .line 584
    .line 585
    move-result v11

    .line 586
    sub-float/2addr v11, v7

    .line 587
    invoke-static {v11, v9}, Lj18;->d(FF)F

    .line 588
    .line 589
    .line 590
    move-result v11

    .line 591
    invoke-virtual {v6, v11}, Lqh4;->a(F)Lyb5;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    goto :goto_f

    .line 596
    :cond_11
    add-int/lit8 v11, v8, 0x1

    .line 597
    .line 598
    invoke-static {v8, v1}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    new-instance v13, Lyb5;

    .line 603
    .line 604
    invoke-direct {v13, v6, v8}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    move v8, v11

    .line 608
    move-object v6, v13

    .line 609
    :goto_f
    iget-object v11, v6, Lyb5;->w:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v11, Lqh4;

    .line 612
    .line 613
    iget-object v6, v6, Lyb5;->x:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v6, Lqh4;

    .line 616
    .line 617
    iget-object v10, v10, Lqh4;->a:Lqc1;

    .line 618
    .line 619
    iget-object v11, v11, Lqh4;->a:Lqc1;

    .line 620
    .line 621
    new-instance v13, Lyb5;

    .line 622
    .line 623
    invoke-direct {v13, v10, v11}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_12
    if-nez v5, :cond_13

    .line 631
    .line 632
    if-nez v6, :cond_13

    .line 633
    .line 634
    move-object/from16 v0, p0

    .line 635
    .line 636
    iput-object v3, v0, Lkm4;->a:Ljava/util/ArrayList;

    .line 637
    .line 638
    return-void

    .line 639
    :cond_13
    const-string v0, "Expected both Polygon\'s Cubic to be fully matched"

    .line 640
    .line 641
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    throw p2

    .line 645
    :cond_14
    const/16 p2, 0x0

    .line 646
    .line 647
    const-string v0, "Cutting point is expected to be between 0 and 1"

    .line 648
    .line 649
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw p2
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
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
