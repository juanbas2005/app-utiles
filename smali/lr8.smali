.class public abstract Llr8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lt37;

.field public static final b:Lt37;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lx10;->L:Lx10;

    .line 2
    .line 3
    new-instance v1, Lt37;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Llr8;->a:Lt37;

    .line 9
    .line 10
    sget-object v0, Lx10;->M:Lx10;

    .line 11
    .line 12
    new-instance v1, Lt37;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Llr8;->b:Lt37;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public static final a(ZZLfw0;Lyt2;I)V
    .locals 106

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const v3, 0x13deee68

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v3}, Lyt2;->g0(I)Lyt2;

    .line 11
    .line 12
    .line 13
    or-int/lit8 v3, v2, 0x32

    .line 14
    .line 15
    and-int/lit16 v4, v3, 0x93

    .line 16
    .line 17
    const/16 v5, 0x92

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x1

    .line 21
    if-eq v4, v5, :cond_0

    .line 22
    .line 23
    move v4, v7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v4, v6

    .line 26
    :goto_0
    and-int/2addr v3, v7

    .line 27
    invoke-virtual {v1, v3, v4}, Lyt2;->V(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_8

    .line 32
    .line 33
    invoke-virtual {v1}, Lyt2;->a0()V

    .line 34
    .line 35
    .line 36
    and-int/lit8 v3, v2, 0x1

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Lyt2;->C()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 48
    .line 49
    .line 50
    move/from16 v3, p0

    .line 51
    .line 52
    move/from16 v7, p1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    sget-object v3, Lye;->a:Lyy0;

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Landroid/content/res/Configuration;

    .line 62
    .line 63
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 64
    .line 65
    and-int/lit8 v3, v3, 0x30

    .line 66
    .line 67
    const/16 v4, 0x20

    .line 68
    .line 69
    if-ne v3, v4, :cond_3

    .line 70
    .line 71
    move v3, v7

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v3, v6

    .line 74
    :goto_2
    invoke-virtual {v1}, Lyt2;->s()V

    .line 75
    .line 76
    .line 77
    sget-object v4, Lye;->b:Lt37;

    .line 78
    .line 79
    invoke-virtual {v1, v4}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Landroid/content/Context;

    .line 84
    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    const/16 v104, -0x1

    .line 88
    .line 89
    const v105, 0xffff

    .line 90
    .line 91
    .line 92
    const-wide/16 v8, 0x0

    .line 93
    .line 94
    const-wide/16 v10, 0x0

    .line 95
    .line 96
    const-wide/16 v12, 0x0

    .line 97
    .line 98
    const-wide/16 v14, 0x0

    .line 99
    .line 100
    const-wide/16 v16, 0x0

    .line 101
    .line 102
    const-wide/16 v18, 0x0

    .line 103
    .line 104
    const-wide/16 v20, 0x0

    .line 105
    .line 106
    const-wide/16 v22, 0x0

    .line 107
    .line 108
    const-wide/16 v24, 0x0

    .line 109
    .line 110
    const-wide/16 v26, 0x0

    .line 111
    .line 112
    const-wide/16 v28, 0x0

    .line 113
    .line 114
    const-wide/16 v30, 0x0

    .line 115
    .line 116
    const-wide/16 v32, 0x0

    .line 117
    .line 118
    const-wide/16 v34, 0x0

    .line 119
    .line 120
    const-wide/16 v36, 0x0

    .line 121
    .line 122
    const-wide/16 v38, 0x0

    .line 123
    .line 124
    const-wide/16 v40, 0x0

    .line 125
    .line 126
    const-wide/16 v42, 0x0

    .line 127
    .line 128
    const-wide/16 v44, 0x0

    .line 129
    .line 130
    const-wide/16 v46, 0x0

    .line 131
    .line 132
    const-wide/16 v48, 0x0

    .line 133
    .line 134
    const-wide/16 v50, 0x0

    .line 135
    .line 136
    const-wide/16 v52, 0x0

    .line 137
    .line 138
    const-wide/16 v54, 0x0

    .line 139
    .line 140
    const-wide/16 v56, 0x0

    .line 141
    .line 142
    const-wide/16 v58, 0x0

    .line 143
    .line 144
    const-wide/16 v60, 0x0

    .line 145
    .line 146
    const-wide/16 v62, 0x0

    .line 147
    .line 148
    const-wide/16 v64, 0x0

    .line 149
    .line 150
    const-wide/16 v66, 0x0

    .line 151
    .line 152
    const-wide/16 v68, 0x0

    .line 153
    .line 154
    const-wide/16 v70, 0x0

    .line 155
    .line 156
    const-wide/16 v72, 0x0

    .line 157
    .line 158
    const-wide/16 v74, 0x0

    .line 159
    .line 160
    const-wide/16 v76, 0x0

    .line 161
    .line 162
    const-wide/16 v78, 0x0

    .line 163
    .line 164
    const-wide/16 v80, 0x0

    .line 165
    .line 166
    const-wide/16 v82, 0x0

    .line 167
    .line 168
    const-wide/16 v84, 0x0

    .line 169
    .line 170
    const-wide/16 v86, 0x0

    .line 171
    .line 172
    const-wide/16 v88, 0x0

    .line 173
    .line 174
    const-wide/16 v90, 0x0

    .line 175
    .line 176
    const-wide/16 v92, 0x0

    .line 177
    .line 178
    const-wide/16 v94, 0x0

    .line 179
    .line 180
    const-wide/16 v96, 0x0

    .line 181
    .line 182
    const-wide/16 v98, 0x0

    .line 183
    .line 184
    const-wide/16 v100, 0x0

    .line 185
    .line 186
    const-wide/16 v102, 0x0

    .line 187
    .line 188
    invoke-static/range {v8 .. v105}, Lst0;->c(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJII)Lqt0;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    :goto_3
    move-object v8, v5

    .line 193
    goto :goto_4

    .line 194
    :cond_4
    const/16 v104, -0x1

    .line 195
    .line 196
    const v105, 0xffff

    .line 197
    .line 198
    .line 199
    const-wide/16 v8, 0x0

    .line 200
    .line 201
    const-wide/16 v10, 0x0

    .line 202
    .line 203
    const-wide/16 v12, 0x0

    .line 204
    .line 205
    const-wide/16 v14, 0x0

    .line 206
    .line 207
    const-wide/16 v16, 0x0

    .line 208
    .line 209
    const-wide/16 v18, 0x0

    .line 210
    .line 211
    const-wide/16 v20, 0x0

    .line 212
    .line 213
    const-wide/16 v22, 0x0

    .line 214
    .line 215
    const-wide/16 v24, 0x0

    .line 216
    .line 217
    const-wide/16 v26, 0x0

    .line 218
    .line 219
    const-wide/16 v28, 0x0

    .line 220
    .line 221
    const-wide/16 v30, 0x0

    .line 222
    .line 223
    const-wide/16 v32, 0x0

    .line 224
    .line 225
    const-wide/16 v34, 0x0

    .line 226
    .line 227
    const-wide/16 v36, 0x0

    .line 228
    .line 229
    const-wide/16 v38, 0x0

    .line 230
    .line 231
    const-wide/16 v40, 0x0

    .line 232
    .line 233
    const-wide/16 v42, 0x0

    .line 234
    .line 235
    const-wide/16 v44, 0x0

    .line 236
    .line 237
    const-wide/16 v46, 0x0

    .line 238
    .line 239
    const-wide/16 v48, 0x0

    .line 240
    .line 241
    const-wide/16 v50, 0x0

    .line 242
    .line 243
    const-wide/16 v52, 0x0

    .line 244
    .line 245
    const-wide/16 v54, 0x0

    .line 246
    .line 247
    const-wide/16 v56, 0x0

    .line 248
    .line 249
    const-wide/16 v58, 0x0

    .line 250
    .line 251
    const-wide/16 v60, 0x0

    .line 252
    .line 253
    const-wide/16 v62, 0x0

    .line 254
    .line 255
    const-wide/16 v64, 0x0

    .line 256
    .line 257
    const-wide/16 v66, 0x0

    .line 258
    .line 259
    const-wide/16 v68, 0x0

    .line 260
    .line 261
    const-wide/16 v70, 0x0

    .line 262
    .line 263
    const-wide/16 v72, 0x0

    .line 264
    .line 265
    const-wide/16 v74, 0x0

    .line 266
    .line 267
    const-wide/16 v76, 0x0

    .line 268
    .line 269
    const-wide/16 v78, 0x0

    .line 270
    .line 271
    const-wide/16 v80, 0x0

    .line 272
    .line 273
    const-wide/16 v82, 0x0

    .line 274
    .line 275
    const-wide/16 v84, 0x0

    .line 276
    .line 277
    const-wide/16 v86, 0x0

    .line 278
    .line 279
    const-wide/16 v88, 0x0

    .line 280
    .line 281
    const-wide/16 v90, 0x0

    .line 282
    .line 283
    const-wide/16 v92, 0x0

    .line 284
    .line 285
    const-wide/16 v94, 0x0

    .line 286
    .line 287
    const-wide/16 v96, 0x0

    .line 288
    .line 289
    const-wide/16 v98, 0x0

    .line 290
    .line 291
    const-wide/16 v100, 0x0

    .line 292
    .line 293
    const-wide/16 v102, 0x0

    .line 294
    .line 295
    invoke-static/range {v8 .. v105}, Lst0;->f(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJII)Lqt0;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    goto :goto_3

    .line 300
    :goto_4
    sget-wide v9, Ljt0;->g:J

    .line 301
    .line 302
    const-string v5, "colorPrimary"

    .line 303
    .line 304
    invoke-static {v4, v5, v9, v10}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v11

    .line 308
    invoke-static {v11, v12, v9, v10}, Ljt0;->c(JJ)Z

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    if-nez v11, :cond_5

    .line 313
    .line 314
    invoke-static {v4, v5, v9, v10}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 315
    .line 316
    .line 317
    move-result-wide v9

    .line 318
    iget-wide v11, v8, Lqt0;->b:J

    .line 319
    .line 320
    const-string v5, "colorOnPrimary"

    .line 321
    .line 322
    invoke-static {v4, v5, v11, v12}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 323
    .line 324
    .line 325
    move-result-wide v11

    .line 326
    iget-wide v13, v8, Lqt0;->p:J

    .line 327
    .line 328
    const-string v5, "colorSurface"

    .line 329
    .line 330
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v21

    .line 334
    iget-wide v13, v8, Lqt0;->q:J

    .line 335
    .line 336
    const-string v5, "colorOnSurface"

    .line 337
    .line 338
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 339
    .line 340
    .line 341
    move-result-wide v23

    .line 342
    iget-wide v13, v8, Lqt0;->n:J

    .line 343
    .line 344
    const-string v5, "colorBackground"

    .line 345
    .line 346
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 347
    .line 348
    .line 349
    move-result-wide v17

    .line 350
    iget-wide v13, v8, Lqt0;->o:J

    .line 351
    .line 352
    const-string v5, "colorOnBackground"

    .line 353
    .line 354
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v19

    .line 358
    iget-wide v13, v8, Lqt0;->B:J

    .line 359
    .line 360
    const-string v5, "colorOutlineVariant"

    .line 361
    .line 362
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 363
    .line 364
    .line 365
    move-result-wide v35

    .line 366
    iget-wide v13, v8, Lqt0;->s:J

    .line 367
    .line 368
    const-string v5, "colorOnSurfaceVariant"

    .line 369
    .line 370
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 371
    .line 372
    .line 373
    move-result-wide v27

    .line 374
    iget-wide v13, v8, Lqt0;->w:J

    .line 375
    .line 376
    const-string v5, "colorError"

    .line 377
    .line 378
    invoke-static {v4, v5, v13, v14}, Llr8;->b(Landroid/content/Context;Ljava/lang/String;J)J

    .line 379
    .line 380
    .line 381
    move-result-wide v31

    .line 382
    const v47, -0x845e004

    .line 383
    .line 384
    .line 385
    const v48, 0xffff

    .line 386
    .line 387
    .line 388
    const-wide/16 v13, 0x0

    .line 389
    .line 390
    const-wide/16 v15, 0x0

    .line 391
    .line 392
    const-wide/16 v25, 0x0

    .line 393
    .line 394
    const-wide/16 v29, 0x0

    .line 395
    .line 396
    const-wide/16 v33, 0x0

    .line 397
    .line 398
    const-wide/16 v37, 0x0

    .line 399
    .line 400
    const-wide/16 v39, 0x0

    .line 401
    .line 402
    const-wide/16 v41, 0x0

    .line 403
    .line 404
    const-wide/16 v43, 0x0

    .line 405
    .line 406
    const-wide/16 v45, 0x0

    .line 407
    .line 408
    invoke-static/range {v8 .. v48}, Lqt0;->a(Lqt0;JJJJJJJJJJJJJJJJJJJII)Lqt0;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    goto :goto_5

    .line 413
    :cond_5
    if-eqz v7, :cond_7

    .line 414
    .line 415
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 416
    .line 417
    const/16 v9, 0x1f

    .line 418
    .line 419
    if-lt v5, v9, :cond_7

    .line 420
    .line 421
    if-eqz v3, :cond_6

    .line 422
    .line 423
    invoke-static {v4}, Led1;->m(Landroid/content/Context;)Lqt0;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    goto :goto_5

    .line 428
    :cond_6
    invoke-static {v4}, Led1;->n(Landroid/content/Context;)Lqt0;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    :cond_7
    :goto_5
    const v4, -0x6821f7ee

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v4}, Lyt2;->e0(I)V

    .line 436
    .line 437
    .line 438
    sget-object v4, Lch4;->b:Lt37;

    .line 439
    .line 440
    invoke-virtual {v1, v4}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    check-cast v4, Lzg4;

    .line 445
    .line 446
    iget-object v4, v4, Lzg4;->b:Lbr7;

    .line 447
    .line 448
    invoke-virtual {v1, v6}, Lyt2;->r(Z)V

    .line 449
    .line 450
    .line 451
    sget-object v5, Llr8;->a:Lt37;

    .line 452
    .line 453
    invoke-virtual {v5, v8}, Lt37;->a(Ljava/lang/Object;)Lju5;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    sget-object v6, Llr8;->b:Lt37;

    .line 458
    .line 459
    invoke-virtual {v6, v4}, Lt37;->a(Ljava/lang/Object;)Lju5;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    filled-new-array {v5, v6}, [Lju5;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    new-instance v6, Ljr8;

    .line 468
    .line 469
    invoke-direct {v6, v8, v4, v0}, Ljr8;-><init>(Lqt0;Lbr7;Lfw0;)V

    .line 470
    .line 471
    .line 472
    const v4, 0x6e2f2328

    .line 473
    .line 474
    .line 475
    invoke-static {v4, v6, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    const/16 v6, 0x38

    .line 480
    .line 481
    invoke-static {v5, v4, v1, v6}, Lt49;->d([Lju5;Lgs2;Lyt2;I)V

    .line 482
    .line 483
    .line 484
    goto :goto_6

    .line 485
    :cond_8
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 486
    .line 487
    .line 488
    move/from16 v3, p0

    .line 489
    .line 490
    move/from16 v7, p1

    .line 491
    .line 492
    :goto_6
    invoke-virtual {v1}, Lyt2;->v()Lyx5;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    if-eqz v1, :cond_9

    .line 497
    .line 498
    new-instance v4, Lwq8;

    .line 499
    .line 500
    invoke-direct {v4, v3, v7, v0, v2}, Lwq8;-><init>(ZZLfw0;I)V

    .line 501
    .line 502
    .line 503
    iput-object v4, v1, Lyx5;->d:Lgs2;

    .line 504
    .line 505
    :cond_9
    return-void
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
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "attr"

    .line 10
    .line 11
    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "android"

    .line 22
    .line 23
    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :cond_0
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p1, Landroid/util/TypedValue;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    iget p0, p1, Landroid/util/TypedValue;->data:I

    .line 47
    .line 48
    invoke-static {p0}, Luq3;->c(I)J

    .line 49
    .line 50
    .line 51
    move-result-wide p0

    .line 52
    return-wide p0

    .line 53
    :cond_2
    :goto_0
    return-wide p2
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
