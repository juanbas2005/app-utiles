.class public final Lxe5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:C

.field public final b:[F


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-char p1, p0, Lxe5;->a:C

    .line 20
    iput-object p2, p0, Lxe5;->b:[F

    return-void
.end method

.method public constructor <init>(Lxe5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-char v0, p1, Lxe5;->a:C

    .line 5
    .line 6
    iput-char v0, p0, Lxe5;->a:C

    .line 7
    .line 8
    iget-object p1, p1, Lxe5;->b:[F

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    invoke-static {p1, v0}, Ll55;->h([FI)[F

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lxe5;->b:[F

    .line 16
    .line 17
    return-void
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

.method public static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 54

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p3

    .line 4
    .line 5
    move/from16 v0, p5

    .line 6
    .line 7
    move/from16 v2, p6

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    float-to-double v4, v7

    .line 12
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v8

    .line 20
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v10

    .line 24
    float-to-double v12, v1

    .line 25
    mul-double v14, v12, v8

    .line 26
    .line 27
    move/from16 v6, p2

    .line 28
    .line 29
    move-wide/from16 v16, v4

    .line 30
    .line 31
    float-to-double v4, v6

    .line 32
    mul-double v18, v4, v10

    .line 33
    .line 34
    add-double v18, v18, v14

    .line 35
    .line 36
    float-to-double v14, v0

    .line 37
    div-double v18, v18, v14

    .line 38
    .line 39
    neg-float v0, v1

    .line 40
    float-to-double v0, v0

    .line 41
    mul-double/2addr v0, v10

    .line 42
    mul-double v20, v4, v8

    .line 43
    .line 44
    add-double v20, v20, v0

    .line 45
    .line 46
    float-to-double v0, v2

    .line 47
    div-double v20, v20, v0

    .line 48
    .line 49
    move-wide/from16 v22, v0

    .line 50
    .line 51
    float-to-double v0, v3

    .line 52
    mul-double/2addr v0, v8

    .line 53
    move-wide/from16 v24, v0

    .line 54
    .line 55
    move/from16 v0, p4

    .line 56
    .line 57
    float-to-double v1, v0

    .line 58
    mul-double v26, v1, v10

    .line 59
    .line 60
    add-double v26, v26, v24

    .line 61
    .line 62
    div-double v26, v26, v14

    .line 63
    .line 64
    neg-float v0, v3

    .line 65
    move-wide/from16 v24, v1

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    mul-double/2addr v0, v10

    .line 69
    mul-double v24, v24, v8

    .line 70
    .line 71
    add-double v24, v24, v0

    .line 72
    .line 73
    div-double v24, v24, v22

    .line 74
    .line 75
    sub-double v0, v18, v26

    .line 76
    .line 77
    sub-double v28, v20, v24

    .line 78
    .line 79
    add-double v30, v18, v26

    .line 80
    .line 81
    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    .line 82
    .line 83
    div-double v30, v30, v32

    .line 84
    .line 85
    add-double v34, v20, v24

    .line 86
    .line 87
    div-double v34, v34, v32

    .line 88
    .line 89
    mul-double v36, v0, v0

    .line 90
    .line 91
    mul-double v38, v28, v28

    .line 92
    .line 93
    move-wide/from16 v40, v0

    .line 94
    .line 95
    add-double v0, v38, v36

    .line 96
    .line 97
    const-wide/16 v36, 0x0

    .line 98
    .line 99
    cmpl-double v2, v0, v36

    .line 100
    .line 101
    move/from16 v38, v2

    .line 102
    .line 103
    const-string v2, "PathParser"

    .line 104
    .line 105
    if-nez v38, :cond_0

    .line 106
    .line 107
    const-string v0, " Points are coincident"

    .line 108
    .line 109
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_0
    const-wide/high16 v38, 0x3ff0000000000000L    # 1.0

    .line 114
    .line 115
    div-double v42, v38, v0

    .line 116
    .line 117
    const-wide/high16 v44, 0x3fd0000000000000L    # 0.25

    .line 118
    .line 119
    sub-double v42, v42, v44

    .line 120
    .line 121
    cmpg-double v44, v42, v36

    .line 122
    .line 123
    if-gez v44, :cond_1

    .line 124
    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v5, "Points are too far apart "

    .line 128
    .line 129
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    const-wide v4, 0x3ffffff583a53b8eL    # 1.99999

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    div-double/2addr v0, v4

    .line 152
    double-to-float v0, v0

    .line 153
    mul-float v5, p5, v0

    .line 154
    .line 155
    mul-float v0, v0, p6

    .line 156
    .line 157
    move/from16 v1, p1

    .line 158
    .line 159
    move/from16 v4, p4

    .line 160
    .line 161
    move/from16 v8, p8

    .line 162
    .line 163
    move/from16 v9, p9

    .line 164
    .line 165
    move v2, v6

    .line 166
    move v6, v0

    .line 167
    move-object/from16 v0, p0

    .line 168
    .line 169
    invoke-static/range {v0 .. v9}, Lxe5;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_1
    move/from16 v0, p9

    .line 174
    .line 175
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->sqrt(D)D

    .line 176
    .line 177
    .line 178
    move-result-wide v1

    .line 179
    mul-double v6, v1, v40

    .line 180
    .line 181
    mul-double v1, v1, v28

    .line 182
    .line 183
    move/from16 v3, p8

    .line 184
    .line 185
    if-ne v3, v0, :cond_2

    .line 186
    .line 187
    sub-double v30, v30, v1

    .line 188
    .line 189
    add-double v34, v34, v6

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_2
    add-double v30, v30, v1

    .line 193
    .line 194
    sub-double v34, v34, v6

    .line 195
    .line 196
    :goto_0
    sub-double v1, v20, v34

    .line 197
    .line 198
    sub-double v6, v18, v30

    .line 199
    .line 200
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    sub-double v6, v24, v34

    .line 205
    .line 206
    move-wide/from16 p1, v1

    .line 207
    .line 208
    sub-double v1, v26, v30

    .line 209
    .line 210
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 211
    .line 212
    .line 213
    move-result-wide v1

    .line 214
    sub-double v1, v1, p1

    .line 215
    .line 216
    cmpl-double v3, v1, v36

    .line 217
    .line 218
    if-ltz v3, :cond_3

    .line 219
    .line 220
    const/4 v7, 0x1

    .line 221
    goto :goto_1

    .line 222
    :cond_3
    const/4 v7, 0x0

    .line 223
    :goto_1
    if-eq v0, v7, :cond_5

    .line 224
    .line 225
    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    if-lez v3, :cond_4

    .line 231
    .line 232
    sub-double v1, v1, v18

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_4
    add-double v1, v1, v18

    .line 236
    .line 237
    :cond_5
    :goto_2
    mul-double v30, v30, v14

    .line 238
    .line 239
    mul-double v34, v34, v22

    .line 240
    .line 241
    mul-double v18, v30, v8

    .line 242
    .line 243
    mul-double v20, v34, v10

    .line 244
    .line 245
    sub-double v18, v18, v20

    .line 246
    .line 247
    mul-double v30, v30, v10

    .line 248
    .line 249
    mul-double v34, v34, v8

    .line 250
    .line 251
    add-double v34, v34, v30

    .line 252
    .line 253
    const-wide/high16 v7, 0x4010000000000000L    # 4.0

    .line 254
    .line 255
    mul-double v9, v1, v7

    .line 256
    .line 257
    const-wide v20, 0x400921fb54442d18L    # Math.PI

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    div-double v9, v9, v20

    .line 263
    .line 264
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 265
    .line 266
    .line 267
    move-result-wide v9

    .line 268
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 269
    .line 270
    .line 271
    move-result-wide v9

    .line 272
    double-to-int v0, v9

    .line 273
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    .line 274
    .line 275
    .line 276
    move-result-wide v9

    .line 277
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    .line 278
    .line 279
    .line 280
    move-result-wide v16

    .line 281
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    .line 282
    .line 283
    .line 284
    move-result-wide v20

    .line 285
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    .line 286
    .line 287
    .line 288
    move-result-wide v24

    .line 289
    move-wide/from16 p8, v7

    .line 290
    .line 291
    neg-double v6, v14

    .line 292
    mul-double v26, v6, v9

    .line 293
    .line 294
    mul-double v28, v26, v24

    .line 295
    .line 296
    mul-double v30, v22, v16

    .line 297
    .line 298
    mul-double v36, v30, v20

    .line 299
    .line 300
    sub-double v28, v28, v36

    .line 301
    .line 302
    mul-double v6, v6, v16

    .line 303
    .line 304
    mul-double v24, v24, v6

    .line 305
    .line 306
    mul-double v22, v22, v9

    .line 307
    .line 308
    mul-double v20, v20, v22

    .line 309
    .line 310
    add-double v20, v20, v24

    .line 311
    .line 312
    move-wide/from16 p4, v1

    .line 313
    .line 314
    int-to-double v1, v0

    .line 315
    div-double v1, p4, v1

    .line 316
    .line 317
    move-wide/from16 v24, v20

    .line 318
    .line 319
    move-wide/from16 v20, v12

    .line 320
    .line 321
    move-wide v11, v4

    .line 322
    const/4 v5, 0x0

    .line 323
    move-wide/from16 v3, p1

    .line 324
    .line 325
    :goto_3
    if-ge v5, v0, :cond_6

    .line 326
    .line 327
    add-double v36, v3, v1

    .line 328
    .line 329
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->sin(D)D

    .line 330
    .line 331
    .line 332
    move-result-wide v40

    .line 333
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->cos(D)D

    .line 334
    .line 335
    .line 336
    move-result-wide v42

    .line 337
    mul-double v44, v14, v9

    .line 338
    .line 339
    mul-double v44, v44, v42

    .line 340
    .line 341
    add-double v44, v44, v18

    .line 342
    .line 343
    mul-double v46, v30, v40

    .line 344
    .line 345
    move v8, v0

    .line 346
    move-wide/from16 v48, v1

    .line 347
    .line 348
    sub-double v0, v44, v46

    .line 349
    .line 350
    mul-double v44, v14, v16

    .line 351
    .line 352
    mul-double v44, v44, v42

    .line 353
    .line 354
    add-double v44, v44, v34

    .line 355
    .line 356
    mul-double v46, v22, v40

    .line 357
    .line 358
    move-wide/from16 p1, v3

    .line 359
    .line 360
    add-double v2, v46, v44

    .line 361
    .line 362
    mul-double v44, v26, v40

    .line 363
    .line 364
    mul-double v46, v30, v42

    .line 365
    .line 366
    sub-double v44, v44, v46

    .line 367
    .line 368
    mul-double v40, v40, v6

    .line 369
    .line 370
    mul-double v42, v42, v22

    .line 371
    .line 372
    add-double v40, v42, v40

    .line 373
    .line 374
    sub-double v42, v36, p1

    .line 375
    .line 376
    div-double v46, v42, v32

    .line 377
    .line 378
    invoke-static/range {v46 .. v47}, Ljava/lang/Math;->tan(D)D

    .line 379
    .line 380
    .line 381
    move-result-wide v46

    .line 382
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->sin(D)D

    .line 383
    .line 384
    .line 385
    move-result-wide v42

    .line 386
    const-wide/high16 v50, 0x4008000000000000L    # 3.0

    .line 387
    .line 388
    mul-double v52, v46, v50

    .line 389
    .line 390
    mul-double v52, v52, v46

    .line 391
    .line 392
    add-double v52, v52, p8

    .line 393
    .line 394
    invoke-static/range {v52 .. v53}, Ljava/lang/Math;->sqrt(D)D

    .line 395
    .line 396
    .line 397
    move-result-wide v46

    .line 398
    sub-double v46, v46, v38

    .line 399
    .line 400
    mul-double v46, v46, v42

    .line 401
    .line 402
    div-double v46, v46, v50

    .line 403
    .line 404
    mul-double v28, v28, v46

    .line 405
    .line 406
    move v13, v5

    .line 407
    add-double v4, v28, v20

    .line 408
    .line 409
    mul-double v24, v24, v46

    .line 410
    .line 411
    add-double v11, v24, v11

    .line 412
    .line 413
    mul-double v20, v46, v44

    .line 414
    .line 415
    move-wide/from16 v24, v6

    .line 416
    .line 417
    sub-double v6, v0, v20

    .line 418
    .line 419
    mul-double v46, v46, v40

    .line 420
    .line 421
    move-wide/from16 v20, v9

    .line 422
    .line 423
    move v10, v8

    .line 424
    sub-double v8, v2, v46

    .line 425
    .line 426
    move/from16 v28, v10

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    move/from16 v29, v13

    .line 430
    .line 431
    move-object/from16 v13, p0

    .line 432
    .line 433
    invoke-virtual {v13, v10, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 434
    .line 435
    .line 436
    double-to-float v4, v4

    .line 437
    double-to-float v5, v11

    .line 438
    double-to-float v6, v6

    .line 439
    double-to-float v7, v8

    .line 440
    double-to-float v8, v0

    .line 441
    double-to-float v9, v2

    .line 442
    move/from16 p2, v4

    .line 443
    .line 444
    move/from16 p3, v5

    .line 445
    .line 446
    move/from16 p4, v6

    .line 447
    .line 448
    move/from16 p5, v7

    .line 449
    .line 450
    move/from16 p6, v8

    .line 451
    .line 452
    move/from16 p7, v9

    .line 453
    .line 454
    move-object/from16 p1, v13

    .line 455
    .line 456
    invoke-virtual/range {p1 .. p7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 457
    .line 458
    .line 459
    add-int/lit8 v5, v29, 0x1

    .line 460
    .line 461
    move-wide v11, v2

    .line 462
    move-wide/from16 v9, v20

    .line 463
    .line 464
    move-wide/from16 v6, v24

    .line 465
    .line 466
    move-wide/from16 v3, v36

    .line 467
    .line 468
    move-wide/from16 v24, v40

    .line 469
    .line 470
    move-wide/from16 v20, v0

    .line 471
    .line 472
    move/from16 v0, v28

    .line 473
    .line 474
    move-wide/from16 v28, v44

    .line 475
    .line 476
    move-wide/from16 v1, v48

    .line 477
    .line 478
    goto/16 :goto_3

    .line 479
    .line 480
    :cond_6
    return-void
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
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
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
.end method

.method public static b([Lxe5;Landroid/graphics/Path;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v11, 0x6

    .line 6
    new-array v12, v11, [F

    .line 7
    .line 8
    array-length v13, v0

    .line 9
    const/4 v15, 0x0

    .line 10
    move v8, v15

    .line 11
    const/16 v2, 0x6d

    .line 12
    .line 13
    :goto_0
    if-ge v8, v13, :cond_21

    .line 14
    .line 15
    aget-object v9, v0, v8

    .line 16
    .line 17
    iget-char v10, v9, Lxe5;->a:C

    .line 18
    .line 19
    iget-object v3, v9, Lxe5;->b:[F

    .line 20
    .line 21
    aget v4, v12, v15

    .line 22
    .line 23
    const/16 v16, 0x1

    .line 24
    .line 25
    aget v5, v12, v16

    .line 26
    .line 27
    const/16 v17, 0x2

    .line 28
    .line 29
    aget v6, v12, v17

    .line 30
    .line 31
    const/16 v18, 0x3

    .line 32
    .line 33
    aget v7, v12, v18

    .line 34
    .line 35
    const/16 v19, 0x4

    .line 36
    .line 37
    aget v11, v12, v19

    .line 38
    .line 39
    const/16 v20, 0x5

    .line 40
    .line 41
    move/from16 v21, v15

    .line 42
    .line 43
    aget v15, v12, v20

    .line 44
    .line 45
    sparse-switch v10, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    :goto_1
    move/from16 v22, v17

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :sswitch_0
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v11, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 55
    .line 56
    .line 57
    move v4, v11

    .line 58
    move v6, v4

    .line 59
    move v5, v15

    .line 60
    move v7, v5

    .line 61
    goto :goto_1

    .line 62
    :sswitch_1
    move/from16 v22, v19

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :sswitch_2
    move/from16 v22, v16

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_3
    const/16 v22, 0x6

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :sswitch_4
    const/16 v22, 0x7

    .line 72
    .line 73
    :goto_2
    move/from16 v23, v11

    .line 74
    .line 75
    move/from16 v24, v15

    .line 76
    .line 77
    move v11, v4

    .line 78
    move v15, v5

    .line 79
    move/from16 v4, v21

    .line 80
    .line 81
    :goto_3
    array-length v5, v3

    .line 82
    if-ge v4, v5, :cond_20

    .line 83
    .line 84
    const/16 v5, 0x41

    .line 85
    .line 86
    if-eq v10, v5, :cond_1d

    .line 87
    .line 88
    const/16 v5, 0x43

    .line 89
    .line 90
    if-eq v10, v5, :cond_1c

    .line 91
    .line 92
    const/16 v14, 0x48

    .line 93
    .line 94
    if-eq v10, v14, :cond_1b

    .line 95
    .line 96
    const/16 v14, 0x51

    .line 97
    .line 98
    if-eq v10, v14, :cond_1a

    .line 99
    .line 100
    const/16 v5, 0x56

    .line 101
    .line 102
    if-eq v10, v5, :cond_19

    .line 103
    .line 104
    const/16 v5, 0x61

    .line 105
    .line 106
    if-eq v10, v5, :cond_16

    .line 107
    .line 108
    const/16 v5, 0x63

    .line 109
    .line 110
    if-eq v10, v5, :cond_15

    .line 111
    .line 112
    const/16 v5, 0x68

    .line 113
    .line 114
    if-eq v10, v5, :cond_14

    .line 115
    .line 116
    const/16 v5, 0x71

    .line 117
    .line 118
    if-eq v10, v5, :cond_13

    .line 119
    .line 120
    const/16 v14, 0x76

    .line 121
    .line 122
    if-eq v10, v14, :cond_12

    .line 123
    .line 124
    const/16 v14, 0x4c

    .line 125
    .line 126
    if-eq v10, v14, :cond_11

    .line 127
    .line 128
    const/16 v14, 0x4d

    .line 129
    .line 130
    if-eq v10, v14, :cond_f

    .line 131
    .line 132
    const/16 v14, 0x73

    .line 133
    .line 134
    const/16 v5, 0x53

    .line 135
    .line 136
    const/high16 v31, 0x40000000    # 2.0f

    .line 137
    .line 138
    if-eq v10, v5, :cond_c

    .line 139
    .line 140
    const/16 v5, 0x54

    .line 141
    .line 142
    if-eq v10, v5, :cond_9

    .line 143
    .line 144
    const/16 v5, 0x6c

    .line 145
    .line 146
    if-eq v10, v5, :cond_8

    .line 147
    .line 148
    const/16 v5, 0x6d

    .line 149
    .line 150
    if-eq v10, v5, :cond_6

    .line 151
    .line 152
    if-eq v10, v14, :cond_3

    .line 153
    .line 154
    const/16 v5, 0x74

    .line 155
    .line 156
    if-eq v10, v5, :cond_0

    .line 157
    .line 158
    move-object/from16 v25, v3

    .line 159
    .line 160
    move/from16 v30, v4

    .line 161
    .line 162
    move-object v0, v9

    .line 163
    move v2, v11

    .line 164
    :goto_4
    move v3, v15

    .line 165
    const/16 v32, 0x6d

    .line 166
    .line 167
    :goto_5
    move v15, v8

    .line 168
    :goto_6
    move v11, v10

    .line 169
    goto/16 :goto_19

    .line 170
    .line 171
    :cond_0
    const/16 v14, 0x71

    .line 172
    .line 173
    if-eq v2, v14, :cond_2

    .line 174
    .line 175
    if-eq v2, v5, :cond_2

    .line 176
    .line 177
    const/16 v5, 0x51

    .line 178
    .line 179
    if-eq v2, v5, :cond_2

    .line 180
    .line 181
    const/16 v5, 0x54

    .line 182
    .line 183
    if-ne v2, v5, :cond_1

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_1
    const/4 v2, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    goto :goto_8

    .line 189
    :cond_2
    :goto_7
    sub-float v14, v11, v6

    .line 190
    .line 191
    sub-float v2, v15, v7

    .line 192
    .line 193
    :goto_8
    aget v5, v3, v4

    .line 194
    .line 195
    add-int/lit8 v6, v4, 0x1

    .line 196
    .line 197
    aget v7, v3, v6

    .line 198
    .line 199
    invoke-virtual {v1, v14, v2, v5, v7}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 200
    .line 201
    .line 202
    add-float/2addr v14, v11

    .line 203
    add-float/2addr v2, v15

    .line 204
    aget v5, v3, v4

    .line 205
    .line 206
    add-float/2addr v11, v5

    .line 207
    aget v5, v3, v6

    .line 208
    .line 209
    add-float/2addr v15, v5

    .line 210
    move v7, v2

    .line 211
    move-object/from16 v25, v3

    .line 212
    .line 213
    move/from16 v30, v4

    .line 214
    .line 215
    move-object v0, v9

    .line 216
    move v2, v11

    .line 217
    move v6, v14

    .line 218
    goto :goto_4

    .line 219
    :cond_3
    const/16 v5, 0x63

    .line 220
    .line 221
    if-eq v2, v5, :cond_5

    .line 222
    .line 223
    if-eq v2, v14, :cond_5

    .line 224
    .line 225
    const/16 v5, 0x43

    .line 226
    .line 227
    if-eq v2, v5, :cond_5

    .line 228
    .line 229
    const/16 v5, 0x53

    .line 230
    .line 231
    if-ne v2, v5, :cond_4

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_4
    const/4 v2, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    :goto_9
    move v5, v4

    .line 237
    goto :goto_b

    .line 238
    :cond_5
    :goto_a
    sub-float v14, v11, v6

    .line 239
    .line 240
    sub-float v2, v15, v7

    .line 241
    .line 242
    move v5, v14

    .line 243
    move v14, v2

    .line 244
    move v2, v5

    .line 245
    goto :goto_9

    .line 246
    :goto_b
    aget v4, v3, v5

    .line 247
    .line 248
    add-int/lit8 v26, v5, 0x1

    .line 249
    .line 250
    move v6, v5

    .line 251
    aget v5, v3, v26

    .line 252
    .line 253
    add-int/lit8 v27, v6, 0x2

    .line 254
    .line 255
    move v7, v6

    .line 256
    aget v6, v3, v27

    .line 257
    .line 258
    add-int/lit8 v28, v7, 0x3

    .line 259
    .line 260
    move/from16 v29, v7

    .line 261
    .line 262
    aget v7, v3, v28

    .line 263
    .line 264
    move-object/from16 v25, v3

    .line 265
    .line 266
    move v3, v14

    .line 267
    move/from16 v30, v29

    .line 268
    .line 269
    const/16 v32, 0x6d

    .line 270
    .line 271
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 272
    .line 273
    .line 274
    aget v2, v25, v30

    .line 275
    .line 276
    add-float/2addr v2, v11

    .line 277
    aget v3, v25, v26

    .line 278
    .line 279
    add-float/2addr v3, v15

    .line 280
    aget v4, v25, v27

    .line 281
    .line 282
    add-float/2addr v11, v4

    .line 283
    aget v4, v25, v28

    .line 284
    .line 285
    :goto_c
    add-float/2addr v15, v4

    .line 286
    move v6, v2

    .line 287
    move v7, v3

    .line 288
    :goto_d
    move-object v0, v9

    .line 289
    move v2, v11

    .line 290
    move v3, v15

    .line 291
    goto :goto_5

    .line 292
    :cond_6
    move-object/from16 v25, v3

    .line 293
    .line 294
    move/from16 v30, v4

    .line 295
    .line 296
    move/from16 v32, v5

    .line 297
    .line 298
    aget v2, v25, v30

    .line 299
    .line 300
    add-float/2addr v11, v2

    .line 301
    add-int/lit8 v4, v30, 0x1

    .line 302
    .line 303
    aget v3, v25, v4

    .line 304
    .line 305
    add-float/2addr v15, v3

    .line 306
    if-lez v30, :cond_7

    .line 307
    .line 308
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 309
    .line 310
    .line 311
    goto :goto_d

    .line 312
    :cond_7
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 313
    .line 314
    .line 315
    move-object v0, v9

    .line 316
    move v2, v11

    .line 317
    move/from16 v23, v2

    .line 318
    .line 319
    move v3, v15

    .line 320
    move/from16 v24, v3

    .line 321
    .line 322
    goto/16 :goto_5

    .line 323
    .line 324
    :cond_8
    move-object/from16 v25, v3

    .line 325
    .line 326
    move/from16 v30, v4

    .line 327
    .line 328
    const/16 v32, 0x6d

    .line 329
    .line 330
    aget v2, v25, v30

    .line 331
    .line 332
    add-int/lit8 v4, v30, 0x1

    .line 333
    .line 334
    aget v3, v25, v4

    .line 335
    .line 336
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 337
    .line 338
    .line 339
    aget v2, v25, v30

    .line 340
    .line 341
    add-float/2addr v11, v2

    .line 342
    aget v2, v25, v4

    .line 343
    .line 344
    :goto_e
    add-float/2addr v15, v2

    .line 345
    goto :goto_d

    .line 346
    :cond_9
    move-object/from16 v25, v3

    .line 347
    .line 348
    move/from16 v30, v4

    .line 349
    .line 350
    const/16 v14, 0x71

    .line 351
    .line 352
    const/16 v32, 0x6d

    .line 353
    .line 354
    if-eq v2, v14, :cond_a

    .line 355
    .line 356
    const/16 v5, 0x74

    .line 357
    .line 358
    if-eq v2, v5, :cond_a

    .line 359
    .line 360
    const/16 v5, 0x51

    .line 361
    .line 362
    if-eq v2, v5, :cond_a

    .line 363
    .line 364
    const/16 v5, 0x54

    .line 365
    .line 366
    if-ne v2, v5, :cond_b

    .line 367
    .line 368
    :cond_a
    mul-float v11, v11, v31

    .line 369
    .line 370
    sub-float/2addr v11, v6

    .line 371
    mul-float v15, v15, v31

    .line 372
    .line 373
    sub-float/2addr v15, v7

    .line 374
    :cond_b
    aget v2, v25, v30

    .line 375
    .line 376
    add-int/lit8 v4, v30, 0x1

    .line 377
    .line 378
    aget v3, v25, v4

    .line 379
    .line 380
    invoke-virtual {v1, v11, v15, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 381
    .line 382
    .line 383
    aget v2, v25, v30

    .line 384
    .line 385
    aget v3, v25, v4

    .line 386
    .line 387
    move-object v0, v9

    .line 388
    move v6, v11

    .line 389
    move v7, v15

    .line 390
    goto/16 :goto_5

    .line 391
    .line 392
    :cond_c
    move-object/from16 v25, v3

    .line 393
    .line 394
    move/from16 v30, v4

    .line 395
    .line 396
    const/16 v5, 0x63

    .line 397
    .line 398
    const/16 v32, 0x6d

    .line 399
    .line 400
    if-eq v2, v5, :cond_e

    .line 401
    .line 402
    if-eq v2, v14, :cond_e

    .line 403
    .line 404
    const/16 v5, 0x43

    .line 405
    .line 406
    if-eq v2, v5, :cond_e

    .line 407
    .line 408
    const/16 v5, 0x53

    .line 409
    .line 410
    if-ne v2, v5, :cond_d

    .line 411
    .line 412
    goto :goto_10

    .line 413
    :cond_d
    :goto_f
    move v2, v11

    .line 414
    move v3, v15

    .line 415
    goto :goto_11

    .line 416
    :cond_e
    :goto_10
    mul-float v11, v11, v31

    .line 417
    .line 418
    sub-float/2addr v11, v6

    .line 419
    mul-float v15, v15, v31

    .line 420
    .line 421
    sub-float/2addr v15, v7

    .line 422
    goto :goto_f

    .line 423
    :goto_11
    aget v4, v25, v30

    .line 424
    .line 425
    add-int/lit8 v11, v30, 0x1

    .line 426
    .line 427
    aget v5, v25, v11

    .line 428
    .line 429
    add-int/lit8 v14, v30, 0x2

    .line 430
    .line 431
    aget v6, v25, v14

    .line 432
    .line 433
    add-int/lit8 v15, v30, 0x3

    .line 434
    .line 435
    aget v7, v25, v15

    .line 436
    .line 437
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 438
    .line 439
    .line 440
    aget v2, v25, v30

    .line 441
    .line 442
    aget v3, v25, v11

    .line 443
    .line 444
    aget v4, v25, v14

    .line 445
    .line 446
    aget v5, v25, v15

    .line 447
    .line 448
    move v6, v2

    .line 449
    move v7, v3

    .line 450
    move v2, v4

    .line 451
    move v3, v5

    .line 452
    :goto_12
    move v15, v8

    .line 453
    move-object v0, v9

    .line 454
    goto/16 :goto_6

    .line 455
    .line 456
    :cond_f
    move-object/from16 v25, v3

    .line 457
    .line 458
    move/from16 v30, v4

    .line 459
    .line 460
    const/16 v32, 0x6d

    .line 461
    .line 462
    aget v2, v25, v30

    .line 463
    .line 464
    add-int/lit8 v4, v30, 0x1

    .line 465
    .line 466
    aget v3, v25, v4

    .line 467
    .line 468
    if-lez v30, :cond_10

    .line 469
    .line 470
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 471
    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_10
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 475
    .line 476
    .line 477
    move/from16 v23, v2

    .line 478
    .line 479
    move/from16 v24, v3

    .line 480
    .line 481
    goto :goto_12

    .line 482
    :cond_11
    move-object/from16 v25, v3

    .line 483
    .line 484
    move/from16 v30, v4

    .line 485
    .line 486
    const/16 v32, 0x6d

    .line 487
    .line 488
    aget v2, v25, v30

    .line 489
    .line 490
    add-int/lit8 v4, v30, 0x1

    .line 491
    .line 492
    aget v3, v25, v4

    .line 493
    .line 494
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 495
    .line 496
    .line 497
    aget v2, v25, v30

    .line 498
    .line 499
    aget v3, v25, v4

    .line 500
    .line 501
    goto :goto_12

    .line 502
    :cond_12
    move-object/from16 v25, v3

    .line 503
    .line 504
    move/from16 v30, v4

    .line 505
    .line 506
    const/16 v32, 0x6d

    .line 507
    .line 508
    aget v2, v25, v30

    .line 509
    .line 510
    const/4 v3, 0x0

    .line 511
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 512
    .line 513
    .line 514
    aget v2, v25, v30

    .line 515
    .line 516
    goto/16 :goto_e

    .line 517
    .line 518
    :cond_13
    move-object/from16 v25, v3

    .line 519
    .line 520
    move/from16 v30, v4

    .line 521
    .line 522
    const/16 v32, 0x6d

    .line 523
    .line 524
    aget v2, v25, v30

    .line 525
    .line 526
    add-int/lit8 v4, v30, 0x1

    .line 527
    .line 528
    aget v3, v25, v4

    .line 529
    .line 530
    add-int/lit8 v5, v30, 0x2

    .line 531
    .line 532
    aget v6, v25, v5

    .line 533
    .line 534
    add-int/lit8 v7, v30, 0x3

    .line 535
    .line 536
    aget v14, v25, v7

    .line 537
    .line 538
    invoke-virtual {v1, v2, v3, v6, v14}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 539
    .line 540
    .line 541
    aget v2, v25, v30

    .line 542
    .line 543
    add-float/2addr v2, v11

    .line 544
    aget v3, v25, v4

    .line 545
    .line 546
    add-float/2addr v3, v15

    .line 547
    aget v4, v25, v5

    .line 548
    .line 549
    add-float/2addr v11, v4

    .line 550
    aget v4, v25, v7

    .line 551
    .line 552
    goto/16 :goto_c

    .line 553
    .line 554
    :cond_14
    move-object/from16 v25, v3

    .line 555
    .line 556
    move/from16 v30, v4

    .line 557
    .line 558
    const/16 v32, 0x6d

    .line 559
    .line 560
    aget v2, v25, v30

    .line 561
    .line 562
    const/4 v3, 0x0

    .line 563
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 564
    .line 565
    .line 566
    aget v2, v25, v30

    .line 567
    .line 568
    add-float/2addr v11, v2

    .line 569
    goto/16 :goto_d

    .line 570
    .line 571
    :cond_15
    move-object/from16 v25, v3

    .line 572
    .line 573
    move/from16 v30, v4

    .line 574
    .line 575
    const/16 v32, 0x6d

    .line 576
    .line 577
    aget v2, v25, v30

    .line 578
    .line 579
    add-int/lit8 v4, v30, 0x1

    .line 580
    .line 581
    aget v3, v25, v4

    .line 582
    .line 583
    add-int/lit8 v14, v30, 0x2

    .line 584
    .line 585
    aget v4, v25, v14

    .line 586
    .line 587
    add-int/lit8 v26, v30, 0x3

    .line 588
    .line 589
    aget v5, v25, v26

    .line 590
    .line 591
    add-int/lit8 v27, v30, 0x4

    .line 592
    .line 593
    aget v6, v25, v27

    .line 594
    .line 595
    add-int/lit8 v28, v30, 0x5

    .line 596
    .line 597
    aget v7, v25, v28

    .line 598
    .line 599
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 600
    .line 601
    .line 602
    aget v1, v25, v14

    .line 603
    .line 604
    add-float/2addr v1, v11

    .line 605
    aget v2, v25, v26

    .line 606
    .line 607
    add-float/2addr v2, v15

    .line 608
    aget v3, v25, v27

    .line 609
    .line 610
    add-float/2addr v11, v3

    .line 611
    aget v3, v25, v28

    .line 612
    .line 613
    add-float/2addr v15, v3

    .line 614
    move v6, v1

    .line 615
    move v7, v2

    .line 616
    goto/16 :goto_d

    .line 617
    .line 618
    :cond_16
    move-object/from16 v25, v3

    .line 619
    .line 620
    move/from16 v30, v4

    .line 621
    .line 622
    const/16 v32, 0x6d

    .line 623
    .line 624
    add-int/lit8 v14, v30, 0x5

    .line 625
    .line 626
    aget v1, v25, v14

    .line 627
    .line 628
    add-float v4, v1, v11

    .line 629
    .line 630
    add-int/lit8 v27, v30, 0x6

    .line 631
    .line 632
    aget v1, v25, v27

    .line 633
    .line 634
    add-float v5, v1, v15

    .line 635
    .line 636
    aget v6, v25, v30

    .line 637
    .line 638
    add-int/lit8 v1, v30, 0x1

    .line 639
    .line 640
    aget v7, v25, v1

    .line 641
    .line 642
    add-int/lit8 v1, v30, 0x2

    .line 643
    .line 644
    aget v1, v25, v1

    .line 645
    .line 646
    add-int/lit8 v2, v30, 0x3

    .line 647
    .line 648
    aget v2, v25, v2

    .line 649
    .line 650
    const/16 v26, 0x0

    .line 651
    .line 652
    cmpl-float v2, v2, v26

    .line 653
    .line 654
    if-eqz v2, :cond_17

    .line 655
    .line 656
    move-object v2, v9

    .line 657
    move/from16 v9, v16

    .line 658
    .line 659
    goto :goto_13

    .line 660
    :cond_17
    move-object v2, v9

    .line 661
    move/from16 v9, v21

    .line 662
    .line 663
    :goto_13
    add-int/lit8 v3, v30, 0x4

    .line 664
    .line 665
    aget v3, v25, v3

    .line 666
    .line 667
    cmpl-float v3, v3, v26

    .line 668
    .line 669
    move-object v0, v2

    .line 670
    move v2, v11

    .line 671
    move v11, v10

    .line 672
    if-eqz v3, :cond_18

    .line 673
    .line 674
    move/from16 v10, v16

    .line 675
    .line 676
    :goto_14
    move v3, v15

    .line 677
    move v15, v8

    .line 678
    move v8, v1

    .line 679
    move-object/from16 v1, p1

    .line 680
    .line 681
    goto :goto_15

    .line 682
    :cond_18
    move/from16 v10, v21

    .line 683
    .line 684
    goto :goto_14

    .line 685
    :goto_15
    invoke-static/range {v1 .. v10}, Lxe5;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 686
    .line 687
    .line 688
    aget v4, v25, v14

    .line 689
    .line 690
    add-float/2addr v2, v4

    .line 691
    aget v4, v25, v27

    .line 692
    .line 693
    add-float/2addr v3, v4

    .line 694
    move v6, v2

    .line 695
    move v7, v3

    .line 696
    goto/16 :goto_19

    .line 697
    .line 698
    :cond_19
    move-object/from16 v25, v3

    .line 699
    .line 700
    move/from16 v30, v4

    .line 701
    .line 702
    move v15, v8

    .line 703
    move-object v0, v9

    .line 704
    move v2, v11

    .line 705
    const/16 v32, 0x6d

    .line 706
    .line 707
    move v11, v10

    .line 708
    aget v3, v25, v30

    .line 709
    .line 710
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 711
    .line 712
    .line 713
    aget v3, v25, v30

    .line 714
    .line 715
    goto/16 :goto_19

    .line 716
    .line 717
    :cond_1a
    move-object/from16 v25, v3

    .line 718
    .line 719
    move/from16 v30, v4

    .line 720
    .line 721
    move v15, v8

    .line 722
    move-object v0, v9

    .line 723
    move v11, v10

    .line 724
    const/16 v32, 0x6d

    .line 725
    .line 726
    aget v2, v25, v30

    .line 727
    .line 728
    add-int/lit8 v4, v30, 0x1

    .line 729
    .line 730
    aget v3, v25, v4

    .line 731
    .line 732
    add-int/lit8 v5, v30, 0x2

    .line 733
    .line 734
    aget v6, v25, v5

    .line 735
    .line 736
    add-int/lit8 v7, v30, 0x3

    .line 737
    .line 738
    aget v8, v25, v7

    .line 739
    .line 740
    invoke-virtual {v1, v2, v3, v6, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 741
    .line 742
    .line 743
    aget v2, v25, v30

    .line 744
    .line 745
    aget v3, v25, v4

    .line 746
    .line 747
    aget v4, v25, v5

    .line 748
    .line 749
    aget v5, v25, v7

    .line 750
    .line 751
    move v6, v2

    .line 752
    move v7, v3

    .line 753
    move v2, v4

    .line 754
    move v3, v5

    .line 755
    goto/16 :goto_19

    .line 756
    .line 757
    :cond_1b
    move-object/from16 v25, v3

    .line 758
    .line 759
    move/from16 v30, v4

    .line 760
    .line 761
    move-object v0, v9

    .line 762
    move v11, v10

    .line 763
    move v3, v15

    .line 764
    const/16 v32, 0x6d

    .line 765
    .line 766
    move v15, v8

    .line 767
    aget v2, v25, v30

    .line 768
    .line 769
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 770
    .line 771
    .line 772
    aget v2, v25, v30

    .line 773
    .line 774
    goto/16 :goto_19

    .line 775
    .line 776
    :cond_1c
    move-object/from16 v25, v3

    .line 777
    .line 778
    move/from16 v30, v4

    .line 779
    .line 780
    move v15, v8

    .line 781
    move-object v0, v9

    .line 782
    move v11, v10

    .line 783
    const/16 v32, 0x6d

    .line 784
    .line 785
    aget v2, v25, v30

    .line 786
    .line 787
    add-int/lit8 v4, v30, 0x1

    .line 788
    .line 789
    aget v3, v25, v4

    .line 790
    .line 791
    add-int/lit8 v8, v30, 0x2

    .line 792
    .line 793
    aget v4, v25, v8

    .line 794
    .line 795
    add-int/lit8 v9, v30, 0x3

    .line 796
    .line 797
    aget v5, v25, v9

    .line 798
    .line 799
    add-int/lit8 v10, v30, 0x4

    .line 800
    .line 801
    aget v6, v25, v10

    .line 802
    .line 803
    add-int/lit8 v14, v30, 0x5

    .line 804
    .line 805
    aget v7, v25, v14

    .line 806
    .line 807
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 808
    .line 809
    .line 810
    aget v1, v25, v10

    .line 811
    .line 812
    aget v2, v25, v14

    .line 813
    .line 814
    aget v3, v25, v8

    .line 815
    .line 816
    aget v4, v25, v9

    .line 817
    .line 818
    move v6, v3

    .line 819
    move v7, v4

    .line 820
    move v3, v2

    .line 821
    move v2, v1

    .line 822
    goto :goto_19

    .line 823
    :cond_1d
    move-object/from16 v25, v3

    .line 824
    .line 825
    move/from16 v30, v4

    .line 826
    .line 827
    move-object v0, v9

    .line 828
    move v2, v11

    .line 829
    move v3, v15

    .line 830
    const/16 v32, 0x6d

    .line 831
    .line 832
    move v15, v8

    .line 833
    move v11, v10

    .line 834
    add-int/lit8 v14, v30, 0x5

    .line 835
    .line 836
    aget v4, v25, v14

    .line 837
    .line 838
    add-int/lit8 v27, v30, 0x6

    .line 839
    .line 840
    aget v5, v25, v27

    .line 841
    .line 842
    aget v6, v25, v30

    .line 843
    .line 844
    add-int/lit8 v1, v30, 0x1

    .line 845
    .line 846
    aget v7, v25, v1

    .line 847
    .line 848
    add-int/lit8 v1, v30, 0x2

    .line 849
    .line 850
    aget v8, v25, v1

    .line 851
    .line 852
    add-int/lit8 v1, v30, 0x3

    .line 853
    .line 854
    aget v1, v25, v1

    .line 855
    .line 856
    const/16 v26, 0x0

    .line 857
    .line 858
    cmpl-float v1, v1, v26

    .line 859
    .line 860
    if-eqz v1, :cond_1e

    .line 861
    .line 862
    move/from16 v9, v16

    .line 863
    .line 864
    goto :goto_16

    .line 865
    :cond_1e
    move/from16 v9, v21

    .line 866
    .line 867
    :goto_16
    add-int/lit8 v1, v30, 0x4

    .line 868
    .line 869
    aget v1, v25, v1

    .line 870
    .line 871
    cmpl-float v1, v1, v26

    .line 872
    .line 873
    if-eqz v1, :cond_1f

    .line 874
    .line 875
    move/from16 v10, v16

    .line 876
    .line 877
    :goto_17
    move-object/from16 v1, p1

    .line 878
    .line 879
    goto :goto_18

    .line 880
    :cond_1f
    move/from16 v10, v21

    .line 881
    .line 882
    goto :goto_17

    .line 883
    :goto_18
    invoke-static/range {v1 .. v10}, Lxe5;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 884
    .line 885
    .line 886
    aget v1, v25, v14

    .line 887
    .line 888
    aget v2, v25, v27

    .line 889
    .line 890
    move v6, v1

    .line 891
    move v3, v2

    .line 892
    move v7, v3

    .line 893
    move v2, v6

    .line 894
    :goto_19
    add-int v4, v30, v22

    .line 895
    .line 896
    move-object/from16 v1, p1

    .line 897
    .line 898
    move-object v9, v0

    .line 899
    move v10, v11

    .line 900
    move v8, v15

    .line 901
    move-object/from16 v0, p0

    .line 902
    .line 903
    move v11, v2

    .line 904
    move v15, v3

    .line 905
    move v2, v10

    .line 906
    move-object/from16 v3, v25

    .line 907
    .line 908
    goto/16 :goto_3

    .line 909
    .line 910
    :cond_20
    move-object v0, v9

    .line 911
    move v2, v11

    .line 912
    move v3, v15

    .line 913
    const/16 v32, 0x6d

    .line 914
    .line 915
    move v15, v8

    .line 916
    aput v2, v12, v21

    .line 917
    .line 918
    aput v3, v12, v16

    .line 919
    .line 920
    aput v6, v12, v17

    .line 921
    .line 922
    aput v7, v12, v18

    .line 923
    .line 924
    aput v23, v12, v19

    .line 925
    .line 926
    aput v24, v12, v20

    .line 927
    .line 928
    iget-char v2, v0, Lxe5;->a:C

    .line 929
    .line 930
    add-int/lit8 v8, v15, 0x1

    .line 931
    .line 932
    move-object/from16 v0, p0

    .line 933
    .line 934
    move-object/from16 v1, p1

    .line 935
    .line 936
    move/from16 v15, v21

    .line 937
    .line 938
    const/4 v11, 0x6

    .line 939
    goto/16 :goto_0

    .line 940
    .line 941
    :cond_21
    return-void

    .line 942
    nop

    .line 943
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch
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
