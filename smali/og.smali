.class public final Log;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lck5;


# instance fields
.field public a:Lo44;

.field public b:Lh27;

.field public c:Lv44;

.field public d:Lpr6;


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Log;->j(Lb9;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Log;->a:Lo44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxy0;->r:Lt37;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lgy6;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p0, Lip1;

    .line 16
    .line 17
    invoke-virtual {p0}, Lip1;->b()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
.end method

.method public final c()V
    .locals 12

    .line 1
    iget-object v0, p0, Log;->b:Lh27;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Log;->b:Lh27;

    .line 10
    .line 11
    invoke-virtual {p0}, Log;->i()Lxp4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    check-cast v1, Lpr6;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    invoke-virtual {v1}, Lpr6;->p()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget p0, v1, Lpr6;->G:I

    .line 26
    .line 27
    int-to-long v4, p0

    .line 28
    add-long/2addr v2, v4

    .line 29
    iget-wide v4, v1, Lpr6;->F:J

    .line 30
    .line 31
    invoke-virtual {v1}, Lpr6;->p()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    iget p0, v1, Lpr6;->G:I

    .line 36
    .line 37
    int-to-long v8, p0

    .line 38
    add-long/2addr v6, v8

    .line 39
    invoke-virtual {v1}, Lpr6;->p()J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    iget p0, v1, Lpr6;->G:I

    .line 44
    .line 45
    int-to-long v10, p0

    .line 46
    add-long/2addr v8, v10

    .line 47
    iget p0, v1, Lpr6;->H:I

    .line 48
    .line 49
    int-to-long v10, p0

    .line 50
    add-long/2addr v8, v10

    .line 51
    invoke-virtual/range {v1 .. v9}, Lpr6;->v(JJJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit v1

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    monitor-exit v1

    .line 59
    throw p0

    .line 60
    :cond_1
    return-void
    .line 61
    .line 62
    .line 63
.end method

.method public final d(Lhf7;Lv35;Lbg7;Lst6;Lly5;Lly5;)V
    .locals 0

    .line 1
    iget-object p0, p0, Log;->c:Lv44;

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    iget-object p0, p0, Lv44;->m:Lq44;

    .line 6
    .line 7
    iget-object p4, p0, Lq44;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p4

    .line 10
    :try_start_0
    iput-object p1, p0, Lq44;->j:Lhf7;

    .line 11
    .line 12
    iput-object p2, p0, Lq44;->l:Lv35;

    .line 13
    .line 14
    iput-object p3, p0, Lq44;->k:Lbg7;

    .line 15
    .line 16
    iput-object p5, p0, Lq44;->m:Lly5;

    .line 17
    .line 18
    iput-object p6, p0, Lq44;->n:Lly5;

    .line 19
    .line 20
    iget-boolean p1, p0, Lq44;->e:Z

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-boolean p1, p0, Lq44;->d:Z

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lq44;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_1
    monitor-exit p4

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit p4

    .line 37
    throw p0

    .line 38
    :cond_2
    return-void
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

.method public final e(Lhf7;Lhf7;)V
    .locals 12

    .line 1
    iget-object p0, p0, Log;->c:Lv44;

    .line 2
    .line 3
    if-eqz p0, :cond_e

    .line 4
    .line 5
    iget-object v0, p0, Lv44;->h:Lhf7;

    .line 6
    .line 7
    iget-wide v0, v0, Lhf7;->b:J

    .line 8
    .line 9
    iget-wide v2, p2, Lhf7;->b:J

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Llg7;->b(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lv44;->h:Lhf7;

    .line 19
    .line 20
    iget-object v0, v0, Lhf7;->c:Llg7;

    .line 21
    .line 22
    iget-object v2, p2, Lhf7;->c:Llg7;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 34
    :goto_1
    iput-object p2, p0, Lv44;->h:Lhf7;

    .line 35
    .line 36
    iget-object v2, p0, Lv44;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    move v3, v1

    .line 43
    :goto_2
    if-ge v3, v2, :cond_3

    .line 44
    .line 45
    iget-object v4, p0, Lv44;->j:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljy5;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    iput-object p2, v4, Ljy5;->g:Lhf7;

    .line 62
    .line 63
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget-object v2, p0, Lv44;->m:Lq44;

    .line 67
    .line 68
    iget-object v3, v2, Lq44;->c:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v3

    .line 71
    const/4 v4, 0x0

    .line 72
    :try_start_0
    iput-object v4, v2, Lq44;->j:Lhf7;

    .line 73
    .line 74
    iput-object v4, v2, Lq44;->l:Lv35;

    .line 75
    .line 76
    iput-object v4, v2, Lq44;->k:Lbg7;

    .line 77
    .line 78
    iput-object v4, v2, Lq44;->m:Lly5;

    .line 79
    .line 80
    iput-object v4, v2, Lq44;->n:Lly5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    monitor-exit v3

    .line 83
    invoke-static {p1, p2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const/4 v3, -0x1

    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    if-eqz v0, :cond_e

    .line 91
    .line 92
    iget-object p1, p0, Lv44;->b:Lqc3;

    .line 93
    .line 94
    iget-wide v0, p2, Lhf7;->b:J

    .line 95
    .line 96
    invoke-static {v0, v1}, Llg7;->f(J)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    iget-wide v0, p2, Lhf7;->b:J

    .line 101
    .line 102
    invoke-static {v0, v1}, Llg7;->e(J)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    iget-object p2, p0, Lv44;->h:Lhf7;

    .line 107
    .line 108
    iget-object p2, p2, Lhf7;->c:Llg7;

    .line 109
    .line 110
    if-eqz p2, :cond_4

    .line 111
    .line 112
    iget-wide v0, p2, Llg7;->a:J

    .line 113
    .line 114
    invoke-static {v0, v1}, Llg7;->f(J)I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    move v8, p2

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v8, v3

    .line 121
    :goto_3
    iget-object p0, p0, Lv44;->h:Lhf7;

    .line 122
    .line 123
    iget-object p0, p0, Lhf7;->c:Llg7;

    .line 124
    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    iget-wide v0, p0, Llg7;->a:J

    .line 128
    .line 129
    invoke-static {v0, v1}, Llg7;->e(J)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :cond_5
    move v9, v3

    .line 134
    invoke-virtual {p1}, Lqc3;->A()Landroid/view/inputmethod/InputMethodManager;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-object p0, p1, Lqc3;->x:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v5, p0

    .line 141
    check-cast v5, Landroid/view/View;

    .line 142
    .line 143
    invoke-virtual/range {v4 .. v9}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    if-eqz p1, :cond_8

    .line 148
    .line 149
    iget-object v0, p1, Lhf7;->a:Lvl;

    .line 150
    .line 151
    iget-object v0, v0, Lvl;->x:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v2, p2, Lhf7;->a:Lvl;

    .line 154
    .line 155
    iget-object v2, v2, Lvl;->x:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    iget-wide v4, p1, Lhf7;->b:J

    .line 164
    .line 165
    iget-wide v6, p2, Lhf7;->b:J

    .line 166
    .line 167
    invoke-static {v4, v5, v6, v7}, Llg7;->b(JJ)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_8

    .line 172
    .line 173
    iget-object p1, p1, Lhf7;->c:Llg7;

    .line 174
    .line 175
    iget-object p2, p2, Lhf7;->c:Llg7;

    .line 176
    .line 177
    invoke-static {p1, p2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_8

    .line 182
    .line 183
    :cond_7
    iget-object p0, p0, Lv44;->b:Lqc3;

    .line 184
    .line 185
    invoke-virtual {p0}, Lqc3;->A()Landroid/view/inputmethod/InputMethodManager;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object p0, p0, Lqc3;->x:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, Landroid/view/View;

    .line 192
    .line 193
    invoke-virtual {p1, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_8
    iget-object p1, p0, Lv44;->j:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    :goto_4
    if-ge v1, p1, :cond_e

    .line 204
    .line 205
    iget-object p2, p0, Lv44;->j:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    check-cast p2, Ljy5;

    .line 218
    .line 219
    if-eqz p2, :cond_d

    .line 220
    .line 221
    iget-object v0, p0, Lv44;->h:Lhf7;

    .line 222
    .line 223
    iget-object v2, p0, Lv44;->b:Lqc3;

    .line 224
    .line 225
    iget-boolean v4, p2, Ljy5;->k:Z

    .line 226
    .line 227
    if-nez v4, :cond_9

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_9
    iput-object v0, p2, Ljy5;->g:Lhf7;

    .line 231
    .line 232
    iget-boolean v4, p2, Ljy5;->i:Z

    .line 233
    .line 234
    if-eqz v4, :cond_a

    .line 235
    .line 236
    iget p2, p2, Ljy5;->h:I

    .line 237
    .line 238
    invoke-static {v0}, Ln85;->b(Lhf7;)Landroid/view/inputmethod/ExtractedText;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v2}, Lqc3;->A()Landroid/view/inputmethod/InputMethodManager;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    iget-object v6, v2, Lqc3;->x:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v6, Landroid/view/View;

    .line 249
    .line 250
    invoke-virtual {v5, v6, p2, v4}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    .line 251
    .line 252
    .line 253
    :cond_a
    iget-object p2, v0, Lhf7;->c:Llg7;

    .line 254
    .line 255
    iget-wide v4, v0, Lhf7;->b:J

    .line 256
    .line 257
    if-eqz p2, :cond_b

    .line 258
    .line 259
    iget-wide v6, p2, Llg7;->a:J

    .line 260
    .line 261
    invoke-static {v6, v7}, Llg7;->f(J)I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    move v10, p2

    .line 266
    goto :goto_5

    .line 267
    :cond_b
    move v10, v3

    .line 268
    :goto_5
    iget-object p2, v0, Lhf7;->c:Llg7;

    .line 269
    .line 270
    if-eqz p2, :cond_c

    .line 271
    .line 272
    iget-wide v6, p2, Llg7;->a:J

    .line 273
    .line 274
    invoke-static {v6, v7}, Llg7;->e(J)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    move v11, p2

    .line 279
    goto :goto_6

    .line 280
    :cond_c
    move v11, v3

    .line 281
    :goto_6
    invoke-static {v4, v5}, Llg7;->f(J)I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    invoke-static {v4, v5}, Llg7;->e(J)I

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    invoke-virtual {v2}, Lqc3;->A()Landroid/view/inputmethod/InputMethodManager;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    iget-object p2, v2, Lqc3;->x:Ljava/lang/Object;

    .line 294
    .line 295
    move-object v7, p2

    .line 296
    check-cast v7, Landroid/view/View;

    .line 297
    .line 298
    invoke-virtual/range {v6 .. v11}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 299
    .line 300
    .line 301
    :cond_d
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :catchall_0
    move-exception v0

    .line 305
    move-object p0, v0

    .line 306
    monitor-exit v3

    .line 307
    throw p0

    .line 308
    :cond_e
    return-void
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
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object p0, p0, Log;->a:Lo44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxy0;->r:Lt37;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lgy6;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p0, Lip1;

    .line 16
    .line 17
    invoke-virtual {p0}, Lip1;->a()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
.end method

.method public final g(Lhf7;Lc93;Lh17;Lj71;)V
    .locals 7

    .line 1
    new-instance v0, Lb9;

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    move-object v2, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Lb9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Log;->j(Lb9;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public final h(Lly5;)V
    .locals 4

    .line 1
    iget-object p0, p0, Log;->c:Lv44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    iget v1, p1, Lly5;->a:F

    .line 8
    .line 9
    invoke-static {v1}, Ldh4;->C(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p1, Lly5;->b:F

    .line 14
    .line 15
    invoke-static {v2}, Ldh4;->C(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, p1, Lly5;->c:F

    .line 20
    .line 21
    invoke-static {v3}, Ldh4;->C(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget p1, p1, Lly5;->d:F

    .line 26
    .line 27
    invoke-static {p1}, Ldh4;->C(F)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lv44;->l:Landroid/graphics/Rect;

    .line 35
    .line 36
    iget-object p1, p0, Lv44;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lv44;->l:Landroid/graphics/Rect;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p0, p0, Lv44;->a:Landroid/view/View;

    .line 49
    .line 50
    new-instance v0, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
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
.end method

.method public final i()Lxp4;
    .locals 2

    .line 1
    iget-object v0, p0, Log;->d:Lpr6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-boolean v0, Le67;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_1
    sget-object v0, Lvc0;->y:Lvc0;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v0, v1}, Lqr6;->a(Lvc0;I)Lpr6;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Log;->d:Lpr6;

    .line 20
    .line 21
    return-object v0
.end method

.method public final j(Lb9;)V
    .locals 6

    .line 1
    iget-object v3, p0, Log;->a:Lo44;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lng;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lng;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 13
    .line 14
    .line 15
    iget-boolean p0, v3, Lll4;->J:Z

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v3}, Lll4;->J0()Lo81;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, Lju1;

    .line 25
    .line 26
    const/16 v1, 0x12

    .line 27
    .line 28
    invoke-direct {p1, v3, v0, v4, v1}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    sget-object v1, Lr81;->z:Lr81;

    .line 33
    .line 34
    invoke-static {p0, v4, v1, p1, v0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :goto_0
    iput-object v4, v2, Log;->b:Lh27;

    .line 39
    .line 40
    return-void
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
.end method

.method public final k(Lo44;)V
    .locals 3

    .line 1
    iget-object v0, p0, Log;->a:Lo44;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-nez v1, :cond_1

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Expected textInputModifierNode to be "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " but was "

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lbc3;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Log;->a:Lo44;

    .line 37
    .line 38
    return-void
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
.end method
