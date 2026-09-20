.class public final Lvi1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public static a(Ljava/lang/String;)Lkotlinx/datetime/DateTimePeriod;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v3, v1

    .line 8
    move v4, v3

    .line 9
    move v5, v4

    .line 10
    move v6, v5

    .line 11
    move v7, v6

    .line 12
    move v8, v7

    .line 13
    move v9, v8

    .line 14
    move v10, v9

    .line 15
    move v11, v10

    .line 16
    move v12, v11

    .line 17
    const/4 v13, 0x1

    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    const-wide/32 v17, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const-wide/32 v19, -0x80000000

    .line 26
    .line 27
    .line 28
    const/16 v21, 0x1

    .line 29
    .line 30
    const-string v2, "Parse error at char "

    .line 31
    .line 32
    const-wide/16 v22, 0x0

    .line 33
    .line 34
    const/4 v15, 0x7

    .line 35
    if-lt v1, v14, :cond_7

    .line 36
    .line 37
    if-eqz v3, :cond_6

    .line 38
    .line 39
    const/4 v0, 0x6

    .line 40
    if-eq v3, v0, :cond_5

    .line 41
    .line 42
    int-to-long v0, v4

    .line 43
    mul-int/2addr v5, v15

    .line 44
    int-to-long v2, v5

    .line 45
    add-long/2addr v0, v2

    .line 46
    cmp-long v2, v19, v0

    .line 47
    .line 48
    if-gtz v2, :cond_4

    .line 49
    .line 50
    cmp-long v2, v0, v17

    .line 51
    .line 52
    if-gtz v2, :cond_4

    .line 53
    .line 54
    long-to-int v14, v0

    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    int-to-long v0, v12

    .line 58
    invoke-static {v7, v8}, Lpd8;->P(II)J

    .line 59
    .line 60
    .line 61
    move-result-wide v15

    .line 62
    int-to-long v2, v9

    .line 63
    const-wide/16 v4, 0x3c

    .line 64
    .line 65
    mul-long/2addr v2, v4

    .line 66
    int-to-long v6, v10

    .line 67
    add-long/2addr v2, v6

    .line 68
    mul-long/2addr v2, v4

    .line 69
    const-wide/32 v4, 0x3b9aca00

    .line 70
    .line 71
    .line 72
    div-long v6, v0, v4

    .line 73
    .line 74
    add-long/2addr v6, v2

    .line 75
    int-to-long v2, v11

    .line 76
    add-long/2addr v6, v2

    .line 77
    :try_start_0
    rem-long v2, v0, v4

    .line 78
    .line 79
    cmp-long v8, v6, v22

    .line 80
    .line 81
    if-lez v8, :cond_0

    .line 82
    .line 83
    cmp-long v12, v2, v22

    .line 84
    .line 85
    if-gez v12, :cond_0

    .line 86
    .line 87
    const-wide/16 v12, -0x1

    .line 88
    .line 89
    add-long/2addr v6, v12

    .line 90
    add-long/2addr v2, v4

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    if-gez v8, :cond_1

    .line 93
    .line 94
    cmp-long v8, v2, v22

    .line 95
    .line 96
    if-lez v8, :cond_1

    .line 97
    .line 98
    const-wide/16 v12, 0x1

    .line 99
    .line 100
    add-long/2addr v6, v12

    .line 101
    sub-long/2addr v2, v4

    .line 102
    :cond_1
    :goto_1
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->addExact(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v17
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    cmp-long v0, v17, v22

    .line 111
    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    new-instance v13, Lwi1;

    .line 115
    .line 116
    invoke-direct/range {v13 .. v18}, Lwi1;-><init>(IJJ)V

    .line 117
    .line 118
    .line 119
    return-object v13

    .line 120
    :cond_2
    move-wide v0, v15

    .line 121
    new-instance v2, Lkotlinx/datetime/DatePeriod;

    .line 122
    .line 123
    invoke-direct {v2, v0, v1, v14}, Lkotlinx/datetime/DatePeriod;-><init>(JI)V

    .line 124
    .line 125
    .line 126
    return-object v2

    .line 127
    :catch_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    const-string v3, " hours, "

    .line 130
    .line 131
    const-string v4, " minutes, "

    .line 132
    .line 133
    const-string v5, "The total number of nanoseconds in "

    .line 134
    .line 135
    invoke-static {v5, v9, v3, v10, v4}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v4, " seconds, and "

    .line 143
    .line 144
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v0, " nanoseconds overflows a Long"

    .line 151
    .line 152
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v2

    .line 163
    :cond_3
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 164
    .line 165
    const-string v1, "Parse error at char 0: At least one component is required, but none were found"

    .line 166
    .line 167
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_4
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 172
    .line 173
    const-string v1, "Parse error at char 0: The total number of days under \'D\' and \'W\' designators should fit into an Int"

    .line 174
    .line 175
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_5
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 180
    .line 181
    const-string v3, ": Unexpected end of input; at least one time component is required after \'T\'"

    .line 182
    .line 183
    invoke-static {v1, v2, v3}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :cond_6
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 192
    .line 193
    const-string v3, ": Unexpected end of input; \'P\' designator is required"

    .line 194
    .line 195
    invoke-static {v1, v2, v3}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_7
    const/16 v24, 0x0

    .line 204
    .line 205
    const/16 v14, 0x2b

    .line 206
    .line 207
    if-nez v3, :cond_f

    .line 208
    .line 209
    add-int/lit8 v3, v1, 0x1

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 212
    .line 213
    .line 214
    move-result v15

    .line 215
    if-lt v3, v15, :cond_9

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    if-eq v15, v14, :cond_8

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    const/16 v14, 0x2d

    .line 228
    .line 229
    if-eq v15, v14, :cond_8

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_8
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 233
    .line 234
    const-string v3, ": Unexpected end of string; \'P\' designator is required"

    .line 235
    .line 236
    invoke-static {v1, v2, v3}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_9
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/16 v14, 0x50

    .line 249
    .line 250
    const/16 v15, 0x2b

    .line 251
    .line 252
    if-eq v2, v15, :cond_b

    .line 253
    .line 254
    const/16 v15, 0x2d

    .line 255
    .line 256
    if-eq v2, v15, :cond_c

    .line 257
    .line 258
    if-ne v2, v14, :cond_a

    .line 259
    .line 260
    move v1, v3

    .line 261
    goto :goto_3

    .line 262
    :cond_a
    const-string v2, "Expected \'+\', \'-\', \'P\', got \'"

    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-static {v0, v1, v2}, Lta1;->f(IILjava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-object v24

    .line 272
    :cond_b
    const/16 v15, 0x2d

    .line 273
    .line 274
    :cond_c
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-ne v2, v15, :cond_d

    .line 279
    .line 280
    const/4 v13, -0x1

    .line 281
    :cond_d
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-ne v2, v14, :cond_e

    .line 286
    .line 287
    add-int/lit8 v1, v1, 0x2

    .line 288
    .line 289
    :goto_3
    move/from16 v3, v21

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_e
    const-string v1, "Expected \'P\', got \'"

    .line 294
    .line 295
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-static {v0, v3, v1}, Lta1;->f(IILjava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v24

    .line 303
    :cond_f
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    const/16 v15, 0x2b

    .line 308
    .line 309
    if-eq v14, v15, :cond_14

    .line 310
    .line 311
    const/16 v15, 0x2d

    .line 312
    .line 313
    if-ne v14, v15, :cond_10

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_10
    const/16 v15, 0x30

    .line 317
    .line 318
    if-gt v15, v14, :cond_11

    .line 319
    .line 320
    const/16 v15, 0x3a

    .line 321
    .line 322
    if-ge v14, v15, :cond_11

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_11
    const/16 v15, 0x54

    .line 326
    .line 327
    if-ne v14, v15, :cond_13

    .line 328
    .line 329
    const/4 v14, 0x6

    .line 330
    if-ge v3, v14, :cond_12

    .line 331
    .line 332
    add-int/lit8 v1, v1, 0x1

    .line 333
    .line 334
    const/4 v3, 0x6

    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :cond_12
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 338
    .line 339
    const-string v3, ": Only one \'T\' designator is allowed"

    .line 340
    .line 341
    invoke-static {v1, v2, v3}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :cond_13
    :goto_4
    move v14, v1

    .line 350
    move/from16 v25, v4

    .line 351
    .line 352
    move v6, v13

    .line 353
    const/16 v4, 0x3a

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_14
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    const/16 v15, 0x2d

    .line 361
    .line 362
    if-ne v6, v15, :cond_15

    .line 363
    .line 364
    mul-int/lit8 v6, v13, -0x1

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_15
    move v6, v13

    .line 368
    :goto_6
    add-int/lit8 v14, v1, 0x1

    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    if-ge v14, v15, :cond_35

    .line 375
    .line 376
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 377
    .line 378
    .line 379
    move-result v15

    .line 380
    move/from16 v25, v4

    .line 381
    .line 382
    const/16 v4, 0x30

    .line 383
    .line 384
    if-gt v4, v15, :cond_35

    .line 385
    .line 386
    const/16 v4, 0x3a

    .line 387
    .line 388
    if-ge v15, v4, :cond_35

    .line 389
    .line 390
    :goto_7
    move-wide/from16 v28, v22

    .line 391
    .line 392
    :goto_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 393
    .line 394
    .line 395
    move-result v15

    .line 396
    if-ge v14, v15, :cond_17

    .line 397
    .line 398
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 399
    .line 400
    .line 401
    move-result v15

    .line 402
    move/from16 v22, v5

    .line 403
    .line 404
    const/16 v5, 0x30

    .line 405
    .line 406
    if-gt v5, v15, :cond_16

    .line 407
    .line 408
    if-ge v15, v4, :cond_16

    .line 409
    .line 410
    move/from16 v27, v5

    .line 411
    .line 412
    move v4, v6

    .line 413
    const-wide/16 v5, 0xa

    .line 414
    .line 415
    move v15, v7

    .line 416
    move/from16 v23, v8

    .line 417
    .line 418
    move-wide/from16 v7, v28

    .line 419
    .line 420
    :try_start_1
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 421
    .line 422
    .line 423
    move-result-wide v5

    .line 424
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    add-int/lit8 v7, v7, -0x30

    .line 429
    .line 430
    int-to-long v7, v7

    .line 431
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->addExact(JJ)J

    .line 432
    .line 433
    .line 434
    move-result-wide v28
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    .line 435
    add-int/lit8 v14, v14, 0x1

    .line 436
    .line 437
    move v6, v4

    .line 438
    move v7, v15

    .line 439
    move/from16 v5, v22

    .line 440
    .line 441
    move/from16 v8, v23

    .line 442
    .line 443
    const/16 v4, 0x3a

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :catch_1
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 447
    .line 448
    const-string v3, ": The number is too large"

    .line 449
    .line 450
    invoke-static {v1, v2, v3}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :cond_16
    move v4, v6

    .line 459
    move v15, v7

    .line 460
    move/from16 v23, v8

    .line 461
    .line 462
    move-wide/from16 v7, v28

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_17
    move/from16 v22, v5

    .line 466
    .line 467
    move v15, v7

    .line 468
    move/from16 v23, v8

    .line 469
    .line 470
    move-wide/from16 v7, v28

    .line 471
    .line 472
    move v4, v6

    .line 473
    :goto_9
    int-to-long v5, v4

    .line 474
    mul-long/2addr v5, v7

    .line 475
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 476
    .line 477
    .line 478
    move-result v7

    .line 479
    const-string v8, ": Expected a designator after the numerical value"

    .line 480
    .line 481
    if-eq v14, v7, :cond_34

    .line 482
    .line 483
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    invoke-static {v7}, Ljava/lang/Character;->toUpperCase(C)C

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    move/from16 v26, v4

    .line 492
    .line 493
    const-string v4, " does not fit into an Int, which is required for component \'S\'"

    .line 494
    .line 495
    move/from16 v29, v9

    .line 496
    .line 497
    const-string v9, "Value "

    .line 498
    .line 499
    move/from16 v30, v10

    .line 500
    .line 501
    const-string v10, ": Wrong component order: should be \'Y\', \'M\', \'W\', \'D\', then designator \'T\', then \'H\', \'M\', \'S\'"

    .line 502
    .line 503
    move/from16 v31, v11

    .line 504
    .line 505
    const/16 v11, 0x2c

    .line 506
    .line 507
    if-eq v7, v11, :cond_2d

    .line 508
    .line 509
    const/16 v11, 0x2e

    .line 510
    .line 511
    if-eq v7, v11, :cond_2d

    .line 512
    .line 513
    const/16 v11, 0x44

    .line 514
    .line 515
    if-eq v7, v11, :cond_2a

    .line 516
    .line 517
    const/16 v11, 0x48

    .line 518
    .line 519
    if-eq v7, v11, :cond_27

    .line 520
    .line 521
    const/16 v11, 0x4d

    .line 522
    .line 523
    if-eq v7, v11, :cond_21

    .line 524
    .line 525
    const/16 v11, 0x53

    .line 526
    .line 527
    if-eq v7, v11, :cond_1e

    .line 528
    .line 529
    const/16 v4, 0x57

    .line 530
    .line 531
    if-eq v7, v4, :cond_1b

    .line 532
    .line 533
    const/16 v4, 0x59

    .line 534
    .line 535
    if-ne v7, v4, :cond_1a

    .line 536
    .line 537
    const/4 v4, 0x2

    .line 538
    if-ge v3, v4, :cond_19

    .line 539
    .line 540
    cmp-long v2, v5, v19

    .line 541
    .line 542
    if-ltz v2, :cond_18

    .line 543
    .line 544
    cmp-long v2, v5, v17

    .line 545
    .line 546
    if-gtz v2, :cond_18

    .line 547
    .line 548
    long-to-int v1, v5

    .line 549
    move v7, v1

    .line 550
    move v3, v4

    .line 551
    move/from16 v5, v22

    .line 552
    .line 553
    :goto_a
    move/from16 v8, v23

    .line 554
    .line 555
    move/from16 v4, v25

    .line 556
    .line 557
    move/from16 v9, v29

    .line 558
    .line 559
    :goto_b
    move/from16 v10, v30

    .line 560
    .line 561
    :goto_c
    move/from16 v11, v31

    .line 562
    .line 563
    goto/16 :goto_f

    .line 564
    .line 565
    :cond_18
    const-string v0, " does not fit into an Int, which is required for component \'Y\'"

    .line 566
    .line 567
    invoke-static {v5, v6, v9, v0}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v24

    .line 575
    :cond_19
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 576
    .line 577
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    throw v0

    .line 585
    :cond_1a
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 586
    .line 587
    invoke-static {v14, v2, v8}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    throw v0

    .line 595
    :cond_1b
    const/4 v4, 0x4

    .line 596
    if-ge v3, v4, :cond_1d

    .line 597
    .line 598
    cmp-long v2, v5, v19

    .line 599
    .line 600
    if-ltz v2, :cond_1c

    .line 601
    .line 602
    cmp-long v2, v5, v17

    .line 603
    .line 604
    if-gtz v2, :cond_1c

    .line 605
    .line 606
    long-to-int v1, v5

    .line 607
    move v5, v1

    .line 608
    move v3, v4

    .line 609
    move v7, v15

    .line 610
    goto :goto_a

    .line 611
    :cond_1c
    const-string v0, " does not fit into an Int, which is required for component \'W\'"

    .line 612
    .line 613
    invoke-static {v5, v6, v9, v0}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    return-object v24

    .line 621
    :cond_1d
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 622
    .line 623
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    throw v0

    .line 631
    :cond_1e
    const/16 v7, 0x9

    .line 632
    .line 633
    if-ge v3, v7, :cond_20

    .line 634
    .line 635
    const/4 v7, 0x6

    .line 636
    if-lt v3, v7, :cond_20

    .line 637
    .line 638
    cmp-long v2, v5, v19

    .line 639
    .line 640
    if-ltz v2, :cond_1f

    .line 641
    .line 642
    cmp-long v2, v5, v17

    .line 643
    .line 644
    if-gtz v2, :cond_1f

    .line 645
    .line 646
    long-to-int v1, v5

    .line 647
    move v11, v1

    .line 648
    move v7, v15

    .line 649
    move/from16 v5, v22

    .line 650
    .line 651
    move/from16 v8, v23

    .line 652
    .line 653
    move/from16 v4, v25

    .line 654
    .line 655
    move/from16 v9, v29

    .line 656
    .line 657
    move/from16 v10, v30

    .line 658
    .line 659
    const/16 v3, 0x9

    .line 660
    .line 661
    goto/16 :goto_f

    .line 662
    .line 663
    :cond_1f
    invoke-static {v5, v6, v9, v4}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    return-object v24

    .line 671
    :cond_20
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 672
    .line 673
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw v0

    .line 681
    :cond_21
    const-string v4, " does not fit into an Int, which is required for component \'M\'"

    .line 682
    .line 683
    const/4 v7, 0x6

    .line 684
    if-lt v3, v7, :cond_24

    .line 685
    .line 686
    const/16 v7, 0x8

    .line 687
    .line 688
    if-ge v3, v7, :cond_23

    .line 689
    .line 690
    cmp-long v2, v5, v19

    .line 691
    .line 692
    if-ltz v2, :cond_22

    .line 693
    .line 694
    cmp-long v2, v5, v17

    .line 695
    .line 696
    if-gtz v2, :cond_22

    .line 697
    .line 698
    long-to-int v10, v5

    .line 699
    move/from16 v8, v23

    .line 700
    .line 701
    goto :goto_d

    .line 702
    :cond_22
    invoke-static {v5, v6, v9, v4}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    return-object v24

    .line 710
    :cond_23
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 711
    .line 712
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    throw v0

    .line 720
    :cond_24
    const/4 v7, 0x3

    .line 721
    if-ge v3, v7, :cond_26

    .line 722
    .line 723
    cmp-long v2, v5, v19

    .line 724
    .line 725
    if-ltz v2, :cond_25

    .line 726
    .line 727
    cmp-long v2, v5, v17

    .line 728
    .line 729
    if-gtz v2, :cond_25

    .line 730
    .line 731
    long-to-int v8, v5

    .line 732
    move/from16 v10, v30

    .line 733
    .line 734
    :goto_d
    move v3, v7

    .line 735
    move v7, v15

    .line 736
    move/from16 v5, v22

    .line 737
    .line 738
    move/from16 v4, v25

    .line 739
    .line 740
    move/from16 v9, v29

    .line 741
    .line 742
    goto/16 :goto_c

    .line 743
    .line 744
    :cond_25
    invoke-static {v5, v6, v9, v4}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    return-object v24

    .line 752
    :cond_26
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 753
    .line 754
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    throw v0

    .line 762
    :cond_27
    const/4 v4, 0x7

    .line 763
    if-ge v3, v4, :cond_29

    .line 764
    .line 765
    const/4 v7, 0x6

    .line 766
    if-lt v3, v7, :cond_29

    .line 767
    .line 768
    cmp-long v2, v5, v19

    .line 769
    .line 770
    if-ltz v2, :cond_28

    .line 771
    .line 772
    cmp-long v2, v5, v17

    .line 773
    .line 774
    if-gtz v2, :cond_28

    .line 775
    .line 776
    long-to-int v1, v5

    .line 777
    move v9, v1

    .line 778
    move v3, v4

    .line 779
    move v7, v15

    .line 780
    move/from16 v5, v22

    .line 781
    .line 782
    move/from16 v8, v23

    .line 783
    .line 784
    move/from16 v4, v25

    .line 785
    .line 786
    goto/16 :goto_b

    .line 787
    .line 788
    :cond_28
    const-string v0, " does not fit into an Int, which is required for component \'H\'"

    .line 789
    .line 790
    invoke-static {v5, v6, v9, v0}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    return-object v24

    .line 798
    :cond_29
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 799
    .line 800
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    throw v0

    .line 808
    :cond_2a
    const/4 v4, 0x5

    .line 809
    if-ge v3, v4, :cond_2c

    .line 810
    .line 811
    cmp-long v2, v5, v19

    .line 812
    .line 813
    if-ltz v2, :cond_2b

    .line 814
    .line 815
    cmp-long v2, v5, v17

    .line 816
    .line 817
    if-gtz v2, :cond_2b

    .line 818
    .line 819
    long-to-int v1, v5

    .line 820
    move v3, v4

    .line 821
    move v7, v15

    .line 822
    move/from16 v5, v22

    .line 823
    .line 824
    move/from16 v8, v23

    .line 825
    .line 826
    move/from16 v9, v29

    .line 827
    .line 828
    move/from16 v10, v30

    .line 829
    .line 830
    move/from16 v11, v31

    .line 831
    .line 832
    move v4, v1

    .line 833
    goto/16 :goto_f

    .line 834
    .line 835
    :cond_2b
    const-string v0, " does not fit into an Int, which is required for component \'D\'"

    .line 836
    .line 837
    invoke-static {v5, v6, v9, v0}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    return-object v24

    .line 845
    :cond_2c
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 846
    .line 847
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    throw v0

    .line 855
    :cond_2d
    add-int/lit8 v7, v14, 0x1

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 858
    .line 859
    .line 860
    move-result v8

    .line 861
    if-ge v7, v8, :cond_33

    .line 862
    .line 863
    move v14, v7

    .line 864
    :goto_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 865
    .line 866
    .line 867
    move-result v8

    .line 868
    if-ge v14, v8, :cond_2e

    .line 869
    .line 870
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 871
    .line 872
    .line 873
    move-result v8

    .line 874
    const/16 v11, 0x30

    .line 875
    .line 876
    if-gt v11, v8, :cond_2e

    .line 877
    .line 878
    const/16 v12, 0x3a

    .line 879
    .line 880
    if-ge v8, v12, :cond_2e

    .line 881
    .line 882
    add-int/lit8 v14, v14, 0x1

    .line 883
    .line 884
    goto :goto_e

    .line 885
    :cond_2e
    sub-int v8, v14, v7

    .line 886
    .line 887
    const/16 v11, 0x9

    .line 888
    .line 889
    if-gt v8, v11, :cond_32

    .line 890
    .line 891
    new-instance v11, Ljava/lang/StringBuilder;

    .line 892
    .line 893
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v7, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v7

    .line 900
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    rsub-int/lit8 v7, v8, 0x9

    .line 904
    .line 905
    const-string v8, "0"

    .line 906
    .line 907
    invoke-static {v7, v8}, Lk57;->q0(ILjava/lang/String;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v7

    .line 918
    const/16 v8, 0xa

    .line 919
    .line 920
    invoke-static {v8}, Lrd3;->i(I)V

    .line 921
    .line 922
    .line 923
    invoke-static {v7, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 924
    .line 925
    .line 926
    move-result v7

    .line 927
    mul-int v7, v7, v26

    .line 928
    .line 929
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 930
    .line 931
    .line 932
    move-result v8

    .line 933
    const/16 v11, 0x53

    .line 934
    .line 935
    if-ne v8, v11, :cond_31

    .line 936
    .line 937
    const/16 v11, 0x9

    .line 938
    .line 939
    if-ge v3, v11, :cond_30

    .line 940
    .line 941
    const/4 v8, 0x6

    .line 942
    if-lt v3, v8, :cond_30

    .line 943
    .line 944
    cmp-long v2, v5, v19

    .line 945
    .line 946
    if-ltz v2, :cond_2f

    .line 947
    .line 948
    cmp-long v2, v5, v17

    .line 949
    .line 950
    if-gtz v2, :cond_2f

    .line 951
    .line 952
    long-to-int v1, v5

    .line 953
    move v12, v7

    .line 954
    move v3, v11

    .line 955
    move v7, v15

    .line 956
    move/from16 v5, v22

    .line 957
    .line 958
    move/from16 v8, v23

    .line 959
    .line 960
    move/from16 v4, v25

    .line 961
    .line 962
    move/from16 v9, v29

    .line 963
    .line 964
    move/from16 v10, v30

    .line 965
    .line 966
    move v11, v1

    .line 967
    :goto_f
    add-int/lit8 v1, v14, 0x1

    .line 968
    .line 969
    move/from16 v6, v21

    .line 970
    .line 971
    goto/16 :goto_0

    .line 972
    .line 973
    :cond_2f
    invoke-static {v5, v6, v9, v4}, Lf21;->g(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    invoke-static {v1, v0}, Lta1;->g(ILjava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    return-object v24

    .line 981
    :cond_30
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 982
    .line 983
    invoke-static {v14, v2, v10}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    throw v0

    .line 991
    :cond_31
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 992
    .line 993
    const-string v1, ": Expected the \'S\' designator after a fraction"

    .line 994
    .line 995
    invoke-static {v14, v2, v1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    throw v0

    .line 1003
    :cond_32
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 1004
    .line 1005
    const-string v1, ": Only the nanosecond fractions of a second are supported"

    .line 1006
    .line 1007
    invoke-static {v7, v2, v1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    throw v0

    .line 1015
    :cond_33
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 1016
    .line 1017
    .line 1018
    move-result v0

    .line 1019
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    const-string v3, "Expected designator \'S\' after "

    .line 1022
    .line 1023
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    new-instance v1, Lkotlinx/datetime/DateTimeFormatException;

    .line 1034
    .line 1035
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    const-string v2, ": "

    .line 1044
    .line 1045
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    throw v1

    .line 1059
    :cond_34
    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    .line 1060
    .line 1061
    invoke-static {v14, v2, v8}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    throw v0

    .line 1069
    :cond_35
    const-string v1, "A number expected after \'"

    .line 1070
    .line 1071
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 1072
    .line 1073
    .line 1074
    move-result v0

    .line 1075
    invoke-static {v0, v14, v1}, Lta1;->f(IILjava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    return-object v24
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


# virtual methods
.method public final serializer()Lzr3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzr3;"
        }
    .end annotation

    .line 1
    sget-object p0, Lyi1;->b:Lyi1;

    .line 2
    .line 3
    return-object p0
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
