.class public final synthetic Lqm1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgx4;


# direct methods
.method public synthetic constructor <init>(Lgx4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqm1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lqm1;->x:Lgx4;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lqm1;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lqm1;->x:Lgx4;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lgx4;->g:Lix4;

    .line 14
    .line 15
    check-cast p1, Lyt2;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v5, p2, 0x3

    .line 24
    .line 25
    if-eq v5, v3, :cond_0

    .line 26
    .line 27
    move v3, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v3, v2

    .line 30
    :goto_0
    and-int/2addr p2, v4

    .line 31
    invoke-virtual {p1, p2, v3}, Lyt2;->V(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_6

    .line 36
    .line 37
    iget-object p2, v0, Lix4;->b:Loq1;

    .line 38
    .line 39
    invoke-virtual {p2}, Loq1;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Ljx4;

    .line 44
    .line 45
    sget-object v3, Ljx4;->x:Ljx4;

    .line 46
    .line 47
    if-ne p2, v3, :cond_1

    .line 48
    .line 49
    iget-object p2, v0, Lix4;->a:Luj;

    .line 50
    .line 51
    invoke-virtual {p2}, Luj;->e()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    const p2, 0x3ac59915

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 64
    .line 65
    .line 66
    sget-object p2, Lfx4;->a:Lfg2;

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_1
    const p2, 0x3ac7bbd2

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, Lgx4;->c:Ljava/lang/String;

    .line 77
    .line 78
    const-string v0, "NavigationBar"

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    const p2, 0x12699c73

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 90
    .line 91
    .line 92
    sget-object p2, Lib8;->w:Ljava/util/WeakHashMap;

    .line 93
    .line 94
    invoke-static {p1}, Ln63;->h(Lyt2;)Lib8;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget-object p2, p2, Lib8;->g:Lnj;

    .line 99
    .line 100
    invoke-static {p1}, Ln63;->h(Lyt2;)Lib8;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v0, v0, Lib8;->b:Lnj;

    .line 105
    .line 106
    new-instance v3, Lss7;

    .line 107
    .line 108
    invoke-direct {v3, p2, v0}, Lss7;-><init>(Laa8;Laa8;)V

    .line 109
    .line 110
    .line 111
    const/16 p2, 0xf

    .line 112
    .line 113
    const/16 v0, 0x20

    .line 114
    .line 115
    or-int/2addr p2, v0

    .line 116
    new-instance v5, Le64;

    .line 117
    .line 118
    invoke-direct {v5, v3, p2}, Le64;-><init>(Laa8;I)V

    .line 119
    .line 120
    .line 121
    new-instance p2, Le64;

    .line 122
    .line 123
    invoke-direct {p2, v5, v0}, Le64;-><init>(Laa8;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    const-string v0, "NavigationRail"

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/16 v3, 0x9

    .line 137
    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    const p2, 0x1269bdd2

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 144
    .line 145
    .line 146
    sget-object p2, Lib8;->w:Ljava/util/WeakHashMap;

    .line 147
    .line 148
    invoke-static {p1}, Ln63;->h(Lyt2;)Lib8;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p2, p2, Lib8;->g:Lnj;

    .line 153
    .line 154
    invoke-static {p1}, Ln63;->h(Lyt2;)Lib8;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v0, v0, Lib8;->b:Lnj;

    .line 159
    .line 160
    new-instance v5, Lss7;

    .line 161
    .line 162
    invoke-direct {v5, p2, v0}, Lss7;-><init>(Laa8;Laa8;)V

    .line 163
    .line 164
    .line 165
    const/16 p2, 0x30

    .line 166
    .line 167
    or-int/2addr p2, v3

    .line 168
    new-instance v0, Le64;

    .line 169
    .line 170
    invoke-direct {v0, v5, p2}, Le64;-><init>(Laa8;I)V

    .line 171
    .line 172
    .line 173
    new-instance p2, Le64;

    .line 174
    .line 175
    invoke-direct {p2, v0, v3}, Le64;-><init>(Laa8;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_3
    const-string v0, "NavigationDrawer"

    .line 183
    .line 184
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_4

    .line 189
    .line 190
    const p2, 0x1269ddfc

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 194
    .line 195
    .line 196
    invoke-static {p1}, Ltz1;->a(Lyt2;)Le64;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    new-instance v0, Le64;

    .line 201
    .line 202
    invoke-direct {v0, p2, v3}, Le64;-><init>(Laa8;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 206
    .line 207
    .line 208
    move-object p2, v0

    .line 209
    goto :goto_1

    .line 210
    :cond_4
    const p2, 0x1269e72d

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2}, Lyt2;->e0(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 217
    .line 218
    .line 219
    sget-object p2, Lfx4;->a:Lfg2;

    .line 220
    .line 221
    :goto_1
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 222
    .line 223
    .line 224
    :goto_2
    invoke-static {p2}, Lx91;->r(Laa8;)Lml4;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    sget-object v0, Lxb4;->y:Li80;

    .line 229
    .line 230
    invoke-static {v0, v2}, Lmb0;->d(Ljb;Z)Llh4;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-wide v5, p1, Lyt2;->T:J

    .line 235
    .line 236
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    invoke-virtual {p1}, Lyt2;->m()Lvf5;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-static {p1, p2}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    sget-object v6, Lux0;->d:Ltx0;

    .line 249
    .line 250
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    sget-object v6, Ltx0;->b:Lvy0;

    .line 254
    .line 255
    invoke-virtual {p1}, Lyt2;->i0()V

    .line 256
    .line 257
    .line 258
    iget-boolean v7, p1, Lyt2;->S:Z

    .line 259
    .line 260
    if-eqz v7, :cond_5

    .line 261
    .line 262
    invoke-virtual {p1, v6}, Lyt2;->l(Lsr2;)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_5
    invoke-virtual {p1}, Lyt2;->r0()V

    .line 267
    .line 268
    .line 269
    :goto_3
    sget-object v6, Ltx0;->f:Lck;

    .line 270
    .line 271
    invoke-static {v6, p1, v0}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Ltx0;->e:Lck;

    .line 275
    .line 276
    invoke-static {v0, p1, v5}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    sget-object v3, Ltx0;->g:Lck;

    .line 284
    .line 285
    invoke-static {v3, p1, v0}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Ltx0;->h:Lce;

    .line 289
    .line 290
    invoke-static {p1, v0}, Lg75;->O(Lyt2;Lvr2;)V

    .line 291
    .line 292
    .line 293
    sget-object v0, Ltx0;->d:Lck;

    .line 294
    .line 295
    invoke-static {v0, p1, p2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object p0, p0, Lgx4;->h:Lfw0;

    .line 299
    .line 300
    invoke-static {v2, p0, p1, v4}, Lf21;->r(ILfw0;Lyt2;Z)V

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_6
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 305
    .line 306
    .line 307
    :goto_4
    return-object v1

    .line 308
    :pswitch_0
    move-object v9, p1

    .line 309
    check-cast v9, Lyt2;

    .line 310
    .line 311
    check-cast p2, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    and-int/lit8 p2, p1, 0x3

    .line 318
    .line 319
    if-eq p2, v3, :cond_7

    .line 320
    .line 321
    move v2, v4

    .line 322
    :cond_7
    and-int/2addr p1, v4

    .line 323
    invoke-virtual {v9, p1, v2}, Lyt2;->V(IZ)Z

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    if-eqz p1, :cond_8

    .line 328
    .line 329
    iget-object v6, p0, Lgx4;->c:Ljava/lang/String;

    .line 330
    .line 331
    iget-object v7, p0, Lgx4;->d:Lxw4;

    .line 332
    .line 333
    iget-object v8, p0, Lgx4;->a:Lvr2;

    .line 334
    .line 335
    const/4 v10, 0x0

    .line 336
    const/4 v5, 0x0

    .line 337
    invoke-static/range {v5 .. v10}, Lfx4;->c(Lml4;Ljava/lang/String;Lxw4;Lvr2;Lyt2;I)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_8
    invoke-virtual {v9}, Lyt2;->Y()V

    .line 342
    .line 343
    .line 344
    :goto_5
    return-object v1

    .line 345
    :pswitch_1
    move-object v6, p1

    .line 346
    check-cast v6, Lyt2;

    .line 347
    .line 348
    check-cast p2, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    and-int/lit8 p2, p1, 0x3

    .line 355
    .line 356
    if-eq p2, v3, :cond_9

    .line 357
    .line 358
    move v2, v4

    .line 359
    :cond_9
    and-int/2addr p1, v4

    .line 360
    invoke-virtual {v6, p1, v2}, Lyt2;->V(IZ)Z

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    if-eqz p1, :cond_a

    .line 365
    .line 366
    move p1, v4

    .line 367
    iget-object v4, p0, Lgx4;->g:Lix4;

    .line 368
    .line 369
    move p2, v3

    .line 370
    iget-object v3, p0, Lgx4;->c:Ljava/lang/String;

    .line 371
    .line 372
    new-instance v0, Lqm1;

    .line 373
    .line 374
    invoke-direct {v0, p0, p1}, Lqm1;-><init>(Lgx4;I)V

    .line 375
    .line 376
    .line 377
    const p1, -0x37514f84

    .line 378
    .line 379
    .line 380
    invoke-static {p1, v0, v6}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    new-instance p1, Lqm1;

    .line 385
    .line 386
    invoke-direct {p1, p0, p2}, Lqm1;-><init>(Lgx4;I)V

    .line 387
    .line 388
    .line 389
    const p0, -0x5c26c881

    .line 390
    .line 391
    .line 392
    invoke-static {p0, p1, v6}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    const/16 v7, 0xc06

    .line 397
    .line 398
    invoke-static/range {v2 .. v7}, Lfx4;->g(Lfw0;Ljava/lang/String;Lix4;Lfw0;Lyt2;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_a
    invoke-virtual {v6}, Lyt2;->Y()V

    .line 403
    .line 404
    .line 405
    :goto_6
    return-object v1

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
