.class public final Lge;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p1, p0, Lge;->w:I

    iput-object p2, p0, Lge;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lf09;Z)V
    .locals 0

    const/16 p2, 0x1a

    iput p2, p0, Lge;->w:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lig8;Lqa;)V
    .locals 1

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    iput v0, p0, Lge;->w:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lge;->x:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>(Lwg8;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lge;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lge;->x:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 15

    .line 1
    iget-object v0, p0, Lge;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbc7;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget v1, v0, Lbc7;->g:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    add-int/2addr v1, v2

    .line 10
    iput v1, v0, Lbc7;->g:I

    .line 11
    .line 12
    invoke-virtual {v0}, Lbc7;->b()Lvb7;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 16
    monitor-exit v0

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    const-wide/16 v4, -0x1

    .line 29
    .line 30
    :try_start_1
    iget-object v6, v1, Lvb7;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v6}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v6, p0, Lge;->x:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v6, Lbc7;

    .line 38
    .line 39
    iget-object v6, v6, Lbc7;->b:Ljava/util/logging/Logger;

    .line 40
    .line 41
    iget-object v7, v1, Lvb7;->c:Lac7;

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    const-string v11, "starting"

    .line 59
    .line 60
    invoke-static {v6, v1, v7, v11}, Lp25;->c(Ljava/util/logging/Logger;Lvb7;Lac7;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v2

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    move-wide v9, v4

    .line 67
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Lvb7;->a()J

    .line 68
    .line 69
    .line 70
    move-result-wide v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    :try_start_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v13

    .line 77
    sub-long/2addr v13, v9

    .line 78
    new-instance v8, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v9, "finished run in "

    .line 84
    .line 85
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {v13, v14}, Lp25;->l(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-static {v6, v1, v7, v8}, Lp25;->c(Ljava/util/logging/Logger;Lvb7;Lac7;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v6, p0, Lge;->x:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, Lbc7;

    .line 105
    .line 106
    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    :try_start_4
    invoke-static {v6, v1, v11, v12, v2}, Lbc7;->a(Lbc7;Lvb7;JZ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Lbc7;->b()Lvb7;

    .line 111
    .line 112
    .line 113
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 114
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 115
    if-nez v7, :cond_3

    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_3
    move-object v1, v7

    .line 122
    goto :goto_0

    .line 123
    :catchall_1
    move-exception v2

    .line 124
    :try_start_6
    monitor-exit v6

    .line 125
    throw v2

    .line 126
    :catchall_2
    move-exception v2

    .line 127
    if-eqz v8, :cond_4

    .line 128
    .line 129
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 130
    .line 131
    .line 132
    move-result-wide v11

    .line 133
    sub-long/2addr v11, v9

    .line 134
    new-instance v8, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v9, "failed a run in "

    .line 140
    .line 141
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-static {v11, v12}, Lp25;->l(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-static {v6, v1, v7, v8}, Lp25;->c(Ljava/util/logging/Logger;Lvb7;Lac7;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 159
    :goto_2
    :try_start_7
    iget-object p0, p0, Lge;->x:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, Lbc7;

    .line 162
    .line 163
    monitor-enter p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 164
    const/4 v6, 0x0

    .line 165
    :try_start_8
    invoke-static {p0, v1, v4, v5, v6}, Lbc7;->a(Lbc7;Lvb7;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 166
    .line 167
    .line 168
    :try_start_9
    monitor-exit p0

    .line 169
    instance-of p0, v2, Ljava/lang/InterruptedException;

    .line 170
    .line 171
    if-eqz p0, :cond_5

    .line 172
    .line 173
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :catchall_3
    move-exception p0

    .line 185
    goto :goto_3

    .line 186
    :cond_5
    :try_start_a
    throw v2

    .line 187
    :catchall_4
    move-exception v1

    .line 188
    monitor-exit p0

    .line 189
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 190
    :goto_3
    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p0

    .line 194
    :catchall_5
    move-exception p0

    .line 195
    monitor-exit v0

    .line 196
    throw p0
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


# virtual methods
.method public final run()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lge;->w:I

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    const/4 v9, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lf79;

    .line 18
    .line 19
    iget-object v1, v0, Lf79;->y:Lk68;

    .line 20
    .line 21
    iget-object v1, v1, Lk68;->y:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lo79;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lin8;->w:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ly19;

    .line 31
    .line 32
    iget-object v3, v2, Ly19;->B:Lpz8;

    .line 33
    .line 34
    iget-object v4, v2, Ly19;->w:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 37
    .line 38
    .line 39
    iget-object v5, v3, Lpz8;->I:Lmz8;

    .line 40
    .line 41
    const-string v10, "Application going to the background"

    .line 42
    .line 43
    invoke-virtual {v5, v10}, Lmz8;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, v2, Ly19;->A:Lq09;

    .line 47
    .line 48
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 49
    .line 50
    .line 51
    iget-object v5, v5, Lq09;->O:Lh09;

    .line 52
    .line 53
    invoke-virtual {v5, v8}, Lh09;->b(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 57
    .line 58
    .line 59
    iput-boolean v8, v1, Lo79;->z:Z

    .line 60
    .line 61
    iget-object v5, v2, Ly19;->z:Ltp8;

    .line 62
    .line 63
    invoke-virtual {v5}, Ltp8;->r1()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_0

    .line 68
    .line 69
    iget-wide v10, v0, Lf79;->x:J

    .line 70
    .line 71
    iget-object v1, v1, Lo79;->B:Lr38;

    .line 72
    .line 73
    invoke-virtual {v1, v9, v9, v10, v11}, Lr38;->e(ZZJ)Z

    .line 74
    .line 75
    .line 76
    iget-object v1, v1, Lr38;->y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lh79;

    .line 79
    .line 80
    invoke-virtual {v1}, Lxq8;->c()V

    .line 81
    .line 82
    .line 83
    :cond_0
    iget-wide v0, v0, Lf79;->w:J

    .line 84
    .line 85
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v3, Lpz8;->H:Lmz8;

    .line 89
    .line 90
    const-string v10, "Application backgrounded at: timestamp_millis"

    .line 91
    .line 92
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v9, v10, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v2, Ly19;->I:Lv49;

    .line 100
    .line 101
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 105
    .line 106
    .line 107
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Ly19;

    .line 110
    .line 111
    invoke-virtual {v0}, Lfy8;->d1()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lfy8;->d1()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lr69;->j1()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Ly19;

    .line 134
    .line 135
    iget-object v0, v0, Ly19;->E:Ld99;

    .line 136
    .line 137
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ld99;->N1()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const v9, 0x3b3a8

    .line 145
    .line 146
    .line 147
    if-lt v0, v9, :cond_2

    .line 148
    .line 149
    :goto_0
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lfy8;->d1()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v8}, Lr69;->s1(Z)Lz99;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    new-instance v8, Lv59;

    .line 164
    .line 165
    invoke-direct {v8, v0, v1, v7}, Lv59;-><init>(Lr69;Lz99;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v8}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    :cond_2
    sget-object v0, Lby8;->N0:Lay8;

    .line 172
    .line 173
    invoke-virtual {v5, v6, v0}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    iget-object v0, v2, Ly19;->E:Ld99;

    .line 180
    .line 181
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v6, v5, Ltp8;->y:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v0, v1, v6}, Ld99;->H1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_3

    .line 195
    .line 196
    const-wide/16 v0, 0x3e8

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_3
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v1, Lby8;->E:Lay8;

    .line 204
    .line 205
    invoke-virtual {v5, v0, v1}, Ltp8;->k1(Ljava/lang/String;Lay8;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    :goto_1
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 210
    .line 211
    .line 212
    iget-object v3, v3, Lpz8;->J:Lmz8;

    .line 213
    .line 214
    const-string v4, "[sgtm] Scheduling batch upload with minimum latency in millis"

    .line 215
    .line 216
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v3, v4, v5}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object v3, v2, Ly19;->Q:Lc59;

    .line 224
    .line 225
    invoke-static {v3}, Ly19;->d(Lcx8;)V

    .line 226
    .line 227
    .line 228
    iget-object v2, v2, Ly19;->Q:Lc59;

    .line 229
    .line 230
    invoke-virtual {v2, v0, v1}, Lc59;->g1(J)V

    .line 231
    .line 232
    .line 233
    :cond_4
    return-void

    .line 234
    :pswitch_0
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Lc49;

    .line 237
    .line 238
    iget-object v0, v0, Lc49;->y:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lm69;

    .line 241
    .line 242
    iget-object v0, v0, Lm69;->y:Lr69;

    .line 243
    .line 244
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Ly19;

    .line 247
    .line 248
    iget-object v1, v1, Ly19;->C:Lr19;

    .line 249
    .line 250
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Lk69;

    .line 254
    .line 255
    invoke-direct {v2, v0, v9}, Lk69;-><init>(Lr69;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v2}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :pswitch_1
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Lm69;

    .line 265
    .line 266
    iget-object v0, v0, Lm69;->y:Lr69;

    .line 267
    .line 268
    new-instance v1, Landroid/content/ComponentName;

    .line 269
    .line 270
    iget-object v2, v0, Lin8;->w:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Ly19;

    .line 273
    .line 274
    iget-object v2, v2, Ly19;->w:Landroid/content/Context;

    .line 275
    .line 276
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 277
    .line 278
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Lr69;->n1(Landroid/content/ComponentName;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :pswitch_2
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Lf09;

    .line 288
    .line 289
    iget-object v0, v0, Lf09;->a:Lv89;

    .line 290
    .line 291
    invoke-virtual {v0}, Lv89;->K()V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_3
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, La09;

    .line 298
    .line 299
    iget-object v1, v0, La09;->y:Ljava/lang/Object;

    .line 300
    .line 301
    monitor-enter v1

    .line 302
    :try_start_0
    iget-object v0, v0, La09;->z:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lx45;

    .line 305
    .line 306
    if-eqz v0, :cond_5

    .line 307
    .line 308
    invoke-interface {v0}, Lx45;->f()V

    .line 309
    .line 310
    .line 311
    goto :goto_2

    .line 312
    :catchall_0
    move-exception v0

    .line 313
    goto :goto_3

    .line 314
    :cond_5
    :goto_2
    monitor-exit v1

    .line 315
    return-void

    .line 316
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    throw v0

    .line 318
    :pswitch_4
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    .line 321
    .line 322
    iget-object v1, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 323
    .line 324
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iget v2, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->b0:I

    .line 329
    .line 330
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    iget-object v2, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 335
    .line 336
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineTop(I)I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    iget-object v0, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 345
    .line 346
    invoke-virtual {v0, v9, v1}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_5
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 351
    .line 352
    move-object v1, v0

    .line 353
    check-cast v1, Luq8;

    .line 354
    .line 355
    :try_start_1
    invoke-virtual {v1}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    new-instance v2, Landroid/content/ContentValues;

    .line 360
    .line 361
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 362
    .line 363
    .line 364
    const-string v3, "elapsed_time"

    .line 365
    .line 366
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 371
    .line 372
    .line 373
    const-string v3, "raw_events"

    .line 374
    .line 375
    invoke-virtual {v0, v3, v2, v6, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :catch_0
    move-exception v0

    .line 380
    iget-object v1, v1, Lin8;->w:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, Ly19;

    .line 383
    .line 384
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 385
    .line 386
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v1, Lpz8;->B:Lmz8;

    .line 390
    .line 391
    const-string v2, "Failed to remove elapsed times from raw events table"

    .line 392
    .line 393
    invoke-virtual {v1, v2, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    :goto_4
    return-void

    .line 397
    :pswitch_6
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Li88;

    .line 400
    .line 401
    iget-object v1, v0, Li88;->a:Ljava/lang/Object;

    .line 402
    .line 403
    monitor-enter v1

    .line 404
    :try_start_2
    invoke-virtual {v0}, Li88;->b()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-nez v2, :cond_6

    .line 409
    .line 410
    monitor-exit v1

    .line 411
    goto :goto_5

    .line 412
    :catchall_1
    move-exception v0

    .line 413
    goto :goto_6

    .line 414
    :cond_6
    const-string v2, "WakeLock"

    .line 415
    .line 416
    iget-object v3, v0, Li88;->j:Ljava/lang/String;

    .line 417
    .line 418
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    const-string v4, " ** IS FORCE-RELEASED ON TIMEOUT **"

    .line 423
    .line 424
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Li88;->d()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Li88;->b()Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-nez v2, :cond_7

    .line 439
    .line 440
    monitor-exit v1

    .line 441
    goto :goto_5

    .line 442
    :cond_7
    iput v8, v0, Li88;->c:I

    .line 443
    .line 444
    invoke-virtual {v0}, Li88;->e()V

    .line 445
    .line 446
    .line 447
    monitor-exit v1

    .line 448
    :goto_5
    return-void

    .line 449
    :goto_6
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 450
    throw v0

    .line 451
    :pswitch_7
    throw v6

    .line 452
    :pswitch_8
    new-instance v1, Lm11;

    .line 453
    .line 454
    invoke-direct {v1, v3, v6, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v0, Lwg8;

    .line 460
    .line 461
    iget-object v0, v0, Lwg8;->k:Lge1;

    .line 462
    .line 463
    invoke-virtual {v0, v1}, Lge1;->c(Lm11;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :pswitch_9
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, Luy5;

    .line 470
    .line 471
    iget-object v0, v0, Luy5;->x:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lng8;

    .line 474
    .line 475
    iget-object v1, v0, Lng8;->e:Liw2;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    const-string v2, " disconnecting because it was signed out."

    .line 486
    .line 487
    iget-object v0, v0, Lng8;->e:Liw2;

    .line 488
    .line 489
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    check-cast v0, Ly50;

    .line 494
    .line 495
    invoke-virtual {v0, v1}, Ly50;->d(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :pswitch_a
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, Lng8;

    .line 502
    .line 503
    invoke-virtual {v0}, Lng8;->c()V

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :pswitch_b
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v0, Li58;

    .line 510
    .line 511
    invoke-virtual {v0, v9}, Li58;->n(I)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_c
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 518
    .line 519
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->w:Landroidx/appcompat/widget/ActionMenuView;

    .line 520
    .line 521
    if-eqz v0, :cond_8

    .line 522
    .line 523
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->P:Ld8;

    .line 524
    .line 525
    if-eqz v0, :cond_8

    .line 526
    .line 527
    invoke-virtual {v0}, Ld8;->l()Z

    .line 528
    .line 529
    .line 530
    :cond_8
    return-void

    .line 531
    :pswitch_d
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 534
    .line 535
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lp42;

    .line 536
    .line 537
    iget-object v0, v0, Lp42;->C:Lcom/google/android/material/internal/CheckableImageButton;

    .line 538
    .line 539
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 543
    .line 544
    .line 545
    return-void

    .line 546
    :pswitch_e
    invoke-direct {v0}, Lge;->a()V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    :pswitch_f
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 553
    .line 554
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B0()Z

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_10
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 561
    .line 562
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->B:Z

    .line 563
    .line 564
    if-eqz v1, :cond_9

    .line 565
    .line 566
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    const-string v2, "input_method"

    .line 571
    .line 572
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 577
    .line 578
    invoke-virtual {v1, v0, v9}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 579
    .line 580
    .line 581
    iput-boolean v9, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->B:Z

    .line 582
    .line 583
    :cond_9
    return-void

    .line 584
    :pswitch_11
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 587
    .line 588
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:Lty5;

    .line 589
    .line 590
    if-eqz v1, :cond_16

    .line 591
    .line 592
    check-cast v1, Ljm1;

    .line 593
    .line 594
    iget-wide v10, v1, Lty5;->d:J

    .line 595
    .line 596
    iget-object v3, v1, Ljm1;->h:Ljava/util/ArrayList;

    .line 597
    .line 598
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 599
    .line 600
    .line 601
    move-result v6

    .line 602
    iget-object v12, v1, Ljm1;->j:Ljava/util/ArrayList;

    .line 603
    .line 604
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 605
    .line 606
    .line 607
    move-result v13

    .line 608
    iget-object v14, v1, Ljm1;->k:Ljava/util/ArrayList;

    .line 609
    .line 610
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 611
    .line 612
    .line 613
    move-result v15

    .line 614
    move-wide/from16 v16, v4

    .line 615
    .line 616
    iget-object v4, v1, Ljm1;->i:Ljava/util/ArrayList;

    .line 617
    .line 618
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    if-eqz v6, :cond_a

    .line 623
    .line 624
    if-eqz v13, :cond_a

    .line 625
    .line 626
    if-eqz v5, :cond_a

    .line 627
    .line 628
    if-eqz v15, :cond_a

    .line 629
    .line 630
    goto/16 :goto_f

    .line 631
    .line 632
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v18

    .line 636
    :goto_7
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v19

    .line 640
    if-eqz v19, :cond_b

    .line 641
    .line 642
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v19

    .line 646
    move-object/from16 v7, v19

    .line 647
    .line 648
    check-cast v7, Llz5;

    .line 649
    .line 650
    iget-object v8, v7, Llz5;->a:Landroid/view/View;

    .line 651
    .line 652
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 653
    .line 654
    .line 655
    move-result-object v9

    .line 656
    iget-object v2, v1, Ljm1;->q:Ljava/util/ArrayList;

    .line 657
    .line 658
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    invoke-virtual {v9, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    move-object/from16 p0, v3

    .line 666
    .line 667
    const/4 v3, 0x0

    .line 668
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    new-instance v3, Lem1;

    .line 673
    .line 674
    invoke-direct {v3, v1, v7, v9, v8}, Lem1;-><init>(Ljm1;Llz5;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 682
    .line 683
    .line 684
    move-object/from16 v3, p0

    .line 685
    .line 686
    const/4 v7, 0x2

    .line 687
    const/4 v8, 0x1

    .line 688
    const/4 v9, 0x0

    .line 689
    goto :goto_7

    .line 690
    :cond_b
    move-object/from16 p0, v3

    .line 691
    .line 692
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->clear()V

    .line 693
    .line 694
    .line 695
    if-nez v13, :cond_d

    .line 696
    .line 697
    new-instance v2, Ljava/util/ArrayList;

    .line 698
    .line 699
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 703
    .line 704
    .line 705
    iget-object v3, v1, Ljm1;->m:Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 711
    .line 712
    .line 713
    new-instance v3, Ldm1;

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    invoke-direct {v3, v1, v2, v7}, Ldm1;-><init>(Ljm1;Ljava/util/ArrayList;I)V

    .line 717
    .line 718
    .line 719
    if-nez v6, :cond_c

    .line 720
    .line 721
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    check-cast v2, Lim1;

    .line 726
    .line 727
    iget-object v2, v2, Lim1;->a:Llz5;

    .line 728
    .line 729
    iget-object v2, v2, Llz5;->a:Landroid/view/View;

    .line 730
    .line 731
    sget-object v7, Le58;->a:Ljava/util/WeakHashMap;

    .line 732
    .line 733
    invoke-virtual {v2, v3, v10, v11}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 734
    .line 735
    .line 736
    goto :goto_8

    .line 737
    :cond_c
    invoke-virtual {v3}, Ldm1;->run()V

    .line 738
    .line 739
    .line 740
    :cond_d
    :goto_8
    if-nez v15, :cond_f

    .line 741
    .line 742
    new-instance v2, Ljava/util/ArrayList;

    .line 743
    .line 744
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 748
    .line 749
    .line 750
    iget-object v3, v1, Ljm1;->n:Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 756
    .line 757
    .line 758
    new-instance v3, Ldm1;

    .line 759
    .line 760
    const/4 v7, 0x1

    .line 761
    invoke-direct {v3, v1, v2, v7}, Ldm1;-><init>(Ljm1;Ljava/util/ArrayList;I)V

    .line 762
    .line 763
    .line 764
    if-nez v6, :cond_e

    .line 765
    .line 766
    const/4 v7, 0x0

    .line 767
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    check-cast v2, Lhm1;

    .line 772
    .line 773
    iget-object v2, v2, Lhm1;->a:Llz5;

    .line 774
    .line 775
    iget-object v2, v2, Llz5;->a:Landroid/view/View;

    .line 776
    .line 777
    sget-object v7, Le58;->a:Ljava/util/WeakHashMap;

    .line 778
    .line 779
    invoke-virtual {v2, v3, v10, v11}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 780
    .line 781
    .line 782
    goto :goto_9

    .line 783
    :cond_e
    invoke-virtual {v3}, Ldm1;->run()V

    .line 784
    .line 785
    .line 786
    :cond_f
    :goto_9
    if-nez v5, :cond_15

    .line 787
    .line 788
    new-instance v2, Ljava/util/ArrayList;

    .line 789
    .line 790
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 794
    .line 795
    .line 796
    iget-object v3, v1, Ljm1;->l:Ljava/util/ArrayList;

    .line 797
    .line 798
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 802
    .line 803
    .line 804
    new-instance v3, Ldm1;

    .line 805
    .line 806
    const/4 v4, 0x2

    .line 807
    invoke-direct {v3, v1, v2, v4}, Ldm1;-><init>(Ljm1;Ljava/util/ArrayList;I)V

    .line 808
    .line 809
    .line 810
    if-eqz v6, :cond_11

    .line 811
    .line 812
    if-eqz v13, :cond_11

    .line 813
    .line 814
    if-nez v15, :cond_10

    .line 815
    .line 816
    goto :goto_a

    .line 817
    :cond_10
    invoke-virtual {v3}, Ldm1;->run()V

    .line 818
    .line 819
    .line 820
    goto :goto_e

    .line 821
    :cond_11
    :goto_a
    if-nez v6, :cond_12

    .line 822
    .line 823
    goto :goto_b

    .line 824
    :cond_12
    move-wide/from16 v10, v16

    .line 825
    .line 826
    :goto_b
    if-nez v13, :cond_13

    .line 827
    .line 828
    iget-wide v4, v1, Lty5;->e:J

    .line 829
    .line 830
    goto :goto_c

    .line 831
    :cond_13
    move-wide/from16 v4, v16

    .line 832
    .line 833
    :goto_c
    if-nez v15, :cond_14

    .line 834
    .line 835
    iget-wide v6, v1, Lty5;->f:J

    .line 836
    .line 837
    goto :goto_d

    .line 838
    :cond_14
    move-wide/from16 v6, v16

    .line 839
    .line 840
    :goto_d
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 841
    .line 842
    .line 843
    move-result-wide v4

    .line 844
    add-long/2addr v4, v10

    .line 845
    const/4 v7, 0x0

    .line 846
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    check-cast v1, Llz5;

    .line 851
    .line 852
    iget-object v1, v1, Llz5;->a:Landroid/view/View;

    .line 853
    .line 854
    sget-object v2, Le58;->a:Ljava/util/WeakHashMap;

    .line 855
    .line 856
    invoke-virtual {v1, v3, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 857
    .line 858
    .line 859
    goto :goto_10

    .line 860
    :cond_15
    :goto_e
    const/4 v7, 0x0

    .line 861
    goto :goto_10

    .line 862
    :cond_16
    :goto_f
    move v7, v9

    .line 863
    :goto_10
    iput-boolean v7, v0, Landroidx/recyclerview/widget/RecyclerView;->F0:Z

    .line 864
    .line 865
    return-void

    .line 866
    :pswitch_12
    iget-object v1, v0, Lge;->x:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v1, Lbp4;

    .line 869
    .line 870
    iget-object v1, v1, Lbp4;->a:Ljava/lang/Object;

    .line 871
    .line 872
    monitor-enter v1

    .line 873
    :try_start_3
    iget-object v2, v0, Lge;->x:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v2, Lbp4;

    .line 876
    .line 877
    iget-object v2, v2, Lbp4;->f:Ljava/lang/Object;

    .line 878
    .line 879
    iget-object v3, v0, Lge;->x:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v3, Lbp4;

    .line 882
    .line 883
    sget-object v4, Lbp4;->k:Ljava/lang/Object;

    .line 884
    .line 885
    iput-object v4, v3, Lbp4;->f:Ljava/lang/Object;

    .line 886
    .line 887
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 888
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, Lbp4;

    .line 891
    .line 892
    invoke-virtual {v0, v2}, Lbp4;->i(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :catchall_2
    move-exception v0

    .line 897
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 898
    throw v0

    .line 899
    :pswitch_13
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, Lrq2;

    .line 902
    .line 903
    const/4 v7, 0x1

    .line 904
    invoke-virtual {v0, v7}, Lrq2;->A(Z)Z

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    :pswitch_14
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, Lbq2;

    .line 911
    .line 912
    iget-object v1, v0, Lbq2;->f0:Laq2;

    .line 913
    .line 914
    if-eqz v1, :cond_17

    .line 915
    .line 916
    invoke-virtual {v0}, Lbq2;->j()Laq2;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    :cond_17
    return-void

    .line 924
    :pswitch_15
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, Lwb2;

    .line 927
    .line 928
    iget-object v1, v0, Lwb2;->z:Landroid/animation/ValueAnimator;

    .line 929
    .line 930
    iget v2, v0, Lwb2;->A:I

    .line 931
    .line 932
    const/4 v7, 0x1

    .line 933
    if-eq v2, v7, :cond_18

    .line 934
    .line 935
    const/4 v4, 0x2

    .line 936
    if-eq v2, v4, :cond_19

    .line 937
    .line 938
    goto :goto_11

    .line 939
    :cond_18
    const/4 v4, 0x2

    .line 940
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 941
    .line 942
    .line 943
    :cond_19
    const/4 v2, 0x3

    .line 944
    iput v2, v0, Lwb2;->A:I

    .line 945
    .line 946
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    check-cast v0, Ljava/lang/Float;

    .line 951
    .line 952
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    new-array v2, v4, [F

    .line 957
    .line 958
    const/16 v20, 0x0

    .line 959
    .line 960
    aput v0, v2, v20

    .line 961
    .line 962
    const/16 v19, 0x1

    .line 963
    .line 964
    const/16 v21, 0x0

    .line 965
    .line 966
    aput v21, v2, v19

    .line 967
    .line 968
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 969
    .line 970
    .line 971
    const-wide/16 v2, 0x1f4

    .line 972
    .line 973
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 977
    .line 978
    .line 979
    :goto_11
    return-void

    .line 980
    :pswitch_16
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v0, Le02;

    .line 983
    .line 984
    iput-object v6, v0, Le02;->H:Lge;

    .line 985
    .line 986
    invoke-virtual {v0}, Le02;->drawableStateChanged()V

    .line 987
    .line 988
    .line 989
    return-void

    .line 990
    :pswitch_17
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, Lou1;

    .line 993
    .line 994
    iget-object v1, v0, Lou1;->w0:Lmu1;

    .line 995
    .line 996
    iget-object v0, v0, Lou1;->E0:Landroid/app/Dialog;

    .line 997
    .line 998
    invoke-virtual {v1, v0}, Lmu1;->onDismiss(Landroid/content/DialogInterface;)V

    .line 999
    .line 1000
    .line 1001
    return-void

    .line 1002
    :pswitch_18
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 1003
    .line 1004
    move-object v1, v0

    .line 1005
    check-cast v1, La01;

    .line 1006
    .line 1007
    monitor-enter v1

    .line 1008
    :try_start_5
    invoke-virtual {v1}, La01;->a()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_1a

    .line 1013
    .line 1014
    monitor-enter v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1015
    const/4 v7, 0x1

    .line 1016
    :try_start_6
    iput-boolean v7, v1, La01;->b:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1017
    .line 1018
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1019
    goto :goto_12

    .line 1020
    :catchall_3
    move-exception v0

    .line 1021
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1022
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1023
    :cond_1a
    :goto_12
    monitor-exit v1

    .line 1024
    if-nez v0, :cond_1b

    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_1b
    iget-object v0, v1, La01;->q:Ld01;

    .line 1028
    .line 1029
    invoke-virtual {v0}, Ld01;->c()Lc01;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    new-instance v2, Ljava/util/Date;

    .line 1034
    .line 1035
    iget-object v4, v1, La01;->p:Lxb4;

    .line 1036
    .line 1037
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v4

    .line 1044
    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v0, v0, Lc01;->b:Ljava/util/Date;

    .line 1048
    .line 1049
    invoke-virtual {v2, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v0

    .line 1053
    if-eqz v0, :cond_1c

    .line 1054
    .line 1055
    invoke-virtual {v1}, La01;->h()V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_13

    .line 1059
    :cond_1c
    iget-object v0, v1, La01;->k:Lwe2;

    .line 1060
    .line 1061
    check-cast v0, Lve2;

    .line 1062
    .line 1063
    invoke-virtual {v0}, Lve2;->d()Lyb9;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    invoke-virtual {v0}, Lve2;->c()Lyb9;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    filled-new-array {v2, v0}, [Lyb9;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    invoke-static {v4}, Lb35;->B([Lyb9;)Lyb9;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    iget-object v5, v1, La01;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1080
    .line 1081
    new-instance v6, Lyz0;

    .line 1082
    .line 1083
    const/4 v7, 0x0

    .line 1084
    invoke-direct {v6, v1, v2, v0, v7}, Lyz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v4, v5, v6}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    filled-new-array {v0}, [Lyb9;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    invoke-static {v2}, Lb35;->B([Lyb9;)Lyb9;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    iget-object v4, v1, La01;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1100
    .line 1101
    new-instance v5, Lyv0;

    .line 1102
    .line 1103
    invoke-direct {v5, v3, v1, v0}, Lyv0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v2, v4, v5}, Lyb9;->f(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 1107
    .line 1108
    .line 1109
    :goto_13
    return-void

    .line 1110
    :catchall_4
    move-exception v0

    .line 1111
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1112
    throw v0

    .line 1113
    :pswitch_19
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v0, Lza0;

    .line 1116
    .line 1117
    const/4 v7, 0x0

    .line 1118
    iput-boolean v7, v0, Lza0;->c:Z

    .line 1119
    .line 1120
    iget-object v1, v0, Lza0;->e:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1123
    .line 1124
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Li58;

    .line 1125
    .line 1126
    if-eqz v2, :cond_1d

    .line 1127
    .line 1128
    invoke-virtual {v2}, Li58;->f()Z

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    if-eqz v2, :cond_1d

    .line 1133
    .line 1134
    iget v1, v0, Lza0;->b:I

    .line 1135
    .line 1136
    invoke-virtual {v0, v1}, Lza0;->b(I)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_14

    .line 1140
    :cond_1d
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:I

    .line 1141
    .line 1142
    const/4 v4, 0x2

    .line 1143
    if-ne v2, v4, :cond_1e

    .line 1144
    .line 1145
    iget v0, v0, Lza0;->b:I

    .line 1146
    .line 1147
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 1148
    .line 1149
    .line 1150
    :cond_1e
    :goto_14
    return-void

    .line 1151
    :pswitch_1a
    move-wide/from16 v16, v4

    .line 1152
    .line 1153
    iget-object v1, v0, Lge;->x:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v1, Ln84;

    .line 1156
    .line 1157
    iget-object v2, v1, Ln84;->y:Le02;

    .line 1158
    .line 1159
    iget-object v3, v1, Ln84;->w:Loy;

    .line 1160
    .line 1161
    iget-boolean v4, v1, Ln84;->K:Z

    .line 1162
    .line 1163
    if-nez v4, :cond_1f

    .line 1164
    .line 1165
    goto/16 :goto_17

    .line 1166
    .line 1167
    :cond_1f
    iget-boolean v4, v1, Ln84;->I:Z

    .line 1168
    .line 1169
    if-eqz v4, :cond_20

    .line 1170
    .line 1171
    const/4 v7, 0x0

    .line 1172
    iput-boolean v7, v1, Ln84;->I:Z

    .line 1173
    .line 1174
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v4

    .line 1178
    iput-wide v4, v3, Loy;->e:J

    .line 1179
    .line 1180
    const-wide/16 v6, -0x1

    .line 1181
    .line 1182
    iput-wide v6, v3, Loy;->g:J

    .line 1183
    .line 1184
    iput-wide v4, v3, Loy;->f:J

    .line 1185
    .line 1186
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1187
    .line 1188
    iput v4, v3, Loy;->h:F

    .line 1189
    .line 1190
    :cond_20
    iget-wide v4, v3, Loy;->g:J

    .line 1191
    .line 1192
    cmp-long v4, v4, v16

    .line 1193
    .line 1194
    if-lez v4, :cond_21

    .line 1195
    .line 1196
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1197
    .line 1198
    .line 1199
    move-result-wide v4

    .line 1200
    iget-wide v6, v3, Loy;->g:J

    .line 1201
    .line 1202
    iget v8, v3, Loy;->i:I

    .line 1203
    .line 1204
    int-to-long v8, v8

    .line 1205
    add-long/2addr v6, v8

    .line 1206
    cmp-long v4, v4, v6

    .line 1207
    .line 1208
    if-lez v4, :cond_21

    .line 1209
    .line 1210
    :goto_15
    const/4 v7, 0x0

    .line 1211
    goto :goto_16

    .line 1212
    :cond_21
    invoke-virtual {v1}, Ln84;->e()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v4

    .line 1216
    if-nez v4, :cond_22

    .line 1217
    .line 1218
    goto :goto_15

    .line 1219
    :goto_16
    iput-boolean v7, v1, Ln84;->K:Z

    .line 1220
    .line 1221
    goto :goto_17

    .line 1222
    :cond_22
    const/4 v7, 0x0

    .line 1223
    iget-boolean v4, v1, Ln84;->J:Z

    .line 1224
    .line 1225
    if-eqz v4, :cond_23

    .line 1226
    .line 1227
    iput-boolean v7, v1, Ln84;->J:Z

    .line 1228
    .line 1229
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v8

    .line 1233
    const/4 v14, 0x0

    .line 1234
    const/4 v15, 0x0

    .line 1235
    const/4 v12, 0x3

    .line 1236
    const/4 v13, 0x0

    .line 1237
    move-wide v10, v8

    .line 1238
    invoke-static/range {v8 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v4

    .line 1242
    invoke-virtual {v2, v4}, Le02;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 1246
    .line 1247
    .line 1248
    :cond_23
    iget-wide v4, v3, Loy;->f:J

    .line 1249
    .line 1250
    cmp-long v4, v4, v16

    .line 1251
    .line 1252
    if-eqz v4, :cond_24

    .line 1253
    .line 1254
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v4

    .line 1258
    invoke-virtual {v3, v4, v5}, Loy;->a(J)F

    .line 1259
    .line 1260
    .line 1261
    move-result v6

    .line 1262
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1263
    .line 1264
    mul-float/2addr v7, v6

    .line 1265
    mul-float/2addr v7, v6

    .line 1266
    const/high16 v8, 0x40800000    # 4.0f

    .line 1267
    .line 1268
    mul-float/2addr v6, v8

    .line 1269
    add-float/2addr v6, v7

    .line 1270
    iget-wide v7, v3, Loy;->f:J

    .line 1271
    .line 1272
    sub-long v7, v4, v7

    .line 1273
    .line 1274
    iput-wide v4, v3, Loy;->f:J

    .line 1275
    .line 1276
    long-to-float v4, v7

    .line 1277
    mul-float/2addr v4, v6

    .line 1278
    iget v3, v3, Loy;->d:F

    .line 1279
    .line 1280
    mul-float/2addr v4, v3

    .line 1281
    float-to-int v3, v4

    .line 1282
    iget-object v1, v1, Ln84;->M:Le02;

    .line 1283
    .line 1284
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1285
    .line 1286
    .line 1287
    sget-object v1, Le58;->a:Ljava/util/WeakHashMap;

    .line 1288
    .line 1289
    invoke-virtual {v2, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_17

    .line 1293
    :cond_24
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1294
    .line 1295
    invoke-static {v0}, Lrf2;->r(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    :goto_17
    return-void

    .line 1299
    :pswitch_1b
    iget-object v0, v0, Lge;->x:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 1302
    .line 1303
    iget-object v1, v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lui7;

    .line 1304
    .line 1305
    if-nez v1, :cond_25

    .line 1306
    .line 1307
    new-instance v1, Lui7;

    .line 1308
    .line 1309
    invoke-direct {v1}, Lui7;-><init>()V

    .line 1310
    .line 1311
    .line 1312
    iput-object v1, v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lui7;

    .line 1313
    .line 1314
    :cond_25
    return-void

    .line 1315
    :pswitch_1c
    move v4, v7

    .line 1316
    iget-object v1, v0, Lge;->x:Ljava/lang/Object;

    .line 1317
    .line 1318
    move-object v5, v1

    .line 1319
    check-cast v5, Lje;

    .line 1320
    .line 1321
    invoke-virtual {v5, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1322
    .line 1323
    .line 1324
    iget-object v6, v5, Lje;->G0:Landroid/view/MotionEvent;

    .line 1325
    .line 1326
    if-eqz v6, :cond_28

    .line 1327
    .line 1328
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1329
    .line 1330
    .line 1331
    move-result v0

    .line 1332
    const/16 v1, 0xa

    .line 1333
    .line 1334
    if-eq v0, v1, :cond_28

    .line 1335
    .line 1336
    const/4 v7, 0x1

    .line 1337
    if-eq v0, v7, :cond_28

    .line 1338
    .line 1339
    const/4 v1, 0x7

    .line 1340
    if-eq v0, v1, :cond_27

    .line 1341
    .line 1342
    const/16 v2, 0x8

    .line 1343
    .line 1344
    const/16 v3, 0x9

    .line 1345
    .line 1346
    if-eq v0, v2, :cond_26

    .line 1347
    .line 1348
    if-eq v0, v3, :cond_27

    .line 1349
    .line 1350
    move v7, v4

    .line 1351
    goto :goto_18

    .line 1352
    :cond_26
    move v7, v3

    .line 1353
    goto :goto_18

    .line 1354
    :cond_27
    move v7, v1

    .line 1355
    :goto_18
    iget-wide v8, v5, Lje;->H0:J

    .line 1356
    .line 1357
    const/4 v10, 0x0

    .line 1358
    invoke-virtual/range {v5 .. v10}, Lje;->I(Landroid/view/MotionEvent;IJZ)V

    .line 1359
    .line 1360
    .line 1361
    :cond_28
    return-void

    .line 1362
    nop

    .line 1363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method
