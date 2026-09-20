.class public final Lat5;
.super Lvu2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:Ljava/util/List;

.field public B:Z

.field public C:I

.field public D:Lbt5;

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:Lbt5;

.field public K:I

.field public L:Lbt5;

.field public M:I

.field public N:I

.field public O:Ljava/util/List;

.field public z:I


# direct methods
.method public static h()Lat5;
    .locals 3

    .line 1
    new-instance v0, Lat5;

    .line 2
    .line 3
    invoke-direct {v0}, Lvu2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Lat5;->A:Ljava/util/List;

    .line 9
    .line 10
    sget-object v2, Lbt5;->Q:Lbt5;

    .line 11
    .line 12
    iput-object v2, v0, Lat5;->D:Lbt5;

    .line 13
    .line 14
    iput-object v2, v0, Lat5;->J:Lbt5;

    .line 15
    .line 16
    iput-object v2, v0, Lat5;->L:Lbt5;

    .line 17
    .line 18
    iput-object v1, v0, Lat5;->O:Ljava/util/List;

    .line 19
    .line 20
    return-object v0
    .line 21
.end method


# virtual methods
.method public final c()Lk2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lat5;->g()Lbt5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lbt5;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lat5;->h()Lat5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lat5;->g()Lbt5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lat5;->i(Lbt5;)Lat5;

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public final d(Lts0;Ly92;)Lru2;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lbt5;->R:Lfp3;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Lbt5;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2}, Lbt5;-><init>(Lts0;Ly92;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lat5;->i(Lbt5;)Lat5;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 20
    .line 21
    check-cast p2, Lbt5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lat5;->i(Lbt5;)Lat5;

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
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

.method public final bridge synthetic e(Lzu2;)Lru2;
    .locals 0

    .line 1
    check-cast p1, Lbt5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lat5;->i(Lbt5;)Lat5;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final g()Lbt5;
    .locals 5

    .line 1
    new-instance v0, Lbt5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbt5;-><init>(Lat5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lat5;->z:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lat5;->A:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, p0, Lat5;->A:Ljava/util/List;

    .line 20
    .line 21
    iget v2, p0, Lat5;->z:I

    .line 22
    .line 23
    and-int/lit8 v2, v2, -0x2

    .line 24
    .line 25
    iput v2, p0, Lat5;->z:I

    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lat5;->A:Ljava/util/List;

    .line 28
    .line 29
    iput-object v2, v0, Lbt5;->z:Ljava/util/List;

    .line 30
    .line 31
    and-int/lit8 v2, v1, 0x2

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    if-ne v2, v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    :goto_0
    iget-boolean v2, p0, Lat5;->B:Z

    .line 39
    .line 40
    iput-boolean v2, v0, Lbt5;->A:Z

    .line 41
    .line 42
    and-int/lit8 v2, v1, 0x4

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    if-ne v2, v4, :cond_2

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x2

    .line 48
    .line 49
    :cond_2
    iget v2, p0, Lat5;->C:I

    .line 50
    .line 51
    iput v2, v0, Lbt5;->B:I

    .line 52
    .line 53
    and-int/lit8 v2, v1, 0x8

    .line 54
    .line 55
    const/16 v4, 0x8

    .line 56
    .line 57
    if-ne v2, v4, :cond_3

    .line 58
    .line 59
    or-int/lit8 v3, v3, 0x4

    .line 60
    .line 61
    :cond_3
    iget-object v2, p0, Lat5;->D:Lbt5;

    .line 62
    .line 63
    iput-object v2, v0, Lbt5;->C:Lbt5;

    .line 64
    .line 65
    and-int/lit8 v2, v1, 0x10

    .line 66
    .line 67
    const/16 v4, 0x10

    .line 68
    .line 69
    if-ne v2, v4, :cond_4

    .line 70
    .line 71
    or-int/lit8 v3, v3, 0x8

    .line 72
    .line 73
    :cond_4
    iget v2, p0, Lat5;->E:I

    .line 74
    .line 75
    iput v2, v0, Lbt5;->D:I

    .line 76
    .line 77
    and-int/lit8 v2, v1, 0x20

    .line 78
    .line 79
    const/16 v4, 0x20

    .line 80
    .line 81
    if-ne v2, v4, :cond_5

    .line 82
    .line 83
    or-int/lit8 v3, v3, 0x10

    .line 84
    .line 85
    :cond_5
    iget v2, p0, Lat5;->F:I

    .line 86
    .line 87
    iput v2, v0, Lbt5;->E:I

    .line 88
    .line 89
    and-int/lit8 v2, v1, 0x40

    .line 90
    .line 91
    const/16 v4, 0x40

    .line 92
    .line 93
    if-ne v2, v4, :cond_6

    .line 94
    .line 95
    or-int/lit8 v3, v3, 0x20

    .line 96
    .line 97
    :cond_6
    iget v2, p0, Lat5;->G:I

    .line 98
    .line 99
    iput v2, v0, Lbt5;->F:I

    .line 100
    .line 101
    and-int/lit16 v2, v1, 0x80

    .line 102
    .line 103
    const/16 v4, 0x80

    .line 104
    .line 105
    if-ne v2, v4, :cond_7

    .line 106
    .line 107
    or-int/lit8 v3, v3, 0x40

    .line 108
    .line 109
    :cond_7
    iget v2, p0, Lat5;->H:I

    .line 110
    .line 111
    iput v2, v0, Lbt5;->G:I

    .line 112
    .line 113
    and-int/lit16 v2, v1, 0x100

    .line 114
    .line 115
    const/16 v4, 0x100

    .line 116
    .line 117
    if-ne v2, v4, :cond_8

    .line 118
    .line 119
    or-int/lit16 v3, v3, 0x80

    .line 120
    .line 121
    :cond_8
    iget v2, p0, Lat5;->I:I

    .line 122
    .line 123
    iput v2, v0, Lbt5;->H:I

    .line 124
    .line 125
    and-int/lit16 v2, v1, 0x200

    .line 126
    .line 127
    const/16 v4, 0x200

    .line 128
    .line 129
    if-ne v2, v4, :cond_9

    .line 130
    .line 131
    or-int/lit16 v3, v3, 0x100

    .line 132
    .line 133
    :cond_9
    iget-object v2, p0, Lat5;->J:Lbt5;

    .line 134
    .line 135
    iput-object v2, v0, Lbt5;->I:Lbt5;

    .line 136
    .line 137
    and-int/lit16 v2, v1, 0x400

    .line 138
    .line 139
    const/16 v4, 0x400

    .line 140
    .line 141
    if-ne v2, v4, :cond_a

    .line 142
    .line 143
    or-int/lit16 v3, v3, 0x200

    .line 144
    .line 145
    :cond_a
    iget v2, p0, Lat5;->K:I

    .line 146
    .line 147
    iput v2, v0, Lbt5;->J:I

    .line 148
    .line 149
    and-int/lit16 v2, v1, 0x800

    .line 150
    .line 151
    const/16 v4, 0x800

    .line 152
    .line 153
    if-ne v2, v4, :cond_b

    .line 154
    .line 155
    or-int/lit16 v3, v3, 0x400

    .line 156
    .line 157
    :cond_b
    iget-object v2, p0, Lat5;->L:Lbt5;

    .line 158
    .line 159
    iput-object v2, v0, Lbt5;->K:Lbt5;

    .line 160
    .line 161
    and-int/lit16 v2, v1, 0x1000

    .line 162
    .line 163
    const/16 v4, 0x1000

    .line 164
    .line 165
    if-ne v2, v4, :cond_c

    .line 166
    .line 167
    or-int/lit16 v3, v3, 0x800

    .line 168
    .line 169
    :cond_c
    iget v2, p0, Lat5;->M:I

    .line 170
    .line 171
    iput v2, v0, Lbt5;->L:I

    .line 172
    .line 173
    const/16 v2, 0x2000

    .line 174
    .line 175
    and-int/2addr v1, v2

    .line 176
    if-ne v1, v2, :cond_d

    .line 177
    .line 178
    or-int/lit16 v3, v3, 0x1000

    .line 179
    .line 180
    :cond_d
    iget v1, p0, Lat5;->N:I

    .line 181
    .line 182
    iput v1, v0, Lbt5;->M:I

    .line 183
    .line 184
    iget v1, p0, Lat5;->z:I

    .line 185
    .line 186
    const/16 v2, 0x4000

    .line 187
    .line 188
    and-int/2addr v1, v2

    .line 189
    if-ne v1, v2, :cond_e

    .line 190
    .line 191
    iget-object v1, p0, Lat5;->O:Ljava/util/List;

    .line 192
    .line 193
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, p0, Lat5;->O:Ljava/util/List;

    .line 198
    .line 199
    iget v1, p0, Lat5;->z:I

    .line 200
    .line 201
    and-int/lit16 v1, v1, -0x4001

    .line 202
    .line 203
    iput v1, p0, Lat5;->z:I

    .line 204
    .line 205
    :cond_e
    iget-object p0, p0, Lat5;->O:Ljava/util/List;

    .line 206
    .line 207
    iput-object p0, v0, Lbt5;->N:Ljava/util/List;

    .line 208
    .line 209
    iput v3, v0, Lbt5;->y:I

    .line 210
    .line 211
    return-object v0
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

.method public final i(Lbt5;)Lat5;
    .locals 5

    .line 1
    sget-object v0, Lbt5;->Q:Lbt5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v1, p1, Lbt5;->z:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    iget-object v1, p0, Lat5;->A:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p1, Lbt5;->z:Ljava/util/List;

    .line 24
    .line 25
    iput-object v1, p0, Lat5;->A:Ljava/util/List;

    .line 26
    .line 27
    iget v1, p0, Lat5;->z:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, -0x2

    .line 30
    .line 31
    iput v1, p0, Lat5;->z:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v1, p0, Lat5;->z:I

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v3, p0, Lat5;->A:Ljava/util/List;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lat5;->A:Ljava/util/List;

    .line 47
    .line 48
    iget v1, p0, Lat5;->z:I

    .line 49
    .line 50
    or-int/2addr v1, v2

    .line 51
    iput v1, p0, Lat5;->z:I

    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, Lat5;->A:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lbt5;->z:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    iget v1, p1, Lbt5;->y:I

    .line 61
    .line 62
    and-int/lit8 v3, v1, 0x1

    .line 63
    .line 64
    const/4 v4, 0x2

    .line 65
    if-ne v3, v2, :cond_4

    .line 66
    .line 67
    iget-boolean v2, p1, Lbt5;->A:Z

    .line 68
    .line 69
    iget v3, p0, Lat5;->z:I

    .line 70
    .line 71
    or-int/2addr v3, v4

    .line 72
    iput v3, p0, Lat5;->z:I

    .line 73
    .line 74
    iput-boolean v2, p0, Lat5;->B:Z

    .line 75
    .line 76
    :cond_4
    and-int/lit8 v2, v1, 0x2

    .line 77
    .line 78
    const/4 v3, 0x4

    .line 79
    if-ne v2, v4, :cond_5

    .line 80
    .line 81
    iget v2, p1, Lbt5;->B:I

    .line 82
    .line 83
    iget v4, p0, Lat5;->z:I

    .line 84
    .line 85
    or-int/2addr v4, v3

    .line 86
    iput v4, p0, Lat5;->z:I

    .line 87
    .line 88
    iput v2, p0, Lat5;->C:I

    .line 89
    .line 90
    :cond_5
    and-int/2addr v1, v3

    .line 91
    const/16 v2, 0x8

    .line 92
    .line 93
    if-ne v1, v3, :cond_7

    .line 94
    .line 95
    iget-object v1, p1, Lbt5;->C:Lbt5;

    .line 96
    .line 97
    iget v3, p0, Lat5;->z:I

    .line 98
    .line 99
    and-int/2addr v3, v2

    .line 100
    if-ne v3, v2, :cond_6

    .line 101
    .line 102
    iget-object v3, p0, Lat5;->D:Lbt5;

    .line 103
    .line 104
    if-eq v3, v0, :cond_6

    .line 105
    .line 106
    invoke-static {v3}, Lbt5;->r(Lbt5;)Lat5;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3, v1}, Lat5;->i(Lbt5;)Lat5;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Lat5;->g()Lbt5;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, p0, Lat5;->D:Lbt5;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    iput-object v1, p0, Lat5;->D:Lbt5;

    .line 121
    .line 122
    :goto_1
    iget v1, p0, Lat5;->z:I

    .line 123
    .line 124
    or-int/2addr v1, v2

    .line 125
    iput v1, p0, Lat5;->z:I

    .line 126
    .line 127
    :cond_7
    iget v1, p1, Lbt5;->y:I

    .line 128
    .line 129
    and-int/2addr v1, v2

    .line 130
    if-ne v1, v2, :cond_8

    .line 131
    .line 132
    iget v1, p1, Lbt5;->D:I

    .line 133
    .line 134
    iget v2, p0, Lat5;->z:I

    .line 135
    .line 136
    or-int/lit8 v2, v2, 0x10

    .line 137
    .line 138
    iput v2, p0, Lat5;->z:I

    .line 139
    .line 140
    iput v1, p0, Lat5;->E:I

    .line 141
    .line 142
    :cond_8
    invoke-virtual {p1}, Lbt5;->p()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const/16 v2, 0x20

    .line 147
    .line 148
    if-eqz v1, :cond_9

    .line 149
    .line 150
    iget v1, p1, Lbt5;->E:I

    .line 151
    .line 152
    iget v3, p0, Lat5;->z:I

    .line 153
    .line 154
    or-int/2addr v3, v2

    .line 155
    iput v3, p0, Lat5;->z:I

    .line 156
    .line 157
    iput v1, p0, Lat5;->F:I

    .line 158
    .line 159
    :cond_9
    iget v1, p1, Lbt5;->y:I

    .line 160
    .line 161
    and-int/lit8 v3, v1, 0x20

    .line 162
    .line 163
    const/16 v4, 0x40

    .line 164
    .line 165
    if-ne v3, v2, :cond_a

    .line 166
    .line 167
    iget v2, p1, Lbt5;->F:I

    .line 168
    .line 169
    iget v3, p0, Lat5;->z:I

    .line 170
    .line 171
    or-int/2addr v3, v4

    .line 172
    iput v3, p0, Lat5;->z:I

    .line 173
    .line 174
    iput v2, p0, Lat5;->G:I

    .line 175
    .line 176
    :cond_a
    and-int/lit8 v2, v1, 0x40

    .line 177
    .line 178
    const/16 v3, 0x80

    .line 179
    .line 180
    if-ne v2, v4, :cond_b

    .line 181
    .line 182
    iget v2, p1, Lbt5;->G:I

    .line 183
    .line 184
    iget v4, p0, Lat5;->z:I

    .line 185
    .line 186
    or-int/2addr v4, v3

    .line 187
    iput v4, p0, Lat5;->z:I

    .line 188
    .line 189
    iput v2, p0, Lat5;->H:I

    .line 190
    .line 191
    :cond_b
    and-int/lit16 v2, v1, 0x80

    .line 192
    .line 193
    const/16 v4, 0x100

    .line 194
    .line 195
    if-ne v2, v3, :cond_c

    .line 196
    .line 197
    iget v2, p1, Lbt5;->H:I

    .line 198
    .line 199
    iget v3, p0, Lat5;->z:I

    .line 200
    .line 201
    or-int/2addr v3, v4

    .line 202
    iput v3, p0, Lat5;->z:I

    .line 203
    .line 204
    iput v2, p0, Lat5;->I:I

    .line 205
    .line 206
    :cond_c
    and-int/2addr v1, v4

    .line 207
    const/16 v2, 0x200

    .line 208
    .line 209
    if-ne v1, v4, :cond_e

    .line 210
    .line 211
    iget-object v1, p1, Lbt5;->I:Lbt5;

    .line 212
    .line 213
    iget v3, p0, Lat5;->z:I

    .line 214
    .line 215
    and-int/2addr v3, v2

    .line 216
    if-ne v3, v2, :cond_d

    .line 217
    .line 218
    iget-object v3, p0, Lat5;->J:Lbt5;

    .line 219
    .line 220
    if-eq v3, v0, :cond_d

    .line 221
    .line 222
    invoke-static {v3}, Lbt5;->r(Lbt5;)Lat5;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v3, v1}, Lat5;->i(Lbt5;)Lat5;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, Lat5;->g()Lbt5;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iput-object v1, p0, Lat5;->J:Lbt5;

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_d
    iput-object v1, p0, Lat5;->J:Lbt5;

    .line 237
    .line 238
    :goto_2
    iget v1, p0, Lat5;->z:I

    .line 239
    .line 240
    or-int/2addr v1, v2

    .line 241
    iput v1, p0, Lat5;->z:I

    .line 242
    .line 243
    :cond_e
    iget v1, p1, Lbt5;->y:I

    .line 244
    .line 245
    and-int/lit16 v3, v1, 0x200

    .line 246
    .line 247
    const/16 v4, 0x400

    .line 248
    .line 249
    if-ne v3, v2, :cond_f

    .line 250
    .line 251
    iget v2, p1, Lbt5;->J:I

    .line 252
    .line 253
    iget v3, p0, Lat5;->z:I

    .line 254
    .line 255
    or-int/2addr v3, v4

    .line 256
    iput v3, p0, Lat5;->z:I

    .line 257
    .line 258
    iput v2, p0, Lat5;->K:I

    .line 259
    .line 260
    :cond_f
    and-int/2addr v1, v4

    .line 261
    const/16 v2, 0x800

    .line 262
    .line 263
    if-ne v1, v4, :cond_11

    .line 264
    .line 265
    iget-object v1, p1, Lbt5;->K:Lbt5;

    .line 266
    .line 267
    iget v3, p0, Lat5;->z:I

    .line 268
    .line 269
    and-int/2addr v3, v2

    .line 270
    if-ne v3, v2, :cond_10

    .line 271
    .line 272
    iget-object v3, p0, Lat5;->L:Lbt5;

    .line 273
    .line 274
    if-eq v3, v0, :cond_10

    .line 275
    .line 276
    invoke-static {v3}, Lbt5;->r(Lbt5;)Lat5;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0, v1}, Lat5;->i(Lbt5;)Lat5;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lat5;->g()Lbt5;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iput-object v0, p0, Lat5;->L:Lbt5;

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_10
    iput-object v1, p0, Lat5;->L:Lbt5;

    .line 291
    .line 292
    :goto_3
    iget v0, p0, Lat5;->z:I

    .line 293
    .line 294
    or-int/2addr v0, v2

    .line 295
    iput v0, p0, Lat5;->z:I

    .line 296
    .line 297
    :cond_11
    iget v0, p1, Lbt5;->y:I

    .line 298
    .line 299
    and-int/lit16 v1, v0, 0x800

    .line 300
    .line 301
    const/16 v3, 0x1000

    .line 302
    .line 303
    if-ne v1, v2, :cond_12

    .line 304
    .line 305
    iget v1, p1, Lbt5;->L:I

    .line 306
    .line 307
    iget v2, p0, Lat5;->z:I

    .line 308
    .line 309
    or-int/2addr v2, v3

    .line 310
    iput v2, p0, Lat5;->z:I

    .line 311
    .line 312
    iput v1, p0, Lat5;->M:I

    .line 313
    .line 314
    :cond_12
    and-int/2addr v0, v3

    .line 315
    if-ne v0, v3, :cond_13

    .line 316
    .line 317
    iget v0, p1, Lbt5;->M:I

    .line 318
    .line 319
    iget v1, p0, Lat5;->z:I

    .line 320
    .line 321
    or-int/lit16 v1, v1, 0x2000

    .line 322
    .line 323
    iput v1, p0, Lat5;->z:I

    .line 324
    .line 325
    iput v0, p0, Lat5;->N:I

    .line 326
    .line 327
    :cond_13
    iget-object v0, p1, Lbt5;->N:Ljava/util/List;

    .line 328
    .line 329
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_16

    .line 334
    .line 335
    iget-object v0, p0, Lat5;->O:Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_14

    .line 342
    .line 343
    iget-object v0, p1, Lbt5;->N:Ljava/util/List;

    .line 344
    .line 345
    iput-object v0, p0, Lat5;->O:Ljava/util/List;

    .line 346
    .line 347
    iget v0, p0, Lat5;->z:I

    .line 348
    .line 349
    and-int/lit16 v0, v0, -0x4001

    .line 350
    .line 351
    iput v0, p0, Lat5;->z:I

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_14
    iget v0, p0, Lat5;->z:I

    .line 355
    .line 356
    const/16 v1, 0x4000

    .line 357
    .line 358
    and-int/2addr v0, v1

    .line 359
    if-eq v0, v1, :cond_15

    .line 360
    .line 361
    new-instance v0, Ljava/util/ArrayList;

    .line 362
    .line 363
    iget-object v2, p0, Lat5;->O:Ljava/util/List;

    .line 364
    .line 365
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 366
    .line 367
    .line 368
    iput-object v0, p0, Lat5;->O:Ljava/util/List;

    .line 369
    .line 370
    iget v0, p0, Lat5;->z:I

    .line 371
    .line 372
    or-int/2addr v0, v1

    .line 373
    iput v0, p0, Lat5;->z:I

    .line 374
    .line 375
    :cond_15
    iget-object v0, p0, Lat5;->O:Ljava/util/List;

    .line 376
    .line 377
    iget-object v1, p1, Lbt5;->N:Ljava/util/List;

    .line 378
    .line 379
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 380
    .line 381
    .line 382
    :cond_16
    :goto_4
    invoke-virtual {p0, p1}, Lvu2;->f(Lwu2;)V

    .line 383
    .line 384
    .line 385
    iget-object v0, p0, Lru2;->w:Lbg0;

    .line 386
    .line 387
    iget-object p1, p1, Lbt5;->x:Lbg0;

    .line 388
    .line 389
    invoke-virtual {v0, p1}, Lbg0;->f(Lbg0;)Lbg0;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    iput-object p1, p0, Lru2;->w:Lbg0;

    .line 394
    .line 395
    return-object p0
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
.end method
