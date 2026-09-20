.class public final Lvc;
.super Lty1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public f0:Lbd;

.field public g0:Ljava/lang/Boolean;

.field public h0:Leh2;

.field public i0:Ltp1;


# direct methods
.method public static final q1(Lvc;FLh61;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lsc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lsc;

    .line 7
    .line 8
    iget v1, v0, Lsc;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsc;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsc;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lsc;-><init>(Lvc;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lsc;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsc;->C:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    if-eq v1, v3, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lsc;->z:Le06;

    .line 39
    .line 40
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Lvc;->f0:Lbd;

    .line 59
    .line 60
    invoke-virtual {p2}, Lbd;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    sget-object v1, Lp81;->w:Lp81;

    .line 65
    .line 66
    if-eqz p2, :cond_9

    .line 67
    .line 68
    iget-object p0, p0, Lvc;->f0:Lbd;

    .line 69
    .line 70
    iput v3, v0, Lsc;->C:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lbd;->c()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-nez p2, :cond_4

    .line 77
    .line 78
    const-string p2, "AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information."

    .line 79
    .line 80
    invoke-static {p2}, Lbc3;->a(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget-object p2, p0, Lbd;->g:Led5;

    .line 84
    .line 85
    invoke-virtual {p2}, Led5;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0}, Lbd;->e()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    iget-object v5, p0, Lbd;->b:Lf81;

    .line 98
    .line 99
    if-eqz v5, :cond_8

    .line 100
    .line 101
    iget-object v6, p0, Lbd;->c:Lzh;

    .line 102
    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    invoke-static {v2, v3, p1, v5, v6}, Lrc;->b(Lll1;FFLvr2;Lsr2;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v3, p0, Lbd;->a:Lvr2;

    .line 110
    .line 111
    invoke-interface {v3, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    invoke-static {p0, v2, p1, v0}, Lrc;->e(Lbd;Ljava/lang/Object;FLsc;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    goto :goto_1

    .line 128
    :cond_5
    invoke-static {p0, p2, p1, v0}, Lrc;->e(Lbd;Ljava/lang/Object;FLsc;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :goto_1
    if-ne p0, v1, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    return-object p0

    .line 136
    :cond_7
    const-string p0, "velocityThreshold"

    .line 137
    .line 138
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v4

    .line 142
    :cond_8
    const-string p0, "positionalThreshold"

    .line 143
    .line 144
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v4

    .line 148
    :cond_9
    new-instance p2, Le06;

    .line 149
    .line 150
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    iput p1, p2, Le06;->w:F

    .line 154
    .line 155
    iget-object v3, p0, Lvc;->f0:Lbd;

    .line 156
    .line 157
    new-instance v5, Luc;

    .line 158
    .line 159
    invoke-direct {v5, p0, p2, p1, v4}, Luc;-><init>(Lvc;Le06;FLf61;)V

    .line 160
    .line 161
    .line 162
    iput-object p2, v0, Lsc;->z:Le06;

    .line 163
    .line 164
    iput v2, v0, Lsc;->C:I

    .line 165
    .line 166
    iget-object p0, v3, Lbd;->f:Lmq4;

    .line 167
    .line 168
    new-instance p1, Lxc;

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    invoke-direct {p1, v3, v5, v4, v2}, Lxc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v2, Lp6;

    .line 178
    .line 179
    sget-object v3, Lhq4;->w:Lhq4;

    .line 180
    .line 181
    invoke-direct {v2, v3, p0, p1, v4}, Lp6;-><init>(Lhq4;Lmq4;Lvr2;Lf61;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2, v0}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    if-ne p0, v1, :cond_a

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_a
    sget-object p0, Lvs7;->a:Lvs7;

    .line 192
    .line 193
    :goto_2
    if-ne p0, v1, :cond_b

    .line 194
    .line 195
    :goto_3
    return-object v1

    .line 196
    :cond_b
    move-object p0, p2

    .line 197
    :goto_4
    iget p0, p0, Le06;->w:F

    .line 198
    .line 199
    new-instance p1, Ljava/lang/Float;

    .line 200
    .line 201
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 202
    .line 203
    .line 204
    return-object p1
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
.end method


# virtual methods
.method public final N0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvc;->s1()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final c1(Lsy1;Lsy1;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lvc;->f0:Lbd;

    .line 2
    .line 3
    new-instance v1, Lea;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, p0, v2}, Lea;-><init>(Lsy1;Lvc;Lf61;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, v0, Lbd;->f:Lmq4;

    .line 10
    .line 11
    new-instance p1, Lxc;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {p1, v0, v1, v2, v3}, Lxc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lp6;

    .line 21
    .line 22
    sget-object v1, Lhq4;->w:Lhq4;

    .line 23
    .line 24
    invoke-direct {v0, v1, p0, p1, v2}, Lp6;-><init>(Lhq4;Lmq4;Lvr2;Lf61;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p2}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lvs7;->a:Lvs7;

    .line 32
    .line 33
    sget-object p2, Lp81;->w:Lp81;

    .line 34
    .line 35
    if-ne p0, p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p0, p1

    .line 39
    :goto_0
    if-ne p0, p2, :cond_1

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    return-object p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lty1;->I()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lll4;->J:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Luy3;->T:Ltp1;

    .line 13
    .line 14
    iget-object v1, p0, Lvc;->i0:Ltp1;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    :cond_0
    iput-object v0, p0, Lvc;->i0:Ltp1;

    .line 25
    .line 26
    invoke-virtual {p0}, Lvc;->s1()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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
.end method

.method public final h1(J)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final i1(Ldy1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lll4;->J:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lll4;->J0()Lo81;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ln0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v1, p0, p1, v2, v3}, Ln0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2, v2, v1, v3}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final n1()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvc;->f0:Lbd;

    .line 2
    .line 3
    iget-object p0, p0, Lbd;->l:Led5;

    .line 4
    .line 5
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final r1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvc;->g0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Luy3;->U:Ley3;

    .line 10
    .line 11
    sget-object v1, Ley3;->x:Ley3;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lty1;->M:Lz75;

    .line 16
    .line 17
    sget-object v0, Lz75;->x:Lz75;

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
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
.end method

.method public final s1()V
    .locals 6

    .line 1
    sget-object v0, Lic;->a:Ljo7;

    .line 2
    .line 3
    sget-object v1, Lic;->b:Lj5;

    .line 4
    .line 5
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v2, v2, Luy3;->T:Ltp1;

    .line 10
    .line 11
    iput-object v2, p0, Lvc;->i0:Ltp1;

    .line 12
    .line 13
    iget-object v3, p0, Lvc;->f0:Lbd;

    .line 14
    .line 15
    new-instance v4, Llc;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v4, v2, v5}, Llc;-><init>(Ltp1;I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lwr0;

    .line 22
    .line 23
    const/4 v5, 0x4

    .line 24
    invoke-direct {v2, v3, v1, v4, v5}, Lwr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lax6;

    .line 28
    .line 29
    sget-object v3, Lrc;->b:Ltj1;

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lax6;-><init>(Lfx6;Ltj1;Lhl;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lvc;->h0:Leh2;

    .line 35
    .line 36
    return-void
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
.end method
