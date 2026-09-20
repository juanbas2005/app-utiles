.class public final synthetic Lgn7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhn7;


# direct methods
.method public synthetic constructor <init>(Lhn7;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgn7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgn7;->x:Lhn7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lgn7;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lgn7;->x:Lhn7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lhn7;->z:Loe2;

    .line 9
    .line 10
    invoke-virtual {v0}, Loe2;->a()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Loe2;->a:Landroid/content/Context;

    .line 14
    .line 15
    iput-object v0, p0, Lhn7;->F:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lhn7;->K:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Lb01;->e()Lb01;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lhn7;->G:Lb01;

    .line 28
    .line 29
    new-instance v0, Lbw5;

    .line 30
    .line 31
    iget-object v1, p0, Lhn7;->F:Landroid/content/Context;

    .line 32
    .line 33
    new-instance v2, Lzv5;

    .line 34
    .line 35
    const-wide/16 v5, 0x1

    .line 36
    .line 37
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 38
    .line 39
    const-wide/16 v3, 0x64

    .line 40
    .line 41
    invoke-direct/range {v2 .. v7}, Lzv5;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lbw5;-><init>(Landroid/content/Context;Lzv5;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lhn7;->H:Lbw5;

    .line 48
    .line 49
    invoke-static {}, Lwq;->a()Lwq;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lhn7;->I:Lwq;

    .line 54
    .line 55
    new-instance v0, Ldh2;

    .line 56
    .line 57
    iget-object v1, p0, Lhn7;->C:Lnu5;

    .line 58
    .line 59
    iget-object v2, p0, Lhn7;->G:Lb01;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v3, Ll01;->G:Ll01;

    .line 65
    .line 66
    const-class v3, Ll01;

    .line 67
    .line 68
    monitor-enter v3

    .line 69
    :try_start_0
    sget-object v4, Ll01;->G:Ll01;

    .line 70
    .line 71
    if-nez v4, :cond_0

    .line 72
    .line 73
    new-instance v4, Ll01;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    sput-object v4, Ll01;->G:Ll01;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p0, v0

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_0
    :goto_0
    sget-object v4, Ll01;->G:Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    monitor-exit v3

    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-string v3, "fpr_log_source"

    .line 92
    .line 93
    iget-object v5, v2, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 94
    .line 95
    const-wide/16 v6, -0x1

    .line 96
    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v5, v3, v6}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValueOrDefault(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-string v5, "com.google.firebase.perf.LogSourceName"

    .line 111
    .line 112
    sget-object v6, Ll01;->H:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {v6, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_1

    .line 119
    .line 120
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    if-eqz v3, :cond_1

    .line 127
    .line 128
    iget-object v2, v2, Lb01;->c:Lzt1;

    .line 129
    .line 130
    invoke-virtual {v2, v5, v3}, Lzt1;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {v2, v4}, Lb01;->d(Lwe;)Ln75;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ln75;->b()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_2

    .line 143
    .line 144
    invoke-virtual {v2}, Ln75;->a()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v3, v2

    .line 149
    check-cast v3, Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    const-string v3, "FIREPERF"

    .line 153
    .line 154
    :goto_1
    invoke-direct {v0, v1, v3}, Ldh2;-><init>(Lnu5;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iput-object v0, p0, Lhn7;->D:Ldh2;

    .line 158
    .line 159
    iget-object v0, p0, Lhn7;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 160
    .line 161
    iget-object v1, p0, Lhn7;->I:Lwq;

    .line 162
    .line 163
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 164
    .line 165
    sget-object v3, Lhn7;->O:Lhn7;

    .line 166
    .line 167
    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget-object v4, v1, Lwq;->B:Ljava/util/HashSet;

    .line 171
    .line 172
    monitor-enter v4

    .line 173
    :try_start_1
    iget-object v1, v1, Lwq;->B:Ljava/util/HashSet;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 179
    invoke-static {}, Lir;->D()Lfr;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iput-object v1, p0, Lhn7;->J:Lfr;

    .line 184
    .line 185
    iget-object v2, p0, Lhn7;->z:Loe2;

    .line 186
    .line 187
    invoke-virtual {v2}, Loe2;->a()V

    .line 188
    .line 189
    .line 190
    iget-object v2, v2, Loe2;->c:Lcf2;

    .line 191
    .line 192
    iget-object v2, v2, Lcf2;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1}, Lqu2;->h()V

    .line 195
    .line 196
    .line 197
    iget-object v3, v1, Lqu2;->x:Lcom/google/protobuf/b;

    .line 198
    .line 199
    check-cast v3, Lir;

    .line 200
    .line 201
    invoke-static {v3, v2}, Lir;->s(Lir;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lkd;->y()Lid;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v3, p0, Lhn7;->K:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v2}, Lqu2;->h()V

    .line 211
    .line 212
    .line 213
    iget-object v4, v2, Lqu2;->x:Lcom/google/protobuf/b;

    .line 214
    .line 215
    check-cast v4, Lkd;

    .line 216
    .line 217
    invoke-static {v4, v3}, Lkd;->s(Lkd;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Lqu2;->h()V

    .line 221
    .line 222
    .line 223
    iget-object v3, v2, Lqu2;->x:Lcom/google/protobuf/b;

    .line 224
    .line 225
    check-cast v3, Lkd;

    .line 226
    .line 227
    invoke-static {v3}, Lkd;->t(Lkd;)V

    .line 228
    .line 229
    .line 230
    iget-object v3, p0, Lhn7;->F:Landroid/content/Context;

    .line 231
    .line 232
    const-string v4, ""

    .line 233
    .line 234
    :try_start_2
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const/4 v6, 0x0

    .line 243
    invoke-virtual {v5, v3, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 248
    .line 249
    if-nez v3, :cond_3

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_3
    move-object v4, v3

    .line 253
    :catch_0
    :goto_2
    invoke-virtual {v2}, Lqu2;->h()V

    .line 254
    .line 255
    .line 256
    iget-object v3, v2, Lqu2;->x:Lcom/google/protobuf/b;

    .line 257
    .line 258
    check-cast v3, Lkd;

    .line 259
    .line 260
    invoke-static {v3, v4}, Lkd;->u(Lkd;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Lqu2;->h()V

    .line 264
    .line 265
    .line 266
    iget-object v1, v1, Lqu2;->x:Lcom/google/protobuf/b;

    .line 267
    .line 268
    check-cast v1, Lir;

    .line 269
    .line 270
    invoke-virtual {v2}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Lkd;

    .line 275
    .line 276
    invoke-static {v1, v2}, Lir;->w(Lir;Lkd;)V

    .line 277
    .line 278
    .line 279
    iget-object v1, p0, Lhn7;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 280
    .line 281
    const/4 v2, 0x1

    .line 282
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 283
    .line 284
    .line 285
    :cond_4
    :goto_3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-nez v1, :cond_5

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, Lkf5;

    .line 296
    .line 297
    if-eqz v1, :cond_4

    .line 298
    .line 299
    iget-object v2, p0, Lhn7;->E:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 300
    .line 301
    new-instance v3, Le66;

    .line 302
    .line 303
    const/4 v4, 0x3

    .line 304
    invoke-direct {v3, v4, p0, v1}, Le66;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_5
    return-void

    .line 312
    :catchall_1
    move-exception v0

    .line 313
    move-object p0, v0

    .line 314
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 315
    throw p0

    .line 316
    :goto_4
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 317
    throw p0

    .line 318
    :pswitch_0
    iget-object v0, p0, Lhn7;->H:Lbw5;

    .line 319
    .line 320
    iget-boolean p0, p0, Lhn7;->M:Z

    .line 321
    .line 322
    iget-object v1, v0, Lbw5;->d:Law5;

    .line 323
    .line 324
    invoke-virtual {v1, p0}, Law5;->a(Z)V

    .line 325
    .line 326
    .line 327
    iget-object v0, v0, Lbw5;->e:Law5;

    .line 328
    .line 329
    invoke-virtual {v0, p0}, Law5;->a(Z)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
