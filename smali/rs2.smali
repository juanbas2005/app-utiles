.class public final Lrs2;
.super Lk0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic y:Lss2;


# direct methods
.method public constructor <init>(Lss2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    iget-object p1, p1, Lss2;->A:Lkb4;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lk0;-><init>(Lkb4;)V

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
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 10

    .line 1
    iget-object p0, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    iget v0, p0, Lss2;->D:I

    .line 4
    .line 5
    iget-object v1, p0, Lss2;->C:Lht2;

    .line 6
    .line 7
    sget-object v2, Ldt2;->d:Ldt2;

    .line 8
    .line 9
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sget-object v0, Lss2;->H:Lgq0;

    .line 17
    .line 18
    invoke-static {v0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v3, Let2;->d:Let2;

    .line 24
    .line 25
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    sget-object v1, Lss2;->I:Lgq0;

    .line 32
    .line 33
    new-instance v3, Lgq0;

    .line 34
    .line 35
    sget-object v5, Ln27;->k:Lup2;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Lht2;->a(I)Luq4;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v3, v5, v0}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {v1, v3}, [Lgq0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object v2, Lgt2;->d:Lgt2;

    .line 54
    .line 55
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    sget-object v0, Lss2;->H:Lgq0;

    .line 62
    .line 63
    invoke-static {v0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    sget-object v3, Lft2;->d:Lft2;

    .line 69
    .line 70
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    sget-object v1, Lss2;->I:Lgq0;

    .line 77
    .line 78
    new-instance v3, Lgq0;

    .line 79
    .line 80
    sget-object v5, Ln27;->f:Lup2;

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Lht2;->a(I)Luq4;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {v3, v5, v0}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 87
    .line 88
    .line 89
    filled-new-array {v1, v3}, [Lgq0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :goto_0
    iget-object v1, p0, Lss2;->B:Lx95;

    .line 98
    .line 99
    check-cast v1, Ly95;

    .line 100
    .line 101
    invoke-virtual {v1}, Ly95;->f1()Lsl4;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Ljava/util/ArrayList;

    .line 106
    .line 107
    const/16 v3, 0xa

    .line 108
    .line 109
    invoke-static {v0, v3}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lgq0;

    .line 131
    .line 132
    invoke-static {v1, v5}, Lr16;->y(Lsl4;Lgq0;)Lql4;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-eqz v6, :cond_4

    .line 137
    .line 138
    iget-object v5, p0, Lss2;->G:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v6}, Lvq0;->n()Lwo7;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-interface {v7}, Lwo7;->getParameters()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    invoke-static {v7, v5}, Ldt0;->W0(ILjava/util/List;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    new-instance v7, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {v5, v3}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-eqz v8, :cond_3

    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    check-cast v8, Lqp7;

    .line 180
    .line 181
    new-instance v9, Lp27;

    .line 182
    .line 183
    invoke-interface {v8}, Lvq0;->g0()Lfu6;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-direct {v9, v8}, Lp27;-><init>(Lvw3;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_3
    sget-object v5, Lro7;->x:Lkg5;

    .line 195
    .line 196
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    sget-object v5, Lro7;->y:Lro7;

    .line 200
    .line 201
    invoke-static {v5, v6, v7}, Lkl8;->H(Lro7;Lql4;Ljava/util/List;)Lfu6;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    const-string p0, "Built-in class "

    .line 210
    .line 211
    const-string v0, " not found"

    .line 212
    .line 213
    invoke-static {v5, v0, p0}, Lku4;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object v4

    .line 217
    :cond_5
    invoke-static {v2}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0

    .line 222
    :cond_6
    sget p0, Ls9;->a:I

    .line 223
    .line 224
    const-string p0, "should not be called"

    .line 225
    .line 226
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v4
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

.method public final c()Lpe2;
    .locals 0

    .line 1
    sget-object p0, Lpe2;->O:Lpe2;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    iget-object p0, p0, Lss2;->G:Ljava/util/List;

    .line 4
    .line 5
    return-object p0
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

.method public final j()Lql4;
    .locals 0

    .line 1
    iget-object p0, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lss2;->toString()Ljava/lang/String;

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

.method public final u()Lvq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lrs2;->y:Lss2;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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

.method public final y()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
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
