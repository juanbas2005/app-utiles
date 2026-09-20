.class public final Ldh;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Llc5;


# instance fields
.field public final A:Ldl2;

.field public final B:Ltp1;

.field public final C:Lzi;

.field public final D:Ljava/lang/CharSequence;

.field public final E:Ljy3;

.field public F:Lcf4;

.field public final G:Z

.field public final H:I

.field public final w:Ljava/lang/String;

.field public final x:Ltg7;

.field public final y:Ljava/util/List;

.field public final z:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ltg7;Ljava/util/List;Ljava/util/List;Ldl2;Ltp1;)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    iput-object v4, v0, Ldh;->w:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v1, v0, Ldh;->x:Ltg7;

    .line 17
    .line 18
    iput-object v2, v0, Ldh;->y:Ljava/util/List;

    .line 19
    .line 20
    move-object/from16 v4, p4

    .line 21
    .line 22
    iput-object v4, v0, Ldh;->z:Ljava/util/List;

    .line 23
    .line 24
    move-object/from16 v4, p5

    .line 25
    .line 26
    iput-object v4, v0, Ldh;->A:Ldl2;

    .line 27
    .line 28
    iput-object v3, v0, Ldh;->B:Ltp1;

    .line 29
    .line 30
    new-instance v4, Lzi;

    .line 31
    .line 32
    invoke-interface {v3}, Ltp1;->b()F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 41
    .line 42
    sget-object v5, Lrd7;->b:Lrd7;

    .line 43
    .line 44
    iput-object v5, v4, Lzi;->b:Lrd7;

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    iput v5, v4, Lzi;->c:I

    .line 48
    .line 49
    sget-object v7, Llq6;->d:Llq6;

    .line 50
    .line 51
    iput-object v7, v4, Lzi;->d:Llq6;

    .line 52
    .line 53
    iput-object v4, v0, Ldh;->C:Lzi;

    .line 54
    .line 55
    invoke-static {v1}, Lc35;->c(Ltg7;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, v1, Ltg7;->a:Lyy6;

    .line 60
    .line 61
    iget-object v1, v1, Ltg7;->b:Lnc5;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    if-nez v7, :cond_0

    .line 65
    .line 66
    move v7, v9

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    sget-object v7, La32;->a:Lji8;

    .line 69
    .line 70
    sget-object v7, La32;->a:Lji8;

    .line 71
    .line 72
    iget-object v10, v7, Lji8;->x:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, La37;

    .line 75
    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-static {}, Lw22;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_2

    .line 84
    .line 85
    invoke-virtual {v7}, Lji8;->x()La37;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    iput-object v10, v7, Lji8;->x:Ljava/lang/Object;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object v10, Lrc9;->n:Lg93;

    .line 93
    .line 94
    :goto_0
    invoke-interface {v10}, La37;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    :goto_1
    iput-boolean v7, v0, Ldh;->G:Z

    .line 105
    .line 106
    iget v7, v1, Lnc5;->b:I

    .line 107
    .line 108
    iget-object v10, v8, Lyy6;->k:Lya4;

    .line 109
    .line 110
    const/4 v11, 0x4

    .line 111
    const/4 v13, 0x2

    .line 112
    if-ne v7, v11, :cond_4

    .line 113
    .line 114
    :cond_3
    :goto_2
    move v7, v13

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    const/4 v11, 0x5

    .line 117
    if-ne v7, v11, :cond_6

    .line 118
    .line 119
    :cond_5
    move v7, v5

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    if-ne v7, v6, :cond_7

    .line 122
    .line 123
    move v7, v9

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    if-ne v7, v13, :cond_8

    .line 126
    .line 127
    move v7, v6

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    if-ne v7, v5, :cond_9

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_9
    if-nez v7, :cond_77

    .line 133
    .line 134
    :goto_3
    if-eqz v10, :cond_a

    .line 135
    .line 136
    iget-object v7, v10, Lya4;->w:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Lxa4;

    .line 143
    .line 144
    iget-object v7, v7, Lxa4;->a:Ljava/util/Locale;

    .line 145
    .line 146
    if-nez v7, :cond_b

    .line 147
    .line 148
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_3

    .line 157
    .line 158
    if-eq v7, v6, :cond_5

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :goto_4
    iput v7, v0, Ldh;->H:I

    .line 162
    .line 163
    new-instance v7, Lch;

    .line 164
    .line 165
    invoke-direct {v7, v9, v0}, Lch;-><init>(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v1, v1, Lnc5;->i:Ljg7;

    .line 169
    .line 170
    if-nez v1, :cond_c

    .line 171
    .line 172
    sget-object v1, Ljg7;->c:Ljg7;

    .line 173
    .line 174
    :cond_c
    iget-boolean v10, v1, Ljg7;->b:Z

    .line 175
    .line 176
    if-eqz v10, :cond_d

    .line 177
    .line 178
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    or-int/lit16 v10, v10, 0x80

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    and-int/lit16 v10, v10, -0x81

    .line 190
    .line 191
    :goto_5
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setFlags(I)V

    .line 192
    .line 193
    .line 194
    iget v1, v1, Ljg7;->a:I

    .line 195
    .line 196
    if-ne v1, v6, :cond_e

    .line 197
    .line 198
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    or-int/lit8 v1, v1, 0x40

    .line 203
    .line 204
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_e
    if-ne v1, v13, :cond_f

    .line 212
    .line 213
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_f
    if-ne v1, v5, :cond_10

    .line 221
    .line 222
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 230
    .line 231
    .line 232
    :goto_6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    move v5, v9

    .line 237
    :goto_7
    if-ge v5, v1, :cond_12

    .line 238
    .line 239
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    move-object v11, v10

    .line 244
    check-cast v11, Lul;

    .line 245
    .line 246
    iget-object v11, v11, Lul;->a:Ljava/lang/Object;

    .line 247
    .line 248
    instance-of v11, v11, Lyy6;

    .line 249
    .line 250
    if-eqz v11, :cond_11

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_11
    add-int/lit8 v5, v5, 0x1

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_12
    const/4 v10, 0x0

    .line 257
    :goto_8
    if-eqz v10, :cond_13

    .line 258
    .line 259
    move v1, v6

    .line 260
    goto :goto_9

    .line 261
    :cond_13
    move v1, v9

    .line 262
    :goto_9
    iget-wide v10, v8, Lyy6;->b:J

    .line 263
    .line 264
    iget-object v2, v8, Lyy6;->c:Lam2;

    .line 265
    .line 266
    iget-object v5, v8, Lyy6;->d:Lyl2;

    .line 267
    .line 268
    iget-object v14, v8, Lyy6;->g:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v15, v8, Lyy6;->k:Lya4;

    .line 271
    .line 272
    const/16 p1, 0x0

    .line 273
    .line 274
    iget-object v12, v8, Lyy6;->a:Lkf7;

    .line 275
    .line 276
    move/from16 p4, v6

    .line 277
    .line 278
    iget-object v6, v8, Lyy6;->j:Llf7;

    .line 279
    .line 280
    move-object/from16 p3, v14

    .line 281
    .line 282
    iget-wide v13, v8, Lyy6;->h:J

    .line 283
    .line 284
    move-wide/from16 v16, v10

    .line 285
    .line 286
    invoke-static/range {v16 .. v17}, Lwg7;->b(J)J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    move v11, v1

    .line 291
    move-object/from16 v18, v2

    .line 292
    .line 293
    const-wide v1, 0x100000000L

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    invoke-static {v9, v10, v1, v2}, Lxg7;->a(JJ)Z

    .line 299
    .line 300
    .line 301
    move-result v19

    .line 302
    if-eqz v19, :cond_14

    .line 303
    .line 304
    move-wide/from16 v1, v16

    .line 305
    .line 306
    invoke-interface {v3, v1, v2}, Ltp1;->C0(J)F

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 311
    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_14
    const-wide v1, 0x200000000L

    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    invoke-static {v9, v10, v1, v2}, Lxg7;->a(JJ)Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eqz v9, :cond_15

    .line 324
    .line 325
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    invoke-static/range {v16 .. v17}, Lwg7;->c(J)F

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    mul-float/2addr v2, v1

    .line 334
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 335
    .line 336
    .line 337
    :cond_15
    :goto_a
    iget-object v1, v8, Lyy6;->f:Lea7;

    .line 338
    .line 339
    if-nez v1, :cond_17

    .line 340
    .line 341
    if-nez v5, :cond_17

    .line 342
    .line 343
    if-eqz v18, :cond_16

    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_16
    move/from16 v16, v11

    .line 347
    .line 348
    goto :goto_10

    .line 349
    :cond_17
    :goto_b
    if-nez v18, :cond_18

    .line 350
    .line 351
    sget-object v2, Lam2;->y:Lam2;

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_18
    move-object/from16 v2, v18

    .line 355
    .line 356
    :goto_c
    if-eqz v5, :cond_19

    .line 357
    .line 358
    iget v5, v5, Lyl2;->a:I

    .line 359
    .line 360
    goto :goto_d

    .line 361
    :cond_19
    const/4 v5, 0x0

    .line 362
    :goto_d
    iget-object v9, v8, Lyy6;->e:Lzl2;

    .line 363
    .line 364
    if-eqz v9, :cond_1a

    .line 365
    .line 366
    iget v9, v9, Lzl2;->a:I

    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_1a
    const v9, 0xffff

    .line 370
    .line 371
    .line 372
    :goto_e
    iget-object v10, v7, Lch;->x:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v10, Ldh;

    .line 375
    .line 376
    move/from16 v16, v11

    .line 377
    .line 378
    iget-object v11, v10, Ldh;->A:Ldl2;

    .line 379
    .line 380
    check-cast v11, Lel2;

    .line 381
    .line 382
    invoke-virtual {v11, v1, v2, v5, v9}, Lel2;->b(Lea7;Lam2;II)Lwq7;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    instance-of v2, v1, Lwq7;

    .line 387
    .line 388
    if-nez v2, :cond_1b

    .line 389
    .line 390
    new-instance v2, Lcf4;

    .line 391
    .line 392
    iget-object v5, v10, Ldh;->F:Lcf4;

    .line 393
    .line 394
    invoke-direct {v2, v1, v5}, Lcf4;-><init>(Lwq7;Lcf4;)V

    .line 395
    .line 396
    .line 397
    iput-object v2, v10, Ldh;->F:Lcf4;

    .line 398
    .line 399
    iget-object v1, v2, Lcf4;->z:Ljava/lang/Object;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    check-cast v1, Landroid/graphics/Typeface;

    .line 405
    .line 406
    goto :goto_f

    .line 407
    :cond_1b
    iget-object v1, v1, Lwq7;->w:Ljava/lang/Object;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    check-cast v1, Landroid/graphics/Typeface;

    .line 413
    .line 414
    :goto_f
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 415
    .line 416
    .line 417
    :goto_10
    const/16 v1, 0xa

    .line 418
    .line 419
    if-eqz v15, :cond_1d

    .line 420
    .line 421
    sget-object v2, Lya4;->y:Lya4;

    .line 422
    .line 423
    sget-object v2, Lkj5;->a:Lwr0;

    .line 424
    .line 425
    invoke-virtual {v2}, Lwr0;->G()Lya4;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v15, v2}, Lya4;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-nez v2, :cond_1d

    .line 434
    .line 435
    new-instance v2, Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-static {v15, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 442
    .line 443
    .line 444
    iget-object v5, v15, Lya4;->w:Ljava/util/List;

    .line 445
    .line 446
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    if-eqz v9, :cond_1c

    .line 455
    .line 456
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    check-cast v9, Lxa4;

    .line 461
    .line 462
    iget-object v9, v9, Lxa4;->a:Ljava/util/Locale;

    .line 463
    .line 464
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    goto :goto_11

    .line 468
    :cond_1c
    const/4 v9, 0x0

    .line 469
    new-array v5, v9, [Ljava/util/Locale;

    .line 470
    .line 471
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, [Ljava/util/Locale;

    .line 476
    .line 477
    array-length v5, v2

    .line 478
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    check-cast v2, [Ljava/util/Locale;

    .line 483
    .line 484
    new-instance v5, Landroid/os/LocaleList;

    .line 485
    .line 486
    invoke-direct {v5, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    .line 490
    .line 491
    .line 492
    :cond_1d
    if-eqz p3, :cond_1e

    .line 493
    .line 494
    const-string v2, ""

    .line 495
    .line 496
    move-object/from16 v5, p3

    .line 497
    .line 498
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-nez v2, :cond_1e

    .line 503
    .line 504
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_1e
    if-eqz v6, :cond_1f

    .line 508
    .line 509
    sget-object v2, Llf7;->c:Llf7;

    .line 510
    .line 511
    invoke-virtual {v6, v2}, Llf7;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    if-nez v2, :cond_1f

    .line 516
    .line 517
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    iget v5, v6, Llf7;->a:F

    .line 522
    .line 523
    mul-float/2addr v2, v5

    .line 524
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    iget v5, v6, Llf7;->b:F

    .line 532
    .line 533
    add-float/2addr v2, v5

    .line 534
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 535
    .line 536
    .line 537
    :cond_1f
    invoke-interface {v12}, Lkf7;->b()J

    .line 538
    .line 539
    .line 540
    move-result-wide v5

    .line 541
    invoke-virtual {v4, v5, v6}, Lzi;->d(J)V

    .line 542
    .line 543
    .line 544
    invoke-interface {v12}, Lkf7;->c()Lkc0;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    invoke-interface {v12}, Lkf7;->a()F

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    invoke-virtual {v4, v2, v5, v6, v9}, Lzi;->c(Lkc0;JF)V

    .line 558
    .line 559
    .line 560
    iget-object v2, v8, Lyy6;->n:Llq6;

    .line 561
    .line 562
    invoke-virtual {v4, v2}, Lzi;->f(Llq6;)V

    .line 563
    .line 564
    .line 565
    iget-object v2, v8, Lyy6;->m:Lrd7;

    .line 566
    .line 567
    invoke-virtual {v4, v2}, Lzi;->g(Lrd7;)V

    .line 568
    .line 569
    .line 570
    iget-object v2, v8, Lyy6;->p:Liz1;

    .line 571
    .line 572
    invoke-virtual {v4, v2}, Lzi;->e(Liz1;)V

    .line 573
    .line 574
    .line 575
    invoke-static {v13, v14}, Lwg7;->b(J)J

    .line 576
    .line 577
    .line 578
    move-result-wide v5

    .line 579
    const-wide v9, 0x100000000L

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    invoke-static {v5, v6, v9, v10}, Lxg7;->a(JJ)Z

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    const/4 v5, 0x0

    .line 589
    if-eqz v2, :cond_22

    .line 590
    .line 591
    invoke-static {v13, v14}, Lwg7;->c(J)F

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    cmpg-float v2, v2, v5

    .line 596
    .line 597
    if-nez v2, :cond_20

    .line 598
    .line 599
    goto :goto_12

    .line 600
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    .line 605
    .line 606
    .line 607
    move-result v6

    .line 608
    mul-float/2addr v6, v2

    .line 609
    invoke-interface {v3, v13, v14}, Ltp1;->C0(J)F

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    cmpg-float v3, v6, v5

    .line 614
    .line 615
    if-nez v3, :cond_21

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_21
    div-float/2addr v2, v6

    .line 619
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 620
    .line 621
    .line 622
    goto :goto_13

    .line 623
    :cond_22
    :goto_12
    invoke-static {v13, v14}, Lwg7;->b(J)J

    .line 624
    .line 625
    .line 626
    move-result-wide v2

    .line 627
    const-wide v9, 0x200000000L

    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    invoke-static {v2, v3, v9, v10}, Lxg7;->a(JJ)Z

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    if-eqz v2, :cond_23

    .line 637
    .line 638
    invoke-static {v13, v14}, Lwg7;->c(J)F

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 643
    .line 644
    .line 645
    :cond_23
    :goto_13
    iget-wide v2, v8, Lyy6;->l:J

    .line 646
    .line 647
    iget-object v4, v8, Lyy6;->i:Lh60;

    .line 648
    .line 649
    if-eqz v16, :cond_25

    .line 650
    .line 651
    invoke-static {v13, v14}, Lwg7;->b(J)J

    .line 652
    .line 653
    .line 654
    move-result-wide v8

    .line 655
    const-wide v10, 0x100000000L

    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    invoke-static {v8, v9, v10, v11}, Lxg7;->a(JJ)Z

    .line 661
    .line 662
    .line 663
    move-result v6

    .line 664
    if-eqz v6, :cond_25

    .line 665
    .line 666
    invoke-static {v13, v14}, Lwg7;->c(J)F

    .line 667
    .line 668
    .line 669
    move-result v6

    .line 670
    cmpg-float v6, v6, v5

    .line 671
    .line 672
    if-nez v6, :cond_24

    .line 673
    .line 674
    goto :goto_14

    .line 675
    :cond_24
    move/from16 v6, p4

    .line 676
    .line 677
    goto :goto_15

    .line 678
    :cond_25
    :goto_14
    const/4 v6, 0x0

    .line 679
    :goto_15
    sget-wide v8, Ljt0;->g:J

    .line 680
    .line 681
    invoke-static {v2, v3, v8, v9}, Ljt0;->c(JJ)Z

    .line 682
    .line 683
    .line 684
    move-result v10

    .line 685
    if-nez v10, :cond_26

    .line 686
    .line 687
    sget-wide v10, Ljt0;->f:J

    .line 688
    .line 689
    invoke-static {v2, v3, v10, v11}, Ljt0;->c(JJ)Z

    .line 690
    .line 691
    .line 692
    move-result v10

    .line 693
    if-nez v10, :cond_26

    .line 694
    .line 695
    move/from16 v10, p4

    .line 696
    .line 697
    goto :goto_16

    .line 698
    :cond_26
    const/4 v10, 0x0

    .line 699
    :goto_16
    if-eqz v4, :cond_28

    .line 700
    .line 701
    iget v11, v4, Lh60;->a:F

    .line 702
    .line 703
    invoke-static {v11, v5}, Ljava/lang/Float;->compare(FF)I

    .line 704
    .line 705
    .line 706
    move-result v11

    .line 707
    if-nez v11, :cond_27

    .line 708
    .line 709
    goto :goto_17

    .line 710
    :cond_27
    move/from16 v11, p4

    .line 711
    .line 712
    goto :goto_18

    .line 713
    :cond_28
    :goto_17
    const/4 v11, 0x0

    .line 714
    :goto_18
    if-nez v6, :cond_29

    .line 715
    .line 716
    if-nez v10, :cond_29

    .line 717
    .line 718
    if-nez v11, :cond_29

    .line 719
    .line 720
    move-object/from16 v2, p1

    .line 721
    .line 722
    goto :goto_1d

    .line 723
    :cond_29
    if-eqz v6, :cond_2a

    .line 724
    .line 725
    :goto_19
    move-wide/from16 v30, v13

    .line 726
    .line 727
    goto :goto_1a

    .line 728
    :cond_2a
    sget-wide v13, Lwg7;->c:J

    .line 729
    .line 730
    goto :goto_19

    .line 731
    :goto_1a
    if-eqz v10, :cond_2b

    .line 732
    .line 733
    move-wide/from16 v35, v2

    .line 734
    .line 735
    goto :goto_1b

    .line 736
    :cond_2b
    move-wide/from16 v35, v8

    .line 737
    .line 738
    :goto_1b
    if-eqz v11, :cond_2c

    .line 739
    .line 740
    move-object/from16 v32, v4

    .line 741
    .line 742
    goto :goto_1c

    .line 743
    :cond_2c
    move-object/from16 v32, p1

    .line 744
    .line 745
    :goto_1c
    new-instance v20, Lyy6;

    .line 746
    .line 747
    const/16 v38, 0x0

    .line 748
    .line 749
    const v39, 0xf67f

    .line 750
    .line 751
    .line 752
    const-wide/16 v21, 0x0

    .line 753
    .line 754
    const-wide/16 v23, 0x0

    .line 755
    .line 756
    const/16 v25, 0x0

    .line 757
    .line 758
    const/16 v26, 0x0

    .line 759
    .line 760
    const/16 v27, 0x0

    .line 761
    .line 762
    const/16 v28, 0x0

    .line 763
    .line 764
    const/16 v29, 0x0

    .line 765
    .line 766
    const/16 v33, 0x0

    .line 767
    .line 768
    const/16 v34, 0x0

    .line 769
    .line 770
    const/16 v37, 0x0

    .line 771
    .line 772
    invoke-direct/range {v20 .. v39}, Lyy6;-><init>(JJLam2;Lyl2;Lzl2;Lea7;Ljava/lang/String;JLh60;Llf7;Lya4;JLrd7;Llq6;I)V

    .line 773
    .line 774
    .line 775
    move-object/from16 v2, v20

    .line 776
    .line 777
    :goto_1d
    iget-object v3, v0, Ldh;->y:Ljava/util/List;

    .line 778
    .line 779
    if-eqz v2, :cond_2f

    .line 780
    .line 781
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    add-int/lit8 v3, v3, 0x1

    .line 786
    .line 787
    new-instance v4, Ljava/util/ArrayList;

    .line 788
    .line 789
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 790
    .line 791
    .line 792
    const/4 v6, 0x0

    .line 793
    :goto_1e
    if-ge v6, v3, :cond_2e

    .line 794
    .line 795
    if-nez v6, :cond_2d

    .line 796
    .line 797
    new-instance v8, Lul;

    .line 798
    .line 799
    iget-object v9, v0, Ldh;->w:Ljava/lang/String;

    .line 800
    .line 801
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 802
    .line 803
    .line 804
    move-result v9

    .line 805
    const/4 v10, 0x0

    .line 806
    invoke-direct {v8, v10, v9, v2}, Lul;-><init>(IILjava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    goto :goto_1f

    .line 810
    :cond_2d
    iget-object v8, v0, Ldh;->y:Ljava/util/List;

    .line 811
    .line 812
    add-int/lit8 v9, v6, -0x1

    .line 813
    .line 814
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    check-cast v8, Lul;

    .line 819
    .line 820
    :goto_1f
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    add-int/lit8 v6, v6, 0x1

    .line 824
    .line 825
    goto :goto_1e

    .line 826
    :cond_2e
    move-object v3, v4

    .line 827
    :cond_2f
    iget-object v2, v0, Ldh;->w:Ljava/lang/String;

    .line 828
    .line 829
    iget-object v4, v0, Ldh;->C:Lzi;

    .line 830
    .line 831
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 832
    .line 833
    .line 834
    move-result v4

    .line 835
    iget-object v6, v0, Ldh;->x:Ltg7;

    .line 836
    .line 837
    iget-object v8, v0, Ldh;->z:Ljava/util/List;

    .line 838
    .line 839
    iget-object v12, v0, Ldh;->B:Ltp1;

    .line 840
    .line 841
    iget-boolean v9, v0, Ldh;->G:Z

    .line 842
    .line 843
    sget-object v10, Lbh;->a:Lah;

    .line 844
    .line 845
    if-eqz v9, :cond_33

    .line 846
    .line 847
    invoke-static {}, Lw22;->d()Z

    .line 848
    .line 849
    .line 850
    move-result v9

    .line 851
    if-eqz v9, :cond_33

    .line 852
    .line 853
    iget-object v9, v6, Ltg7;->c:Ldk5;

    .line 854
    .line 855
    if-eqz v9, :cond_30

    .line 856
    .line 857
    iget-object v9, v9, Ldk5;->b:Lqj5;

    .line 858
    .line 859
    if-eqz v9, :cond_30

    .line 860
    .line 861
    iget v9, v9, Lqj5;->b:I

    .line 862
    .line 863
    new-instance v10, Lk32;

    .line 864
    .line 865
    invoke-direct {v10, v9}, Lk32;-><init>(I)V

    .line 866
    .line 867
    .line 868
    goto :goto_20

    .line 869
    :cond_30
    move-object/from16 v10, p1

    .line 870
    .line 871
    :goto_20
    if-nez v10, :cond_32

    .line 872
    .line 873
    :cond_31
    const/4 v9, 0x0

    .line 874
    goto :goto_21

    .line 875
    :cond_32
    iget v9, v10, Lk32;->a:I

    .line 876
    .line 877
    const/4 v10, 0x2

    .line 878
    if-ne v9, v10, :cond_31

    .line 879
    .line 880
    move/from16 v9, p4

    .line 881
    .line 882
    :goto_21
    invoke-static {}, Lw22;->a()Lw22;

    .line 883
    .line 884
    .line 885
    move-result-object v10

    .line 886
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 887
    .line 888
    .line 889
    move-result v11

    .line 890
    const/4 v13, 0x0

    .line 891
    invoke-virtual {v10, v13, v11, v9, v2}, Lw22;->g(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    goto :goto_22

    .line 899
    :cond_33
    move-object v9, v2

    .line 900
    :goto_22
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 901
    .line 902
    .line 903
    move-result v10

    .line 904
    const-wide/16 v13, 0x0

    .line 905
    .line 906
    const-wide v15, 0xff00000000L

    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    if-eqz v10, :cond_34

    .line 912
    .line 913
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 914
    .line 915
    .line 916
    move-result v10

    .line 917
    if-eqz v10, :cond_34

    .line 918
    .line 919
    iget-object v10, v6, Ltg7;->b:Lnc5;

    .line 920
    .line 921
    iget-object v10, v10, Lnc5;->d:Lmf7;

    .line 922
    .line 923
    sget-object v11, Lmf7;->c:Lmf7;

    .line 924
    .line 925
    invoke-static {v10, v11}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v10

    .line 929
    if-eqz v10, :cond_34

    .line 930
    .line 931
    iget-object v10, v6, Ltg7;->b:Lnc5;

    .line 932
    .line 933
    iget-wide v10, v10, Lnc5;->c:J

    .line 934
    .line 935
    and-long/2addr v10, v15

    .line 936
    cmp-long v10, v10, v13

    .line 937
    .line 938
    if-nez v10, :cond_34

    .line 939
    .line 940
    goto/16 :goto_4c

    .line 941
    .line 942
    :cond_34
    instance-of v10, v9, Landroid/text/Spannable;

    .line 943
    .line 944
    if-eqz v10, :cond_35

    .line 945
    .line 946
    check-cast v9, Landroid/text/Spannable;

    .line 947
    .line 948
    goto :goto_23

    .line 949
    :cond_35
    new-instance v10, Landroid/text/SpannableString;

    .line 950
    .line 951
    invoke-direct {v10, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    move-object v9, v10

    .line 955
    :goto_23
    iget-object v10, v6, Ltg7;->a:Lyy6;

    .line 956
    .line 957
    iget-object v11, v6, Ltg7;->b:Lnc5;

    .line 958
    .line 959
    iget-object v10, v10, Lyy6;->m:Lrd7;

    .line 960
    .line 961
    move/from16 p2, v5

    .line 962
    .line 963
    sget-object v5, Lrd7;->c:Lrd7;

    .line 964
    .line 965
    invoke-static {v10, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v5

    .line 969
    const/16 v10, 0x21

    .line 970
    .line 971
    if-eqz v5, :cond_36

    .line 972
    .line 973
    sget-object v5, Lbh;->a:Lah;

    .line 974
    .line 975
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 976
    .line 977
    .line 978
    move-result v2

    .line 979
    move-wide/from16 v17, v13

    .line 980
    .line 981
    const/4 v13, 0x0

    .line 982
    invoke-interface {v9, v5, v13, v2, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 983
    .line 984
    .line 985
    goto :goto_24

    .line 986
    :cond_36
    move-wide/from16 v17, v13

    .line 987
    .line 988
    :goto_24
    iget-object v2, v6, Ltg7;->c:Ldk5;

    .line 989
    .line 990
    if-eqz v2, :cond_37

    .line 991
    .line 992
    iget-object v2, v2, Ldk5;->b:Lqj5;

    .line 993
    .line 994
    if-eqz v2, :cond_37

    .line 995
    .line 996
    iget-boolean v2, v2, Lqj5;->a:Z

    .line 997
    .line 998
    goto :goto_25

    .line 999
    :cond_37
    const/4 v2, 0x0

    .line 1000
    :goto_25
    if-eqz v2, :cond_39

    .line 1001
    .line 1002
    iget-object v2, v11, Lnc5;->f:Lm64;

    .line 1003
    .line 1004
    if-nez v2, :cond_39

    .line 1005
    .line 1006
    iget-wide v1, v11, Lnc5;->c:J

    .line 1007
    .line 1008
    invoke-static {v1, v2, v4, v12}, Lt75;->E(JFLtp1;)F

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v2

    .line 1016
    if-nez v2, :cond_38

    .line 1017
    .line 1018
    new-instance v2, Li64;

    .line 1019
    .line 1020
    invoke-direct {v2, v1}, Li64;-><init>(F)V

    .line 1021
    .line 1022
    .line 1023
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1024
    .line 1025
    .line 1026
    move-result v1

    .line 1027
    const/4 v13, 0x0

    .line 1028
    invoke-interface {v9, v2, v13, v1, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1029
    .line 1030
    .line 1031
    :cond_38
    const/4 v13, 0x0

    .line 1032
    goto :goto_2b

    .line 1033
    :cond_39
    iget-object v2, v11, Lnc5;->f:Lm64;

    .line 1034
    .line 1035
    if-nez v2, :cond_3a

    .line 1036
    .line 1037
    sget-object v2, Lm64;->d:Lm64;

    .line 1038
    .line 1039
    :cond_3a
    iget-wide v13, v11, Lnc5;->c:J

    .line 1040
    .line 1041
    invoke-static {v13, v14, v4, v12}, Lt75;->E(JFLtp1;)F

    .line 1042
    .line 1043
    .line 1044
    move-result v21

    .line 1045
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v5

    .line 1049
    if-nez v5, :cond_38

    .line 1050
    .line 1051
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1052
    .line 1053
    .line 1054
    move-result v5

    .line 1055
    if-nez v5, :cond_3b

    .line 1056
    .line 1057
    goto :goto_26

    .line 1058
    :cond_3b
    invoke-static {v9}, Ld57;->J0(Ljava/lang/CharSequence;)C

    .line 1059
    .line 1060
    .line 1061
    move-result v5

    .line 1062
    if-ne v5, v1, :cond_3c

    .line 1063
    .line 1064
    :goto_26
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1065
    .line 1066
    .line 1067
    move-result v1

    .line 1068
    add-int/lit8 v1, v1, 0x1

    .line 1069
    .line 1070
    :goto_27
    move/from16 v22, v1

    .line 1071
    .line 1072
    goto :goto_28

    .line 1073
    :cond_3c
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1074
    .line 1075
    .line 1076
    move-result v1

    .line 1077
    goto :goto_27

    .line 1078
    :goto_28
    new-instance v20, Ln64;

    .line 1079
    .line 1080
    iget v1, v2, Lm64;->b:I

    .line 1081
    .line 1082
    and-int/lit8 v5, v1, 0x1

    .line 1083
    .line 1084
    if-lez v5, :cond_3d

    .line 1085
    .line 1086
    move/from16 v23, p4

    .line 1087
    .line 1088
    goto :goto_29

    .line 1089
    :cond_3d
    const/16 v23, 0x0

    .line 1090
    .line 1091
    :goto_29
    and-int/lit8 v1, v1, 0x10

    .line 1092
    .line 1093
    if-lez v1, :cond_3e

    .line 1094
    .line 1095
    move/from16 v24, p4

    .line 1096
    .line 1097
    goto :goto_2a

    .line 1098
    :cond_3e
    const/16 v24, 0x0

    .line 1099
    .line 1100
    :goto_2a
    iget v1, v2, Lm64;->a:F

    .line 1101
    .line 1102
    iget v2, v2, Lm64;->c:I

    .line 1103
    .line 1104
    move/from16 v25, v1

    .line 1105
    .line 1106
    move/from16 v26, v2

    .line 1107
    .line 1108
    invoke-direct/range {v20 .. v26}, Ln64;-><init>(FIZZFI)V

    .line 1109
    .line 1110
    .line 1111
    move-object/from16 v1, v20

    .line 1112
    .line 1113
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    const/4 v13, 0x0

    .line 1118
    invoke-interface {v9, v1, v13, v2, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1119
    .line 1120
    .line 1121
    :goto_2b
    iget-object v1, v11, Lnc5;->d:Lmf7;

    .line 1122
    .line 1123
    if-eqz v1, :cond_47

    .line 1124
    .line 1125
    move/from16 p5, v13

    .line 1126
    .line 1127
    iget-wide v13, v1, Lmf7;->a:J

    .line 1128
    .line 1129
    iget-wide v1, v1, Lmf7;->b:J

    .line 1130
    .line 1131
    move-object v5, v11

    .line 1132
    invoke-static/range {p5 .. p5}, Lya5;->k(I)J

    .line 1133
    .line 1134
    .line 1135
    move-result-wide v10

    .line 1136
    invoke-static {v13, v14, v10, v11}, Lwg7;->a(JJ)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v10

    .line 1140
    if-eqz v10, :cond_3f

    .line 1141
    .line 1142
    invoke-static/range {p5 .. p5}, Lya5;->k(I)J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v10

    .line 1146
    invoke-static {v1, v2, v10, v11}, Lwg7;->a(JJ)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v10

    .line 1150
    if-nez v10, :cond_40

    .line 1151
    .line 1152
    :cond_3f
    and-long v10, v13, v15

    .line 1153
    .line 1154
    cmp-long v10, v10, v17

    .line 1155
    .line 1156
    if-nez v10, :cond_41

    .line 1157
    .line 1158
    :cond_40
    :goto_2c
    move-object v15, v5

    .line 1159
    goto/16 :goto_2f

    .line 1160
    .line 1161
    :cond_41
    and-long v10, v1, v15

    .line 1162
    .line 1163
    cmp-long v10, v10, v17

    .line 1164
    .line 1165
    if-nez v10, :cond_42

    .line 1166
    .line 1167
    goto :goto_2c

    .line 1168
    :cond_42
    invoke-static {v13, v14}, Lwg7;->b(J)J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v10

    .line 1172
    move/from16 p6, v4

    .line 1173
    .line 1174
    move-object v15, v5

    .line 1175
    const-wide v4, 0x100000000L

    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    invoke-static {v10, v11, v4, v5}, Lxg7;->a(JJ)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v16

    .line 1184
    if-eqz v16, :cond_43

    .line 1185
    .line 1186
    invoke-interface {v12, v13, v14}, Ltp1;->C0(J)F

    .line 1187
    .line 1188
    .line 1189
    move-result v10

    .line 1190
    const-wide v4, 0x200000000L

    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    goto :goto_2d

    .line 1196
    :cond_43
    const-wide v4, 0x200000000L

    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    invoke-static {v10, v11, v4, v5}, Lxg7;->a(JJ)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v10

    .line 1205
    if-eqz v10, :cond_44

    .line 1206
    .line 1207
    invoke-static {v13, v14}, Lwg7;->c(J)F

    .line 1208
    .line 1209
    .line 1210
    move-result v10

    .line 1211
    mul-float v10, v10, p6

    .line 1212
    .line 1213
    goto :goto_2d

    .line 1214
    :cond_44
    move/from16 v10, p2

    .line 1215
    .line 1216
    :goto_2d
    invoke-static {v1, v2}, Lwg7;->b(J)J

    .line 1217
    .line 1218
    .line 1219
    move-result-wide v13

    .line 1220
    const-wide v4, 0x100000000L

    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    invoke-static {v13, v14, v4, v5}, Lxg7;->a(JJ)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v11

    .line 1229
    if-eqz v11, :cond_45

    .line 1230
    .line 1231
    invoke-interface {v12, v1, v2}, Ltp1;->C0(J)F

    .line 1232
    .line 1233
    .line 1234
    move-result v1

    .line 1235
    goto :goto_2e

    .line 1236
    :cond_45
    const-wide v4, 0x200000000L

    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    invoke-static {v13, v14, v4, v5}, Lxg7;->a(JJ)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v11

    .line 1245
    if-eqz v11, :cond_46

    .line 1246
    .line 1247
    invoke-static {v1, v2}, Lwg7;->c(J)F

    .line 1248
    .line 1249
    .line 1250
    move-result v1

    .line 1251
    mul-float v1, v1, p6

    .line 1252
    .line 1253
    goto :goto_2e

    .line 1254
    :cond_46
    move/from16 v1, p2

    .line 1255
    .line 1256
    :goto_2e
    new-instance v2, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 1257
    .line 1258
    float-to-double v4, v10

    .line 1259
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 1260
    .line 1261
    .line 1262
    move-result-wide v4

    .line 1263
    double-to-float v4, v4

    .line 1264
    float-to-int v4, v4

    .line 1265
    float-to-double v10, v1

    .line 1266
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1267
    .line 1268
    .line 1269
    move-result-wide v10

    .line 1270
    double-to-float v1, v10

    .line 1271
    float-to-int v1, v1

    .line 1272
    invoke-direct {v2, v4, v1}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 1273
    .line 1274
    .line 1275
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1276
    .line 1277
    .line 1278
    move-result v1

    .line 1279
    const/16 v4, 0x21

    .line 1280
    .line 1281
    const/4 v13, 0x0

    .line 1282
    invoke-interface {v9, v2, v13, v1, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_2f

    .line 1286
    :cond_47
    move-object v15, v11

    .line 1287
    :goto_2f
    new-instance v1, Ljava/util/ArrayList;

    .line 1288
    .line 1289
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1297
    .line 1298
    .line 1299
    move-result v2

    .line 1300
    const/4 v4, 0x0

    .line 1301
    :goto_30
    if-ge v4, v2, :cond_4b

    .line 1302
    .line 1303
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v5

    .line 1307
    check-cast v5, Lul;

    .line 1308
    .line 1309
    iget-object v10, v5, Lul;->a:Ljava/lang/Object;

    .line 1310
    .line 1311
    instance-of v11, v10, Lyy6;

    .line 1312
    .line 1313
    if-eqz v11, :cond_4a

    .line 1314
    .line 1315
    move-object v11, v10

    .line 1316
    check-cast v11, Lyy6;

    .line 1317
    .line 1318
    iget-object v13, v11, Lyy6;->f:Lea7;

    .line 1319
    .line 1320
    if-nez v13, :cond_49

    .line 1321
    .line 1322
    iget-object v13, v11, Lyy6;->d:Lyl2;

    .line 1323
    .line 1324
    if-nez v13, :cond_49

    .line 1325
    .line 1326
    iget-object v11, v11, Lyy6;->c:Lam2;

    .line 1327
    .line 1328
    if-eqz v11, :cond_48

    .line 1329
    .line 1330
    goto :goto_31

    .line 1331
    :cond_48
    check-cast v10, Lyy6;

    .line 1332
    .line 1333
    iget-object v10, v10, Lyy6;->e:Lzl2;

    .line 1334
    .line 1335
    if-eqz v10, :cond_4a

    .line 1336
    .line 1337
    :cond_49
    :goto_31
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1338
    .line 1339
    .line 1340
    :cond_4a
    add-int/lit8 v4, v4, 0x1

    .line 1341
    .line 1342
    goto :goto_30

    .line 1343
    :cond_4b
    iget-object v2, v6, Ltg7;->a:Lyy6;

    .line 1344
    .line 1345
    iget-object v4, v2, Lyy6;->f:Lea7;

    .line 1346
    .line 1347
    if-nez v4, :cond_4e

    .line 1348
    .line 1349
    iget-object v5, v2, Lyy6;->d:Lyl2;

    .line 1350
    .line 1351
    if-nez v5, :cond_4e

    .line 1352
    .line 1353
    iget-object v5, v2, Lyy6;->c:Lam2;

    .line 1354
    .line 1355
    if-eqz v5, :cond_4c

    .line 1356
    .line 1357
    goto :goto_32

    .line 1358
    :cond_4c
    iget-object v5, v2, Lyy6;->e:Lzl2;

    .line 1359
    .line 1360
    if-eqz v5, :cond_4d

    .line 1361
    .line 1362
    goto :goto_32

    .line 1363
    :cond_4d
    move-object/from16 v2, p1

    .line 1364
    .line 1365
    goto :goto_33

    .line 1366
    :cond_4e
    :goto_32
    iget-object v5, v2, Lyy6;->c:Lam2;

    .line 1367
    .line 1368
    iget-object v6, v2, Lyy6;->d:Lyl2;

    .line 1369
    .line 1370
    iget-object v2, v2, Lyy6;->e:Lzl2;

    .line 1371
    .line 1372
    new-instance v20, Lyy6;

    .line 1373
    .line 1374
    const/16 v38, 0x0

    .line 1375
    .line 1376
    const v39, 0xffc3

    .line 1377
    .line 1378
    .line 1379
    const-wide/16 v21, 0x0

    .line 1380
    .line 1381
    const-wide/16 v23, 0x0

    .line 1382
    .line 1383
    const/16 v29, 0x0

    .line 1384
    .line 1385
    const-wide/16 v30, 0x0

    .line 1386
    .line 1387
    const/16 v32, 0x0

    .line 1388
    .line 1389
    const/16 v33, 0x0

    .line 1390
    .line 1391
    const/16 v34, 0x0

    .line 1392
    .line 1393
    const-wide/16 v35, 0x0

    .line 1394
    .line 1395
    const/16 v37, 0x0

    .line 1396
    .line 1397
    move-object/from16 v27, v2

    .line 1398
    .line 1399
    move-object/from16 v28, v4

    .line 1400
    .line 1401
    move-object/from16 v25, v5

    .line 1402
    .line 1403
    move-object/from16 v26, v6

    .line 1404
    .line 1405
    invoke-direct/range {v20 .. v39}, Lyy6;-><init>(JJLam2;Lyl2;Lzl2;Lea7;Ljava/lang/String;JLh60;Llf7;Lya4;JLrd7;Llq6;I)V

    .line 1406
    .line 1407
    .line 1408
    move-object/from16 v2, v20

    .line 1409
    .line 1410
    :goto_33
    new-instance v4, Lgc5;

    .line 1411
    .line 1412
    const/16 v5, 0x16

    .line 1413
    .line 1414
    invoke-direct {v4, v5, v9, v7}, Lgc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1418
    .line 1419
    .line 1420
    move-result v5

    .line 1421
    move/from16 v6, p4

    .line 1422
    .line 1423
    if-gt v5, v6, :cond_50

    .line 1424
    .line 1425
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v5

    .line 1429
    if-nez v5, :cond_58

    .line 1430
    .line 1431
    const/4 v13, 0x0

    .line 1432
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v5

    .line 1436
    check-cast v5, Lul;

    .line 1437
    .line 1438
    iget-object v5, v5, Lul;->a:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast v5, Lyy6;

    .line 1441
    .line 1442
    if-nez v2, :cond_4f

    .line 1443
    .line 1444
    goto :goto_34

    .line 1445
    :cond_4f
    invoke-virtual {v2, v5}, Lyy6;->c(Lyy6;)Lyy6;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v5

    .line 1449
    :goto_34
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v2

    .line 1453
    check-cast v2, Lul;

    .line 1454
    .line 1455
    iget v2, v2, Lul;->b:I

    .line 1456
    .line 1457
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    check-cast v1, Lul;

    .line 1466
    .line 1467
    iget v1, v1, Lul;->c:I

    .line 1468
    .line 1469
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    invoke-virtual {v4, v5, v2, v1}, Lgc5;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    goto/16 :goto_3b

    .line 1477
    .line 1478
    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1479
    .line 1480
    .line 1481
    move-result v5

    .line 1482
    mul-int/lit8 v6, v5, 0x2

    .line 1483
    .line 1484
    new-array v7, v6, [I

    .line 1485
    .line 1486
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1487
    .line 1488
    .line 1489
    move-result v10

    .line 1490
    const/4 v11, 0x0

    .line 1491
    :goto_35
    if-ge v11, v10, :cond_51

    .line 1492
    .line 1493
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v13

    .line 1497
    check-cast v13, Lul;

    .line 1498
    .line 1499
    iget v14, v13, Lul;->b:I

    .line 1500
    .line 1501
    aput v14, v7, v11

    .line 1502
    .line 1503
    add-int v14, v11, v5

    .line 1504
    .line 1505
    iget v13, v13, Lul;->c:I

    .line 1506
    .line 1507
    aput v13, v7, v14

    .line 1508
    .line 1509
    add-int/lit8 v11, v11, 0x1

    .line 1510
    .line 1511
    goto :goto_35

    .line 1512
    :cond_51
    const/4 v11, 0x1

    .line 1513
    if-le v6, v11, :cond_52

    .line 1514
    .line 1515
    invoke-static {v7}, Ljava/util/Arrays;->sort([I)V

    .line 1516
    .line 1517
    .line 1518
    :cond_52
    if-eqz v6, :cond_76

    .line 1519
    .line 1520
    const/4 v13, 0x0

    .line 1521
    aget v5, v7, v13

    .line 1522
    .line 1523
    move v10, v5

    .line 1524
    const/4 v5, 0x0

    .line 1525
    :goto_36
    if-ge v5, v6, :cond_58

    .line 1526
    .line 1527
    aget v11, v7, v5

    .line 1528
    .line 1529
    if-ne v11, v10, :cond_53

    .line 1530
    .line 1531
    move-object/from16 v17, v1

    .line 1532
    .line 1533
    move-object/from16 p6, v2

    .line 1534
    .line 1535
    move/from16 v16, v5

    .line 1536
    .line 1537
    move/from16 v18, v6

    .line 1538
    .line 1539
    goto :goto_3a

    .line 1540
    :cond_53
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1541
    .line 1542
    .line 1543
    move-result v13

    .line 1544
    move-object/from16 p6, v2

    .line 1545
    .line 1546
    const/4 v14, 0x0

    .line 1547
    :goto_37
    if-ge v14, v13, :cond_56

    .line 1548
    .line 1549
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v16

    .line 1553
    move-object/from16 v17, v1

    .line 1554
    .line 1555
    move-object/from16 v1, v16

    .line 1556
    .line 1557
    check-cast v1, Lul;

    .line 1558
    .line 1559
    move/from16 v16, v5

    .line 1560
    .line 1561
    iget v5, v1, Lul;->b:I

    .line 1562
    .line 1563
    move/from16 v18, v6

    .line 1564
    .line 1565
    iget v6, v1, Lul;->c:I

    .line 1566
    .line 1567
    if-eq v5, v6, :cond_55

    .line 1568
    .line 1569
    invoke-static {v10, v11, v5, v6}, Lwl;->b(IIII)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v5

    .line 1573
    if-eqz v5, :cond_55

    .line 1574
    .line 1575
    iget-object v1, v1, Lul;->a:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast v1, Lyy6;

    .line 1578
    .line 1579
    if-nez v2, :cond_54

    .line 1580
    .line 1581
    :goto_38
    move-object v2, v1

    .line 1582
    goto :goto_39

    .line 1583
    :cond_54
    invoke-virtual {v2, v1}, Lyy6;->c(Lyy6;)Lyy6;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v1

    .line 1587
    goto :goto_38

    .line 1588
    :cond_55
    :goto_39
    add-int/lit8 v14, v14, 0x1

    .line 1589
    .line 1590
    move/from16 v5, v16

    .line 1591
    .line 1592
    move-object/from16 v1, v17

    .line 1593
    .line 1594
    move/from16 v6, v18

    .line 1595
    .line 1596
    goto :goto_37

    .line 1597
    :cond_56
    move-object/from16 v17, v1

    .line 1598
    .line 1599
    move/from16 v16, v5

    .line 1600
    .line 1601
    move/from16 v18, v6

    .line 1602
    .line 1603
    if-eqz v2, :cond_57

    .line 1604
    .line 1605
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v1

    .line 1609
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v5

    .line 1613
    invoke-virtual {v4, v2, v1, v5}, Lgc5;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    :cond_57
    move v10, v11

    .line 1617
    :goto_3a
    add-int/lit8 v5, v16, 0x1

    .line 1618
    .line 1619
    move-object/from16 v2, p6

    .line 1620
    .line 1621
    move-object/from16 v1, v17

    .line 1622
    .line 1623
    move/from16 v6, v18

    .line 1624
    .line 1625
    goto :goto_36

    .line 1626
    :cond_58
    :goto_3b
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1627
    .line 1628
    .line 1629
    move-result v1

    .line 1630
    const/4 v2, 0x0

    .line 1631
    const/4 v4, 0x0

    .line 1632
    :goto_3c
    if-ge v2, v1, :cond_69

    .line 1633
    .line 1634
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v5

    .line 1638
    check-cast v5, Lul;

    .line 1639
    .line 1640
    iget-object v6, v5, Lul;->a:Ljava/lang/Object;

    .line 1641
    .line 1642
    instance-of v7, v6, Lyy6;

    .line 1643
    .line 1644
    if-eqz v7, :cond_59

    .line 1645
    .line 1646
    iget v13, v5, Lul;->b:I

    .line 1647
    .line 1648
    iget v14, v5, Lul;->c:I

    .line 1649
    .line 1650
    if-ltz v13, :cond_59

    .line 1651
    .line 1652
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1653
    .line 1654
    .line 1655
    move-result v5

    .line 1656
    if-ge v13, v5, :cond_59

    .line 1657
    .line 1658
    if-le v14, v13, :cond_59

    .line 1659
    .line 1660
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 1661
    .line 1662
    .line 1663
    move-result v5

    .line 1664
    if-le v14, v5, :cond_5a

    .line 1665
    .line 1666
    :cond_59
    move/from16 p6, v1

    .line 1667
    .line 1668
    move/from16 v16, v2

    .line 1669
    .line 1670
    move-object/from16 p3, v3

    .line 1671
    .line 1672
    move-object v1, v12

    .line 1673
    goto/16 :goto_45

    .line 1674
    .line 1675
    :cond_5a
    check-cast v6, Lyy6;

    .line 1676
    .line 1677
    iget-wide v10, v6, Lyy6;->h:J

    .line 1678
    .line 1679
    iget-object v5, v6, Lyy6;->i:Lh60;

    .line 1680
    .line 1681
    iget-object v7, v6, Lyy6;->a:Lkf7;

    .line 1682
    .line 1683
    if-eqz v5, :cond_5b

    .line 1684
    .line 1685
    iget v5, v5, Lh60;->a:F

    .line 1686
    .line 1687
    move/from16 p6, v1

    .line 1688
    .line 1689
    new-instance v1, Li60;

    .line 1690
    .line 1691
    move/from16 v16, v2

    .line 1692
    .line 1693
    const/4 v2, 0x0

    .line 1694
    invoke-direct {v1, v2, v5}, Li60;-><init>(IF)V

    .line 1695
    .line 1696
    .line 1697
    const/16 v2, 0x21

    .line 1698
    .line 1699
    invoke-interface {v9, v1, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1700
    .line 1701
    .line 1702
    goto :goto_3d

    .line 1703
    :cond_5b
    move/from16 p6, v1

    .line 1704
    .line 1705
    move/from16 v16, v2

    .line 1706
    .line 1707
    :goto_3d
    invoke-interface {v7}, Lkf7;->b()J

    .line 1708
    .line 1709
    .line 1710
    move-result-wide v1

    .line 1711
    invoke-static {v9, v1, v2, v13, v14}, Lt75;->G(Landroid/text/Spannable;JII)V

    .line 1712
    .line 1713
    .line 1714
    invoke-interface {v7}, Lkf7;->c()Lkc0;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v1

    .line 1718
    invoke-interface {v7}, Lkf7;->a()F

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    if-eqz v1, :cond_5d

    .line 1723
    .line 1724
    instance-of v5, v1, Lky6;

    .line 1725
    .line 1726
    if-eqz v5, :cond_5c

    .line 1727
    .line 1728
    check-cast v1, Lky6;

    .line 1729
    .line 1730
    iget-wide v1, v1, Lky6;->a:J

    .line 1731
    .line 1732
    invoke-static {v9, v1, v2, v13, v14}, Lt75;->G(Landroid/text/Spannable;JII)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_3e

    .line 1736
    :cond_5c
    new-instance v5, Ljq6;

    .line 1737
    .line 1738
    check-cast v1, Liq6;

    .line 1739
    .line 1740
    invoke-direct {v5, v1, v2}, Ljq6;-><init>(Liq6;F)V

    .line 1741
    .line 1742
    .line 1743
    const/16 v2, 0x21

    .line 1744
    .line 1745
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1746
    .line 1747
    .line 1748
    :cond_5d
    :goto_3e
    iget-object v1, v6, Lyy6;->m:Lrd7;

    .line 1749
    .line 1750
    if-eqz v1, :cond_60

    .line 1751
    .line 1752
    iget v1, v1, Lrd7;->a:I

    .line 1753
    .line 1754
    new-instance v2, Lsd7;

    .line 1755
    .line 1756
    or-int/lit8 v5, v1, 0x1

    .line 1757
    .line 1758
    if-ne v5, v1, :cond_5e

    .line 1759
    .line 1760
    const/4 v5, 0x1

    .line 1761
    goto :goto_3f

    .line 1762
    :cond_5e
    const/4 v5, 0x0

    .line 1763
    :goto_3f
    or-int/lit8 v7, v1, 0x2

    .line 1764
    .line 1765
    if-ne v7, v1, :cond_5f

    .line 1766
    .line 1767
    const/4 v1, 0x1

    .line 1768
    goto :goto_40

    .line 1769
    :cond_5f
    const/4 v1, 0x0

    .line 1770
    :goto_40
    invoke-direct {v2, v5, v1}, Lsd7;-><init>(ZZ)V

    .line 1771
    .line 1772
    .line 1773
    const/16 v1, 0x21

    .line 1774
    .line 1775
    invoke-interface {v9, v2, v13, v14, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1776
    .line 1777
    .line 1778
    :goto_41
    move-wide/from16 v17, v10

    .line 1779
    .line 1780
    goto :goto_42

    .line 1781
    :cond_60
    const/16 v1, 0x21

    .line 1782
    .line 1783
    goto :goto_41

    .line 1784
    :goto_42
    iget-wide v10, v6, Lyy6;->b:J

    .line 1785
    .line 1786
    move v2, v1

    .line 1787
    invoke-static/range {v9 .. v14}, Lt75;->H(Landroid/text/Spannable;JLtp1;II)V

    .line 1788
    .line 1789
    .line 1790
    iget-object v1, v6, Lyy6;->g:Ljava/lang/String;

    .line 1791
    .line 1792
    if-eqz v1, :cond_61

    .line 1793
    .line 1794
    new-instance v5, Lgl2;

    .line 1795
    .line 1796
    const/4 v10, 0x0

    .line 1797
    invoke-direct {v5, v10, v1}, Lgl2;-><init>(ILjava/lang/Object;)V

    .line 1798
    .line 1799
    .line 1800
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1801
    .line 1802
    .line 1803
    :cond_61
    iget-object v1, v6, Lyy6;->j:Llf7;

    .line 1804
    .line 1805
    if-eqz v1, :cond_62

    .line 1806
    .line 1807
    new-instance v5, Landroid/text/style/ScaleXSpan;

    .line 1808
    .line 1809
    iget v7, v1, Llf7;->a:F

    .line 1810
    .line 1811
    invoke-direct {v5, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 1812
    .line 1813
    .line 1814
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v5, Li60;

    .line 1818
    .line 1819
    iget v1, v1, Llf7;->b:F

    .line 1820
    .line 1821
    const/4 v11, 0x1

    .line 1822
    invoke-direct {v5, v11, v1}, Li60;-><init>(IF)V

    .line 1823
    .line 1824
    .line 1825
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1826
    .line 1827
    .line 1828
    goto :goto_43

    .line 1829
    :cond_62
    const/4 v11, 0x1

    .line 1830
    :goto_43
    iget-object v1, v6, Lyy6;->k:Lya4;

    .line 1831
    .line 1832
    invoke-static {v9, v1, v13, v14}, Lt75;->I(Landroid/text/Spannable;Lya4;II)V

    .line 1833
    .line 1834
    .line 1835
    move-object v1, v12

    .line 1836
    iget-wide v11, v6, Lyy6;->l:J

    .line 1837
    .line 1838
    const-wide/16 v20, 0x10

    .line 1839
    .line 1840
    cmp-long v5, v11, v20

    .line 1841
    .line 1842
    if-eqz v5, :cond_63

    .line 1843
    .line 1844
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    .line 1845
    .line 1846
    invoke-static {v11, v12}, Luq3;->M(J)I

    .line 1847
    .line 1848
    .line 1849
    move-result v7

    .line 1850
    invoke-direct {v5, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 1851
    .line 1852
    .line 1853
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1854
    .line 1855
    .line 1856
    :cond_63
    iget-object v5, v6, Lyy6;->n:Llq6;

    .line 1857
    .line 1858
    if-eqz v5, :cond_65

    .line 1859
    .line 1860
    iget-wide v10, v5, Llq6;->b:J

    .line 1861
    .line 1862
    new-instance v7, Loq6;

    .line 1863
    .line 1864
    move-object/from16 p3, v3

    .line 1865
    .line 1866
    iget-wide v2, v5, Llq6;->a:J

    .line 1867
    .line 1868
    invoke-static {v2, v3}, Luq3;->M(J)I

    .line 1869
    .line 1870
    .line 1871
    move-result v2

    .line 1872
    const/16 v3, 0x20

    .line 1873
    .line 1874
    move/from16 v19, v13

    .line 1875
    .line 1876
    shr-long v12, v10, v3

    .line 1877
    .line 1878
    long-to-int v3, v12

    .line 1879
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1880
    .line 1881
    .line 1882
    move-result v3

    .line 1883
    const-wide v12, 0xffffffffL

    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    and-long/2addr v10, v12

    .line 1889
    long-to-int v10, v10

    .line 1890
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1891
    .line 1892
    .line 1893
    move-result v10

    .line 1894
    iget v5, v5, Llq6;->c:F

    .line 1895
    .line 1896
    cmpg-float v11, v5, p2

    .line 1897
    .line 1898
    if-nez v11, :cond_64

    .line 1899
    .line 1900
    const/4 v5, 0x1

    .line 1901
    :cond_64
    invoke-direct {v7, v3, v10, v5, v2}, Loq6;-><init>(FFFI)V

    .line 1902
    .line 1903
    .line 1904
    move/from16 v13, v19

    .line 1905
    .line 1906
    const/16 v2, 0x21

    .line 1907
    .line 1908
    invoke-interface {v9, v7, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1909
    .line 1910
    .line 1911
    goto :goto_44

    .line 1912
    :cond_65
    move-object/from16 p3, v3

    .line 1913
    .line 1914
    :goto_44
    iget-object v3, v6, Lyy6;->p:Liz1;

    .line 1915
    .line 1916
    if-eqz v3, :cond_66

    .line 1917
    .line 1918
    new-instance v5, Ljz1;

    .line 1919
    .line 1920
    invoke-direct {v5, v3}, Ljz1;-><init>(Liz1;)V

    .line 1921
    .line 1922
    .line 1923
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1924
    .line 1925
    .line 1926
    :cond_66
    invoke-static/range {v17 .. v18}, Lwg7;->b(J)J

    .line 1927
    .line 1928
    .line 1929
    move-result-wide v2

    .line 1930
    const-wide v10, 0x100000000L

    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    invoke-static {v2, v3, v10, v11}, Lxg7;->a(JJ)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v2

    .line 1939
    if-nez v2, :cond_67

    .line 1940
    .line 1941
    invoke-static/range {v17 .. v18}, Lwg7;->b(J)J

    .line 1942
    .line 1943
    .line 1944
    move-result-wide v2

    .line 1945
    const-wide v5, 0x200000000L

    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    invoke-static {v2, v3, v5, v6}, Lxg7;->a(JJ)Z

    .line 1951
    .line 1952
    .line 1953
    move-result v2

    .line 1954
    if-eqz v2, :cond_68

    .line 1955
    .line 1956
    :cond_67
    const/4 v4, 0x1

    .line 1957
    :cond_68
    :goto_45
    add-int/lit8 v2, v16, 0x1

    .line 1958
    .line 1959
    move-object/from16 v3, p3

    .line 1960
    .line 1961
    move-object v12, v1

    .line 1962
    move/from16 v1, p6

    .line 1963
    .line 1964
    goto/16 :goto_3c

    .line 1965
    .line 1966
    :cond_69
    move-object/from16 p3, v3

    .line 1967
    .line 1968
    move-object v1, v12

    .line 1969
    if-eqz v4, :cond_6f

    .line 1970
    .line 1971
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 1972
    .line 1973
    .line 1974
    move-result v2

    .line 1975
    const/4 v3, 0x0

    .line 1976
    :goto_46
    if-ge v3, v2, :cond_6f

    .line 1977
    .line 1978
    move-object/from16 v4, p3

    .line 1979
    .line 1980
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v5

    .line 1984
    check-cast v5, Lul;

    .line 1985
    .line 1986
    iget-object v6, v5, Lul;->a:Ljava/lang/Object;

    .line 1987
    .line 1988
    check-cast v6, Lrl;

    .line 1989
    .line 1990
    instance-of v7, v6, Lyy6;

    .line 1991
    .line 1992
    if-eqz v7, :cond_6a

    .line 1993
    .line 1994
    iget v7, v5, Lul;->b:I

    .line 1995
    .line 1996
    iget v5, v5, Lul;->c:I

    .line 1997
    .line 1998
    if-ltz v7, :cond_6a

    .line 1999
    .line 2000
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 2001
    .line 2002
    .line 2003
    move-result v10

    .line 2004
    if-ge v7, v10, :cond_6a

    .line 2005
    .line 2006
    if-le v5, v7, :cond_6a

    .line 2007
    .line 2008
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 2009
    .line 2010
    .line 2011
    move-result v10

    .line 2012
    if-le v5, v10, :cond_6b

    .line 2013
    .line 2014
    :cond_6a
    move/from16 p3, v2

    .line 2015
    .line 2016
    const/16 v12, 0x21

    .line 2017
    .line 2018
    move-object v2, v1

    .line 2019
    goto :goto_48

    .line 2020
    :cond_6b
    check-cast v6, Lyy6;

    .line 2021
    .line 2022
    iget-wide v10, v6, Lyy6;->h:J

    .line 2023
    .line 2024
    invoke-static {v10, v11}, Lwg7;->b(J)J

    .line 2025
    .line 2026
    .line 2027
    move-result-wide v13

    .line 2028
    move-object/from16 p2, v1

    .line 2029
    .line 2030
    move/from16 p3, v2

    .line 2031
    .line 2032
    const-wide v1, 0x100000000L

    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    invoke-static {v13, v14, v1, v2}, Lxg7;->a(JJ)Z

    .line 2038
    .line 2039
    .line 2040
    move-result v6

    .line 2041
    if-eqz v6, :cond_6c

    .line 2042
    .line 2043
    new-instance v1, Lz44;

    .line 2044
    .line 2045
    move-object/from16 v2, p2

    .line 2046
    .line 2047
    invoke-interface {v2, v10, v11}, Ltp1;->C0(J)F

    .line 2048
    .line 2049
    .line 2050
    move-result v6

    .line 2051
    invoke-direct {v1, v6}, Lz44;-><init>(F)V

    .line 2052
    .line 2053
    .line 2054
    goto :goto_47

    .line 2055
    :cond_6c
    move-object/from16 v2, p2

    .line 2056
    .line 2057
    move-wide/from16 v16, v10

    .line 2058
    .line 2059
    const-wide v10, 0x200000000L

    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    invoke-static {v13, v14, v10, v11}, Lxg7;->a(JJ)Z

    .line 2065
    .line 2066
    .line 2067
    move-result v1

    .line 2068
    if-eqz v1, :cond_6d

    .line 2069
    .line 2070
    new-instance v1, Ly44;

    .line 2071
    .line 2072
    invoke-static/range {v16 .. v17}, Lwg7;->c(J)F

    .line 2073
    .line 2074
    .line 2075
    move-result v6

    .line 2076
    invoke-direct {v1, v6}, Ly44;-><init>(F)V

    .line 2077
    .line 2078
    .line 2079
    goto :goto_47

    .line 2080
    :cond_6d
    move-object/from16 v1, p1

    .line 2081
    .line 2082
    :goto_47
    const/16 v12, 0x21

    .line 2083
    .line 2084
    if-eqz v1, :cond_6e

    .line 2085
    .line 2086
    invoke-interface {v9, v1, v7, v5, v12}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2087
    .line 2088
    .line 2089
    :cond_6e
    :goto_48
    add-int/lit8 v3, v3, 0x1

    .line 2090
    .line 2091
    move-object v1, v2

    .line 2092
    move/from16 v2, p3

    .line 2093
    .line 2094
    move-object/from16 p3, v4

    .line 2095
    .line 2096
    goto :goto_46

    .line 2097
    :cond_6f
    move-object/from16 v4, p3

    .line 2098
    .line 2099
    move-object v2, v1

    .line 2100
    iget-object v1, v15, Lnc5;->d:Lmf7;

    .line 2101
    .line 2102
    if-eqz v1, :cond_71

    .line 2103
    .line 2104
    iget-wide v5, v1, Lmf7;->a:J

    .line 2105
    .line 2106
    invoke-static {v5, v6}, Lwg7;->b(J)J

    .line 2107
    .line 2108
    .line 2109
    move-result-wide v10

    .line 2110
    const-wide v12, 0x100000000L

    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    invoke-static {v10, v11, v12, v13}, Lxg7;->a(JJ)Z

    .line 2116
    .line 2117
    .line 2118
    move-result v1

    .line 2119
    if-eqz v1, :cond_70

    .line 2120
    .line 2121
    invoke-interface {v2, v5, v6}, Ltp1;->C0(J)F

    .line 2122
    .line 2123
    .line 2124
    goto :goto_49

    .line 2125
    :cond_70
    const-wide v1, 0x200000000L

    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    invoke-static {v10, v11, v1, v2}, Lxg7;->a(JJ)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v1

    .line 2134
    if-eqz v1, :cond_71

    .line 2135
    .line 2136
    invoke-static {v5, v6}, Lwg7;->c(J)F

    .line 2137
    .line 2138
    .line 2139
    :cond_71
    :goto_49
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 2140
    .line 2141
    .line 2142
    move-result v1

    .line 2143
    const/4 v2, 0x0

    .line 2144
    :goto_4a
    if-ge v2, v1, :cond_72

    .line 2145
    .line 2146
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v3

    .line 2150
    check-cast v3, Lul;

    .line 2151
    .line 2152
    iget-object v3, v3, Lul;->a:Ljava/lang/Object;

    .line 2153
    .line 2154
    add-int/lit8 v2, v2, 0x1

    .line 2155
    .line 2156
    goto :goto_4a

    .line 2157
    :cond_72
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 2158
    .line 2159
    .line 2160
    move-result v1

    .line 2161
    if-lez v1, :cond_75

    .line 2162
    .line 2163
    const/4 v13, 0x0

    .line 2164
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v0

    .line 2168
    check-cast v0, Lul;

    .line 2169
    .line 2170
    iget-object v1, v0, Lul;->a:Ljava/lang/Object;

    .line 2171
    .line 2172
    if-nez v1, :cond_74

    .line 2173
    .line 2174
    iget v1, v0, Lul;->b:I

    .line 2175
    .line 2176
    iget v0, v0, Lul;->c:I

    .line 2177
    .line 2178
    const-class v2, Luq7;

    .line 2179
    .line 2180
    invoke-interface {v9, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v0

    .line 2184
    array-length v1, v0

    .line 2185
    :goto_4b
    if-ge v13, v1, :cond_73

    .line 2186
    .line 2187
    aget-object v2, v0, v13

    .line 2188
    .line 2189
    check-cast v2, Luq7;

    .line 2190
    .line 2191
    invoke-interface {v9, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2192
    .line 2193
    .line 2194
    add-int/lit8 v13, v13, 0x1

    .line 2195
    .line 2196
    goto :goto_4b

    .line 2197
    :cond_73
    new-instance v0, Lhh5;

    .line 2198
    .line 2199
    throw p1

    .line 2200
    :cond_74
    invoke-static {}, Lku4;->a()V

    .line 2201
    .line 2202
    .line 2203
    throw p1

    .line 2204
    :cond_75
    :goto_4c
    iput-object v9, v0, Ldh;->D:Ljava/lang/CharSequence;

    .line 2205
    .line 2206
    new-instance v1, Ljy3;

    .line 2207
    .line 2208
    iget-object v2, v0, Ldh;->C:Lzi;

    .line 2209
    .line 2210
    iget v3, v0, Ldh;->H:I

    .line 2211
    .line 2212
    invoke-direct {v1, v9, v2, v3}, Ljy3;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    .line 2213
    .line 2214
    .line 2215
    iput-object v1, v0, Ldh;->E:Ljy3;

    .line 2216
    .line 2217
    return-void

    .line 2218
    :cond_76
    const-string v0, "Array is empty."

    .line 2219
    .line 2220
    invoke-static {v0}, Lkj6;->i(Ljava/lang/String;)V

    .line 2221
    .line 2222
    .line 2223
    throw p1

    .line 2224
    :cond_77
    const/16 p1, 0x0

    .line 2225
    .line 2226
    const-string v0, "Invalid TextDirection."

    .line 2227
    .line 2228
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 2229
    .line 2230
    .line 2231
    throw p1
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldh;->F:Lcf4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcf4;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Ldh;->G:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Ldh;->x:Ltg7;

    .line 19
    .line 20
    invoke-static {p0}, Lc35;->c(Ltg7;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, La32;->a:Lji8;

    .line 27
    .line 28
    sget-object p0, La32;->a:Lji8;

    .line 29
    .line 30
    iget-object v0, p0, Lji8;->x:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La37;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, Lw22;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lji8;->x()La37;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lji8;->x:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v0, Lrc9;->n:Lg93;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
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
.end method

.method public final d()F
    .locals 10

    .line 1
    iget-object p0, p0, Ldh;->E:Ljy3;

    .line 2
    .line 3
    iget v0, p0, Ljy3;->e:F

    .line 4
    .line 5
    iget-object v1, p0, Ljy3;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Ljy3;->e:F

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Lgo0;

    .line 25
    .line 26
    iget-object v3, p0, Ljy3;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v4, v3}, Lgo0;-><init>(ILjava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v3, Lsu0;->f:Lwh;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    const/4 v6, -0x1

    .line 53
    if-eq v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    new-instance v6, Lre3;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, Lpe3;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lre3;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, Lpe3;->x:I

    .line 80
    .line 81
    iget v6, v6, Lpe3;->w:I

    .line 82
    .line 83
    sub-int/2addr v8, v6

    .line 84
    sub-int v6, v3, v5

    .line 85
    .line 86
    if-ge v8, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v6, Lre3;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, Lpe3;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    move v9, v5

    .line 104
    move v5, v3

    .line 105
    move v3, v9

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v3, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lre3;

    .line 130
    .line 131
    iget v3, v2, Lpe3;->w:I

    .line 132
    .line 133
    iget v2, v2, Lpe3;->x:I

    .line 134
    .line 135
    invoke-virtual {p0}, Ljy3;->b()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move v3, v2

    .line 144
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lre3;

    .line 155
    .line 156
    iget v4, v2, Lpe3;->w:I

    .line 157
    .line 158
    iget v2, v2, Lpe3;->x:I

    .line 159
    .line 160
    invoke-virtual {p0}, Ljy3;->b()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    :goto_3
    iput v3, p0, Ljy3;->e:F

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    invoke-static {}, Lrf2;->c()V

    .line 177
    .line 178
    .line 179
    return v3
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method

.method public final e()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldh;->E:Ljy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljy3;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
