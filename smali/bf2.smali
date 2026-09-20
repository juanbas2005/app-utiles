.class public final synthetic Lbf2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Le77;


# instance fields
.field public final synthetic w:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lmd4;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lmd4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbf2;->w:Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    iput-object p2, p0, Lbf2;->x:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lbf2;->y:Lmd4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public a()Lyb9;
    .locals 10

    .line 1
    iget-object v0, p0, Lbf2;->w:Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    iget-object v1, p0, Lbf2;->x:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lbf2;->y:Lmd4;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lo9;

    .line 8
    .line 9
    invoke-virtual {v2}, Lo9;->E()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, Lo9;->B:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lgk4;

    .line 18
    .line 19
    invoke-virtual {v4}, Lgk4;->d()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const v5, 0xf919880

    .line 24
    .line 25
    .line 26
    if-lt v4, v5, :cond_0

    .line 27
    .line 28
    new-instance v3, Lar4;

    .line 29
    .line 30
    const-string v4, "Firebase-Messaging-Network-Io"

    .line 31
    .line 32
    invoke-direct {v3, v4}, Lar4;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, v2, Lo9;->z:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Lwe2;

    .line 42
    .line 43
    check-cast v4, Lve2;

    .line 44
    .line 45
    invoke-virtual {v4}, Lve2;->c()Lyb9;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v5, Lyv0;

    .line 50
    .line 51
    const/4 v6, 0x7

    .line 52
    invoke-direct {v5, v6, v2, v3}, Lyv0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3, v5}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_0
    iget-object v2, v2, Lo9;->A:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lkd6;

    .line 64
    .line 65
    iget-object v4, v2, Lkd6;->x:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Loe2;

    .line 68
    .line 69
    invoke-static {v4}, Lgk4;->c(Loe2;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v5, Landroid/os/Bundle;

    .line 74
    .line 75
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 76
    .line 77
    .line 78
    const/4 v6, 0x1

    .line 79
    :try_start_0
    invoke-virtual {v2, v4, v5, v3}, Lkd6;->D0(Ljava/lang/String;Landroid/os/Bundle;Z)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    iget-object v3, v2, Lkd6;->z:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Lha6;

    .line 85
    .line 86
    sget-object v4, Lgv1;->y:Lgv1;

    .line 87
    .line 88
    iget-object v7, v3, Lha6;->c:Lo21;

    .line 89
    .line 90
    invoke-virtual {v7}, Lo21;->s()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    const v9, 0xb71b00

    .line 95
    .line 96
    .line 97
    if-ge v8, v9, :cond_2

    .line 98
    .line 99
    invoke-virtual {v7}, Lo21;->q()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_1

    .line 104
    .line 105
    invoke-virtual {v3, v5}, Lha6;->b(Landroid/os/Bundle;)Lyb9;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    new-instance v8, Lkc9;

    .line 110
    .line 111
    const/4 v9, 0x2

    .line 112
    invoke-direct {v8, v9, v3, v5}, Lkc9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v4, v8}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    new-instance v3, Ljava/io/IOException;

    .line 121
    .line 122
    const-string v4, "MISSING_INSTANCEID_SERVICE"

    .line 123
    .line 124
    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3}, Lb35;->k(Ljava/lang/Exception;)Lyb9;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    iget-object v3, v3, Lha6;->b:Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {v3}, Lkb9;->s(Landroid/content/Context;)Lkb9;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-instance v7, Lba9;

    .line 139
    .line 140
    monitor-enter v3

    .line 141
    :try_start_1
    iget v8, v3, Lkb9;->x:I

    .line 142
    .line 143
    add-int/lit8 v9, v8, 0x1

    .line 144
    .line 145
    iput v9, v3, Lkb9;->x:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    .line 147
    monitor-exit v3

    .line 148
    invoke-direct {v7, v8, v6, v5, v6}, Lba9;-><init>(IILandroid/os/Bundle;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v7}, Lkb9;->t(Lba9;)Lyb9;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    sget-object v5, Ljv2;->x:Ljv2;

    .line 156
    .line 157
    invoke-virtual {v3, v4, v5}, Lyb9;->f(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception p0

    .line 163
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    throw p0

    .line 165
    :catch_0
    move-exception v3

    .line 166
    goto :goto_0

    .line 167
    :catch_1
    move-exception v3

    .line 168
    :goto_0
    invoke-static {v3}, Lb35;->k(Ljava/lang/Exception;)Lyb9;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    :goto_1
    new-instance v4, Lor;

    .line 173
    .line 174
    invoke-direct {v4, v6}, Lor;-><init>(I)V

    .line 175
    .line 176
    .line 177
    new-instance v5, Lc9;

    .line 178
    .line 179
    const/16 v6, 0xb

    .line 180
    .line 181
    invoke-direct {v5, v6, v2}, Lc9;-><init>(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v4, v5}, Lyb9;->f(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    :goto_2
    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 189
    .line 190
    new-instance v4, Lbf2;

    .line 191
    .line 192
    invoke-direct {v4, v0, v1, p0}, Lbf2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lmd4;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v3, v4}, Lyb9;->l(Ljava/util/concurrent/Executor;Le77;)Lyb9;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0
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

.method public q(Ljava/lang/Object;)Lyb9;
    .locals 7

    .line 1
    iget-object v0, p0, Lbf2;->w:Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    iget-object v1, p0, Lbf2;->x:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lbf2;->y:Lmd4;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/google/firebase/messaging/FirebaseMessaging;->c(Landroid/content/Context;)Luy5;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "[DEFAULT]"

    .line 16
    .line 17
    iget-object v4, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Loe2;

    .line 18
    .line 19
    invoke-virtual {v4}, Loe2;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v5, v4, Loe2;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const-string v3, ""

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v4}, Loe2;->d()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :goto_0
    iget-object v4, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Lgk4;

    .line 38
    .line 39
    invoke-virtual {v4}, Lgk4;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    monitor-enter v2

    .line 44
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    invoke-static {v5, v6, p1, v4}, Lmd4;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    monitor-exit v2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :try_start_1
    iget-object v5, v2, Luy5;->x:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Landroid/content/SharedPreferences;

    .line 59
    .line 60
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    new-instance v6, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v3, "|T|"

    .line 73
    .line 74
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, "|*"

    .line 81
    .line 82
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v5, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    .line 95
    monitor-exit v2

    .line 96
    :goto_1
    iget-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lo9;

    .line 97
    .line 98
    invoke-virtual {v1}, Lo9;->E()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    iget-object p0, p0, Lmd4;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_6

    .line 115
    .line 116
    :cond_2
    const-string p0, "FirebaseMessaging"

    .line 117
    .line 118
    const-string v1, "[DEFAULT]"

    .line 119
    .line 120
    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Loe2;

    .line 121
    .line 122
    invoke-virtual {v2}, Loe2;->a()V

    .line 123
    .line 124
    .line 125
    iget-object v3, v2, Loe2;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_3

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_3
    const/4 v1, 0x3

    .line 135
    invoke-static {p0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_4

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v4, "Invoking onNewToken for app: "

    .line 144
    .line 145
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Loe2;->a()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {p0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    :cond_4
    iget-object p0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lo9;

    .line 162
    .line 163
    invoke-virtual {p0}, Lo9;->E()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    new-instance v1, Landroid/content/Intent;

    .line 168
    .line 169
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v2, "token"

    .line 173
    .line 174
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    .line 176
    .line 177
    if-eqz p0, :cond_5

    .line 178
    .line 179
    const-string p0, "com.google.firebase.messaging.FCM_REGISTERED"

    .line 180
    .line 181
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    const-string p0, "com.google.firebase.messaging.NEW_TOKEN"

    .line 186
    .line 187
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    .line 189
    .line 190
    :goto_2
    new-instance p0, Lqc3;

    .line 191
    .line 192
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 193
    .line 194
    const/4 v2, 0x2

    .line 195
    invoke-direct {p0, v0, v2}, Lqc3;-><init>(Landroid/content/Context;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v1}, Lqc3;->J(Landroid/content/Intent;)Lyb9;

    .line 199
    .line 200
    .line 201
    :cond_6
    :goto_3
    invoke-static {p1}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :catchall_0
    move-exception p0

    .line 207
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 208
    throw p0
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
.end method
