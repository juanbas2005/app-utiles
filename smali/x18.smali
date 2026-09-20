.class public final Lx18;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldj0;


# instance fields
.field public final a:Ldj0;

.field public final b:Z

.field public final c:Lcf4;


# direct methods
.method public constructor <init>(Ldj0;Lp16;Ljava/util/List;Z)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lx18;->a:Ldj0;

    .line 8
    .line 9
    iput-boolean p4, p0, Lx18;->b:Z

    .line 10
    .line 11
    invoke-interface {p2}, Leq3;->k()Las3;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    instance-of v0, p2, Ls16;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    move-object v3, p2

    .line 22
    check-cast v3, Ls16;

    .line 23
    .line 24
    invoke-interface {v3}, Lzq3;->i()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-static {p4}, Lg18;->s(Las3;)Las3;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-static {v3}, Ll55;->q(Las3;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ne v3, v2, :cond_1

    .line 41
    .line 42
    :cond_0
    move-object v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p4}, Ll55;->x(Las3;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    if-eqz p4, :cond_0

    .line 49
    .line 50
    :try_start_0
    const-string v3, "box-impl"

    .line 51
    .line 52
    invoke-static {p4, p2}, Ll55;->n(Ljava/lang/Class;Lp16;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p4, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catch_0
    const-string p0, "No box method found in inline class: "

    .line 73
    .line 74
    const-string p1, " (calling "

    .line 75
    .line 76
    invoke-static {p0, p4, p1, p2}, Lh;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :goto_0
    instance-of p4, p2, Lsr3;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    if-eqz p4, :cond_2

    .line 84
    .line 85
    move-object p4, p2

    .line 86
    check-cast p4, Lsr3;

    .line 87
    .line 88
    invoke-interface {p4}, Lrr3;->N()Lyr3;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p4, Lu16;

    .line 96
    .line 97
    invoke-static {p4}, Ll55;->r(Lu16;)Z

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    if-eqz p4, :cond_2

    .line 102
    .line 103
    new-instance p1, Lcf4;

    .line 104
    .line 105
    sget-object p2, Lre3;->z:Lre3;

    .line 106
    .line 107
    new-array p3, v4, [Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-direct {p1, p2, p3, v3}, Lcf4;-><init>(Lre3;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_f

    .line 113
    .line 114
    :cond_2
    instance-of p4, p1, Lqj0;

    .line 115
    .line 116
    sget-object v5, Lqr3;->w:Lqr3;

    .line 117
    .line 118
    const/4 v6, -0x1

    .line 119
    if-eqz p4, :cond_3

    .line 120
    .line 121
    move-object p4, p1

    .line 122
    check-cast p4, Lqj0;

    .line 123
    .line 124
    iget-boolean p4, p4, Lqj0;->f:Z

    .line 125
    .line 126
    if-nez p4, :cond_3

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-static {p2}, Lr16;->a0(Lp16;)Z

    .line 130
    .line 131
    .line 132
    move-result p4

    .line 133
    if-eqz p4, :cond_5

    .line 134
    .line 135
    instance-of p1, p1, Ldb0;

    .line 136
    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    :goto_1
    move v6, v4

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    invoke-interface {p2}, Leq3;->getParameters()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result p4

    .line 152
    if-eqz p4, :cond_6

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result p4

    .line 163
    if-eqz p4, :cond_4

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    check-cast p4, Lt16;

    .line 170
    .line 171
    invoke-virtual {p4}, Lt16;->u()Lqr3;

    .line 172
    .line 173
    .line 174
    move-result-object p4

    .line 175
    if-ne p4, v5, :cond_7

    .line 176
    .line 177
    invoke-interface {p2}, Lp16;->B()Lyq3;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    instance-of p4, p1, Loq3;

    .line 182
    .line 183
    if-eqz p4, :cond_8

    .line 184
    .line 185
    check-cast p1, Loq3;

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_8
    move-object p1, v1

    .line 189
    :goto_2
    if-eqz p1, :cond_9

    .line 190
    .line 191
    invoke-virtual {p1}, Loq3;->z()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-ne p1, v2, :cond_9

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_9
    move v6, v2

    .line 199
    :goto_3
    iget-object p1, p0, Lx18;->a:Ldj0;

    .line 200
    .line 201
    invoke-interface {p1}, Ldj0;->b()Ljava/lang/reflect/Member;

    .line 202
    .line 203
    .line 204
    new-instance p1, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {p2}, Lp16;->B()Lyq3;

    .line 210
    .line 211
    .line 212
    move-result-object p4

    .line 213
    invoke-static {p2}, Lr16;->a0(Lp16;)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-nez v7, :cond_a

    .line 218
    .line 219
    instance-of v7, p4, Lgq3;

    .line 220
    .line 221
    if-eqz v7, :cond_a

    .line 222
    .line 223
    move-object v7, p4

    .line 224
    check-cast v7, Lgq3;

    .line 225
    .line 226
    invoke-interface {v7}, Lgq3;->z()Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_a

    .line 231
    .line 232
    invoke-static {v7}, Luq3;->p(Lgq3;)Lc2;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    :cond_a
    invoke-static {p2}, Lr16;->a0(Lp16;)Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-eqz v7, :cond_c

    .line 244
    .line 245
    instance-of v7, p4, Lgq3;

    .line 246
    .line 247
    if-eqz v7, :cond_b

    .line 248
    .line 249
    check-cast p4, Lgq3;

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_b
    move-object p4, v1

    .line 253
    :goto_4
    if-eqz p4, :cond_c

    .line 254
    .line 255
    invoke-interface {p4}, Lgq3;->p()Z

    .line 256
    .line 257
    .line 258
    move-result p4

    .line 259
    if-ne p4, v2, :cond_c

    .line 260
    .line 261
    move p4, v2

    .line 262
    goto :goto_5

    .line 263
    :cond_c
    move p4, v4

    .line 264
    :goto_5
    invoke-interface {p2}, Lp16;->a()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    :cond_d
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-eqz v8, :cond_f

    .line 277
    .line 278
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    check-cast v8, Lt16;

    .line 283
    .line 284
    invoke-virtual {v8}, Lt16;->u()Lqr3;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    if-ne v9, v5, :cond_e

    .line 289
    .line 290
    if-eqz p4, :cond_d

    .line 291
    .line 292
    :cond_e
    invoke-virtual {v8}, Lt16;->y()Las3;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_f
    invoke-interface {p2}, Lp16;->a()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object p4

    .line 304
    if-eqz p4, :cond_10

    .line 305
    .line 306
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_10

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_10
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object p4

    .line 317
    :cond_11
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_12

    .line 322
    .line 323
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Lt16;

    .line 328
    .line 329
    invoke-virtual {v5}, Lt16;->u()Lqr3;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    sget-object v7, Lqr3;->y:Lqr3;

    .line 334
    .line 335
    if-ne v5, v7, :cond_11

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 338
    .line 339
    .line 340
    move-result p4

    .line 341
    sub-int/2addr p4, v2

    .line 342
    goto :goto_8

    .line 343
    :cond_12
    :goto_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result p4

    .line 347
    :goto_8
    iget-boolean v5, p0, Lx18;->b:Z

    .line 348
    .line 349
    if-eqz v5, :cond_13

    .line 350
    .line 351
    add-int/lit8 p4, p4, 0x1f

    .line 352
    .line 353
    div-int/lit8 p4, p4, 0x20

    .line 354
    .line 355
    add-int/2addr p4, v2

    .line 356
    goto :goto_9

    .line 357
    :cond_13
    move p4, v4

    .line 358
    :goto_9
    if-eqz v0, :cond_14

    .line 359
    .line 360
    move-object v0, p2

    .line 361
    check-cast v0, Ls16;

    .line 362
    .line 363
    invoke-interface {v0}, Lzq3;->i()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_14

    .line 368
    .line 369
    move v0, v2

    .line 370
    goto :goto_a

    .line 371
    :cond_14
    move v0, v4

    .line 372
    :goto_a
    add-int/2addr p4, v0

    .line 373
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    add-int/2addr v0, v6

    .line 378
    add-int/2addr v0, p4

    .line 379
    iget-boolean p4, p0, Lx18;->b:Z

    .line 380
    .line 381
    invoke-virtual {p0}, Lx18;->a()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-ne v5, v0, :cond_1a

    .line 390
    .line 391
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    .line 392
    .line 393
    .line 394
    move-result p4

    .line 395
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    add-int/2addr v5, v6

    .line 400
    invoke-static {p4, v5}, Lz65;->V(II)Lre3;

    .line 401
    .line 402
    .line 403
    move-result-object p4

    .line 404
    new-array v5, v0, [Ljava/lang/reflect/Method;

    .line 405
    .line 406
    move v7, v4

    .line 407
    :goto_b
    if-ge v7, v0, :cond_16

    .line 408
    .line 409
    iget v8, p4, Lpe3;->w:I

    .line 410
    .line 411
    iget v9, p4, Lpe3;->x:I

    .line 412
    .line 413
    if-gt v7, v9, :cond_15

    .line 414
    .line 415
    if-gt v8, v7, :cond_15

    .line 416
    .line 417
    sub-int v8, v7, v6

    .line 418
    .line 419
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    check-cast v8, Las3;

    .line 424
    .line 425
    invoke-static {v8}, Ll55;->x(Las3;)Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    if-eqz v8, :cond_15

    .line 430
    .line 431
    invoke-static {v8, p2}, Ll55;->n(Ljava/lang/Class;Lp16;)Ljava/lang/reflect/Method;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    goto :goto_c

    .line 436
    :cond_15
    move-object v8, v1

    .line 437
    :goto_c
    aput-object v8, v5, v7

    .line 438
    .line 439
    add-int/lit8 v7, v7, 0x1

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result p3

    .line 450
    if-eqz p3, :cond_17

    .line 451
    .line 452
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p3

    .line 456
    check-cast p3, Ljava/lang/Number;

    .line 457
    .line 458
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result p3

    .line 462
    aput-object v1, v5, p3

    .line 463
    .line 464
    goto :goto_d

    .line 465
    :cond_17
    invoke-interface {p2}, Lp16;->B()Lyq3;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-static {p2}, Lr16;->a0(Lp16;)Z

    .line 470
    .line 471
    .line 472
    move-result p2

    .line 473
    if-nez p2, :cond_19

    .line 474
    .line 475
    instance-of p2, p1, Lgq3;

    .line 476
    .line 477
    if-eqz p2, :cond_19

    .line 478
    .line 479
    check-cast p1, Lgq3;

    .line 480
    .line 481
    invoke-interface {p1}, Lgq3;->z()Z

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    if-eqz p1, :cond_19

    .line 486
    .line 487
    iget-object p1, p0, Lx18;->a:Ldj0;

    .line 488
    .line 489
    invoke-interface {p1}, Ldj0;->b()Ljava/lang/reflect/Member;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    if-eqz p1, :cond_19

    .line 494
    .line 495
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    if-nez p1, :cond_18

    .line 500
    .line 501
    move p1, v4

    .line 502
    goto :goto_e

    .line 503
    :cond_18
    sget-object p2, Lb26;->a:Lc26;

    .line 504
    .line 505
    invoke-virtual {p2, p1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-interface {p1}, Lgq3;->z()Z

    .line 510
    .line 511
    .line 512
    move-result p1

    .line 513
    xor-int/2addr p1, v2

    .line 514
    :goto_e
    if-ne p1, v2, :cond_19

    .line 515
    .line 516
    aput-object v1, v5, v4

    .line 517
    .line 518
    :cond_19
    new-instance p1, Lcf4;

    .line 519
    .line 520
    invoke-direct {p1, p4, v5, v3}, Lcf4;-><init>(Lre3;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 521
    .line 522
    .line 523
    :goto_f
    iput-object p1, p0, Lx18;->c:Lcf4;

    .line 524
    .line 525
    return-void

    .line 526
    :cond_1a
    new-instance p1, Lu81;

    .line 527
    .line 528
    new-instance p3, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    const-string v1, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    .line 531
    .line 532
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    iget-object v1, p0, Lx18;->a:Ldj0;

    .line 536
    .line 537
    invoke-interface {v1}, Ldj0;->a()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    const-string v1, " != "

    .line 549
    .line 550
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    const-string v0, "\nCalling: "

    .line 557
    .line 558
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 565
    .line 566
    invoke-interface {p0}, Ldj0;->a()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    const-string p2, "\nParameter types: "

    .line 571
    .line 572
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    const-string p0, ")\nDefault: "

    .line 579
    .line 580
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    invoke-direct {p1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    throw p1
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
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 2
    .line 3
    invoke-interface {p0}, Ldj0;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final b()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 2
    .line 3
    invoke-interface {p0}, Ldj0;->b()Ljava/lang/reflect/Member;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 2
    .line 3
    instance-of p0, p0, Loj0;

    .line 4
    .line 5
    return p0
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

.method public final d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lx18;->c:Lcf4;

    .line 2
    .line 3
    iget-object v1, v0, Lcf4;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lre3;

    .line 6
    .line 7
    iget-object v2, v0, Lcf4;->y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, [Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iget-object v0, v0, Lcf4;->z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/reflect/Method;

    .line 14
    .line 15
    array-length v3, p1

    .line 16
    new-array v4, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    :goto_0
    const/4 v6, 0x0

    .line 20
    if-ge v5, v3, :cond_3

    .line 21
    .line 22
    aget-object v7, p1, v5

    .line 23
    .line 24
    iget v8, v1, Lpe3;->w:I

    .line 25
    .line 26
    iget v9, v1, Lpe3;->x:I

    .line 27
    .line 28
    if-gt v5, v9, :cond_2

    .line 29
    .line 30
    if-gt v8, v5, :cond_2

    .line 31
    .line 32
    aget-object v8, v2, v5

    .line 33
    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-virtual {v8, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v6}, Lg18;->f(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    :cond_2
    :goto_1
    aput-object v7, v4, v5

    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 61
    .line 62
    invoke-interface {p0, v4}, Ldj0;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lp81;->w:Lp81;

    .line 67
    .line 68
    if-ne p0, p1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    if-eqz v0, :cond_6

    .line 72
    .line 73
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, v6, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    return-object p1

    .line 85
    :cond_6
    :goto_2
    return-object p0
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
.end method

.method public final k()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lx18;->a:Ldj0;

    .line 2
    .line 3
    invoke-interface {p0}, Ldj0;->k()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
