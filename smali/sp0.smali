.class public abstract Lsp0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lkp0;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkp0;

    .line 2
    .line 3
    sget v1, Lg77;->a:F

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkp0;-><init>(F)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsp0;->a:Lkp0;

    .line 9
    .line 10
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 11
    .line 12
    sput v0, Lsp0;->b:F

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lfw0;Ltg7;JLgs2;JJFLtr;Lla5;Lje2;Lje2;Lje2;Lje2;Lyt2;I)V
    .locals 26

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-wide/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p16

    .line 6
    .line 7
    const v1, -0x4ace862e

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lyt2;->g0(I)Lyt2;

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v5, 0x2

    .line 24
    :goto_0
    or-int v5, p17, v5

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-eqz v8, :cond_1

    .line 31
    .line 32
    const/16 v8, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v8, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v5, v8

    .line 38
    invoke-virtual {v0, v3, v4}, Lyt2;->f(J)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_2

    .line 43
    .line 44
    const/16 v8, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v8, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v5, v8

    .line 50
    move-object/from16 v8, p4

    .line 51
    .line 52
    invoke-virtual {v0, v8}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_3

    .line 57
    .line 58
    const/16 v13, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v13, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v5, v13

    .line 64
    const/4 v13, 0x0

    .line 65
    invoke-virtual {v0, v13}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v16

    .line 69
    const/16 v17, 0x2000

    .line 70
    .line 71
    const/16 v18, 0x4000

    .line 72
    .line 73
    if-eqz v16, :cond_4

    .line 74
    .line 75
    move/from16 v16, v18

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    move/from16 v16, v17

    .line 79
    .line 80
    :goto_4
    or-int v5, v5, v16

    .line 81
    .line 82
    invoke-virtual {v0, v13}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_5

    .line 87
    .line 88
    const/high16 v13, 0x20000

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    const/high16 v13, 0x10000

    .line 92
    .line 93
    :goto_5
    or-int/2addr v5, v13

    .line 94
    move-wide/from16 v6, p5

    .line 95
    .line 96
    invoke-virtual {v0, v6, v7}, Lyt2;->f(J)Z

    .line 97
    .line 98
    .line 99
    move-result v19

    .line 100
    if-eqz v19, :cond_6

    .line 101
    .line 102
    const/high16 v19, 0x100000

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_6
    const/high16 v19, 0x80000

    .line 106
    .line 107
    :goto_6
    or-int v5, v5, v19

    .line 108
    .line 109
    move-wide/from16 v9, p7

    .line 110
    .line 111
    invoke-virtual {v0, v9, v10}, Lyt2;->f(J)Z

    .line 112
    .line 113
    .line 114
    move-result v21

    .line 115
    if-eqz v21, :cond_7

    .line 116
    .line 117
    const/high16 v21, 0x800000

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_7
    const/high16 v21, 0x400000

    .line 121
    .line 122
    :goto_7
    or-int v5, v5, v21

    .line 123
    .line 124
    move/from16 v11, p9

    .line 125
    .line 126
    invoke-virtual {v0, v11}, Lyt2;->d(F)Z

    .line 127
    .line 128
    .line 129
    move-result v22

    .line 130
    if-eqz v22, :cond_8

    .line 131
    .line 132
    const/high16 v22, 0x4000000

    .line 133
    .line 134
    goto :goto_8

    .line 135
    :cond_8
    const/high16 v22, 0x2000000

    .line 136
    .line 137
    :goto_8
    or-int v5, v5, v22

    .line 138
    .line 139
    move-object/from16 v12, p10

    .line 140
    .line 141
    invoke-virtual {v0, v12}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v23

    .line 145
    if-eqz v23, :cond_9

    .line 146
    .line 147
    const/high16 v23, 0x20000000

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_9
    const/high16 v23, 0x10000000

    .line 151
    .line 152
    :goto_9
    or-int v5, v5, v23

    .line 153
    .line 154
    move-object/from16 v13, p11

    .line 155
    .line 156
    invoke-virtual {v0, v13}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v24

    .line 160
    if-eqz v24, :cond_a

    .line 161
    .line 162
    const/16 v16, 0x4

    .line 163
    .line 164
    :goto_a
    move-object/from16 v11, p12

    .line 165
    .line 166
    goto :goto_b

    .line 167
    :cond_a
    const/16 v16, 0x2

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :goto_b
    invoke-virtual {v0, v11}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v23

    .line 174
    if-eqz v23, :cond_b

    .line 175
    .line 176
    const/16 v19, 0x20

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :cond_b
    const/16 v19, 0x10

    .line 180
    .line 181
    :goto_c
    or-int v16, v16, v19

    .line 182
    .line 183
    move-object/from16 v14, p13

    .line 184
    .line 185
    invoke-virtual {v0, v14}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v20

    .line 189
    if-eqz v20, :cond_c

    .line 190
    .line 191
    const/16 v21, 0x100

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_c
    const/16 v21, 0x80

    .line 195
    .line 196
    :goto_d
    or-int v16, v16, v21

    .line 197
    .line 198
    move-object/from16 v15, p14

    .line 199
    .line 200
    invoke-virtual {v0, v15}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v21

    .line 204
    if-eqz v21, :cond_d

    .line 205
    .line 206
    const/16 v19, 0x800

    .line 207
    .line 208
    goto :goto_e

    .line 209
    :cond_d
    const/16 v19, 0x400

    .line 210
    .line 211
    :goto_e
    or-int v16, v16, v19

    .line 212
    .line 213
    move-object/from16 v1, p15

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v19

    .line 219
    if-eqz v19, :cond_e

    .line 220
    .line 221
    move/from16 v17, v18

    .line 222
    .line 223
    :cond_e
    or-int v1, v16, v17

    .line 224
    .line 225
    const v16, 0x12492493

    .line 226
    .line 227
    .line 228
    move/from16 v17, v5

    .line 229
    .line 230
    and-int v5, v17, v16

    .line 231
    .line 232
    const v6, 0x12492492

    .line 233
    .line 234
    .line 235
    const/4 v7, 0x1

    .line 236
    if-ne v5, v6, :cond_10

    .line 237
    .line 238
    and-int/lit16 v1, v1, 0x2493

    .line 239
    .line 240
    const/16 v5, 0x2492

    .line 241
    .line 242
    if-eq v1, v5, :cond_f

    .line 243
    .line 244
    goto :goto_f

    .line 245
    :cond_f
    const/4 v1, 0x0

    .line 246
    goto :goto_10

    .line 247
    :cond_10
    :goto_f
    move v1, v7

    .line 248
    :goto_10
    and-int/lit8 v5, v17, 0x1

    .line 249
    .line 250
    invoke-virtual {v0, v5, v1}, Lyt2;->V(IZ)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_11

    .line 255
    .line 256
    sget-object v1, Lj41;->a:Lyy0;

    .line 257
    .line 258
    invoke-static {v3, v4, v1}, Lb81;->g(JLyy0;)Lju5;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    sget-object v5, Lyf7;->a:Lyy0;

    .line 263
    .line 264
    invoke-virtual {v5, v2}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    filled-new-array {v1, v5}, [Lju5;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v5, Lpp0;

    .line 273
    .line 274
    move-object/from16 v16, p0

    .line 275
    .line 276
    move/from16 v6, p9

    .line 277
    .line 278
    move-wide/from16 v17, v9

    .line 279
    .line 280
    move-object v7, v13

    .line 281
    move-object v13, v14

    .line 282
    move-object v10, v15

    .line 283
    move-wide/from16 v14, p5

    .line 284
    .line 285
    move-object v9, v8

    .line 286
    move-object v8, v12

    .line 287
    move-object/from16 v12, p15

    .line 288
    .line 289
    invoke-direct/range {v5 .. v18}, Lpp0;-><init>(FLla5;Ltr;Lgs2;Lje2;Lje2;Lje2;Lje2;JLfw0;J)V

    .line 290
    .line 291
    .line 292
    const v6, -0x348d516e    # -1.5904402E7f

    .line 293
    .line 294
    .line 295
    invoke-static {v6, v5, v0}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    const/16 v6, 0x38

    .line 300
    .line 301
    invoke-static {v1, v5, v0, v6}, Lt49;->d([Lju5;Lgs2;Lyt2;I)V

    .line 302
    .line 303
    .line 304
    goto :goto_11

    .line 305
    :cond_11
    invoke-virtual {v0}, Lyt2;->Y()V

    .line 306
    .line 307
    .line 308
    :goto_11
    invoke-virtual {v0}, Lyt2;->v()Lyx5;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-eqz v0, :cond_12

    .line 313
    .line 314
    move-object v1, v0

    .line 315
    new-instance v0, Lqp0;

    .line 316
    .line 317
    move-object/from16 v5, p4

    .line 318
    .line 319
    move-wide/from16 v6, p5

    .line 320
    .line 321
    move-wide/from16 v8, p7

    .line 322
    .line 323
    move/from16 v10, p9

    .line 324
    .line 325
    move-object/from16 v11, p10

    .line 326
    .line 327
    move-object/from16 v12, p11

    .line 328
    .line 329
    move-object/from16 v13, p12

    .line 330
    .line 331
    move-object/from16 v14, p13

    .line 332
    .line 333
    move-object/from16 v15, p14

    .line 334
    .line 335
    move-object/from16 v16, p15

    .line 336
    .line 337
    move/from16 v17, p17

    .line 338
    .line 339
    move-object/from16 v25, v1

    .line 340
    .line 341
    move-object/from16 v1, p0

    .line 342
    .line 343
    invoke-direct/range {v0 .. v17}, Lqp0;-><init>(Lfw0;Ltg7;JLgs2;JJFLtr;Lla5;Lje2;Lje2;Lje2;Lje2;I)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v1, v25

    .line 347
    .line 348
    iput-object v0, v1, Lyx5;->d:Lgs2;

    .line 349
    .line 350
    :cond_12
    return-void
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
.end method

.method public static final b(ZLsr2;Lfw0;Lml4;ZLgs2;Lpq6;Lcj6;Ldj6;Lua0;Ltr;Lla5;Lyt2;II)V
    .locals 17

    .line 1
    move-object/from16 v14, p12

    .line 2
    .line 3
    move/from16 v0, p14

    .line 4
    .line 5
    const v1, 0x5a127807

    .line 6
    .line 7
    .line 8
    invoke-virtual {v14, v1}, Lyt2;->g0(I)Lyt2;

    .line 9
    .line 10
    .line 11
    move/from16 v1, p0

    .line 12
    .line 13
    invoke-virtual {v14, v1}, Lyt2;->h(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x4

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v3

    .line 24
    :goto_0
    or-int v2, p13, v2

    .line 25
    .line 26
    and-int/lit8 v5, p13, 0x30

    .line 27
    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    move-object/from16 v5, p1

    .line 31
    .line 32
    invoke-virtual {v14, v5}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    const/16 v6, 0x20

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v6, 0x10

    .line 42
    .line 43
    :goto_1
    or-int/2addr v2, v6

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object/from16 v5, p1

    .line 46
    .line 47
    :goto_2
    or-int/lit16 v6, v2, 0x6c00

    .line 48
    .line 49
    and-int/lit8 v7, v0, 0x20

    .line 50
    .line 51
    if-eqz v7, :cond_4

    .line 52
    .line 53
    const v6, 0x36c00

    .line 54
    .line 55
    .line 56
    or-int/2addr v6, v2

    .line 57
    :cond_3
    move-object/from16 v2, p5

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    const/high16 v2, 0x30000

    .line 61
    .line 62
    and-int v2, p13, v2

    .line 63
    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    move-object/from16 v2, p5

    .line 67
    .line 68
    invoke-virtual {v14, v2}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_5

    .line 73
    .line 74
    const/high16 v8, 0x20000

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/high16 v8, 0x10000

    .line 78
    .line 79
    :goto_3
    or-int/2addr v6, v8

    .line 80
    :goto_4
    const/high16 v8, 0x180000

    .line 81
    .line 82
    or-int/2addr v6, v8

    .line 83
    and-int/lit16 v8, v0, 0x80

    .line 84
    .line 85
    if-nez v8, :cond_6

    .line 86
    .line 87
    move-object/from16 v8, p6

    .line 88
    .line 89
    invoke-virtual {v14, v8}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-eqz v9, :cond_7

    .line 94
    .line 95
    const/high16 v9, 0x800000

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object/from16 v8, p6

    .line 99
    .line 100
    :cond_7
    const/high16 v9, 0x400000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v6, v9

    .line 103
    and-int/lit16 v9, v0, 0x100

    .line 104
    .line 105
    if-nez v9, :cond_8

    .line 106
    .line 107
    move-object/from16 v9, p7

    .line 108
    .line 109
    invoke-virtual {v14, v9}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_9

    .line 114
    .line 115
    const/high16 v10, 0x4000000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    move-object/from16 v9, p7

    .line 119
    .line 120
    :cond_9
    const/high16 v10, 0x2000000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v6, v10

    .line 123
    const/high16 v10, 0x10000000

    .line 124
    .line 125
    or-int/2addr v6, v10

    .line 126
    and-int/lit16 v10, v0, 0x400

    .line 127
    .line 128
    if-nez v10, :cond_a

    .line 129
    .line 130
    move-object/from16 v10, p9

    .line 131
    .line 132
    invoke-virtual {v14, v10}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_b

    .line 137
    .line 138
    move v3, v4

    .line 139
    goto :goto_7

    .line 140
    :cond_a
    move-object/from16 v10, p9

    .line 141
    .line 142
    :cond_b
    :goto_7
    const/16 v4, 0xd90

    .line 143
    .line 144
    or-int/2addr v3, v4

    .line 145
    const v11, 0x12492493

    .line 146
    .line 147
    .line 148
    and-int/2addr v11, v6

    .line 149
    const v12, 0x12492492

    .line 150
    .line 151
    .line 152
    const/4 v13, 0x1

    .line 153
    if-ne v11, v12, :cond_d

    .line 154
    .line 155
    and-int/lit16 v11, v3, 0x493

    .line 156
    .line 157
    const/16 v12, 0x492

    .line 158
    .line 159
    if-eq v11, v12, :cond_c

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_c
    const/4 v11, 0x0

    .line 163
    goto :goto_9

    .line 164
    :cond_d
    :goto_8
    move v11, v13

    .line 165
    :goto_9
    and-int/lit8 v12, v6, 0x1

    .line 166
    .line 167
    invoke-virtual {v14, v12, v11}, Lyt2;->V(IZ)Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_17

    .line 172
    .line 173
    invoke-virtual {v14}, Lyt2;->a0()V

    .line 174
    .line 175
    .line 176
    and-int/lit8 v11, p13, 0x1

    .line 177
    .line 178
    const v12, -0x70000001

    .line 179
    .line 180
    .line 181
    const v15, -0xe000001

    .line 182
    .line 183
    .line 184
    const v16, -0x1c00001

    .line 185
    .line 186
    .line 187
    if-eqz v11, :cond_12

    .line 188
    .line 189
    invoke-virtual {v14}, Lyt2;->C()Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eqz v11, :cond_e

    .line 194
    .line 195
    goto :goto_b

    .line 196
    :cond_e
    invoke-virtual {v14}, Lyt2;->Y()V

    .line 197
    .line 198
    .line 199
    and-int/lit16 v7, v0, 0x80

    .line 200
    .line 201
    if-eqz v7, :cond_f

    .line 202
    .line 203
    and-int v6, v6, v16

    .line 204
    .line 205
    :cond_f
    and-int/lit16 v7, v0, 0x100

    .line 206
    .line 207
    if-eqz v7, :cond_10

    .line 208
    .line 209
    and-int/2addr v6, v15

    .line 210
    :cond_10
    and-int/2addr v6, v12

    .line 211
    and-int/lit16 v7, v0, 0x400

    .line 212
    .line 213
    if-eqz v7, :cond_11

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_11
    move v4, v3

    .line 217
    :goto_a
    and-int/lit8 v3, v4, -0x71

    .line 218
    .line 219
    move-object/from16 v1, p3

    .line 220
    .line 221
    move-object/from16 v12, p10

    .line 222
    .line 223
    move-object/from16 v13, p11

    .line 224
    .line 225
    move v4, v6

    .line 226
    move-object v7, v8

    .line 227
    move-object v8, v9

    .line 228
    move-object/from16 v9, p8

    .line 229
    .line 230
    move-object v6, v2

    .line 231
    move v2, v3

    .line 232
    move/from16 v3, p4

    .line 233
    .line 234
    goto/16 :goto_f

    .line 235
    .line 236
    :cond_12
    :goto_b
    if-eqz v7, :cond_13

    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    :cond_13
    and-int/lit16 v7, v0, 0x80

    .line 240
    .line 241
    if-eqz v7, :cond_14

    .line 242
    .line 243
    sget v7, Lud2;->a:F

    .line 244
    .line 245
    sget-object v7, Lh03;->W:Lvq6;

    .line 246
    .line 247
    invoke-static {v7, v14}, Lhr6;->a(Lvq6;Lyt2;)Lpq6;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    and-int v6, v6, v16

    .line 252
    .line 253
    goto :goto_c

    .line 254
    :cond_14
    move-object v7, v8

    .line 255
    :goto_c
    and-int/lit16 v8, v0, 0x100

    .line 256
    .line 257
    if-eqz v8, :cond_15

    .line 258
    .line 259
    sget v8, Lud2;->a:F

    .line 260
    .line 261
    sget-object v8, Lch4;->b:Lt37;

    .line 262
    .line 263
    invoke-virtual {v14, v8}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    check-cast v8, Lzg4;

    .line 268
    .line 269
    iget-object v8, v8, Lzg4;->a:Lqt0;

    .line 270
    .line 271
    invoke-static {v8}, Lud2;->b(Lqt0;)Lcj6;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    and-int/2addr v6, v15

    .line 276
    goto :goto_d

    .line 277
    :cond_15
    move-object v8, v9

    .line 278
    :goto_d
    sget v9, Lud2;->a:F

    .line 279
    .line 280
    sget v9, Lh03;->f0:F

    .line 281
    .line 282
    sget v11, Lh03;->Z:F

    .line 283
    .line 284
    new-instance v15, Ldj6;

    .line 285
    .line 286
    invoke-direct {v15, v9, v11}, Ldj6;-><init>(FF)V

    .line 287
    .line 288
    .line 289
    and-int/2addr v6, v12

    .line 290
    and-int/lit16 v9, v0, 0x400

    .line 291
    .line 292
    if-eqz v9, :cond_16

    .line 293
    .line 294
    const-wide/16 v9, 0x0

    .line 295
    .line 296
    const/16 v3, 0xfc

    .line 297
    .line 298
    const-wide/16 v11, 0x0

    .line 299
    .line 300
    move/from16 p3, v1

    .line 301
    .line 302
    move/from16 p9, v3

    .line 303
    .line 304
    move-wide/from16 p6, v9

    .line 305
    .line 306
    move-wide/from16 p4, v11

    .line 307
    .line 308
    move-object/from16 p8, v14

    .line 309
    .line 310
    invoke-static/range {p3 .. p9}, Lud2;->a(ZJJLyt2;I)Lua0;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    goto :goto_e

    .line 315
    :cond_16
    move v4, v3

    .line 316
    move-object v1, v10

    .line 317
    :goto_e
    and-int/lit8 v3, v4, -0x71

    .line 318
    .line 319
    sget-object v4, Lud2;->b:Lpa5;

    .line 320
    .line 321
    sget-object v9, Ljl4;->w:Ljl4;

    .line 322
    .line 323
    sget-object v10, Lsp0;->a:Lkp0;

    .line 324
    .line 325
    move v12, v6

    .line 326
    move-object v6, v2

    .line 327
    move v2, v3

    .line 328
    move v3, v13

    .line 329
    move-object v13, v4

    .line 330
    move v4, v12

    .line 331
    move-object v12, v10

    .line 332
    move-object v10, v1

    .line 333
    move-object v1, v9

    .line 334
    move-object v9, v15

    .line 335
    :goto_f
    invoke-virtual {v14}, Lyt2;->s()V

    .line 336
    .line 337
    .line 338
    sget-object v11, Lh03;->i0:Lcr7;

    .line 339
    .line 340
    invoke-static {v11, v14}, Ldr7;->a(Lcr7;Lyt2;)Ltg7;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    sget v15, Lud2;->a:F

    .line 345
    .line 346
    and-int/lit8 v15, v4, 0xe

    .line 347
    .line 348
    const v16, 0xc00030

    .line 349
    .line 350
    .line 351
    or-int v15, v15, v16

    .line 352
    .line 353
    shl-int/lit8 v0, v4, 0x3

    .line 354
    .line 355
    move-object/from16 p3, v1

    .line 356
    .line 357
    and-int/lit16 v1, v0, 0x380

    .line 358
    .line 359
    or-int/2addr v1, v15

    .line 360
    shl-int/lit8 v15, v4, 0x6

    .line 361
    .line 362
    or-int/lit16 v1, v1, 0x6c00

    .line 363
    .line 364
    const/high16 v16, 0x380000

    .line 365
    .line 366
    and-int v0, v0, v16

    .line 367
    .line 368
    or-int/2addr v0, v1

    .line 369
    const/high16 v1, 0x6000000

    .line 370
    .line 371
    or-int/2addr v0, v1

    .line 372
    const/high16 v1, 0x70000000

    .line 373
    .line 374
    and-int/2addr v1, v15

    .line 375
    or-int v15, v0, v1

    .line 376
    .line 377
    shr-int/lit8 v0, v4, 0x18

    .line 378
    .line 379
    and-int/lit8 v0, v0, 0xe

    .line 380
    .line 381
    or-int/lit16 v0, v0, 0xc00

    .line 382
    .line 383
    shl-int/lit8 v1, v2, 0x6

    .line 384
    .line 385
    and-int/lit16 v1, v1, 0x380

    .line 386
    .line 387
    or-int/2addr v0, v1

    .line 388
    const/high16 v1, 0x1b0000

    .line 389
    .line 390
    or-int v16, v0, v1

    .line 391
    .line 392
    move-object v5, v11

    .line 393
    const/high16 v11, 0x42000000    # 32.0f

    .line 394
    .line 395
    move/from16 v0, p0

    .line 396
    .line 397
    move-object/from16 v2, p1

    .line 398
    .line 399
    move-object/from16 v4, p2

    .line 400
    .line 401
    move-object/from16 v1, p3

    .line 402
    .line 403
    invoke-static/range {v0 .. v16}, Lsp0;->c(ZLml4;Lsr2;ZLfw0;Ltg7;Lgs2;Lpq6;Lcj6;Ldj6;Lua0;FLtr;Lla5;Lyt2;II)V

    .line 404
    .line 405
    .line 406
    move-object v4, v1

    .line 407
    move v5, v3

    .line 408
    move-object v11, v12

    .line 409
    move-object v12, v13

    .line 410
    goto :goto_10

    .line 411
    :cond_17
    invoke-virtual/range {p12 .. p12}, Lyt2;->Y()V

    .line 412
    .line 413
    .line 414
    move-object/from16 v4, p3

    .line 415
    .line 416
    move/from16 v5, p4

    .line 417
    .line 418
    move-object/from16 v11, p10

    .line 419
    .line 420
    move-object/from16 v12, p11

    .line 421
    .line 422
    move-object v6, v2

    .line 423
    move-object v7, v8

    .line 424
    move-object v8, v9

    .line 425
    move-object/from16 v9, p8

    .line 426
    .line 427
    :goto_10
    invoke-virtual/range {p12 .. p12}, Lyt2;->v()Lyx5;

    .line 428
    .line 429
    .line 430
    move-result-object v15

    .line 431
    if-eqz v15, :cond_18

    .line 432
    .line 433
    new-instance v0, Lmp0;

    .line 434
    .line 435
    move/from16 v1, p0

    .line 436
    .line 437
    move-object/from16 v2, p1

    .line 438
    .line 439
    move-object/from16 v3, p2

    .line 440
    .line 441
    move/from16 v13, p13

    .line 442
    .line 443
    move/from16 v14, p14

    .line 444
    .line 445
    invoke-direct/range {v0 .. v14}, Lmp0;-><init>(ZLsr2;Lfw0;Lml4;ZLgs2;Lpq6;Lcj6;Ldj6;Lua0;Ltr;Lla5;II)V

    .line 446
    .line 447
    .line 448
    iput-object v0, v15, Lyx5;->d:Lgs2;

    .line 449
    .line 450
    :cond_18
    return-void
    .line 451
    .line 452
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
.end method

.method public static final c(ZLml4;Lsr2;ZLfw0;Ltg7;Lgs2;Lpq6;Lcj6;Ldj6;Lua0;FLtr;Lla5;Lyt2;II)V
    .locals 34

    move/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v4, p3

    move-object/from16 v9, p8

    move-object/from16 v11, p9

    move-object/from16 v13, p14

    move/from16 v12, p15

    move/from16 v14, p16

    const v1, 0x17e0eb2e

    .line 1
    invoke-virtual {v13, v1}, Lyt2;->g0(I)Lyt2;

    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v13, v0}, Lyt2;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v10}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_3
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v13, v5}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    const/16 v16, 0x100

    goto :goto_3

    :cond_4
    const/16 v16, 0x80

    :goto_3
    or-int v1, v1, v16

    goto :goto_4

    :cond_5
    move-object/from16 v5, p2

    :goto_4
    and-int/lit16 v6, v12, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v6, :cond_7

    invoke-virtual {v13, v4}, Lyt2;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_6

    move/from16 v6, v18

    goto :goto_5

    :cond_6
    move/from16 v6, v17

    :goto_5
    or-int/2addr v1, v6

    :cond_7
    and-int/lit16 v6, v12, 0x6000

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-nez v6, :cond_9

    move-object/from16 v6, p4

    invoke-virtual {v13, v6}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_8

    move/from16 v21, v20

    goto :goto_6

    :cond_8
    move/from16 v21, v19

    :goto_6
    or-int v1, v1, v21

    goto :goto_7

    :cond_9
    move-object/from16 v6, p4

    :goto_7
    const/high16 v21, 0x30000

    and-int v22, v12, v21

    const/high16 v23, 0x10000

    const/high16 v24, 0x20000

    move-object/from16 v8, p5

    if-nez v22, :cond_b

    invoke-virtual {v13, v8}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_a

    move/from16 v25, v24

    goto :goto_8

    :cond_a
    move/from16 v25, v23

    :goto_8
    or-int v1, v1, v25

    :cond_b
    const/high16 v25, 0x180000

    and-int v26, v12, v25

    const/high16 v27, 0x80000

    const/high16 v28, 0x100000

    move-object/from16 v15, p6

    if-nez v26, :cond_d

    invoke-virtual {v13, v15}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_c

    move/from16 v29, v28

    goto :goto_9

    :cond_c
    move/from16 v29, v27

    :goto_9
    or-int v1, v1, v29

    :cond_d
    const/high16 v29, 0xc00000

    and-int v29, v12, v29

    const/4 v7, 0x0

    if-nez v29, :cond_f

    invoke-virtual {v13, v7}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v29, 0x400000

    :goto_a
    or-int v1, v1, v29

    :cond_f
    const/high16 v29, 0x6000000

    and-int v29, v12, v29

    if-nez v29, :cond_11

    invoke-virtual {v13, v7}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v29, 0x2000000

    :goto_b
    or-int v1, v1, v29

    :cond_11
    const/high16 v29, 0x30000000

    and-int v29, v12, v29

    move-object/from16 v3, p7

    if-nez v29, :cond_13

    invoke-virtual {v13, v3}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_12

    const/high16 v31, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v31, 0x10000000

    :goto_c
    or-int v1, v1, v31

    :cond_13
    and-int/lit8 v31, v14, 0x6

    if-nez v31, :cond_15

    invoke-virtual {v13, v9}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_14

    const/16 v31, 0x4

    goto :goto_d

    :cond_14
    const/16 v31, 0x2

    :goto_d
    or-int v31, v14, v31

    goto :goto_e

    :cond_15
    move/from16 v31, v14

    :goto_e
    and-int/lit8 v32, v14, 0x30

    if-nez v32, :cond_17

    invoke-virtual {v13, v11}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_16

    const/16 v16, 0x20

    goto :goto_f

    :cond_16
    const/16 v16, 0x10

    :goto_f
    or-int v31, v31, v16

    :cond_17
    and-int/lit16 v2, v14, 0x180

    if-nez v2, :cond_19

    move-object/from16 v2, p10

    invoke-virtual {v13, v2}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_18

    const/16 v22, 0x100

    goto :goto_10

    :cond_18
    const/16 v22, 0x80

    :goto_10
    or-int v31, v31, v22

    goto :goto_11

    :cond_19
    move-object/from16 v2, p10

    :goto_11
    and-int/lit16 v7, v14, 0xc00

    if-nez v7, :cond_1b

    move/from16 v7, p11

    invoke-virtual {v13, v7}, Lyt2;->d(F)Z

    move-result v26

    if-eqz v26, :cond_1a

    move/from16 v17, v18

    :cond_1a
    or-int v31, v31, v17

    goto :goto_12

    :cond_1b
    move/from16 v7, p11

    :goto_12
    and-int/lit16 v0, v14, 0x6000

    if-nez v0, :cond_1d

    move-object/from16 v0, p12

    invoke-virtual {v13, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1c

    move/from16 v19, v20

    :cond_1c
    or-int v31, v31, v19

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p12

    :goto_13
    and-int v17, v14, v21

    move-object/from16 v7, p13

    if-nez v17, :cond_1f

    invoke-virtual {v13, v7}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1e

    move/from16 v23, v24

    :cond_1e
    or-int v31, v31, v23

    :cond_1f
    and-int v17, v14, v25

    if-nez v17, :cond_21

    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_20

    move/from16 v27, v28

    :cond_20
    or-int v31, v31, v27

    :cond_21
    const v0, 0x12492493

    and-int/2addr v0, v1

    move/from16 v17, v1

    const v1, 0x12492492

    const/16 v18, 0x1

    const/4 v7, 0x0

    if-ne v0, v1, :cond_23

    const v0, 0x92493

    and-int v0, v31, v0

    const v1, 0x92492

    if-eq v0, v1, :cond_22

    goto :goto_14

    :cond_22
    move v0, v7

    goto :goto_15

    :cond_23
    :goto_14
    move/from16 v0, v18

    :goto_15
    and-int/lit8 v1, v17, 0x1

    invoke-virtual {v13, v1, v0}, Lyt2;->V(IZ)Z

    move-result v0

    if-eqz v0, :cond_3c

    invoke-virtual {v13}, Lyt2;->a0()V

    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_25

    invoke-virtual {v13}, Lyt2;->C()Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_16

    .line 2
    :cond_24
    invoke-virtual {v13}, Lyt2;->Y()V

    :cond_25
    :goto_16
    invoke-virtual {v13}, Lyt2;->s()V

    const v0, -0x38ed1633

    .line 3
    invoke-virtual {v13, v0}, Lyt2;->e0(I)V

    .line 4
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v0

    .line 5
    sget-object v1, Lay0;->a:Ld63;

    if-ne v0, v1, :cond_26

    .line 6
    invoke-static {v13}, Lb81;->e(Lyt2;)Lap4;

    move-result-object v0

    .line 7
    :cond_26
    check-cast v0, Lap4;

    .line 8
    invoke-virtual {v13, v7}, Lyt2;->r(Z)V

    .line 9
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_27

    .line 10
    new-instance v7, Lj5;

    const/16 v2, 0x16

    invoke-direct {v7, v2}, Lj5;-><init>(I)V

    .line 11
    invoke-virtual {v13, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 12
    :cond_27
    check-cast v7, Lvr2;

    const/4 v2, 0x0

    .line 13
    invoke-static {v10, v2, v7}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    move-result-object v20

    if-nez v4, :cond_29

    if-eqz p0, :cond_28

    .line 14
    iget-wide v2, v9, Lcj6;->j:J

    :goto_17
    move-wide/from16 v23, v2

    goto :goto_18

    :cond_28
    iget-wide v2, v9, Lcj6;->e:J

    goto :goto_17

    :cond_29
    if-nez p0, :cond_2a

    .line 15
    iget-wide v2, v9, Lcj6;->a:J

    goto :goto_17

    .line 16
    :cond_2a
    iget-wide v2, v9, Lcj6;->i:J

    goto :goto_17

    :goto_18
    const/16 v21, 0x0

    if-nez v11, :cond_2b

    const v1, -0x38e84578

    .line 17
    invoke-virtual {v13, v1}, Lyt2;->e0(I)V

    const/4 v2, 0x0

    .line 18
    invoke-virtual {v13, v2}, Lyt2;->r(Z)V

    move-object/from16 v16, v0

    const/4 v7, 0x0

    goto/16 :goto_22

    :cond_2b
    const/4 v2, 0x0

    const v3, -0x5caca767

    .line 19
    invoke-virtual {v13, v3}, Lyt2;->e0(I)V

    shr-int/lit8 v3, v17, 0x9

    and-int/lit8 v3, v3, 0xe

    shl-int/lit8 v7, v31, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v3, v7

    .line 20
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_2c

    .line 21
    new-instance v7, Lyx6;

    invoke-direct {v7}, Lyx6;-><init>()V

    .line 22
    invoke-virtual {v13, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 23
    :cond_2c
    check-cast v7, Lyx6;

    .line 24
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2d

    const/16 v22, 0x0

    .line 25
    invoke-static/range {v22 .. v22}, Lu55;->p(Ljava/lang/Object;)Led5;

    move-result-object v2

    .line 26
    invoke-virtual {v13, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 27
    :cond_2d
    check-cast v2, Laq4;

    .line 28
    invoke-virtual {v13, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v25

    move-object/from16 v26, v2

    .line 29
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v2

    if-nez v25, :cond_2f

    if-ne v2, v1, :cond_2e

    goto :goto_19

    :cond_2e
    move/from16 v25, v3

    goto :goto_1a

    .line 30
    :cond_2f
    :goto_19
    new-instance v2, Lae0;

    move/from16 v25, v3

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v0, v7, v3, v5}, Lae0;-><init>(Lef3;Lyx6;Lf61;I)V

    .line 31
    invoke-virtual {v13, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 32
    :goto_1a
    check-cast v2, Lgs2;

    invoke-static {v2, v13, v0}, Lt49;->h(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 33
    invoke-static {v7}, Ldt0;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ldf3;

    if-nez v4, :cond_31

    :cond_30
    :goto_1b
    move/from16 v3, v21

    goto :goto_1d

    .line 34
    :cond_31
    instance-of v2, v5, Leo5;

    if-eqz v2, :cond_32

    goto :goto_1b

    .line 35
    :cond_32
    instance-of v2, v5, Lr23;

    if-eqz v2, :cond_33

    iget v2, v11, Ldj6;->a:F

    :goto_1c
    move v3, v2

    goto :goto_1d

    .line 36
    :cond_33
    instance-of v2, v5, Ldk2;

    if-eqz v2, :cond_34

    goto :goto_1b

    .line 37
    :cond_34
    instance-of v2, v5, Lvy1;

    if-eqz v2, :cond_30

    iget v2, v11, Ldj6;->b:F

    goto :goto_1c

    .line 38
    :goto_1d
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_35

    .line 39
    new-instance v2, Luj;

    .line 40
    new-instance v7, Llx1;

    invoke-direct {v7, v3}, Llx1;-><init>(F)V

    move-object/from16 v16, v0

    .line 41
    sget-object v0, Lwe;->x:Llo7;

    const/16 v6, 0xc

    const/4 v8, 0x0

    invoke-direct {v2, v7, v0, v8, v6}, Luj;-><init>(Ljava/lang/Object;Llo7;Ljava/lang/Object;I)V

    .line 42
    invoke-virtual {v13, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    goto :goto_1e

    :cond_35
    move-object/from16 v16, v0

    .line 43
    :goto_1e
    check-cast v2, Luj;

    .line 44
    new-instance v0, Llx1;

    invoke-direct {v0, v3}, Llx1;-><init>(F)V

    .line 45
    invoke-virtual {v13, v2}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v13, v3}, Lyt2;->d(F)Z

    move-result v7

    or-int/2addr v6, v7

    and-int/lit8 v7, v25, 0xe

    xor-int/lit8 v7, v7, 0x6

    const/4 v8, 0x4

    if-le v7, v8, :cond_36

    invoke-virtual {v13, v4}, Lyt2;->h(Z)Z

    move-result v7

    if-nez v7, :cond_38

    :cond_36
    and-int/lit8 v7, v25, 0x6

    if-ne v7, v8, :cond_37

    goto :goto_1f

    :cond_37
    const/16 v18, 0x0

    :cond_38
    :goto_1f
    or-int v6, v6, v18

    invoke-virtual {v13, v5}, Lyt2;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 46
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_3a

    if-ne v7, v1, :cond_39

    goto :goto_20

    :cond_39
    const/4 v8, 0x0

    goto :goto_21

    .line 47
    :cond_3a
    :goto_20
    new-instance v1, Lbe0;

    const/4 v7, 0x0

    move-object/from16 v6, v26

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v7}, Lbe0;-><init>(Luj;FZLdf3;Laq4;Lf61;)V

    .line 48
    invoke-virtual {v13, v1}, Lyt2;->o0(Ljava/lang/Object;)V

    move-object v7, v1

    .line 49
    :goto_21
    check-cast v7, Lgs2;

    invoke-static {v7, v13, v0}, Lt49;->h(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 50
    iget-object v7, v2, Luj;->c:Lil;

    .line 51
    invoke-virtual {v13, v8}, Lyt2;->r(Z)V

    :goto_22
    if-eqz v7, :cond_3b

    .line 52
    iget-object v0, v7, Lil;->x:Led5;

    .line 53
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 54
    check-cast v0, Llx1;

    .line 55
    iget v0, v0, Llx1;->w:F

    move/from16 v21, v0

    .line 56
    :cond_3b
    new-instance v0, Lnp0;

    move/from16 v3, p0

    move/from16 v2, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v7, p11

    move-object/from16 v8, p12

    move-object v1, v9

    move-object v6, v15

    move/from16 v15, v17

    move-object/from16 v9, p13

    invoke-direct/range {v0 .. v9}, Lnp0;-><init>(Lcj6;ZZLfw0;Ltg7;Lgs2;FLtr;Lla5;)V

    const v1, -0x4eb4c028

    invoke-static {v1, v0, v13}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    move-result-object v0

    and-int/lit8 v1, v15, 0xe

    shr-int/lit8 v2, v15, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v15, 0x1c00

    or-int/2addr v1, v2

    shr-int/lit8 v2, v15, 0xf

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    shl-int/lit8 v2, v31, 0x15

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const/16 v15, 0xc0

    const-wide/16 v7, 0x0

    move/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v10, p10

    move-object v12, v0

    move v14, v1

    move-object/from16 v11, v16

    move-object/from16 v2, v20

    move/from16 v9, v21

    move-wide/from16 v5, v23

    move/from16 v0, p0

    move-object/from16 v1, p2

    .line 57
    invoke-static/range {v0 .. v15}, Ls87;->b(ZLsr2;Lml4;ZLpq6;JJFLua0;Lap4;Lfw0;Lyt2;II)V

    goto :goto_23

    .line 58
    :cond_3c
    invoke-virtual/range {p14 .. p14}, Lyt2;->Y()V

    .line 59
    :goto_23
    invoke-virtual/range {p14 .. p14}, Lyt2;->v()Lyx5;

    move-result-object v0

    if-eqz v0, :cond_3d

    move-object v1, v0

    new-instance v0, Lop0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v33, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lop0;-><init>(ZLml4;Lsr2;ZLfw0;Ltg7;Lgs2;Lpq6;Lcj6;Ldj6;Lua0;FLtr;Lla5;II)V

    move-object/from16 v1, v33

    .line 60
    iput-object v0, v1, Lyx5;->d:Lgs2;

    :cond_3d
    return-void
.end method
