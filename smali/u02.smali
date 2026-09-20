.class public final Lu02;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final A:J

.field public static final x:Lxb4;

.field public static final y:J

.field public static final z:J


# instance fields
.field public final w:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxb4;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxb4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu02;->x:Lxb4;

    .line 9
    .line 10
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lgl0;->M(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sput-wide v0, Lu02;->y:J

    .line 20
    .line 21
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lgl0;->M(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    sput-wide v0, Lu02;->z:J

    .line 31
    .line 32
    const-wide v0, 0x7fffffffffffc0deL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    sput-wide v0, Lu02;->A:J

    .line 38
    .line 39
    return-void
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

.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lu02;->w:J

    .line 5
    .line 6
    return-void
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

.method public static final a(JJ)J
    .locals 6

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long v2, p2, v0

    .line 5
    .line 6
    invoke-static {p0, p1, v2, v3}, Lgl0;->H(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    const-wide v4, -0x431bde82d7aL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v4, v4, p0

    .line 16
    .line 17
    if-gtz v4, :cond_0

    .line 18
    .line 19
    const-wide v4, 0x431bde82d7bL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v4, p0, v4

    .line 25
    .line 26
    if-gez v4, :cond_0

    .line 27
    .line 28
    mul-long/2addr v2, v0

    .line 29
    sub-long/2addr p2, v2

    .line 30
    mul-long/2addr p0, v0

    .line 31
    add-long/2addr p0, p2

    .line 32
    invoke-static {p0, p1}, Lgl0;->O(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0

    .line 37
    :cond_0
    invoke-static {p0, p1}, Lgl0;->M(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    const/16 p1, 0x2e

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p3, p1}, Ld57;->O0(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/4 p3, -0x1

    .line 24
    add-int/2addr p2, p3

    .line 25
    if-ltz p2, :cond_2

    .line 26
    .line 27
    :goto_0
    add-int/lit8 v0, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x30

    .line 34
    .line 35
    if-eq v1, v2, :cond_0

    .line 36
    .line 37
    move p3, p2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    if-gez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p2, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    add-int/lit8 p2, p3, 0x1

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x3

    .line 48
    if-nez p5, :cond_3

    .line 49
    .line 50
    if-ge p2, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/2addr p3, v1

    .line 57
    div-int/2addr p3, v1

    .line 58
    mul-int/2addr p3, v1

    .line 59
    invoke-virtual {p0, p1, v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_2
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
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

.method public static c(JJ)I
    .locals 5

    .line 1
    xor-long v0, p0, p2

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-ltz v4, :cond_2

    .line 8
    .line 9
    long-to-int v0, v0

    .line 10
    and-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    long-to-int v0, p0

    .line 16
    and-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    long-to-int p2, p2

    .line 19
    and-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    sub-int/2addr v0, p2

    .line 22
    cmp-long p0, p0, v2

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    neg-int p0, v0

    .line 27
    return p0

    .line 28
    :cond_1
    return v0

    .line 29
    :cond_2
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lsg3;->l(JJ)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
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

.method public static final d(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public static final e(J)J
    .locals 2

    .line 1
    long-to-int v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    and-int/2addr v0, v1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0, p1}, Lu02;->g(J)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    shr-long/2addr p0, v1

    .line 13
    return-wide p0

    .line 14
    :cond_0
    sget-object v0, Ly02;->y:Ly02;

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lu02;->j(JLy02;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0
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

.method public static final f(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lu02;->g(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    long-to-int v0, p0

    .line 10
    const/4 v1, 0x1

    .line 11
    and-int/2addr v0, v1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    shr-long/2addr p0, v1

    .line 15
    const-wide/16 v0, 0x3e8

    .line 16
    .line 17
    rem-long/2addr p0, v0

    .line 18
    const-wide/32 v0, 0xf4240

    .line 19
    .line 20
    .line 21
    mul-long/2addr p0, v0

    .line 22
    :goto_0
    long-to-int p0, p0

    .line 23
    return p0

    .line 24
    :cond_1
    shr-long/2addr p0, v1

    .line 25
    const-wide/32 v0, 0x3b9aca00

    .line 26
    .line 27
    .line 28
    rem-long/2addr p0, v0

    .line 29
    goto :goto_0
.end method

.method public static final g(J)Z
    .locals 2

    .line 1
    sget-wide v0, Lu02;->y:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-wide v0, Lu02;->z:J

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
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

.method public static final h(JJ)J
    .locals 3

    .line 1
    long-to-int v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    and-int/2addr v0, v1

    .line 4
    long-to-int v2, p2

    .line 5
    and-int/2addr v2, v1

    .line 6
    if-ne v0, v2, :cond_5

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    shr-long/2addr p0, v1

    .line 11
    shr-long/2addr p2, v1

    .line 12
    add-long/2addr p0, p2

    .line 13
    const-wide p2, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long p2, p2, p0

    .line 19
    .line 20
    if-gtz p2, :cond_0

    .line 21
    .line 22
    const-wide p2, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p2, p0, p2

    .line 28
    .line 29
    if-gez p2, :cond_0

    .line 30
    .line 31
    invoke-static {p0, p1}, Lgl0;->O(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    return-wide p0

    .line 36
    :cond_0
    const-wide/32 p2, 0xf4240

    .line 37
    .line 38
    .line 39
    div-long/2addr p0, p2

    .line 40
    invoke-static {p0, p1}, Lgl0;->M(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    return-wide p0

    .line 45
    :cond_1
    shr-long/2addr p0, v1

    .line 46
    shr-long/2addr p2, v1

    .line 47
    invoke-static {p0, p1, p2, p3}, Lgl0;->H(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    const-wide p2, 0x7fffffffffffc0deL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    cmp-long p2, p0, p2

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    const-wide p2, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    cmp-long p2, p0, p2

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    const-wide p2, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    cmp-long p2, p0, p2

    .line 75
    .line 76
    if-nez p2, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-static {p0, p1}, Lgl0;->N(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide p0

    .line 83
    return-wide p0

    .line 84
    :cond_3
    :goto_0
    invoke-static {p0, p1}, Lgl0;->M(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide p0

    .line 88
    return-wide p0

    .line 89
    :cond_4
    const-string p0, "Summing infinite durations of different signs yields an undefined result."

    .line 90
    .line 91
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-wide/16 p0, 0x0

    .line 95
    .line 96
    return-wide p0

    .line 97
    :cond_5
    if-ne v0, v1, :cond_6

    .line 98
    .line 99
    shr-long/2addr p0, v1

    .line 100
    shr-long/2addr p2, v1

    .line 101
    invoke-static {p0, p1, p2, p3}, Lu02;->a(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide p0

    .line 105
    return-wide p0

    .line 106
    :cond_6
    shr-long/2addr p2, v1

    .line 107
    shr-long/2addr p0, v1

    .line 108
    invoke-static {p2, p3, p0, p1}, Lu02;->a(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide p0

    .line 112
    return-wide p0
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
.end method

.method public static final i(JD)J
    .locals 25

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p2 .. p3}, Ldh4;->B(D)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    int-to-double v3, v2

    .line 8
    cmpg-double v3, v3, p2

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v10, 0x1

    .line 13
    sget-wide v11, Lu02;->y:J

    .line 14
    .line 15
    sget-wide v13, Lu02;->z:J

    .line 16
    .line 17
    if-nez v3, :cond_b

    .line 18
    .line 19
    invoke-static {v0, v1}, Lu02;->g(J)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-lez v2, :cond_0

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_0
    invoke-static {v0, v1}, Lu02;->l(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0

    .line 35
    :cond_1
    const-string v0, "Multiplying infinite duration by zero yields an undefined result."

    .line 36
    .line 37
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-wide v4

    .line 41
    :cond_2
    if-nez v2, :cond_3

    .line 42
    .line 43
    return-wide v4

    .line 44
    :cond_3
    shr-long v15, v0, v10

    .line 45
    .line 46
    move-wide/from16 v17, v4

    .line 47
    .line 48
    int-to-long v4, v2

    .line 49
    const-wide v19, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    mul-long v6, v15, v4

    .line 55
    .line 56
    long-to-int v0, v0

    .line 57
    and-int/2addr v0, v10

    .line 58
    const-wide v21, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    const-wide v8, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    if-nez v0, :cond_8

    .line 69
    .line 70
    const-wide/32 v0, -0x7fffffff

    .line 71
    .line 72
    .line 73
    cmp-long v0, v0, v15

    .line 74
    .line 75
    if-gtz v0, :cond_4

    .line 76
    .line 77
    const-wide v0, 0x80000000L

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmp-long v0, v15, v0

    .line 83
    .line 84
    if-gez v0, :cond_4

    .line 85
    .line 86
    invoke-static {v6, v7}, Lgl0;->O(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    return-wide v0

    .line 91
    :cond_4
    div-long v0, v6, v4

    .line 92
    .line 93
    cmp-long v0, v0, v15

    .line 94
    .line 95
    const-wide/32 v23, 0xf4240

    .line 96
    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    cmp-long v0, v21, v6

    .line 101
    .line 102
    if-gtz v0, :cond_5

    .line 103
    .line 104
    cmp-long v0, v6, v19

    .line 105
    .line 106
    if-gez v0, :cond_5

    .line 107
    .line 108
    invoke-static {v6, v7}, Lgl0;->O(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    return-wide v0

    .line 113
    :cond_5
    div-long v6, v6, v23

    .line 114
    .line 115
    invoke-static {v6, v7}, Lgl0;->M(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    return-wide v0

    .line 120
    :cond_6
    div-long v0, v15, v23

    .line 121
    .line 122
    mul-long v6, v0, v23

    .line 123
    .line 124
    sub-long v6, v15, v6

    .line 125
    .line 126
    mul-long v19, v0, v4

    .line 127
    .line 128
    mul-long/2addr v6, v4

    .line 129
    div-long v6, v6, v23

    .line 130
    .line 131
    add-long v6, v6, v19

    .line 132
    .line 133
    div-long v3, v19, v4

    .line 134
    .line 135
    cmp-long v0, v3, v0

    .line 136
    .line 137
    if-nez v0, :cond_7

    .line 138
    .line 139
    xor-long v0, v6, v19

    .line 140
    .line 141
    cmp-long v0, v0, v17

    .line 142
    .line 143
    if-ltz v0, :cond_7

    .line 144
    .line 145
    new-instance v0, Lsc4;

    .line 146
    .line 147
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-direct {v0, v8, v9, v1, v2}, Lqc4;-><init>(JJ)V

    .line 153
    .line 154
    .line 155
    invoke-static {v6, v7, v0}, Lz65;->r(JLsc4;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    invoke-static {v0, v1}, Lgl0;->M(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    return-wide v0

    .line 164
    :cond_7
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->signum(J)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->signum(I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    mul-int/2addr v1, v0

    .line 173
    if-lez v1, :cond_a

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_8
    div-long v0, v6, v4

    .line 177
    .line 178
    cmp-long v0, v0, v15

    .line 179
    .line 180
    if-nez v0, :cond_9

    .line 181
    .line 182
    new-instance v0, Lsc4;

    .line 183
    .line 184
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-direct {v0, v8, v9, v1, v2}, Lqc4;-><init>(JJ)V

    .line 190
    .line 191
    .line 192
    invoke-static {v6, v7, v0}, Lz65;->r(JLsc4;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    invoke-static {v0, v1}, Lgl0;->M(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v0

    .line 200
    return-wide v0

    .line 201
    :cond_9
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->signum(J)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-static {v2}, Ljava/lang/Integer;->signum(I)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    mul-int/2addr v1, v0

    .line 210
    if-lez v1, :cond_a

    .line 211
    .line 212
    :goto_0
    return-wide v11

    .line 213
    :cond_a
    return-wide v13

    .line 214
    :cond_b
    move-wide/from16 v17, v4

    .line 215
    .line 216
    const-wide v19, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    const-wide v21, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    long-to-int v2, v0

    .line 227
    and-int/2addr v2, v10

    .line 228
    sget-object v3, Ly02;->y:Ly02;

    .line 229
    .line 230
    sget-object v4, Ly02;->x:Ly02;

    .line 231
    .line 232
    if-nez v2, :cond_c

    .line 233
    .line 234
    move-object v5, v4

    .line 235
    goto :goto_1

    .line 236
    :cond_c
    move-object v5, v3

    .line 237
    :goto_1
    cmp-long v6, v0, v11

    .line 238
    .line 239
    if-nez v6, :cond_d

    .line 240
    .line 241
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_d
    cmp-long v6, v0, v13

    .line 245
    .line 246
    if-nez v6, :cond_e

    .line 247
    .line 248
    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_e
    shr-long/2addr v0, v10

    .line 252
    long-to-double v0, v0

    .line 253
    if-nez v2, :cond_f

    .line 254
    .line 255
    move-object v2, v4

    .line 256
    goto :goto_2

    .line 257
    :cond_f
    move-object v2, v3

    .line 258
    :goto_2
    invoke-static {v0, v1, v2, v5}, Lx91;->s(DLy02;Ly02;)D

    .line 259
    .line 260
    .line 261
    move-result-wide v0

    .line 262
    :goto_3
    mul-double v0, v0, p2

    .line 263
    .line 264
    invoke-static {v0, v1, v5, v4}, Lx91;->s(DLy02;Ly02;)D

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-nez v2, :cond_11

    .line 273
    .line 274
    invoke-static {v6, v7}, Ldh4;->D(D)J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    cmp-long v2, v21, v6

    .line 279
    .line 280
    if-gtz v2, :cond_10

    .line 281
    .line 282
    cmp-long v2, v6, v19

    .line 283
    .line 284
    if-gez v2, :cond_10

    .line 285
    .line 286
    invoke-static {v6, v7}, Lgl0;->O(J)J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    return-wide v0

    .line 291
    :cond_10
    invoke-static {v0, v1, v5, v3}, Lx91;->s(DLy02;Ly02;)D

    .line 292
    .line 293
    .line 294
    move-result-wide v0

    .line 295
    invoke-static {v0, v1}, Ldh4;->D(D)J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    invoke-static {v0, v1}, Lgl0;->N(J)J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    return-wide v0

    .line 304
    :cond_11
    const-string v0, "Duration value cannot be NaN."

    .line 305
    .line 306
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-wide v17
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
.end method

.method public static final j(JLy02;)J
    .locals 3

    .line 1
    sget-wide v0, Lu02;->y:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide p0, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide p0

    .line 13
    :cond_0
    sget-wide v0, Lu02;->z:J

    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-wide/high16 p0, -0x8000000000000000L

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    shr-long v1, p0, v0

    .line 24
    .line 25
    long-to-int p0, p0

    .line 26
    and-int/2addr p0, v0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    sget-object p0, Ly02;->x:Ly02;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p0, Ly02;->y:Ly02;

    .line 33
    .line 34
    :goto_0
    iget-object p1, p2, Ly02;->w:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    iget-object p0, p0, Ly02;->w:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v2, p0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    return-wide p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static k(J)Ljava/lang/String;
    .locals 14

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const-string p0, "0s"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-wide v3, Lu02;->y:J

    .line 11
    .line 12
    cmp-long v3, p0, v3

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    const-string p0, "Infinity"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-wide v3, Lu02;->z:J

    .line 20
    .line 21
    cmp-long v3, p0, v3

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    const-string p0, "-Infinity"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    if-gez v2, :cond_3

    .line 31
    .line 32
    move v5, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move v5, v3

    .line 35
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    const/16 v7, 0x2d

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_4
    if-gez v2, :cond_5

    .line 48
    .line 49
    invoke-static {p0, p1}, Lu02;->l(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    :cond_5
    sget-object v2, Ly02;->C:Ly02;

    .line 54
    .line 55
    invoke-static {p0, p1, v2}, Lu02;->j(JLy02;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-static {p0, p1}, Lu02;->g(J)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    move v2, v3

    .line 66
    goto :goto_1

    .line 67
    :cond_6
    sget-object v2, Ly02;->B:Ly02;

    .line 68
    .line 69
    invoke-static {p0, p1, v2}, Lu02;->j(JLy02;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    const-wide/16 v11, 0x18

    .line 74
    .line 75
    rem-long/2addr v9, v11

    .line 76
    long-to-int v2, v9

    .line 77
    :goto_1
    invoke-static {p0, p1}, Lu02;->g(J)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    const-wide/16 v10, 0x3c

    .line 82
    .line 83
    if-eqz v9, :cond_7

    .line 84
    .line 85
    move v9, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    sget-object v9, Ly02;->A:Ly02;

    .line 88
    .line 89
    invoke-static {p0, p1, v9}, Lu02;->j(JLy02;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v12

    .line 93
    rem-long/2addr v12, v10

    .line 94
    long-to-int v9, v12

    .line 95
    :goto_2
    invoke-static {p0, p1}, Lu02;->g(J)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-eqz v12, :cond_8

    .line 100
    .line 101
    move v10, v3

    .line 102
    goto :goto_3

    .line 103
    :cond_8
    sget-object v12, Ly02;->z:Ly02;

    .line 104
    .line 105
    invoke-static {p0, p1, v12}, Lu02;->j(JLy02;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    rem-long/2addr v12, v10

    .line 110
    long-to-int v10, v12

    .line 111
    :goto_3
    invoke-static {p0, p1}, Lu02;->f(J)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    cmp-long p1, v7, v0

    .line 116
    .line 117
    if-eqz p1, :cond_9

    .line 118
    .line 119
    move p1, v4

    .line 120
    goto :goto_4

    .line 121
    :cond_9
    move p1, v3

    .line 122
    :goto_4
    if-eqz v2, :cond_a

    .line 123
    .line 124
    move v0, v4

    .line 125
    goto :goto_5

    .line 126
    :cond_a
    move v0, v3

    .line 127
    :goto_5
    if-eqz v9, :cond_b

    .line 128
    .line 129
    move v1, v4

    .line 130
    goto :goto_6

    .line 131
    :cond_b
    move v1, v3

    .line 132
    :goto_6
    if-nez v10, :cond_d

    .line 133
    .line 134
    if-eqz p0, :cond_c

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    move v11, v3

    .line 138
    goto :goto_8

    .line 139
    :cond_d
    :goto_7
    move v11, v4

    .line 140
    :goto_8
    if-eqz p1, :cond_e

    .line 141
    .line 142
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v3, 0x64

    .line 146
    .line 147
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    move v3, v4

    .line 151
    :cond_e
    const/16 v7, 0x20

    .line 152
    .line 153
    if-nez v0, :cond_f

    .line 154
    .line 155
    if-eqz p1, :cond_11

    .line 156
    .line 157
    if-nez v1, :cond_f

    .line 158
    .line 159
    if-eqz v11, :cond_11

    .line 160
    .line 161
    :cond_f
    add-int/lit8 v8, v3, 0x1

    .line 162
    .line 163
    if-lez v3, :cond_10

    .line 164
    .line 165
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :cond_10
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const/16 v2, 0x68

    .line 172
    .line 173
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move v3, v8

    .line 177
    :cond_11
    if-nez v1, :cond_12

    .line 178
    .line 179
    if-eqz v11, :cond_14

    .line 180
    .line 181
    if-nez v0, :cond_12

    .line 182
    .line 183
    if-eqz p1, :cond_14

    .line 184
    .line 185
    :cond_12
    add-int/lit8 v2, v3, 0x1

    .line 186
    .line 187
    if-lez v3, :cond_13

    .line 188
    .line 189
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :cond_13
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const/16 v3, 0x6d

    .line 196
    .line 197
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    move v3, v2

    .line 201
    :cond_14
    if-eqz v11, :cond_1a

    .line 202
    .line 203
    add-int/lit8 v2, v3, 0x1

    .line 204
    .line 205
    if-lez v3, :cond_15

    .line 206
    .line 207
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    :cond_15
    if-nez v10, :cond_16

    .line 211
    .line 212
    if-nez p1, :cond_16

    .line 213
    .line 214
    if-nez v0, :cond_16

    .line 215
    .line 216
    if-eqz v1, :cond_17

    .line 217
    .line 218
    :cond_16
    move v7, v10

    .line 219
    goto :goto_9

    .line 220
    :cond_17
    const p1, 0xf4240

    .line 221
    .line 222
    .line 223
    if-lt p0, p1, :cond_18

    .line 224
    .line 225
    div-int v7, p0, p1

    .line 226
    .line 227
    rem-int v8, p0, p1

    .line 228
    .line 229
    const-string v10, "ms"

    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const/4 v9, 0x6

    .line 233
    invoke-static/range {v6 .. v11}, Lu02;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_18
    const/16 p1, 0x3e8

    .line 238
    .line 239
    if-lt p0, p1, :cond_19

    .line 240
    .line 241
    div-int/lit16 v7, p0, 0x3e8

    .line 242
    .line 243
    rem-int/lit16 v8, p0, 0x3e8

    .line 244
    .line 245
    const-string v10, "us"

    .line 246
    .line 247
    const/4 v11, 0x0

    .line 248
    const/4 v9, 0x3

    .line 249
    invoke-static/range {v6 .. v11}, Lu02;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_19
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string p0, "ns"

    .line 257
    .line 258
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    goto :goto_a

    .line 262
    :goto_9
    const-string v10, "s"

    .line 263
    .line 264
    const/4 v11, 0x0

    .line 265
    const/16 v9, 0x9

    .line 266
    .line 267
    move v8, p0

    .line 268
    invoke-static/range {v6 .. v11}, Lu02;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 269
    .line 270
    .line 271
    :goto_a
    move v3, v2

    .line 272
    :cond_1a
    if-eqz v5, :cond_1b

    .line 273
    .line 274
    if-le v3, v4, :cond_1b

    .line 275
    .line 276
    const/16 p0, 0x28

    .line 277
    .line 278
    invoke-virtual {v6, v4, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    const/16 p1, 0x29

    .line 283
    .line 284
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    :cond_1b
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0
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
.end method

.method public static final l(J)J
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    shr-long v1, p0, v0

    .line 3
    .line 4
    neg-long v1, v1

    .line 5
    long-to-int p0, p0

    .line 6
    and-int/2addr p0, v0

    .line 7
    shl-long v0, v1, v0

    .line 8
    .line 9
    int-to-long p0, p0

    .line 10
    add-long/2addr v0, p0

    .line 11
    sget p0, Lw02;->a:I

    .line 12
    .line 13
    return-wide v0
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


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lu02;

    .line 2
    .line 3
    iget-wide v0, p1, Lu02;->w:J

    .line 4
    .line 5
    iget-wide p0, p0, Lu02;->w:J

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1}, Lu02;->c(JJ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lu02;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lu02;

    .line 7
    .line 8
    iget-wide v0, p1, Lu02;->w:J

    .line 9
    .line 10
    iget-wide p0, p0, Lu02;->w:J

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
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

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lu02;->w:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lu02;->w:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lu02;->k(J)Ljava/lang/String;

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
