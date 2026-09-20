.class public final Lze1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldi2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lze1;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lze1;->x:Ljava/lang/Object;

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
.method public final a(Lfi2;Lf61;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lze1;->w:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    sget-object v6, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    sget-object v7, Lp81;->w:Lp81;

    .line 14
    .line 15
    iget-object v8, p0, Lze1;->x:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v8, Lwj2;

    .line 21
    .line 22
    new-instance p0, Lwv7;

    .line 23
    .line 24
    invoke-direct {p0, p1, v1}, Lwv7;-><init>(Lfi2;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v8, p0, p2}, Lwj2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-ne p0, v7, :cond_0

    .line 32
    .line 33
    move-object v6, p0

    .line 34
    :cond_0
    return-object v6

    .line 35
    :pswitch_0
    check-cast v8, [Ldi2;

    .line 36
    .line 37
    new-instance p0, Lxo3;

    .line 38
    .line 39
    const/16 v0, 0x11

    .line 40
    .line 41
    invoke-direct {p0, v0, v8}, Lxo3;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ldo1;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    const/4 v2, 0x5

    .line 48
    invoke-direct {v0, v1, v5, v2}, Ldo1;-><init>(ILf61;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1, p0, v0, v8}, Lmp7;->S(Lf61;Lfi2;Lsr2;Lhs2;[Ldi2;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v7, :cond_1

    .line 56
    .line 57
    move-object v6, p0

    .line 58
    :cond_1
    return-object v6

    .line 59
    :pswitch_1
    instance-of v0, p2, Lpz6;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    move-object v0, p2

    .line 64
    check-cast v0, Lpz6;

    .line 65
    .line 66
    iget v1, v0, Lpz6;->A:I

    .line 67
    .line 68
    and-int v9, v1, v3

    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    sub-int/2addr v1, v3

    .line 73
    iput v1, v0, Lpz6;->A:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v0, Lpz6;

    .line 77
    .line 78
    invoke-direct {v0, p0, p2}, Lpz6;-><init>(Lze1;Lf61;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iget-object p0, v0, Lpz6;->z:Ljava/lang/Object;

    .line 82
    .line 83
    iget p2, v0, Lpz6;->A:I

    .line 84
    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    if-ne p2, v4, :cond_3

    .line 88
    .line 89
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    check-cast v8, Lc6;

    .line 101
    .line 102
    new-instance p0, Lb6;

    .line 103
    .line 104
    const/16 p2, 0x15

    .line 105
    .line 106
    invoke-direct {p0, p1, p2}, Lb6;-><init>(Lfi2;I)V

    .line 107
    .line 108
    .line 109
    iput v4, v0, Lpz6;->A:I

    .line 110
    .line 111
    invoke-virtual {v8, p0, v0}, Lc6;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v7, :cond_5

    .line 116
    .line 117
    move-object v5, v7

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    :goto_1
    move-object v5, v6

    .line 120
    :goto_2
    return-object v5

    .line 121
    :pswitch_2
    instance-of v0, p2, Lzp6;

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    move-object v0, p2

    .line 126
    check-cast v0, Lzp6;

    .line 127
    .line 128
    iget v1, v0, Lzp6;->A:I

    .line 129
    .line 130
    and-int v9, v1, v3

    .line 131
    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    sub-int/2addr v1, v3

    .line 135
    iput v1, v0, Lzp6;->A:I

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    new-instance v0, Lzp6;

    .line 139
    .line 140
    invoke-direct {v0, p0, p2}, Lzp6;-><init>(Lze1;Lf61;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    iget-object p0, v0, Lzp6;->z:Ljava/lang/Object;

    .line 144
    .line 145
    iget p2, v0, Lzp6;->A:I

    .line 146
    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    if-ne p2, v4, :cond_7

    .line 150
    .line 151
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_8
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    check-cast v8, Lc6;

    .line 163
    .line 164
    new-instance p0, Lb6;

    .line 165
    .line 166
    const/16 p2, 0x13

    .line 167
    .line 168
    invoke-direct {p0, p1, p2}, Lb6;-><init>(Lfi2;I)V

    .line 169
    .line 170
    .line 171
    iput v4, v0, Lzp6;->A:I

    .line 172
    .line 173
    invoke-virtual {v8, p0, v0}, Lc6;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-ne p0, v7, :cond_9

    .line 178
    .line 179
    move-object v5, v7

    .line 180
    goto :goto_5

    .line 181
    :cond_9
    :goto_4
    move-object v5, v6

    .line 182
    :goto_5
    return-object v5

    .line 183
    :pswitch_3
    instance-of v0, p2, Lh1;

    .line 184
    .line 185
    if-eqz v0, :cond_a

    .line 186
    .line 187
    move-object v0, p2

    .line 188
    check-cast v0, Lh1;

    .line 189
    .line 190
    iget v1, v0, Lh1;->C:I

    .line 191
    .line 192
    and-int v9, v1, v3

    .line 193
    .line 194
    if-eqz v9, :cond_a

    .line 195
    .line 196
    sub-int/2addr v1, v3

    .line 197
    iput v1, v0, Lh1;->C:I

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_a
    new-instance v0, Lh1;

    .line 201
    .line 202
    invoke-direct {v0, p0, p2}, Lh1;-><init>(Lze1;Lf61;)V

    .line 203
    .line 204
    .line 205
    :goto_6
    iget-object p0, v0, Lh1;->A:Ljava/lang/Object;

    .line 206
    .line 207
    iget p2, v0, Lh1;->C:I

    .line 208
    .line 209
    if-eqz p2, :cond_c

    .line 210
    .line 211
    if-ne p2, v4, :cond_b

    .line 212
    .line 213
    iget-object p1, v0, Lh1;->z:Lvd6;

    .line 214
    .line 215
    :try_start_0
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :catchall_0
    move-exception p0

    .line 220
    goto :goto_b

    .line 221
    :cond_b
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_c
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    new-instance p0, Lvd6;

    .line 229
    .line 230
    iget-object p2, v0, Lh61;->x:Le81;

    .line 231
    .line 232
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-direct {p0, p1, p2}, Lvd6;-><init>(Lfi2;Le81;)V

    .line 236
    .line 237
    .line 238
    :try_start_1
    iput-object p0, v0, Lh1;->z:Lvd6;

    .line 239
    .line 240
    iput v4, v0, Lh1;->C:I

    .line 241
    .line 242
    check-cast v8, Lgs2;

    .line 243
    .line 244
    invoke-interface {v8, p0, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 248
    if-ne p1, v7, :cond_d

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_d
    move-object p1, v6

    .line 252
    :goto_7
    if-ne p1, v7, :cond_e

    .line 253
    .line 254
    move-object v5, v7

    .line 255
    goto :goto_9

    .line 256
    :cond_e
    move-object p1, p0

    .line 257
    :goto_8
    invoke-virtual {p1}, Lh61;->t()V

    .line 258
    .line 259
    .line 260
    move-object v5, v6

    .line 261
    :goto_9
    return-object v5

    .line 262
    :goto_a
    move-object v11, p1

    .line 263
    move-object p1, p0

    .line 264
    move-object p0, v11

    .line 265
    goto :goto_b

    .line 266
    :catchall_1
    move-exception p1

    .line 267
    goto :goto_a

    .line 268
    :goto_b
    invoke-virtual {p1}, Lh61;->t()V

    .line 269
    .line 270
    .line 271
    throw p0

    .line 272
    :pswitch_4
    instance-of v0, p2, Lqk3;

    .line 273
    .line 274
    if-eqz v0, :cond_f

    .line 275
    .line 276
    move-object v0, p2

    .line 277
    check-cast v0, Lqk3;

    .line 278
    .line 279
    iget v9, v0, Lqk3;->A:I

    .line 280
    .line 281
    and-int v10, v9, v3

    .line 282
    .line 283
    if-eqz v10, :cond_f

    .line 284
    .line 285
    sub-int/2addr v9, v3

    .line 286
    iput v9, v0, Lqk3;->A:I

    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_f
    new-instance v0, Lqk3;

    .line 290
    .line 291
    invoke-direct {v0, p0, p2}, Lqk3;-><init>(Lze1;Lf61;)V

    .line 292
    .line 293
    .line 294
    :goto_c
    iget-object p0, v0, Lqk3;->z:Ljava/lang/Object;

    .line 295
    .line 296
    iget p2, v0, Lqk3;->A:I

    .line 297
    .line 298
    if-eqz p2, :cond_11

    .line 299
    .line 300
    if-ne p2, v4, :cond_10

    .line 301
    .line 302
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_d

    .line 306
    :cond_10
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_e

    .line 310
    :cond_11
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    check-cast v8, Lxi0;

    .line 314
    .line 315
    new-instance p0, Lb6;

    .line 316
    .line 317
    invoke-direct {p0, p1, v1}, Lb6;-><init>(Lfi2;I)V

    .line 318
    .line 319
    .line 320
    iput v4, v0, Lqk3;->A:I

    .line 321
    .line 322
    invoke-virtual {v8, p0, v0}, Lgn0;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    if-ne p0, v7, :cond_12

    .line 327
    .line 328
    move-object v5, v7

    .line 329
    goto :goto_e

    .line 330
    :cond_12
    :goto_d
    move-object v5, v6

    .line 331
    :goto_e
    return-object v5

    .line 332
    :pswitch_5
    instance-of v0, p2, Lki2;

    .line 333
    .line 334
    if-eqz v0, :cond_13

    .line 335
    .line 336
    move-object v0, p2

    .line 337
    check-cast v0, Lki2;

    .line 338
    .line 339
    iget v1, v0, Lki2;->A:I

    .line 340
    .line 341
    and-int v9, v1, v3

    .line 342
    .line 343
    if-eqz v9, :cond_13

    .line 344
    .line 345
    sub-int/2addr v1, v3

    .line 346
    iput v1, v0, Lki2;->A:I

    .line 347
    .line 348
    goto :goto_f

    .line 349
    :cond_13
    new-instance v0, Lki2;

    .line 350
    .line 351
    invoke-direct {v0, p0, p2}, Lki2;-><init>(Lze1;Lf61;)V

    .line 352
    .line 353
    .line 354
    :goto_f
    iget-object p0, v0, Lki2;->z:Ljava/lang/Object;

    .line 355
    .line 356
    iget p2, v0, Lki2;->A:I

    .line 357
    .line 358
    if-eqz p2, :cond_15

    .line 359
    .line 360
    if-ne p2, v4, :cond_14

    .line 361
    .line 362
    iget p1, v0, Lki2;->F:I

    .line 363
    .line 364
    iget p2, v0, Lki2;->E:I

    .line 365
    .line 366
    iget-object v1, v0, Lki2;->D:Ljava/util/Iterator;

    .line 367
    .line 368
    iget-object v2, v0, Lki2;->C:Lfi2;

    .line 369
    .line 370
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    move p0, p2

    .line 374
    move p2, p1

    .line 375
    move-object p1, v2

    .line 376
    goto :goto_10

    .line 377
    :cond_14
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    goto :goto_11

    .line 381
    :cond_15
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    check-cast v8, Ljava/lang/Iterable;

    .line 385
    .line 386
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    const/4 p2, 0x0

    .line 391
    move-object v1, p0

    .line 392
    move p0, p2

    .line 393
    :cond_16
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_17

    .line 398
    .line 399
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    iput-object p1, v0, Lki2;->C:Lfi2;

    .line 404
    .line 405
    iput-object v1, v0, Lki2;->D:Ljava/util/Iterator;

    .line 406
    .line 407
    iput p0, v0, Lki2;->E:I

    .line 408
    .line 409
    iput p2, v0, Lki2;->F:I

    .line 410
    .line 411
    iput v4, v0, Lki2;->A:I

    .line 412
    .line 413
    invoke-interface {p1, v2, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    if-ne v2, v7, :cond_16

    .line 418
    .line 419
    move-object v5, v7

    .line 420
    goto :goto_11

    .line 421
    :cond_17
    move-object v5, v6

    .line 422
    :goto_11
    return-object v5

    .line 423
    :pswitch_6
    check-cast v8, Lqi2;

    .line 424
    .line 425
    new-instance p0, Lb6;

    .line 426
    .line 427
    const/4 v0, 0x7

    .line 428
    invoke-direct {p0, p1, v0}, Lb6;-><init>(Lfi2;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v8, p0, p2}, Lqi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    if-ne p0, v7, :cond_18

    .line 436
    .line 437
    move-object v6, p0

    .line 438
    :cond_18
    return-object v6

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
