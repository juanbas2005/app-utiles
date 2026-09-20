.class public final Ljh0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lag7;


# direct methods
.method public constructor <init>(Lag7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljh0;->a:Lag7;

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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Ljh0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    iget-object p0, p0, Ljh0;->a:Lag7;

    .line 12
    .line 13
    iget-object v0, p0, Lag7;->a:Lvl;

    .line 14
    .line 15
    check-cast p1, Ljh0;

    .line 16
    .line 17
    iget-object p1, p1, Ljh0;->a:Lag7;

    .line 18
    .line 19
    iget-object v1, p1, Lag7;->a:Lvl;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    iget-object v0, p0, Lag7;->b:Ltg7;

    .line 29
    .line 30
    iget-object v1, p1, Lag7;->b:Ltg7;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ltg7;->c(Ltg7;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    iget-object v0, p0, Lag7;->c:Ljava/util/List;

    .line 40
    .line 41
    iget-object v1, p1, Lag7;->c:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iget v0, p0, Lag7;->d:I

    .line 51
    .line 52
    iget v1, p1, Lag7;->d:I

    .line 53
    .line 54
    if-eq v0, v1, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget-boolean v0, p0, Lag7;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, Lag7;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    iget v0, p0, Lag7;->f:I

    .line 65
    .line 66
    iget v1, p1, Lag7;->f:I

    .line 67
    .line 68
    if-ne v0, v1, :cond_b

    .line 69
    .line 70
    iget-object v0, p0, Lag7;->g:Ltp1;

    .line 71
    .line 72
    iget-object v1, p1, Lag7;->g:Ltp1;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_7
    iget-object v0, p0, Lag7;->h:Ley3;

    .line 82
    .line 83
    iget-object v1, p1, Lag7;->h:Ley3;

    .line 84
    .line 85
    if-eq v0, v1, :cond_8

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_8
    iget-object v0, p0, Lag7;->i:Ldl2;

    .line 89
    .line 90
    iget-object v1, p1, Lag7;->i:Ldl2;

    .line 91
    .line 92
    if-eq v0, v1, :cond_9

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_9
    iget-wide v0, p0, Lag7;->j:J

    .line 96
    .line 97
    iget-wide p0, p1, Lag7;->j:J

    .line 98
    .line 99
    invoke-static {v0, v1, p0, p1}, Lk31;->b(JJ)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_a

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_a
    :goto_0
    const/4 p0, 0x1

    .line 107
    return p0

    .line 108
    :cond_b
    :goto_1
    const/4 p0, 0x0

    .line 109
    return p0
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

.method public final hashCode()I
    .locals 9

    .line 1
    iget-object p0, p0, Ljh0;->a:Lag7;

    .line 2
    .line 3
    iget-object v0, p0, Lag7;->a:Lvl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lvl;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lag7;->b:Ltg7;

    .line 13
    .line 14
    iget-object v3, v2, Ltg7;->a:Lyy6;

    .line 15
    .line 16
    iget-wide v4, v3, Lyy6;->b:J

    .line 17
    .line 18
    sget-object v6, Lwg7;->b:[Lxg7;

    .line 19
    .line 20
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    mul-int/2addr v4, v1

    .line 25
    iget-object v5, v3, Lyy6;->c:Lam2;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    iget v5, v5, Lam2;->w:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v5, v6

    .line 34
    :goto_0
    add-int/2addr v4, v5

    .line 35
    mul-int/2addr v4, v1

    .line 36
    iget-object v5, v3, Lyy6;->d:Lyl2;

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    iget v5, v5, Lyl2;->a:I

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->hashCode(I)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v5, v6

    .line 48
    :goto_1
    add-int/2addr v4, v5

    .line 49
    mul-int/2addr v4, v1

    .line 50
    iget-object v5, v3, Lyy6;->e:Lzl2;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    iget v5, v5, Lzl2;->a:I

    .line 55
    .line 56
    invoke-static {v5}, Ljava/lang/Integer;->hashCode(I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v5, v6

    .line 62
    :goto_2
    add-int/2addr v4, v5

    .line 63
    mul-int/2addr v4, v1

    .line 64
    iget-object v5, v3, Lyy6;->f:Lea7;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v5, v6

    .line 74
    :goto_3
    add-int/2addr v4, v5

    .line 75
    mul-int/2addr v4, v1

    .line 76
    iget-object v5, v3, Lyy6;->g:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    goto :goto_4

    .line 85
    :cond_4
    move v5, v6

    .line 86
    :goto_4
    add-int/2addr v4, v5

    .line 87
    mul-int/2addr v4, v1

    .line 88
    iget-wide v7, v3, Lyy6;->h:J

    .line 89
    .line 90
    invoke-static {v4, v1, v7, v8}, Lpb4;->b(IIJ)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    iget-object v5, v3, Lyy6;->i:Lh60;

    .line 95
    .line 96
    if-eqz v5, :cond_5

    .line 97
    .line 98
    iget v5, v5, Lh60;->a:F

    .line 99
    .line 100
    invoke-static {v5}, Ljava/lang/Float;->hashCode(F)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    move v5, v6

    .line 106
    :goto_5
    add-int/2addr v4, v5

    .line 107
    mul-int/2addr v4, v1

    .line 108
    iget-object v5, v3, Lyy6;->j:Llf7;

    .line 109
    .line 110
    if-eqz v5, :cond_6

    .line 111
    .line 112
    invoke-virtual {v5}, Llf7;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    goto :goto_6

    .line 117
    :cond_6
    move v5, v6

    .line 118
    :goto_6
    add-int/2addr v4, v5

    .line 119
    mul-int/2addr v4, v1

    .line 120
    iget-object v5, v3, Lyy6;->k:Lya4;

    .line 121
    .line 122
    if-eqz v5, :cond_7

    .line 123
    .line 124
    iget-object v5, v5, Lya4;->w:Ljava/util/List;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    goto :goto_7

    .line 131
    :cond_7
    move v5, v6

    .line 132
    :goto_7
    add-int/2addr v4, v5

    .line 133
    mul-int/2addr v4, v1

    .line 134
    iget-wide v7, v3, Lyy6;->l:J

    .line 135
    .line 136
    sget v5, Ljt0;->h:I

    .line 137
    .line 138
    invoke-static {v4, v1, v7, v8}, Lpb4;->b(IIJ)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object v3, v3, Lyy6;->o:Lyj5;

    .line 143
    .line 144
    if-eqz v3, :cond_8

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    goto :goto_8

    .line 151
    :cond_8
    move v3, v6

    .line 152
    :goto_8
    add-int/2addr v4, v3

    .line 153
    mul-int/2addr v4, v1

    .line 154
    iget-object v3, v2, Ltg7;->b:Lnc5;

    .line 155
    .line 156
    invoke-virtual {v3}, Lnc5;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    add-int/2addr v3, v4

    .line 161
    mul-int/2addr v3, v1

    .line 162
    iget-object v2, v2, Ltg7;->c:Ldk5;

    .line 163
    .line 164
    if-eqz v2, :cond_9

    .line 165
    .line 166
    invoke-virtual {v2}, Ldk5;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    :cond_9
    add-int/2addr v3, v6

    .line 171
    add-int/2addr v3, v0

    .line 172
    mul-int/2addr v3, v1

    .line 173
    iget-object v0, p0, Lag7;->c:Ljava/util/List;

    .line 174
    .line 175
    invoke-static {v0, v3, v1}, Lhl6;->j(Ljava/util/List;II)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    iget v2, p0, Lag7;->d:I

    .line 180
    .line 181
    add-int/2addr v0, v2

    .line 182
    mul-int/2addr v0, v1

    .line 183
    iget-boolean v2, p0, Lag7;->e:Z

    .line 184
    .line 185
    invoke-static {v0, v1, v2}, Lhl6;->i(IIZ)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget v2, p0, Lag7;->f:I

    .line 190
    .line 191
    invoke-static {v2, v0, v1}, Lf21;->e(III)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    iget-object v2, p0, Lag7;->g:Ltp1;

    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    add-int/2addr v2, v0

    .line 202
    mul-int/2addr v2, v1

    .line 203
    iget-object v0, p0, Lag7;->h:Ley3;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    add-int/2addr v0, v2

    .line 210
    mul-int/2addr v0, v1

    .line 211
    iget-object v2, p0, Lag7;->i:Ldl2;

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    add-int/2addr v2, v0

    .line 218
    mul-int/2addr v2, v1

    .line 219
    iget-wide v0, p0, Lag7;->j:J

    .line 220
    .line 221
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    add-int/2addr p0, v2

    .line 226
    return p0
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
