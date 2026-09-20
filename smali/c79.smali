.class public final Lc79;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lo79;


# direct methods
.method public constructor <init>(Lo79;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lc79;->w:I

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
    iput-wide p2, p0, Lc79;->x:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lc79;->y:Lo79;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lc79;->x:J

    .line 21
    .line 22
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lc79;->y:Lo79;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
    .locals 10

    .line 1
    iget v0, p0, Lc79;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lc79;->y:Lo79;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lo79;->g1()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lin8;->w:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ly19;

    .line 17
    .line 18
    iget-object v2, v0, Ly19;->B:Lpz8;

    .line 19
    .line 20
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v2, Lpz8;->J:Lmz8;

    .line 24
    .line 25
    const-string v3, "Activity paused, time"

    .line 26
    .line 27
    iget-wide v8, p0, Lc79;->x:J

    .line 28
    .line 29
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v2, v3, p0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v1, Lo79;->C:Lk68;

    .line 37
    .line 38
    new-instance v4, Lf79;

    .line 39
    .line 40
    iget-object p0, v5, Lk68;->y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lo79;

    .line 43
    .line 44
    iget-object v2, p0, Lin8;->w:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ly19;

    .line 47
    .line 48
    iget-object v2, v2, Ly19;->G:Lxb4;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    invoke-direct/range {v4 .. v9}, Lf79;-><init>(Lk68;JJ)V

    .line 58
    .line 59
    .line 60
    iput-object v4, v5, Lk68;->x:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p0, p0, Lo79;->y:Lph8;

    .line 63
    .line 64
    const-wide/16 v2, 0x7d0

    .line 65
    .line 66
    invoke-virtual {p0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    iget-object p0, v0, Ly19;->z:Ltp8;

    .line 70
    .line 71
    invoke-virtual {p0}, Ltp8;->r1()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    iget-object p0, v1, Lo79;->B:Lr38;

    .line 78
    .line 79
    iget-object p0, p0, Lr38;->y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lh79;

    .line 82
    .line 83
    invoke-virtual {p0}, Lxq8;->c()V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void

    .line 87
    :pswitch_0
    iget-object v0, v1, Lo79;->B:Lr38;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lo79;->g1()V

    .line 93
    .line 94
    .line 95
    iget-object v2, v1, Lin8;->w:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Ly19;

    .line 98
    .line 99
    iget-object v3, v2, Ly19;->B:Lpz8;

    .line 100
    .line 101
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v3, Lpz8;->J:Lmz8;

    .line 105
    .line 106
    const-string v4, "Activity resumed, time"

    .line 107
    .line 108
    iget-wide v5, p0, Lc79;->x:J

    .line 109
    .line 110
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v3, v4, p0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, v2, Ly19;->z:Ltp8;

    .line 118
    .line 119
    sget-object v3, Lby8;->S0:Lay8;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-virtual {p0, v4, v3}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_2

    .line 127
    .line 128
    invoke-virtual {p0}, Ltp8;->r1()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_1

    .line 133
    .line 134
    iget-boolean p0, v1, Lo79;->z:Z

    .line 135
    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    :cond_1
    iget-object p0, v0, Lr38;->z:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Lo79;

    .line 141
    .line 142
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 143
    .line 144
    .line 145
    iget-object p0, v0, Lr38;->y:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Lh79;

    .line 148
    .line 149
    invoke-virtual {p0}, Lxq8;->c()V

    .line 150
    .line 151
    .line 152
    iput-wide v5, v0, Lr38;->w:J

    .line 153
    .line 154
    iput-wide v5, v0, Lr38;->x:J

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    invoke-virtual {p0}, Ltp8;->r1()Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_3

    .line 162
    .line 163
    iget-object p0, v2, Ly19;->A:Lq09;

    .line 164
    .line 165
    invoke-static {p0}, Ly19;->e(Lin8;)V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Lq09;->O:Lh09;

    .line 169
    .line 170
    invoke-virtual {p0}, Lh09;->a()Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-eqz p0, :cond_4

    .line 175
    .line 176
    :cond_3
    iget-object p0, v0, Lr38;->z:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Lo79;

    .line 179
    .line 180
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 181
    .line 182
    .line 183
    iget-object p0, v0, Lr38;->y:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Lh79;

    .line 186
    .line 187
    invoke-virtual {p0}, Lxq8;->c()V

    .line 188
    .line 189
    .line 190
    iput-wide v5, v0, Lr38;->w:J

    .line 191
    .line 192
    iput-wide v5, v0, Lr38;->x:J

    .line 193
    .line 194
    :cond_4
    :goto_0
    iget-object p0, v1, Lo79;->C:Lk68;

    .line 195
    .line 196
    iget-object v0, p0, Lk68;->y:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lo79;

    .line 199
    .line 200
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, Lk68;->x:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p0, Lf79;

    .line 206
    .line 207
    if-eqz p0, :cond_5

    .line 208
    .line 209
    iget-object v2, v0, Lo79;->y:Lph8;

    .line 210
    .line 211
    invoke-virtual {v2, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    iget-object p0, v0, Lin8;->w:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, Ly19;

    .line 217
    .line 218
    iget-object p0, p0, Ly19;->A:Lq09;

    .line 219
    .line 220
    invoke-static {p0}, Ly19;->e(Lin8;)V

    .line 221
    .line 222
    .line 223
    iget-object p0, p0, Lq09;->O:Lh09;

    .line 224
    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-virtual {p0, v2}, Lh09;->b(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 230
    .line 231
    .line 232
    iput-boolean v2, v0, Lo79;->z:Z

    .line 233
    .line 234
    iget-object p0, v1, Lo79;->A:Luy5;

    .line 235
    .line 236
    iget-object v0, p0, Luy5;->x:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lo79;

    .line 239
    .line 240
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 241
    .line 242
    .line 243
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Ly19;

    .line 246
    .line 247
    invoke-virtual {v0}, Ly19;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    iget-object v2, v0, Ly19;->G:Lxb4;

    .line 252
    .line 253
    if-nez v1, :cond_6

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    iget-object v0, v0, Ly19;->z:Ltp8;

    .line 264
    .line 265
    sget-object v3, Lby8;->e1:Lay8;

    .line 266
    .line 267
    invoke-virtual {v0, v4, v3}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_7

    .line 272
    .line 273
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    goto :goto_1

    .line 278
    :cond_7
    const-wide/16 v3, 0x0

    .line 279
    .line 280
    :goto_1
    invoke-virtual {p0, v1, v2, v3, v4}, Luy5;->l(JJ)V

    .line 281
    .line 282
    .line 283
    :goto_2
    return-void

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
