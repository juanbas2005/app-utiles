.class public final synthetic Lef;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lef;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Lef;->x:J

    .line 8
    .line 9
    iput-object p4, p0, Lef;->y:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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

.method public synthetic constructor <init>(JLml4;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lef;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lef;->x:J

    iput-object p3, p0, Lef;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lef;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lef;->y:Ljava/lang/Object;

    .line 7
    .line 8
    iget-wide v4, p0, Lef;->x:J

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, Ljava/lang/String;

    .line 14
    .line 15
    check-cast p1, Lyt2;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lb85;->v(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {v4, v5, v3, p1, p0}, Lt13;->k(JLjava/lang/String;Lyt2;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object v6, v3

    .line 31
    check-cast v6, Lml4;

    .line 32
    .line 33
    check-cast p1, Lyt2;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    and-int/lit8 p2, p0, 0x3

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-eq p2, v0, :cond_0

    .line 46
    .line 47
    move p2, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move p2, v3

    .line 50
    :goto_0
    and-int/2addr p0, v2

    .line 51
    invoke-virtual {p1, p0, p2}, Lyt2;->V(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long p0, v4, v7

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    const p0, -0x4a262578

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lyt2;->e0(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v5}, Lpx1;->b(J)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-static {v4, v5}, Lpx1;->a(J)F

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    const/4 v10, 0x0

    .line 81
    const/16 v11, 0xc

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v6 .. v11}, Lyu6;->j(Lml4;FFFFI)Lml4;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p2, Lxb4;->z:Li80;

    .line 89
    .line 90
    invoke-static {p2, v3}, Lmb0;->d(Ljb;Z)Llh4;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-wide v4, p1, Lyt2;->T:J

    .line 95
    .line 96
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p1}, Lyt2;->m()Lvf5;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {p1, p0}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    sget-object v5, Lux0;->d:Ltx0;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v5, Ltx0;->b:Lvy0;

    .line 114
    .line 115
    invoke-virtual {p1}, Lyt2;->i0()V

    .line 116
    .line 117
    .line 118
    iget-boolean v6, p1, Lyt2;->S:Z

    .line 119
    .line 120
    if-eqz v6, :cond_1

    .line 121
    .line 122
    invoke-virtual {p1, v5}, Lyt2;->l(Lsr2;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {p1}, Lyt2;->r0()V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v5, Ltx0;->f:Lck;

    .line 130
    .line 131
    invoke-static {v5, p1, p2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p2, Ltx0;->e:Lck;

    .line 135
    .line 136
    invoke-static {p2, p1, v4}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    sget-object v0, Ltx0;->g:Lck;

    .line 144
    .line 145
    invoke-static {v0, p1, p2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object p2, Ltx0;->h:Lce;

    .line 149
    .line 150
    invoke-static {p1, p2}, Lg75;->O(Lyt2;Lvr2;)V

    .line 151
    .line 152
    .line 153
    sget-object p2, Ltx0;->d:Lck;

    .line 154
    .line 155
    invoke-static {p2, p1, p0}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const/4 p0, 0x0

    .line 159
    invoke-static {p0, p1, v3, v2}, Lkf;->b(Lml4;Lyt2;II)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v2}, Lyt2;->r(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v3}, Lyt2;->r(Z)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    const p0, -0x4a2083ba

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p0}, Lyt2;->e0(I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v6, p1, v3, v3}, Lkf;->b(Lml4;Lyt2;II)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v3}, Lyt2;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 183
    .line 184
    .line 185
    :goto_2
    return-object v1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
