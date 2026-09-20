.class public final synthetic Lj89;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lw89;

.field public final synthetic y:Li3;


# direct methods
.method public synthetic constructor <init>(Lw89;Li3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lj89;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lj89;->x:Lw89;

    .line 4
    .line 5
    iput-object p2, p0, Lj89;->y:Li3;

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
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lj89;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj89;->x:Lw89;

    .line 7
    .line 8
    iget-object p0, p0, Lj89;->y:Li3;

    .line 9
    .line 10
    :try_start_0
    invoke-static {p0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lt99;

    .line 15
    .line 16
    new-instance v1, Ldv5;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/16 v3, 0xb

    .line 20
    .line 21
    const/4 v4, 0x6

    .line 22
    invoke-direct {v1, v4, v2, v3}, Ldv5;-><init>(III)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lge2;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, Lge2;-><init>(Lt99;Ldv5;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, v0, Lw89;->e:Z

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    iget-object v3, v0, Lw89;->a:Lge2;

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :catch_1
    move-exception p0

    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    :goto_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    :try_start_1
    iget-object v3, v0, Lw89;->a:Lge2;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :cond_2
    :try_start_2
    iget-object v1, v3, Lge2;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ln36;

    .line 57
    .line 58
    iget-object v2, v2, Lge2;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ln36;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ln36;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    iget-object p0, v0, Lw89;->b:Lx49;

    .line 69
    .line 70
    iget-object p0, p0, Lx49;->e:Lx77;

    .line 71
    .line 72
    invoke-interface {p0}, Lx77;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lq99;

    .line 77
    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Lq99;->a()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    :goto_1
    :try_start_3
    iput-object v2, v0, Lw89;->a:Lge2;

    .line 87
    .line 88
    iget-object v1, v0, Lw89;->g:Ln49;

    .line 89
    .line 90
    iget-object v1, v1, Ln49;->x:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 95
    .line 96
    .line 97
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    :cond_4
    :try_start_4
    iget-boolean v1, v0, Lw89;->e:Z

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    iget-object v1, v0, Lw89;->b:Lx49;

    .line 103
    .line 104
    iget-object v2, v1, Lx49;->d:Lx77;

    .line 105
    .line 106
    invoke-interface {v2}, Lx77;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, La69;

    .line 111
    .line 112
    invoke-virtual {p0}, Lt99;->t()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v2, v2, La69;->a:Lb49;

    .line 123
    .line 124
    invoke-virtual {v2, p0}, Lb49;->c(Ljava/lang/String;)Lyb9;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, La69;->b(Lyb9;)Lf0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-class v2, Ljava/lang/Throwable;

    .line 133
    .line 134
    new-instance v3, Ln89;

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    invoke-direct {v3, v4, v0}, Ln89;-><init>(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Lx49;->a()Ljm4;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    sget v4, Lh0;->H:I

    .line 145
    .line 146
    new-instance v4, Lg0;

    .line 147
    .line 148
    invoke-direct {v4, p0, v2, v3}, Lh0;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v4}, Lag8;->E(Ljava/util/concurrent/Executor;Lxj2;)Ljava/util/concurrent/Executor;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-interface {p0, v4, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 160
    :try_start_6
    throw p0
    :try_end_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_0

    .line 161
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    instance-of v1, v1, Ljava/lang/SecurityException;

    .line 166
    .line 167
    if-nez v1, :cond_5

    .line 168
    .line 169
    iget-object v0, v0, Lw89;->c:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    add-int/lit8 v1, v1, 0x40

    .line 182
    .line 183
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 184
    .line 185
    .line 186
    const-string v1, "Unable to update local snapshot for "

    .line 187
    .line 188
    const-string v3, ", may result in stale flags."

    .line 189
    .line 190
    invoke-static {v2, v1, v0, v3}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v1, "FlagStore"

    .line 195
    .line 196
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 197
    .line 198
    .line 199
    :cond_5
    :goto_4
    return-void

    .line 200
    :pswitch_0
    iget-object v0, p0, Lj89;->x:Lw89;

    .line 201
    .line 202
    iget-object p0, p0, Lj89;->y:Li3;

    .line 203
    .line 204
    :try_start_7
    invoke-static {p0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :catch_2
    move-exception p0

    .line 209
    iget-object v0, v0, Lw89;->c:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    new-instance v2, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    add-int/lit8 v1, v1, 0x49

    .line 222
    .line 223
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 224
    .line 225
    .line 226
    const-string v1, "Failed to store account on flag read for: "

    .line 227
    .line 228
    const-string v3, " which may lead to stale flags."

    .line 229
    .line 230
    invoke-static {v2, v1, v0, v3}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v1, "FlagStore"

    .line 235
    .line 236
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 237
    .line 238
    .line 239
    :goto_5
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
