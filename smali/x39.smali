.class public final Lx39;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lv49;


# direct methods
.method public constructor <init>(Lv49;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lx39;->w:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lx39;->x:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lx39;->y:Lv49;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lx39;->x:J

    .line 21
    .line 22
    iput-object p1, p0, Lx39;->y:Lv49;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
    .locals 9

    .line 1
    iget v0, p0, Lx39;->w:I

    .line 2
    .line 3
    iget-wide v1, p0, Lx39;->x:J

    .line 4
    .line 5
    iget-object p0, p0, Lx39;->y:Lv49;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ly19;

    .line 19
    .line 20
    iget-object v3, v0, Ly19;->B:Lpz8;

    .line 21
    .line 22
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, v3, Lpz8;->I:Lmz8;

    .line 26
    .line 27
    const-string v4, "Resetting analytics data (FE)"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v0, Ly19;->D:Lo79;

    .line 33
    .line 34
    invoke-static {v3}, Ly19;->f(Lfy8;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcx8;->b1()V

    .line 38
    .line 39
    .line 40
    iget-object v4, v3, Lo79;->B:Lr38;

    .line 41
    .line 42
    iget-object v5, v4, Lr38;->y:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lh79;

    .line 45
    .line 46
    invoke-virtual {v5}, Lxq8;->c()V

    .line 47
    .line 48
    .line 49
    iget-object v5, v4, Lr38;->z:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Lo79;

    .line 52
    .line 53
    iget-object v5, v5, Lin8;->w:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ly19;

    .line 56
    .line 57
    iget-object v5, v5, Ly19;->G:Lxb4;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    iput-wide v5, v4, Lr38;->w:J

    .line 67
    .line 68
    iput-wide v5, v4, Lr38;->x:J

    .line 69
    .line 70
    invoke-virtual {v0}, Ly19;->l()Lvy8;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Lvy8;->h1()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ly19;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    xor-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    iget-object v5, v0, Ly19;->A:Lq09;

    .line 84
    .line 85
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 86
    .line 87
    .line 88
    iget-object v6, v5, Lq09;->B:Ll09;

    .line 89
    .line 90
    invoke-virtual {v6, v1, v2}, Ll09;->b(J)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v5, Lin8;->w:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ly19;

    .line 96
    .line 97
    iget-object v2, v1, Ly19;->A:Lq09;

    .line 98
    .line 99
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 100
    .line 101
    .line 102
    iget-object v2, v2, Lq09;->R:Ll90;

    .line 103
    .line 104
    invoke-virtual {v2}, Ll90;->j()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const/4 v6, 0x0

    .line 113
    if-nez v2, :cond_0

    .line 114
    .line 115
    iget-object v2, v5, Lq09;->R:Ll90;

    .line 116
    .line 117
    invoke-virtual {v2, v6}, Ll90;->k(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_0
    iget-object v2, v5, Lq09;->L:Ll09;

    .line 121
    .line 122
    const-wide/16 v7, 0x0

    .line 123
    .line 124
    invoke-virtual {v2, v7, v8}, Ll09;->b(J)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v5, Lq09;->M:Ll09;

    .line 128
    .line 129
    invoke-virtual {v2, v7, v8}, Ll09;->b(J)V

    .line 130
    .line 131
    .line 132
    iget-object v1, v1, Ly19;->z:Ltp8;

    .line 133
    .line 134
    invoke-virtual {v1}, Ltp8;->q1()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_1

    .line 139
    .line 140
    invoke-virtual {v5, v4}, Lq09;->k1(Z)V

    .line 141
    .line 142
    .line 143
    :cond_1
    iget-object v1, v5, Lq09;->S:Ll90;

    .line 144
    .line 145
    invoke-virtual {v1, v6}, Ll90;->k(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v5, Lq09;->T:Ll09;

    .line 149
    .line 150
    invoke-virtual {v1, v7, v8}, Ll09;->b(J)V

    .line 151
    .line 152
    .line 153
    iget-object v1, v5, Lq09;->U:Lno7;

    .line 154
    .line 155
    invoke-virtual {v1, v6}, Lno7;->i(Landroid/os/Bundle;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ly19;->j()Lr69;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Lfy8;->d1()V

    .line 166
    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-virtual {v1, v2}, Lr69;->s1(Z)Lz99;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v1}, Lr69;->o1()V

    .line 174
    .line 175
    .line 176
    iget-object v6, v1, Lin8;->w:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v6, Ly19;

    .line 179
    .line 180
    invoke-virtual {v6}, Ly19;->i()Lcz8;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Lcz8;->g1()V

    .line 185
    .line 186
    .line 187
    new-instance v6, Lv59;

    .line 188
    .line 189
    invoke-direct {v6, v1, v5, v2}, Lv59;-><init>(Lr69;Lz99;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v6}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3}, Ly19;->f(Lfy8;)V

    .line 196
    .line 197
    .line 198
    iget-object v1, v3, Lo79;->A:Luy5;

    .line 199
    .line 200
    invoke-virtual {v1}, Luy5;->k()V

    .line 201
    .line 202
    .line 203
    iput-boolean v4, p0, Lv49;->N:Z

    .line 204
    .line 205
    invoke-virtual {v0}, Ly19;->j()Lr69;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lr69;->g1(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_0
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Ly19;

    .line 221
    .line 222
    iget-object v0, p0, Ly19;->A:Lq09;

    .line 223
    .line 224
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, v0, Lq09;->G:Ll09;

    .line 228
    .line 229
    invoke-virtual {v0, v1, v2}, Ll09;->b(J)V

    .line 230
    .line 231
    .line 232
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 233
    .line 234
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 235
    .line 236
    .line 237
    iget-object p0, p0, Lpz8;->I:Lmz8;

    .line 238
    .line 239
    const-string v0, "Session timeout duration set"

    .line 240
    .line 241
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {p0, v0, v1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
