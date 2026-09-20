.class public final Lpb;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lpb;->x:I

    .line 2
    .line 3
    iput-object p2, p0, Lpb;->y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lpb;->x:I

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, Lvs7;->a:Lvs7;

    .line 13
    .line 14
    iget-object v0, v0, Lpb;->y:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v1, Ljava/lang/Throwable;

    .line 20
    .line 21
    check-cast v0, Lg97;

    .line 22
    .line 23
    iget-object v2, v0, Lg97;->y:Lkk0;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lkk0;->a(Ljava/lang/Throwable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-object v6, v0, Lg97;->y:Lkk0;

    .line 31
    .line 32
    return-object v8

    .line 33
    :pswitch_0
    check-cast v1, Ll76;

    .line 34
    .line 35
    check-cast v0, Lbu6;

    .line 36
    .line 37
    iget v2, v0, Lbu6;->K:F

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ll76;->l(F)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Lbu6;->L:F

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ll76;->m(F)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Lbu6;->M:F

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ll76;->c(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ll76;->y(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v4}, Ll76;->A(F)V

    .line 56
    .line 57
    .line 58
    iget v2, v0, Lbu6;->N:F

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ll76;->n(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v4}, Ll76;->h(F)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ll76;->j(F)V

    .line 67
    .line 68
    .line 69
    iget v2, v0, Lbu6;->O:F

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ll76;->k(F)V

    .line 72
    .line 73
    .line 74
    iget v2, v0, Lbu6;->P:F

    .line 75
    .line 76
    iget v3, v1, Ll76;->I:F

    .line 77
    .line 78
    cmpg-float v3, v3, v2

    .line 79
    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget v3, v1, Ll76;->w:I

    .line 84
    .line 85
    or-int/lit16 v3, v3, 0x800

    .line 86
    .line 87
    iput v3, v1, Ll76;->w:I

    .line 88
    .line 89
    iput v2, v1, Ll76;->I:F

    .line 90
    .line 91
    :goto_0
    iget-wide v2, v0, Lbu6;->Q:J

    .line 92
    .line 93
    invoke-virtual {v1, v2, v3}, Ll76;->w(J)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, Lbu6;->R:Lpq6;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ll76;->r(Lpq6;)V

    .line 99
    .line 100
    .line 101
    iget-boolean v2, v0, Lbu6;->S:Z

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ll76;->f(Z)V

    .line 104
    .line 105
    .line 106
    iget-wide v2, v0, Lbu6;->T:J

    .line 107
    .line 108
    invoke-virtual {v1, v2, v3}, Ll76;->d(J)V

    .line 109
    .line 110
    .line 111
    iget-wide v2, v0, Lbu6;->U:J

    .line 112
    .line 113
    invoke-virtual {v1, v2, v3}, Ll76;->v(J)V

    .line 114
    .line 115
    .line 116
    iget v2, v1, Ll76;->M:I

    .line 117
    .line 118
    if-nez v2, :cond_2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    iget v2, v1, Ll76;->w:I

    .line 122
    .line 123
    const v3, 0x8000

    .line 124
    .line 125
    .line 126
    or-int/2addr v2, v3

    .line 127
    iput v2, v1, Ll76;->w:I

    .line 128
    .line 129
    iput v7, v1, Ll76;->M:I

    .line 130
    .line 131
    :goto_1
    iget v2, v0, Lbu6;->V:I

    .line 132
    .line 133
    iget v3, v1, Ll76;->S:I

    .line 134
    .line 135
    if-ne v3, v2, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    iget v3, v1, Ll76;->w:I

    .line 139
    .line 140
    const/high16 v4, 0x80000

    .line 141
    .line 142
    or-int/2addr v3, v4

    .line 143
    iput v3, v1, Ll76;->w:I

    .line 144
    .line 145
    iput v2, v1, Ll76;->S:I

    .line 146
    .line 147
    :goto_2
    invoke-virtual {v1, v6}, Ll76;->g(Llt0;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v0, Lbu6;->W:Lzx3;

    .line 151
    .line 152
    iget-object v2, v1, Ll76;->O:Lzx3;

    .line 153
    .line 154
    invoke-static {v2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_4

    .line 159
    .line 160
    iget v2, v1, Ll76;->w:I

    .line 161
    .line 162
    const/high16 v3, 0x100000

    .line 163
    .line 164
    or-int/2addr v2, v3

    .line 165
    iput v2, v1, Ll76;->w:I

    .line 166
    .line 167
    iput-object v0, v1, Ll76;->O:Lzx3;

    .line 168
    .line 169
    :cond_4
    return-object v8

    .line 170
    :pswitch_1
    check-cast v1, Ll76;

    .line 171
    .line 172
    check-cast v0, Lmq6;

    .line 173
    .line 174
    iget-object v2, v1, Ll76;->P:Ltp1;

    .line 175
    .line 176
    invoke-interface {v2}, Ltp1;->b()F

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    const/high16 v3, 0x40400000    # 3.0f

    .line 181
    .line 182
    mul-float/2addr v2, v3

    .line 183
    invoke-virtual {v1, v2}, Ll76;->n(F)V

    .line 184
    .line 185
    .line 186
    iget-object v2, v0, Lmq6;->w:Lpq6;

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ll76;->r(Lpq6;)V

    .line 189
    .line 190
    .line 191
    iget-boolean v2, v0, Lmq6;->x:Z

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Ll76;->f(Z)V

    .line 194
    .line 195
    .line 196
    iget-wide v2, v0, Lmq6;->y:J

    .line 197
    .line 198
    invoke-virtual {v1, v2, v3}, Ll76;->d(J)V

    .line 199
    .line 200
    .line 201
    iget-wide v2, v0, Lmq6;->z:J

    .line 202
    .line 203
    invoke-virtual {v1, v2, v3}, Ll76;->v(J)V

    .line 204
    .line 205
    .line 206
    return-object v8

    .line 207
    :pswitch_2
    check-cast v1, Ljava/util/List;

    .line 208
    .line 209
    check-cast v0, Lc34;

    .line 210
    .line 211
    invoke-virtual {v0}, Lc34;->b()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Ljava/lang/Float;

    .line 216
    .line 217
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    return-object v0

    .line 225
    :pswitch_3
    check-cast v1, Lok6;

    .line 226
    .line 227
    check-cast v0, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v1, v0}, Lmk6;->c(Lok6;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-object v8

    .line 233
    :pswitch_4
    check-cast v1, Lok6;

    .line 234
    .line 235
    check-cast v0, Ls86;

    .line 236
    .line 237
    iget v0, v0, Ls86;->a:I

    .line 238
    .line 239
    invoke-static {v1, v0}, Lmk6;->f(Lok6;I)V

    .line 240
    .line 241
    .line 242
    return-object v8

    .line 243
    :pswitch_5
    check-cast v1, Lkl4;

    .line 244
    .line 245
    check-cast v0, Leq4;

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Leq4;->b(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_6
    check-cast v1, Ljava/lang/Throwable;

    .line 254
    .line 255
    check-cast v0, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 256
    .line 257
    invoke-interface {v0, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 258
    .line 259
    .line 260
    return-object v8

    .line 261
    :pswitch_7
    check-cast v1, Lt15;

    .line 262
    .line 263
    iget-object v2, v1, Lt15;->b:Ljy5;

    .line 264
    .line 265
    if-eqz v2, :cond_5

    .line 266
    .line 267
    invoke-virtual {v2}, Ljy5;->closeConnection()V

    .line 268
    .line 269
    .line 270
    iput-object v6, v1, Lt15;->b:Ljy5;

    .line 271
    .line 272
    :cond_5
    check-cast v0, Lrc3;

    .line 273
    .line 274
    iget-object v2, v0, Lrc3;->d:Leq4;

    .line 275
    .line 276
    iget-object v4, v2, Leq4;->w:[Ljava/lang/Object;

    .line 277
    .line 278
    iget v5, v2, Leq4;->y:I

    .line 279
    .line 280
    :goto_3
    if-ge v7, v5, :cond_7

    .line 281
    .line 282
    aget-object v6, v4, v7

    .line 283
    .line 284
    check-cast v6, Ln88;

    .line 285
    .line 286
    invoke-static {v6, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-eqz v6, :cond_6

    .line 291
    .line 292
    move v3, v7

    .line 293
    goto :goto_4

    .line 294
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_7
    :goto_4
    if-ltz v3, :cond_8

    .line 298
    .line 299
    invoke-virtual {v2, v3}, Leq4;->l(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    :cond_8
    iget v1, v2, Leq4;->y:I

    .line 303
    .line 304
    if-nez v1, :cond_9

    .line 305
    .line 306
    iget-object v0, v0, Lrc3;->b:Lkh;

    .line 307
    .line 308
    invoke-virtual {v0}, Lkh;->b()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    :cond_9
    return-object v8

    .line 312
    :pswitch_8
    check-cast v1, Lu18;

    .line 313
    .line 314
    check-cast v0, Lsx2;

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Lsx2;->g(Lu18;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v0, Lsx2;->i:Lvr2;

    .line 320
    .line 321
    if-eqz v0, :cond_a

    .line 322
    .line 323
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    :cond_a
    return-object v8

    .line 327
    :pswitch_9
    check-cast v1, Lhz1;

    .line 328
    .line 329
    check-cast v0, Lfx2;

    .line 330
    .line 331
    invoke-interface {v1}, Lhz1;->j0()Lwr0;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v2}, Lwr0;->D()Lqk0;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    iget-object v0, v0, Lfx2;->z:Lgs2;

    .line 340
    .line 341
    if-eqz v0, :cond_b

    .line 342
    .line 343
    invoke-interface {v1}, Lhz1;->j0()Lwr0;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v1, v1, Lwr0;->y:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v1, Lcx2;

    .line 350
    .line 351
    invoke-interface {v0, v2, v1}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    :cond_b
    return-object v8

    .line 355
    :pswitch_a
    check-cast v1, Lhz1;

    .line 356
    .line 357
    check-cast v0, Lcx2;

    .line 358
    .line 359
    iget-object v2, v0, Lcx2;->l:Leh;

    .line 360
    .line 361
    iget-boolean v3, v0, Lcx2;->n:Z

    .line 362
    .line 363
    if-eqz v3, :cond_c

    .line 364
    .line 365
    iget-boolean v3, v0, Lcx2;->A:Z

    .line 366
    .line 367
    if-eqz v3, :cond_c

    .line 368
    .line 369
    if-eqz v2, :cond_c

    .line 370
    .line 371
    invoke-interface {v1}, Lhz1;->j0()Lwr0;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-virtual {v3}, Lwr0;->L()J

    .line 376
    .line 377
    .line 378
    move-result-wide v4

    .line 379
    invoke-virtual {v3}, Lwr0;->D()Lqk0;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-interface {v6}, Lqk0;->h()V

    .line 384
    .line 385
    .line 386
    :try_start_0
    iget-object v6, v3, Lwr0;->x:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v6, Lji8;

    .line 389
    .line 390
    iget-object v6, v6, Lji8;->x:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v6, Lwr0;

    .line 393
    .line 394
    invoke-virtual {v6}, Lwr0;->D()Lqk0;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    invoke-interface {v6, v2}, Lqk0;->k(Leh;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v1}, Lcx2;->c(Lhz1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 402
    .line 403
    .line 404
    invoke-static {v3, v4, v5}, Lb81;->u(Lwr0;J)V

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :catchall_0
    move-exception v0

    .line 409
    invoke-static {v3, v4, v5}, Lb81;->u(Lwr0;J)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_c
    invoke-virtual {v0, v1}, Lcx2;->c(Lhz1;)V

    .line 414
    .line 415
    .line 416
    :goto_5
    return-object v8

    .line 417
    :pswitch_b
    sget-object v1, Lfw2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 418
    .line 419
    invoke-virtual {v1, v7, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_d

    .line 424
    .line 425
    check-cast v0, Lad0;

    .line 426
    .line 427
    invoke-interface {v0, v8}, Lxk6;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    :cond_d
    return-object v8

    .line 431
    :pswitch_c
    check-cast v1, Lux1;

    .line 432
    .line 433
    iget-object v2, v1, Lll4;->w:Lll4;

    .line 434
    .line 435
    iget-boolean v2, v2, Lll4;->J:Z

    .line 436
    .line 437
    if-nez v2, :cond_e

    .line 438
    .line 439
    sget-object v0, Lkn7;->x:Lkn7;

    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_e
    iget-object v2, v1, Lux1;->L:Lux1;

    .line 443
    .line 444
    sget-object v3, Lkn7;->w:Lkn7;

    .line 445
    .line 446
    if-eqz v2, :cond_10

    .line 447
    .line 448
    check-cast v0, Lf96;

    .line 449
    .line 450
    new-instance v4, Lpb;

    .line 451
    .line 452
    const/16 v5, 0xa

    .line 453
    .line 454
    invoke-direct {v4, v5, v0}, Lpb;-><init>(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4, v2}, Lpb;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-eq v0, v3, :cond_f

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_f
    invoke-static {v2, v4}, Lh75;->w(Lln7;Lvr2;)V

    .line 465
    .line 466
    .line 467
    :cond_10
    :goto_6
    iput-object v6, v1, Lux1;->L:Lux1;

    .line 468
    .line 469
    iput-object v6, v1, Lux1;->K:Lux1;

    .line 470
    .line 471
    move-object v0, v3

    .line 472
    :goto_7
    return-object v0

    .line 473
    :pswitch_d
    check-cast v1, Lkw1;

    .line 474
    .line 475
    check-cast v0, Lnw1;

    .line 476
    .line 477
    new-instance v1, Ld9;

    .line 478
    .line 479
    const/4 v2, 0x6

    .line 480
    invoke-direct {v1, v2, v0}, Ld9;-><init>(ILjava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v1

    .line 484
    :pswitch_e
    check-cast v1, Ljava/lang/Throwable;

    .line 485
    .line 486
    if-eqz v1, :cond_11

    .line 487
    .line 488
    check-cast v0, Landroid/os/CancellationSignal;

    .line 489
    .line 490
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 491
    .line 492
    .line 493
    :cond_11
    return-object v8

    .line 494
    :pswitch_f
    check-cast v1, Lnl;

    .line 495
    .line 496
    iget v2, v1, Lnl;->b:F

    .line 497
    .line 498
    cmpg-float v3, v2, v4

    .line 499
    .line 500
    if-gez v3, :cond_12

    .line 501
    .line 502
    move v2, v4

    .line 503
    :cond_12
    const/high16 v3, 0x3f800000    # 1.0f

    .line 504
    .line 505
    cmpl-float v5, v2, v3

    .line 506
    .line 507
    if-lez v5, :cond_13

    .line 508
    .line 509
    move v2, v3

    .line 510
    :cond_13
    iget v5, v1, Lnl;->c:F

    .line 511
    .line 512
    const/high16 v6, -0x41000000    # -0.5f

    .line 513
    .line 514
    cmpg-float v7, v5, v6

    .line 515
    .line 516
    if-gez v7, :cond_14

    .line 517
    .line 518
    move v5, v6

    .line 519
    :cond_14
    const/high16 v7, 0x3f000000    # 0.5f

    .line 520
    .line 521
    cmpl-float v8, v5, v7

    .line 522
    .line 523
    if-lez v8, :cond_15

    .line 524
    .line 525
    move v5, v7

    .line 526
    :cond_15
    iget v8, v1, Lnl;->d:F

    .line 527
    .line 528
    cmpg-float v9, v8, v6

    .line 529
    .line 530
    if-gez v9, :cond_16

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_16
    move v6, v8

    .line 534
    :goto_8
    cmpl-float v8, v6, v7

    .line 535
    .line 536
    if-lez v8, :cond_17

    .line 537
    .line 538
    goto :goto_9

    .line 539
    :cond_17
    move v7, v6

    .line 540
    :goto_9
    iget v1, v1, Lnl;->a:F

    .line 541
    .line 542
    cmpg-float v6, v1, v4

    .line 543
    .line 544
    if-gez v6, :cond_18

    .line 545
    .line 546
    goto :goto_a

    .line 547
    :cond_18
    move v4, v1

    .line 548
    :goto_a
    cmpl-float v1, v4, v3

    .line 549
    .line 550
    if-lez v1, :cond_19

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_19
    move v3, v4

    .line 554
    :goto_b
    sget-object v1, Lvt0;->x:Lk45;

    .line 555
    .line 556
    invoke-static {v2, v5, v7, v3, v1}, Luq3;->b(FFFFLtt0;)J

    .line 557
    .line 558
    .line 559
    move-result-wide v1

    .line 560
    check-cast v0, Ltt0;

    .line 561
    .line 562
    invoke-static {v1, v2, v0}, Ljt0;->a(JLtt0;)J

    .line 563
    .line 564
    .line 565
    move-result-wide v0

    .line 566
    new-instance v2, Ljt0;

    .line 567
    .line 568
    invoke-direct {v2, v0, v1}, Ljt0;-><init>(J)V

    .line 569
    .line 570
    .line 571
    return-object v2

    .line 572
    :pswitch_10
    check-cast v1, Lwy3;

    .line 573
    .line 574
    check-cast v0, Lm0;

    .line 575
    .line 576
    invoke-virtual {v0, v1}, Lm0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Lwy3;->a()V

    .line 580
    .line 581
    .line 582
    return-object v8

    .line 583
    :pswitch_11
    invoke-static {v1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    return-object v0

    .line 592
    :pswitch_12
    check-cast v1, Lfk6;

    .line 593
    .line 594
    check-cast v0, Landroid/content/res/Resources;

    .line 595
    .line 596
    invoke-static {v1, v0}, Lfd1;->p(Lfk6;Landroid/content/res/Resources;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    return-object v0

    .line 605
    :pswitch_13
    check-cast v1, Lfk6;

    .line 606
    .line 607
    check-cast v0, Lme3;

    .line 608
    .line 609
    iget v1, v1, Lfk6;->f:I

    .line 610
    .line 611
    invoke-virtual {v0, v1}, Lme3;->a(I)Z

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    return-object v0

    .line 620
    :pswitch_14
    check-cast v1, Lvk2;

    .line 621
    .line 622
    check-cast v0, Lbk2;

    .line 623
    .line 624
    iget v0, v0, Lbk2;->a:I

    .line 625
    .line 626
    invoke-virtual {v1, v0}, Lvk2;->c1(I)Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
    :pswitch_15
    check-cast v1, Lk23;

    .line 636
    .line 637
    check-cast v0, Lxd;

    .line 638
    .line 639
    iget-object v2, v0, Lxd;->K:Lmb8;

    .line 640
    .line 641
    if-nez v2, :cond_1a

    .line 642
    .line 643
    new-instance v2, Lmb8;

    .line 644
    .line 645
    iget-object v4, v0, Lxd;->N:Lje;

    .line 646
    .line 647
    invoke-virtual {v4}, Lje;->getInsetsWatcher()Lob8;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-direct {v2, v4}, Lmb8;-><init>(Lob8;)V

    .line 652
    .line 653
    .line 654
    iput-object v2, v0, Lxd;->K:Lmb8;

    .line 655
    .line 656
    :cond_1a
    sget-object v0, Lmb8;->e:Lyo4;

    .line 657
    .line 658
    iget-object v2, v0, Lme3;->b:[I

    .line 659
    .line 660
    iget-object v4, v0, Lme3;->c:[Ljava/lang/Object;

    .line 661
    .line 662
    iget-object v0, v0, Lme3;->a:[J

    .line 663
    .line 664
    array-length v6, v0

    .line 665
    add-int/lit8 v6, v6, -0x2

    .line 666
    .line 667
    if-ltz v6, :cond_26

    .line 668
    .line 669
    move v8, v7

    .line 670
    move v9, v8

    .line 671
    :goto_c
    aget-wide v10, v0, v8

    .line 672
    .line 673
    not-long v12, v10

    .line 674
    const/4 v14, 0x7

    .line 675
    shl-long/2addr v12, v14

    .line 676
    and-long/2addr v12, v10

    .line 677
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    and-long/2addr v12, v14

    .line 683
    cmp-long v12, v12, v14

    .line 684
    .line 685
    if-eqz v12, :cond_25

    .line 686
    .line 687
    sub-int v12, v8, v6

    .line 688
    .line 689
    not-int v12, v12

    .line 690
    ushr-int/lit8 v12, v12, 0x1f

    .line 691
    .line 692
    const/16 v13, 0x8

    .line 693
    .line 694
    rsub-int/lit8 v12, v12, 0x8

    .line 695
    .line 696
    move v14, v7

    .line 697
    :goto_d
    if-ge v14, v12, :cond_24

    .line 698
    .line 699
    const-wide/16 v15, 0xff

    .line 700
    .line 701
    and-long/2addr v15, v10

    .line 702
    const-wide/16 v17, 0x80

    .line 703
    .line 704
    cmp-long v15, v15, v17

    .line 705
    .line 706
    if-gez v15, :cond_23

    .line 707
    .line 708
    shl-int/lit8 v15, v8, 0x3

    .line 709
    .line 710
    add-int/2addr v15, v14

    .line 711
    aget v5, v2, v15

    .line 712
    .line 713
    aget-object v15, v4, v15

    .line 714
    .line 715
    check-cast v15, Lkb8;

    .line 716
    .line 717
    move-object v7, v15

    .line 718
    check-cast v7, Llb8;

    .line 719
    .line 720
    iget-object v7, v7, Llb8;->c:Lic3;

    .line 721
    .line 722
    invoke-static {v1, v7}, Lmb8;->a(Lk23;Lic3;)Z

    .line 723
    .line 724
    .line 725
    move-result v7

    .line 726
    if-eqz v7, :cond_1b

    .line 727
    .line 728
    :goto_e
    const/4 v5, 0x1

    .line 729
    const/4 v9, 0x1

    .line 730
    goto :goto_11

    .line 731
    :cond_1b
    check-cast v15, Llb8;

    .line 732
    .line 733
    iget-object v7, v15, Llb8;->d:Lic3;

    .line 734
    .line 735
    invoke-static {v1, v7}, Lmb8;->a(Lk23;Lic3;)Z

    .line 736
    .line 737
    .line 738
    move-result v7

    .line 739
    if-eqz v7, :cond_1c

    .line 740
    .line 741
    :goto_f
    goto :goto_e

    .line 742
    :cond_1c
    if-ne v5, v3, :cond_1d

    .line 743
    .line 744
    goto :goto_10

    .line 745
    :cond_1d
    sget-object v7, Lmb8;->c:Lyo4;

    .line 746
    .line 747
    invoke-virtual {v7, v5}, Lme3;->b(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v7

    .line 751
    check-cast v7, Lic3;

    .line 752
    .line 753
    if-nez v7, :cond_1f

    .line 754
    .line 755
    :cond_1e
    :goto_10
    const/4 v5, 0x0

    .line 756
    goto :goto_11

    .line 757
    :cond_1f
    invoke-static {v1, v7}, Lmb8;->a(Lk23;Lic3;)Z

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    if-eqz v7, :cond_20

    .line 762
    .line 763
    goto :goto_e

    .line 764
    :cond_20
    sget-object v7, Lmb8;->d:Lyo4;

    .line 765
    .line 766
    invoke-virtual {v7, v5}, Lme3;->b(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    check-cast v5, Lic3;

    .line 771
    .line 772
    if-nez v5, :cond_21

    .line 773
    .line 774
    goto :goto_10

    .line 775
    :cond_21
    invoke-static {v1, v5}, Lmb8;->a(Lk23;Lic3;)Z

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    if-eqz v5, :cond_1e

    .line 780
    .line 781
    goto :goto_f

    .line 782
    :goto_11
    if-eqz v5, :cond_23

    .line 783
    .line 784
    :cond_22
    :goto_12
    move v5, v9

    .line 785
    goto :goto_16

    .line 786
    :cond_23
    shr-long/2addr v10, v13

    .line 787
    add-int/lit8 v14, v14, 0x1

    .line 788
    .line 789
    const/4 v5, 0x1

    .line 790
    const/4 v7, 0x0

    .line 791
    goto :goto_d

    .line 792
    :cond_24
    if-ne v12, v13, :cond_27

    .line 793
    .line 794
    :cond_25
    if-eq v8, v6, :cond_27

    .line 795
    .line 796
    add-int/lit8 v8, v8, 0x1

    .line 797
    .line 798
    const/4 v5, 0x1

    .line 799
    const/4 v7, 0x0

    .line 800
    goto/16 :goto_c

    .line 801
    .line 802
    :cond_26
    const/4 v9, 0x0

    .line 803
    :cond_27
    sget-object v0, Lkb8;->a:Ljb8;

    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    sget-object v0, Ljb8;->j:Llb8;

    .line 809
    .line 810
    iget-object v2, v0, Llb8;->c:Lic3;

    .line 811
    .line 812
    invoke-static {v1, v2}, Lmb8;->a(Lk23;Lic3;)Z

    .line 813
    .line 814
    .line 815
    move-result v2

    .line 816
    if-eqz v2, :cond_28

    .line 817
    .line 818
    :goto_13
    const/4 v0, 0x1

    .line 819
    const/4 v9, 0x1

    .line 820
    goto :goto_14

    .line 821
    :cond_28
    iget-object v0, v0, Llb8;->d:Lic3;

    .line 822
    .line 823
    invoke-static {v1, v0}, Lmb8;->a(Lk23;Lic3;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-eqz v0, :cond_29

    .line 828
    .line 829
    goto :goto_13

    .line 830
    :cond_29
    const/4 v0, 0x0

    .line 831
    :goto_14
    if-eqz v0, :cond_2a

    .line 832
    .line 833
    goto :goto_12

    .line 834
    :cond_2a
    sget-object v0, Lmb8;->b:[Lic3;

    .line 835
    .line 836
    array-length v2, v0

    .line 837
    const/4 v7, 0x0

    .line 838
    :goto_15
    if-ge v7, v2, :cond_22

    .line 839
    .line 840
    aget-object v3, v0, v7

    .line 841
    .line 842
    invoke-static {v1, v3}, Lmb8;->a(Lk23;Lic3;)Z

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    if-eqz v3, :cond_2b

    .line 847
    .line 848
    const/4 v5, 0x1

    .line 849
    goto :goto_16

    .line 850
    :cond_2b
    add-int/lit8 v7, v7, 0x1

    .line 851
    .line 852
    goto :goto_15

    .line 853
    :goto_16
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    return-object v0

    .line 858
    :pswitch_16
    check-cast v1, Lqb;

    .line 859
    .line 860
    check-cast v0, Lvy3;

    .line 861
    .line 862
    invoke-interface {v1}, Lqb;->m()I

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    const v3, 0x7fffffff

    .line 867
    .line 868
    .line 869
    if-ne v2, v3, :cond_2c

    .line 870
    .line 871
    goto/16 :goto_1a

    .line 872
    .line 873
    :cond_2c
    invoke-interface {v1}, Lqb;->a()Lvy3;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    iget-boolean v2, v2, Lvy3;->b:Z

    .line 878
    .line 879
    if-eqz v2, :cond_2d

    .line 880
    .line 881
    invoke-interface {v1}, Lqb;->J()V

    .line 882
    .line 883
    .line 884
    :cond_2d
    invoke-interface {v1}, Lqb;->a()Lvy3;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    iget-object v2, v2, Lvy3;->i:Ljava/util/HashMap;

    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    if-eqz v3, :cond_2e

    .line 903
    .line 904
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    check-cast v3, Ljava/util/Map$Entry;

    .line 909
    .line 910
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    check-cast v4, Lkb;

    .line 915
    .line 916
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    check-cast v3, Ljava/lang/Number;

    .line 921
    .line 922
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    invoke-interface {v1}, Lqb;->f()Lhc3;

    .line 927
    .line 928
    .line 929
    move-result-object v5

    .line 930
    invoke-static {v0, v4, v3, v5}, Lvy3;->a(Lvy3;Lkb;ILxz4;)V

    .line 931
    .line 932
    .line 933
    goto :goto_17

    .line 934
    :cond_2e
    invoke-interface {v1}, Lqb;->f()Lhc3;

    .line 935
    .line 936
    .line 937
    move-result-object v1

    .line 938
    iget-object v1, v1, Lxz4;->Q:Lxz4;

    .line 939
    .line 940
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    :goto_18
    iget-object v2, v0, Lvy3;->a:Lqb;

    .line 944
    .line 945
    invoke-interface {v2}, Lqb;->f()Lhc3;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-nez v2, :cond_30

    .line 954
    .line 955
    invoke-virtual {v0, v1}, Lvy3;->b(Lxz4;)Ljava/util/Map;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    check-cast v2, Ljava/lang/Iterable;

    .line 964
    .line 965
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 970
    .line 971
    .line 972
    move-result v3

    .line 973
    if-eqz v3, :cond_2f

    .line 974
    .line 975
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    check-cast v3, Lkb;

    .line 980
    .line 981
    invoke-virtual {v0, v1, v3}, Lvy3;->c(Lxz4;Lkb;)I

    .line 982
    .line 983
    .line 984
    move-result v4

    .line 985
    invoke-static {v0, v3, v4, v1}, Lvy3;->a(Lvy3;Lkb;ILxz4;)V

    .line 986
    .line 987
    .line 988
    goto :goto_19

    .line 989
    :cond_2f
    iget-object v1, v1, Lxz4;->Q:Lxz4;

    .line 990
    .line 991
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    goto :goto_18

    .line 995
    :cond_30
    :goto_1a
    return-object v8

    .line 996
    nop

    .line 997
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
