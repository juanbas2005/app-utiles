.class public abstract Llo4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lcg0;

.field public static final b:Lcg0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcg0;

    .line 2
    .line 3
    const-string v1, "\r\n"

    .line 4
    .line 5
    sget-object v2, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lz65;->R(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    array-length v3, v1

    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcg0;-><init>([BII)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Llo4;->a:Lcg0;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [B

    .line 20
    .line 21
    fill-array-data v0, :array_0

    .line 22
    .line 23
    .line 24
    new-instance v1, Lcg0;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lcg0;-><init>([B)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Llo4;->b:Lcg0;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
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
.end method

.method public static final a(Lcg0;Ly81;Laf0;Lc53;JLh61;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-wide/from16 v4, p4

    .line 4
    .line 5
    move-object/from16 v0, p6

    .line 6
    .line 7
    instance-of v1, v0, Lio4;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lio4;

    .line 13
    .line 14
    iget v2, v1, Lio4;->F:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v2, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v6

    .line 23
    iput v2, v1, Lio4;->F:I

    .line 24
    .line 25
    :goto_0
    move-object v6, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Lio4;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lh61;-><init>(Lf61;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v6, Lio4;->E:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, v6, Lio4;->F:I

    .line 36
    .line 37
    const/4 v7, 0x4

    .line 38
    const/4 v2, 0x2

    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    sget-object v11, Lp81;->w:Lp81;

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    if-eq v1, v9, :cond_4

    .line 47
    .line 48
    if-eq v1, v2, :cond_3

    .line 49
    .line 50
    if-eq v1, v8, :cond_2

    .line 51
    .line 52
    if-ne v1, v7, :cond_1

    .line 53
    .line 54
    iget-wide v1, v6, Lio4;->D:J

    .line 55
    .line 56
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_b

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v10

    .line 67
    :cond_2
    iget-wide v1, v6, Lio4;->D:J

    .line 68
    .line 69
    iget-wide v3, v6, Lio4;->C:J

    .line 70
    .line 71
    iget-object v5, v6, Lio4;->B:Lfg0;

    .line 72
    .line 73
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_3
    iget-wide v1, v6, Lio4;->C:J

    .line 79
    .line 80
    iget-object v3, v6, Lio4;->B:Lfg0;

    .line 81
    .line 82
    iget-object v4, v6, Lio4;->A:Ly81;

    .line 83
    .line 84
    iget-object v5, v6, Lio4;->z:Lcg0;

    .line 85
    .line 86
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move/from16 v24, v8

    .line 90
    .line 91
    move-wide/from16 v27, v1

    .line 92
    .line 93
    move-object v2, v0

    .line 94
    move-object v1, v4

    .line 95
    move-object v0, v5

    .line 96
    move-wide/from16 v4, v27

    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_4
    iget-wide v1, v6, Lio4;->C:J

    .line 101
    .line 102
    iget-object v3, v6, Lio4;->B:Lfg0;

    .line 103
    .line 104
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_5
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const-string v0, "Content-Length"

    .line 113
    .line 114
    move-object/from16 v1, p3

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lc53;->a(Ljava/lang/String;)Lun0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_d

    .line 121
    .line 122
    sget v1, Lko0;->a:I

    .line 123
    .line 124
    invoke-virtual {v0}, Lun0;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const-string v14, ": too large for Long type"

    .line 129
    .line 130
    const-string v15, "Invalid number "

    .line 131
    .line 132
    const-wide/16 v16, 0x0

    .line 133
    .line 134
    const/16 v12, 0x13

    .line 135
    .line 136
    if-gt v1, v12, :cond_c

    .line 137
    .line 138
    const-wide/16 v18, 0x9

    .line 139
    .line 140
    const-wide/16 v20, 0x30

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    if-ne v1, v12, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, Lun0;->length()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    move-wide/from16 v22, v16

    .line 150
    .line 151
    :goto_2
    if-ge v13, v1, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0, v13}, Lun0;->charAt(I)C

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    move/from16 v24, v8

    .line 158
    .line 159
    int-to-long v7, v12

    .line 160
    sub-long v7, v7, v20

    .line 161
    .line 162
    cmp-long v12, v7, v16

    .line 163
    .line 164
    if-ltz v12, :cond_7

    .line 165
    .line 166
    cmp-long v12, v7, v18

    .line 167
    .line 168
    if-gtz v12, :cond_7

    .line 169
    .line 170
    shl-long v25, v22, v24

    .line 171
    .line 172
    shl-long v22, v22, v9

    .line 173
    .line 174
    add-long v25, v25, v22

    .line 175
    .line 176
    add-long v22, v25, v7

    .line 177
    .line 178
    cmp-long v7, v22, v16

    .line 179
    .line 180
    if-ltz v7, :cond_6

    .line 181
    .line 182
    add-int/lit8 v13, v13, 0x1

    .line 183
    .line 184
    move/from16 v8, v24

    .line 185
    .line 186
    const/4 v7, 0x4

    .line 187
    goto :goto_2

    .line 188
    :cond_6
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 189
    .line 190
    new-instance v2, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_7
    invoke-static {v0, v13}, Lko0;->b(Lun0;I)V

    .line 210
    .line 211
    .line 212
    throw v10

    .line 213
    :cond_8
    move/from16 v24, v8

    .line 214
    .line 215
    :cond_9
    move-wide/from16 v0, v22

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    move/from16 v24, v8

    .line 219
    .line 220
    move-wide/from16 v22, v16

    .line 221
    .line 222
    :goto_3
    if-ge v13, v1, :cond_9

    .line 223
    .line 224
    invoke-virtual {v0, v13}, Lun0;->charAt(I)C

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    int-to-long v7, v7

    .line 229
    sub-long v7, v7, v20

    .line 230
    .line 231
    cmp-long v12, v7, v16

    .line 232
    .line 233
    if-ltz v12, :cond_b

    .line 234
    .line 235
    cmp-long v12, v7, v18

    .line 236
    .line 237
    if-gtz v12, :cond_b

    .line 238
    .line 239
    shl-long v14, v22, v24

    .line 240
    .line 241
    shl-long v22, v22, v9

    .line 242
    .line 243
    add-long v14, v14, v22

    .line 244
    .line 245
    add-long v22, v14, v7

    .line 246
    .line 247
    add-int/lit8 v13, v13, 0x1

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_b
    invoke-static {v0, v13}, Lko0;->b(Lun0;I)V

    .line 251
    .line 252
    .line 253
    throw v10

    .line 254
    :goto_4
    new-instance v7, Ljava/lang/Long;

    .line 255
    .line 256
    invoke-direct {v7, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_c
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 261
    .line 262
    new-instance v2, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v1

    .line 281
    :cond_d
    move/from16 v24, v8

    .line 282
    .line 283
    const-wide/16 v16, 0x0

    .line 284
    .line 285
    move-object v7, v10

    .line 286
    :goto_5
    if-nez v7, :cond_f

    .line 287
    .line 288
    iput-object v10, v6, Lio4;->z:Lcg0;

    .line 289
    .line 290
    iput-object v10, v6, Lio4;->A:Ly81;

    .line 291
    .line 292
    iput-object v3, v6, Lio4;->B:Lfg0;

    .line 293
    .line 294
    iput-wide v4, v6, Lio4;->C:J

    .line 295
    .line 296
    iput v9, v6, Lio4;->F:I

    .line 297
    .line 298
    new-instance v0, Lef0;

    .line 299
    .line 300
    move-object/from16 v2, p0

    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    invoke-direct/range {v0 .. v5}, Lef0;-><init>(Lhf0;Lcg0;Lfg0;J)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v9, v6}, Lef0;->d(ZLh61;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-ne v0, v11, :cond_e

    .line 312
    .line 313
    goto/16 :goto_a

    .line 314
    .line 315
    :cond_e
    move-wide v1, v4

    .line 316
    :goto_6
    check-cast v0, Ljava/lang/Number;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v4

    .line 322
    move-wide/from16 v27, v4

    .line 323
    .line 324
    move-object v5, v3

    .line 325
    move-wide v3, v1

    .line 326
    move-wide/from16 v1, v27

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_f
    move-object/from16 v1, p1

    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 332
    .line 333
    .line 334
    move-result-wide v8

    .line 335
    cmp-long v0, v16, v8

    .line 336
    .line 337
    if-gtz v0, :cond_13

    .line 338
    .line 339
    cmp-long v0, v8, v4

    .line 340
    .line 341
    if-gtz v0, :cond_13

    .line 342
    .line 343
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 344
    .line 345
    .line 346
    move-result-wide v7

    .line 347
    move-object/from16 v0, p0

    .line 348
    .line 349
    iput-object v0, v6, Lio4;->z:Lcg0;

    .line 350
    .line 351
    iput-object v1, v6, Lio4;->A:Ly81;

    .line 352
    .line 353
    iput-object v3, v6, Lio4;->B:Lfg0;

    .line 354
    .line 355
    iput-wide v4, v6, Lio4;->C:J

    .line 356
    .line 357
    iput v2, v6, Lio4;->F:I

    .line 358
    .line 359
    invoke-static {v1, v3, v7, v8, v6}, Lrc9;->A(Lhf0;Lfg0;JLh61;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-ne v2, v11, :cond_10

    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_10
    :goto_7
    check-cast v2, Ljava/lang/Number;

    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 369
    .line 370
    .line 371
    move-result-wide v7

    .line 372
    iput-object v10, v6, Lio4;->z:Lcg0;

    .line 373
    .line 374
    iput-object v10, v6, Lio4;->A:Ly81;

    .line 375
    .line 376
    iput-object v3, v6, Lio4;->B:Lfg0;

    .line 377
    .line 378
    iput-wide v4, v6, Lio4;->C:J

    .line 379
    .line 380
    iput-wide v7, v6, Lio4;->D:J

    .line 381
    .line 382
    move/from16 v2, v24

    .line 383
    .line 384
    iput v2, v6, Lio4;->F:I

    .line 385
    .line 386
    invoke-static {v1, v0, v6}, Llo4;->d(Lhf0;Lcg0;Lh61;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-ne v0, v11, :cond_11

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_11
    move-wide v1, v4

    .line 394
    move-object v5, v3

    .line 395
    move-wide v3, v1

    .line 396
    move-wide v1, v7

    .line 397
    :goto_8
    check-cast v0, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 400
    .line 401
    .line 402
    move-result-wide v7

    .line 403
    add-long/2addr v7, v1

    .line 404
    move-wide v1, v7

    .line 405
    :goto_9
    iput-object v10, v6, Lio4;->z:Lcg0;

    .line 406
    .line 407
    iput-object v10, v6, Lio4;->A:Ly81;

    .line 408
    .line 409
    iput-object v10, v6, Lio4;->B:Lfg0;

    .line 410
    .line 411
    iput-wide v3, v6, Lio4;->C:J

    .line 412
    .line 413
    iput-wide v1, v6, Lio4;->D:J

    .line 414
    .line 415
    const/4 v0, 0x4

    .line 416
    iput v0, v6, Lio4;->F:I

    .line 417
    .line 418
    invoke-interface {v5, v6}, Lfg0;->c(Lh61;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    if-ne v0, v11, :cond_12

    .line 423
    .line 424
    :goto_a
    return-object v11

    .line 425
    :cond_12
    :goto_b
    new-instance v0, Ljava/lang/Long;

    .line 426
    .line 427
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 428
    .line 429
    .line 430
    return-object v0

    .line 431
    :cond_13
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 432
    .line 433
    .line 434
    move-result-wide v0

    .line 435
    const-string v2, "Multipart content length exceeds limit "

    .line 436
    .line 437
    const-string v3, " > "

    .line 438
    .line 439
    invoke-static {v0, v1, v2, v3}, Lhl6;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-string v1, "; limit is defined using \'formFieldLimit\' argument"

    .line 444
    .line 445
    invoke-static {v0, v4, v5, v1}, Lf21;->k(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, Lrf2;->i(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-object v10
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
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
.end method

.method public static final b(Ly81;Lh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Ljo4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljo4;

    .line 7
    .line 8
    iget v1, v0, Ljo4;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ljo4;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljo4;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lh61;-><init>(Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ljo4;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ljo4;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v4, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Ljo4;->z:Lwn0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lwn0;

    .line 54
    .line 55
    invoke-direct {p1}, Lwn0;-><init>()V

    .line 56
    .line 57
    .line 58
    :try_start_1
    iput-object p1, v0, Ljo4;->z:Lwn0;

    .line 59
    .line 60
    iput v4, v0, Ljo4;->B:I

    .line 61
    .line 62
    sget-object v1, Ll53;->a:Ljava/util/Set;

    .line 63
    .line 64
    new-instance v1, Ldv5;

    .line 65
    .line 66
    const/4 v5, 0x5

    .line 67
    invoke-direct {v1, v5, v2}, Ldv5;-><init>(IB)V

    .line 68
    .line 69
    .line 70
    iput v2, v1, Ldv5;->b:I

    .line 71
    .line 72
    iput v2, v1, Ldv5;->c:I

    .line 73
    .line 74
    invoke-static {p0, p1, v1, v0}, Ll53;->c(Lhf0;Lwn0;Ldv5;Lh61;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    sget-object v0, Lp81;->w:Lp81;

    .line 79
    .line 80
    if-ne p0, v0, :cond_3

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    move-object v8, p1

    .line 84
    move-object p1, p0

    .line 85
    move-object p0, v8

    .line 86
    :goto_1
    :try_start_2
    check-cast p1, Lc53;

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    .line 92
    .line 93
    const-string v0, "Failed to parse multipart headers: unexpected end of stream"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    :goto_2
    move-object v8, p1

    .line 100
    move-object p1, p0

    .line 101
    move-object p0, v8

    .line 102
    goto :goto_3

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    iget-object v0, p0, Lwn0;->w:Ly25;

    .line 106
    .line 107
    iget-object v1, p0, Lwn0;->x:Ljava/util/ArrayList;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    iput-object v3, p0, Lwn0;->y:[C

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    move v6, v2

    .line 118
    :goto_4
    if-ge v6, v5, :cond_7

    .line 119
    .line 120
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-interface {v0, v7}, Ly25;->e0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    add-int/lit8 v6, v6, 0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    iget-object v1, p0, Lwn0;->y:[C

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    invoke-interface {v0, v1}, Ly25;->e0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    iput-object v3, p0, Lwn0;->y:[C

    .line 138
    .line 139
    :cond_7
    iput-boolean v4, p0, Lwn0;->A:Z

    .line 140
    .line 141
    iput-object v3, p0, Lwn0;->x:Ljava/util/ArrayList;

    .line 142
    .line 143
    iput-object v3, p0, Lwn0;->z:Ljava/lang/String;

    .line 144
    .line 145
    iput v2, p0, Lwn0;->C:I

    .line 146
    .line 147
    iput v2, p0, Lwn0;->B:I

    .line 148
    .line 149
    throw p1
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public static final c(Lf06;[BB)V
    .locals 2

    .line 1
    iget v0, p0, Lf06;->w:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    iput v1, p0, Lf06;->w:I

    .line 9
    .line 10
    aput-byte p2, p1, v0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Failed to parse multipart: boundary shouldn\'t be longer than 70 characters"

    .line 14
    .line 15
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

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

.method public static final d(Lhf0;Lcg0;Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lko4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lko4;

    .line 7
    .line 8
    iget v1, v0, Lko4;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lko4;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lko4;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lh61;-><init>(Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lko4;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lko4;->B:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lko4;->z:Lcg0;

    .line 35
    .line 36
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, Lko4;->z:Lcg0;

    .line 51
    .line 52
    iput v2, v0, Lko4;->B:I

    .line 53
    .line 54
    invoke-static {p0, p1, v0}, Lrc9;->T0(Lhf0;Lcg0;Lh61;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    sget-object p0, Lp81;->w:Lp81;

    .line 59
    .line 60
    if-ne p2, p0, :cond_3

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    iget-object p0, p1, Lcg0;->w:[B

    .line 72
    .line 73
    array-length p0, p0

    .line 74
    int-to-long p0, p0

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    const-wide/16 p0, 0x0

    .line 77
    .line 78
    :goto_2
    new-instance p2, Ljava/lang/Long;

    .line 79
    .line 80
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 81
    .line 82
    .line 83
    return-object p2
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
